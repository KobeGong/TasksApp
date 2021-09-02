package defpackage;

/* renamed from: cfe reason: default package */
final /* synthetic */ class cfe implements java.lang.Runnable {
    private final defpackage.cfd a;

    cfe(defpackage.cfd cfd) {
        this.a = cfd;
    }

    public final void run() {
        defpackage.cfd cfd = this.a;
        if (cfd.a.d >= 5) {
            cfd.a.V.b();
        }
    }
}
