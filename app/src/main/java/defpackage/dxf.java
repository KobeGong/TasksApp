package defpackage;

/* renamed from: dxf reason: default package */
/* compiled from: PG */
final class dxf implements defpackage.dzr {
    private java.io.InputStream a;

    dxf(java.io.InputStream inputStream) {
        this.a = inputStream;
    }

    public final java.io.InputStream a() {
        java.io.InputStream inputStream = this.a;
        this.a = null;
        return inputStream;
    }
}
