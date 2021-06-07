package defpackage;

import android.content.Context;

/* renamed from: bym  reason: default package */
/* compiled from: PG */
public final class bym implements ecz {
    private final ecz a;
    private final ecz b;
    private final ecz c;
    private final ecz d;

    public bym(ecz ecz, ecz ecz2, ecz ecz3, ecz ecz4) {
        this.a = ecz;
        this.b = ecz2;
        this.c = ecz3;
        this.d = ecz4;
    }

    @Override // defpackage.ecz
    public final /* synthetic */ Object a() {
        byk byk = new byk();
        byk.a = (Context) this.a.a();
        byk.b = (buc) this.b.a();
        byk.c = (bru) this.c.a();
        byk.d = (avi) this.d.a();
        return byk;
    }
}
