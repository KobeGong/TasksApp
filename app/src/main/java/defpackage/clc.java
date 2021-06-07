package defpackage;

import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: clc  reason: default package */
/* compiled from: PG */
public final class clc implements Callable {
    private final /* synthetic */ Callable a;

    clc(cla cla, Callable callable) {
        this.a = callable;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        try {
            return this.a.call();
        } catch (Throwable th) {
            cld.a(th);
            throw th;
        }
    }
}
