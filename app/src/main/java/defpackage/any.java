package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: any  reason: default package */
/* compiled from: PG */
public final class any implements akd {
    public static any a;
    public final cyl b;
    public final ScheduledExecutorService c;
    public final aoa d;
    public final Context e;
    private final Map f = new HashMap();
    private cyi g;
    private Account h;
    private final cyl i;

    public static synchronized any a() {
        any any;
        synchronized (any.class) {
            cld.b(a != null);
            any = a;
        }
        return any;
    }

    public any(Context context, cyl cyl, cyl cyl2, ScheduledExecutorService scheduledExecutorService, aoa aoa) {
        this.e = context.getApplicationContext();
        this.i = cyl;
        this.b = cyl2;
        this.c = scheduledExecutorService;
        this.d = aoa;
    }

    public final synchronized cyi b() {
        return this.g;
    }

    public final synchronized anc c() {
        anc anc;
        if (this.g == null) {
            anc = null;
        } else {
            anc = (anc) cyd.c(b());
        }
        return anc;
    }

    private final synchronized cyi d(Account account) {
        cyi cyi;
        cyi = (cyi) this.f.get(account.name);
        if (cyi == null) {
            cyl cyl = this.i;
            cyi = cyl.a(new anz(this, account, cyl));
            this.f.put(account.name, cyi);
        }
        return cyi;
    }

    public final synchronized anc b(Account account) {
        return (anc) cyd.c(d(account));
    }

    public final synchronized void c(Account account) {
        if (this.g == null || !cru.d(this.h.name, account.name)) {
            this.h = account;
            this.g = d(account);
            this.d.a(account.name);
        }
    }

    @Override // defpackage.akd
    public final void a(Account account) {
        anc c2 = c();
        if (c2 == null || !account.name.equals(c2.b())) {
            azb.b("Cannot perform incremental sync for account other than current", new Object[0]);
            return;
        }
        String a2 = ain.b(this.e, account.name).a();
        if (TextUtils.isEmpty(a2)) {
            new Object[1][0] = azb.a(account.name);
        } else {
            c2.b(a2);
        }
    }
}
