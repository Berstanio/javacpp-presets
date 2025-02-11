// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow_dataset;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;
import org.bytedeco.parquet.*;
import static org.bytedeco.arrow.global.parquet.*;

import static org.bytedeco.arrow.global.arrow_dataset.*;


/** \brief Either a Partitioning or a PartitioningFactory */
@Namespace("arrow::dataset") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow_dataset.class)
public class PartitioningOrFactory extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PartitioningOrFactory(Pointer p) { super(p); }

  public PartitioningOrFactory(@SharedPtr Partitioning partitioning) { super((Pointer)null); allocate(partitioning); }
  private native void allocate(@SharedPtr Partitioning partitioning);

  public PartitioningOrFactory(@SharedPtr PartitioningFactory factory) { super((Pointer)null); allocate(factory); }
  private native void allocate(@SharedPtr PartitioningFactory factory);

  public native @ByRef @Name("operator =") PartitioningOrFactory put(@SharedPtr Partitioning partitioning);

  public native @ByRef @Name("operator =") PartitioningOrFactory put(@SharedPtr PartitioningFactory factory);

  /** \brief The partitioning (if given). */
  public native @SharedPtr Partitioning partitioning();

  /** \brief The partition factory (if given). */
  public native @SharedPtr PartitioningFactory factory();

  /** \brief Get the partition schema, inferring it with the given factory if needed. */
  public native @ByVal SchemaResult GetOrInferSchema(@Const @ByRef StringVector paths);
}
