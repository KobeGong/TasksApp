package org.chromium.base;

/* compiled from: PG */
public class FieldTrialList {
    private FieldTrialList() {
    }

    private static native java.lang.String nativeFindFullName(java.lang.String str);

    private static native java.lang.String nativeGetVariationParameter(java.lang.String str, java.lang.String str2);

    private static native boolean nativeTrialExists(java.lang.String str);
}
