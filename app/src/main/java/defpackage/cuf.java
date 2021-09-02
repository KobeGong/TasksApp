package defpackage;

/* renamed from: cuf reason: default package */
/* compiled from: PG */
public final class cuf {
    public static final defpackage.cuf a = new defpackage.cuf(0, -1, -1);
    private static final long e;
    public final int b;
    public final int c;
    public final int d;

    private static int a(char c2) {
        return ((int) ((e >>> ((c2 - ' ') * 3)) & 7)) - 1;
    }

    public static defpackage.cuf a(java.lang.String str, int i, int i2, boolean z) {
        if (i == i2 && !z) {
            return a;
        }
        int i3 = z ? 128 : 0;
        while (i != i2) {
            int i4 = i + 1;
            char charAt = str.charAt(i);
            if (charAt < ' ' || charAt > '0') {
                int i5 = i4 - 1;
                if (charAt > '9') {
                    throw defpackage.cwa.a("invalid flag", str, i5);
                }
                int i6 = charAt - '0';
                int i7 = i4;
                int i8 = i6;
                while (i7 != i2) {
                    int i9 = i7 + 1;
                    char charAt2 = str.charAt(i7);
                    if (charAt2 == '.') {
                        return new defpackage.cuf(i3, i8, a(str, i9, i2));
                    }
                    char c2 = (char) (charAt2 - '0');
                    if (c2 >= 10) {
                        throw defpackage.cwa.a("invalid width character", str, i9 - 1);
                    }
                    int i10 = c2 + (i8 * 10);
                    if (i10 > 999999) {
                        throw defpackage.cwa.a("width too large", str, i5, i2);
                    }
                    i8 = i10;
                    i7 = i9;
                }
                return new defpackage.cuf(i3, i8, -1);
            }
            int a2 = a(charAt);
            if (a2 >= 0) {
                int i11 = 1 << a2;
                if ((i3 & i11) != 0) {
                    throw defpackage.cwa.a("repeated flag", str, i4 - 1);
                }
                i3 = i11 | i3;
                i = i4;
            } else if (charAt == '.') {
                return new defpackage.cuf(i3, -1, a(str, i4, i2));
            } else {
                throw defpackage.cwa.a("invalid flag", str, i4 - 1);
            }
        }
        return new defpackage.cuf(i3, -1, -1);
    }

    private static int a(java.lang.String str, int i, int i2) {
        if (i == i2) {
            throw defpackage.cwa.a("missing precision", str, i - 1);
        }
        int i3 = 0;
        for (int i4 = i; i4 < i2; i4++) {
            char charAt = (char) (str.charAt(i4) - '0');
            if (charAt >= 10) {
                throw defpackage.cwa.a("invalid precision character", str, i4);
            }
            i3 = (i3 * 10) + charAt;
            if (i3 > 999999) {
                throw defpackage.cwa.a("precision too large", str, i, i2);
            }
        }
        if (i3 != 0 || i2 == i + 1) {
            return i3;
        }
        throw defpackage.cwa.a("invalid precision", str, i, i2);
    }

    static int a(java.lang.String str, boolean z) {
        int i;
        if (z) {
            i = 128;
        } else {
            i = 0;
        }
        for (int i2 = 0; i2 < str.length(); i2++) {
            int a2 = a(str.charAt(i2));
            if (a2 < 0) {
                java.lang.String str2 = "invalid flags: ";
                java.lang.String valueOf = java.lang.String.valueOf(str);
                throw new java.lang.IllegalArgumentException(valueOf.length() != 0 ? str2.concat(valueOf) : new java.lang.String(str2));
            }
            i |= 1 << a2;
        }
        return i;
    }

    cuf(int i, int i2, int i3) {
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final boolean a() {
        return this == a;
    }

    public final boolean a(int i, boolean z) {
        boolean z2;
        if (a()) {
            return true;
        }
        if ((this.b & (i ^ -1)) != 0) {
            return false;
        }
        if (!z && this.d != -1) {
            return false;
        }
        int i2 = this.b;
        if (this.c != -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((i2 & 9) == 9) {
            return false;
        }
        if ((i2 & 96) == 96) {
            return false;
        }
        if ((i2 & 96) == 0 || z2) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        return (this.b & 128) != 0;
    }

    public final java.lang.StringBuilder a(java.lang.StringBuilder sb) {
        if (!a()) {
            int i = this.b & -129;
            for (int i2 = 0; (1 << i2) <= i; i2++) {
                if (((1 << i2) & i) != 0) {
                    sb.append(" #(+,-0".charAt(i2));
                }
            }
            if (this.c != -1) {
                sb.append(this.c);
            }
            if (this.d != -1) {
                sb.append('.').append(this.d);
            }
        }
        return sb;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.cuf)) {
            return false;
        }
        defpackage.cuf cuf = (defpackage.cuf) obj;
        if (cuf.b == this.b && cuf.c == this.c && cuf.d == this.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.b * 31) + this.c) * 31) + this.d;
    }

    static {
        long j = 0;
        for (int i = 0; i < 7; i++) {
            j |= (((long) i) + 1) << ((int) (((long) (" #(+,-0".charAt(i) - ' ')) * 3));
        }
        e = j;
    }
}
