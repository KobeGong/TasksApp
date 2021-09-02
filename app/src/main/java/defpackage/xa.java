package defpackage;

/* renamed from: xa reason: default package */
/* compiled from: PG */
final class xa implements java.lang.Runnable {
    private final /* synthetic */ defpackage.wz a;

    xa(defpackage.wz wzVar) {
        this.a = wzVar;
    }

    public final void run() {
        if ((this.a.u & 1) != 0) {
            this.a.h(0);
        }
        if ((this.a.u & 4096) != 0) {
            this.a.h(108);
        }
        this.a.t = false;
        this.a.u = 0;
    }
}
