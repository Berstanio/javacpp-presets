// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.bytedeco.liquidfun;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.liquidfun.global.liquidfun.*;


/** Profiling data. Times are in milliseconds. */
@Properties(inherit = org.bytedeco.liquidfun.presets.liquidfun.class)
public class b2Profile extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public b2Profile() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b2Profile(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b2Profile(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public b2Profile position(long position) {
        return (b2Profile)super.position(position);
    }
    @Override public b2Profile getPointer(long i) {
        return new b2Profile((Pointer)this).offsetAddress(i);
    }

	public native @Cast("float32") float step(); public native b2Profile step(float setter);
	public native @Cast("float32") float collide(); public native b2Profile collide(float setter);
	public native @Cast("float32") float solve(); public native b2Profile solve(float setter);
	public native @Cast("float32") float solveInit(); public native b2Profile solveInit(float setter);
	public native @Cast("float32") float solveVelocity(); public native b2Profile solveVelocity(float setter);
	public native @Cast("float32") float solvePosition(); public native b2Profile solvePosition(float setter);
	public native @Cast("float32") float broadphase(); public native b2Profile broadphase(float setter);
	public native @Cast("float32") float solveTOI(); public native b2Profile solveTOI(float setter);
}
