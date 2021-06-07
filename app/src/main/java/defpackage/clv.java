package defpackage;

import android.app.Application;
import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;

/* access modifiers changed from: package-private */
/* renamed from: clv  reason: default package */
/* compiled from: PG */
public final class clv extends cgj {
    public final cky d;
    private final ConcurrentHashMap e = new ConcurrentHashMap();

    static efx a(clu clu, String str) {
        efx efx = new efx();
        egc egc = new egc();
        egc.a = Long.valueOf(clu.b - clu.a);
        egc.b = clu.c - 1;
        efx.d = egc;
        if (str != null) {
            efx.u = new edd();
            efx.u.a = str;
        }
        return efx;
    }

    clv(coe coe, Application application, clt clt, int i, cky cky) {
        super(coe, application, clt, bg.Z, i);
        this.d = cky;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.cgj
    public final void d() {
        this.e.clear();
    }

    static {
        new HashSet(Arrays.asList("Cold startup", "Cold startup interactive", "Cold startup interactive before onDraw", "Warm startup", "Warm startup interactive", "Warm startup interactive before onDraw", "Warm startup activity onStart"));
    }
}
