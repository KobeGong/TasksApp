package defpackage;

/* renamed from: cre reason: default package */
/* compiled from: PG */
final class cre implements java.lang.Runnable {
    private final /* synthetic */ defpackage.crf a;
    private final /* synthetic */ defpackage.crd b;

    cre(defpackage.crd crd, java.net.URI uri, defpackage.crf crf) {
        this.b = crd;
        this.a = crf;
    }

    public final void run() {
        defpackage.crd crd = this.b;
        defpackage.crf crf = this.a;
        try {
            crf.a(crd.b());
        } catch (Throwable th) {
            if (th instanceof java.io.IOException) {
                crf.a.a(defpackage.dpw.i.a("Credentials failed to obtain metadata").b(th));
            } else {
                crf.a.a(defpackage.dpw.f.a("Failed computing credential metadata").b(th));
            }
        }
    }
}
