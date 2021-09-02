package defpackage;

/* renamed from: drs reason: default package */
/* compiled from: PG */
final class drs implements defpackage.dpd {
    drs() {
    }

    private static byte[] b(java.io.InputStream inputStream) {
        try {
            return c(inputStream);
        } catch (java.io.IOException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    private static byte[] c(java.io.InputStream inputStream) {
        try {
            return defpackage.dtj.a(inputStream);
        } finally {
            inputStream.close();
        }
    }

    public final /* synthetic */ java.lang.Object a(java.io.InputStream inputStream) {
        return b(inputStream);
    }

    public final /* synthetic */ java.io.InputStream a(java.lang.Object obj) {
        return new java.io.ByteArrayInputStream((byte[]) obj);
    }
}
