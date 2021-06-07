package defpackage;

import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* access modifiers changed from: package-private */
/* renamed from: og  reason: default package */
/* compiled from: PG */
public final class og extends FutureTask {
    private final /* synthetic */ oe a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    og(oe oeVar, Callable callable) {
        super(callable);
        this.a = oeVar;
    }

    /* access modifiers changed from: protected */
    public final void done() {
        try {
            this.a.b(get());
        } catch (InterruptedException e) {
            Log.w("AsyncTask", e);
        } catch (ExecutionException e2) {
            throw new RuntimeException("An error occurred while executing doInBackground()", e2.getCause());
        } catch (CancellationException e3) {
            this.a.b(null);
        } catch (Throwable th) {
            throw new RuntimeException("An error occurred while executing doInBackground()", th);
        }
    }
}
