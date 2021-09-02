package defpackage;

/* renamed from: cwe reason: default package */
/* compiled from: PG */
public abstract class cwe {
    public static final defpackage.cwe a = new defpackage.cwh("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", java.lang.Character.valueOf('='));
    public static final defpackage.cwe b = new defpackage.cwg("base16()", "0123456789ABCDEF");

    cwe() {
    }

    /* access modifiers changed from: 0000 */
    public abstract int a(int i);

    /* access modifiers changed from: 0000 */
    public abstract int a(byte[] bArr, java.lang.CharSequence charSequence);

    public abstract defpackage.cwe a();

    /* access modifiers changed from: 0000 */
    public abstract void a(java.lang.Appendable appendable, byte[] bArr, int i);

    /* access modifiers changed from: 0000 */
    public abstract int b(int i);

    public final java.lang.String a(byte[] bArr, int i) {
        defpackage.cld.a(0, i, bArr.length);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(a(i));
        try {
            a(sb, bArr, i);
            return sb.toString();
        } catch (java.io.IOException e) {
            throw new java.lang.AssertionError(e);
        }
    }

    public final byte[] a(java.lang.CharSequence charSequence) {
        try {
            java.lang.CharSequence b2 = b(charSequence);
            byte[] bArr = new byte[b(b2.length())];
            int a2 = a(bArr, b2);
            if (a2 == bArr.length) {
                return bArr;
            }
            byte[] bArr2 = new byte[a2];
            java.lang.System.arraycopy(bArr, 0, bArr2, 0, a2);
            return bArr2;
        } catch (defpackage.cwi e) {
            throw new java.lang.IllegalArgumentException(e);
        }
    }

    /* access modifiers changed from: 0000 */
    public java.lang.CharSequence b(java.lang.CharSequence charSequence) {
        return (java.lang.CharSequence) defpackage.cld.a((java.lang.Object) charSequence);
    }

    static {
        new defpackage.cwh("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", java.lang.Character.valueOf('='));
        new defpackage.cwj("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", java.lang.Character.valueOf('='));
        new defpackage.cwj("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", java.lang.Character.valueOf('='));
    }
}
