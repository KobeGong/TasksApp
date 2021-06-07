package defpackage;

import android.content.Context;

/* renamed from: bzt  reason: default package */
/* compiled from: PG */
public final class bzt implements ecz {
    private final ecz a;
    private final ecz b;
    private final ecz c;
    private final ecz d;

    public bzt(ecz ecz, ecz ecz2, ecz ecz3, ecz ecz4) {
        this.a = ecz;
        this.b = ecz2;
        this.c = ecz3;
        this.d = ecz4;
    }

    @Override // defpackage.ecz
    public final /* synthetic */ Object a() {
        bzb bzb = new bzb();
        bzb.a = (Context) this.a.a();
        bzb.b = (buc) this.b.a();
        bzb.c = (crv) this.c.a();
        bzb.d = (cbj) this.d.a();
        return bzb;
    }
}
