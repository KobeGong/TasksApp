package defpackage;

/* renamed from: dvv reason: default package */
/* compiled from: PG */
final class dvv implements java.lang.Runnable {
    private final /* synthetic */ defpackage.dth a;
    private final /* synthetic */ boolean b;
    private final /* synthetic */ defpackage.dvq c;

    dvv(defpackage.dvq dvq, defpackage.dth dth, boolean z) {
        this.c = dvq;
        this.a = dth;
        this.b = z;
    }

    public final void run() {
        this.c.p.a(this.a, this.b);
    }
}
