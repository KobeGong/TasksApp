package org.chromium.base;

/* compiled from: PG */
public class CpuFeatures {
    private static native int nativeGetCoreCount();

    private static native long nativeGetCpuFeatures();
}
