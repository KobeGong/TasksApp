package defpackage;

/* renamed from: crm  reason: default package */
/* compiled from: PG */
public final class crm extends crl {
    private final char a = ',';

    public crm(char c) {
        super((byte) 0);
    }

    public final String toString() {
        char c = this.a;
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(c & 15);
            c = (char) (c >> 4);
        }
        String copyValueOf = String.copyValueOf(cArr);
        return new StringBuilder(String.valueOf(copyValueOf).length() + 18).append("CharMatcher.is('").append(copyValueOf).append("')").toString();
    }
}
