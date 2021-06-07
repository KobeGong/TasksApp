package defpackage;

import org.chromium.net.impl.CronetLibraryLoader;
import org.chromium.net.impl.CronetUrlRequestContext;

/* renamed from: eke  reason: default package */
/* compiled from: PG */
public final class eke implements Runnable {
    private final /* synthetic */ CronetUrlRequestContext a;

    public eke(CronetUrlRequestContext cronetUrlRequestContext) {
        this.a = cronetUrlRequestContext;
    }

    public final void run() {
        CronetLibraryLoader.a();
        synchronized (this.a.b) {
            this.a.nativeInitRequestContextOnInitThread(this.a.d);
        }
    }
}
