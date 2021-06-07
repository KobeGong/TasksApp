package defpackage;

/* renamed from: dtv  reason: default package */
/* compiled from: PG */
final class dtv implements Runnable {
    private final /* synthetic */ doa a;
    private final /* synthetic */ dtt b;

    dtv(dtt dtt, doa doa) {
        this.b = dtt;
        this.a = doa;
    }

    public final void run() {
        this.b.c.a(this.a);
    }
}
