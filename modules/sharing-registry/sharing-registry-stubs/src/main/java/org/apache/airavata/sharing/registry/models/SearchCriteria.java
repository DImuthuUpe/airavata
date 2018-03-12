/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.airavata.sharing.registry.models;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
/**
 * <p>Container object for search criteria</p>
 * <li><b>searchField</b> : Entity search field</li>
 * <li><b>value</b> : Search value</li>
 * <li><b>searchCondition</b> : EQUAL, LIKE etc..</li>
 * 
 */
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)")
public class SearchCriteria implements org.apache.thrift.TBase<SearchCriteria, SearchCriteria._Fields>, java.io.Serializable, Cloneable, Comparable<SearchCriteria> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SearchCriteria");

  private static final org.apache.thrift.protocol.TField SEARCH_FIELD_FIELD_DESC = new org.apache.thrift.protocol.TField("searchField", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField VALUE_FIELD_DESC = new org.apache.thrift.protocol.TField("value", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField SEARCH_CONDITION_FIELD_DESC = new org.apache.thrift.protocol.TField("searchCondition", org.apache.thrift.protocol.TType.I32, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new SearchCriteriaStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new SearchCriteriaTupleSchemeFactory();

  /**
   * 
   * @see EntitySearchField
   */
  public EntitySearchField searchField; // optional
  public java.lang.String value; // optional
  /**
   * 
   * @see SearchCondition
   */
  public SearchCondition searchCondition; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see EntitySearchField
     */
    SEARCH_FIELD((short)1, "searchField"),
    VALUE((short)2, "value"),
    /**
     * 
     * @see SearchCondition
     */
    SEARCH_CONDITION((short)3, "searchCondition");

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
        case 1: // SEARCH_FIELD
          return SEARCH_FIELD;
        case 2: // VALUE
          return VALUE;
        case 3: // SEARCH_CONDITION
          return SEARCH_CONDITION;
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
  private static final _Fields optionals[] = {_Fields.SEARCH_FIELD,_Fields.VALUE,_Fields.SEARCH_CONDITION};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SEARCH_FIELD, new org.apache.thrift.meta_data.FieldMetaData("searchField", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, EntitySearchField.class)));
    tmpMap.put(_Fields.VALUE, new org.apache.thrift.meta_data.FieldMetaData("value", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SEARCH_CONDITION, new org.apache.thrift.meta_data.FieldMetaData("searchCondition", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, SearchCondition.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SearchCriteria.class, metaDataMap);
  }

  public SearchCriteria() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SearchCriteria(SearchCriteria other) {
    if (other.isSetSearchField()) {
      this.searchField = other.searchField;
    }
    if (other.isSetValue()) {
      this.value = other.value;
    }
    if (other.isSetSearchCondition()) {
      this.searchCondition = other.searchCondition;
    }
  }

  public SearchCriteria deepCopy() {
    return new SearchCriteria(this);
  }

  @Override
  public void clear() {
    this.searchField = null;
    this.value = null;
    this.searchCondition = null;
  }

  /**
   * 
   * @see EntitySearchField
   */
  public EntitySearchField getSearchField() {
    return this.searchField;
  }

  /**
   * 
   * @see EntitySearchField
   */
  public SearchCriteria setSearchField(EntitySearchField searchField) {
    this.searchField = searchField;
    return this;
  }

  public void unsetSearchField() {
    this.searchField = null;
  }

  /** Returns true if field searchField is set (has been assigned a value) and false otherwise */
  public boolean isSetSearchField() {
    return this.searchField != null;
  }

  public void setSearchFieldIsSet(boolean value) {
    if (!value) {
      this.searchField = null;
    }
  }

  public java.lang.String getValue() {
    return this.value;
  }

  public SearchCriteria setValue(java.lang.String value) {
    this.value = value;
    return this;
  }

  public void unsetValue() {
    this.value = null;
  }

  /** Returns true if field value is set (has been assigned a value) and false otherwise */
  public boolean isSetValue() {
    return this.value != null;
  }

  public void setValueIsSet(boolean value) {
    if (!value) {
      this.value = null;
    }
  }

  /**
   * 
   * @see SearchCondition
   */
  public SearchCondition getSearchCondition() {
    return this.searchCondition;
  }

  /**
   * 
   * @see SearchCondition
   */
  public SearchCriteria setSearchCondition(SearchCondition searchCondition) {
    this.searchCondition = searchCondition;
    return this;
  }

  public void unsetSearchCondition() {
    this.searchCondition = null;
  }

  /** Returns true if field searchCondition is set (has been assigned a value) and false otherwise */
  public boolean isSetSearchCondition() {
    return this.searchCondition != null;
  }

  public void setSearchConditionIsSet(boolean value) {
    if (!value) {
      this.searchCondition = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case SEARCH_FIELD:
      if (value == null) {
        unsetSearchField();
      } else {
        setSearchField((EntitySearchField)value);
      }
      break;

    case VALUE:
      if (value == null) {
        unsetValue();
      } else {
        setValue((java.lang.String)value);
      }
      break;

    case SEARCH_CONDITION:
      if (value == null) {
        unsetSearchCondition();
      } else {
        setSearchCondition((SearchCondition)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case SEARCH_FIELD:
      return getSearchField();

    case VALUE:
      return getValue();

    case SEARCH_CONDITION:
      return getSearchCondition();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case SEARCH_FIELD:
      return isSetSearchField();
    case VALUE:
      return isSetValue();
    case SEARCH_CONDITION:
      return isSetSearchCondition();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof SearchCriteria)
      return this.equals((SearchCriteria)that);
    return false;
  }

  public boolean equals(SearchCriteria that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_searchField = true && this.isSetSearchField();
    boolean that_present_searchField = true && that.isSetSearchField();
    if (this_present_searchField || that_present_searchField) {
      if (!(this_present_searchField && that_present_searchField))
        return false;
      if (!this.searchField.equals(that.searchField))
        return false;
    }

    boolean this_present_value = true && this.isSetValue();
    boolean that_present_value = true && that.isSetValue();
    if (this_present_value || that_present_value) {
      if (!(this_present_value && that_present_value))
        return false;
      if (!this.value.equals(that.value))
        return false;
    }

    boolean this_present_searchCondition = true && this.isSetSearchCondition();
    boolean that_present_searchCondition = true && that.isSetSearchCondition();
    if (this_present_searchCondition || that_present_searchCondition) {
      if (!(this_present_searchCondition && that_present_searchCondition))
        return false;
      if (!this.searchCondition.equals(that.searchCondition))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetSearchField()) ? 131071 : 524287);
    if (isSetSearchField())
      hashCode = hashCode * 8191 + searchField.getValue();

    hashCode = hashCode * 8191 + ((isSetValue()) ? 131071 : 524287);
    if (isSetValue())
      hashCode = hashCode * 8191 + value.hashCode();

    hashCode = hashCode * 8191 + ((isSetSearchCondition()) ? 131071 : 524287);
    if (isSetSearchCondition())
      hashCode = hashCode * 8191 + searchCondition.getValue();

    return hashCode;
  }

  @Override
  public int compareTo(SearchCriteria other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetSearchField()).compareTo(other.isSetSearchField());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSearchField()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.searchField, other.searchField);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetValue()).compareTo(other.isSetValue());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetValue()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.value, other.value);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetSearchCondition()).compareTo(other.isSetSearchCondition());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSearchCondition()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.searchCondition, other.searchCondition);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("SearchCriteria(");
    boolean first = true;

    if (isSetSearchField()) {
      sb.append("searchField:");
      if (this.searchField == null) {
        sb.append("null");
      } else {
        sb.append(this.searchField);
      }
      first = false;
    }
    if (isSetValue()) {
      if (!first) sb.append(", ");
      sb.append("value:");
      if (this.value == null) {
        sb.append("null");
      } else {
        sb.append(this.value);
      }
      first = false;
    }
    if (isSetSearchCondition()) {
      if (!first) sb.append(", ");
      sb.append("searchCondition:");
      if (this.searchCondition == null) {
        sb.append("null");
      } else {
        sb.append(this.searchCondition);
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

  private static class SearchCriteriaStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SearchCriteriaStandardScheme getScheme() {
      return new SearchCriteriaStandardScheme();
    }
  }

  private static class SearchCriteriaStandardScheme extends org.apache.thrift.scheme.StandardScheme<SearchCriteria> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SearchCriteria struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SEARCH_FIELD
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.searchField = org.apache.airavata.sharing.registry.models.EntitySearchField.findByValue(iprot.readI32());
              struct.setSearchFieldIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // VALUE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.value = iprot.readString();
              struct.setValueIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SEARCH_CONDITION
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.searchCondition = org.apache.airavata.sharing.registry.models.SearchCondition.findByValue(iprot.readI32());
              struct.setSearchConditionIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SearchCriteria struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.searchField != null) {
        if (struct.isSetSearchField()) {
          oprot.writeFieldBegin(SEARCH_FIELD_FIELD_DESC);
          oprot.writeI32(struct.searchField.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.value != null) {
        if (struct.isSetValue()) {
          oprot.writeFieldBegin(VALUE_FIELD_DESC);
          oprot.writeString(struct.value);
          oprot.writeFieldEnd();
        }
      }
      if (struct.searchCondition != null) {
        if (struct.isSetSearchCondition()) {
          oprot.writeFieldBegin(SEARCH_CONDITION_FIELD_DESC);
          oprot.writeI32(struct.searchCondition.getValue());
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SearchCriteriaTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SearchCriteriaTupleScheme getScheme() {
      return new SearchCriteriaTupleScheme();
    }
  }

  private static class SearchCriteriaTupleScheme extends org.apache.thrift.scheme.TupleScheme<SearchCriteria> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SearchCriteria struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetSearchField()) {
        optionals.set(0);
      }
      if (struct.isSetValue()) {
        optionals.set(1);
      }
      if (struct.isSetSearchCondition()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetSearchField()) {
        oprot.writeI32(struct.searchField.getValue());
      }
      if (struct.isSetValue()) {
        oprot.writeString(struct.value);
      }
      if (struct.isSetSearchCondition()) {
        oprot.writeI32(struct.searchCondition.getValue());
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SearchCriteria struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.searchField = org.apache.airavata.sharing.registry.models.EntitySearchField.findByValue(iprot.readI32());
        struct.setSearchFieldIsSet(true);
      }
      if (incoming.get(1)) {
        struct.value = iprot.readString();
        struct.setValueIsSet(true);
      }
      if (incoming.get(2)) {
        struct.searchCondition = org.apache.airavata.sharing.registry.models.SearchCondition.findByValue(iprot.readI32());
        struct.setSearchConditionIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

