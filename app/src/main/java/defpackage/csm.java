package defpackage;

import java.util.Queue;

/* renamed from: csm  reason: default package */
/* compiled from: PG */
public abstract class csm extends csk implements Queue {
    protected csm() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Queue c();

    @Override // java.util.Queue
    public boolean offer(Object obj) {
        return c().offer(obj);
    }

    @Override // java.util.Queue
    public Object poll() {
        return c().poll();
    }

    @Override // java.util.Queue
    public Object remove() {
        return c().remove();
    }

    @Override // java.util.Queue
    public Object peek() {
        return c().peek();
    }

    @Override // java.util.Queue
    public Object element() {
        return c().element();
    }
}
