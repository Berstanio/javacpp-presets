module com.oracle.svm.shadowed.org.bytedeco.llvm {
  requires transitive  com.oracle.svm.shadowed.org.bytedeco.javacpp;
  exports com.oracle.svm.shadowed.org.bytedeco.llvm.global;
  exports com.oracle.svm.shadowed.org.bytedeco.llvm.presets;
  exports com.oracle.svm.shadowed.org.bytedeco.llvm.program;
  exports com.oracle.svm.shadowed.org.bytedeco.llvm.clang;
  exports com.oracle.svm.shadowed.org.bytedeco.llvm.LLVM;
}
