package defpackage;

/* renamed from: akf reason: default package */
/* compiled from: PG */
public final class akf implements defpackage.ake {
    private static defpackage.akf c;
    private static final java.util.Map d = new java.util.concurrent.ConcurrentHashMap();
    public defpackage.cym a;
    public defpackage.akd b;
    private defpackage.cyk e;

    public static synchronized defpackage.akf a() {
        defpackage.akf akf;
        synchronized (defpackage.akf.class) {
            if (c == null) {
                c = new defpackage.akf();
            }
            akf = c;
        }
        return akf;
    }

    private akf() {
    }

    public final synchronized void a(android.accounts.Account account, java.lang.String str) {
        defpackage.csi a2 = a(account.name);
        if (!a2.contains(str)) {
            a2.add(str);
        }
    }

    public final synchronized void a(android.content.Context context, java.lang.String str, java.lang.String str2) {
        if (this.e != null) {
            this.e.cancel(true);
        }
        if (!(this.a == null || this.b == null)) {
            this.e = this.a.a(new defpackage.akg(this, context, str, str2), 3, java.util.concurrent.TimeUnit.SECONDS);
        }
    }

    /* access modifiers changed from: 0000 */
    public final synchronized defpackage.csi a(java.lang.String str) {
        defpackage.csi csi;
        csi = (defpackage.csi) d.get(str);
        if (csi == null) {
            csi = new defpackage.csi();
            d.put(str, csi);
        }
        return csi;
    }
}
