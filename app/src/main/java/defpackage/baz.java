package defpackage;

import com.google.android.gms.common.api.internal.LifecycleCallback;

/* renamed from: baz  reason: default package */
/* compiled from: PG */
final class baz implements Runnable {
    private /* synthetic */ LifecycleCallback a;
    private /* synthetic */ String b;
    private /* synthetic */ bay c;

    baz(bay bay, LifecycleCallback lifecycleCallback, String str) {
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
        int unused = this.c.c;
    }
}
