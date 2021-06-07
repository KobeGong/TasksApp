package defpackage;

import android.os.SystemClock;
import java.util.concurrent.CountDownLatch;

/* access modifiers changed from: package-private */
/* renamed from: oa  reason: default package */
/* compiled from: PG */
public final class oa extends oe implements Runnable {
    public boolean a;
    private final CountDownLatch h = new CountDownLatch(1);
    private final /* synthetic */ nz i;

    oa(nz nzVar) {
        this.i = nzVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final Object b() {
        try {
            return this.i.d();
        } catch (pr e) {
            if (this.f.get()) {
                return null;
            }
            throw e;
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.oe
    public final void a(Object obj) {
        try {
            nz nzVar = this.i;
            if (nzVar.a != this) {
                nzVar.a(this);
            } else if (!nzVar.g) {
                nzVar.b = SystemClock.uptimeMillis();
                nzVar.a = null;
                nzVar.a(obj);
            }
        } finally {
            this.h.countDown();
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.oe
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
