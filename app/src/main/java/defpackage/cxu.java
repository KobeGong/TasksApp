package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* access modifiers changed from: package-private */
/* renamed from: cxu  reason: default package */
/* compiled from: PG */
public final class cxu extends cxn {
    cxu(csn csn, boolean z, Executor executor, Callable callable) {
        cxx cxx = new cxx(this, csn, z, new cxv(this, callable, executor));
        this.f = cxx;
        if (cxx.a.isEmpty()) {
            cxx.c();
        } else if (cxx.b) {
            cth cth = (cth) cxx.a.iterator();
            int i = 0;
            while (cth.hasNext()) {
                cyi cyi = (cyi) cth.next();
                cyi.a(new cxp(cxx, i, cyi), cyn.INSTANCE);
                i++;
            }
        } else {
            cth cth2 = (cth) cxx.a.iterator();
            while (cth2.hasNext()) {
                ((cyi) cth2.next()).a(cxx, cyn.INSTANCE);
            }
        }
    }
}
