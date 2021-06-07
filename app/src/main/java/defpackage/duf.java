package defpackage;

/* renamed from: duf  reason: default package */
/* compiled from: PG */
final class duf implements Runnable {
    private final /* synthetic */ int a;
    private final /* synthetic */ dtt b;

    duf(dtt dtt, int i) {
        this.b = dtt;
        this.a = i;
    }

    public final void run() {
        this.b.c.c(this.a);
    }
}
