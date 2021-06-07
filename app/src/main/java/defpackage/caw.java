package defpackage;

import java.util.Map;

/* renamed from: caw  reason: default package */
/* compiled from: PG */
public final class caw implements ecz {
    private final ecz a;
    private final ecz b;
    private final ecz c;

    public caw(ecz ecz, ecz ecz2, ecz ecz3) {
        this.a = ecz;
        this.b = ecz2;
        this.c = ecz3;
    }

    @Override // defpackage.ecz
    public final /* synthetic */ Object a() {
        cav cav = new cav((bza) this.a.a(), (buu) this.b.a());
        cav.d = (Map) this.c.a();
        return cav;
    }
}
