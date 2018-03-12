/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.airavata.sharing.registry.models;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (1.0.0-dev)")
public class GroupAdmin implements org.apache.thrift.TBase<GroupAdmin, GroupAdmin._Fields>, java.io.Serializable, Cloneable, Comparable<GroupAdmin> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("GroupAdmin");

  private static final org.apache.thrift.protocol.TField GROUP_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("groupId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField DOMAIN_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("domainId", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField ADMIN_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("adminId", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new GroupAdminStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new GroupAdminTupleSchemeFactory();

  public java.lang.String groupId; // optional
  public java.lang.String domainId; // optional
  public java.lang.String adminId; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    GROUP_ID((short)1, "groupId"),
    DOMAIN_ID((short)2, "domainId"),
    ADMIN_ID((short)3, "adminId");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // GROUP_ID
          return GROUP_ID;
        case 2: // DOMAIN_ID
          return DOMAIN_ID;
        case 3: // ADMIN_ID
          return ADMIN_ID;
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
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final _Fields optionals[] = {_Fields.GROUP_ID,_Fields.DOMAIN_ID,_Fields.ADMIN_ID};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.GROUP_ID, new org.apache.thrift.meta_data.FieldMetaData("groupId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DOMAIN_ID, new org.apache.thrift.meta_data.FieldMetaData("domainId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ADMIN_ID, new org.apache.thrift.meta_data.FieldMetaData("adminId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(GroupAdmin.class, metaDataMap);
  }

  public GroupAdmin() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GroupAdmin(GroupAdmin other) {
    if (other.isSetGroupId()) {
      this.groupId = other.groupId;
    }
    if (other.isSetDomainId()) {
      this.domainId = other.domainId;
    }
    if (other.isSetAdminId()) {
      this.adminId = other.adminId;
    }
  }

  public GroupAdmin deepCopy() {
    return new GroupAdmin(this);
  }

  @Override
  public void clear() {
    this.groupId = null;
    this.domainId = null;
    this.adminId = null;
  }

  public java.lang.String getGroupId() {
    return this.groupId;
  }

  public GroupAdmin setGroupId(java.lang.String groupId) {
    this.groupId = groupId;
    return this;
  }

  public void unsetGroupId() {
    this.groupId = null;
  }

  /** Returns true if field groupId is set (has been assigned a value) and false otherwise */
  public boolean isSetGroupId() {
    return this.groupId != null;
  }

  public void setGroupIdIsSet(boolean value) {
    if (!value) {
      this.groupId = null;
    }
  }

  public java.lang.String getDomainId() {
    return this.domainId;
  }

  public GroupAdmin setDomainId(java.lang.String domainId) {
    this.domainId = domainId;
    return this;
  }

  public void unsetDomainId() {
    this.domainId = null;
  }

  /** Returns true if field domainId is set (has been assigned a value) and false otherwise */
  public boolean isSetDomainId() {
    return this.domainId != null;
  }

  public void setDomainIdIsSet(boolean value) {
    if (!value) {
      this.domainId = null;
    }
  }

  public java.lang.String getAdminId() {
    return this.adminId;
  }

  public GroupAdmin setAdminId(java.lang.String adminId) {
    this.adminId = adminId;
    return this;
  }

  public void unsetAdminId() {
    this.adminId = null;
  }

  /** Returns true if field adminId is set (has been assigned a value) and false otherwise */
  public boolean isSetAdminId() {
    return this.adminId != null;
  }

  public void setAdminIdIsSet(boolean value) {
    if (!value) {
      this.adminId = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case GROUP_ID:
      if (value == null) {
        unsetGroupId();
      } else {
        setGroupId((java.lang.String)value);
      }
      break;

    case DOMAIN_ID:
      if (value == null) {
        unsetDomainId();
      } else {
        setDomainId((java.lang.String)value);
      }
      break;

    case ADMIN_ID:
      if (value == null) {
        unsetAdminId();
      } else {
        setAdminId((java.lang.String)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case GROUP_ID:
      return getGroupId();

    case DOMAIN_ID:
      return getDomainId();

    case ADMIN_ID:
      return getAdminId();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case GROUP_ID:
      return isSetGroupId();
    case DOMAIN_ID:
      return isSetDomainId();
    case ADMIN_ID:
      return isSetAdminId();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof GroupAdmin)
      return this.equals((GroupAdmin)that);
    return false;
  }

  public boolean equals(GroupAdmin that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_groupId = true && this.isSetGroupId();
    boolean that_present_groupId = true && that.isSetGroupId();
    if (this_present_groupId || that_present_groupId) {
      if (!(this_present_groupId && that_present_groupId))
        return false;
      if (!this.groupId.equals(that.groupId))
        return false;
    }

    boolean this_present_domainId = true && this.isSetDomainId();
    boolean that_present_domainId = true && that.isSetDomainId();
    if (this_present_domainId || that_present_domainId) {
      if (!(this_present_domainId && that_present_domainId))
        return false;
      if (!this.domainId.equals(that.domainId))
        return false;
    }

    boolean this_present_adminId = true && this.isSetAdminId();
    boolean that_present_adminId = true && that.isSetAdminId();
    if (this_present_adminId || that_present_adminId) {
      if (!(this_present_adminId && that_present_adminId))
        return false;
      if (!this.adminId.equals(that.adminId))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetGroupId()) ? 131071 : 524287);
    if (isSetGroupId())
      hashCode = hashCode * 8191 + groupId.hashCode();

    hashCode = hashCode * 8191 + ((isSetDomainId()) ? 131071 : 524287);
    if (isSetDomainId())
      hashCode = hashCode * 8191 + domainId.hashCode();

    hashCode = hashCode * 8191 + ((isSetAdminId()) ? 131071 : 524287);
    if (isSetAdminId())
      hashCode = hashCode * 8191 + adminId.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(GroupAdmin other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetGroupId()).compareTo(other.isSetGroupId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGroupId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.groupId, other.groupId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetDomainId()).compareTo(other.isSetDomainId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDomainId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.domainId, other.domainId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetAdminId()).compareTo(other.isSetAdminId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAdminId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.adminId, other.adminId);
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
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("GroupAdmin(");
    boolean first = true;

    if (isSetGroupId()) {
      sb.append("groupId:");
      if (this.groupId == null) {
        sb.append("null");
      } else {
        sb.append(this.groupId);
      }
      first = false;
    }
    if (isSetDomainId()) {
      if (!first) sb.append(", ");
      sb.append("domainId:");
      if (this.domainId == null) {
        sb.append("null");
      } else {
        sb.append(this.domainId);
      }
      first = false;
    }
    if (isSetAdminId()) {
      if (!first) sb.append(", ");
      sb.append("adminId:");
      if (this.adminId == null) {
        sb.append("null");
      } else {
        sb.append(this.adminId);
      }
      first = false;
    }
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

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class GroupAdminStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public GroupAdminStandardScheme getScheme() {
      return new GroupAdminStandardScheme();
    }
  }

  private static class GroupAdminStandardScheme extends org.apache.thrift.scheme.StandardScheme<GroupAdmin> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, GroupAdmin struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // GROUP_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.groupId = iprot.readString();
              struct.setGroupIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // DOMAIN_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.domainId = iprot.readString();
              struct.setDomainIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ADMIN_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.adminId = iprot.readString();
              struct.setAdminIdIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, GroupAdmin struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.groupId != null) {
        if (struct.isSetGroupId()) {
          oprot.writeFieldBegin(GROUP_ID_FIELD_DESC);
          oprot.writeString(struct.groupId);
          oprot.writeFieldEnd();
        }
      }
      if (struct.domainId != null) {
        if (struct.isSetDomainId()) {
          oprot.writeFieldBegin(DOMAIN_ID_FIELD_DESC);
          oprot.writeString(struct.domainId);
          oprot.writeFieldEnd();
        }
      }
      if (struct.adminId != null) {
        if (struct.isSetAdminId()) {
          oprot.writeFieldBegin(ADMIN_ID_FIELD_DESC);
          oprot.writeString(struct.adminId);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GroupAdminTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public GroupAdminTupleScheme getScheme() {
      return new GroupAdminTupleScheme();
    }
  }

  private static class GroupAdminTupleScheme extends org.apache.thrift.scheme.TupleScheme<GroupAdmin> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, GroupAdmin struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetGroupId()) {
        optionals.set(0);
      }
      if (struct.isSetDomainId()) {
        optionals.set(1);
      }
      if (struct.isSetAdminId()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetGroupId()) {
        oprot.writeString(struct.groupId);
      }
      if (struct.isSetDomainId()) {
        oprot.writeString(struct.domainId);
      }
      if (struct.isSetAdminId()) {
        oprot.writeString(struct.adminId);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, GroupAdmin struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.groupId = iprot.readString();
        struct.setGroupIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.domainId = iprot.readString();
        struct.setDomainIdIsSet(true);
      }
      if (incoming.get(2)) {
        struct.adminId = iprot.readString();
        struct.setAdminIdIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

