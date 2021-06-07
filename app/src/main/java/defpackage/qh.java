package defpackage;

import java.util.Locale;

/* renamed from: qh  reason: default package */
/* compiled from: PG */
public final class qh {
    public static final ql a = qm.c;
    public static final String b = Character.toString(8206);
    public static final String c = Character.toString(8207);
    private static final qh g = new qh(false, 2, a);
    private static final qh h = new qh(true, 2, a);
    public final boolean d;
    public final int e;
    public final ql f;

    public static qh a() {
        qi qiVar = new qi();
        if (qiVar.b != 2 || qiVar.c != a) {
            return new qh(qiVar.a, qiVar.b, qiVar.c);
        }
        if (qiVar.a) {
            return h;
        }
        return g;
    }

    private qh(boolean z, int i, ql qlVar) {
        this.d = z;
        this.e = i;
        this.f = qlVar;
    }

    static boolean a(Locale locale) {
        return qq.a(locale) == 1;
    }

    public static int a(CharSequence charSequence) {
        qj qjVar = new qj(charSequence);
        qjVar.d = qjVar.c;
        int i = 0;
        int i2 = 0;
        while (qjVar.d > 0) {
            switch (qjVar.a()) {
                case 0:
                    if (i2 != 0) {
                        if (i != 0) {
                            break;
                        } else {
                            i = i2;
                            break;
                        }
                    } else {
                        return -1;
                    }
                case 1:
                case 2:
                    if (i2 != 0) {
                        if (i != 0) {
                            break;
                        } else {
                            i = i2;
                            break;
                        }
                    } else {
                        return 1;
                    }
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 10:
                case 11:
                case 12:
                case 13:
                default:
                    if (i != 0) {
                        break;
                    } else {
                        i = i2;
                        break;
                    }
                case 9:
                    break;
                case 14:
                case 15:
                    if (i != i2) {
                        i2--;
                        break;
                    } else {
                        return -1;
                    }
                case 16:
                case 17:
                    if (i != i2) {
                        i2--;
                        break;
                    } else {
                        return 1;
                    }
                case 18:
                    i2++;
                    break;
            }
        }
        return 0;
    }

    public static int b(CharSequence charSequence) {
        byte a2;
        qj qjVar = new qj(charSequence);
        qjVar.d = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (qjVar.d < qjVar.c && i == 0) {
            qjVar.e = qjVar.a.charAt(qjVar.d);
            if (Character.isHighSurrogate(qjVar.e)) {
                int codePointAt = Character.codePointAt(qjVar.a, qjVar.d);
                qjVar.d += Character.charCount(codePointAt);
                a2 = Character.getDirectionality(codePointAt);
            } else {
                qjVar.d++;
                a2 = qj.a(qjVar.e);
                boolean z = qjVar.b;
            }
            switch (a2) {
                case 0:
                    if (i3 != 0) {
                        i = i3;
                        break;
                    } else {
                        return -1;
                    }
                case 1:
                case 2:
                    if (i3 != 0) {
                        i = i3;
                        break;
                    } else {
                        return 1;
                    }
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 10:
                case 11:
                case 12:
                case 13:
                default:
                    i = i3;
                    break;
                case 9:
                    break;
                case 14:
                case 15:
                    i3++;
                    i2 = -1;
                    break;
                case 16:
                case 17:
                    i3++;
                    i2 = 1;
                    break;
                case 18:
                    i3--;
                    i2 = 0;
                    break;
            }
        }
        if (i != 0) {
            if (i2 == 0) {
                while (qjVar.d > 0) {
                    switch (qjVar.a()) {
                        case 14:
                        case 15:
                            if (i != i3) {
                                i3--;
                                break;
                            } else {
                                return -1;
                            }
                        case 16:
                        case 17:
                            if (i != i3) {
                                i3--;
                                break;
                            } else {
                                return 1;
                            }
                        case 18:
                            i3++;
                            break;
                    }
                }
            } else {
                return i2;
            }
        }
        return 0;
    }
}
