package defpackage;

/* renamed from: clw reason: default package */
/* compiled from: PG */
final class clw implements java.lang.Runnable {
    private final /* synthetic */ java.lang.String a;
    private final /* synthetic */ boolean b = true;
    private final /* synthetic */ defpackage.efx c;
    private final /* synthetic */ defpackage.eeo d;
    private final /* synthetic */ defpackage.clv e;

    clw(defpackage.clv clv, java.lang.String str, defpackage.efx efx) {
        this.e = clv;
        this.a = str;
        this.c = efx;
        this.d = null;
    }

    public final void run() {
        defpackage.cky cky = this.e.d;
        this.e.a(this.a, this.b, this.c, null);
    }
}
