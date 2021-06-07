package org.chromium.url;

import java.net.IDN;
import org.chromium.base.annotations.CalledByNative;

/* compiled from: PG */
public class IDNStringUtil {
    @CalledByNative
    private static String idnToASCII(String str) {
        try {
            return IDN.toASCII(str, 2);
        } catch (Exception e) {
            return null;
        }
    }
}
