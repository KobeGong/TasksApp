package defpackage;

/* renamed from: dty  reason: default package */
/* compiled from: PG */
final class dty implements Runnable {
    private final /* synthetic */ int a;
    private final /* synthetic */ dtt b;

    dty(dtt dtt, int i) {
        this.b = dtt;
        this.a = i;
    }

    public final void run() {
        this.b.c.a(this.a);
    }
}
