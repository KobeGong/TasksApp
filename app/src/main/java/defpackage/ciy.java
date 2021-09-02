package defpackage;

/* renamed from: ciy reason: default package */
/* compiled from: PG */
final class ciy extends defpackage.cgj implements defpackage.cgx, defpackage.cle {
    public final android.content.SharedPreferences d;
    public final boolean e;
    public final int f;
    public final java.util.regex.Pattern[] g;
    private final defpackage.cha h;

    ciy(defpackage.coe coe, android.app.Application application, defpackage.clt clt, android.content.SharedPreferences sharedPreferences, boolean z, int i, java.util.regex.Pattern... patternArr) {
        super(coe, application, clt, defpackage.bg.Z);
        this.d = sharedPreferences;
        this.e = z;
        this.f = i;
        this.g = patternArr;
        this.h = defpackage.cha.a(application);
    }

    public final void e() {
        this.h.a((defpackage.cgp) this);
    }

    public final void f() {
    }

    public final void b(android.app.Activity activity) {
        this.h.b(this);
        c().submit(new defpackage.ciz(this));
    }

    /* access modifiers changed from: 0000 */
    public final void d() {
        this.h.b(this);
    }
}
