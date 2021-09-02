package defpackage;

/* renamed from: dnn reason: default package */
/* compiled from: PG */
public final class dnn implements defpackage.doa {
    public final java.lang.String a() {
        return "gzip";
    }

    public final java.io.OutputStream a(java.io.OutputStream outputStream) {
        return new java.util.zip.GZIPOutputStream(outputStream);
    }

    public final java.io.InputStream a(java.io.InputStream inputStream) {
        return new java.util.zip.GZIPInputStream(inputStream);
    }
}
