package defpackage;

import android.os.Binder;
import android.os.Process;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: oj  reason: default package */
/* compiled from: PG */
public final class oj implements Callable {
    private final /* synthetic */ oe a;

    oj() {
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    oj(oe oeVar) {
        this();
        this.a = oeVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        this.a.g.set(true);
        Object obj = null;
        try {
            Process.setThreadPriority(10);
            obj = this.a.b();
            Binder.flushPendingCommands();
            this.a.c(obj);
            return obj;
        } catch (Throwable th) {
            this.a.c(obj);
            throw th;
        }
    }
}
