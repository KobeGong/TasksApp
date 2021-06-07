package defpackage;

import com.google.android.gms.common.api.internal.LifecycleCallback;

/* renamed from: bbp  reason: default package */
/* compiled from: PG */
final class bbp implements Runnable {
    private /* synthetic */ LifecycleCallback a;
    private /* synthetic */ String b;
    private /* synthetic */ bbo c;

    bbp(bbo bbo, LifecycleCallback lifecycleCallback, String str) {
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
        int unused = this.c.U;
    }
}
