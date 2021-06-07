package defpackage;

/* renamed from: dvv  reason: default package */
/* compiled from: PG */
final class dvv implements Runnable {
    private final /* synthetic */ dth a;
    private final /* synthetic */ boolean b;
    private final /* synthetic */ dvq c;

    dvv(dvq dvq, dth dth, boolean z) {
        this.c = dvq;
        this.a = dth;
        this.b = z;
    }

    public final void run() {
        this.c.p.a(this.a, this.b);
    }
}
