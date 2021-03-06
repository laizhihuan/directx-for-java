package com.fourthskyinteractive.dx4j.dxgi.device;
import static org.bridj.Pointer.allocatePointer;

import org.bridj.Pointer;
import org.bridj.ValuedEnum;
import org.bridj.ann.Library;
import org.bridj.ann.Runtime;
import org.bridj.ann.Virtual;
import org.bridj.cpp.com.COMRuntime;
import org.bridj.cpp.com.IID;
import org.bridj.cpp.com.IUnknown;

import com.fourthskyinteractive.dx4j.dxgi.DXGI.DXGI_RESIDENCY;
import com.fourthskyinteractive.dx4j.dxgi.DXGIException;
import com.fourthskyinteractive.dx4j.dxgi.IDXGIObject;
import com.fourthskyinteractive.dx4j.dxgi.adapter.IDXGIAdapter;
/**
 * <i>native declaration : DXGI.h:2005</i><br>
 * Error: Conversion Error : uuid("aec22fb8-76f3-4639-9be0-28eb43a67a2e") novtable struct IDXGIObject {<br>
 * 	/// Original signature : <code>int SetPrivateData(const GUID&, UINT, const void*)</code><br>
 * 	virtual int SetPrivateData(const GUID& Name, UINT DataSize, const void* pData);<br>
 * 	/// Original signature : <code>int SetPrivateDataInterface(const GUID&, const IUnknown*)</code><br>
 * 	virtual int SetPrivateDataInterface(const GUID& Name, const IUnknown* pUnknown);<br>
 * 	/// Original signature : <code>int GetPrivateData(const GUID&, UINT*, void*)</code><br>
 * 	virtual int GetPrivateData(const GUID& Name, UINT* pDataSize, void* pData);<br>
 * 	/// Original signature : <code>int GetParent(const IID&, void**)</code><br>
 * 	virtual int GetParent(const IID& riid, void** ppParent);<br>
 * } (Cannot find parent IUnknown of struct uuid("aec22fb8-76f3-4639-9be0-28eb43a67a2e") novtable struct IDXGIObject {<br>
 * 	/// Original signature : <code>int SetPrivateData(const GUID&, UINT, const void*)</code><br>
 * 	virtual int SetPrivateData(const GUID& Name, UINT DataSize, const void* pData);<br>
 * 	/// Original signature : <code>int SetPrivateDataInterface(const GUID&, const IUnknown*)</code><br>
 * 	virtual int SetPrivateDataInterface(const GUID& Name, const IUnknown* pUnknown);<br>
 * 	/// Original signature : <code>int GetPrivateData(const GUID&, UINT*, void*)</code><br>
 * 	virtual int GetPrivateData(const GUID& Name, UINT* pDataSize, void* pData);<br>
 * 	/// Original signature : <code>int GetParent(const IID&, void**)</code><br>
 * 	virtual int GetParent(const IID& riid, void** ppParent);<br>
 * })<br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.free.fr/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@IID("54ec77fa-1377-44e6-8c32-88fd5f44c84c") 
@Library("dxgi") 
@Runtime(COMRuntime.class)
public class IDXGIDevice extends IDXGIObject {
	public IDXGIDevice() {
		super();
	}
//	public IDXGIDevice(Pointer pointer) {
//		super(pointer);
//	}
	@Deprecated @Virtual(0) 
	public native int GetAdapter(Pointer<Pointer<IDXGIAdapter > > pAdapter);
	@Virtual(1) 
	public native int CreateSurface(Pointer<DXGI_SURFACE_DESC > pDesc, int NumSurfaces, int Usage, Pointer<DXGI_SHARED_RESOURCE > pSharedResource, Pointer<Pointer<IDXGISurface > > ppSurface);
	@Virtual(2) 
	public native int QueryResourceResidency(Pointer<Pointer<IUnknown > > ppResources, Pointer<ValuedEnum<DXGI_RESIDENCY > > pResidencyStatus, int NumResources);
	@Virtual(3) 
	public native int SetGPUThreadPriority(int Priority);
	@Virtual(4) 
	public native int GetGPUThreadPriority(Pointer<Integer > pPriority);
	
	public IDXGIAdapter GetAdapter() throws DXGIException {
		Pointer<Pointer<IDXGIAdapter>> pp = allocatePointer(IDXGIAdapter.class);
		
		try {
			int result = this.GetAdapter(pp);
			if (result != 0) {
				throw new DXGIException(result);
			}
			
			return pp.get().getNativeObject(IDXGIAdapter.class);
		} finally {
			pp.release();
			pp = null;
		}
	}
}
