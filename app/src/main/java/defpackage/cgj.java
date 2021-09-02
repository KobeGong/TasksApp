package defpackage;

/* renamed from: cgj reason: default package */
/* compiled from: PG */
public abstract class cgj implements defpackage.cls {
    public final android.app.Application a;
    public final defpackage.clt b;
    public volatile boolean c;
    private final defpackage.cin d;

    protected cgj(defpackage.coe coe, android.app.Application application, defpackage.clt clt, int i) {
        this(coe, application, clt, i, Integer.MAX_VALUE);
    }

    /* access modifiers changed from: 0000 */
    public abstract void d();

    protected cgj(defpackage.coe coe, android.app.Application application, defpackage.clt clt, int i, int i2) {
        defpackage.cky.a((java.lang.Object) coe);
        defpackage.cky.a((java.lang.Object) application);
        this.a = application;
        this.b = clt;
        this.d = new defpackage.cin(coe, defpackage.cip.b(application), clt, i, i2);
    }

    public final void a() {
        this.c = true;
        d();
    }

    public final boolean b() {
        return !this.d.a.a();
    }

    /* access modifiers changed from: protected */
    public final void a(java.lang.String str, boolean z, defpackage.efx efx, defpackage.eeo eeo) {
        if (!this.c) {
            defpackage.cin cin = this.d;
            if (cin.c == defpackage.bg.Z) {
                cin.a(str, z, efx, eeo);
            } else {
                ((java.util.concurrent.ScheduledExecutorService) cin.b.a()).submit(new defpackage.cio(cin, str, z, efx, eeo));
            }
        }
    }

    public final void a(defpackage.efx efx) {
        a(null, true, efx, null);
    }

    /* access modifiers changed from: 0000 */
    public final java.util.concurrent.ScheduledExecutorService c() {
        return (java.util.concurrent.ScheduledExecutorService) this.b.a();
    }
}
