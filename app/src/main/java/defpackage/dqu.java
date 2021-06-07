package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: dqu  reason: default package */
/* compiled from: PG */
public final class dqu implements Runnable {
    private final /* synthetic */ dpw a;
    private final /* synthetic */ int b;
    private final /* synthetic */ dor c;
    private final /* synthetic */ dri d;

    dqu(dri dri, dpw dpw, int i, dor dor) {
        this.d = dri;
        this.a = dpw;
        this.b = i;
        this.c = dor;
    }

    public final void run() {
        this.d.a(this.a, this.b, this.c);
    }
}
