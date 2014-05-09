/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.github.herong.thrift.comm;

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

public class DTO implements org.apache.thrift.TBase<DTO, DTO._Fields>, java.io.Serializable, Cloneable, Comparable<DTO> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("DTO");

  private static final org.apache.thrift.protocol.TField DATAS_FIELD_DESC = new org.apache.thrift.protocol.TField("datas", org.apache.thrift.protocol.TType.MAP, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new DTOStandardSchemeFactory());
    schemes.put(TupleScheme.class, new DTOTupleSchemeFactory());
  }

  public Map<String,String> datas; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    DATAS((short)1, "datas");

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
        case 1: // DATAS
          return DATAS;
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
    tmpMap.put(_Fields.DATAS, new org.apache.thrift.meta_data.FieldMetaData("datas", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(DTO.class, metaDataMap);
  }

  public DTO() {
  }

  public DTO(
    Map<String,String> datas)
  {
    this();
    this.datas = datas;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public DTO(DTO other) {
    if (other.isSetDatas()) {
      Map<String,String> __this__datas = new HashMap<String,String>(other.datas);
      this.datas = __this__datas;
    }
  }

  public DTO deepCopy() {
    return new DTO(this);
  }

  @Override
  public void clear() {
    this.datas = null;
  }

  public int getDatasSize() {
    return (this.datas == null) ? 0 : this.datas.size();
  }

  public void putToDatas(String key, String val) {
    if (this.datas == null) {
      this.datas = new HashMap<String,String>();
    }
    this.datas.put(key, val);
  }

  public Map<String,String> getDatas() {
    return this.datas;
  }

  public DTO setDatas(Map<String,String> datas) {
    this.datas = datas;
    return this;
  }

  public void unsetDatas() {
    this.datas = null;
  }

  /** Returns true if field datas is set (has been assigned a value) and false otherwise */
  public boolean isSetDatas() {
    return this.datas != null;
  }

  public void setDatasIsSet(boolean value) {
    if (!value) {
      this.datas = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case DATAS:
      if (value == null) {
        unsetDatas();
      } else {
        setDatas((Map<String,String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case DATAS:
      return getDatas();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case DATAS:
      return isSetDatas();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof DTO)
      return this.equals((DTO)that);
    return false;
  }

  public boolean equals(DTO that) {
    if (that == null)
      return false;

    boolean this_present_datas = true && this.isSetDatas();
    boolean that_present_datas = true && that.isSetDatas();
    if (this_present_datas || that_present_datas) {
      if (!(this_present_datas && that_present_datas))
        return false;
      if (!this.datas.equals(that.datas))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(DTO other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetDatas()).compareTo(other.isSetDatas());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDatas()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.datas, other.datas);
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
    StringBuilder sb = new StringBuilder("DTO(");
    boolean first = true;

    sb.append("datas:");
    if (this.datas == null) {
      sb.append("null");
    } else {
      sb.append(this.datas);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
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

  private static class DTOStandardSchemeFactory implements SchemeFactory {
    public DTOStandardScheme getScheme() {
      return new DTOStandardScheme();
    }
  }

  private static class DTOStandardScheme extends StandardScheme<DTO> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, DTO struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // DATAS
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map0 = iprot.readMapBegin();
                struct.datas = new HashMap<String,String>(2*_map0.size);
                for (int _i1 = 0; _i1 < _map0.size; ++_i1)
                {
                  String _key2;
                  String _val3;
                  _key2 = iprot.readString();
                  _val3 = iprot.readString();
                  struct.datas.put(_key2, _val3);
                }
                iprot.readMapEnd();
              }
              struct.setDatasIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, DTO struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.datas != null) {
        oprot.writeFieldBegin(DATAS_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, struct.datas.size()));
          for (Map.Entry<String, String> _iter4 : struct.datas.entrySet())
          {
            oprot.writeString(_iter4.getKey());
            oprot.writeString(_iter4.getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class DTOTupleSchemeFactory implements SchemeFactory {
    public DTOTupleScheme getScheme() {
      return new DTOTupleScheme();
    }
  }

  private static class DTOTupleScheme extends TupleScheme<DTO> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, DTO struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetDatas()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetDatas()) {
        {
          oprot.writeI32(struct.datas.size());
          for (Map.Entry<String, String> _iter5 : struct.datas.entrySet())
          {
            oprot.writeString(_iter5.getKey());
            oprot.writeString(_iter5.getValue());
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, DTO struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TMap _map6 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.datas = new HashMap<String,String>(2*_map6.size);
          for (int _i7 = 0; _i7 < _map6.size; ++_i7)
          {
            String _key8;
            String _val9;
            _key8 = iprot.readString();
            _val9 = iprot.readString();
            struct.datas.put(_key8, _val9);
          }
        }
        struct.setDatasIsSet(true);
      }
    }
  }

}

