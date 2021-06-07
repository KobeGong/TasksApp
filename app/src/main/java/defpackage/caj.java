package defpackage;

import android.content.Context;

/* renamed from: caj  reason: default package */
/* compiled from: PG */
public final class caj implements ecz {
    private final ecz a;
    private final ecz b;

    public caj(ecz ecz, ecz ecz2) {
        this.a = ecz;
        this.b = ecz2;
    }

    @Override // defpackage.ecz
    public final /* synthetic */ Object a() {
        cai cai = new cai();
        cai.a = (Context) this.a.a();
        cai.b = (buc) this.b.a();
        return cai;
    }
}
