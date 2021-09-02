package defpackage;

/* renamed from: drd reason: default package */
/* compiled from: PG */
final class drd implements java.lang.Runnable {
    private final /* synthetic */ defpackage.dqz a;

    drd(defpackage.dqz dqz) {
        this.a = dqz;
    }

    public final void run() {
        this.a.b.close();
    }
}
