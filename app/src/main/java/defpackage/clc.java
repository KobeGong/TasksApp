package defpackage;

/* renamed from: clc reason: default package */
/* compiled from: PG */
final class clc implements java.util.concurrent.Callable {
    private final /* synthetic */ java.util.concurrent.Callable a;

    clc(defpackage.cla cla, java.util.concurrent.Callable callable) {
        this.a = callable;
    }

    public final java.lang.Object call() {
        try {
            return this.a.call();
        } catch (Throwable th) {
            defpackage.cld.a(th);
            throw th;
        }
    }
}
