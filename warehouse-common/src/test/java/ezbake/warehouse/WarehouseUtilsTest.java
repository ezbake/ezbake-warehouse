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

package ezbake.warehouse;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by eperry on 6/23/14.
 */
public class WarehouseUtilsTest {

    @Test
    public void testGetUriPrefix() {
        String uri = "DEV://test/this;isaURI:23423424";
        String prefix = WarehouseUtils.getUriPrefixFromUri(uri);
        assertEquals("Prefix should be correct", "DEV://test", prefix);
    }
}
