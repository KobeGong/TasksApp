package defpackage;

import java.util.Map;

/* renamed from: cba  reason: default package */
/* compiled from: PG */
public final class cba implements ecz {
    private final ecz a;
    private final ecz b;
    private final ecz c;
    private final ecz d;

    public cba(ecz ecz, ecz ecz2, ecz ecz3, ecz ecz4) {
        this.a = ecz;
        this.b = ecz2;
        this.c = ecz3;
        this.d = ecz4;
    }

    @Override // defpackage.ecz
    public final /* synthetic */ Object a() {
        caz caz = new caz();
        caz.d = (Map) this.a.a();
        caz.a = (bza) this.b.a();
        caz.b = (buu) this.c.a();
        this.d.a();
        return caz;
    }
}
