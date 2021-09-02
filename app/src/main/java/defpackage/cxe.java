package defpackage;

/* renamed from: cxe reason: default package */
/* compiled from: PG */
final class cxe {
    public static final defpackage.cxe a = new defpackage.cxe(null, null);
    public final java.lang.Runnable b;
    public final java.util.concurrent.Executor c;
    public defpackage.cxe next;

    cxe(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        this.b = runnable;
        this.c = executor;
    }
}
