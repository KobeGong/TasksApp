package defpackage;

/* renamed from: ccj reason: default package */
/* compiled from: PG */
final class ccj implements defpackage.caf {
    public defpackage.cbx a;

    ccj() {
    }

    public final void a(java.lang.String str) {
        defpackage.bty.b("StoreTargetCallback", "Registration finished for account: %s (FAILURE).", str);
        this.a.a(str, defpackage.btk.FAILED_REGISTRATION);
    }

    public final void a(java.lang.String str, defpackage.djo djo) {
        defpackage.bty.a("StoreTargetCallback", "Registration finished for account: %s (SUCCESS).", str);
        this.a.a(str, defpackage.btk.REGISTERED);
        defpackage.cbx cbx = this.a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        synchronized (cbx.a) {
            try {
                cbx.a.b(cbx.a.a(str).i().c(java.lang.Long.valueOf(currentTimeMillis)).a());
            } catch (defpackage.buo e) {
            }
        }
    }
}
