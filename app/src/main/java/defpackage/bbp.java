package defpackage;

/* renamed from: bbp reason: default package */
/* compiled from: PG */
final class bbp implements java.lang.Runnable {
    private /* synthetic */ com.google.android.gms.common.api.internal.LifecycleCallback a;
    private /* synthetic */ java.lang.String b;
    private /* synthetic */ defpackage.bbo c;

    bbp(defpackage.bbo bbo, com.google.android.gms.common.api.internal.LifecycleCallback lifecycleCallback, java.lang.String str) {
        this.c = bbo;
        this.a = lifecycleCallback;
        this.b = str;
    }

    public final void run() {
        if (this.c.U > 0) {
            this.a.a(this.c.V != null ? this.c.V.getBundle(this.b) : null);
        }
        if (this.c.U >= 2) {
            this.a.b();
        }
        if (this.c.U >= 3) {
            this.a.c();
        }
        if (this.c.U >= 4) {
            this.a.d();
        }
        this.c.U;
    }
}
