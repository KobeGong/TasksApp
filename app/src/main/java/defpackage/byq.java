package defpackage;

/* renamed from: byq reason: default package */
/* compiled from: PG */
public abstract class byq {
    public abstract java.lang.String a();

    public abstract java.lang.String b();

    public abstract defpackage.bul c();

    public abstract java.lang.Integer d();

    public abstract java.lang.Integer e();

    public final java.lang.String f() {
        defpackage.bul c = c();
        java.lang.String valueOf = java.lang.String.valueOf(a());
        java.lang.String valueOf2 = java.lang.String.valueOf(c != null ? c.b() : "");
        java.lang.String str = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new java.lang.String(valueOf);
        long j = 1125899906842597L;
        int length = str.length();
        while (true) {
            length--;
            if (length >= 0) {
                j = (j * 31) + ((long) str.charAt(length));
            } else {
                java.lang.String hexString = java.lang.Long.toHexString(1152921504606846975L & j);
                java.lang.String valueOf3 = java.lang.String.valueOf(e());
                java.lang.String valueOf4 = java.lang.String.valueOf(d());
                return new java.lang.StringBuilder(java.lang.String.valueOf(hexString).length() + 4 + java.lang.String.valueOf(valueOf3).length() + java.lang.String.valueOf(valueOf4).length()).append(hexString).append("-h").append(valueOf3).append("-w").append(valueOf4).toString();
            }
        }
    }

    byq() {
    }
}
