package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: anp  reason: default package */
public final /* synthetic */ class anp implements anx {
    private final String a;

    anp(String str) {
        this.a = str;
    }

    @Override // defpackage.anx
    public final Object a(anu anu) {
        dih dih;
        String str = this.a;
        amb amb = anu.b;
        dbo[] dboArr = new dbo[1];
        dii d = ((dii) dbo.d.a(bg.ao)).d(str);
        dii dii = (dii) dab.b.a(bg.ao);
        dii.b();
        ((dab) dii.a).a = 2;
        d.b();
        dbo.b((dbo) d.a, dii);
        if (d.b) {
            dih = d.a;
        } else {
            dih dih2 = d.a;
            djz.a.a(dih2).c(dih2);
            d.b = true;
            dih = d.a;
        }
        dih dih3 = dih;
        if (!dih.a(dih3, Boolean.TRUE.booleanValue())) {
            throw new dkw();
        }
        dboArr[0] = (dbo) dih3;
        amb.a(dboArr);
        return null;
    }
}
