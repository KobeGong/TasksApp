package defpackage;

/* renamed from: dqu reason: default package */
/* compiled from: PG */
final class dqu implements java.lang.Runnable {
    private final /* synthetic */ defpackage.dpw a;
    private final /* synthetic */ int b;
    private final /* synthetic */ defpackage.dor c;
    private final /* synthetic */ defpackage.dri d;

    dqu(defpackage.dri dri, defpackage.dpw dpw, int i, defpackage.dor dor) {
        this.d = dri;
        this.a = dpw;
        this.b = i;
        this.c = dor;
    }

    public final void run() {
        this.d.a(this.a, this.b, this.c);
    }
}
