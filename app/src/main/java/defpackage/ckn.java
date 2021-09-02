package defpackage;

/* renamed from: ckn reason: default package */
/* compiled from: PG */
public final class ckn {
    public final java.util.ArrayList a = new java.util.ArrayList();

    public final defpackage.ckn a(int i, defpackage.chl chl, defpackage.chl chl2) {
        if (!(chl == null || chl2 == null)) {
            defpackage.chl chl3 = new defpackage.chl(chl2.a - chl.a, chl2.b - chl.b);
            defpackage.efb efb = new defpackage.efb();
            efb.b = new defpackage.eep();
            efb.b.a = java.lang.Long.valueOf(chl3.b / 1000);
            efb.b.b = java.lang.Long.valueOf(chl3.a / 1000);
            efb.a = i;
            this.a.add(efb);
        }
        return this;
    }
}
