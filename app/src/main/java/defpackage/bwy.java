package defpackage;

/* renamed from: bwy reason: default package */
/* compiled from: PG */
final class bwy implements java.lang.Runnable {
    private final /* synthetic */ defpackage.bwx a;

    bwy(defpackage.bwx bwx) {
        this.a = bwx;
    }

    public final void run() {
        this.a.a.b--;
        this.a.a.a();
    }
}
