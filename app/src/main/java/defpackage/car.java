package defpackage;

import java.util.Map;

/* renamed from: car  reason: default package */
/* compiled from: PG */
public final class car implements ecz {
    private final ecz a;
    private final ecz b;
    private final ecz c;

    public car(ecz ecz, ecz ecz2, ecz ecz3) {
        this.a = ecz;
        this.b = ecz2;
        this.c = ecz3;
    }

    @Override // defpackage.ecz
    public final /* synthetic */ Object a() {
        caq caq = new caq();
        caq.d = (Map) this.a.a();
        caq.a = (bza) this.b.a();
        caq.b = (bux) this.c.a();
        return caq;
    }
}
