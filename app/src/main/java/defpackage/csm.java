package defpackage;

/* renamed from: csm reason: default package */
/* compiled from: PG */
public abstract class csm extends defpackage.csk implements java.util.Queue {
    protected csm() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract java.util.Queue c();

    public boolean offer(java.lang.Object obj) {
        return c().offer(obj);
    }

    public java.lang.Object poll() {
        return c().poll();
    }

    public java.lang.Object remove() {
        return c().remove();
    }

    public java.lang.Object peek() {
        return c().peek();
    }

    public java.lang.Object element() {
        return c().element();
    }
}
