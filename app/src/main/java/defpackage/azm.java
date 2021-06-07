package defpackage;

import android.os.Looper;
import java.lang.ref.WeakReference;

/* renamed from: azm  reason: default package */
/* compiled from: PG */
final class azm implements bda {
    public final boolean a;
    private final WeakReference b;
    private final ayd c;

    public azm(azk azk, ayd ayd, boolean z) {
        this.b = new WeakReference(azk);
        this.c = ayd;
        this.a = z;
    }

    @Override // defpackage.bda
    public final void a(axq axq) {
        boolean z = false;
        azk azk = (azk) this.b.get();
        if (azk != null) {
            if (Looper.myLooper() == azk.a.m.c()) {
                z = true;
            }
            azb.a(z, "onReportServiceBinding must be called on the GoogleApiClient handler thread");
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
