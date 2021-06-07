package defpackage;

import android.accounts.Account;
import android.content.Context;

/* renamed from: akg  reason: default package */
/* compiled from: PG */
final class akg implements Runnable {
    private final /* synthetic */ Context a;
    private final /* synthetic */ String b;
    private final /* synthetic */ String c;
    private final /* synthetic */ akf d;

    akg(akf akf, Context context, String str, String str2) {
        this.d = akf;
        this.a = context;
        this.b = str;
        this.c = str2;
    }

    public final void run() {
        Account b2 = ajd.b(this.a, this.b);
        if (b2 == null) {
            return;
        }
        if (this.d.a(b2.name).contains(this.c)) {
            new Object[1][0] = azb.a(b2.name);
            this.d.a(b2, this.c);
            return;
        }
        new Object[1][0] = azb.a(b2.name);
        this.d.b.a(b2);
        this.d.a(b2, this.c);
    }
}
