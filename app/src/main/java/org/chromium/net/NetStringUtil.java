package org.chromium.net;

/* compiled from: PG */
public class NetStringUtil {
    @org.chromium.base.annotations.CalledByNative
    private static java.lang.String convertToUnicode(java.nio.ByteBuffer byteBuffer, java.lang.String str) {
        try {
            return java.nio.charset.Charset.forName(str).newDecoder().decode(byteBuffer).toString();
        } catch (java.lang.Exception e) {
            return null;
        }
    }

    @org.chromium.base.annotations.CalledByNative
    private static java.lang.String convertToUnicodeAndNormalize(java.nio.ByteBuffer byteBuffer, java.lang.String str) {
        java.lang.String convertToUnicode = convertToUnicode(byteBuffer, str);
        if (convertToUnicode == null) {
            return null;
        }
        return java.text.Normalizer.normalize(convertToUnicode, java.text.Normalizer.Form.NFC);
    }

    @org.chromium.base.annotations.CalledByNative
    private static java.lang.String convertToUnicodeWithSubstitutions(java.nio.ByteBuffer byteBuffer, java.lang.String str) {
        try {
            java.nio.charset.CharsetDecoder newDecoder = java.nio.charset.Charset.forName(str).newDecoder();
            newDecoder.onMalformedInput(java.nio.charset.CodingErrorAction.REPLACE);
            newDecoder.onUnmappableCharacter(java.nio.charset.CodingErrorAction.REPLACE);
            newDecoder.replaceWith("�");
            return newDecoder.decode(byteBuffer).toString();
        } catch (java.lang.Exception e) {
            return null;
        }
    }

    @org.chromium.base.annotations.CalledByNative
    private static java.lang.String toUpperCase(java.lang.String str) {
        try {
            return str.toUpperCase(java.util.Locale.getDefault());
        } catch (java.lang.Exception e) {
            return null;
        }
    }
}
