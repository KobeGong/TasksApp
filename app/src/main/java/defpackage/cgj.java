package defpackage;

import android.app.Application;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: cgj  reason: default package */
/* compiled from: PG */
public abstract class cgj implements cls {
    public final Application a;
    public final clt b;
    public volatile boolean c;
    private final cin d;

    protected cgj(coe coe, Application application, clt clt, int i) {
        this(coe, application, clt, i, Integer.MAX_VALUE);
    }

    /* access modifiers changed from: package-private */
    public abstract void d();

    protected cgj(coe coe, Application application, clt clt, int i, int i2) {
        cky.a(coe);
        cky.a((Object) application);
        this.a = application;
        this.b = clt;
        this.d = new cin(coe, cip.b(application), clt, i, i2);
    }

    @Override // defpackage.cls
    public final void a() {
        this.c = true;
        d();
    }

    public final boolean b() {
        return !this.d.a.a();
    }

    /* access modifiers changed from: protected */
    public final void a(String str, boolean z, efx efx, eeo eeo) {
        if (!this.c) {
            cin cin = this.d;
            if (cin.c == bg.Z) {
                cin.a(str, z, efx, eeo);
            } else {
                ((ScheduledExecutorService) cin.b.a()).submit(new cio(cin, str, z, efx, eeo));
            }
        }
    }

    public final void a(efx efx) {
        a(null, true, efx, null);
    }

    /* access modifiers changed from: package-private */
    public final ScheduledExecutorService c() {
        return (ScheduledExecutorService) this.b.a();
    }
}
