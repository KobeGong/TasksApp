package defpackage;

/* renamed from: azm reason: default package */
/* compiled from: PG */
final class azm implements defpackage.bda {
    public final boolean a;
    private final java.lang.ref.WeakReference b;
    private final defpackage.ayd c;

    public azm(defpackage.azk azk, defpackage.ayd ayd, boolean z) {
        this.b = new java.lang.ref.WeakReference(azk);
        this.c = ayd;
        this.a = z;
    }

    public final void a(defpackage.axq axq) {
        boolean z = false;
        defpackage.azk azk = (defpackage.azk) this.b.get();
        if (azk != null) {
            if (android.os.Looper.myLooper() == azk.a.m.c()) {
                z = true;
            }
            defpackage.azb.a(z, (java.lang.Object) "onReportServiceBinding must be called on the GoogleApiClient handler thread");
            azk.b.lock();
            try {
                if (azk.b(0)) {
                    if (!axq.b()) {
                        azk.b(axq, this.c, this.a);
                    }
                    if (azk.d()) {
                        azk.e();
                    }
                    azk.b.unlock();
                }
            } finally {
                azk.b.unlock();
            }
        }
    }
}
