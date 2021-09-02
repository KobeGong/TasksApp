package org.chromium.url;

/* compiled from: PG */
public class IDNStringUtil {
    @org.chromium.base.annotations.CalledByNative
    private static java.lang.String idnToASCII(java.lang.String str) {
        try {
            return java.net.IDN.toASCII(str, 2);
        } catch (java.lang.Exception e) {
            return null;
        }
    }
}
