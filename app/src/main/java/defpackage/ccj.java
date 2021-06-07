package defpackage;

/* renamed from: ccj  reason: default package */
/* compiled from: PG */
final class ccj implements caf {
    public cbx a;

    ccj() {
    }

    @Override // defpackage.caf
    public final void a(String str) {
        bty.b("StoreTargetCallback", "Registration finished for account: %s (FAILURE).", str);
        this.a.a(str, btk.FAILED_REGISTRATION);
    }

    @Override // defpackage.caf
    public final void a(String str, djo djo) {
        bty.a("StoreTargetCallback", "Registration finished for account: %s (SUCCESS).", str);
        this.a.a(str, btk.REGISTERED);
        cbx cbx = this.a;
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (cbx.a) {
            try {
                cbx.a.b(cbx.a.a(str).i().c(Long.valueOf(currentTimeMillis)).a());
            } catch (buo e) {
            }
        }
    }
}
