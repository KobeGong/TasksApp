package defpackage;

import java.util.Map;

/* renamed from: cat  reason: default package */
/* compiled from: PG */
public final class cat implements ecz {
    private final ecz a;
    private final ecz b;

    public cat(ecz ecz, ecz ecz2) {
        this.a = ecz;
        this.b = ecz2;
    }

    @Override // defpackage.ecz
    public final /* synthetic */ Object a() {
        cas cas = new cas();
        cas.d = (Map) this.a.a();
        cas.a = (bza) this.b.a();
        return cas;
    }
}
