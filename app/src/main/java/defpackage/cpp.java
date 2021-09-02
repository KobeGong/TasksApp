package defpackage;

/* renamed from: cpp reason: default package */
/* compiled from: PG */
final class cpp implements java.lang.Runnable {
    private final /* synthetic */ defpackage.cpn a;

    cpp(defpackage.cpn cpn) {
        this.a = cpn;
    }

    public final void run() {
        defpackage.cpo.a.add(this.a);
        if (defpackage.cpo.b != -1) {
            this.a.a(defpackage.cpo.b);
        }
    }
}
