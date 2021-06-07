package defpackage;

import java.util.Map;

/* renamed from: cal  reason: default package */
/* compiled from: PG */
public final class cal implements ecz {
    private final ecz a;
    private final ecz b;
    private final ecz c;
    private final ecz d;

    public cal(ecz ecz, ecz ecz2, ecz ecz3, ecz ecz4) {
        this.a = ecz;
        this.b = ecz2;
        this.c = ecz3;
        this.d = ecz4;
    }

    @Override // defpackage.ecz
    public final /* synthetic */ Object a() {
        cak cak = new cak();
        cak.d = (Map) this.a.a();
        cak.a = (bza) this.b.a();
        cak.b = (buu) this.c.a();
        cak.c = (cae) this.d.a();
        return cak;
    }
}
