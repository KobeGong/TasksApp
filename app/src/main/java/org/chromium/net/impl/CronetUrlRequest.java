package org.chromium.net.impl;

import java.nio.ByteBuffer;
import org.chromium.base.annotations.CalledByNative;

/* compiled from: PG */
public final class CronetUrlRequest extends dpt {
    private ekd a;

    private final native boolean nativeAddRequestHeader(long j, String str, String str2);

    private final native long nativeCreateRequestAdapter(long j, String str, int i, boolean z, boolean z2, boolean z3, boolean z4, int i2, boolean z5, int i3);

    private final native void nativeDestroy(long j, boolean z);

    private final native void nativeFollowDeferredRedirect(long j);

    private final native void nativeGetStatus(long j, VersionSafeCallbacks$UrlRequestStatusListener versionSafeCallbacks$UrlRequestStatusListener);

    private final native boolean nativeReadData(long j, ByteBuffer byteBuffer, int i, int i2);

    private final native boolean nativeSetHttpMethod(long j, String str);

    private final native void nativeStart(long j);

    @CalledByNative
    private final void onRedirectReceived(String str, int i, String str2, String[] strArr, boolean z, String str3, String str4, long j) {
        throw new NoSuchMethodError();
    }

    @CalledByNative
    private final void onResponseStarted(int i, String str, String[] strArr, boolean z, String str2, String str3, long j) {
        throw new NoSuchMethodError();
    }

    @CalledByNative
    private final void onReadCompleted(ByteBuffer byteBuffer, int i, int i2, int i3, long j) {
        ekq ekq = null;
        ekq.a(j);
        if (byteBuffer.position() == i2 && byteBuffer.limit() == i3) {
            if (this.a == null) {
                this.a = new ekd();
            }
            byteBuffer.position(i2 + i);
            throw new NoSuchMethodError();
        }
        new bkv("ByteBuffer modified externally during read", (byte) 0);
        throw new NoSuchMethodError();
    }

    @CalledByNative
    private final void onSucceeded(long j) {
        ekq ekq = null;
        ekq.a(j);
        new eka(this);
        throw new NoSuchMethodError();
    }

    @CalledByNative
    private final void onError(int i, int i2, int i3, String str, long j) {
        if (i == 10) {
            new ekp("Exception in CronetUrlRequest: " + str, i2, i3);
            throw new NoSuchMethodError();
        }
        throw new NoSuchMethodError();
    }

    @CalledByNative
    private final void onCanceled() {
        new ekb(this);
        throw new NoSuchMethodError();
    }

    @CalledByNative
    private final void onStatus(VersionSafeCallbacks$UrlRequestStatusListener versionSafeCallbacks$UrlRequestStatusListener, int i) {
        new ekc(versionSafeCallbacks$UrlRequestStatusListener, i);
        throw new NoSuchMethodError();
    }

    @CalledByNative
    private final void onMetricsCollected(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, boolean z, long j14, long j15) {
        throw null;
    }

    @CalledByNative
    private final void onNativeAdapterDestroyed() {
        throw null;
    }
}
