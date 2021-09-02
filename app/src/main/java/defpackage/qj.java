package defpackage;

/* renamed from: qj reason: default package */
/* compiled from: PG */
final class qj {
    private static final byte[] f = new byte[1792];
    public final java.lang.CharSequence a;
    public final boolean b = false;
    public final int c;
    public int d;
    public char e;

    qj(java.lang.CharSequence charSequence) {
        this.a = charSequence;
        this.c = charSequence.length();
    }

    static byte a(char c2) {
        return c2 < 1792 ? f[c2] : java.lang.Character.getDirectionality(c2);
    }

    /* access modifiers changed from: 0000 */
    public final byte a() {
        this.e = this.a.charAt(this.d - 1);
        if (java.lang.Character.isLowSurrogate(this.e)) {
            int codePointBefore = java.lang.Character.codePointBefore(this.a, this.d);
            this.d -= java.lang.Character.charCount(codePointBefore);
            return java.lang.Character.getDirectionality(codePointBefore);
        }
        this.d--;
        return a(this.e);
    }

    static {
        for (int i = 0; i < 1792; i++) {
            f[i] = java.lang.Character.getDirectionality(i);
        }
    }
}
