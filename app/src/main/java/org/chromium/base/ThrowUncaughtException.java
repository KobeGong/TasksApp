package org.chromium.base;

import org.chromium.base.annotations.CalledByNative;

/* compiled from: PG */
class ThrowUncaughtException {
    ThrowUncaughtException() {
    }

    @CalledByNative
    private static void post() {
        ThreadUtils.a().post(new ehe());
    }
}
