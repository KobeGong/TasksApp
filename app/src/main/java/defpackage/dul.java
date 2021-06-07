package defpackage;

/* renamed from: dul  reason: default package */
/* compiled from: PG */
final class dul implements Runnable {
    private final /* synthetic */ dpw a;
    private final /* synthetic */ int b;
    private final /* synthetic */ dor c;
    private final /* synthetic */ dug d;

    dul(dug dug, dpw dpw, int i, dor dor) {
        this.d = dug;
        this.a = dpw;
        this.b = i;
        this.c = dor;
    }

    public final void run() {
        this.d.a.a(this.a, this.b, this.c);
    }
}
