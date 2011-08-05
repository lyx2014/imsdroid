/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.doubango.tinyWRAP;

public class MsrpSession extends InviteSession {
  private long swigCPtr;

  public MsrpSession(long cPtr, boolean cMemoryOwn) {
    super(tinyWRAPJNI.MsrpSession_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(MsrpSession obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        tinyWRAPJNI.delete_MsrpSession(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public MsrpSession(SipStack pStack, MsrpCallback pCallback) {
    this(tinyWRAPJNI.new_MsrpSession(SipStack.getCPtr(pStack), pStack, MsrpCallback.getCPtr(pCallback), pCallback), true);
  }

  public boolean setCallback(MsrpCallback pCallback) {
    return tinyWRAPJNI.MsrpSession_setCallback(swigCPtr, this, MsrpCallback.getCPtr(pCallback), pCallback);
  }

  public boolean callMsrp(String remoteUriString, ActionConfig config) {
    return tinyWRAPJNI.MsrpSession_callMsrp__SWIG_0(swigCPtr, this, remoteUriString, ActionConfig.getCPtr(config), config);
  }

  public boolean callMsrp(String remoteUriString) {
    return tinyWRAPJNI.MsrpSession_callMsrp__SWIG_1(swigCPtr, this, remoteUriString);
  }

  public boolean callMsrp(SipUri remoteUri, ActionConfig config) {
    return tinyWRAPJNI.MsrpSession_callMsrp__SWIG_2(swigCPtr, this, SipUri.getCPtr(remoteUri), remoteUri, ActionConfig.getCPtr(config), config);
  }

  public boolean callMsrp(SipUri remoteUri) {
    return tinyWRAPJNI.MsrpSession_callMsrp__SWIG_3(swigCPtr, this, SipUri.getCPtr(remoteUri), remoteUri);
  }

  public boolean sendMessage(java.nio.ByteBuffer payload, long len, ActionConfig config) {
    return tinyWRAPJNI.MsrpSession_sendMessage__SWIG_0(swigCPtr, this, payload, len, ActionConfig.getCPtr(config), config);
  }

  public boolean sendMessage(java.nio.ByteBuffer payload, long len) {
    return tinyWRAPJNI.MsrpSession_sendMessage__SWIG_1(swigCPtr, this, payload, len);
  }

  public boolean sendFile(ActionConfig config) {
    return tinyWRAPJNI.MsrpSession_sendFile__SWIG_0(swigCPtr, this, ActionConfig.getCPtr(config), config);
  }

  public boolean sendFile() {
    return tinyWRAPJNI.MsrpSession_sendFile__SWIG_1(swigCPtr, this);
  }

}
