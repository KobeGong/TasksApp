package defpackage;

/* renamed from: bzb reason: default package */
/* compiled from: PG */
public final class bzb {
    public android.content.Context a;
    public defpackage.buc b;
    public defpackage.crv c;
    public defpackage.cbj d;

    public final defpackage.dfd a() {
        defpackage.dih dih;
        defpackage.dih dih2;
        defpackage.dih dih3;
        defpackage.dii dii = (defpackage.dii) defpackage.dfe.m.a(defpackage.bg.ao);
        float f = this.a.getResources().getDisplayMetrics().density;
        dii.b();
        defpackage.dfe dfe = (defpackage.dfe) dii.a;
        dfe.a |= 1;
        dfe.b = f;
        java.lang.String b2 = b(this.a);
        dii.b();
        defpackage.dfe dfe2 = (defpackage.dfe) dii.a;
        if (b2 == null) {
            throw new java.lang.NullPointerException();
        }
        dfe2.a |= 8;
        dfe2.e = b2;
        int i = android.os.Build.VERSION.SDK_INT;
        dii.b();
        defpackage.dfe dfe3 = (defpackage.dfe) dii.a;
        dfe3.a |= 128;
        dfe3.i = i;
        java.lang.String g = this.b.g();
        dii.b();
        defpackage.dfe dfe4 = (defpackage.dfe) dii.a;
        if (g == null) {
            throw new java.lang.NullPointerException();
        }
        dfe4.a |= 512;
        dfe4.k = g;
        defpackage.dfg dfg = defpackage.dfg.CHIME;
        dii.b();
        defpackage.dfe dfe5 = (defpackage.dfe) dii.a;
        if (dfg == null) {
            throw new java.lang.NullPointerException();
        }
        dfe5.a |= 2;
        dfe5.c = dfg.c;
        dii.b();
        defpackage.dfe dfe6 = (defpackage.dfe) dii.a;
        dfe6.a |= 4;
        dfe6.d = "193513518";
        if (!android.text.TextUtils.isEmpty(android.os.Build.VERSION.RELEASE)) {
            java.lang.String str = android.os.Build.VERSION.RELEASE;
            dii.b();
            defpackage.dfe dfe7 = (defpackage.dfe) dii.a;
            if (str == null) {
                throw new java.lang.NullPointerException();
            }
            dfe7.a |= 16;
            dfe7.f = str;
        }
        if (!android.text.TextUtils.isEmpty(android.os.Build.ID)) {
            java.lang.String str2 = android.os.Build.ID;
            dii.b();
            defpackage.dfe dfe8 = (defpackage.dfe) dii.a;
            if (str2 == null) {
                throw new java.lang.NullPointerException();
            }
            dfe8.a |= 32;
            dfe8.g = str2;
        }
        if (!android.text.TextUtils.isEmpty(android.os.Build.MODEL)) {
            java.lang.String str3 = android.os.Build.MODEL;
            dii.b();
            defpackage.dfe dfe9 = (defpackage.dfe) dii.a;
            if (str3 == null) {
                throw new java.lang.NullPointerException();
            }
            dfe9.a |= 64;
            dfe9.h = str3;
        }
        if (!android.text.TextUtils.isEmpty(android.os.Build.MANUFACTURER)) {
            java.lang.String str4 = android.os.Build.MANUFACTURER;
            dii.b();
            defpackage.dfe dfe10 = (defpackage.dfe) dii.a;
            if (str4 == null) {
                throw new java.lang.NullPointerException();
            }
            dfe10.a |= 256;
            dfe10.j = str4;
        }
        for (java.lang.String str5 : this.d.a()) {
            defpackage.dii dii2 = (defpackage.dii) defpackage.dff.c.a(defpackage.bg.ao);
            dii2.b();
            defpackage.dff dff = (defpackage.dff) dii2.a;
            if (str5 == null) {
                throw new java.lang.NullPointerException();
            }
            dff.a |= 1;
            dff.b = str5;
            if (dii2.b) {
                dih3 = dii2.a;
            } else {
                defpackage.dih dih4 = dii2.a;
                defpackage.djz.a.a((java.lang.Object) dih4).c(dih4);
                dii2.b = true;
                dih3 = dii2.a;
            }
            defpackage.dih dih5 = dih3;
            if (!defpackage.dih.a(dih5, java.lang.Boolean.TRUE.booleanValue())) {
                throw new defpackage.dkw();
            }
            defpackage.dff dff2 = (defpackage.dff) dih5;
            dii.b();
            defpackage.dfe dfe11 = (defpackage.dfe) dii.a;
            if (dff2 == null) {
                throw new java.lang.NullPointerException();
            }
            if (!dfe11.l.a()) {
                defpackage.diq diq = dfe11.l;
                int size = diq.size();
                dfe11.l = diq.a(size == 0 ? 10 : size << 1);
            }
            dfe11.l.add(dff2);
        }
        defpackage.dii dii3 = (defpackage.dii) defpackage.dfd.f.a(defpackage.bg.ao);
        java.lang.String a2 = a(this.a);
        dii3.b();
        defpackage.dfd dfd = (defpackage.dfd) dii3.a;
        if (a2 == null) {
            throw new java.lang.NullPointerException();
        }
        dfd.a |= 1;
        dfd.b = a2;
        java.lang.String id = java.util.TimeZone.getDefault().getID();
        dii3.b();
        defpackage.dfd dfd2 = (defpackage.dfd) dii3.a;
        if (id == null) {
            throw new java.lang.NullPointerException();
        }
        dfd2.a |= 2;
        dfd2.c = id;
        if (dii.b) {
            dih = dii.a;
        } else {
            defpackage.dih dih6 = dii.a;
            defpackage.djz.a.a((java.lang.Object) dih6).c(dih6);
            dii.b = true;
            dih = dii.a;
        }
        defpackage.dih dih7 = dih;
        if (!defpackage.dih.a(dih7, java.lang.Boolean.TRUE.booleanValue())) {
            throw new defpackage.dkw();
        }
        defpackage.dfe dfe12 = (defpackage.dfe) dih7;
        dii3.b();
        defpackage.dfd dfd3 = (defpackage.dfd) dii3.a;
        if (dfe12 == null) {
            throw new java.lang.NullPointerException();
        }
        dfd3.d = dfe12;
        dfd3.a |= 4;
        if (this.c.a()) {
            defpackage.dgu a3 = ((defpackage.cbs) this.c.b()).a();
            if (a3 != null) {
                dii3.b();
                defpackage.dfd dfd4 = (defpackage.dfd) dii3.a;
                if (a3 == null) {
                    throw new java.lang.NullPointerException();
                }
                dfd4.e = a3;
                dfd4.a |= 8;
            }
        }
        if (dii3.b) {
            dih2 = dii3.a;
        } else {
            defpackage.dih dih8 = dii3.a;
            defpackage.djz.a.a((java.lang.Object) dih8).c(dih8);
            dii3.b = true;
            dih2 = dii3.a;
        }
        defpackage.dih dih9 = dih2;
        if (defpackage.dih.a(dih9, java.lang.Boolean.TRUE.booleanValue())) {
            return (defpackage.dfd) dih9;
        }
        throw new defpackage.dkw();
    }

    public static java.lang.String a(android.content.Context context) {
        if (defpackage.bwj.d()) {
            return context.getResources().getConfiguration().getLocales().get(0).toLanguageTag();
        }
        if (defpackage.bwj.e()) {
            return context.getResources().getConfiguration().locale.toLanguageTag();
        }
        return context.getResources().getConfiguration().locale.toString();
    }

    public static java.lang.String b(android.content.Context context) {
        try {
            java.lang.String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            if (!android.text.TextUtils.isEmpty(str)) {
                return str;
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            defpackage.bty.b("RenderContextHelperImpl", e, "Failed to get app version.", new java.lang.Object[0]);
        }
        return "unknown";
    }
}
