package defpackage;

/* renamed from: dtu  reason: default package */
/* compiled from: PG */
final class dtu implements Runnable {
    private final /* synthetic */ int a;
    private final /* synthetic */ dtt b;

    dtu(dtt dtt, int i) {
        this.b = dtt;
        this.a = i;
    }

    public final void run() {
        this.b.c.b(this.a);
    }
}
