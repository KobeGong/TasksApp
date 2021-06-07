package defpackage;

import java.util.Iterator;

/* renamed from: csx  reason: default package */
/* compiled from: PG */
final class csx implements Iterator {
    private boolean a = true;
    private final /* synthetic */ Iterator b;

    csx(Iterator it) {
        this.b = it;
    }

    public final boolean hasNext() {
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object next = this.b.next();
        this.a = false;
        return next;
    }

    public final void remove() {
        cld.b(!this.a, "no calls to next() since the last call to remove()");
        this.b.remove();
    }
}
