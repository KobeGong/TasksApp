package defpackage;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Formattable;
import java.util.Formatter;
import java.util.Locale;

/* renamed from: cuw  reason: default package */
/* compiled from: PG */
public final class cuw extends cvy implements cvu {
    private static final Locale d = Locale.ROOT;
    private final Object[] e;
    private final StringBuilder f = new StringBuilder();
    private int g = 0;

    public static void a(cuo cuo, cux cux) {
        String sb;
        cur k = cuo.k();
        Throwable th = (Throwable) k.b(ctp.a);
        boolean z = k.a() == 0 || (k.a() == 1 && th != null);
        if (cuo.g() == null) {
            sb = a(cuo.i());
            if (!z) {
                sb = a(new StringBuilder(sb), k);
            }
        } else {
            cuw cuw = new cuw(cuo.g(), cuo.h());
            cuw.a.a.a(cuw);
            if ((cuw.b & (cuw.b + 1)) != 0 || (cuw.c > 31 && cuw.b != -1)) {
                throw new cwa(String.format("unreferenced arguments [first missing index=%d]", Integer.valueOf(Integer.numberOfTrailingZeros(cuw.b ^ -1))));
            }
            StringBuilder sb2 = (StringBuilder) cuw.c();
            if (cuo.h().length > cuw.c + 1) {
                sb2.append(" [ERROR: UNUSED LOG ARGUMENTS]");
            }
            sb = z ? sb2.toString() : a(sb2, k);
        }
        cux.a(cuo.d(), sb, th);
    }

    public static String a(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            if (!obj.getClass().isArray()) {
                return String.valueOf(obj);
            }
            if (obj instanceof int[]) {
                return Arrays.toString((int[]) obj);
            }
            if (obj instanceof long[]) {
                return Arrays.toString((long[]) obj);
            }
            if (obj instanceof byte[]) {
                return Arrays.toString((byte[]) obj);
            }
            if (obj instanceof char[]) {
                return Arrays.toString((char[]) obj);
            }
            if (obj instanceof short[]) {
                return Arrays.toString((short[]) obj);
            }
            if (obj instanceof float[]) {
                return Arrays.toString((float[]) obj);
            }
            if (obj instanceof double[]) {
                return Arrays.toString((double[]) obj);
            }
            if (obj instanceof boolean[]) {
                return Arrays.toString((boolean[]) obj);
            }
            return Arrays.toString((Object[]) obj);
        } catch (RuntimeException e2) {
            return a(obj, e2);
        }
    }

    private static String a(Object obj, RuntimeException runtimeException) {
        String simpleName;
        try {
            simpleName = runtimeException.toString();
        } catch (RuntimeException e2) {
            simpleName = e2.getClass().getSimpleName();
        }
        String name = obj.getClass().getName();
        return new StringBuilder(String.valueOf(name).length() + 16 + String.valueOf(simpleName).length()).append("{").append(name).append("@").append(System.identityHashCode(obj)).append(": ").append(simpleName).append("}").toString();
    }

    private static String a(StringBuilder sb, cur cur) {
        cum cum = new cum("[CONTEXT ", " ]", sb);
        cuy cuy = null;
        for (int i = 0; i < cur.a(); i++) {
            cuc a = cur.a(i);
            if (!a.equals(ctp.a)) {
                if (a.equals(ctp.f)) {
                    cuy = (cuy) ctp.f.a(cur.b(i));
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

    private cuw(cvf cvf, Object[] objArr) {
        super(cvf);
        this.e = (Object[]) cub.a(objArr, "log arguments");
    }

    @Override // defpackage.cvy
    public final void a(int i, int i2, cvt cvt) {
        this.a.a.a(this.f, this.a.b, this.g, i);
        Object[] objArr = this.e;
        if (cvt.a < objArr.length) {
            Object obj = objArr[cvt.a];
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

    @Override // defpackage.cvu
    public final void a(Object obj, cue cue, cuf cuf) {
        cuf cuf2;
        int i;
        int i2;
        int i3 = 0;
        if (cue.d.a(obj)) {
            StringBuilder sb = this.f;
            switch (cue.ordinal()) {
                case 0:
                    if (obj instanceof Formattable) {
                        Formattable formattable = (Formattable) obj;
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
                        Formatter formatter = new Formatter(sb, d);
                        try {
                            formattable.formatTo(formatter, i, cuf.c, cuf.d);
                            return;
                        } catch (RuntimeException e2) {
                            sb.setLength(length);
                            try {
                                formatter.out().append(a(formattable, e2));
                                return;
                            } catch (IOException e3) {
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
                        if (obj instanceof Character) {
                            sb.append(obj);
                            return;
                        }
                        int intValue = ((Number) obj).intValue();
                        if (Character.isBmpCodePoint(intValue)) {
                            sb.append((char) intValue);
                            return;
                        } else {
                            sb.append(Character.toChars(intValue));
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
                            cuf2 = cuf.a;
                        } else if (i7 == cuf.b && -1 == cuf.c && -1 == cuf.d) {
                            cuf2 = cuf;
                        } else {
                            cuf2 = new cuf(i7, -1, -1);
                        }
                    }
                    if (cuf2.equals(cuf)) {
                        Number number = (Number) obj;
                        boolean b = cuf.b();
                        long longValue = number.longValue();
                        if (number instanceof Long) {
                            a(sb, longValue, b);
                            return;
                        } else if (number instanceof Integer) {
                            a(sb, longValue & 4294967295L, b);
                            return;
                        } else if (number instanceof Byte) {
                            a(sb, longValue & 255, b);
                            return;
                        } else if (number instanceof Short) {
                            a(sb, longValue & 65535, b);
                            return;
                        } else if (number instanceof BigInteger) {
                            String bigInteger = ((BigInteger) number).toString(16);
                            if (b) {
                                bigInteger = bigInteger.toUpperCase(d);
                            }
                            sb.append(bigInteger);
                            return;
                        } else {
                            String valueOf = String.valueOf(number.getClass());
                            throw new RuntimeException(new StringBuilder(String.valueOf(valueOf).length() + 25).append("unsupported number type: ").append(valueOf).toString());
                        }
                    }
                    break;
            }
            String str = cue.f;
            if (!cuf.a()) {
                char c = cue.c;
                if (cuf.b()) {
                    c = (char) (c & 65503);
                }
                str = cuf.a(new StringBuilder("%")).append(c).toString();
            }
            sb.append(String.format(d, str, obj));
            return;
        }
        a(this.f, obj, cue.f);
    }

    @Override // defpackage.cvu
    public final void a(Object obj, cvr cvr, cuf cuf) {
        if ((obj instanceof Date) || (obj instanceof Calendar) || (obj instanceof Long)) {
            this.f.append(String.format(d, cuf.a(new StringBuilder("%")).append(cuf.b() ? 'T' : 't').append(cvr.b).toString(), obj));
            return;
        }
        a(this.f, obj, new StringBuilder(3).append("%t").append(cvr.b).toString());
    }

    @Override // defpackage.cvu
    public final void a() {
        this.f.append("[ERROR: MISSING LOG ARGUMENT]");
    }

    @Override // defpackage.cvu
    public final void b() {
        this.f.append("null");
    }

    private static void a(StringBuilder sb, long j, boolean z) {
        if (j == 0) {
            sb.append("0");
            return;
        }
        String str = z ? "0123456789ABCDEF" : "0123456789abcdef";
        for (int numberOfLeadingZeros = (63 - Long.numberOfLeadingZeros(j)) & -4; numberOfLeadingZeros >= 0; numberOfLeadingZeros -= 4) {
            sb.append(str.charAt((int) ((j >>> numberOfLeadingZeros) & 15)));
        }
    }

    private static void a(StringBuilder sb, Object obj, String str) {
        sb.append("[INVALID: format=").append(str).append(", type=").append(obj.getClass().getCanonicalName()).append(", value=").append(a(obj)).append("]");
    }

    @Override // defpackage.cvy
    public final /* synthetic */ Object c() {
        this.a.a.a(this.f, this.a.b, this.g, this.a.b.length());
        return this.f;
    }
}
