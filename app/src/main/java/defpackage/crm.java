package defpackage;

/* renamed from: crm reason: default package */
/* compiled from: PG */
public final class crm extends defpackage.crl {
    private final char a = ',';

    public crm(char c) {
        super(0);
    }

    public final java.lang.String toString() {
        char c = this.a;
        java.lang.String str = "0123456789ABCDEF";
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = str.charAt(c & 15);
            c = (char) (c >> 4);
        }
        java.lang.String copyValueOf = java.lang.String.copyValueOf(cArr);
        return new java.lang.StringBuilder(java.lang.String.valueOf(copyValueOf).length() + 18).append("CharMatcher.is('").append(copyValueOf).append("')").toString();
    }
}
