package org.chromium.base.metrics;

/* compiled from: PG */
public class RecordUserAction {

    /* compiled from: PG */
    public interface UserActionCallback {
        @org.chromium.base.annotations.CalledByNative
        void onActionRecorded(java.lang.String str);
    }

    private static native long nativeAddActionCallbackForTesting(org.chromium.base.metrics.RecordUserAction.UserActionCallback userActionCallback);

    private static native void nativeRecordUserAction(java.lang.String str);

    private static native void nativeRemoveActionCallbackForTesting(long j);
}
