package defpackage;

/* renamed from: chy reason: default package */
/* compiled from: PG */
final class chy implements java.lang.Runnable {
    private final /* synthetic */ int a;
    private final /* synthetic */ defpackage.chx b;

    chy(defpackage.chx chx, int i) {
        this.b = chx;
        this.a = i;
    }

    public final void run() {
        defpackage.efx efx = new defpackage.efx();
        efx.p = new defpackage.eek();
        efx.p.a = this.a;
        this.b.a(efx);
    }
}
