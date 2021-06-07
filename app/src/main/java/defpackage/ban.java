package defpackage;

/* renamed from: ban  reason: default package */
/* compiled from: PG */
final class ban implements Runnable {
    private /* synthetic */ axq a;
    private /* synthetic */ bak b;

    ban(bak bak, axq axq) {
        this.b = bak;
        this.a = axq;
    }

    public final void run() {
        this.b.a(this.a);
    }
}
