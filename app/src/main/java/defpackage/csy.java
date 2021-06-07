package defpackage;

import java.util.NoSuchElementException;

/* renamed from: csy  reason: default package */
/* compiled from: PG */
public final class csy extends cth {
    private boolean a;
    private final /* synthetic */ Object b;

    public csy(Object obj) {
        this.b = obj;
    }

    public final boolean hasNext() {
        return !this.a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.a) {
            throw new NoSuchElementException();
        }
        this.a = true;
        return this.b;
    }
}
