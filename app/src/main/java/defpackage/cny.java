package defpackage;

/* renamed from: cny reason: default package */
/* compiled from: PG */
public final class cny {
    public final android.content.SharedPreferences a;

    public cny(android.content.SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }

    public final boolean a(java.lang.String str, defpackage.dmf dmf) {
        byte[] decode = android.util.Base64.decode(this.a.getString(str, ""), 0);
        if (decode == null || decode.length == 0) {
            defpackage.cdm.a(5, "PersistStorage", "unknown key", new java.lang.Object[0]);
            return false;
        } else if (decode[0] == 1) {
            try {
                defpackage.dmf.a(dmf, decode, 1, decode.length - 1);
                return true;
            } catch (defpackage.dme e) {
                defpackage.cdm.b("PersistStorage", "failure reading proto", e, new java.lang.Object[0]);
            }
        } else {
            defpackage.cdm.a(5, "PersistStorage", "wrong header", new java.lang.Object[0]);
            return false;
        }
    }
}
