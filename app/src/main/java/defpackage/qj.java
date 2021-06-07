package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: qj  reason: default package */
/* compiled from: PG */
public final class qj {
    private static final byte[] f = new byte[1792];
    public final CharSequence a;
    public final boolean b = false;
    public final int c;
    public int d;
    public char e;

    qj(CharSequence charSequence) {
        this.a = charSequence;
        this.c = charSequence.length();
    }

    static byte a(char c2) {
        return c2 < 1792 ? f[c2] : Character.getDirectionality(c2);
    }

    /* access modifiers changed from: package-private */
    public final byte a() {
        this.e = this.a.charAt(this.d - 1);
        if (Character.isLowSurrogate(this.e)) {
            int codePointBefore = Character.codePointBefore(this.a, this.d);
            this.d -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.d--;
        return a(this.e);
    }

    static {
        for (int i = 0; i < 1792; i++) {
            f[i] = Character.getDirectionality(i);
        }
    }
}
