package defpackage;

/* renamed from: duk reason: default package */
/* compiled from: PG */
final class duk implements java.lang.Runnable {
    private final /* synthetic */ defpackage.dpw a;
    private final /* synthetic */ defpackage.dor b;
    private final /* synthetic */ defpackage.dug c;

    duk(defpackage.dug dug, defpackage.dpw dpw, defpackage.dor dor) {
        this.c = dug;
        this.a = dpw;
        this.b = dor;
    }

    public final void run() {
        this.c.a.b(this.a, this.b);
    }
}
