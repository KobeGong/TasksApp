package defpackage;

/* renamed from: drf reason: default package */
/* compiled from: PG */
final class drf implements java.lang.Runnable {
    private final /* synthetic */ boolean a;
    private final /* synthetic */ defpackage.dqz b;

    drf(defpackage.dqz dqz, boolean z) {
        this.b = dqz;
        this.a = z;
    }

    public final void run() {
        this.b.a.a(this.a);
    }
}
