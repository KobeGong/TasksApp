package defpackage;

/* renamed from: cbf  reason: default package */
/* compiled from: PG */
public final class cbf implements caf {
    public byu a;
    public bup b;

    cbf() {
    }

    @Override // defpackage.caf
    public final void a(String str) {
        bty.b("FetchUpdatedThreadsCallback", "Fetched updated threads for account: %s (FAILURE)", str);
    }

    @Override // defpackage.caf
    public final void a(String str, djo djo) {
        den den = (den) djo;
        bty.a("FetchUpdatedThreadsCallback", "Fetched updated threads for account: %s [%d threads](SUCCESS)", str, Integer.valueOf(den.b.size()));
        try {
            bul a2 = this.b.a(str);
            if (den.c > a2.d().longValue()) {
                a2 = a2.i().a(Long.valueOf(den.c)).a();
                this.b.b(a2);
            }
            if (den.b.size() > 0) {
                this.a.a(a2, den.b, bvo.c());
            }
        } catch (buo e) {
            bty.b("FetchUpdatedThreadsCallback", e, "Account not found in scheduled callback.", new Object[0]);
        }
    }
}
