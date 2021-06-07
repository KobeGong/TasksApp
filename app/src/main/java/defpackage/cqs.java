package defpackage;

/* renamed from: cqs  reason: default package */
/* compiled from: PG */
public final class cqs implements cqm {
    private final cqv a;

    public cqs(cqv cqv) {
        this.a = cqv;
        if (!cqv.c) {
            cyi a2 = cqv.a.a(new cqx(cqv));
            a2.a(new cqw(cqv, a2), cyn.INSTANCE);
            cqv.c = true;
        }
    }

    @Override // defpackage.cqm
    public final CharSequence a(cqp cqp) {
        String str;
        if (cqp == null || cqp.a == null) {
            return null;
        }
        String[] strArr = cqp.a;
        for (String str2 : strArr) {
            if (str2 == null || str2.isEmpty() || str2.equals(".")) {
                str = null;
            } else if (str2.length() <= 2) {
                str = str2;
            } else {
                cqv cqv = this.a;
                cld.b(cqv.c);
                ri riVar = (ri) cqv.b.get();
                if (riVar == null) {
                    str = null;
                } else {
                    int length = str2.length();
                    int i = 0;
                    String str3 = null;
                    while (i < length && riVar != null) {
                        cqy cqy = (cqy) riVar.get(Character.valueOf(str2.charAt(i)));
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
