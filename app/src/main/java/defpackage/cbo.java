package defpackage;

import android.content.Context;

/* renamed from: cbo  reason: default package */
/* compiled from: PG */
public final class cbo implements ecz {
    private final ecz a;
    private final ecz b;

    public cbo(ecz ecz, ecz ecz2) {
        this.a = ecz;
        this.b = ecz2;
    }

    @Override // defpackage.ecz
    public final /* synthetic */ Object a() {
        cbj cbj = new cbj();
        cbj.a = (Context) this.a.a();
        cbj.b = (buc) this.b.a();
        return cbj;
    }
}
