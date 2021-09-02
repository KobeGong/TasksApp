package defpackage;

/* renamed from: dul reason: default package */
/* compiled from: PG */
final class dul implements java.lang.Runnable {
    private final /* synthetic */ defpackage.dpw a;
    private final /* synthetic */ int b;
    private final /* synthetic */ defpackage.dor c;
    private final /* synthetic */ defpackage.dug d;

    dul(defpackage.dug dug, defpackage.dpw dpw, int i, defpackage.dor dor) {
        this.d = dug;
        this.a = dpw;
        this.b = i;
        this.c = dor;
    }

    public final void run() {
        this.d.a.a(this.a, this.b, this.c);
    }
}
