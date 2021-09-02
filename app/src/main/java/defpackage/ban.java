package defpackage;

/* renamed from: ban reason: default package */
/* compiled from: PG */
final class ban implements java.lang.Runnable {
    private /* synthetic */ defpackage.axq a;
    private /* synthetic */ defpackage.bak b;

    ban(defpackage.bak bak, defpackage.axq axq) {
        this.b = bak;
        this.a = axq;
    }

    public final void run() {
        this.b.a(this.a);
    }
}
