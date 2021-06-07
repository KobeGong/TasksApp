package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: bjc  reason: default package */
/* compiled from: PG */
public final class bjc implements Executor {
    private final Handler a = new Handler((Looper) null);

    public bjc(Looper looper) {
    }

    public final void execute(Runnable runnable) {
        this.a.post(runnable);
    }
}
