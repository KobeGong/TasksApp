package defpackage;

/* renamed from: apx reason: default package */
final /* synthetic */ class apx implements java.lang.Runnable {
    private final defpackage.apw a;

    apx(defpackage.apw apw) {
        this.a = apw;
    }

    public final void run() {
        defpackage.apw apw = this.a;
        if (!apw.a.r()) {
            apw.a.n();
        }
    }
}
