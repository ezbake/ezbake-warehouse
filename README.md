### Pre-requisites

The warehouse now uses ezbake-permission-iterator to filter results by visibility during scans.
So you need to ensure the iterator is available in the accumulo runtime. You can copy the `ezbake-permission-iterator-{version}.jar` 
to accumulo's lib/ext area.

### Running the warehouse
Ensure Hadoop and Accumulo are running in your env.

`sudo /vagrant/scripts/startService.sh warehouse` to start the warehouse.

### Logging
The application log files for the warehouse service are available on EzCentos at 
`/tmp/ezcentos-apps/common_services/common_services_warehouse.log`. This log includes the audit trail information.

