package defpackage;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* renamed from: bwv  reason: default package */
/* compiled from: PG */
public final class bwv implements ecz {
    private final ecz a;
    private final ecz b;

    public bwv(ecz ecz, ecz ecz2) {
        this.a = ecz;
        this.b = ecz2;
    }

    @Override // defpackage.ecz
    public final /* synthetic */ Object a() {
        bwt bwt = new bwt();
        bwt.b = (Context) this.a.a();
        bwt.c = (ExecutorService) this.b.a();
        return bwt;
    }
}
