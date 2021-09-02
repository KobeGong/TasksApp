package defpackage;

/* renamed from: baz reason: default package */
/* compiled from: PG */
final class baz implements java.lang.Runnable {
    private /* synthetic */ com.google.android.gms.common.api.internal.LifecycleCallback a;
    private /* synthetic */ java.lang.String b;
    private /* synthetic */ defpackage.bay c;

    baz(defpackage.bay bay, com.google.android.gms.common.api.internal.LifecycleCallback lifecycleCallback, java.lang.String str) {
        this.c = bay;
        this.a = lifecycleCallback;
        this.b = str;
    }

    public final void run() {
        if (this.c.c > 0) {
            this.a.a(this.c.d != null ? this.c.d.getBundle(this.b) : null);
        }
        if (this.c.c >= 2) {
            this.a.b();
        }
        if (this.c.c >= 3) {
            this.a.c();
        }
        if (this.c.c >= 4) {
            this.a.d();
        }
        this.c.c;
    }
}
