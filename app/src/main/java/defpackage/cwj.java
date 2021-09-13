package defpackage;

/* renamed from: cwj reason: default package */
/* compiled from: PG */
class cwj extends defpackage.cwe {
    public final defpackage.cwf c;
    private final java.lang.Character d;
    private transient defpackage.cwe e;

    cwj(java.lang.String str, java.lang.String str2, java.lang.Character ch) {
        this(new defpackage.cwf(str, str2.toCharArray()), ch);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0039  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    cwj(defpackage.cwf r5, java.lang.Character r6) {
        /*
            r4 = this;
            r2 = 1
            r1 = 0
            r4.<init>()
            java.lang.Object r0 = defpackage.cld.a(r5)
            cwf r0 = (defpackage.cwf) r0
            r4.c = r0
            if (r6 == 0) goto L_0x0022
            char r0 = r6.charValue()
            byte[] r3 = r5.g
            int r3 = r3.length
            if (r0 >= r3) goto L_0x0035
            byte[] r3 = r5.g
            byte r0 = r3[r0]
            r3 = -1
            if (r0 == r3) goto L_0x0035
            r0 = r2
        L_0x0020:
            if (r0 != 0) goto L_0x0037
        L_0x0022:
            r0 = r2
        L_0x0023:
            java.lang.String r3 = "Padding character %s was already in alphabet"
            if (r0 != 0) goto L_0x0039
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r6
            java.lang.String r1 = defpackage.cld.a(r3, r2)
            r0.<init>(r1)
            throw r0
        L_0x0035:
            r0 = r1
            goto L_0x0020
        L_0x0037:
            r0 = r1
            goto L_0x0023
        L_0x0039:
            r4.d = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cwj.<init>(cwf, java.lang.Character):void");
    }

    /* access modifiers changed from: 0000 */
    public final int a(int i) {
        return this.c.e * defpackage.cmr.a(i, this.c.f, java.math.RoundingMode.CEILING);
    }

    /* access modifiers changed from: 0000 */
    public void a(java.lang.Appendable appendable, byte[] bArr, int i) {
        int i2 = 0;
        defpackage.cld.a((java.lang.Object) appendable);
        defpackage.cld.a(0, i, bArr.length);
        while (i2 < i) {
            a(appendable, bArr, i2, java.lang.Math.min(this.c.f, i - i2));
            i2 += this.c.f;
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(java.lang.Appendable appendable, byte[] bArr, int i, int i2) {
        defpackage.cld.a((java.lang.Object) appendable);
        defpackage.cld.a(i, i + i2, bArr.length);
        defpackage.cld.a(i2 <= this.c.f);
        long j = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j = (j | ((long) (bArr[i + i3] & 255))) << 8;
        }
        int i4 = ((i2 + 1) << 3) - this.c.d;
        int i5 = 0;
        while (i5 < (i2 << 3)) {
            appendable.append(this.c.b[((int) (j >>> (i4 - i5))) & this.c.c]);
            i5 += this.c.d;
        }
        if (this.d != null) {
            while (i5 < (this.c.f << 3)) {
                appendable.append(this.d.charValue());
                i5 += this.c.d;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final int b(int i) {
        return (int) (((((long) this.c.d) * ((long) i)) + 7) / 8);
    }

    /* access modifiers changed from: 0000 */
    public final java.lang.CharSequence b(java.lang.CharSequence charSequence) {
        defpackage.cld.a((java.lang.Object) charSequence);
        if (this.d == null) {
            return charSequence;
        }
        char charValue = this.d.charValue();
        int length = charSequence.length() - 1;
        while (length >= 0 && charSequence.charAt(length) == charValue) {
            length--;
        }
        return charSequence.subSequence(0, length + 1);
    }

    /* access modifiers changed from: 0000 */
    public int a(byte[] bArr, java.lang.CharSequence charSequence) {
        defpackage.cld.a((java.lang.Object) bArr);
        java.lang.CharSequence b = b(charSequence);
        if (!this.c.a(b.length())) {
            throw new defpackage.cwi("Invalid input length " + b.length());
        }
        int i = 0;
        int i2 = 0;
        while (i2 < b.length()) {
            long j = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < this.c.e; i4++) {
                long j2 = j << this.c.d;
                if (i2 + i4 < b.length()) {
                    j2 |= (long) this.c.a(b.charAt(i3 + i2));
                    i3++;
                }
                j = j2;
            }
            int i5 = (this.c.f << 3) - (i3 * this.c.d);
            int i6 = (this.c.f - 1) << 3;
            while (i6 >= i5) {
                int i7 = i + 1;
                bArr[i] = (byte) ((int) ((j >>> i6) & 255));
                i6 -= 8;
                i = i7;
            }
            i2 += this.c.e;
        }
        return i;
    }

    public final defpackage.cwe a() {
        boolean z;
        boolean z2;
        defpackage.cwf cwf;
        boolean z3 = true;
        defpackage.cwe cwe = this.e;
        if (cwe != null) {
            return cwe;
        }
        defpackage.cwf cwf2 = this.c;
        char[] cArr = cwf2.b;
        int length = cArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            } else if (defpackage.cky.a(cArr[i])) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (!z) {
            cwf = cwf2;
        } else {
            char[] cArr2 = cwf2.b;
            int length2 = cArr2.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    z2 = false;
                    break;
                }
                char c2 = cArr2[i2];
                if (c2 >= 'a' && c2 <= 'z') {
                    z2 = true;
                    break;
                }
                i2++;
            }
            if (z2) {
                z3 = false;
            }
            defpackage.cld.b(z3, (java.lang.Object) "Cannot call lowerCase() on a mixed-case alphabet");
            char[] cArr3 = new char[cwf2.b.length];
            for (int i3 = 0; i3 < cwf2.b.length; i3++) {
                char c3 = cwf2.b[i3];
                if (defpackage.cky.a(c3)) {
                    c3 = (char) (c3 ^ ' ');
                }
                cArr3[i3] = c3;
            }
            cwf = new defpackage.cwf(java.lang.String.valueOf(cwf2.a).concat(".lowerCase()"), cArr3);
        }
        defpackage.cwe a = cwf == this.c ? this : a(cwf, this.d);
        this.e = a;
        return a;
    }

    /* access modifiers changed from: 0000 */
    public defpackage.cwe a(defpackage.cwf cwf, java.lang.Character ch) {
        return new defpackage.cwj(cwf, ch);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BaseEncoding.");
        sb.append(this.c.toString());
        if (8 % this.c.d != 0) {
            if (this.d == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('").append(this.d).append("')");
            }
        }
        return sb.toString();
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.cwj)) {
            return false;
        }
        defpackage.cwj cwj = (defpackage.cwj) obj;
        if (!this.c.equals(cwj.c) || !defpackage.cru.equals(this.d, cwj.d)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.c.hashCode() ^ java.util.Arrays.hashCode(new java.lang.Object[]{this.d});
    }
}
