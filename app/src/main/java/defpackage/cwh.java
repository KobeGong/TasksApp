package defpackage;

/* renamed from: cwh reason: default package */
/* compiled from: PG */
final class cwh extends defpackage.cwj {
    cwh(java.lang.String str, java.lang.String str2, java.lang.Character ch) {
        this(new defpackage.cwf(str, str2.toCharArray()), ch);
    }

    private cwh(defpackage.cwf cwf, java.lang.Character ch) {
        super(cwf, ch);
        defpackage.cld.a(cwf.b.length == 64);
    }

    /* access modifiers changed from: 0000 */
    public final void a(java.lang.Appendable appendable, byte[] bArr, int i) {
        defpackage.cld.a((java.lang.Object) appendable);
        defpackage.cld.a(0, i, bArr.length);
        int i2 = 0;
        for (int i3 = i; i3 >= 3; i3 -= 3) {
            int i4 = i2 + 1;
            int i5 = i4 + 1;
            byte b = ((bArr[i4] & 255) << 8) | ((bArr[i2] & 255) << 16);
            i2 = i5 + 1;
            byte b2 = b | (bArr[i5] & 255);
            appendable.append(this.c.b[b2 >>> 18]);
            appendable.append(this.c.b[(b2 >>> 12) & 63]);
            appendable.append(this.c.b[(b2 >>> 6) & 63]);
            appendable.append(this.c.b[b2 & 63]);
        }
        if (i2 < i) {
            a(appendable, bArr, i2, i - i2);
        }
    }

    /* access modifiers changed from: 0000 */
    public final int a(byte[] bArr, java.lang.CharSequence charSequence) {
        int i = 0;
        defpackage.cld.a((java.lang.Object) bArr);
        java.lang.CharSequence b = b(charSequence);
        if (!this.c.a(b.length())) {
            throw new defpackage.cwi("Invalid input length " + b.length());
        }
        int i2 = 0;
        while (i < b.length()) {
            int i3 = i + 1;
            int a = this.c.a(b.charAt(i)) << 18;
            i = i3 + 1;
            int a2 = a | (this.c.a(b.charAt(i3)) << 12);
            int i4 = i2 + 1;
            bArr[i2] = (byte) (a2 >>> 16);
            if (i < b.length()) {
                int i5 = i + 1;
                int a3 = a2 | (this.c.a(b.charAt(i)) << 6);
                int i6 = i4 + 1;
                bArr[i4] = (byte) (a3 >>> 8);
                if (i5 < b.length()) {
                    i = i5 + 1;
                    int a4 = a3 | this.c.a(b.charAt(i5));
                    i2 = i6 + 1;
                    bArr[i6] = (byte) a4;
                } else {
                    i = i5;
                    i2 = i6;
                }
            } else {
                i2 = i4;
            }
        }
        return i2;
    }

    /* access modifiers changed from: 0000 */
    public final defpackage.cwe a(defpackage.cwf cwf, java.lang.Character ch) {
        return new defpackage.cwh(cwf, ch);
    }
}
