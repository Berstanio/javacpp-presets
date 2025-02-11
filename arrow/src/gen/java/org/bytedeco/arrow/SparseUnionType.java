// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


/** \brief Concrete type class for sparse union data
 * 
 *  A sparse union is a nested type where each logical value is taken from
 *  a single child.  A buffer of 8-bit type ids indicates which child
 *  a given logical value is to be taken from.
 * 
 *  In a sparse union, each child array should have the same length as the
 *  union array, regardless of the actual number of union values that
 *  refer to it.
 * 
 *  Note that, unlike most other types, unions don't have a top-level validity bitmap. */
@Namespace("arrow") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class SparseUnionType extends UnionType {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SparseUnionType(Pointer p) { super(p); }

  @MemberGetter public static native @Cast("const arrow::Type::type") int type_id();
  public static final int type_id = type_id();

  public static native String type_name();

  public SparseUnionType(@ByVal FieldVector fields,
                    @StdVector BytePointer type_codes) { super((Pointer)null); allocate(fields, type_codes); }
  private native void allocate(@ByVal FieldVector fields,
                    @StdVector BytePointer type_codes);
  public SparseUnionType(@ByVal FieldVector fields,
                    @StdVector ByteBuffer type_codes) { super((Pointer)null); allocate(fields, type_codes); }
  private native void allocate(@ByVal FieldVector fields,
                    @StdVector ByteBuffer type_codes);
  public SparseUnionType(@ByVal FieldVector fields,
                    @StdVector byte[] type_codes) { super((Pointer)null); allocate(fields, type_codes); }
  private native void allocate(@ByVal FieldVector fields,
                    @StdVector byte[] type_codes);

  // A constructor variant that validates input parameters
  public static native @ByVal DataTypeResult Make(
        @ByVal FieldVector fields, @StdVector BytePointer type_codes);
  public static native @ByVal DataTypeResult Make(
        @ByVal FieldVector fields, @StdVector ByteBuffer type_codes);
  public static native @ByVal DataTypeResult Make(
        @ByVal FieldVector fields, @StdVector byte[] type_codes);

  public native @StdString String name();
}
