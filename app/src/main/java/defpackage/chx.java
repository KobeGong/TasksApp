package defpackage;

/* renamed from: chx reason: default package */
/* compiled from: PG */
final class chx extends defpackage.cgj implements defpackage.cgx, defpackage.cgy, defpackage.cle {
    private boolean d;

    chx(defpackage.coe coe, android.app.Application application, defpackage.clt clt) {
        super(coe, application, clt, defpackage.bg.Z);
    }

    public final void e() {
        g();
    }

    public final void f() {
    }

    public final void b(android.app.Activity activity) {
        a(2);
        defpackage.cdm.a(3, "MagicEyeLogService", "Logging APP_TO_BACKGROUND", new java.lang.Object[0]);
    }

    public final void a(android.app.Activity activity) {
        a(1);
        defpackage.cdm.a(3, "MagicEyeLogService", "Logging APP_TO_FOREGROUND", new java.lang.Object[0]);
    }

    private final synchronized void g() {
        if (!this.d && !this.c) {
            defpackage.cha.a(this.a).a((defpackage.cgp) this);
            this.d = true;
        }
    }

    private final synchronized void h() {
        if (this.d) {
            defpackage.cha.a(this.a).b(this);
            this.d = false;
        }
    }

    private final void a(int i) {
        c().submit(new defpackage.chy(this, i));
    }

    /* access modifiers changed from: 0000 */
    public final void d() {
        h();
    }
}
