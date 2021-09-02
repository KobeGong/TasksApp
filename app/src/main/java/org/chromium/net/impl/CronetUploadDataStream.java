package org.chromium.net.impl;

/* compiled from: PG */
public final class CronetUploadDataStream extends defpackage.ehw {
    private final native long nativeAttachUploadDataToRequest(long j, long j2);

    private final native long nativeCreateAdapterForTesting();

    private final native long nativeCreateUploadDataStreamForTesting(long j, long j2);

    private static native void nativeDestroy(long j);

    private final native void nativeOnReadSucceeded(long j, int i, boolean z);

    private final native void nativeOnRewindSucceeded(long j);

    /* access modifiers changed from: 0000 */
    @org.chromium.base.annotations.CalledByNative
    public final void readData(java.nio.ByteBuffer byteBuffer) {
        byteBuffer.limit();
        throw new java.lang.NoSuchMethodError();
    }

    /* access modifiers changed from: 0000 */
    @org.chromium.base.annotations.CalledByNative
    public final void rewind() {
        new defpackage.ejz(this);
        throw new java.lang.NoSuchMethodError();
    }

    /* access modifiers changed from: 0000 */
    @org.chromium.base.annotations.CalledByNative
    public final void onUploadDataStreamDestroyed() {
        throw new java.lang.NoSuchMethodError();
    }

    static {
        org.chromium.net.impl.CronetUploadDataStream.class.getSimpleName();
    }
}
