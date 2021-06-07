package defpackage;

import android.app.Activity;
import android.app.Application;

/* access modifiers changed from: package-private */
/* renamed from: chx  reason: default package */
/* compiled from: PG */
public final class chx extends cgj implements cgx, cgy, cle {
    private boolean d;

    chx(coe coe, Application application, clt clt) {
        super(coe, application, clt, bg.Z);
    }

    @Override // defpackage.cle
    public final void e() {
        g();
    }

    @Override // defpackage.cle
    public final void f() {
    }

    @Override // defpackage.cgx
    public final void b(Activity activity) {
        a(2);
        cdm.a(3, "MagicEyeLogService", "Logging APP_TO_BACKGROUND", new Object[0]);
    }

    @Override // defpackage.cgy
    public final void a(Activity activity) {
        a(1);
        cdm.a(3, "MagicEyeLogService", "Logging APP_TO_FOREGROUND", new Object[0]);
    }

    private final synchronized void g() {
        if (!this.d && !this.c) {
            cha.a(this.a).a(this);
            this.d = true;
        }
    }

    private final synchronized void h() {
        if (this.d) {
            cha.a(this.a).b(this);
            this.d = false;
        }
    }

    private final void a(int i) {
        c().submit(new chy(this, i));
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.cgj
    public final void d() {
        h();
    }
}
