package defpackage;

/* renamed from: chq reason: default package */
/* compiled from: PG */
final class chq implements defpackage.cgv, defpackage.cgx {
    public final /* synthetic */ defpackage.chn a;

    chq(defpackage.chn chn) {
        this.a = chn;
    }

    public final void a(android.app.Activity activity) {
        defpackage.civ civ;
        defpackage.chn chn = this.a;
        java.lang.Class cls = activity.getClass();
        if (!android.text.TextUtils.isEmpty(null)) {
            java.lang.String valueOf = java.lang.String.valueOf(null);
            java.lang.String valueOf2 = java.lang.String.valueOf(cls.getSimpleName());
            civ = new defpackage.civ(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new java.lang.String(valueOf));
        } else {
            civ = new defpackage.civ(cls.getSimpleName());
        }
        chn.a(civ);
    }

    public final void b(android.app.Activity activity) {
        this.a.a((defpackage.civ) null);
        if (this.a.i.get()) {
            this.a.c().submit(new defpackage.cho(this));
        }
    }
}
