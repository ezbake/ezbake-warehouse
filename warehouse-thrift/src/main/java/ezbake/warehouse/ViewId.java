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
 * Id for arbitrary data storage.
 */
public class ViewId implements org.apache.thrift.TBase<ViewId, ViewId._Fields>, java.io.Serializable, Cloneable, Comparable<ViewId> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ViewId");

  private static final org.apache.thrift.protocol.TField URI_FIELD_DESC = new org.apache.thrift.protocol.TField("uri", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField SPACENAME_FIELD_DESC = new org.apache.thrift.protocol.TField("spacename", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField VIEW_FIELD_DESC = new org.apache.thrift.protocol.TField("view", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ViewIdStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ViewIdTupleSchemeFactory());
  }

  public String uri; // required
  public String spacename; // required
  public String view; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    URI((short)1, "uri"),
    SPACENAME((short)2, "spacename"),
    VIEW((short)3, "view");

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
        case 2: // SPACENAME
          return SPACENAME;
        case 3: // VIEW
          return VIEW;
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
    tmpMap.put(_Fields.SPACENAME, new org.apache.thrift.meta_data.FieldMetaData("spacename", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.VIEW, new org.apache.thrift.meta_data.FieldMetaData("view", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ViewId.class, metaDataMap);
  }

  public ViewId() {
  }

  public ViewId(
    String uri,
    String spacename,
    String view)
  {
    this();
    this.uri = uri;
    this.spacename = spacename;
    this.view = view;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ViewId(ViewId other) {
    if (other.isSetUri()) {
      this.uri = other.uri;
    }
    if (other.isSetSpacename()) {
      this.spacename = other.spacename;
    }
    if (other.isSetView()) {
      this.view = other.view;
    }
  }

  public ViewId deepCopy() {
    return new ViewId(this);
  }

  @Override
  public void clear() {
    this.uri = null;
    this.spacename = null;
    this.view = null;
  }

  public String getUri() {
    return this.uri;
  }

  public ViewId setUri(String uri) {
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

  public String getSpacename() {
    return this.spacename;
  }

  public ViewId setSpacename(String spacename) {
    this.spacename = spacename;
    return this;
  }

  public void unsetSpacename() {
    this.spacename = null;
  }

  /** Returns true if field spacename is set (has been assigned a value) and false otherwise */
  public boolean isSetSpacename() {
    return this.spacename != null;
  }

  public void setSpacenameIsSet(boolean value) {
    if (!value) {
      this.spacename = null;
    }
  }

  public String getView() {
    return this.view;
  }

  public ViewId setView(String view) {
    this.view = view;
    return this;
  }

  public void unsetView() {
    this.view = null;
  }

  /** Returns true if field view is set (has been assigned a value) and false otherwise */
  public boolean isSetView() {
    return this.view != null;
  }

  public void setViewIsSet(boolean value) {
    if (!value) {
      this.view = null;
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

    case SPACENAME:
      if (value == null) {
        unsetSpacename();
      } else {
        setSpacename((String)value);
      }
      break;

    case VIEW:
      if (value == null) {
        unsetView();
      } else {
        setView((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case URI:
      return getUri();

    case SPACENAME:
      return getSpacename();

    case VIEW:
      return getView();

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
    case SPACENAME:
      return isSetSpacename();
    case VIEW:
      return isSetView();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ViewId)
      return this.equals((ViewId)that);
    return false;
  }

  public boolean equals(ViewId that) {
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

    boolean this_present_spacename = true && this.isSetSpacename();
    boolean that_present_spacename = true && that.isSetSpacename();
    if (this_present_spacename || that_present_spacename) {
      if (!(this_present_spacename && that_present_spacename))
        return false;
      if (!this.spacename.equals(that.spacename))
        return false;
    }

    boolean this_present_view = true && this.isSetView();
    boolean that_present_view = true && that.isSetView();
    if (this_present_view || that_present_view) {
      if (!(this_present_view && that_present_view))
        return false;
      if (!this.view.equals(that.view))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(ViewId other) {
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
    lastComparison = Boolean.valueOf(isSetSpacename()).compareTo(other.isSetSpacename());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSpacename()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.spacename, other.spacename);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetView()).compareTo(other.isSetView());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetView()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.view, other.view);
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
    StringBuilder sb = new StringBuilder("ViewId(");
    boolean first = true;

    sb.append("uri:");
    if (this.uri == null) {
      sb.append("null");
    } else {
      sb.append(this.uri);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("spacename:");
    if (this.spacename == null) {
      sb.append("null");
    } else {
      sb.append(this.spacename);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("view:");
    if (this.view == null) {
      sb.append("null");
    } else {
      sb.append(this.view);
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
    if (spacename == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'spacename' was not present! Struct: " + toString());
    }
    if (view == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'view' was not present! Struct: " + toString());
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

  private static class ViewIdStandardSchemeFactory implements SchemeFactory {
    public ViewIdStandardScheme getScheme() {
      return new ViewIdStandardScheme();
    }
  }

  private static class ViewIdStandardScheme extends StandardScheme<ViewId> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ViewId struct) throws org.apache.thrift.TException {
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
          case 2: // SPACENAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.spacename = iprot.readString();
              struct.setSpacenameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // VIEW
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.view = iprot.readString();
              struct.setViewIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ViewId struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.uri != null) {
        oprot.writeFieldBegin(URI_FIELD_DESC);
        oprot.writeString(struct.uri);
        oprot.writeFieldEnd();
      }
      if (struct.spacename != null) {
        oprot.writeFieldBegin(SPACENAME_FIELD_DESC);
        oprot.writeString(struct.spacename);
        oprot.writeFieldEnd();
      }
      if (struct.view != null) {
        oprot.writeFieldBegin(VIEW_FIELD_DESC);
        oprot.writeString(struct.view);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ViewIdTupleSchemeFactory implements SchemeFactory {
    public ViewIdTupleScheme getScheme() {
      return new ViewIdTupleScheme();
    }
  }

  private static class ViewIdTupleScheme extends TupleScheme<ViewId> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ViewId struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.uri);
      oprot.writeString(struct.spacename);
      oprot.writeString(struct.view);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ViewId struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.uri = iprot.readString();
      struct.setUriIsSet(true);
      struct.spacename = iprot.readString();
      struct.setSpacenameIsSet(true);
      struct.view = iprot.readString();
      struct.setViewIsSet(true);
    }
  }

}

