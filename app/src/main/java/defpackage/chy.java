package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: chy  reason: default package */
/* compiled from: PG */
public final class chy implements Runnable {
    private final /* synthetic */ int a;
    private final /* synthetic */ chx b;

    chy(chx chx, int i) {
        this.b = chx;
        this.a = i;
    }

    public final void run() {
        efx efx = new efx();
        efx.p = new eek();
        efx.p.a = this.a;
        this.b.a(efx);
    }
}
