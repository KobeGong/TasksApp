package defpackage;

/* renamed from: qe  reason: default package */
/* compiled from: PG */
final class qe implements Runnable {
    private final /* synthetic */ Object a;
    private final /* synthetic */ qd b;

    qe(qd qdVar, Object obj) {
        this.b = qdVar;
        this.a = obj;
    }

    public final void run() {
        this.b.a.a(this.a);
    }
}
