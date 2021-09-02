package defpackage;

/* renamed from: cqs reason: default package */
/* compiled from: PG */
public final class cqs implements defpackage.cqm {
    private final defpackage.cqv a;

    public cqs(defpackage.cqv cqv) {
        this.a = cqv;
        if (!cqv.c) {
            defpackage.cyi a2 = cqv.a.a((java.util.concurrent.Callable) new defpackage.cqx(cqv));
            a2.a(new defpackage.cqw(cqv, a2), defpackage.cyn.a);
            cqv.c = true;
        }
    }

    public final java.lang.CharSequence a(defpackage.cqp cqp) {
        java.lang.String[] strArr;
        java.lang.String str;
        if (cqp == null || cqp.a == null) {
            return null;
        }
        for (java.lang.String str2 : cqp.a) {
            if (str2 == null || str2.isEmpty() || str2.equals(".")) {
                str = null;
            } else if (str2.length() <= 2) {
                str = str2;
            } else {
                defpackage.cqv cqv = this.a;
                defpackage.cld.b(cqv.c);
                defpackage.ri riVar = (defpackage.ri) cqv.b.get();
                if (riVar == null) {
                    str = null;
                } else {
                    int length = str2.length();
                    int i = 0;
                    java.lang.String str3 = null;
                    while (i < length && riVar != null) {
                        defpackage.cqy cqy = (defpackage.cqy) riVar.get(java.lang.Character.valueOf(str2.charAt(i)));
                        if (cqy == null) {
                            break;
                        }
                        if (cqy.b != null) {
                            str3 = cqy.b;
                        }
                        i++;
                        riVar = cqy.a;
                    }
                    str = str3;
                }
                if (str == null) {
                    str = str2.substring(0, 1);
                }
            }
            if (str != null) {
                return str;
            }
        }
        return null;
    }
}
