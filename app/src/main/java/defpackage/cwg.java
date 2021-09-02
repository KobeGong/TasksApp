package defpackage;

/* renamed from: cwg reason: default package */
/* compiled from: PG */
final class cwg extends defpackage.cwj {
    private final char[] d;

    cwg(java.lang.String str, java.lang.String str2) {
        this(new defpackage.cwf(str, str2.toCharArray()));
    }

    private cwg(defpackage.cwf cwf) {
        super(cwf, null);
        this.d = new char[512];
        defpackage.cld.a(cwf.b.length == 16);
        for (int i = 0; i < 256; i++) {
            this.d[i] = cwf.b[i >>> 4];
            this.d[i | 256] = cwf.b[i & 15];
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(java.lang.Appendable appendable, byte[] bArr, int i) {
        defpackage.cld.a((java.lang.Object) appendable);
        defpackage.cld.a(0, i, bArr.length);
        for (int i2 = 0; i2 < i; i2++) {
            byte b = bArr[i2] & 255;
            appendable.append(this.d[b]);
            appendable.append(this.d[b | 256]);
        }
    }

    /* access modifiers changed from: 0000 */
    public final int a(byte[] bArr, java.lang.CharSequence charSequence) {
        int i = 0;
        defpackage.cld.a((java.lang.Object) bArr);
        if (charSequence.length() % 2 == 1) {
            throw new defpackage.cwi("Invalid input length " + charSequence.length());
        }
        int i2 = 0;
        while (i < charSequence.length()) {
            int a = this.c.a(charSequence.charAt(i + 1)) | (this.c.a(charSequence.charAt(i)) << 4);
            int i3 = i2 + 1;
            bArr[i2] = (byte) a;
            i += 2;
            i2 = i3;
        }
        return i2;
    }

    /* access modifiers changed from: 0000 */
    public final defpackage.cwe a(defpackage.cwf cwf, java.lang.Character ch) {
        return new defpackage.cwg(cwf);
    }
}
