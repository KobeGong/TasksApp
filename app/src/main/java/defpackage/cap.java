package defpackage;

import java.util.Map;

/* renamed from: cap  reason: default package */
/* compiled from: PG */
public final class cap implements ecz {
    private final ecz a;
    private final ecz b;

    public cap(ecz ecz, ecz ecz2) {
        this.a = ecz;
        this.b = ecz2;
    }

    @Override // defpackage.ecz
    public final /* synthetic */ Object a() {
        cao cao = new cao();
        cao.d = (Map) this.a.a();
        cao.a = (bza) this.b.a();
        return cao;
    }
}
