package defpackage;

import android.content.SharedPreferences;
import android.util.Log;

/* access modifiers changed from: package-private */
/* renamed from: bpg  reason: default package */
/* compiled from: PG */
public final class bpg extends boz {
    bpg(bpa bpa, String str, String str2) {
        super(bpa, str, null);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final String a(SharedPreferences sharedPreferences) {
        try {
            return sharedPreferences.getString(this.e, null);
        } catch (ClassCastException e) {
            String valueOf = String.valueOf(this.e);
            Log.e("PhenotypeFlag", valueOf.length() != 0 ? "Invalid string value in SharedPreferences for ".concat(valueOf) : new String("Invalid string value in SharedPreferences for "), e);
            return null;
        }
    }

    @Override // defpackage.boz
    public final /* synthetic */ Object a(String str) {
        return str;
    }
}
