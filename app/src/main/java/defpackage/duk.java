package defpackage;

/* renamed from: duk  reason: default package */
/* compiled from: PG */
final class duk implements Runnable {
    private final /* synthetic */ dpw a;
    private final /* synthetic */ dor b;
    private final /* synthetic */ dug c;

    duk(dug dug, dpw dpw, dor dor) {
        this.c = dug;
        this.a = dpw;
        this.b = dor;
    }

    public final void run() {
        this.c.a.b(this.a, this.b);
    }
}
