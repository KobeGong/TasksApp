package defpackage;

/* renamed from: cbd  reason: default package */
/* compiled from: PG */
public final class cbd implements caf {
    public byu a;
    public bup b;
    public bux c;

    cbd() {
    }

    @Override // defpackage.caf
    public final void a(String str) {
        bty.b("FetchLatestThreadsCallback", "Fetched latest threads for account: %s (FAILURE)", str);
    }

    @Override // defpackage.caf
    public final void a(String str, djo djo) {
        bty.a("FetchLatestThreadsCallback", "Fetched latest threads for account: %s (SUCCESS)", str);
        dek dek = (dek) djo;
        try {
            bul a2 = this.b.a(str).i().a(Long.valueOf(dek.d)).b(Long.valueOf(dek.c)).a();
            this.b.b(a2);
            this.c.b(str);
            if (dek.b.size() > 0) {
                this.a.a(a2, dek.b, bvo.c());
            }
        } catch (buo e) {
            bty.b("FetchLatestThreadsCallback", e, "Account not found in scheduled callback.", new Object[0]);
        }
    }
}
