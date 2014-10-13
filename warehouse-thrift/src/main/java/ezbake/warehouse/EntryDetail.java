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
 * Contains all version details pertaining to a warehouse entry.
 */
public class EntryDetail implements org.apache.thrift.TBase<EntryDetail, EntryDetail._Fields>, java.io.Serializable, Cloneable, Comparable<EntryDetail> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("EntryDetail");

  private static final org.apache.thrift.protocol.TField URI_FIELD_DESC = new org.apache.thrift.protocol.TField("uri", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField VERSIONS_FIELD_DESC = new org.apache.thrift.protocol.TField("versions", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new EntryDetailStandardSchemeFactory());
    schemes.put(TupleScheme.class, new EntryDetailTupleSchemeFactory());
  }

  public String uri; // required
  public List<VersionDetail> versions; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    URI((short)1, "uri"),
    VERSIONS((short)2, "versions");

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
        case 1: // URI
          return URI;
        case 2: // VERSIONS
          return VERSIONS;
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
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.URI, new org.apache.thrift.meta_data.FieldMetaData("uri", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.VERSIONS, new org.apache.thrift.meta_data.FieldMetaData("versions", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, VersionDetail.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(EntryDetail.class, metaDataMap);
  }

  public EntryDetail() {
  }

  public EntryDetail(
    String uri,
    List<VersionDetail> versions)
  {
    this();
    this.uri = uri;
    this.versions = versions;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public EntryDetail(EntryDetail other) {
    if (other.isSetUri()) {
      this.uri = other.uri;
    }
    if (other.isSetVersions()) {
      List<VersionDetail> __this__versions = new ArrayList<VersionDetail>(other.versions.size());
      for (VersionDetail other_element : other.versions) {
        __this__versions.add(new VersionDetail(other_element));
      }
      this.versions = __this__versions;
    }
  }

  public EntryDetail deepCopy() {
    return new EntryDetail(this);
  }

  @Override
  public void clear() {
    this.uri = null;
    this.versions = null;
  }

  public String getUri() {
    return this.uri;
  }

  public EntryDetail setUri(String uri) {
    this.uri = uri;
    return this;
  }

  public void unsetUri() {
    this.uri = null;
  }

  /** Returns true if field uri is set (has been assigned a value) and false otherwise */
  public boolean isSetUri() {
    return this.uri != null;
  }

  public void setUriIsSet(boolean value) {
    if (!value) {
      this.uri = null;
    }
  }

  public int getVersionsSize() {
    return (this.versions == null) ? 0 : this.versions.size();
  }

  public java.util.Iterator<VersionDetail> getVersionsIterator() {
    return (this.versions == null) ? null : this.versions.iterator();
  }

  public void addToVersions(VersionDetail elem) {
    if (this.versions == null) {
      this.versions = new ArrayList<VersionDetail>();
    }
    this.versions.add(elem);
  }

  public List<VersionDetail> getVersions() {
    return this.versions;
  }

  public EntryDetail setVersions(List<VersionDetail> versions) {
    this.versions = versions;
    return this;
  }

  public void unsetVersions() {
    this.versions = null;
  }

  /** Returns true if field versions is set (has been assigned a value) and false otherwise */
  public boolean isSetVersions() {
    return this.versions != null;
  }

  public void setVersionsIsSet(boolean value) {
    if (!value) {
      this.versions = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case URI:
      if (value == null) {
        unsetUri();
      } else {
        setUri((String)value);
      }
      break;

    case VERSIONS:
      if (value == null) {
        unsetVersions();
      } else {
        setVersions((List<VersionDetail>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case URI:
      return getUri();

    case VERSIONS:
      return getVersions();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case URI:
      return isSetUri();
    case VERSIONS:
      return isSetVersions();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof EntryDetail)
      return this.equals((EntryDetail)that);
    return false;
  }

  public boolean equals(EntryDetail that) {
    if (that == null)
      return false;

    boolean this_present_uri = true && this.isSetUri();
    boolean that_present_uri = true && that.isSetUri();
    if (this_present_uri || that_present_uri) {
      if (!(this_present_uri && that_present_uri))
        return false;
      if (!this.uri.equals(that.uri))
        return false;
    }

    boolean this_present_versions = true && this.isSetVersions();
    boolean that_present_versions = true && that.isSetVersions();
    if (this_present_versions || that_present_versions) {
      if (!(this_present_versions && that_present_versions))
        return false;
      if (!this.versions.equals(that.versions))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(EntryDetail other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetUri()).compareTo(other.isSetUri());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUri()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.uri, other.uri);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetVersions()).compareTo(other.isSetVersions());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetVersions()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.versions, other.versions);
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
    StringBuilder sb = new StringBuilder("EntryDetail(");
    boolean first = true;

    sb.append("uri:");
    if (this.uri == null) {
      sb.append("null");
    } else {
      sb.append(this.uri);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("versions:");
    if (this.versions == null) {
      sb.append("null");
    } else {
      sb.append(this.versions);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (uri == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'uri' was not present! Struct: " + toString());
    }
    if (versions == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'versions' was not present! Struct: " + toString());
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class EntryDetailStandardSchemeFactory implements SchemeFactory {
    public EntryDetailStandardScheme getScheme() {
      return new EntryDetailStandardScheme();
    }
  }

  private static class EntryDetailStandardScheme extends StandardScheme<EntryDetail> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, EntryDetail struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // URI
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.uri = iprot.readString();
              struct.setUriIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // VERSIONS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list16 = iprot.readListBegin();
                struct.versions = new ArrayList<VersionDetail>(_list16.size);
                for (int _i17 = 0; _i17 < _list16.size; ++_i17)
                {
                  VersionDetail _elem18;
                  _elem18 = new VersionDetail();
                  _elem18.read(iprot);
                  struct.versions.add(_elem18);
                }
                iprot.readListEnd();
              }
              struct.setVersionsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, EntryDetail struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.uri != null) {
        oprot.writeFieldBegin(URI_FIELD_DESC);
        oprot.writeString(struct.uri);
        oprot.writeFieldEnd();
      }
      if (struct.versions != null) {
        oprot.writeFieldBegin(VERSIONS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.versions.size()));
          for (VersionDetail _iter19 : struct.versions)
          {
            _iter19.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class EntryDetailTupleSchemeFactory implements SchemeFactory {
    public EntryDetailTupleScheme getScheme() {
      return new EntryDetailTupleScheme();
    }
  }

  private static class EntryDetailTupleScheme extends TupleScheme<EntryDetail> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, EntryDetail struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.uri);
      {
        oprot.writeI32(struct.versions.size());
        for (VersionDetail _iter20 : struct.versions)
        {
          _iter20.write(oprot);
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, EntryDetail struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.uri = iprot.readString();
      struct.setUriIsSet(true);
      {
        org.apache.thrift.protocol.TList _list21 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.versions = new ArrayList<VersionDetail>(_list21.size);
        for (int _i22 = 0; _i22 < _list21.size; ++_i22)
        {
          VersionDetail _elem23;
          _elem23 = new VersionDetail();
          _elem23.read(iprot);
          struct.versions.add(_elem23);
        }
      }
      struct.setVersionsIsSet(true);
    }
  }

}
