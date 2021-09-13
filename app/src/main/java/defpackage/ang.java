package defpackage;

/* renamed from: ang reason: default package */
final /* synthetic */ class ang implements java.lang.Runnable {
    private final defpackage.anc a;
    private final defpackage.cyi b;
    private final defpackage.anu c;
    private final defpackage.cyu d;

    ang(defpackage.anc anc, defpackage.cyi cyi, defpackage.anu anu, defpackage.cyu cyu) {
        this.a = anc;
        this.b = cyi;
        this.c = anu;
        this.d = cyu;
    }

    public final void run() {
        defpackage.anc anc = this.a;
        defpackage.cyi cyi = this.b;
        defpackage.anu anu = this.c;
        defpackage.cyu cyu = this.d;
        synchronized (anc) {
            try {
                defpackage.anw anw = (defpackage.anw) cyi.get();
                if (anc.a != anu) {
                    cyu.a((java.lang.Object) null);
                    return;
                }
                if (anw == defpackage.anw.LOCAL_CHANGES) {
                    anc.a(anu, cyu);
                } else {
                    cyu.a((java.lang.Object) null);
                    if (anw == defpackage.anw.SERVER_CHANGES) {
                        defpackage.alq.get().a(anu.a.a);
                    }
                }
                return;
            } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e) {
                cyu.a(e);
            }
        }
    }
}
