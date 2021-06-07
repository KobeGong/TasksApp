package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: djd  reason: default package */
/* compiled from: PG */
final class djd extends dgs implements diq, djy, RandomAccess {
    private long[] b;
    private int c;

    djd() {
        this(new long[10], 0);
    }

    private djd(long[] jArr, int i) {
        this.b = jArr;
        this.c = i;
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        c();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        System.arraycopy(this.b, i2, this.b, i, this.c - i2);
        this.c -= i2 - i;
        this.modCount++;
    }

    @Override // defpackage.dgs
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djd)) {
            return super.equals(obj);
        }
        djd djd = (djd) obj;
        if (this.c != djd.c) {
            return false;
        }
        long[] jArr = djd.b;
        for (int i = 0; i < this.c; i++) {
            if (this.b[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.dgs
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.c; i2++) {
            i = (i * 31) + dim.a(this.b[i2]);
        }
        return i;
    }

    public final long b(int i) {
        c(i);
        return this.b[i];
    }

    public final int size() {
        return this.c;
    }

    public final void a(long j) {
        a(this.c, j);
    }

    private final void a(int i, long j) {
        c();
        if (i < 0 || i > this.c) {
            throw new IndexOutOfBoundsException(d(i));
        }
        if (this.c < this.b.length) {
            System.arraycopy(this.b, i, this.b, i + 1, this.c - i);
        } else {
            long[] jArr = new long[(((this.c * 3) / 2) + 1)];
            System.arraycopy(this.b, 0, jArr, 0, i);
            System.arraycopy(this.b, i, jArr, i + 1, this.c - i);
            this.b = jArr;
        }
        this.b[i] = j;
        this.c++;
        this.modCount++;
    }

    @Override // defpackage.dgs, java.util.AbstractCollection, java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        c();
        dim.a(collection);
        if (!(collection instanceof djd)) {
            return super.addAll(collection);
        }
        djd djd = (djd) collection;
        if (djd.c == 0) {
            return false;
        }
        if (Integer.MAX_VALUE - this.c < djd.c) {
            throw new OutOfMemoryError();
        }
        int i = this.c + djd.c;
        if (i > this.b.length) {
            this.b = Arrays.copyOf(this.b, i);
        }
        System.arraycopy(djd.b, 0, this.b, this.c, djd.c);
        this.c = i;
        this.modCount++;
        return true;
    }

    @Override // defpackage.dgs, java.util.List
    public final boolean remove(Object obj) {
        c();
        for (int i = 0; i < this.c; i++) {
            if (obj.equals(Long.valueOf(this.b[i]))) {
                System.arraycopy(this.b, i + 1, this.b, i, this.c - i);
                this.c--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    private final void c(int i) {
        if (i < 0 || i >= this.c) {
            throw new IndexOutOfBoundsException(d(i));
        }
    }

    private final String d(int i) {
        return new StringBuilder(35).append("Index:").append(i).append(", Size:").append(this.c).toString();
    }

    @Override // defpackage.dgs, java.util.List, java.util.AbstractList
    public final /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        c();
        c(i);
        long j = this.b[i];
        this.b[i] = longValue;
        return Long.valueOf(j);
    }

    @Override // defpackage.dgs, java.util.List, java.util.AbstractList
    public final /* synthetic */ Object remove(int i) {
        c();
        c(i);
        long j = this.b[i];
        if (i < this.c - 1) {
            System.arraycopy(this.b, i + 1, this.b, i, this.c - i);
        }
        this.c--;
        this.modCount++;
        return Long.valueOf(j);
    }

    @Override // defpackage.dgs, java.util.List, java.util.AbstractList
    public final /* synthetic */ void add(int i, Object obj) {
        a(i, ((Long) obj).longValue());
    }

    @Override // defpackage.diq
    public final /* synthetic */ diq a(int i) {
        if (i >= this.c) {
            return new djd(Arrays.copyOf(this.b, i), this.c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object get(int i) {
        return Long.valueOf(b(i));
    }

    static {
        new djd().a = false;
    }
}
