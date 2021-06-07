package defpackage;

import java.util.ArrayList;

/* renamed from: ckn  reason: default package */
/* compiled from: PG */
public final class ckn {
    public final ArrayList a = new ArrayList();

    public final ckn a(int i, chl chl, chl chl2) {
        if (!(chl == null || chl2 == null)) {
            chl chl3 = new chl(chl2.a - chl.a, chl2.b - chl.b);
            efb efb = new efb();
            efb.b = new eep();
            efb.b.a = Long.valueOf(chl3.b / 1000);
            efb.b.b = Long.valueOf(chl3.a / 1000);
            efb.a = i;
            this.a.add(efb);
        }
        return this;
    }
}
