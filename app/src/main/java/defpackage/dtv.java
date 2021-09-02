package defpackage;

/* renamed from: dtv reason: default package */
/* compiled from: PG */
final class dtv implements java.lang.Runnable {
    private final /* synthetic */ defpackage.doa a;
    private final /* synthetic */ defpackage.dtt b;

    dtv(defpackage.dtt dtt, defpackage.doa doa) {
        this.b = dtt;
        this.a = doa;
    }

    public final void run() {
        this.b.c.a(this.a);
    }
}
