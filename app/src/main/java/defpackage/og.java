package defpackage;

/* renamed from: og reason: default package */
/* compiled from: PG */
final class og extends java.util.concurrent.FutureTask {
    private final /* synthetic */ defpackage.oe a;

    og(defpackage.oe oeVar, java.util.concurrent.Callable callable) {
        this.a = oeVar;
        super(callable);
    }

    /* access modifiers changed from: protected */
    public final void done() {
        try {
            this.a.b(get());
        } catch (java.lang.InterruptedException e) {
            android.util.Log.w("AsyncTask", e);
        } catch (java.util.concurrent.ExecutionException e2) {
            throw new java.lang.RuntimeException("An error occurred while executing doInBackground()", e2.getCause());
        } catch (java.util.concurrent.CancellationException e3) {
            this.a.b(null);
        } catch (Throwable th) {
            throw new java.lang.RuntimeException("An error occurred while executing doInBackground()", th);
        }
    }
}
