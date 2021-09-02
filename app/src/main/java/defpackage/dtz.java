package defpackage;

/* renamed from: dtz reason: default package */
/* compiled from: PG */
final class dtz implements java.lang.Runnable {
    private final /* synthetic */ java.lang.String a;
    private final /* synthetic */ defpackage.dtt b;

    dtz(defpackage.dtt dtt, java.lang.String str) {
        this.b = dtt;
        this.a = str;
    }

    public final void run() {
        this.b.c.a(this.a);
    }
}
