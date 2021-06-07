package defpackage;

import java.util.Map;

/* renamed from: cay  reason: default package */
/* compiled from: PG */
public final class cay implements ecz {
    private final ecz a;
    private final ecz b;

    public cay(ecz ecz, ecz ecz2) {
        this.a = ecz;
        this.b = ecz2;
    }

    @Override // defpackage.ecz
    public final /* synthetic */ Object a() {
        cax cax = new cax();
        cax.d = (Map) this.a.a();
        cax.a = (bza) this.b.a();
        return cax;
    }
}
