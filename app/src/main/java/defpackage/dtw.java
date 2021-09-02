package defpackage;

/* renamed from: dtw reason: default package */
/* compiled from: PG */
final class dtw implements java.lang.Runnable {
    private final /* synthetic */ boolean a;
    private final /* synthetic */ defpackage.dtt b;

    dtw(defpackage.dtt dtt, boolean z) {
        this.b = dtt;
        this.a = z;
    }

    public final void run() {
        this.b.c.a(this.a);
    }
}
