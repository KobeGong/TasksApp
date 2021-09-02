package defpackage;

/* renamed from: oa reason: default package */
/* compiled from: PG */
final class oa extends defpackage.oe implements java.lang.Runnable {
    public boolean a;
    private final java.util.concurrent.CountDownLatch h = new java.util.concurrent.CountDownLatch(1);
    private final /* synthetic */ defpackage.nz i;

    oa(defpackage.nz nzVar) {
        this.i = nzVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final java.lang.Object b() {
        try {
            return this.i.d();
        } catch (defpackage.pr e) {
            if (this.f.get()) {
                return null;
            }
            throw e;
        }
    }

    /* access modifiers changed from: protected */
    public final void a(java.lang.Object obj) {
        try {
            defpackage.nz nzVar = this.i;
            if (nzVar.a != this) {
                nzVar.a(this);
            } else if (!nzVar.g) {
                nzVar.b = android.os.SystemClock.uptimeMillis();
                nzVar.a = null;
                nzVar.a(obj);
            }
        } finally {
            this.h.countDown();
        }
    }

    /* access modifiers changed from: protected */
    public final void a() {
        try {
            this.i.a(this);
        } finally {
            this.h.countDown();
        }
    }

    public final void run() {
        this.a = false;
        this.i.c();
    }
}
