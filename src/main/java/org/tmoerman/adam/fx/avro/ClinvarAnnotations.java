/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.tmoerman.adam.fx.avro;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class ClinvarAnnotations extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ClinvarAnnotations\",\"namespace\":\"org.tmoerman.adam.fx.avro\",\"fields\":[{\"name\":\"CLNDSDB\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},\"default\":[]},{\"name\":\"CLNACC\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},\"default\":[]},{\"name\":\"CLNDBN\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},\"default\":[]},{\"name\":\"CLNSRC\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},\"default\":[]},{\"name\":\"CLNSIG\",\"type\":{\"type\":\"array\",\"items\":\"int\"},\"default\":[]},{\"name\":\"CLNORIGIN\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},\"default\":[]},{\"name\":\"CLNDSDBID\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},\"default\":[]},{\"name\":\"CLNHGVS\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},\"default\":[]},{\"name\":\"CLNSRCID\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},\"default\":[]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.util.List<java.lang.String> CLNDSDB;
  @Deprecated public java.util.List<java.lang.String> CLNACC;
  @Deprecated public java.util.List<java.lang.String> CLNDBN;
  @Deprecated public java.util.List<java.lang.String> CLNSRC;
  @Deprecated public java.util.List<java.lang.Integer> CLNSIG;
  @Deprecated public java.util.List<java.lang.String> CLNORIGIN;
  @Deprecated public java.util.List<java.lang.String> CLNDSDBID;
  @Deprecated public java.util.List<java.lang.String> CLNHGVS;
  @Deprecated public java.util.List<java.lang.String> CLNSRCID;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public ClinvarAnnotations() {}

  /**
   * All-args constructor.
   */
  public ClinvarAnnotations(java.util.List<java.lang.String> CLNDSDB, java.util.List<java.lang.String> CLNACC, java.util.List<java.lang.String> CLNDBN, java.util.List<java.lang.String> CLNSRC, java.util.List<java.lang.Integer> CLNSIG, java.util.List<java.lang.String> CLNORIGIN, java.util.List<java.lang.String> CLNDSDBID, java.util.List<java.lang.String> CLNHGVS, java.util.List<java.lang.String> CLNSRCID) {
    this.CLNDSDB = CLNDSDB;
    this.CLNACC = CLNACC;
    this.CLNDBN = CLNDBN;
    this.CLNSRC = CLNSRC;
    this.CLNSIG = CLNSIG;
    this.CLNORIGIN = CLNORIGIN;
    this.CLNDSDBID = CLNDSDBID;
    this.CLNHGVS = CLNHGVS;
    this.CLNSRCID = CLNSRCID;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return CLNDSDB;
    case 1: return CLNACC;
    case 2: return CLNDBN;
    case 3: return CLNSRC;
    case 4: return CLNSIG;
    case 5: return CLNORIGIN;
    case 6: return CLNDSDBID;
    case 7: return CLNHGVS;
    case 8: return CLNSRCID;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: CLNDSDB = (java.util.List<java.lang.String>)value$; break;
    case 1: CLNACC = (java.util.List<java.lang.String>)value$; break;
    case 2: CLNDBN = (java.util.List<java.lang.String>)value$; break;
    case 3: CLNSRC = (java.util.List<java.lang.String>)value$; break;
    case 4: CLNSIG = (java.util.List<java.lang.Integer>)value$; break;
    case 5: CLNORIGIN = (java.util.List<java.lang.String>)value$; break;
    case 6: CLNDSDBID = (java.util.List<java.lang.String>)value$; break;
    case 7: CLNHGVS = (java.util.List<java.lang.String>)value$; break;
    case 8: CLNSRCID = (java.util.List<java.lang.String>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'CLNDSDB' field.
   */
  public java.util.List<java.lang.String> getCLNDSDB() {
    return CLNDSDB;
  }

  /**
   * Sets the value of the 'CLNDSDB' field.
   * @param value the value to set.
   */
  public void setCLNDSDB(java.util.List<java.lang.String> value) {
    this.CLNDSDB = value;
  }

  /**
   * Gets the value of the 'CLNACC' field.
   */
  public java.util.List<java.lang.String> getCLNACC() {
    return CLNACC;
  }

  /**
   * Sets the value of the 'CLNACC' field.
   * @param value the value to set.
   */
  public void setCLNACC(java.util.List<java.lang.String> value) {
    this.CLNACC = value;
  }

  /**
   * Gets the value of the 'CLNDBN' field.
   */
  public java.util.List<java.lang.String> getCLNDBN() {
    return CLNDBN;
  }

  /**
   * Sets the value of the 'CLNDBN' field.
   * @param value the value to set.
   */
  public void setCLNDBN(java.util.List<java.lang.String> value) {
    this.CLNDBN = value;
  }

  /**
   * Gets the value of the 'CLNSRC' field.
   */
  public java.util.List<java.lang.String> getCLNSRC() {
    return CLNSRC;
  }

  /**
   * Sets the value of the 'CLNSRC' field.
   * @param value the value to set.
   */
  public void setCLNSRC(java.util.List<java.lang.String> value) {
    this.CLNSRC = value;
  }

  /**
   * Gets the value of the 'CLNSIG' field.
   */
  public java.util.List<java.lang.Integer> getCLNSIG() {
    return CLNSIG;
  }

  /**
   * Sets the value of the 'CLNSIG' field.
   * @param value the value to set.
   */
  public void setCLNSIG(java.util.List<java.lang.Integer> value) {
    this.CLNSIG = value;
  }

  /**
   * Gets the value of the 'CLNORIGIN' field.
   */
  public java.util.List<java.lang.String> getCLNORIGIN() {
    return CLNORIGIN;
  }

  /**
   * Sets the value of the 'CLNORIGIN' field.
   * @param value the value to set.
   */
  public void setCLNORIGIN(java.util.List<java.lang.String> value) {
    this.CLNORIGIN = value;
  }

  /**
   * Gets the value of the 'CLNDSDBID' field.
   */
  public java.util.List<java.lang.String> getCLNDSDBID() {
    return CLNDSDBID;
  }

  /**
   * Sets the value of the 'CLNDSDBID' field.
   * @param value the value to set.
   */
  public void setCLNDSDBID(java.util.List<java.lang.String> value) {
    this.CLNDSDBID = value;
  }

  /**
   * Gets the value of the 'CLNHGVS' field.
   */
  public java.util.List<java.lang.String> getCLNHGVS() {
    return CLNHGVS;
  }

  /**
   * Sets the value of the 'CLNHGVS' field.
   * @param value the value to set.
   */
  public void setCLNHGVS(java.util.List<java.lang.String> value) {
    this.CLNHGVS = value;
  }

  /**
   * Gets the value of the 'CLNSRCID' field.
   */
  public java.util.List<java.lang.String> getCLNSRCID() {
    return CLNSRCID;
  }

  /**
   * Sets the value of the 'CLNSRCID' field.
   * @param value the value to set.
   */
  public void setCLNSRCID(java.util.List<java.lang.String> value) {
    this.CLNSRCID = value;
  }

  /** Creates a new ClinvarAnnotations RecordBuilder */
  public static org.tmoerman.adam.fx.avro.ClinvarAnnotations.Builder newBuilder() {
    return new org.tmoerman.adam.fx.avro.ClinvarAnnotations.Builder();
  }
  
  /** Creates a new ClinvarAnnotations RecordBuilder by copying an existing Builder */
  public static org.tmoerman.adam.fx.avro.ClinvarAnnotations.Builder newBuilder(org.tmoerman.adam.fx.avro.ClinvarAnnotations.Builder other) {
    return new org.tmoerman.adam.fx.avro.ClinvarAnnotations.Builder(other);
  }
  
  /** Creates a new ClinvarAnnotations RecordBuilder by copying an existing ClinvarAnnotations instance */
  public static org.tmoerman.adam.fx.avro.ClinvarAnnotations.Builder newBuilder(org.tmoerman.adam.fx.avro.ClinvarAnnotations other) {
    return new org.tmoerman.adam.fx.avro.ClinvarAnnotations.Builder(other);
  }
  
  /**
   * RecordBuilder for ClinvarAnnotations instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ClinvarAnnotations>
    implements org.apache.avro.data.RecordBuilder<ClinvarAnnotations> {

    private java.util.List<java.lang.String> CLNDSDB;
    private java.util.List<java.lang.String> CLNACC;
    private java.util.List<java.lang.String> CLNDBN;
    private java.util.List<java.lang.String> CLNSRC;
    private java.util.List<java.lang.Integer> CLNSIG;
    private java.util.List<java.lang.String> CLNORIGIN;
    private java.util.List<java.lang.String> CLNDSDBID;
    private java.util.List<java.lang.String> CLNHGVS;
    private java.util.List<java.lang.String> CLNSRCID;

    /** Creates a new Builder */
    private Builder() {
      super(org.tmoerman.adam.fx.avro.ClinvarAnnotations.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.tmoerman.adam.fx.avro.ClinvarAnnotations.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.CLNDSDB)) {
        this.CLNDSDB = data().deepCopy(fields()[0].schema(), other.CLNDSDB);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.CLNACC)) {
        this.CLNACC = data().deepCopy(fields()[1].schema(), other.CLNACC);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.CLNDBN)) {
        this.CLNDBN = data().deepCopy(fields()[2].schema(), other.CLNDBN);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.CLNSRC)) {
        this.CLNSRC = data().deepCopy(fields()[3].schema(), other.CLNSRC);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.CLNSIG)) {
        this.CLNSIG = data().deepCopy(fields()[4].schema(), other.CLNSIG);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.CLNORIGIN)) {
        this.CLNORIGIN = data().deepCopy(fields()[5].schema(), other.CLNORIGIN);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.CLNDSDBID)) {
        this.CLNDSDBID = data().deepCopy(fields()[6].schema(), other.CLNDSDBID);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.CLNHGVS)) {
        this.CLNHGVS = data().deepCopy(fields()[7].schema(), other.CLNHGVS);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.CLNSRCID)) {
        this.CLNSRCID = data().deepCopy(fields()[8].schema(), other.CLNSRCID);
        fieldSetFlags()[8] = true;
      }
    }
    
    /** Creates a Builder by copying an existing ClinvarAnnotations instance */
    private Builder(org.tmoerman.adam.fx.avro.ClinvarAnnotations other) {
            super(org.tmoerman.adam.fx.avro.ClinvarAnnotations.SCHEMA$);
      if (isValidValue(fields()[0], other.CLNDSDB)) {
        this.CLNDSDB = data().deepCopy(fields()[0].schema(), other.CLNDSDB);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.CLNACC)) {
        this.CLNACC = data().deepCopy(fields()[1].schema(), other.CLNACC);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.CLNDBN)) {
        this.CLNDBN = data().deepCopy(fields()[2].schema(), other.CLNDBN);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.CLNSRC)) {
        this.CLNSRC = data().deepCopy(fields()[3].schema(), other.CLNSRC);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.CLNSIG)) {
        this.CLNSIG = data().deepCopy(fields()[4].schema(), other.CLNSIG);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.CLNORIGIN)) {
        this.CLNORIGIN = data().deepCopy(fields()[5].schema(), other.CLNORIGIN);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.CLNDSDBID)) {
        this.CLNDSDBID = data().deepCopy(fields()[6].schema(), other.CLNDSDBID);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.CLNHGVS)) {
        this.CLNHGVS = data().deepCopy(fields()[7].schema(), other.CLNHGVS);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.CLNSRCID)) {
        this.CLNSRCID = data().deepCopy(fields()[8].schema(), other.CLNSRCID);
        fieldSetFlags()[8] = true;
      }
    }

    /** Gets the value of the 'CLNDSDB' field */
    public java.util.List<java.lang.String> getCLNDSDB() {
      return CLNDSDB;
    }
    
    /** Sets the value of the 'CLNDSDB' field */
    public org.tmoerman.adam.fx.avro.ClinvarAnnotations.Builder setCLNDSDB(java.util.List<java.lang.String> value) {
      validate(fields()[0], value);
      this.CLNDSDB = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'CLNDSDB' field has been set */
    public boolean hasCLNDSDB() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'CLNDSDB' field */
    public org.tmoerman.adam.fx.avro.ClinvarAnnotations.Builder clearCLNDSDB() {
      CLNDSDB = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'CLNACC' field */
    public java.util.List<java.lang.String> getCLNACC() {
      return CLNACC;
    }
    
    /** Sets the value of the 'CLNACC' field */
    public org.tmoerman.adam.fx.avro.ClinvarAnnotations.Builder setCLNACC(java.util.List<java.lang.String> value) {
      validate(fields()[1], value);
      this.CLNACC = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'CLNACC' field has been set */
    public boolean hasCLNACC() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'CLNACC' field */
    public org.tmoerman.adam.fx.avro.ClinvarAnnotations.Builder clearCLNACC() {
      CLNACC = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'CLNDBN' field */
    public java.util.List<java.lang.String> getCLNDBN() {
      return CLNDBN;
    }
    
    /** Sets the value of the 'CLNDBN' field */
    public org.tmoerman.adam.fx.avro.ClinvarAnnotations.Builder setCLNDBN(java.util.List<java.lang.String> value) {
      validate(fields()[2], value);
      this.CLNDBN = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'CLNDBN' field has been set */
    public boolean hasCLNDBN() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'CLNDBN' field */
    public org.tmoerman.adam.fx.avro.ClinvarAnnotations.Builder clearCLNDBN() {
      CLNDBN = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'CLNSRC' field */
    public java.util.List<java.lang.String> getCLNSRC() {
      return CLNSRC;
    }
    
    /** Sets the value of the 'CLNSRC' field */
    public org.tmoerman.adam.fx.avro.ClinvarAnnotations.Builder setCLNSRC(java.util.List<java.lang.String> value) {
      validate(fields()[3], value);
      this.CLNSRC = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'CLNSRC' field has been set */
    public boolean hasCLNSRC() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'CLNSRC' field */
    public org.tmoerman.adam.fx.avro.ClinvarAnnotations.Builder clearCLNSRC() {
      CLNSRC = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'CLNSIG' field */
    public java.util.List<java.lang.Integer> getCLNSIG() {
      return CLNSIG;
    }
    
    /** Sets the value of the 'CLNSIG' field */
    public org.tmoerman.adam.fx.avro.ClinvarAnnotations.Builder setCLNSIG(java.util.List<java.lang.Integer> value) {
      validate(fields()[4], value);
      this.CLNSIG = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'CLNSIG' field has been set */
    public boolean hasCLNSIG() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'CLNSIG' field */
    public org.tmoerman.adam.fx.avro.ClinvarAnnotations.Builder clearCLNSIG() {
      CLNSIG = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'CLNORIGIN' field */
    public java.util.List<java.lang.String> getCLNORIGIN() {
      return CLNORIGIN;
    }
    
    /** Sets the value of the 'CLNORIGIN' field */
    public org.tmoerman.adam.fx.avro.ClinvarAnnotations.Builder setCLNORIGIN(java.util.List<java.lang.String> value) {
      validate(fields()[5], value);
      this.CLNORIGIN = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'CLNORIGIN' field has been set */
    public boolean hasCLNORIGIN() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'CLNORIGIN' field */
    public org.tmoerman.adam.fx.avro.ClinvarAnnotations.Builder clearCLNORIGIN() {
      CLNORIGIN = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the 'CLNDSDBID' field */
    public java.util.List<java.lang.String> getCLNDSDBID() {
      return CLNDSDBID;
    }
    
    /** Sets the value of the 'CLNDSDBID' field */
    public org.tmoerman.adam.fx.avro.ClinvarAnnotations.Builder setCLNDSDBID(java.util.List<java.lang.String> value) {
      validate(fields()[6], value);
      this.CLNDSDBID = value;
      fieldSetFlags()[6] = true;
      return this; 
    }
    
    /** Checks whether the 'CLNDSDBID' field has been set */
    public boolean hasCLNDSDBID() {
      return fieldSetFlags()[6];
    }
    
    /** Clears the value of the 'CLNDSDBID' field */
    public org.tmoerman.adam.fx.avro.ClinvarAnnotations.Builder clearCLNDSDBID() {
      CLNDSDBID = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /** Gets the value of the 'CLNHGVS' field */
    public java.util.List<java.lang.String> getCLNHGVS() {
      return CLNHGVS;
    }
    
    /** Sets the value of the 'CLNHGVS' field */
    public org.tmoerman.adam.fx.avro.ClinvarAnnotations.Builder setCLNHGVS(java.util.List<java.lang.String> value) {
      validate(fields()[7], value);
      this.CLNHGVS = value;
      fieldSetFlags()[7] = true;
      return this; 
    }
    
    /** Checks whether the 'CLNHGVS' field has been set */
    public boolean hasCLNHGVS() {
      return fieldSetFlags()[7];
    }
    
    /** Clears the value of the 'CLNHGVS' field */
    public org.tmoerman.adam.fx.avro.ClinvarAnnotations.Builder clearCLNHGVS() {
      CLNHGVS = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /** Gets the value of the 'CLNSRCID' field */
    public java.util.List<java.lang.String> getCLNSRCID() {
      return CLNSRCID;
    }
    
    /** Sets the value of the 'CLNSRCID' field */
    public org.tmoerman.adam.fx.avro.ClinvarAnnotations.Builder setCLNSRCID(java.util.List<java.lang.String> value) {
      validate(fields()[8], value);
      this.CLNSRCID = value;
      fieldSetFlags()[8] = true;
      return this; 
    }
    
    /** Checks whether the 'CLNSRCID' field has been set */
    public boolean hasCLNSRCID() {
      return fieldSetFlags()[8];
    }
    
    /** Clears the value of the 'CLNSRCID' field */
    public org.tmoerman.adam.fx.avro.ClinvarAnnotations.Builder clearCLNSRCID() {
      CLNSRCID = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    @Override
    public ClinvarAnnotations build() {
      try {
        ClinvarAnnotations record = new ClinvarAnnotations();
        record.CLNDSDB = fieldSetFlags()[0] ? this.CLNDSDB : (java.util.List<java.lang.String>) defaultValue(fields()[0]);
        record.CLNACC = fieldSetFlags()[1] ? this.CLNACC : (java.util.List<java.lang.String>) defaultValue(fields()[1]);
        record.CLNDBN = fieldSetFlags()[2] ? this.CLNDBN : (java.util.List<java.lang.String>) defaultValue(fields()[2]);
        record.CLNSRC = fieldSetFlags()[3] ? this.CLNSRC : (java.util.List<java.lang.String>) defaultValue(fields()[3]);
        record.CLNSIG = fieldSetFlags()[4] ? this.CLNSIG : (java.util.List<java.lang.Integer>) defaultValue(fields()[4]);
        record.CLNORIGIN = fieldSetFlags()[5] ? this.CLNORIGIN : (java.util.List<java.lang.String>) defaultValue(fields()[5]);
        record.CLNDSDBID = fieldSetFlags()[6] ? this.CLNDSDBID : (java.util.List<java.lang.String>) defaultValue(fields()[6]);
        record.CLNHGVS = fieldSetFlags()[7] ? this.CLNHGVS : (java.util.List<java.lang.String>) defaultValue(fields()[7]);
        record.CLNSRCID = fieldSetFlags()[8] ? this.CLNSRCID : (java.util.List<java.lang.String>) defaultValue(fields()[8]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}