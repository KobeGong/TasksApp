package defpackage;

/* renamed from: bbi reason: default package */
/* compiled from: PG */
public final class bbi extends defpackage.bke implements defpackage.ayr, defpackage.ays {
    private static defpackage.ayf h = defpackage.bpp.a;
    public final android.content.Context a;
    public final android.os.Handler b;
    public final defpackage.ayf c;
    public java.util.Set d;
    public defpackage.bdj e;
    public defpackage.bps f;
    public defpackage.bbl g;

    public bbi(android.content.Context context, android.os.Handler handler, defpackage.bdj bdj) {
        this(context, handler, bdj, h);
    }

    private bbi(android.content.Context context, android.os.Handler handler, defpackage.bdj bdj, defpackage.ayf ayf) {
        super(0);
        this.a = context;
        this.b = handler;
        this.e = (defpackage.bdj) defpackage.azb.b((java.lang.Object) bdj, (java.lang.Object) "ClientSettings must not be null");
        this.d = bdj.b;
        this.c = ayf;
    }

    public final void a(android.os.Bundle bundle) {
        this.f.a(this);
    }

    public final void a(int i) {
        this.f.e();
    }

    public final void a(defpackage.axq axq) {
        this.g.b(axq);
    }

    public final void a(defpackage.bkk bkk) {
        this.b.post(new defpackage.bbk(this, bkk));
    }

    static /* synthetic */ void a(defpackage.bbi bbi, defpackage.bkk bkk) {
        defpackage.axq axq = bkk.a;
        if (axq.b()) {
            defpackage.bed bed = bkk.b;
            defpackage.axq axq2 = bed.a;
            if (!axq2.b()) {
                java.lang.String valueOf = java.lang.String.valueOf(axq2);
                android.util.Log.wtf("SignInCoordinator", new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 48).append("Sign-in succeeded with resolve account failure: ").append(valueOf).toString(), new java.lang.Exception());
                bbi.g.b(axq2);
            } else {
                defpackage.bbl bbl = bbi.g;
                defpackage.bdp a2 = bed.a();
                java.util.Set set = bbi.d;
                if (a2 == null || set == null) {
                    android.util.Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new java.lang.Exception());
                    bbl.b(new defpackage.axq(4));
                } else {
                    bbl.c = a2;
                    bbl.d = set;
                    bbl.a();
                }
            }
        } else {
            bbi.g.b(axq);
        }
        bbi.f.e();
    }
}
