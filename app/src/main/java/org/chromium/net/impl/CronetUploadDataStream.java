package org.chromium.net.impl;

import java.nio.ByteBuffer;
import org.chromium.base.annotations.CalledByNative;

/* compiled from: PG */
public final class CronetUploadDataStream extends ehw {
    private final native long nativeAttachUploadDataToRequest(long j, long j2);

    private final native long nativeCreateAdapterForTesting();

    private final native long nativeCreateUploadDataStreamForTesting(long j, long j2);

    private static native void nativeDestroy(long j);

    private final native void nativeOnReadSucceeded(long j, int i, boolean z);

    private final native void nativeOnRewindSucceeded(long j);

    /* access modifiers changed from: package-private */
    @CalledByNative
    public final void readData(ByteBuffer byteBuffer) {
        byteBuffer.limit();
        throw new NoSuchMethodError();
    }

    /* access modifiers changed from: package-private */
    @CalledByNative
    public final void rewind() {
        new ejz(this);
        throw new NoSuchMethodError();
    }

    /* access modifiers changed from: package-private */
    @CalledByNative
    public final void onUploadDataStreamDestroyed() {
        throw new NoSuchMethodError();
    }

    static {
        CronetUploadDataStream.class.getSimpleName();
    }
}
