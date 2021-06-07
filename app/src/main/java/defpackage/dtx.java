package defpackage;

/* renamed from: dtx  reason: default package */
/* compiled from: PG */
final class dtx implements Runnable {
    private final /* synthetic */ dob a;
    private final /* synthetic */ dtt b;

    dtx(dtt dtt, dob dob) {
        this.b = dtt;
        this.a = dob;
    }

    public final void run() {
        this.b.c.a(this.a);
    }
}
