package defpackage;

/* renamed from: duj reason: default package */
/* compiled from: PG */
final class duj implements java.lang.Runnable {
    private final /* synthetic */ defpackage.dor a;
    private final /* synthetic */ defpackage.dug b;

    duj(defpackage.dug dug, defpackage.dor dor) {
        this.b = dug;
        this.a = dor;
    }

    public final void run() {
        this.b.a.a(this.a);
    }
}
