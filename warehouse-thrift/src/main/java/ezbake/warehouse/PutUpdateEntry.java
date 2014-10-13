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
 * Encapsulates update entries to make bulk update.
 */
public class PutUpdateEntry implements org.apache.thrift.TBase<PutUpdateEntry, PutUpdateEntry._Fields>, java.io.Serializable, Cloneable, Comparable<PutUpdateEntry> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("PutUpdateEntry");

  private static final org.apache.thrift.protocol.TField ENTRY_FIELD_DESC = new org.apache.thrift.protocol.TField("entry", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField VISIBILITY_FIELD_DESC = new org.apache.thrift.protocol.TField("visibility", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new PutUpdateEntryStandardSchemeFactory());
    schemes.put(TupleScheme.class, new PutUpdateEntryTupleSchemeFactory());
  }

  public UpdateEntry entry; // required
  public ezbake.base.thrift.Visibility visibility; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ENTRY((short)1, "entry"),
    VISIBILITY((short)2, "visibility");

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
        case 1: // ENTRY
          return ENTRY;
        case 2: // VISIBILITY
          return VISIBILITY;
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
    tmpMap.put(_Fields.ENTRY, new org.apache.thrift.meta_data.FieldMetaData("entry", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, UpdateEntry.class)));
    tmpMap.put(_Fields.VISIBILITY, new org.apache.thrift.meta_data.FieldMetaData("visibility", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ezbake.base.thrift.Visibility.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(PutUpdateEntry.class, metaDataMap);
  }

  public PutUpdateEntry() {
  }

  public PutUpdateEntry(
    UpdateEntry entry,
    ezbake.base.thrift.Visibility visibility)
  {
    this();
    this.entry = entry;
    this.visibility = visibility;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PutUpdateEntry(PutUpdateEntry other) {
    if (other.isSetEntry()) {
      this.entry = new UpdateEntry(other.entry);
    }
    if (other.isSetVisibility()) {
      this.visibility = new ezbake.base.thrift.Visibility(other.visibility);
    }
  }

  public PutUpdateEntry deepCopy() {
    return new PutUpdateEntry(this);
  }

  @Override
  public void clear() {
    this.entry = null;
    this.visibility = null;
  }

  public UpdateEntry getEntry() {
    return this.entry;
  }

  public PutUpdateEntry setEntry(UpdateEntry entry) {
    this.entry = entry;
    return this;
  }

  public void unsetEntry() {
    this.entry = null;
  }

  /** Returns true if field entry is set (has been assigned a value) and false otherwise */
  public boolean isSetEntry() {
    return this.entry != null;
  }

  public void setEntryIsSet(boolean value) {
    if (!value) {
      this.entry = null;
    }
  }

  public ezbake.base.thrift.Visibility getVisibility() {
    return this.visibility;
  }

  public PutUpdateEntry setVisibility(ezbake.base.thrift.Visibility visibility) {
    this.visibility = visibility;
    return this;
  }

  public void unsetVisibility() {
    this.visibility = null;
  }

  /** Returns true if field visibility is set (has been assigned a value) and false otherwise */
  public boolean isSetVisibility() {
    return this.visibility != null;
  }

  public void setVisibilityIsSet(boolean value) {
    if (!value) {
      this.visibility = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ENTRY:
      if (value == null) {
        unsetEntry();
      } else {
        setEntry((UpdateEntry)value);
      }
      break;

    case VISIBILITY:
      if (value == null) {
        unsetVisibility();
      } else {
        setVisibility((ezbake.base.thrift.Visibility)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ENTRY:
      return getEntry();

    case VISIBILITY:
      return getVisibility();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ENTRY:
      return isSetEntry();
    case VISIBILITY:
      return isSetVisibility();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof PutUpdateEntry)
      return this.equals((PutUpdateEntry)that);
    return false;
  }

  public boolean equals(PutUpdateEntry that) {
    if (that == null)
      return false;

    boolean this_present_entry = true && this.isSetEntry();
    boolean that_present_entry = true && that.isSetEntry();
    if (this_present_entry || that_present_entry) {
      if (!(this_present_entry && that_present_entry))
        return false;
      if (!this.entry.equals(that.entry))
        return false;
    }

    boolean this_present_visibility = true && this.isSetVisibility();
    boolean that_present_visibility = true && that.isSetVisibility();
    if (this_present_visibility || that_present_visibility) {
      if (!(this_present_visibility && that_present_visibility))
        return false;
      if (!this.visibility.equals(that.visibility))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(PutUpdateEntry other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetEntry()).compareTo(other.isSetEntry());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEntry()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.entry, other.entry);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetVisibility()).compareTo(other.isSetVisibility());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetVisibility()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.visibility, other.visibility);
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
    StringBuilder sb = new StringBuilder("PutUpdateEntry(");
    boolean first = true;

    sb.append("entry:");
    if (this.entry == null) {
      sb.append("null");
    } else {
      sb.append(this.entry);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("visibility:");
    if (this.visibility == null) {
      sb.append("null");
    } else {
      sb.append(this.visibility);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (entry == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'entry' was not present! Struct: " + toString());
    }
    if (visibility == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'visibility' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (entry != null) {
      entry.validate();
    }
    if (visibility != null) {
      visibility.validate();
    }
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

  private static class PutUpdateEntryStandardSchemeFactory implements SchemeFactory {
    public PutUpdateEntryStandardScheme getScheme() {
      return new PutUpdateEntryStandardScheme();
    }
  }

  private static class PutUpdateEntryStandardScheme extends StandardScheme<PutUpdateEntry> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, PutUpdateEntry struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ENTRY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.entry = new UpdateEntry();
              struct.entry.read(iprot);
              struct.setEntryIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // VISIBILITY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.visibility = new ezbake.base.thrift.Visibility();
              struct.visibility.read(iprot);
              struct.setVisibilityIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, PutUpdateEntry struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.entry != null) {
        oprot.writeFieldBegin(ENTRY_FIELD_DESC);
        struct.entry.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.visibility != null) {
        oprot.writeFieldBegin(VISIBILITY_FIELD_DESC);
        struct.visibility.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PutUpdateEntryTupleSchemeFactory implements SchemeFactory {
    public PutUpdateEntryTupleScheme getScheme() {
      return new PutUpdateEntryTupleScheme();
    }
  }

  private static class PutUpdateEntryTupleScheme extends TupleScheme<PutUpdateEntry> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, PutUpdateEntry struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      struct.entry.write(oprot);
      struct.visibility.write(oprot);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, PutUpdateEntry struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.entry = new UpdateEntry();
      struct.entry.read(iprot);
      struct.setEntryIsSet(true);
      struct.visibility = new ezbake.base.thrift.Visibility();
      struct.visibility.read(iprot);
      struct.setVisibilityIsSet(true);
    }
  }

}
