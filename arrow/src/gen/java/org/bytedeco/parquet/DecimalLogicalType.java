// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.parquet;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;

import static org.bytedeco.arrow.global.parquet.*;


/** \brief Allowed for physical type INT32, INT64, FIXED_LEN_BYTE_ARRAY, or BYTE_ARRAY,
 *  depending on the precision. */
@Namespace("parquet") @Properties(inherit = org.bytedeco.arrow.presets.parquet.class)
public class DecimalLogicalType extends LogicalType {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DecimalLogicalType(Pointer p) { super(p); }

  public static native @Cast("const parquet::LogicalType*") @SharedPtr @ByVal LogicalType Make(int precision, int scale/*=0*/);
  public static native @Cast("const parquet::LogicalType*") @SharedPtr @ByVal LogicalType Make(int precision);
  public native int precision();
  public native int scale();
}
