package defpackage;

/* renamed from: eil reason: default package */
/* compiled from: PG */
final class eil implements java.lang.Runnable {
    private final /* synthetic */ long a;
    private final /* synthetic */ defpackage.eii b;

    eil(defpackage.eii eii, long j) {
        this.b = eii;
        this.a = j;
    }

    public final void run() {
        defpackage.eip eip = this.b.b.b;
        eip.a.a(this.a);
    }
}
