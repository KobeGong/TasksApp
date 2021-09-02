package defpackage;

/* renamed from: dub reason: default package */
/* compiled from: PG */
final class dub implements java.lang.Runnable {
    private final /* synthetic */ java.io.InputStream a;
    private final /* synthetic */ defpackage.dtt b;

    dub(defpackage.dtt dtt, java.io.InputStream inputStream) {
        this.b = dtt;
        this.a = inputStream;
    }

    public final void run() {
        this.b.c.a(this.a);
    }
}
