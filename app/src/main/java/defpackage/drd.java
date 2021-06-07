package defpackage;

/* renamed from: drd  reason: default package */
/* compiled from: PG */
final class drd implements Runnable {
    private final /* synthetic */ dqz a;

    drd(dqz dqz) {
        this.a = dqz;
    }

    public final void run() {
        this.a.b.close();
    }
}
