package defpackage;

/* renamed from: bab reason: default package */
/* compiled from: PG */
final class bab implements defpackage.ayx {
    private /* synthetic */ defpackage.bbn a;
    private /* synthetic */ boolean b;
    private /* synthetic */ defpackage.ayp c;
    private /* synthetic */ defpackage.azx d;

    bab(defpackage.azx azx, defpackage.bbn bbn, boolean z, defpackage.ayp ayp) {
        this.d = azx;
        this.a = bbn;
        this.b = z;
        this.c = ayp;
    }

    public final /* synthetic */ void a(defpackage.ayw ayw) {
        com.google.android.gms.common.api.Status status = (com.google.android.gms.common.api.Status) ayw;
        defpackage.awg a2 = defpackage.awg.a(this.d.k);
        java.lang.String a3 = a2.a("defaultGoogleSignInAccount");
        a2.b("defaultGoogleSignInAccount");
        if (!android.text.TextUtils.isEmpty(a3)) {
            a2.b(defpackage.awg.b("googleSignInAccount", a3));
            a2.b(defpackage.awg.b("googleSignInOptions", a3));
        }
        if (status.a() && this.d.j()) {
            this.d.h();
        }
        this.a.a((defpackage.ayw) status);
        if (this.b) {
            this.c.g();
        }
    }
}
