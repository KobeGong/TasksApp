package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: bpx  reason: default package */
/* compiled from: PG */
public final class bpx implements Runnable {
    private /* synthetic */ bpv a;
    private /* synthetic */ bpy b;

    bpx(bpy bpy, bpv bpv) {
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
