package defpackage;

/* renamed from: ani reason: default package */
final /* synthetic */ class ani implements java.lang.Runnable {
    private final defpackage.anc a;
    private final defpackage.cyi b;
    private final defpackage.anu c;
    private final defpackage.cyu d;
    private final java.lang.String e;

    ani(defpackage.anc anc, defpackage.cyi cyi, defpackage.anu anu, defpackage.cyu cyu, java.lang.String str) {
        this.a = anc;
        this.b = cyi;
        this.c = anu;
        this.d = cyu;
        this.e = str;
    }

    public final void run() {
        defpackage.anc anc = this.a;
        defpackage.cyi cyi = this.b;
        defpackage.anu anu = this.c;
        defpackage.cyu cyu = this.d;
        java.lang.String str = this.e;
        synchronized (anc) {
            try {
                defpackage.anw anw = (defpackage.anw) cyi.get();
                if (anc.a != anu) {
                    cyu.a((java.lang.Object) null);
                    return;
                }
                if (anw == defpackage.anw.LOCAL_CHANGES) {
                    anc.a(str, anu, cyu);
                } else {
                    cyu.a((java.lang.Object) null);
                    if (anw == defpackage.anw.SERVER_CHANGES) {
                        defpackage.alq.a().a(anu.a.a, str);
                    }
                }
                return;
            } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e2) {
                cyu.a(e2);
            }
        }
    }
}
