package defpackage;

/* renamed from: amg reason: default package */
/* compiled from: PG */
public final class amg {
    private static final int a = ((int) java.lang.Math.pow(10.0d, 8.0d));
    private final java.util.Random b;

    public amg() {
        this(new java.util.Random());
    }

    private amg(java.util.Random random) {
        this.b = random;
    }

    public final java.lang.String a(defpackage.dcb dcb) {
        java.lang.String str = dcb.e;
        if (!android.text.TextUtils.isEmpty(str)) {
            return a(str);
        }
        java.lang.String str2 = dcb.b;
        if (str2.indexOf(58) >= 0) {
            return a(str2);
        }
        return a();
    }

    private final java.lang.String a(java.lang.String str) {
        java.lang.String substring = str.substring(0, str.length() - 2);
        java.lang.String b2 = b();
        return new java.lang.StringBuilder(java.lang.String.valueOf(substring).length() + 1 + java.lang.String.valueOf(b2).length()).append(substring).append(":").append(b2).toString();
    }

    /* access modifiers changed from: 0000 */
    public final java.lang.String a() {
        byte[] bArr = new byte[12];
        this.b.nextBytes(bArr);
        return android.util.Base64.encodeToString(bArr, 11);
    }

    /* access modifiers changed from: 0000 */
    public final java.lang.String b() {
        java.lang.String valueOf = java.lang.String.valueOf(a(this.b.nextInt(a)));
        java.lang.String valueOf2 = java.lang.String.valueOf(a(this.b.nextInt(a)));
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new java.lang.String(valueOf);
    }

    private static java.lang.String a(int i) {
        java.lang.String str = "00000000" + i;
        return str.substring(str.length() - 8);
    }
}
