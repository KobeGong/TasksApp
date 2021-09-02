package defpackage;

/* renamed from: eik reason: default package */
/* compiled from: PG */
final class eik implements java.lang.Runnable {
    private final /* synthetic */ long a;
    private final /* synthetic */ int b;
    private final /* synthetic */ defpackage.eii c;

    eik(defpackage.eii eii, long j, int i) {
        this.c = eii;
        this.a = j;
        this.b = i;
    }

    public final void run() {
        this.c.b.b.a(this.a, this.b);
    }
}
