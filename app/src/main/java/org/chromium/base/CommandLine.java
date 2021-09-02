package org.chromium.base;

/* compiled from: PG */
public abstract class CommandLine {
    private static final java.util.concurrent.atomic.AtomicReference a = new java.util.concurrent.atomic.AtomicReference();

    public static org.chromium.base.CommandLine c() {
        return (org.chromium.base.CommandLine) a.get();
    }

    private static native void nativeAppendSwitch(java.lang.String str);

    private static native void nativeAppendSwitchWithValue(java.lang.String str, java.lang.String str2);

    private static native void nativeAppendSwitchesAndArguments(java.lang.String[] strArr);

    private static native java.lang.String nativeGetSwitchValue(java.lang.String str);

    private static native boolean nativeHasSwitch(java.lang.String str);

    private static native void nativeInit(java.lang.String[] strArr);

    public abstract boolean a();

    public abstract java.lang.String b();

    private CommandLine() {
    }
}
