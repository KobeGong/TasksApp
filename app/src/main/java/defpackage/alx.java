package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: alx  reason: default package */
public final /* synthetic */ class alx implements crq {
    private final String a;

    alx(String str) {
        this.a = str;
    }

    @Override // defpackage.crq
    public final Object a(Object obj) {
        dca dca;
        dih dih;
        String str = this.a;
        dby dby = (dby) obj;
        dii dii = (dii) dby.a(bg.ao);
        dii.a((dih) dby);
        dii dii2 = dii;
        if (dby.e == null) {
            dca = dca.g;
        } else {
            dca = dby.e;
        }
        dii dii3 = (dii) dca.a(bg.ao);
        dii3.a((dih) dca);
        dii g = dii2.g(dii3.g(str));
        if (g.b) {
            dih = g.a;
        } else {
            dih dih2 = g.a;
            djz.a.a(dih2).c(dih2);
            g.b = true;
            dih = g.a;
        }
        dih dih3 = dih;
        if (dih.a(dih3, Boolean.TRUE.booleanValue())) {
            return (dby) dih3;
        }
        throw new dkw();
    }
}
