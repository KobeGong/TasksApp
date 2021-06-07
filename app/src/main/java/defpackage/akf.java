package defpackage;

import android.accounts.Account;
import android.content.Context;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: akf  reason: default package */
/* compiled from: PG */
public final class akf implements ake {
    private static akf c;
    private static final Map d = new ConcurrentHashMap();
    public cym a;
    public akd b;
    private cyk e;

    public static synchronized akf a() {
        akf akf;
        synchronized (akf.class) {
            if (c == null) {
                c = new akf();
            }
            akf = c;
        }
        return akf;
    }

    private akf() {
    }

    @Override // defpackage.ake
    public final synchronized void a(Account account, String str) {
        csi a2 = a(account.name);
        if (!a2.contains(str)) {
            a2.add(str);
        }
    }

    public final synchronized void a(Context context, String str, String str2) {
        if (this.e != null) {
            this.e.cancel(true);
        }
        if (!(this.a == null || this.b == null)) {
            this.e = this.a.a(new akg(this, context, str, str2), 3, TimeUnit.SECONDS);
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized csi a(String str) {
        csi csi;
        csi = (csi) d.get(str);
        if (csi == null) {
            csi = new csi();
            d.put(str, csi);
        }
        return csi;
    }
}
