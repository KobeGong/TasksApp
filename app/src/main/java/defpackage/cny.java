package defpackage;

import android.content.SharedPreferences;
import android.util.Base64;

/* renamed from: cny  reason: default package */
/* compiled from: PG */
public final class cny {
    public final SharedPreferences a;

    public cny(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }

    public final boolean a(String str, dmf dmf) {
        byte[] decode = Base64.decode(this.a.getString(str, ""), 0);
        if (decode == null || decode.length == 0) {
            cdm.a(5, "PersistStorage", "unknown key", new Object[0]);
            return false;
        } else if (decode[0] == 1) {
            try {
                dmf.a(dmf, decode, 1, decode.length - 1);
                return true;
            } catch (dme e) {
                cdm.b("PersistStorage", "failure reading proto", e, new Object[0]);
            }
        } else {
            cdm.a(5, "PersistStorage", "wrong header", new Object[0]);
            return false;
        }
    }
}
