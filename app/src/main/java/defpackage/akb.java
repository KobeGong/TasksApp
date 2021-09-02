package defpackage;

/* renamed from: akb reason: default package */
public final /* synthetic */ class akb implements java.lang.Runnable {
    private final android.content.Context a;

    public akb(android.content.Context context) {
        this.a = context;
    }

    public final void run() {
        defpackage.ccz ccz = (defpackage.ccz) defpackage.bwj.b().c.a();
        for (android.accounts.Account account : defpackage.ajd.a(this.a)) {
            defpackage.btl a2 = ccz.a(account.name);
            java.lang.String a3 = defpackage.azb.a(account.name);
            if (a2.a() == defpackage.btn.SUCCESS) {
                new java.lang.Object[1][0] = a3;
            } else {
                defpackage.azb.a("Failed to register %s for Chime notifications", a2.b(), a3);
            }
        }
    }
}
