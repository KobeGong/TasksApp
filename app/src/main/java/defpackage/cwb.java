package defpackage;

/* renamed from: cwb reason: default package */
/* compiled from: PG */
public abstract class cwb extends defpackage.cvz {
    private static final java.lang.String a = a();

    private static java.lang.String a() {
        try {
            java.lang.String property = java.lang.System.getProperty("line.separator");
            if (property.matches("\\n|\\r(?:\\n)?")) {
                return property;
            }
        } catch (java.lang.SecurityException e) {
        }
        return "\n";
    }

    /* access modifiers changed from: 0000 */
    public abstract int a(defpackage.cvy cvy, int i, java.lang.String str, int i2, int i3, int i4);

    protected cwb() {
        super(defpackage.cts.PRINTF_STYLE);
    }

    public final void a(java.lang.StringBuilder sb, java.lang.String str, int i, int i2) {
        int i3 = i;
        while (i < i2) {
            int i4 = i + 1;
            if (str.charAt(i) == '%') {
                if (i4 == i2) {
                    break;
                }
                char charAt = str.charAt(i4);
                if (charAt == '%') {
                    sb.append(str, i3, i4);
                } else if (charAt == 'n') {
                    sb.append(str, i3, i4 - 1);
                    sb.append(a);
                }
                i = i4 + 1;
                i3 = i;
            }
            i = i4;
        }
        if (i3 < i2) {
            sb.append(str, i3, i2);
        }
    }

    /* access modifiers changed from: protected */
    public final void a(defpackage.cvy cvy) {
        int i;
        int i2;
        java.lang.String str = cvy.a.b;
        int a2 = a(str, 0);
        int i3 = 0;
        int i4 = -1;
        while (a2 >= 0) {
            int i5 = a2 + 1;
            int i6 = 0;
            int i7 = i5;
            while (i7 < str.length()) {
                int i8 = i7 + 1;
                char charAt = str.charAt(i7);
                char c = (char) (charAt - '0');
                if (c < 10) {
                    i6 = (i6 * 10) + c;
                    if (i6 >= 1000000) {
                        throw defpackage.cwa.a("index too large", str, a2, i8);
                    }
                    i7 = i8;
                } else {
                    if (charAt == '$') {
                        if ((i8 - 1) - i5 == 0) {
                            throw defpackage.cwa.a("missing index", str, a2, i8);
                        } else if (str.charAt(i5) == '0') {
                            throw defpackage.cwa.a("index has leading zero", str, a2, i8);
                        } else {
                            i2 = i6 - 1;
                            if (i8 == str.length()) {
                                throw defpackage.cwa.b("unterminated parameter", str, a2);
                            }
                            i = i8 + 1;
                            str.charAt(i8);
                        }
                    } else if (charAt != '<') {
                        int i9 = i3;
                        i3++;
                        i = i8;
                        i8 = i5;
                        i2 = i9;
                    } else if (i4 == -1) {
                        throw defpackage.cwa.a("invalid relative parameter", str, a2, i8);
                    } else if (i8 == str.length()) {
                        throw defpackage.cwa.b("unterminated parameter", str, a2);
                    } else {
                        i = i8 + 1;
                        str.charAt(i8);
                        i2 = i4;
                    }
                    int i10 = i - 1;
                    while (i10 < str.length()) {
                        if (((char) ((str.charAt(i10) & 65503) - 'A')) < 26) {
                            a2 = a(str, a(cvy, i2, str, a2, i8, i10));
                            i4 = i2;
                        } else {
                            i10++;
                        }
                    }
                    throw defpackage.cwa.b("unterminated parameter", str, a2);
                }
            }
            throw defpackage.cwa.b("unterminated parameter", str, a2);
        }
    }

    private static int a(java.lang.String str, int i) {
        while (i < str.length()) {
            int i2 = i + 1;
            if (str.charAt(i) != '%') {
                i = i2;
            } else if (i2 < str.length()) {
                char charAt = str.charAt(i2);
                if (charAt != '%' && charAt != 'n') {
                    return i2 - 1;
                }
                i = i2 + 1;
            } else {
                throw defpackage.cwa.b("trailing unquoted '%' character", str, i2 - 1);
            }
        }
        return -1;
    }
}
