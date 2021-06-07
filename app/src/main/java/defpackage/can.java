package defpackage;

import java.util.Map;

/* renamed from: can  reason: default package */
/* compiled from: PG */
public final class can implements ecz {
    private final ecz a;
    private final ecz b;
    private final ecz c;
    private final ecz d;

    public can(ecz ecz, ecz ecz2, ecz ecz3, ecz ecz4) {
        this.a = ecz;
        this.b = ecz2;
        this.c = ecz3;
        this.d = ecz4;
    }

    @Override // defpackage.ecz
    public final /* synthetic */ Object a() {
        cam cam = new cam();
        cam.d = (Map) this.a.a();
        cam.a = (bza) this.b.a();
        cam.b = (buu) this.c.a();
        cam.c = (cae) this.d.a();
        return cam;
    }
}
