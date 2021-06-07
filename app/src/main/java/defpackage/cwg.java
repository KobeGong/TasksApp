package defpackage;

/* renamed from: cwg  reason: default package */
/* compiled from: PG */
final class cwg extends cwj {
    private final char[] d;

    cwg(String str, String str2) {
        this(new cwf(str, str2.toCharArray()));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private cwg(cwf cwf) {
        super(cwf, null);
        this.d = new char[512];
        cld.a(cwf.b.length == 16);
        for (int i = 0; i < 256; i++) {
            this.d[i] = cwf.b[i >>> 4];
            this.d[i | 256] = cwf.b[i & 15];
        }
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.cwe, defpackage.cwj
    public final void a(Appendable appendable, byte[] bArr, int i) {
        cld.a(appendable);
        cld.a(0, i, bArr.length);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = bArr[i2] & 255;
            appendable.append(this.d[i3]);
            appendable.append(this.d[i3 | 256]);
        }
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.cwe, defpackage.cwj
    public final int a(byte[] bArr, CharSequence charSequence) {
        int i = 0;
        cld.a(bArr);
        if (charSequence.length() % 2 == 1) {
            throw new cwi(new StringBuilder(32).append("Invalid input length ").append(charSequence.length()).toString());
        }
        int i2 = 0;
        while (i < charSequence.length()) {
            bArr[i2] = (byte) (this.c.a(charSequence.charAt(i + 1)) | (this.c.a(charSequence.charAt(i)) << 4));
            i += 2;
            i2++;
        }
        return i2;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.cwj
    public final cwe a(cwf cwf, Character ch) {
        return new cwg(cwf);
    }
}
