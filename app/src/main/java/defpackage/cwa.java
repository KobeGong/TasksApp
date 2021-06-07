package defpackage;

/* renamed from: cwa  reason: default package */
/* compiled from: PG */
public final class cwa extends RuntimeException {
    public static cwa a(String str, String str2, int i, int i2) {
        return new cwa(b(str, str2, i, i2));
    }

    public static cwa a(String str, String str2, int i) {
        return new cwa(b(str, str2, i, i + 1));
    }

    public static cwa b(String str, String str2, int i) {
        return new cwa(b(str, str2, i, -1));
    }

    public cwa(String str) {
        super(str);
    }

    private static String b(String str, String str2, int i, int i2) {
        if (i2 < 0) {
            i2 = str2.length();
        }
        StringBuilder append = new StringBuilder(str).append(": ");
        if (i > 8) {
            append.append("...").append((CharSequence) str2, i - 5, i);
        } else {
            append.append((CharSequence) str2, 0, i);
        }
        append.append('[').append(str2.substring(i, i2)).append(']');
        if (str2.length() - i2 > 8) {
            append.append((CharSequence) str2, i2, i2 + 5).append("...");
        } else {
            append.append((CharSequence) str2, i2, str2.length());
        }
        return append.toString();
    }

    public final synchronized Throwable fillInStackTrace() {
        return this;
    }
}
