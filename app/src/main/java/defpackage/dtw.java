package defpackage;

/* renamed from: dtw  reason: default package */
/* compiled from: PG */
final class dtw implements Runnable {
    private final /* synthetic */ boolean a;
    private final /* synthetic */ dtt b;

    dtw(dtt dtt, boolean z) {
        this.b = dtt;
        this.a = z;
    }

    public final void run() {
        this.b.c.a(this.a);
    }
}
