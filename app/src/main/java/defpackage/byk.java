package defpackage;

/* renamed from: byk reason: default package */
/* compiled from: PG */
public final class byk {
    public android.content.Context a;
    public defpackage.buc b;
    public defpackage.bru c;
    public defpackage.avi d;

    public final java.lang.String a() {
        defpackage.cky.c();
        try {
            java.lang.String a2 = this.c.a(this.b.d(), this.d.a());
            if (android.text.TextUtils.isEmpty(a2)) {
                throw new defpackage.byl();
            }
            if (!a2.equals(this.a.getSharedPreferences("com.google.android.libraries.notifications.GCM", 0).getString("reg_id", null))) {
                defpackage.bty.a("GcmManagerImpl", "New registration ID doesn't match the previously stored one.", new java.lang.Object[0]);
                this.a.getSharedPreferences("com.google.android.libraries.notifications.GCM", 0).edit().putString("reg_id", a2).commit();
            }
            return a2;
        } catch (java.io.IOException e) {
            defpackage.bty.b("GcmManagerImpl", "Exception during register with IID.", new java.lang.Object[0]);
            throw new defpackage.byl(e);
        }
    }
}
