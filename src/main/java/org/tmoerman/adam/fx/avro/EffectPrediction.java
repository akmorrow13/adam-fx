/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.tmoerman.adam.fx.avro;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class EffectPrediction extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"EffectPrediction\",\"namespace\":\"org.tmoerman.adam.fx.avro\",\"fields\":[{\"name\":\"gene\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"ID\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"numTranscripts\",\"type\":\"int\"},{\"name\":\"percentAffected\",\"type\":\"float\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.String gene;
  @Deprecated public java.lang.String ID;
  @Deprecated public int numTranscripts;
  @Deprecated public float percentAffected;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public EffectPrediction() {}

  /**
   * All-args constructor.
   */
  public EffectPrediction(java.lang.String gene, java.lang.String ID, java.lang.Integer numTranscripts, java.lang.Float percentAffected) {
    this.gene = gene;
    this.ID = ID;
    this.numTranscripts = numTranscripts;
    this.percentAffected = percentAffected;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return gene;
    case 1: return ID;
    case 2: return numTranscripts;
    case 3: return percentAffected;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: gene = (java.lang.String)value$; break;
    case 1: ID = (java.lang.String)value$; break;
    case 2: numTranscripts = (java.lang.Integer)value$; break;
    case 3: percentAffected = (java.lang.Float)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'gene' field.
   */
  public java.lang.String getGene() {
    return gene;
  }

  /**
   * Sets the value of the 'gene' field.
   * @param value the value to set.
   */
  public void setGene(java.lang.String value) {
    this.gene = value;
  }

  /**
   * Gets the value of the 'ID' field.
   */
  public java.lang.String getID() {
    return ID;
  }

  /**
   * Sets the value of the 'ID' field.
   * @param value the value to set.
   */
  public void setID(java.lang.String value) {
    this.ID = value;
  }

  /**
   * Gets the value of the 'numTranscripts' field.
   */
  public java.lang.Integer getNumTranscripts() {
    return numTranscripts;
  }

  /**
   * Sets the value of the 'numTranscripts' field.
   * @param value the value to set.
   */
  public void setNumTranscripts(java.lang.Integer value) {
    this.numTranscripts = value;
  }

  /**
   * Gets the value of the 'percentAffected' field.
   */
  public java.lang.Float getPercentAffected() {
    return percentAffected;
  }

  /**
   * Sets the value of the 'percentAffected' field.
   * @param value the value to set.
   */
  public void setPercentAffected(java.lang.Float value) {
    this.percentAffected = value;
  }

  /** Creates a new EffectPrediction RecordBuilder */
  public static org.tmoerman.adam.fx.avro.EffectPrediction.Builder newBuilder() {
    return new org.tmoerman.adam.fx.avro.EffectPrediction.Builder();
  }
  
  /** Creates a new EffectPrediction RecordBuilder by copying an existing Builder */
  public static org.tmoerman.adam.fx.avro.EffectPrediction.Builder newBuilder(org.tmoerman.adam.fx.avro.EffectPrediction.Builder other) {
    return new org.tmoerman.adam.fx.avro.EffectPrediction.Builder(other);
  }
  
  /** Creates a new EffectPrediction RecordBuilder by copying an existing EffectPrediction instance */
  public static org.tmoerman.adam.fx.avro.EffectPrediction.Builder newBuilder(org.tmoerman.adam.fx.avro.EffectPrediction other) {
    return new org.tmoerman.adam.fx.avro.EffectPrediction.Builder(other);
  }
  
  /**
   * RecordBuilder for EffectPrediction instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<EffectPrediction>
    implements org.apache.avro.data.RecordBuilder<EffectPrediction> {

    private java.lang.String gene;
    private java.lang.String ID;
    private int numTranscripts;
    private float percentAffected;

    /** Creates a new Builder */
    private Builder() {
      super(org.tmoerman.adam.fx.avro.EffectPrediction.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.tmoerman.adam.fx.avro.EffectPrediction.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.gene)) {
        this.gene = data().deepCopy(fields()[0].schema(), other.gene);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.ID)) {
        this.ID = data().deepCopy(fields()[1].schema(), other.ID);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.numTranscripts)) {
        this.numTranscripts = data().deepCopy(fields()[2].schema(), other.numTranscripts);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.percentAffected)) {
        this.percentAffected = data().deepCopy(fields()[3].schema(), other.percentAffected);
        fieldSetFlags()[3] = true;
      }
    }
    
    /** Creates a Builder by copying an existing EffectPrediction instance */
    private Builder(org.tmoerman.adam.fx.avro.EffectPrediction other) {
            super(org.tmoerman.adam.fx.avro.EffectPrediction.SCHEMA$);
      if (isValidValue(fields()[0], other.gene)) {
        this.gene = data().deepCopy(fields()[0].schema(), other.gene);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.ID)) {
        this.ID = data().deepCopy(fields()[1].schema(), other.ID);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.numTranscripts)) {
        this.numTranscripts = data().deepCopy(fields()[2].schema(), other.numTranscripts);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.percentAffected)) {
        this.percentAffected = data().deepCopy(fields()[3].schema(), other.percentAffected);
        fieldSetFlags()[3] = true;
      }
    }

    /** Gets the value of the 'gene' field */
    public java.lang.String getGene() {
      return gene;
    }
    
    /** Sets the value of the 'gene' field */
    public org.tmoerman.adam.fx.avro.EffectPrediction.Builder setGene(java.lang.String value) {
      validate(fields()[0], value);
      this.gene = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'gene' field has been set */
    public boolean hasGene() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'gene' field */
    public org.tmoerman.adam.fx.avro.EffectPrediction.Builder clearGene() {
      gene = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'ID' field */
    public java.lang.String getID() {
      return ID;
    }
    
    /** Sets the value of the 'ID' field */
    public org.tmoerman.adam.fx.avro.EffectPrediction.Builder setID(java.lang.String value) {
      validate(fields()[1], value);
      this.ID = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'ID' field has been set */
    public boolean hasID() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'ID' field */
    public org.tmoerman.adam.fx.avro.EffectPrediction.Builder clearID() {
      ID = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'numTranscripts' field */
    public java.lang.Integer getNumTranscripts() {
      return numTranscripts;
    }
    
    /** Sets the value of the 'numTranscripts' field */
    public org.tmoerman.adam.fx.avro.EffectPrediction.Builder setNumTranscripts(int value) {
      validate(fields()[2], value);
      this.numTranscripts = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'numTranscripts' field has been set */
    public boolean hasNumTranscripts() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'numTranscripts' field */
    public org.tmoerman.adam.fx.avro.EffectPrediction.Builder clearNumTranscripts() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'percentAffected' field */
    public java.lang.Float getPercentAffected() {
      return percentAffected;
    }
    
    /** Sets the value of the 'percentAffected' field */
    public org.tmoerman.adam.fx.avro.EffectPrediction.Builder setPercentAffected(float value) {
      validate(fields()[3], value);
      this.percentAffected = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'percentAffected' field has been set */
    public boolean hasPercentAffected() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'percentAffected' field */
    public org.tmoerman.adam.fx.avro.EffectPrediction.Builder clearPercentAffected() {
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    public EffectPrediction build() {
      try {
        EffectPrediction record = new EffectPrediction();
        record.gene = fieldSetFlags()[0] ? this.gene : (java.lang.String) defaultValue(fields()[0]);
        record.ID = fieldSetFlags()[1] ? this.ID : (java.lang.String) defaultValue(fields()[1]);
        record.numTranscripts = fieldSetFlags()[2] ? this.numTranscripts : (java.lang.Integer) defaultValue(fields()[2]);
        record.percentAffected = fieldSetFlags()[3] ? this.percentAffected : (java.lang.Float) defaultValue(fields()[3]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
