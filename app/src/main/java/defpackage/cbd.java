package defpackage;

/* renamed from: cbd reason: default package */
/* compiled from: PG */
public final class cbd implements defpackage.caf {
    public defpackage.byu a;
    public defpackage.bup b;
    public defpackage.bux c;

    cbd() {
    }

    public final void a(java.lang.String str) {
        defpackage.bty.b("FetchLatestThreadsCallback", "Fetched latest threads for account: %s (FAILURE)", str);
    }

    public final void a(java.lang.String str, defpackage.djo djo) {
        defpackage.bty.a("FetchLatestThreadsCallback", "Fetched latest threads for account: %s (SUCCESS)", str);
        defpackage.dek dek = (defpackage.dek) djo;
        try {
            defpackage.bul a2 = this.b.a(str).i().a(java.lang.Long.valueOf(dek.d)).b(java.lang.Long.valueOf(dek.c)).a();
            this.b.b(a2);
            this.c.b(str);
            if (dek.b.size() > 0) {
                this.a.a(a2, dek.b, defpackage.bvo.c());
            }
        } catch (defpackage.buo e) {
            defpackage.bty.b("FetchLatestThreadsCallback", e, "Account not found in scheduled callback.", new java.lang.Object[0]);
        }
    }
}
