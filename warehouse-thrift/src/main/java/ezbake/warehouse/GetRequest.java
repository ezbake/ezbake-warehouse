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

/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package ezbake.warehouse;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Contains fields to request batch data by.
 */
public class GetRequest implements org.apache.thrift.TBase<GetRequest, GetRequest._Fields>, java.io.Serializable, Cloneable, Comparable<GetRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("GetRequest");

  private static final org.apache.thrift.protocol.TField REQUEST_PARAMS_FIELD_DESC = new org.apache.thrift.protocol.TField("requestParams", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField GET_DATA_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("getDataType", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField LATEST_VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("latestVersion", org.apache.thrift.protocol.TType.BOOL, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new GetRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new GetRequestTupleSchemeFactory());
  }

  public List<RequestParameter> requestParams; // required
  /**
   * 
   * @see GetDataType
   */
  public GetDataType getDataType; // optional
  public boolean latestVersion; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    REQUEST_PARAMS((short)1, "requestParams"),
    /**
     * 
     * @see GetDataType
     */
    GET_DATA_TYPE((short)2, "getDataType"),
    LATEST_VERSION((short)3, "latestVersion");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // REQUEST_PARAMS
          return REQUEST_PARAMS;
        case 2: // GET_DATA_TYPE
          return GET_DATA_TYPE;
        case 3: // LATEST_VERSION
          return LATEST_VERSION;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __LATESTVERSION_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.GET_DATA_TYPE,_Fields.LATEST_VERSION};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.REQUEST_PARAMS, new org.apache.thrift.meta_data.FieldMetaData("requestParams", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, RequestParameter.class))));
    tmpMap.put(_Fields.GET_DATA_TYPE, new org.apache.thrift.meta_data.FieldMetaData("getDataType", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, GetDataType.class)));
    tmpMap.put(_Fields.LATEST_VERSION, new org.apache.thrift.meta_data.FieldMetaData("latestVersion", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(GetRequest.class, metaDataMap);
  }

  public GetRequest() {
    this.getDataType = ezbake.warehouse.GetDataType.RAW;

    this.latestVersion = true;

  }

  public GetRequest(
    List<RequestParameter> requestParams)
  {
    this();
    this.requestParams = requestParams;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GetRequest(GetRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetRequestParams()) {
      List<RequestParameter> __this__requestParams = new ArrayList<RequestParameter>(other.requestParams.size());
      for (RequestParameter other_element : other.requestParams) {
        __this__requestParams.add(new RequestParameter(other_element));
      }
      this.requestParams = __this__requestParams;
    }
    if (other.isSetGetDataType()) {
      this.getDataType = other.getDataType;
    }
    this.latestVersion = other.latestVersion;
  }

  public GetRequest deepCopy() {
    return new GetRequest(this);
  }

  @Override
  public void clear() {
    this.requestParams = null;
    this.getDataType = ezbake.warehouse.GetDataType.RAW;

    this.latestVersion = true;

  }

  public int getRequestParamsSize() {
    return (this.requestParams == null) ? 0 : this.requestParams.size();
  }

  public java.util.Iterator<RequestParameter> getRequestParamsIterator() {
    return (this.requestParams == null) ? null : this.requestParams.iterator();
  }

  public void addToRequestParams(RequestParameter elem) {
    if (this.requestParams == null) {
      this.requestParams = new ArrayList<RequestParameter>();
    }
    this.requestParams.add(elem);
  }

  public List<RequestParameter> getRequestParams() {
    return this.requestParams;
  }

  public GetRequest setRequestParams(List<RequestParameter> requestParams) {
    this.requestParams = requestParams;
    return this;
  }

  public void unsetRequestParams() {
    this.requestParams = null;
  }

  /** Returns true if field requestParams is set (has been assigned a value) and false otherwise */
  public boolean isSetRequestParams() {
    return this.requestParams != null;
  }

  public void setRequestParamsIsSet(boolean value) {
    if (!value) {
      this.requestParams = null;
    }
  }

  /**
   * 
   * @see GetDataType
   */
  public GetDataType getGetDataType() {
    return this.getDataType;
  }

  /**
   * 
   * @see GetDataType
   */
  public GetRequest setGetDataType(GetDataType getDataType) {
    this.getDataType = getDataType;
    return this;
  }

  public void unsetGetDataType() {
    this.getDataType = null;
  }

  /** Returns true if field getDataType is set (has been assigned a value) and false otherwise */
  public boolean isSetGetDataType() {
    return this.getDataType != null;
  }

  public void setGetDataTypeIsSet(boolean value) {
    if (!value) {
      this.getDataType = null;
    }
  }

  public boolean isLatestVersion() {
    return this.latestVersion;
  }

  public GetRequest setLatestVersion(boolean latestVersion) {
    this.latestVersion = latestVersion;
    setLatestVersionIsSet(true);
    return this;
  }

  public void unsetLatestVersion() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __LATESTVERSION_ISSET_ID);
  }

  /** Returns true if field latestVersion is set (has been assigned a value) and false otherwise */
  public boolean isSetLatestVersion() {
    return EncodingUtils.testBit(__isset_bitfield, __LATESTVERSION_ISSET_ID);
  }

  public void setLatestVersionIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __LATESTVERSION_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case REQUEST_PARAMS:
      if (value == null) {
        unsetRequestParams();
      } else {
        setRequestParams((List<RequestParameter>)value);
      }
      break;

    case GET_DATA_TYPE:
      if (value == null) {
        unsetGetDataType();
      } else {
        setGetDataType((GetDataType)value);
      }
      break;

    case LATEST_VERSION:
      if (value == null) {
        unsetLatestVersion();
      } else {
        setLatestVersion((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case REQUEST_PARAMS:
      return getRequestParams();

    case GET_DATA_TYPE:
      return getGetDataType();

    case LATEST_VERSION:
      return Boolean.valueOf(isLatestVersion());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case REQUEST_PARAMS:
      return isSetRequestParams();
    case GET_DATA_TYPE:
      return isSetGetDataType();
    case LATEST_VERSION:
      return isSetLatestVersion();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof GetRequest)
      return this.equals((GetRequest)that);
    return false;
  }

  public boolean equals(GetRequest that) {
    if (that == null)
      return false;

    boolean this_present_requestParams = true && this.isSetRequestParams();
    boolean that_present_requestParams = true && that.isSetRequestParams();
    if (this_present_requestParams || that_present_requestParams) {
      if (!(this_present_requestParams && that_present_requestParams))
        return false;
      if (!this.requestParams.equals(that.requestParams))
        return false;
    }

    boolean this_present_getDataType = true && this.isSetGetDataType();
    boolean that_present_getDataType = true && that.isSetGetDataType();
    if (this_present_getDataType || that_present_getDataType) {
      if (!(this_present_getDataType && that_present_getDataType))
        return false;
      if (!this.getDataType.equals(that.getDataType))
        return false;
    }

    boolean this_present_latestVersion = true && this.isSetLatestVersion();
    boolean that_present_latestVersion = true && that.isSetLatestVersion();
    if (this_present_latestVersion || that_present_latestVersion) {
      if (!(this_present_latestVersion && that_present_latestVersion))
        return false;
      if (this.latestVersion != that.latestVersion)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(GetRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetRequestParams()).compareTo(other.isSetRequestParams());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRequestParams()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.requestParams, other.requestParams);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetGetDataType()).compareTo(other.isSetGetDataType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGetDataType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.getDataType, other.getDataType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLatestVersion()).compareTo(other.isSetLatestVersion());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLatestVersion()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.latestVersion, other.latestVersion);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("GetRequest(");
    boolean first = true;

    sb.append("requestParams:");
    if (this.requestParams == null) {
      sb.append("null");
    } else {
      sb.append(this.requestParams);
    }
    first = false;
    if (isSetGetDataType()) {
      if (!first) sb.append(", ");
      sb.append("getDataType:");
      if (this.getDataType == null) {
        sb.append("null");
      } else {
        sb.append(this.getDataType);
      }
      first = false;
    }
    if (isSetLatestVersion()) {
      if (!first) sb.append(", ");
      sb.append("latestVersion:");
      sb.append(this.latestVersion);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (requestParams == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'requestParams' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class GetRequestStandardSchemeFactory implements SchemeFactory {
    public GetRequestStandardScheme getScheme() {
      return new GetRequestStandardScheme();
    }
  }

  private static class GetRequestStandardScheme extends StandardScheme<GetRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, GetRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // REQUEST_PARAMS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.requestParams = new ArrayList<RequestParameter>(_list0.size);
                for (int _i1 = 0; _i1 < _list0.size; ++_i1)
                {
                  RequestParameter _elem2;
                  _elem2 = new RequestParameter();
                  _elem2.read(iprot);
                  struct.requestParams.add(_elem2);
                }
                iprot.readListEnd();
              }
              struct.setRequestParamsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // GET_DATA_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.getDataType = GetDataType.findByValue(iprot.readI32());
              struct.setGetDataTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // LATEST_VERSION
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.latestVersion = iprot.readBool();
              struct.setLatestVersionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, GetRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.requestParams != null) {
        oprot.writeFieldBegin(REQUEST_PARAMS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.requestParams.size()));
          for (RequestParameter _iter3 : struct.requestParams)
          {
            _iter3.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.getDataType != null) {
        if (struct.isSetGetDataType()) {
          oprot.writeFieldBegin(GET_DATA_TYPE_FIELD_DESC);
          oprot.writeI32(struct.getDataType.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetLatestVersion()) {
        oprot.writeFieldBegin(LATEST_VERSION_FIELD_DESC);
        oprot.writeBool(struct.latestVersion);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GetRequestTupleSchemeFactory implements SchemeFactory {
    public GetRequestTupleScheme getScheme() {
      return new GetRequestTupleScheme();
    }
  }

  private static class GetRequestTupleScheme extends TupleScheme<GetRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, GetRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      {
        oprot.writeI32(struct.requestParams.size());
        for (RequestParameter _iter4 : struct.requestParams)
        {
          _iter4.write(oprot);
        }
      }
      BitSet optionals = new BitSet();
      if (struct.isSetGetDataType()) {
        optionals.set(0);
      }
      if (struct.isSetLatestVersion()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetGetDataType()) {
        oprot.writeI32(struct.getDataType.getValue());
      }
      if (struct.isSetLatestVersion()) {
        oprot.writeBool(struct.latestVersion);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, GetRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TList _list5 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.requestParams = new ArrayList<RequestParameter>(_list5.size);
        for (int _i6 = 0; _i6 < _list5.size; ++_i6)
        {
          RequestParameter _elem7;
          _elem7 = new RequestParameter();
          _elem7.read(iprot);
          struct.requestParams.add(_elem7);
        }
      }
      struct.setRequestParamsIsSet(true);
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.getDataType = GetDataType.findByValue(iprot.readI32());
        struct.setGetDataTypeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.latestVersion = iprot.readBool();
        struct.setLatestVersionIsSet(true);
      }
    }
  }

}

