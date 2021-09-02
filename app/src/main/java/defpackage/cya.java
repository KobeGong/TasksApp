package defpackage;

/* renamed from: cya reason: default package */
/* compiled from: PG */
public abstract class cya extends defpackage.csl implements java.util.concurrent.Future {
    protected cya() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract java.util.concurrent.Future c();

    public boolean cancel(boolean z) {
        return c().cancel(z);
    }

    public boolean isCancelled() {
        return c().isCancelled();
    }

    public boolean isDone() {
        return c().isDone();
    }

    public java.lang.Object get() {
        return c().get();
    }

    public java.lang.Object get(long j, java.util.concurrent.TimeUnit timeUnit) {
        return c().get(j, timeUnit);
    }
}
