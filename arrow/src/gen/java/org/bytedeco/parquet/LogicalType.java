// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.parquet;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;

import static org.bytedeco.arrow.global.parquet.*;
  // namespace schema

/** \brief Implementation of parquet.thrift LogicalType types. */
@Namespace("parquet") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.parquet.class)
public class LogicalType extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LogicalType(Pointer p) { super(p); }

  public static class Type extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public Type() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public Type(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public Type(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public Type position(long position) {
          return (Type)super.position(position);
      }
      @Override public Type getPointer(long i) {
          return new Type((Pointer)this).offsetAddress(i);
      }
  
    public enum type {
      UNDEFINED(0),  // Not a real logical type
      STRING(1),
      MAP(2),
      LIST(3),
      ENUM(4),
      DECIMAL(5),
      DATE(6),
      TIME(7),
      TIMESTAMP(8),
      INTERVAL(9),
      INT(10),
      NIL(11),  // Thrift NullType: annotates data that is always null
      JSON(12),
      BSON(13),
      UUID(14),
      NONE(15); // Not a real logical type; should always be last element

        public final int value;
        private type(int v) { this.value = v; }
        private type(type e) { this.value = e.value; }
        public type intern() { for (type e : values()) if (e.value == value) return e; return this; }
        @Override public String toString() { return intern().name(); }
    }
  }

  public static class TimeUnit extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public TimeUnit() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public TimeUnit(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public TimeUnit(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public TimeUnit position(long position) {
          return (TimeUnit)super.position(position);
      }
      @Override public TimeUnit getPointer(long i) {
          return new TimeUnit((Pointer)this).offsetAddress(i);
      }
  
    public enum unit { UNKNOWN(0), MILLIS(1), MICROS(2), NANOS(3);

        public final int value;
        private unit(int v) { this.value = v; }
        private unit(unit e) { this.value = e.value; }
        public unit intern() { for (unit e : values()) if (e.value == value) return e; return this; }
        @Override public String toString() { return intern().name(); }
    }
  }

  /** \brief If possible, return a logical type equivalent to the given legacy
   *  converted type (and decimal metadata if applicable). */
  public static native @Cast("const parquet::LogicalType*") @SharedPtr @ByVal LogicalType FromConvertedType(
        ConvertedType.type converted_type,
        @Const @ByVal(nullValue = "parquet::schema::DecimalMetadata({false, -1,"
                                                                              + "-1})") DecimalMetadata converted_decimal_metadata);
  public static native @Cast("const parquet::LogicalType*") @SharedPtr @ByVal LogicalType FromConvertedType(
        ConvertedType.type converted_type);
  public static native @Cast("const parquet::LogicalType*") @SharedPtr @ByVal LogicalType FromConvertedType(
        @Cast("parquet::ConvertedType::type") int converted_type,
        @Const @ByVal(nullValue = "parquet::schema::DecimalMetadata({false, -1,"
                                                                              + "-1})") DecimalMetadata converted_decimal_metadata);
  public static native @Cast("const parquet::LogicalType*") @SharedPtr @ByVal LogicalType FromConvertedType(
        @Cast("parquet::ConvertedType::type") int converted_type);

  /** \brief Return the logical type represented by the Thrift intermediary object. */
  public static native @Cast("const parquet::LogicalType*") @SharedPtr @ByVal LogicalType FromThrift(
        @Const @ByRef LogicalType thrift_logical_type);

  /** \brief Return the explicitly requested logical type. */
  public static native @Cast("const parquet::LogicalType*") @SharedPtr @ByVal LogicalType String();
  public static native @Cast("const parquet::LogicalType*") @SharedPtr @ByVal LogicalType Map();
  public static native @Cast("const parquet::LogicalType*") @SharedPtr @ByVal LogicalType List();
  public static native @Cast("const parquet::LogicalType*") @SharedPtr @ByVal LogicalType Enum();
  public static native @Cast("const parquet::LogicalType*") @SharedPtr @ByVal LogicalType Decimal(int precision, int scale/*=0*/);
  public static native @Cast("const parquet::LogicalType*") @SharedPtr @ByVal LogicalType Decimal(int precision);
  public static native @Cast("const parquet::LogicalType*") @SharedPtr @ByVal LogicalType Date();
  public static native @Cast("const parquet::LogicalType*") @SharedPtr @ByVal LogicalType Time(@Cast("bool") boolean is_adjusted_to_utc,
                                                   TimeUnit.unit time_unit);
  public static native @Cast("const parquet::LogicalType*") @SharedPtr @ByVal LogicalType Time(@Cast("bool") boolean is_adjusted_to_utc,
                                                   @Cast("parquet::LogicalType::TimeUnit::unit") int time_unit);

  /** \brief Create a Timestamp logical type
   *  @param is_adjusted_to_utc [in] set true if the data is UTC-normalized
   *  @param time_unit [in] the resolution of the timestamp
   *  @param is_from_converted_type [in] if true, the timestamp was generated
   *  by translating a legacy converted type of TIMESTAMP_MILLIS or
   *  TIMESTAMP_MICROS. Default is false.
   *  @param force_set_converted_type [in] if true, always set the
   *  legacy ConvertedType TIMESTAMP_MICROS and TIMESTAMP_MILLIS
   *  metadata. Default is false */
  public static native @Cast("const parquet::LogicalType*") @SharedPtr @ByVal LogicalType Timestamp(
        @Cast("bool") boolean is_adjusted_to_utc, TimeUnit.unit time_unit,
        @Cast("bool") boolean is_from_converted_type/*=false*/, @Cast("bool") boolean force_set_converted_type/*=false*/);
  public static native @Cast("const parquet::LogicalType*") @SharedPtr @ByVal LogicalType Timestamp(
        @Cast("bool") boolean is_adjusted_to_utc, TimeUnit.unit time_unit);
  public static native @Cast("const parquet::LogicalType*") @SharedPtr @ByVal LogicalType Timestamp(
        @Cast("bool") boolean is_adjusted_to_utc, @Cast("parquet::LogicalType::TimeUnit::unit") int time_unit,
        @Cast("bool") boolean is_from_converted_type/*=false*/, @Cast("bool") boolean force_set_converted_type/*=false*/);
  public static native @Cast("const parquet::LogicalType*") @SharedPtr @ByVal LogicalType Timestamp(
        @Cast("bool") boolean is_adjusted_to_utc, @Cast("parquet::LogicalType::TimeUnit::unit") int time_unit);

  public static native @Cast("const parquet::LogicalType*") @SharedPtr @ByVal LogicalType Interval();
  
  ///
  public static native @Cast("const parquet::LogicalType*") @SharedPtr @ByVal LogicalType Int(int bit_width, @Cast("bool") boolean is_signed);

  /** \brief Create a logical type for data that's always null
   * 
   *  Any physical type can be annotated with this logical type. */
  public static native @Cast("const parquet::LogicalType*") @SharedPtr @ByVal LogicalType Null();

  public static native @Cast("const parquet::LogicalType*") @SharedPtr @ByVal LogicalType JSON();
  public static native @Cast("const parquet::LogicalType*") @SharedPtr @ByVal LogicalType BSON();
  public static native @Cast("const parquet::LogicalType*") @SharedPtr @ByVal LogicalType UUID();

  /** \brief Create a placeholder for when no logical type is specified */
  public static native @Cast("const parquet::LogicalType*") @SharedPtr @ByVal LogicalType None();

  /** \brief Return true if this logical type is consistent with the given underlying
   *  physical type. */
  public native @Cast("bool") boolean is_applicable(org.bytedeco.parquet.Type.type primitive_type,
                       int primitive_length/*=-1*/);
  public native @Cast("bool") boolean is_applicable(org.bytedeco.parquet.Type.type primitive_type);
  public native @Cast("bool") boolean is_applicable(@Cast("parquet::Type::type") int primitive_type,
                       int primitive_length/*=-1*/);
  public native @Cast("bool") boolean is_applicable(@Cast("parquet::Type::type") int primitive_type);

  /** \brief Return true if this logical type is equivalent to the given legacy converted
   *  type (and decimal metadata if applicable). */
  public native @Cast("bool") boolean is_compatible(ConvertedType.type converted_type,
                       @ByVal(nullValue = "parquet::schema::DecimalMetadata({"
                            + "false, -1, -1})") DecimalMetadata converted_decimal_metadata);
  public native @Cast("bool") boolean is_compatible(ConvertedType.type converted_type);
  public native @Cast("bool") boolean is_compatible(@Cast("parquet::ConvertedType::type") int converted_type,
                       @ByVal(nullValue = "parquet::schema::DecimalMetadata({"
                            + "false, -1, -1})") DecimalMetadata converted_decimal_metadata);
  public native @Cast("bool") boolean is_compatible(@Cast("parquet::ConvertedType::type") int converted_type);

  /** \brief If possible, return the legacy converted type (and decimal metadata if
   *  applicable) equivalent to this logical type. */
  public native ConvertedType.type ToConvertedType(
        DecimalMetadata out_decimal_metadata);

  /** \brief Return a printable representation of this logical type. */
  public native @StdString String ToString();

  /** \brief Return a JSON representation of this logical type. */
  public native @StdString String ToJSON();

  /** \brief Return a serializable Thrift object for this logical type. */
  public native @ByVal LogicalType ToThrift();

  /** \brief Return true if the given logical type is equivalent to this logical type. */
  public native @Cast("bool") boolean Equals(@Const @ByRef LogicalType other);

  /** \brief Return the enumerated type of this logical type. */
  public native Type.type type();

  /** \brief Return the appropriate sort order for this logical type. */
  public native org.bytedeco.parquet.SortOrder.type sort_order();

  // Type checks ...
  public native @Cast("bool") boolean is_string();
  public native @Cast("bool") boolean is_map();
  public native @Cast("bool") boolean is_list();
  public native @Cast("bool") boolean is_enum();
  public native @Cast("bool") boolean is_decimal();
  public native @Cast("bool") boolean is_date();
  public native @Cast("bool") boolean is_time();
  public native @Cast("bool") boolean is_timestamp();
  public native @Cast("bool") boolean is_interval();
  public native @Cast("bool") boolean is_int();
  public native @Cast("bool") boolean is_null();
  public native @Cast("bool") boolean is_JSON();
  public native @Cast("bool") boolean is_BSON();
  public native @Cast("bool") boolean is_UUID();
  public native @Cast("bool") boolean is_none();
  /** \brief Return true if this logical type is of a known type. */
  public native @Cast("bool") boolean is_valid();
  public native @Cast("bool") boolean is_invalid();
  /** \brief Return true if this logical type is suitable for a schema GroupNode. */
  public native @Cast("bool") boolean is_nested();
  public native @Cast("bool") boolean is_nonnested();
  /** \brief Return true if this logical type is included in the Thrift output for its
   *  node. */
  public native @Cast("bool") boolean is_serialized();

  
  
}
