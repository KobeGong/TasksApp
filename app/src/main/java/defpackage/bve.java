package defpackage;

import android.content.Context;

/* renamed from: bve  reason: default package */
/* compiled from: PG */
public final class bve implements ecz {
    private final ecz a;
    private final ecz b;
    private final ecz c;

    public bve(ecz ecz, ecz ecz2, ecz ecz3) {
        this.a = ecz;
        this.b = ecz2;
        this.c = ecz3;
    }

    @Override // defpackage.ecz
    public final /* synthetic */ Object a() {
        buu buu = new buu();
        buu.a = (Context) this.a.a();
        buu.b = (bup) this.b.a();
        this.c.a();
        return buu;
    }
}
