package org.chromium.base.metrics;

import org.chromium.base.annotations.CalledByNative;

/* compiled from: PG */
public class RecordUserAction {

    /* compiled from: PG */
    public interface UserActionCallback {
        @CalledByNative
        void onActionRecorded(String str);
    }

    private static native long nativeAddActionCallbackForTesting(UserActionCallback userActionCallback);

    private static native void nativeRecordUserAction(String str);

    private static native void nativeRemoveActionCallbackForTesting(long j);
}
