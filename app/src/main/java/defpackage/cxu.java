package defpackage;

/* renamed from: cxu reason: default package */
/* compiled from: PG */
final class cxu extends defpackage.cxn {
    cxu(defpackage.csn csn, boolean z, java.util.concurrent.Executor executor, java.util.concurrent.Callable callable) {
        defpackage.cxx cxx = new defpackage.cxx(this, csn, z, new defpackage.cxv(this, callable, executor));
        this.f = cxx;
        if (cxx.a.isEmpty()) {
            cxx.c();
        } else if (cxx.b) {
            defpackage.cth cth = (defpackage.cth) cxx.a.iterator();
            int i = 0;
            while (cth.hasNext()) {
                defpackage.cyi cyi = (defpackage.cyi) cth.next();
                int i2 = i + 1;
                cyi.a(new defpackage.cxp(cxx, i, cyi), defpackage.cyn.a);
                i = i2;
            }
        } else {
            defpackage.cth cth2 = (defpackage.cth) cxx.a.iterator();
            while (cth2.hasNext()) {
                ((defpackage.cyi) cth2.next()).a(cxx, defpackage.cyn.a);
            }
        }
    }
}
