package defpackage;

/* renamed from: cwa reason: default package */
/* compiled from: PG */
public final class cwa extends java.lang.RuntimeException {
    public static defpackage.cwa a(java.lang.String str, java.lang.String str2, int i, int i2) {
        return new defpackage.cwa(b(str, str2, i, i2));
    }

    public static defpackage.cwa a(java.lang.String str, java.lang.String str2, int i) {
        return new defpackage.cwa(b(str, str2, i, i + 1));
    }

    public static defpackage.cwa b(java.lang.String str, java.lang.String str2, int i) {
        return new defpackage.cwa(b(str, str2, i, -1));
    }

    public cwa(java.lang.String str) {
        super(str);
    }

    private static java.lang.String b(java.lang.String str, java.lang.String str2, int i, int i2) {
        if (i2 < 0) {
            i2 = str2.length();
        }
        java.lang.StringBuilder append = new java.lang.StringBuilder(str).append(": ");
        if (i > 8) {
            append.append("...").append(str2, i - 5, i);
        } else {
            append.append(str2, 0, i);
        }
        append.append('[').append(str2.substring(i, i2)).append(']');
        if (str2.length() - i2 > 8) {
            append.append(str2, i2, i2 + 5).append("...");
        } else {
            append.append(str2, i2, str2.length());
        }
        return append.toString();
    }

    public final synchronized java.lang.Throwable fillInStackTrace() {
        return this;
    }
}
