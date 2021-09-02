package defpackage;

/* renamed from: cjl reason: default package */
/* compiled from: PG */
final class cjl implements java.lang.Runnable {
    private final /* synthetic */ defpackage.cht a;

    cjl(defpackage.cht cht) {
        this.a = cht;
    }

    public final void run() {
        defpackage.ckm ckl;
        defpackage.cht cht = this.a;
        if (cht.d.i) {
            ckl = (defpackage.ckq) cht.a();
        } else {
            ckl = new defpackage.ckl();
        }
        ckl.a(new defpackage.ckk());
    }
}
