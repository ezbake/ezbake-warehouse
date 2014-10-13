warehouse-tools
======

Command line interface for warehouse

##### Usage #####
- CreateWHPFile
- WarehouseExport
- WarehouseGet
- WarehouseImport
- WarehouseInsert
- WarehouseReplay
- WarehouseVersions
- WarehouseViewGet
- WarehouseViewInsert

###### CreateWHPFile ######
```java -cp warehouse-tools.jar ezbake.warehouse.tools.CreateWHPFile -f [whp filename] -u [uri] -r [raw data file] -p [parsed data file]```
 
Required Arguments:
-f 
-u
-r
-p
 
###### WarehouseExport ######
```java -cp warehouse-tools.jar ezbake.warehouse.tools.WarehouseExport -f [export tar] -n [feed name] -s [unix starttime] -e [unix endtime]```

Required Arguments:
-f 
-n
 
###### WarehouseGet ######
```java -cp warehouse-tools.jar ezbake.warehouse.tools.WarehouseGet -f [export file] -u [uri] -t ["raw" | "parsed"] -v [version number]```
 
Required Arguments:
-f 
-u
-t

###### WarehouseImport ######
```java -cp warehouse-tools.jar ezbake.warehouse.tools.WarehouseImport -f [export tar]```
 
Required Fields:
-f 

###### WarehouseInsert ######
```java -cp warehouse-tools.jar ezbake.warehouse.tools.WarehouseInsert -f [whp file] - c [formal visibility]```
 
Required Arguments:
-f 
-c

###### WarehouseReplay ######
```java -cp warehouse-tools.jar ezbake.warehouse.tools.WarehouseReplay -u [urn] -s [unix starttime] -e [unix endtime]```

Required Arguments:
-u
 
###### WarehouseVersions ######
```java -cp warehouse-tools.jar ezbake.warehouse.tools.WarehouseVersions -u [uri]```

Required Arguments:
-u

###### WarehouseViewGet ######
 ```java -cp warehouse-tools.jar ezbake.warehouse.tools.WarehouseViewGet -f [export file] -u [uri] -s [namespace] -n [view name] -v [version]```

Required Arguments:
-f
-u
-s
-n

###### WarehouseViewInsert ######
 ```java -cp warehouse-tools.jar ezbake.warehouse.tools.WarehouseViewInsert -f [view file] -u [uri] -s [namespace] -n [view name] -c [formal visibility]```

Required Arguments:
-f
-u
-c
  
