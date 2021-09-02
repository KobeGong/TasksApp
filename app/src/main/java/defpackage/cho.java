package defpackage;

/* renamed from: cho reason: default package */
/* compiled from: PG */
final class cho implements java.lang.Runnable {
    private final /* synthetic */ defpackage.chq a;

    cho(defpackage.chq chq) {
        this.a = chq;
    }

    public final void run() {
        defpackage.chn chn = this.a.a;
        if (chn.i.getAndSet(false)) {
            chn.a(2, chn.j);
            chn.a(3, (defpackage.edw) null);
        }
    }
}
