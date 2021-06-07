package defpackage;

/* renamed from: dtz  reason: default package */
/* compiled from: PG */
final class dtz implements Runnable {
    private final /* synthetic */ String a;
    private final /* synthetic */ dtt b;

    dtz(dtt dtt, String str) {
        this.b = dtt;
        this.a = str;
    }

    public final void run() {
        this.b.c.a(this.a);
    }
}
