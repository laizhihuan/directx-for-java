package com.fourthskyinteractive.dx4j.d2d1.resources.geometry;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.free.fr/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("d2d1") 
public class D2D_RECT_F extends StructObject {
	public D2D_RECT_F() {
		super();
	}
	public D2D_RECT_F(Pointer pointer) {
		super(pointer);
	}
	@Field(0) 
	public float left() {
		return this.io.getFloatField(this, 0);
	}
	@Field(0) 
	public D2D_RECT_F left(float left) {
		this.io.setFloatField(this, 0, left);
		return this;
	}
	@Field(1) 
	public float top() {
		return this.io.getFloatField(this, 1);
	}
	@Field(1) 
	public D2D_RECT_F top(float top) {
		this.io.setFloatField(this, 1, top);
		return this;
	}
	@Field(2) 
	public float right() {
		return this.io.getFloatField(this, 2);
	}
	@Field(2) 
	public D2D_RECT_F right(float right) {
		this.io.setFloatField(this, 2, right);
		return this;
	}
	@Field(3) 
	public float bottom() {
		return this.io.getFloatField(this, 3);
	}
	@Field(3) 
	public D2D_RECT_F bottom(float bottom) {
		this.io.setFloatField(this, 3, bottom);
		return this;
	}
}