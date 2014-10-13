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

include "WarehouseData.thrift"
include "ezbakeBasePurgeService.thrift"
include "ezbakeBaseTypes.thrift"
include "ezbakeBaseVisibility.thrift"

const string SERVICE_NAME = "warehouse"

service WarehouseService extends ezbakeBasePurgeService.EzBakeBasePurgeService {
  /**
   Insert a record.
   */
  WarehouseData.IngestStatus insert(1: WarehouseData.Repository data, 2: ezbakeBaseVisibility.Visibility visibility, 3: ezbakeBaseTypes.EzSecurityToken security);
  
  /**
   Get latest version of the relevant data segment.
   */
  WarehouseData.BinaryReplay getLatestRaw(1: string uri, 2: ezbakeBaseTypes.EzSecurityToken security) throws (1: WarehouseData.EntryNotInWarehouseException e);
  WarehouseData.BinaryReplay getLatestParsed(1: string uri, 2: ezbakeBaseTypes.EzSecurityToken security) throws (1: WarehouseData.EntryNotInWarehouseException e);
  
  /**
   Get a specific version (using timestamp versioning) of the relevant data segment.
   */
  WarehouseData.BinaryReplay getRaw(1: string uri, 2: i64 version, 3: ezbakeBaseTypes.EzSecurityToken security) throws (1: WarehouseData.EntryNotInWarehouseException e);
  WarehouseData.BinaryReplay getParsed(1: string uri, 2: i64 version, 3: ezbakeBaseTypes.EzSecurityToken security) throws (1: WarehouseData.EntryNotInWarehouseException e);
  
  /**
   Get a list of binary replays, given a GetRequest with list of uris of interest.
   */
  list<WarehouseData.BinaryReplay> get(1: WarehouseData.GetRequest getRequest, 2: ezbakeBaseTypes.EzSecurityToken security) throws (1: WarehouseData.MaxGetRequestSizeExceededException e);
  
  /**
   Returns a list of URIs that have been ingested with the given URI prefix for the provided time period. URIs will only be returned for parsed objects
   that have been ingested in that time period. The URI prefix is a required parameter, while the start and finish parameters are optional. If start or finish are omitted,
   the time range will be from the beginning of time or to the end of time respectively. The type parameter is also optional, and defaults to PARSED. Currently we do not
   support replaying a VIEW type, so that will throw an exception if selected. Returns in ascending temporal order. The uriPrefix is expected to conform to the
   EzBake URI schema e.g. "CATEGORY://feed_name".
   */
  list<WarehouseData.DatedURI> replay(1: string uriPrefix, 2: bool replayOnlyLatest, 3: ezbakeBaseTypes.DateTime start, 4: ezbakeBaseTypes.DateTime finish, 5: WarehouseData.GetDataType type, 6: ezbakeBaseTypes.EzSecurityToken security);
  
  /**
   As replay but returns a count. ATM this actually gets the results and 
   counts them as a placeholder so using it is a bad idea.
   */
  i32 replayCount(1: string uriPrefix, 2: ezbakeBaseTypes.DateTime start, 3: ezbakeBaseTypes.DateTime finish, 4: WarehouseData.GetDataType type, 5: ezbakeBaseTypes.EzSecurityToken security);
  
  /**
   Returns a list of timestamps for the various versions to make sure the user 
   knows what are valid version numbers.
   */
  list<i64> getVersions(1: string uri, 2: ezbakeBaseTypes.EzSecurityToken security);
  
  /**
   As insert and get but for arbitrary data.
   */ 
  WarehouseData.IngestStatus insertView(1: binary data, 2: WarehouseData.ViewId id, 3: ezbakeBaseVisibility.Visibility visibility, 4: ezbakeBaseTypes.EzSecurityToken security);
  WarehouseData.BinaryReplay getLatestView(1: WarehouseData.ViewId id, 2: ezbakeBaseTypes.EzSecurityToken security) throws (1: WarehouseData.EntryNotInWarehouseException e);
  WarehouseData.BinaryReplay getView(1: WarehouseData.ViewId id, 2: i64 timestamp, 3: ezbakeBaseTypes.EzSecurityToken security) throws (1: WarehouseData.EntryNotInWarehouseException e);
  
  /**
   Convenience function to import data from hadoop instead of across the wire.
   */
  void importFromHadoop(1: string filename, 2: ezbakeBaseVisibility.Visibility visibility, 3: ezbakeBaseTypes.EzSecurityToken security);
  
  /**
   Update data for a specific data type. This updates the document with 
   updated raw/parsed data by adding a new version of the entry.
   */
  WarehouseData.IngestStatus updateEntry(1: WarehouseData.UpdateEntry update, 2: ezbakeBaseVisibility.Visibility visibility, 3: ezbakeBaseTypes.EzSecurityToken security);

  /**
   Bulk update, given a PutRequest with list of entries.
   */
  WarehouseData.IngestStatus put(1: WarehouseData.PutRequest putRequest, 2: ezbakeBaseTypes.EzSecurityToken security);

  /**
   Fetches all version details pertaining to an entry.
   */
  WarehouseData.EntryDetail getEntryDetails(1: string uri, 2: ezbakeBaseTypes.EzSecurityToken security);
}
