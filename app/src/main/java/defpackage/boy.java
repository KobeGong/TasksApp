package defpackage;

import android.net.Uri;

/* renamed from: boy  reason: default package */
/* compiled from: PG */
public final class boy {
    private static final ayh a = new ayh((byte) 0);
    private static final ayf b = new bpm();

    public static Uri a(String str) {
        String valueOf = String.valueOf(Uri.encode(str));
        return Uri.parse(valueOf.length() != 0 ? "content://com.google.android.gms.phenotype/".concat(valueOf) : new String("content://com.google.android.gms.phenotype/"));
    }

    static {
        new ayd("Phenotype.API", b, a);
        new bjz();
    }
}
