package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: aly  reason: default package */
public final /* synthetic */ class aly implements crq {
    private final dmk a;

    aly(dmk dmk) {
        this.a = dmk;
    }

    @Override // defpackage.crq
    public final Object a(Object obj) {
        dca dca;
        dih dih;
        dmk dmk = this.a;
        dby dby = (dby) obj;
        if (dby.e == null) {
            dca = dca.g;
        } else {
            dca = dby.e;
        }
        dii dii = (dii) dca.a(bg.ao);
        dii.a((dih) dca);
        dii dii2 = dii;
        if (dmk == null) {
            dii2.g();
        } else {
            dii2.a(dmk);
        }
        dii dii3 = (dii) dby.a(bg.ao);
        dii3.a((dih) dby);
        dii g = dii3.g(dii2);
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
