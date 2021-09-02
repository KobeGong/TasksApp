package defpackage;

/* renamed from: cbf reason: default package */
/* compiled from: PG */
public final class cbf implements defpackage.caf {
    public defpackage.byu a;
    public defpackage.bup b;

    cbf() {
    }

    public final void a(java.lang.String str) {
        defpackage.bty.b("FetchUpdatedThreadsCallback", "Fetched updated threads for account: %s (FAILURE)", str);
    }

    public final void a(java.lang.String str, defpackage.djo djo) {
        defpackage.den den = (defpackage.den) djo;
        defpackage.bty.a("FetchUpdatedThreadsCallback", "Fetched updated threads for account: %s [%d threads](SUCCESS)", str, java.lang.Integer.valueOf(den.b.size()));
        try {
            defpackage.bul a2 = this.b.a(str);
            if (den.c > a2.d().longValue()) {
                a2 = a2.i().a(java.lang.Long.valueOf(den.c)).a();
                this.b.b(a2);
            }
            if (den.b.size() > 0) {
                this.a.a(a2, den.b, defpackage.bvo.c());
            }
        } catch (defpackage.buo e) {
            defpackage.bty.b("FetchUpdatedThreadsCallback", e, "Account not found in scheduled callback.", new java.lang.Object[0]);
        }
    }
}
