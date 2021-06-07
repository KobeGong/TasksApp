package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: egv  reason: default package */
/* compiled from: PG */
public final class egv implements Iterator {
    private int a;
    private int b;
    private boolean c;
    private final /* synthetic */ egu d;

    egv(egu egu) {
        this.d = egu;
        egu.b++;
        this.a = egu.a.size();
    }

    public final boolean hasNext() {
        int i = this.b;
        while (i < this.a && this.d.a.get(i) == null) {
            i++;
        }
        if (i < this.a) {
            return true;
        }
        a();
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        while (this.b < this.a) {
            if (this.d.a.get(this.b) != null) {
                break;
            }
            this.b++;
        }
        if (this.b < this.a) {
            egu egu = this.d;
            int i = this.b;
            this.b = i + 1;
            return egu.a.get(i);
        }
        a();
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    private final void a() {
        if (!this.c) {
            this.c = true;
            egu egu = this.d;
            egu.b--;
            if (egu.b <= 0 && egu.d) {
                egu.d = false;
                for (int size = egu.a.size() - 1; size >= 0; size--) {
                    if (egu.a.get(size) == null) {
                        egu.a.remove(size);
                    }
                }
            }
        }
    }
}
