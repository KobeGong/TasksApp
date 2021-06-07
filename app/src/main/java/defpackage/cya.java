package defpackage;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: cya  reason: default package */
/* compiled from: PG */
public abstract class cya extends csl implements Future {
    protected cya() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Future c();

    public boolean cancel(boolean z) {
        return c().cancel(z);
    }

    public boolean isCancelled() {
        return c().isCancelled();
    }

    public boolean isDone() {
        return c().isDone();
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        return c().get();
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) {
        return c().get(j, timeUnit);
    }
}
