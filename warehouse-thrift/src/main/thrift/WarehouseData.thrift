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

namespace java ezbake.warehouse

include "ezbakeBaseTypes.thrift"
include "ezbakeBaseVisibility.thrift"

/**
 Type of data to return from a get call.
 */
enum GetDataType {
    RAW = 0,
    PARSED = 1,
    VIEW = 2
}

/**
 Insert object.
 */
struct Repository {
    1: required string uri;
    2: required binary rawData;
    3: required binary parsedData;
    /** 
     Update visibility of old versions of this uri if its different from the new one.
     Old visibility is changed even when making exclusive parsed or raw updates.
     */  
    4: optional bool updateVisibility = 0;
}

/**
 Update object, the only difference being that the fields are optional.
 */
struct UpdateEntry {
    1: required string uri;
    2: optional binary rawData;
    3: optional binary parsedData;
    /**
     Update visibility of old versions of this uri if its different from the new one.
     Old visibility is changed even when making exclusive parsed or raw updates.
     */  
    4: optional bool updateVisibility = 0;
}

/**
 URI with version/time info.
 */  
struct DatedURI {
    1: required ezbakeBaseTypes.DateTime timestamp;
    2: required string uri;
    3: required ezbakeBaseVisibility.Visibility visibility;
}

/**
 Id for arbitrary data storage.
 */  
struct ViewId {
    1: required string uri;
    2: required string spacename;
    3: required string view;
}

/**
 Data return.
 */  
struct BinaryReplay {
    1: required ezbakeBaseTypes.DateTime timestamp;
    2: required string uri;
    3: required binary packet;
    4: optional ezbakeBaseVisibility.Visibility visibility;
}

/**
 Stores versioning information (such as writer and reason).
 */  
struct VersionControl {
    1: required binary packet;
    2: required string name; // this really is a misnomer, what's in here is the security ID
}

/**
 Contains all the data to be stored for import/export for convenient serialization.
 */  
struct ExportFile {
    1: required Repository data;
    2: required ezbakeBaseVisibility.Visibility visibility;
    3: required string name;
    4: required i64 timestamp;
}

/**
 Contains parameters based on which to get request.
 */ 
struct RequestParameter {
    1: required string uri;
    2: optional ezbakeBaseTypes.DateTime timestamp;
    3: optional string spacename; // required if requesting a View
    4: optional string view; // required if requesting a View
}

/** 
 Contains fields to request batch data by.
 */  
struct GetRequest {
    1: required list<RequestParameter> requestParams;
    2: optional GetDataType getDataType = GetDataType.RAW;
    3: optional bool latestVersion = 1; // true will get latest version of each uri, false will get a version based on uri timestamp
}


/**
 Encapsulates update entries to make bulk update.
 */
struct PutUpdateEntry {
    1: required UpdateEntry entry;
    2: required ezbakeBaseVisibility.Visibility visibility;
}

/**
 Contains fields needed to make a bulk insert.
 */  
struct PutRequest {
    1: required list<PutUpdateEntry> entries;
}

/**
 Contains details pertaining to a particular version of an entry.
 */
struct VersionDetail {
    1: required string uri;
    2: required i64 timestamp;
    3: required ezbakeBaseVisibility.Visibility visibility;
    4: required string securityId;
}

/**
 Contains all version details pertaining to a warehouse entry.
 */
struct EntryDetail {
    1: required string uri;
    2: required list<VersionDetail> versions;
}

/**
 Enum to capture status of an ingest.
 */
enum IngestStatusEnum {
    SUCCESS = 0, // all requested documents were successfully ingested
    PARTIAL = 1, // a partial set of documents were ingested
    FAIL = 2 // all documents failed to ingest
}

/**
 Encapsulates status of an ingest. Has the status, list of failed URIs (in case
 there are any failures) and the time of ingest.
 */
struct IngestStatus {
    1: required i64 timestamp;
    2: required IngestStatusEnum status;
    3: optional list<string> failedURIs;
    4: optional string failureReason;
}

/**
 Thrown if the given data type and URI do no exist in the warehouse.
 */  
exception EntryNotInWarehouseException
{
    1: required string message
}

/**
 Thrown if data requested from get is greater than allowed max size.
 */  
exception MaxGetRequestSizeExceededException
{
    1: required string message
}
