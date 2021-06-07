package defpackage;

import java.io.IOException;

/* renamed from: cwe  reason: default package */
/* compiled from: PG */
public abstract class cwe {
    public static final cwe a = new cwh("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');
    public static final cwe b = new cwg("base16()", "0123456789ABCDEF");

    cwe() {
    }

    /* access modifiers changed from: package-private */
    public abstract int a(int i);

    /* access modifiers changed from: package-private */
    public abstract int a(byte[] bArr, CharSequence charSequence);

    public abstract cwe a();

    /* access modifiers changed from: package-private */
    public abstract void a(Appendable appendable, byte[] bArr, int i);

    /* access modifiers changed from: package-private */
    public abstract int b(int i);

    public final String a(byte[] bArr, int i) {
        cld.a(0, i, bArr.length);
        StringBuilder sb = new StringBuilder(a(i));
        try {
            a(sb, bArr, i);
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final byte[] a(CharSequence charSequence) {
        try {
            CharSequence b2 = b(charSequence);
            byte[] bArr = new byte[b(b2.length())];
            int a2 = a(bArr, b2);
            if (a2 == bArr.length) {
                return bArr;
            }
            byte[] bArr2 = new byte[a2];
            System.arraycopy(bArr, 0, bArr2, 0, a2);
            return bArr2;
        } catch (cwi e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* access modifiers changed from: package-private */
    public CharSequence b(CharSequence charSequence) {
        return (CharSequence) cld.a(charSequence);
    }

    static {
        new cwh("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');
        new cwj("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
        new cwj("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
    }
}
