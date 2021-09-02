package defpackage;

/* renamed from: qh reason: default package */
/* compiled from: PG */
public final class qh {
    public static final defpackage.ql a = defpackage.qm.c;
    public static final java.lang.String b = java.lang.Character.toString(8206);
    public static final java.lang.String c = java.lang.Character.toString(8207);
    private static final defpackage.qh g = new defpackage.qh(false, 2, a);
    private static final defpackage.qh h = new defpackage.qh(true, 2, a);
    public final boolean d;
    public final int e;
    public final defpackage.ql f;

    public static defpackage.qh a() {
        defpackage.qi qiVar = new defpackage.qi();
        if (qiVar.b != 2 || qiVar.c != a) {
            return new defpackage.qh(qiVar.a, qiVar.b, qiVar.c);
        }
        if (qiVar.a) {
            return h;
        }
        return g;
    }

    private qh(boolean z, int i, defpackage.ql qlVar) {
        this.d = z;
        this.e = i;
        this.f = qlVar;
    }

    static boolean a(java.util.Locale locale) {
        return defpackage.qq.a(locale) == 1;
    }

    public static int a(java.lang.CharSequence charSequence) {
        defpackage.qj qjVar = new defpackage.qj(charSequence);
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
                default:
                    if (i != 0) {
                        break;
                    } else {
                        i = i2;
                        break;
                    }
            }
        }
        return 0;
    }

    public static int b(java.lang.CharSequence charSequence) {
        byte a2;
        defpackage.qj qjVar = new defpackage.qj(charSequence);
        qjVar.d = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (qjVar.d < qjVar.c && i == 0) {
            qjVar.e = qjVar.a.charAt(qjVar.d);
            if (java.lang.Character.isHighSurrogate(qjVar.e)) {
                int codePointAt = java.lang.Character.codePointAt(qjVar.a, qjVar.d);
                qjVar.d += java.lang.Character.charCount(codePointAt);
                a2 = java.lang.Character.getDirectionality(codePointAt);
            } else {
                qjVar.d++;
                a2 = defpackage.qj.a(qjVar.e);
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
                default:
                    i = i3;
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
