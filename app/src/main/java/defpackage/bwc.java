package defpackage;

/* renamed from: bwc reason: default package */
/* compiled from: PG */
public final class bwc {
    public static final java.util.Set b = java.util.EnumSet.of(defpackage.btk.REGISTERED, defpackage.btk.PENDING_REGISTRATION, defpackage.btk.FAILED_REGISTRATION);
    public final defpackage.bup a;
    private final defpackage.bqg c;

    public bwc(defpackage.bqg bqg, defpackage.bup bup) {
        this.c = bqg;
        this.a = bup;
    }

    public static boolean a(defpackage.dfm dfm) {
        defpackage.dgg dgg;
        defpackage.dfy dfy;
        if (dfm == null) {
            return false;
        }
        if ((dfm.a & 2) == 2) {
            if (dfm.c == null) {
                dfy = defpackage.dfy.m;
            } else {
                dfy = dfm.c;
            }
            if (android.text.TextUtils.isEmpty(dfy.d)) {
                return false;
            }
            return true;
        } else if ((dfm.a & 4) != 4) {
            return false;
        } else {
            if (dfm.d == null) {
                dgg = defpackage.dgg.d;
            } else {
                dgg = dfm.d;
            }
            defpackage.dgh a2 = defpackage.dgh.a(dgg.b);
            if (a2 == null) {
                a2 = defpackage.dgh.UNKNOWN_INSTRUCTION;
            }
            if (a2 == defpackage.dgh.SYNC || a2 == defpackage.dgh.FULL_SYNC) {
                return !android.text.TextUtils.isEmpty(dfm.b);
            }
            return false;
        }
    }

    public static defpackage.dfm a(java.lang.String str) {
        byte[] bArr;
        if (str == null) {
            return null;
        }
        try {
            bArr = android.util.Base64.decode(str, 1);
        } catch (java.lang.IllegalArgumentException e) {
            defpackage.bty.b("PayloadUtil", e, "Failed to decode payload string into bytes.", new java.lang.Object[0]);
            bArr = null;
        }
        if (bArr != null) {
            try {
                return (defpackage.dfm) defpackage.dih.a((defpackage.dih) defpackage.dfm.e, bArr);
            } catch (defpackage.dir e2) {
                defpackage.bty.b("PayloadUtil", e2, "Failed to parse AndroidPayload proto.", new java.lang.Object[0]);
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(defpackage.bul bul) {
        try {
            this.c.a(bul.b(), "oauth2:https://www.googleapis.com/auth/notifications");
            return true;
        } catch (java.io.IOException e) {
            java.lang.String str = "PayloadUtil";
            java.lang.String str2 = "IOException getting auth token.";
            java.lang.Object[] objArr = new java.lang.Object[0];
            if (!defpackage.bty.a(3)) {
                return true;
            }
            defpackage.bty.f(str, str2, objArr);
            return true;
        } catch (java.lang.Exception e2) {
            defpackage.bty.b("PayloadUtil", e2, "Error getting auth token.", new java.lang.Object[0]);
            return false;
        }
    }
}
