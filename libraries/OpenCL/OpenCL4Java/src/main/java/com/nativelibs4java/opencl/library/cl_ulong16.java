package com.nativelibs4java.opencl.library;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Union;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Union 
@Library("OpenCL") 
public class cl_ulong16 extends StructObject {
	public cl_ulong16() {
		super();
	}
	/// C type : cl_ulong[16]
	@Array({16}) 
	@Field(0) 
	public Pointer<Long > s() {
		return this.io.getPointerField(this, 0);
	}
	/// C type : field1_struct
	@Field(1) 
	public com.nativelibs4java.opencl.library.cl_char2.field1_struct field1() {
		return this.io.getNativeObjectField(this, 1);
	}
	/// C type : field1_struct
	@Field(1) 
	public cl_ulong16 field1(com.nativelibs4java.opencl.library.cl_char2.field1_struct field1) {
		this.io.setNativeObjectField(this, 1, field1);
		return this;
	}
	/// C type : field2_struct
	@Field(2) 
	public com.nativelibs4java.opencl.library.cl_char2.field2_struct field2() {
		return this.io.getNativeObjectField(this, 2);
	}
	/// C type : field2_struct
	@Field(2) 
	public cl_ulong16 field2(com.nativelibs4java.opencl.library.cl_char2.field2_struct field2) {
		this.io.setNativeObjectField(this, 2, field2);
		return this;
	}
	/// C type : field3_struct
	@Field(3) 
	public com.nativelibs4java.opencl.library.cl_char2.field3_struct field3() {
		return this.io.getNativeObjectField(this, 3);
	}
	/// C type : field3_struct
	@Field(3) 
	public cl_ulong16 field3(com.nativelibs4java.opencl.library.cl_char2.field3_struct field3) {
		this.io.setNativeObjectField(this, 3, field3);
		return this;
	}
	public static class field1_struct extends StructObject {
		public field1_struct() {
			super();
		}
		/// C type : cl_ulong
		@Field(0) 
		public long x() {
			return this.io.getLongField(this, 0);
		}
		/// C type : cl_ulong
		@Field(0) 
		public field1_struct x(long x) {
			this.io.setLongField(this, 0, x);
			return this;
		}
		/// C type : cl_ulong
		@Field(1) 
		public long y() {
			return this.io.getLongField(this, 1);
		}
		/// C type : cl_ulong
		@Field(1) 
		public field1_struct y(long y) {
			this.io.setLongField(this, 1, y);
			return this;
		}
		/// C type : cl_ulong
		@Field(2) 
		public long z() {
			return this.io.getLongField(this, 2);
		}
		/// C type : cl_ulong
		@Field(2) 
		public field1_struct z(long z) {
			this.io.setLongField(this, 2, z);
			return this;
		}
		/// C type : cl_ulong
		@Field(3) 
		public long w() {
			return this.io.getLongField(this, 3);
		}
		/// C type : cl_ulong
		@Field(3) 
		public field1_struct w(long w) {
			this.io.setLongField(this, 3, w);
			return this;
		}
		/// C type : cl_ulong
		@Field(4) 
		public long __spacer4() {
			return this.io.getLongField(this, 4);
		}
		/// C type : cl_ulong
		@Field(4) 
		public field1_struct __spacer4(long __spacer4) {
			this.io.setLongField(this, 4, __spacer4);
			return this;
		}
		/// C type : cl_ulong
		@Field(5) 
		public long __spacer5() {
			return this.io.getLongField(this, 5);
		}
		/// C type : cl_ulong
		@Field(5) 
		public field1_struct __spacer5(long __spacer5) {
			this.io.setLongField(this, 5, __spacer5);
			return this;
		}
		/// C type : cl_ulong
		@Field(6) 
		public long __spacer6() {
			return this.io.getLongField(this, 6);
		}
		/// C type : cl_ulong
		@Field(6) 
		public field1_struct __spacer6(long __spacer6) {
			this.io.setLongField(this, 6, __spacer6);
			return this;
		}
		/// C type : cl_ulong
		@Field(7) 
		public long __spacer7() {
			return this.io.getLongField(this, 7);
		}
		/// C type : cl_ulong
		@Field(7) 
		public field1_struct __spacer7(long __spacer7) {
			this.io.setLongField(this, 7, __spacer7);
			return this;
		}
		/// C type : cl_ulong
		@Field(8) 
		public long __spacer8() {
			return this.io.getLongField(this, 8);
		}
		/// C type : cl_ulong
		@Field(8) 
		public field1_struct __spacer8(long __spacer8) {
			this.io.setLongField(this, 8, __spacer8);
			return this;
		}
		/// C type : cl_ulong
		@Field(9) 
		public long __spacer9() {
			return this.io.getLongField(this, 9);
		}
		/// C type : cl_ulong
		@Field(9) 
		public field1_struct __spacer9(long __spacer9) {
			this.io.setLongField(this, 9, __spacer9);
			return this;
		}
		/// C type : cl_ulong
		@Field(10) 
		public long sa() {
			return this.io.getLongField(this, 10);
		}
		/// C type : cl_ulong
		@Field(10) 
		public field1_struct sa(long sa) {
			this.io.setLongField(this, 10, sa);
			return this;
		}
		/// C type : cl_ulong
		@Field(11) 
		public long sb() {
			return this.io.getLongField(this, 11);
		}
		/// C type : cl_ulong
		@Field(11) 
		public field1_struct sb(long sb) {
			this.io.setLongField(this, 11, sb);
			return this;
		}
		/// C type : cl_ulong
		@Field(12) 
		public long sc() {
			return this.io.getLongField(this, 12);
		}
		/// C type : cl_ulong
		@Field(12) 
		public field1_struct sc(long sc) {
			this.io.setLongField(this, 12, sc);
			return this;
		}
		/// C type : cl_ulong
		@Field(13) 
		public long sd() {
			return this.io.getLongField(this, 13);
		}
		/// C type : cl_ulong
		@Field(13) 
		public field1_struct sd(long sd) {
			this.io.setLongField(this, 13, sd);
			return this;
		}
		/// C type : cl_ulong
		@Field(14) 
		public long se() {
			return this.io.getLongField(this, 14);
		}
		/// C type : cl_ulong
		@Field(14) 
		public field1_struct se(long se) {
			this.io.setLongField(this, 14, se);
			return this;
		}
		/// C type : cl_ulong
		@Field(15) 
		public long sf() {
			return this.io.getLongField(this, 15);
		}
		/// C type : cl_ulong
		@Field(15) 
		public field1_struct sf(long sf) {
			this.io.setLongField(this, 15, sf);
			return this;
		}
		public field1_struct(Pointer pointer) {
			super(pointer);
		}
	};
	public static class field2_struct extends StructObject {
		public field2_struct() {
			super();
		}
		/// C type : cl_ulong
		@Field(0) 
		public long s0() {
			return this.io.getLongField(this, 0);
		}
		/// C type : cl_ulong
		@Field(0) 
		public field2_struct s0(long s0) {
			this.io.setLongField(this, 0, s0);
			return this;
		}
		/// C type : cl_ulong
		@Field(1) 
		public long s1() {
			return this.io.getLongField(this, 1);
		}
		/// C type : cl_ulong
		@Field(1) 
		public field2_struct s1(long s1) {
			this.io.setLongField(this, 1, s1);
			return this;
		}
		/// C type : cl_ulong
		@Field(2) 
		public long s2() {
			return this.io.getLongField(this, 2);
		}
		/// C type : cl_ulong
		@Field(2) 
		public field2_struct s2(long s2) {
			this.io.setLongField(this, 2, s2);
			return this;
		}
		/// C type : cl_ulong
		@Field(3) 
		public long s3() {
			return this.io.getLongField(this, 3);
		}
		/// C type : cl_ulong
		@Field(3) 
		public field2_struct s3(long s3) {
			this.io.setLongField(this, 3, s3);
			return this;
		}
		/// C type : cl_ulong
		@Field(4) 
		public long s4() {
			return this.io.getLongField(this, 4);
		}
		/// C type : cl_ulong
		@Field(4) 
		public field2_struct s4(long s4) {
			this.io.setLongField(this, 4, s4);
			return this;
		}
		/// C type : cl_ulong
		@Field(5) 
		public long s5() {
			return this.io.getLongField(this, 5);
		}
		/// C type : cl_ulong
		@Field(5) 
		public field2_struct s5(long s5) {
			this.io.setLongField(this, 5, s5);
			return this;
		}
		/// C type : cl_ulong
		@Field(6) 
		public long s6() {
			return this.io.getLongField(this, 6);
		}
		/// C type : cl_ulong
		@Field(6) 
		public field2_struct s6(long s6) {
			this.io.setLongField(this, 6, s6);
			return this;
		}
		/// C type : cl_ulong
		@Field(7) 
		public long s7() {
			return this.io.getLongField(this, 7);
		}
		/// C type : cl_ulong
		@Field(7) 
		public field2_struct s7(long s7) {
			this.io.setLongField(this, 7, s7);
			return this;
		}
		/// C type : cl_ulong
		@Field(8) 
		public long s8() {
			return this.io.getLongField(this, 8);
		}
		/// C type : cl_ulong
		@Field(8) 
		public field2_struct s8(long s8) {
			this.io.setLongField(this, 8, s8);
			return this;
		}
		/// C type : cl_ulong
		@Field(9) 
		public long s9() {
			return this.io.getLongField(this, 9);
		}
		/// C type : cl_ulong
		@Field(9) 
		public field2_struct s9(long s9) {
			this.io.setLongField(this, 9, s9);
			return this;
		}
		/// C type : cl_ulong
		@Field(10) 
		public long sA() {
			return this.io.getLongField(this, 10);
		}
		/// C type : cl_ulong
		@Field(10) 
		public field2_struct sA(long sA) {
			this.io.setLongField(this, 10, sA);
			return this;
		}
		/// C type : cl_ulong
		@Field(11) 
		public long sB() {
			return this.io.getLongField(this, 11);
		}
		/// C type : cl_ulong
		@Field(11) 
		public field2_struct sB(long sB) {
			this.io.setLongField(this, 11, sB);
			return this;
		}
		/// C type : cl_ulong
		@Field(12) 
		public long sC() {
			return this.io.getLongField(this, 12);
		}
		/// C type : cl_ulong
		@Field(12) 
		public field2_struct sC(long sC) {
			this.io.setLongField(this, 12, sC);
			return this;
		}
		/// C type : cl_ulong
		@Field(13) 
		public long sD() {
			return this.io.getLongField(this, 13);
		}
		/// C type : cl_ulong
		@Field(13) 
		public field2_struct sD(long sD) {
			this.io.setLongField(this, 13, sD);
			return this;
		}
		/// C type : cl_ulong
		@Field(14) 
		public long sE() {
			return this.io.getLongField(this, 14);
		}
		/// C type : cl_ulong
		@Field(14) 
		public field2_struct sE(long sE) {
			this.io.setLongField(this, 14, sE);
			return this;
		}
		/// C type : cl_ulong
		@Field(15) 
		public long sF() {
			return this.io.getLongField(this, 15);
		}
		/// C type : cl_ulong
		@Field(15) 
		public field2_struct sF(long sF) {
			this.io.setLongField(this, 15, sF);
			return this;
		}
		public field2_struct(Pointer pointer) {
			super(pointer);
		}
	};
	public static class field3_struct extends StructObject {
		public field3_struct() {
			super();
		}
		/// C type : cl_ulong8
		@Field(0) 
		public cl_ulong8 lo() {
			return this.io.getNativeObjectField(this, 0);
		}
		/// C type : cl_ulong8
		@Field(0) 
		public field3_struct lo(cl_ulong8 lo) {
			this.io.setNativeObjectField(this, 0, lo);
			return this;
		}
		/// C type : cl_ulong8
		@Field(1) 
		public cl_ulong8 hi() {
			return this.io.getNativeObjectField(this, 1);
		}
		/// C type : cl_ulong8
		@Field(1) 
		public field3_struct hi(cl_ulong8 hi) {
			this.io.setNativeObjectField(this, 1, hi);
			return this;
		}
		public field3_struct(Pointer pointer) {
			super(pointer);
		}
	};
	public cl_ulong16(Pointer pointer) {
		super(pointer);
	}
}