package defpackage;

/* renamed from: dtu reason: default package */
/* compiled from: PG */
final class dtu implements java.lang.Runnable {
    private final /* synthetic */ int a;
    private final /* synthetic */ defpackage.dtt b;

    dtu(defpackage.dtt dtt, int i) {
        this.b = dtt;
        this.a = i;
    }

    public final void run() {
        this.b.c.b(this.a);
    }
}
