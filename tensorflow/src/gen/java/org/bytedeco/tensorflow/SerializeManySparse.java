// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Serialize an {@code N}-minibatch {@code SparseTensor} into an {@code [N, 3]} {@code Tensor} object.
 * 
 *  The {@code SparseTensor} must have rank {@code R} greater than 1, and the first dimension
 *  is treated as the minibatch dimension.  Elements of the {@code SparseTensor}
 *  must be sorted in increasing order of this first dimension.  The serialized
 *  {@code SparseTensor} objects going into each row of {@code serialized_sparse} will have
 *  rank {@code R-1}.
 * 
 *  The minibatch size {@code N} is extracted from {@code sparse_shape[0]}.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * sparse_indices: 2-D.  The {@code indices} of the minibatch {@code SparseTensor}.
 *  * sparse_values: 1-D.  The {@code values} of the minibatch {@code SparseTensor}.
 *  * sparse_shape: 1-D.  The {@code shape} of the minibatch {@code SparseTensor}.
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * out_type: The {@code dtype} to use for serialization; the supported types are {@code string}
 *  (default) and {@code variant}.
 * 
 *  Returns:
 *  * {@code Output}: The serialized_sparse tensor. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class SerializeManySparse extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SerializeManySparse(Pointer p) { super(p); }

  /** Optional attribute setters for SerializeManySparse */
  public static class Attrs extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public Attrs() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public Attrs(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public Attrs(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public Attrs position(long position) {
          return (Attrs)super.position(position);
      }
      @Override public Attrs getPointer(long i) {
          return new Attrs((Pointer)this).offsetAddress(i);
      }
  
    /** The {@code dtype} to use for serialization; the supported types are {@code string}
     *  (default) and {@code variant}.
     * 
     *  Defaults to DT_STRING */
    public native @ByVal Attrs OutType(@Cast("tensorflow::DataType") int x);

    public native @Cast("tensorflow::DataType") int out_type_(); public native Attrs out_type_(int setter);
  }
  public SerializeManySparse(@Const @ByRef Scope scope, @ByVal Input sparse_indices, @ByVal Input sparse_values,
                      @ByVal Input sparse_shape) { super((Pointer)null); allocate(scope, sparse_indices, sparse_values, sparse_shape); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input sparse_indices, @ByVal Input sparse_values,
                      @ByVal Input sparse_shape);
  public SerializeManySparse(@Const @ByRef Scope scope, @ByVal Input sparse_indices, @ByVal Input sparse_values,
                      @ByVal Input sparse_shape, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, sparse_indices, sparse_values, sparse_shape, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input sparse_indices, @ByVal Input sparse_values,
                      @ByVal Input sparse_shape, @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public static native @ByVal Attrs OutType(@Cast("tensorflow::DataType") int x);

  public native @ByRef Operation operation(); public native SerializeManySparse operation(Operation setter);
  public native @ByRef Output serialized_sparse(); public native SerializeManySparse serialized_sparse(Output setter);
}
