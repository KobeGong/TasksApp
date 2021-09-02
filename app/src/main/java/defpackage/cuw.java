package defpackage;

/* renamed from: cuw reason: default package */
/* compiled from: PG */
public final class cuw extends defpackage.cvy implements defpackage.cvu {
    private static final java.util.Locale d = java.util.Locale.ROOT;
    private final java.lang.Object[] e;
    private final java.lang.StringBuilder f = new java.lang.StringBuilder();
    private int g = 0;

    public static void a(defpackage.cuo cuo, defpackage.cux cux) {
        java.lang.String a;
        defpackage.cur k = cuo.k();
        java.lang.Throwable th = (java.lang.Throwable) k.b(defpackage.ctp.a);
        boolean z = k.a() == 0 || (k.a() == 1 && th != null);
        if (cuo.g() == null) {
            a = a(cuo.i());
            if (!z) {
                a = a(new java.lang.StringBuilder(a), k);
            }
        } else {
            defpackage.cuw cuw = new defpackage.cuw(cuo.g(), cuo.h());
            cuw.a.a.a(cuw);
            if ((cuw.b & (cuw.b + 1)) != 0 || (cuw.c > 31 && cuw.b != -1)) {
                throw new defpackage.cwa(java.lang.String.format("unreferenced arguments [first missing index=%d]", new java.lang.Object[]{java.lang.Integer.valueOf(java.lang.Integer.numberOfTrailingZeros(cuw.b ^ -1))}));
            }
            java.lang.StringBuilder sb = (java.lang.StringBuilder) cuw.c();
            if (cuo.h().length > cuw.c + 1) {
                sb.append(" [ERROR: UNUSED LOG ARGUMENTS]");
            }
            a = z ? sb.toString() : a(sb, k);
        }
        cux.a(cuo.d(), a, th);
    }

    public static java.lang.String a(java.lang.Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            if (!obj.getClass().isArray()) {
                return java.lang.String.valueOf(obj);
            }
            if (obj instanceof int[]) {
                return java.util.Arrays.toString((int[]) obj);
            }
            if (obj instanceof long[]) {
                return java.util.Arrays.toString((long[]) obj);
            }
            if (obj instanceof byte[]) {
                return java.util.Arrays.toString((byte[]) obj);
            }
            if (obj instanceof char[]) {
                return java.util.Arrays.toString((char[]) obj);
            }
            if (obj instanceof short[]) {
                return java.util.Arrays.toString((short[]) obj);
            }
            if (obj instanceof float[]) {
                return java.util.Arrays.toString((float[]) obj);
            }
            if (obj instanceof double[]) {
                return java.util.Arrays.toString((double[]) obj);
            }
            if (obj instanceof boolean[]) {
                return java.util.Arrays.toString((boolean[]) obj);
            }
            return java.util.Arrays.toString((java.lang.Object[]) obj);
        } catch (java.lang.RuntimeException e2) {
            return a(obj, e2);
        }
    }

    private static java.lang.String a(java.lang.Object obj, java.lang.RuntimeException runtimeException) {
        java.lang.String simpleName;
        try {
            simpleName = runtimeException.toString();
        } catch (java.lang.RuntimeException e2) {
            simpleName = e2.getClass().getSimpleName();
        }
        java.lang.String name = obj.getClass().getName();
        return new java.lang.StringBuilder(java.lang.String.valueOf(name).length() + 16 + java.lang.String.valueOf(simpleName).length()).append("{").append(name).append("@").append(java.lang.System.identityHashCode(obj)).append(": ").append(simpleName).append("}").toString();
    }

    private static java.lang.String a(java.lang.StringBuilder sb, defpackage.cur cur) {
        defpackage.cum cum = new defpackage.cum("[CONTEXT ", " ]", sb);
        defpackage.cuy cuy = null;
        for (int i = 0; i < cur.a(); i++) {
            defpackage.cuc a = cur.a(i);
            if (!a.equals(defpackage.ctp.a)) {
                if (a.equals(defpackage.ctp.f)) {
                    cuy = (defpackage.cuy) defpackage.ctp.f.a(cur.b(i));
                } else {
                    cum.a(a.a, cur.b(i));
                }
            }
        }
        if (cuy != null) {
            cuy.a(cum);
        }
        cum.a();
        return sb.toString();
    }

    private cuw(defpackage.cvf cvf, java.lang.Object[] objArr) {
        super(cvf);
        this.e = (java.lang.Object[]) defpackage.cub.a((java.lang.Object) objArr, "log arguments");
    }

    public final void a(int i, int i2, defpackage.cvt cvt) {
        this.a.a.a(this.f, this.a.b, this.g, i);
        java.lang.Object[] objArr = this.e;
        if (cvt.a < objArr.length) {
            java.lang.Object obj = objArr[cvt.a];
            if (obj != null) {
                cvt.a(this, obj);
            } else {
                b();
            }
        } else {
            a();
        }
        this.g = i2;
    }

    public final void a(java.lang.Object obj, defpackage.cue cue, defpackage.cuf cuf) {
        defpackage.cuf cuf2;
        int i;
        int i2;
        int i3 = 0;
        if (cue.d.a(obj)) {
            java.lang.StringBuilder sb = this.f;
            switch (cue.ordinal()) {
                case 0:
                    if (obj instanceof java.util.Formattable) {
                        java.util.Formattable formattable = (java.util.Formattable) obj;
                        int i4 = cuf.b & 162;
                        if (i4 != 0) {
                            int i5 = (i4 & 32) != 0 ? 1 : 0;
                            if ((i4 & 128) != 0) {
                                i2 = 2;
                            } else {
                                i2 = 0;
                            }
                            int i6 = i2 | i5;
                            if ((i4 & 2) != 0) {
                                i3 = 4;
                            }
                            i = i3 | i6;
                        } else {
                            i = i4;
                        }
                        int length = sb.length();
                        java.util.Formatter formatter = new java.util.Formatter(sb, d);
                        try {
                            formattable.formatTo(formatter, i, cuf.c, cuf.d);
                            return;
                        } catch (java.lang.RuntimeException e2) {
                            sb.setLength(length);
                            try {
                                formatter.out().append(a((java.lang.Object) formattable, e2));
                                return;
                            } catch (java.io.IOException e3) {
                                return;
                            }
                        }
                    } else if (cuf.a()) {
                        sb.append(a(obj));
                        return;
                    }
                    break;
                case 1:
                case 3:
                    if (cuf.a()) {
                        sb.append(obj);
                        return;
                    }
                    break;
                case 2:
                    if (cuf.a()) {
                        if (obj instanceof java.lang.Character) {
                            sb.append(obj);
                            return;
                        }
                        int intValue = ((java.lang.Number) obj).intValue();
                        if (java.lang.Character.isBmpCodePoint(intValue)) {
                            sb.append((char) intValue);
                            return;
                        } else {
                            sb.append(java.lang.Character.toChars(intValue));
                            return;
                        }
                    }
                    break;
                case 5:
                    if (cuf.a()) {
                        cuf2 = cuf;
                    } else {
                        int i7 = cuf.b & 128;
                        if (i7 == 0) {
                            cuf2 = defpackage.cuf.a;
                        } else if (i7 == cuf.b && -1 == cuf.c && -1 == cuf.d) {
                            cuf2 = cuf;
                        } else {
                            cuf2 = new defpackage.cuf(i7, -1, -1);
                        }
                    }
                    if (cuf2.equals(cuf)) {
                        java.lang.Number number = (java.lang.Number) obj;
                        boolean b = cuf.b();
                        long longValue = number.longValue();
                        if (number instanceof java.lang.Long) {
                            a(sb, longValue, b);
                            return;
                        } else if (number instanceof java.lang.Integer) {
                            a(sb, longValue & 4294967295L, b);
                            return;
                        } else if (number instanceof java.lang.Byte) {
                            a(sb, longValue & 255, b);
                            return;
                        } else if (number instanceof java.lang.Short) {
                            a(sb, longValue & 65535, b);
                            return;
                        } else if (number instanceof java.math.BigInteger) {
                            java.lang.String bigInteger = ((java.math.BigInteger) number).toString(16);
                            if (b) {
                                bigInteger = bigInteger.toUpperCase(d);
                            }
                            sb.append(bigInteger);
                            return;
                        } else {
                            java.lang.String valueOf = java.lang.String.valueOf(number.getClass());
                            throw new java.lang.RuntimeException(new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 25).append("unsupported number type: ").append(valueOf).toString());
                        }
                    }
                    break;
            }
            java.lang.String str = cue.f;
            if (!cuf.a()) {
                char c = cue.c;
                if (cuf.b()) {
                    c = (char) (c & 65503);
                }
                str = cuf.a(new java.lang.StringBuilder("%")).append(c).toString();
            }
            sb.append(java.lang.String.format(d, str, new java.lang.Object[]{obj}));
            return;
        }
        a(this.f, obj, cue.f);
    }

    public final void a(java.lang.Object obj, defpackage.cvr cvr, defpackage.cuf cuf) {
        if ((obj instanceof java.util.Date) || (obj instanceof java.util.Calendar) || (obj instanceof java.lang.Long)) {
            this.f.append(java.lang.String.format(d, cuf.a(new java.lang.StringBuilder("%")).append(cuf.b() ? 'T' : 't').append(cvr.b).toString(), new java.lang.Object[]{obj}));
            return;
        }
        a(this.f, obj, "%t" + cvr.b);
    }

    public final void a() {
        this.f.append("[ERROR: MISSING LOG ARGUMENT]");
    }

    public final void b() {
        this.f.append("null");
    }

    private static void a(java.lang.StringBuilder sb, long j, boolean z) {
        if (j == 0) {
            sb.append("0");
            return;
        }
        java.lang.String str = z ? "0123456789ABCDEF" : "0123456789abcdef";
        for (int numberOfLeadingZeros = (63 - java.lang.Long.numberOfLeadingZeros(j)) & -4; numberOfLeadingZeros >= 0; numberOfLeadingZeros -= 4) {
            sb.append(str.charAt((int) ((j >>> numberOfLeadingZeros) & 15)));
        }
    }

    private static void a(java.lang.StringBuilder sb, java.lang.Object obj, java.lang.String str) {
        sb.append("[INVALID: format=").append(str).append(", type=").append(obj.getClass().getCanonicalName()).append(", value=").append(a(obj)).append("]");
    }

    public final /* synthetic */ java.lang.Object c() {
        this.a.a.a(this.f, this.a.b, this.g, this.a.b.length());
        return this.f;
    }
}
