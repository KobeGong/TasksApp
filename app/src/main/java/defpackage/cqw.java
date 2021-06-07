package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: cqw  reason: default package */
public final /* synthetic */ class cqw implements Runnable {
    private final cqv a;
    private final cyi b;

    cqw(cqv cqv, cyi cyi) {
        this.a = cqv;
        this.b = cyi;
    }

    public final void run() {
        this.a.b.set(cqv.a(this.b));
    }
}
