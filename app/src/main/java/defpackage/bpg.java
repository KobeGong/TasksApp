package defpackage;

/* renamed from: bpg reason: default package */
/* compiled from: PG */
final class bpg extends defpackage.boz {
    bpg(defpackage.bpa bpa, java.lang.String str, java.lang.String str2) {
        super(bpa, str, null);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final java.lang.String a(android.content.SharedPreferences sharedPreferences) {
        try {
            return sharedPreferences.getString(this.e, null);
        } catch (java.lang.ClassCastException e) {
            java.lang.ClassCastException classCastException = e;
            java.lang.String str = "PhenotypeFlag";
            java.lang.String str2 = "Invalid string value in SharedPreferences for ";
            java.lang.String valueOf = java.lang.String.valueOf(this.e);
            android.util.Log.e(str, valueOf.length() != 0 ? str2.concat(valueOf) : new java.lang.String(str2), classCastException);
            return null;
        }
    }

    public final /* synthetic */ java.lang.Object a(java.lang.String str) {
        return str;
    }
}
