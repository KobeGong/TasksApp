package defpackage;

/* renamed from: dre  reason: default package */
/* compiled from: PG */
final class dre implements Runnable {
    private final /* synthetic */ int a;
    private final /* synthetic */ dqz b;

    dre(dqz dqz, int i) {
        this.b = dqz;
        this.a = i;
    }

    public final void run() {
        this.b.a.a(this.a);
    }
}
