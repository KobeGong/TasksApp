package defpackage;

import android.accounts.Account;
import android.content.Context;

/* renamed from: any reason: default package */
/* compiled from: PG */
public final class any implements defpackage.akd {
    public static defpackage.any a;
    public final defpackage.cyl b;
    public final java.util.concurrent.ScheduledExecutorService executor;
    public final defpackage.aoa d;
    public final Context e;
    private final java.util.Map f = new java.util.HashMap();
    private defpackage.cyi g;
    private Account account;
    private final defpackage.cyl i;

    public static synchronized defpackage.any a() {
        synchronized (defpackage.any.class) {
            defpackage.cld.b(a != null);
        }
        return a;
    }

    public any(Context context, defpackage.cyl cyl, defpackage.cyl cyl2, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, defpackage.aoa aoa) {
        this.e = context.getApplicationContext();
        this.i = cyl;
        this.b = cyl2;
        this.executor = scheduledExecutorService;
        this.d = aoa;
    }

    public final synchronized defpackage.cyi b() {
        return this.g;
    }

    public final synchronized defpackage.anc c() {
        defpackage.anc anc;
        if (this.g == null) {
            anc = null;
        } else {
            anc = (defpackage.anc) defpackage.cyd.c(b());
        }
        return anc;
    }

    private final synchronized defpackage.cyi d(Account account) {
        defpackage.cyi cyi;
        cyi = (defpackage.cyi) this.f.get(account.name);
        if (cyi == null) {
            cyi = this.i.a(new anz(this, account, this.i));
            this.f.put(account.name, cyi);
        }
        return cyi;
    }

    public final synchronized defpackage.anc b(Account account) {
        return (defpackage.anc) defpackage.cyd.c(d(account));
    }

    public final synchronized void c(Account account) {
        if (this.g == null || !defpackage.cru.d(this.account.name, account.name)) {
            this.account = account;
            this.g = d(account);
            this.d.a(account.name);
        }
    }

    public final void a(Account account) {
        defpackage.anc c2 = c();
        if (c2 == null || !account.name.equals(c2.b())) {
            defpackage.azb.b("Cannot perform incremental sync for account other than current", new java.lang.Object[0]);
            return;
        }
        java.lang.String a2 = defpackage.ain.b(this.e, account.name).a();
        if (android.text.TextUtils.isEmpty(a2)) {
            new java.lang.Object[1][0] = defpackage.azb.a(account.name);
        } else {
            c2.b(a2);
        }
    }
}
