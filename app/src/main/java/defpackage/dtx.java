package defpackage;

/* renamed from: dtx reason: default package */
/* compiled from: PG */
final class dtx implements java.lang.Runnable {
    private final /* synthetic */ defpackage.dob a;
    private final /* synthetic */ defpackage.dtt b;

    dtx(defpackage.dtt dtt, defpackage.dob dob) {
        this.b = dtt;
        this.a = dob;
    }

    public final void run() {
        this.b.c.a(this.a);
    }
}
