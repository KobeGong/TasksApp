package defpackage;

/* renamed from: boy reason: default package */
/* compiled from: PG */
public final class boy {
    private static final defpackage.ayh a = new defpackage.ayh(0);
    private static final defpackage.ayf b = new defpackage.bpm();

    public static android.net.Uri a(java.lang.String str) {
        java.lang.String str2 = "content://com.google.android.gms.phenotype/";
        java.lang.String valueOf = java.lang.String.valueOf(android.net.Uri.encode(str));
        return android.net.Uri.parse(valueOf.length() != 0 ? str2.concat(valueOf) : new java.lang.String(str2));
    }

    static {
        new defpackage.ayd("Phenotype.API", b, a);
        new defpackage.bjz();
    }
}
