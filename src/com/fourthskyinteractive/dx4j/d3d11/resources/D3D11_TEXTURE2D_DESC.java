package com.fourthskyinteractive.dx4j.d3d11.resources;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ValuedEnum;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

import com.fourthskyinteractive.dx4j.d3d11.D3D11.D3D11_BIND_FLAG;
import com.fourthskyinteractive.dx4j.d3d11.D3D11.D3D11_CPU_ACCESS_FLAG;
import com.fourthskyinteractive.dx4j.d3d11.D3D11.D3D11_RESOURCE_MISC_FLAG;
import com.fourthskyinteractive.dx4j.d3d11.D3D11.D3D11_USAGE;
import com.fourthskyinteractive.dx4j.dxgi.DXGI.DXGI_FORMAT;
import com.fourthskyinteractive.dx4j.dxgi.DXGI_SAMPLE_DESC;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.free.fr/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("d3d11") 
public class D3D11_TEXTURE2D_DESC extends StructObject {
	public D3D11_TEXTURE2D_DESC() {
		super();
	}
	public D3D11_TEXTURE2D_DESC(Pointer pointer) {
		super(pointer);
	}
	@Field(0) 
	public int Width() {
		return this.io.getIntField(this, 0);
	}
	@Field(0) 
	public D3D11_TEXTURE2D_DESC Width(int Width) {
		this.io.setIntField(this, 0, Width);
		return this;
	}
	@Field(1) 
	public int Height() {
		return this.io.getIntField(this, 1);
	}
	@Field(1) 
	public D3D11_TEXTURE2D_DESC Height(int Height) {
		this.io.setIntField(this, 1, Height);
		return this;
	}
	@Field(2) 
	public int MipLevels() {
		return this.io.getIntField(this, 2);
	}
	@Field(2) 
	public D3D11_TEXTURE2D_DESC MipLevels(int MipLevels) {
		this.io.setIntField(this, 2, MipLevels);
		return this;
	}
	@Field(3) 
	public int ArraySize() {
		return this.io.getIntField(this, 3);
	}
	@Field(3) 
	public D3D11_TEXTURE2D_DESC ArraySize(int ArraySize) {
		this.io.setIntField(this, 3, ArraySize);
		return this;
	}
	/// C type : DXGI_FORMAT
	@Field(4) 
	public ValuedEnum<DXGI_FORMAT> Format() {
		return this.io.getEnumField(this, 4);
	}
	/// C type : DXGI_FORMAT
	@Field(4) 
	public D3D11_TEXTURE2D_DESC Format(ValuedEnum<DXGI_FORMAT> Format) {
		this.io.setEnumField(this, 4, Format);
		return this;
	}
	/// C type : DXGI_SAMPLE_DESC
	@Field(5) 
	public DXGI_SAMPLE_DESC SampleDesc() {
		return this.io.getNativeObjectField(this, 5);
	}
	/// C type : D3D11_USAGE
	@Field(6) 
	public ValuedEnum<D3D11_USAGE> Usage() {
		return this.io.getEnumField(this, 6);
	}
	/// C type : D3D11_USAGE
	@Field(6) 
	public D3D11_TEXTURE2D_DESC Usage(ValuedEnum<D3D11_USAGE > Usage) {
		this.io.setEnumField(this, 6, Usage);
		return this;
	}
	@Field(7) 
	public ValuedEnum<D3D11_BIND_FLAG> BindFlags() {
		return this.io.getEnumField(this, 7);
	}
	@Field(7) 
	public D3D11_TEXTURE2D_DESC BindFlags(ValuedEnum<D3D11_BIND_FLAG> BindFlags) {
		this.io.setEnumField(this, 7, BindFlags);
		return this;
	}
	@Field(8) 
	public ValuedEnum<D3D11_CPU_ACCESS_FLAG> CPUAccessFlags() {
		return this.io.getEnumField(this, 8);
	}
	@Field(8) 
	public D3D11_TEXTURE2D_DESC CPUAccessFlags(ValuedEnum<D3D11_CPU_ACCESS_FLAG> CPUAccessFlags) {
		this.io.setEnumField(this, 8, CPUAccessFlags);
		return this;
	}
	@Field(9) 
	public ValuedEnum<D3D11_RESOURCE_MISC_FLAG> MiscFlags() {
		return this.io.getEnumField(this, 9);
	}
	@Field(9) 
	public D3D11_TEXTURE2D_DESC MiscFlags(ValuedEnum<D3D11_RESOURCE_MISC_FLAG> MiscFlags) {
		this.io.setEnumField(this, 9, MiscFlags);
		return this;
	}
}
