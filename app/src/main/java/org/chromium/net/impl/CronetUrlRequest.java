package org.chromium.net.impl;

/* compiled from: PG */
public final class CronetUrlRequest extends defpackage.dpt {
    private defpackage.ekd a;

    private final native boolean nativeAddRequestHeader(long j, java.lang.String str, java.lang.String str2);

    private final native long nativeCreateRequestAdapter(long j, java.lang.String str, int i, boolean z, boolean z2, boolean z3, boolean z4, int i2, boolean z5, int i3);

    private final native void nativeDestroy(long j, boolean z);

    private final native void nativeFollowDeferredRedirect(long j);

    private final native void nativeGetStatus(long j, org.chromium.net.impl.VersionSafeCallbacks$UrlRequestStatusListener versionSafeCallbacks$UrlRequestStatusListener);

    private final native boolean nativeReadData(long j, java.nio.ByteBuffer byteBuffer, int i, int i2);

    private final native boolean nativeSetHttpMethod(long j, java.lang.String str);

    private final native void nativeStart(long j);

    @org.chromium.base.annotations.CalledByNative
    private final void onRedirectReceived(java.lang.String str, int i, java.lang.String str2, java.lang.String[] strArr, boolean z, java.lang.String str3, java.lang.String str4, long j) {
        throw new java.lang.NoSuchMethodError();
    }

    @org.chromium.base.annotations.CalledByNative
    private final void onResponseStarted(int i, java.lang.String str, java.lang.String[] strArr, boolean z, java.lang.String str2, java.lang.String str3, long j) {
        throw new java.lang.NoSuchMethodError();
    }

    @org.chromium.base.annotations.CalledByNative
    private final void onReadCompleted(java.nio.ByteBuffer byteBuffer, int i, int i2, int i3, long j) {
        defpackage.ekq ekq = null;
        ekq.a(j);
        if (byteBuffer.position() == i2 && byteBuffer.limit() == i3) {
            if (this.a == null) {
                this.a = new defpackage.ekd();
            }
            byteBuffer.position(i2 + i);
            throw new java.lang.NoSuchMethodError();
        }
        new defpackage.bkv("ByteBuffer modified externally during read", 0);
        throw new java.lang.NoSuchMethodError();
    }

    @org.chromium.base.annotations.CalledByNative
    private final void onSucceeded(long j) {
        defpackage.ekq ekq = null;
        ekq.a(j);
        new defpackage.eka(this);
        throw new java.lang.NoSuchMethodError();
    }

    @org.chromium.base.annotations.CalledByNative
    private final void onError(int i, int i2, int i3, java.lang.String str, long j) {
        if (i == 10) {
            new defpackage.ekp("Exception in CronetUrlRequest: " + str, i2, i3);
            throw new java.lang.NoSuchMethodError();
        }
        throw new java.lang.NoSuchMethodError();
    }

    @org.chromium.base.annotations.CalledByNative
    private final void onCanceled() {
        new defpackage.ekb(this);
        throw new java.lang.NoSuchMethodError();
    }

    @org.chromium.base.annotations.CalledByNative
    private final void onStatus(org.chromium.net.impl.VersionSafeCallbacks$UrlRequestStatusListener versionSafeCallbacks$UrlRequestStatusListener, int i) {
        new defpackage.ekc(versionSafeCallbacks$UrlRequestStatusListener, i);
        throw new java.lang.NoSuchMethodError();
    }

    @org.chromium.base.annotations.CalledByNative
    private final void onMetricsCollected(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, boolean z, long j14, long j15) {
        throw null;
    }

    @org.chromium.base.annotations.CalledByNative
    private final void onNativeAdapterDestroyed() {
        throw null;
    }
}
