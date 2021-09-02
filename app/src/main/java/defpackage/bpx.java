package defpackage;

/* renamed from: bpx reason: default package */
/* compiled from: PG */
final class bpx implements java.lang.Runnable {
    private /* synthetic */ defpackage.bpv a;
    private /* synthetic */ defpackage.bpy b;

    bpx(defpackage.bpy bpy, defpackage.bpv bpv) {
        this.b = bpy;
        this.a = bpv;
    }

    public final void run() {
        synchronized (this.b.b) {
            if (this.b.c != null) {
                this.b.c.a(this.a);
            }
        }
    }
}
