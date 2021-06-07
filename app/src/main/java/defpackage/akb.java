package defpackage;

import android.accounts.Account;
import android.content.Context;

/* renamed from: akb  reason: default package */
public final /* synthetic */ class akb implements Runnable {
    private final Context a;

    public akb(Context context) {
        this.a = context;
    }

    public final void run() {
        Context context = this.a;
        ccz ccz = (ccz) bwj.b().c.a();
        for (Account account : ajd.a(context)) {
            btl a2 = ccz.a(account.name);
            String a3 = azb.a(account.name);
            if (a2.a() == btn.SUCCESS) {
                new Object[1][0] = a3;
            } else {
                azb.a("Failed to register %s for Chime notifications", a2.b(), a3);
            }
        }
    }
}
