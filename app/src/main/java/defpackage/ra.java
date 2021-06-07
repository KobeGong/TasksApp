package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: ra  reason: default package */
/* compiled from: PG */
final class ra implements Iterator {
    private final int a;
    private int b;
    private int c;
    private boolean d = false;
    private final /* synthetic */ qz e;

    ra(qz qzVar, int i) {
        this.e = qzVar;
        this.a = i;
        this.b = qzVar.a();
    }

    public final boolean hasNext() {
        return this.c < this.b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object a2 = this.e.a(this.c, this.a);
        this.c++;
        this.d = true;
        return a2;
    }

    public final void remove() {
        if (!this.d) {
            throw new IllegalStateException();
        }
        this.c--;
        this.b--;
        this.d = false;
        this.e.a(this.c);
    }
}
