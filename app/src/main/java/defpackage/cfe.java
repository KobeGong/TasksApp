package defpackage;

/* renamed from: cfe  reason: default package */
final /* synthetic */ class cfe implements Runnable {
    private final cfd a;

    cfe(cfd cfd) {
        this.a = cfd;
    }

    public final void run() {
        cfd cfd = this.a;
        if (cfd.a.d >= 5) {
            cfd.a.V.b();
        }
    }
}
