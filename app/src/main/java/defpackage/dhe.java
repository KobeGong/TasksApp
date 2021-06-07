package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: dhe  reason: default package */
/* compiled from: PG */
public final class dhe implements Iterator {
    private int a = 0;
    private final int b = this.c.a();
    private final /* synthetic */ dha c;

    dhe(dha dha) {
        this.c = dha;
    }

    public final boolean hasNext() {
        return this.a < this.b;
    }

    private final byte a() {
        try {
            dha dha = this.c;
            int i = this.a;
            this.a = i + 1;
            return dha.a(i);
        } catch (IndexOutOfBoundsException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return Byte.valueOf(a());
    }
}
