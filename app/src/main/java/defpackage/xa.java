package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: xa  reason: default package */
/* compiled from: PG */
public final class xa implements Runnable {
    private final /* synthetic */ wz a;

    xa(wz wzVar) {
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
