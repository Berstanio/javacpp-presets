// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Saves tensors in V2 checkpoint format.
 * 
 *  By default, saves the named tensors in full.  If the caller wishes to save
 *  specific slices of full tensors, "shape_and_slices" should be non-empty strings
 *  and correspondingly well-formed.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * prefix: Must have a single element. The prefix of the V2 checkpoint to which we
 *  write the tensors.
 *  * tensor_names: shape {N}. The names of the tensors to be saved.
 *  * shape_and_slices: shape {N}.  The slice specs of the tensors to be saved.
 *  Empty strings indicate that they are non-partitioned tensors.
 *  * tensors: {@code N} tensors to save.
 * 
 *  Returns:
 *  * the created {@code Operation} */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class SaveV2 extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SaveV2(Pointer p) { super(p); }

  public SaveV2(@Const @ByRef Scope scope, @ByVal Input prefix,
         @ByVal Input tensor_names, @ByVal Input shape_and_slices,
         @ByVal InputList tensors) { super((Pointer)null); allocate(scope, prefix, tensor_names, shape_and_slices, tensors); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input prefix,
         @ByVal Input tensor_names, @ByVal Input shape_and_slices,
         @ByVal InputList tensors);
  public native @ByVal @Name("operator tensorflow::Operation") Operation asOperation();

  public native @ByRef Operation operation(); public native SaveV2 operation(Operation setter);
}
