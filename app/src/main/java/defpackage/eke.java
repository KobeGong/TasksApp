package defpackage;

/* renamed from: eke reason: default package */
/* compiled from: PG */
public final class eke implements java.lang.Runnable {
    private final /* synthetic */ org.chromium.net.impl.CronetUrlRequestContext a;

    public eke(org.chromium.net.impl.CronetUrlRequestContext cronetUrlRequestContext) {
        this.a = cronetUrlRequestContext;
    }

    public final void run() {
        org.chromium.net.impl.CronetLibraryLoader.a();
        synchronized (this.a.b) {
            this.a.nativeInitRequestContextOnInitThread(this.a.d);
        }
    }
}
