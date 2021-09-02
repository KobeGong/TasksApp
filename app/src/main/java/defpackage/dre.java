package defpackage;

/* renamed from: dre reason: default package */
/* compiled from: PG */
final class dre implements java.lang.Runnable {
    private final /* synthetic */ int a;
    private final /* synthetic */ defpackage.dqz b;

    dre(defpackage.dqz dqz, int i) {
        this.b = dqz;
        this.a = i;
    }

    public final void run() {
        this.b.a.a(this.a);
    }
}
