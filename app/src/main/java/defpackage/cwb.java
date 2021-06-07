package defpackage;

/* renamed from: cwb  reason: default package */
/* compiled from: PG */
public abstract class cwb extends cvz {
    private static final String a = a();

    private static String a() {
        try {
            String property = System.getProperty("line.separator");
            return property.matches("\\n|\\r(?:\\n)?") ? property : "\n";
        } catch (SecurityException e) {
        }
    }

    /* access modifiers changed from: package-private */
    public abstract int a(cvy cvy, int i, String str, int i2, int i3, int i4);

    protected cwb() {
        super(cts.PRINTF_STYLE);
    }

    @Override // defpackage.cvz
    public final void a(StringBuilder sb, String str, int i, int i2) {
        int i3 = i;
        while (i < i2) {
            int i4 = i + 1;
            if (str.charAt(i) == '%') {
                if (i4 == i2) {
                    break;
                }
                char charAt = str.charAt(i4);
                if (charAt == '%') {
                    sb.append((CharSequence) str, i3, i4);
                } else if (charAt == 'n') {
                    sb.append((CharSequence) str, i3, i4 - 1);
                    sb.append(a);
                }
                i = i4 + 1;
                i3 = i;
            }
            i = i4;
        }
        if (i3 < i2) {
            sb.append((CharSequence) str, i3, i2);
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.cvz
    public final void a(cvy cvy) {
        int i;
        int i2;
        String str = cvy.a.b;
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
                if (c < '\n') {
                    i6 = (i6 * 10) + c;
                    if (i6 >= 1000000) {
                        throw cwa.a("index too large", str, a2, i8);
                    }
                    i7 = i8;
                } else {
                    if (charAt == '$') {
                        if ((i8 - 1) - i5 == 0) {
                            throw cwa.a("missing index", str, a2, i8);
                        } else if (str.charAt(i5) == '0') {
                            throw cwa.a("index has leading zero", str, a2, i8);
                        } else {
                            i2 = i6 - 1;
                            if (i8 == str.length()) {
                                throw cwa.b("unterminated parameter", str, a2);
                            }
                            i = i8 + 1;
                            str.charAt(i8);
                        }
                    } else if (charAt != '<') {
                        i3++;
                        i = i8;
                        i8 = i5;
                        i2 = i3;
                    } else if (i4 == -1) {
                        throw cwa.a("invalid relative parameter", str, a2, i8);
                    } else if (i8 == str.length()) {
                        throw cwa.b("unterminated parameter", str, a2);
                    } else {
                        i = i8 + 1;
                        str.charAt(i8);
                        i2 = i4;
                    }
                    for (int i9 = i - 1; i9 < str.length(); i9++) {
                        if (((char) ((str.charAt(i9) & 65503) - 65)) < 26) {
                            a2 = a(str, a(cvy, i2, str, a2, i8, i9));
                            i4 = i2;
                        }
                    }
                    throw cwa.b("unterminated parameter", str, a2);
                }
            }
            throw cwa.b("unterminated parameter", str, a2);
        }
    }

    private static int a(String str, int i) {
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
                throw cwa.b("trailing unquoted '%' character", str, i2 - 1);
            }
        }
        return -1;
    }
}
