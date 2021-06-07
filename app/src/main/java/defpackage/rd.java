package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: rd  reason: default package */
/* compiled from: PG */
final class rd implements Iterator, Map.Entry {
    private int a;
    private int b;
    private boolean c = false;
    private final /* synthetic */ qz d;

    rd(qz qzVar) {
        this.d = qzVar;
        this.a = qzVar.a() - 1;
        this.b = -1;
    }

    public final boolean hasNext() {
        return this.b < this.a;
    }

    public final void remove() {
        if (!this.c) {
            throw new IllegalStateException();
        }
        this.d.a(this.b);
        this.b--;
        this.a--;
        this.c = false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.c) {
            return this.d.a(this.b, 0);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.c) {
            return this.d.a(this.b, 1);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.c) {
            return this.d.a(this.b, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final boolean equals(Object obj) {
        if (!this.c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        } else if (!(obj instanceof Map.Entry)) {
            return false;
        } else {
            Map.Entry entry = (Map.Entry) obj;
            return qv.a(entry.getKey(), this.d.a(this.b, 0)) && qv.a(entry.getValue(), this.d.a(this.b, 1));
        }
    }

    public final int hashCode() {
        int i = 0;
        if (!this.c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        Object a2 = this.d.a(this.b, 0);
        Object a3 = this.d.a(this.b, 1);
        int hashCode = a2 == null ? 0 : a2.hashCode();
        if (a3 != null) {
            i = a3.hashCode();
        }
        return i ^ hashCode;
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.b++;
        this.c = true;
        return this;
    }
}
