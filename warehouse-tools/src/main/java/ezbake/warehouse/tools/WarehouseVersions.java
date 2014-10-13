/*   Copyright (C) 2013-2014 Computer Sciences Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License. */

package ezbake.warehouse.tools;

import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.apache.thrift.TException;
import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;
import org.kohsuke.args4j.Option;

import ezbake.thrift.ThriftClientPool;
import ezbake.base.thrift.EzSecurityToken;
import ezbake.configuration.DirectoryConfigurationLoader;
import ezbake.configuration.EzConfigurationLoaderException;
import ezbake.warehouse.WarehouseService;

public class WarehouseVersions {

    @Option(name="-u", aliases="--uri", required=true, usage="The uri")
    private String uri;

    public static void main(String[] args) throws IOException, TException, EzConfigurationLoaderException {

        WarehouseVersions versions = new WarehouseVersions();
        CmdLineParser parser = new CmdLineParser(versions);

        try {
            parser.parseArgument(args);
            versions.process();
            System.out.println("WarehouseVersions started");
        } catch (CmdLineException e) {
            System.err.println(e.getMessage());
            parser.printUsage(System.err);
        }
    }

    public void process() throws TException, IOException, EzConfigurationLoaderException {
        Properties config;
        try {
            config = new DirectoryConfigurationLoader().loadConfiguration();
        } catch (EzConfigurationLoaderException e) {
            throw new RuntimeException(e);
        }
        ThriftClientPool pool = new ThriftClientPool(config);
        WarehouseService.Client client = ToolHelper.createClient(pool);
        EzSecurityToken token = ToolHelper.importToken();
        List<Long> list = client.getVersions(uri, token);
        for (Long l : list) {
            System.out.println(l);
        }
        pool.returnToPool(client);
        pool.close();
    }
}