package defpackage;

/* renamed from: dud reason: default package */
/* compiled from: PG */
final class dud implements java.lang.Runnable {
    private final /* synthetic */ defpackage.dpw a;
    private final /* synthetic */ defpackage.dtt b;

    dud(defpackage.dtt dtt, defpackage.dpw dpw) {
        this.b = dtt;
        this.a = dpw;
    }

    public final void run() {
        this.b.c.b(this.a);
    }
}
