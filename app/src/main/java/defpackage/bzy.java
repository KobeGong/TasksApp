package defpackage;

import android.content.Context;

/* renamed from: bzy  reason: default package */
/* compiled from: PG */
public final class bzy implements ecz {
    private final ecz a;
    private final ecz b;
    private final ecz c;

    public bzy(ecz ecz, ecz ecz2, ecz ecz3) {
        this.a = ecz;
        this.b = ecz2;
        this.c = ecz3;
    }

    @Override // defpackage.ecz
    public final /* synthetic */ Object a() {
        bzc bzc = new bzc();
        bzc.a = (Context) this.a.a();
        bzc.b = (buc) this.b.a();
        bzc.c = (byk) this.c.a();
        return bzc;
    }
}
