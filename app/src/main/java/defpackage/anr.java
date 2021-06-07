package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: anr  reason: default package */
public final /* synthetic */ class anr implements anx {
    private final int a;

    anr(int i) {
        this.a = i;
    }

    @Override // defpackage.anx
    public final Object a(anu anu) {
        dih dih;
        int i = this.a;
        if (i == 0) {
            return czq.NONE;
        }
        amb amb = anu.b;
        ead b = amb.b();
        dii dii = (dii) czm.c.a(bg.ao);
        czn czn = czn.ANDROID;
        dii.b();
        czm czm = (czm) dii.a;
        if (czn == null) {
            throw new NullPointerException();
        }
        czm.a = czn.a();
        dii.b();
        ((czm) dii.a).b = i;
        if (dii.b) {
            dih = dii.a;
        } else {
            dih dih2 = dii.a;
            djz.a.a(dih2).c(dih2);
            dii.b = true;
            dih = dii.a;
        }
        dih dih3 = dih;
        if (!dih.a(dih3, Boolean.TRUE.booleanValue())) {
            throw new dkw();
        }
        b.getClass();
        czq a2 = czq.a(((czp) amb.a((czm) dih3, new amd(b))).a);
        if (a2 == null) {
            return czq.UNRECOGNIZED;
        }
        return a2;
    }
}
