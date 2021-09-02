package defpackage;

/* renamed from: chs reason: default package */
/* compiled from: PG */
public final class chs {
    private static final java.nio.charset.Charset a = java.nio.charset.Charset.forName("UTF-8");

    public static java.lang.Long a(java.lang.String str) {
        if (str == null || str.trim().isEmpty()) {
            return null;
        }
        try {
            java.security.MessageDigest instance = java.security.MessageDigest.getInstance("MD5");
            instance.update(str.getBytes(a));
            return java.lang.Long.valueOf(java.nio.ByteBuffer.wrap(instance.digest()).getLong());
        } catch (java.security.NoSuchAlgorithmException e) {
            throw new java.lang.RuntimeException(e);
        }
    }
}
