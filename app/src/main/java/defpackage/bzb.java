package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import java.util.TimeZone;

/* renamed from: bzb  reason: default package */
/* compiled from: PG */
public final class bzb {
    public Context a;
    public buc b;
    public crv c;
    public cbj d;

    public final dfd a() {
        dih dih;
        dih dih2;
        dgu a2;
        dih dih3;
        dii dii = (dii) dfe.m.a(bg.ao);
        float f = this.a.getResources().getDisplayMetrics().density;
        dii.b();
        dfe dfe = (dfe) dii.a;
        dfe.a |= 1;
        dfe.b = f;
        String b2 = b(this.a);
        dii.b();
        dfe dfe2 = (dfe) dii.a;
        if (b2 == null) {
            throw new NullPointerException();
        }
        dfe2.a |= 8;
        dfe2.e = b2;
        int i = Build.VERSION.SDK_INT;
        dii.b();
        dfe dfe3 = (dfe) dii.a;
        dfe3.a |= 128;
        dfe3.i = i;
        String g = this.b.g();
        dii.b();
        dfe dfe4 = (dfe) dii.a;
        if (g == null) {
            throw new NullPointerException();
        }
        dfe4.a |= 512;
        dfe4.k = g;
        dfg dfg = dfg.CHIME;
        dii.b();
        dfe dfe5 = (dfe) dii.a;
        if (dfg == null) {
            throw new NullPointerException();
        }
        dfe5.a |= 2;
        dfe5.c = dfg.c;
        dii.b();
        dfe dfe6 = (dfe) dii.a;
        dfe6.a |= 4;
        dfe6.d = "193513518";
        if (!TextUtils.isEmpty(Build.VERSION.RELEASE)) {
            String str = Build.VERSION.RELEASE;
            dii.b();
            dfe dfe7 = (dfe) dii.a;
            if (str == null) {
                throw new NullPointerException();
            }
            dfe7.a |= 16;
            dfe7.f = str;
        }
        if (!TextUtils.isEmpty(Build.ID)) {
            String str2 = Build.ID;
            dii.b();
            dfe dfe8 = (dfe) dii.a;
            if (str2 == null) {
                throw new NullPointerException();
            }
            dfe8.a |= 32;
            dfe8.g = str2;
        }
        if (!TextUtils.isEmpty(Build.MODEL)) {
            String str3 = Build.MODEL;
            dii.b();
            dfe dfe9 = (dfe) dii.a;
            if (str3 == null) {
                throw new NullPointerException();
            }
            dfe9.a |= 64;
            dfe9.h = str3;
        }
        if (!TextUtils.isEmpty(Build.MANUFACTURER)) {
            String str4 = Build.MANUFACTURER;
            dii.b();
            dfe dfe10 = (dfe) dii.a;
            if (str4 == null) {
                throw new NullPointerException();
            }
            dfe10.a |= 256;
            dfe10.j = str4;
        }
        for (String str5 : this.d.a()) {
            dii dii2 = (dii) dff.c.a(bg.ao);
            dii2.b();
            dff dff = (dff) dii2.a;
            if (str5 == null) {
                throw new NullPointerException();
            }
            dff.a |= 1;
            dff.b = str5;
            if (dii2.b) {
                dih3 = dii2.a;
            } else {
                dih dih4 = dii2.a;
                djz.a.a(dih4).c(dih4);
                dii2.b = true;
                dih3 = dii2.a;
            }
            dih dih5 = dih3;
            if (!dih.a(dih5, Boolean.TRUE.booleanValue())) {
                throw new dkw();
            }
            dff dff2 = (dff) dih5;
            dii.b();
            dfe dfe11 = (dfe) dii.a;
            if (dff2 == null) {
                throw new NullPointerException();
            }
            if (!dfe11.l.a()) {
                diq diq = dfe11.l;
                int size = diq.size();
                dfe11.l = diq.a(size == 0 ? 10 : size << 1);
            }
            dfe11.l.add(dff2);
        }
        dii dii3 = (dii) dfd.f.a(bg.ao);
        String a3 = a(this.a);
        dii3.b();
        dfd dfd = (dfd) dii3.a;
        if (a3 == null) {
            throw new NullPointerException();
        }
        dfd.a |= 1;
        dfd.b = a3;
        String id = TimeZone.getDefault().getID();
        dii3.b();
        dfd dfd2 = (dfd) dii3.a;
        if (id == null) {
            throw new NullPointerException();
        }
        dfd2.a |= 2;
        dfd2.c = id;
        if (dii.b) {
            dih = dii.a;
        } else {
            dih dih6 = dii.a;
            djz.a.a(dih6).c(dih6);
            dii.b = true;
            dih = dii.a;
        }
        dih dih7 = dih;
        if (!dih.a(dih7, Boolean.TRUE.booleanValue())) {
            throw new dkw();
        }
        dfe dfe12 = (dfe) dih7;
        dii3.b();
        dfd dfd3 = (dfd) dii3.a;
        if (dfe12 == null) {
            throw new NullPointerException();
        }
        dfd3.d = dfe12;
        dfd3.a |= 4;
        if (this.c.a() && (a2 = ((cbs) this.c.b()).a()) != null) {
            dii3.b();
            dfd dfd4 = (dfd) dii3.a;
            if (a2 == null) {
                throw new NullPointerException();
            }
            dfd4.e = a2;
            dfd4.a |= 8;
        }
        if (dii3.b) {
            dih2 = dii3.a;
        } else {
            dih dih8 = dii3.a;
            djz.a.a(dih8).c(dih8);
            dii3.b = true;
            dih2 = dii3.a;
        }
        dih dih9 = dih2;
        if (dih.a(dih9, Boolean.TRUE.booleanValue())) {
            return (dfd) dih9;
        }
        throw new dkw();
    }

    public static String a(Context context) {
        if (bwj.d()) {
            return context.getResources().getConfiguration().getLocales().get(0).toLanguageTag();
        }
        if (bwj.e()) {
            return context.getResources().getConfiguration().locale.toLanguageTag();
        }
        return context.getResources().getConfiguration().locale.toString();
    }

    public static String b(Context context) {
        try {
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            return !TextUtils.isEmpty(str) ? str : "unknown";
        } catch (PackageManager.NameNotFoundException e) {
            bty.b("RenderContextHelperImpl", e, "Failed to get app version.", new Object[0]);
        }
    }
}
