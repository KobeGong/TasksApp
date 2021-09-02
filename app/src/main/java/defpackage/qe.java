package defpackage;

/* renamed from: qe reason: default package */
/* compiled from: PG */
final class qe implements java.lang.Runnable {
    private final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ defpackage.qd b;

    qe(defpackage.qd qdVar, java.lang.Object obj) {
        this.b = qdVar;
        this.a = obj;
    }

    public final void run() {
        this.b.a.a(this.a);
    }
}
