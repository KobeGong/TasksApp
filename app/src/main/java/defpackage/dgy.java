package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: dgy  reason: default package */
/* compiled from: PG */
final class dgy extends dgs implements diq, djy, RandomAccess {
    private boolean[] b;
    private int c;

    dgy() {
        this(new boolean[10], 0);
    }

    private dgy(boolean[] zArr, int i) {
        this.b = zArr;
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
        if (!(obj instanceof dgy)) {
            return super.equals(obj);
        }
        dgy dgy = (dgy) obj;
        if (this.c != dgy.c) {
            return false;
        }
        boolean[] zArr = dgy.b;
        for (int i = 0; i < this.c; i++) {
            if (this.b[i] != zArr[i]) {
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

    public final int size() {
        return this.c;
    }

    public final void a(boolean z) {
        a(this.c, z);
    }

    private final void a(int i, boolean z) {
        c();
        if (i < 0 || i > this.c) {
            throw new IndexOutOfBoundsException(c(i));
        }
        if (this.c < this.b.length) {
            System.arraycopy(this.b, i, this.b, i + 1, this.c - i);
        } else {
            boolean[] zArr = new boolean[(((this.c * 3) / 2) + 1)];
            System.arraycopy(this.b, 0, zArr, 0, i);
            System.arraycopy(this.b, i, zArr, i + 1, this.c - i);
            this.b = zArr;
        }
        this.b[i] = z;
        this.c++;
        this.modCount++;
    }

    @Override // defpackage.dgs, java.util.AbstractCollection, java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        c();
        dim.a(collection);
        if (!(collection instanceof dgy)) {
            return super.addAll(collection);
        }
        dgy dgy = (dgy) collection;
        if (dgy.c == 0) {
            return false;
        }
        if (Integer.MAX_VALUE - this.c < dgy.c) {
            throw new OutOfMemoryError();
        }
        int i = this.c + dgy.c;
        if (i > this.b.length) {
            this.b = Arrays.copyOf(this.b, i);
        }
        System.arraycopy(dgy.b, 0, this.b, this.c, dgy.c);
        this.c = i;
        this.modCount++;
        return true;
    }

    @Override // defpackage.dgs, java.util.List
    public final boolean remove(Object obj) {
        c();
        for (int i = 0; i < this.c; i++) {
            if (obj.equals(Boolean.valueOf(this.b[i]))) {
                System.arraycopy(this.b, i + 1, this.b, i, this.c - i);
                this.c--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    private final void b(int i) {
        if (i < 0 || i >= this.c) {
            throw new IndexOutOfBoundsException(c(i));
        }
    }

    private final String c(int i) {
        return new StringBuilder(35).append("Index:").append(i).append(", Size:").append(this.c).toString();
    }

    @Override // defpackage.dgs, java.util.List, java.util.AbstractList
    public final /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        c();
        b(i);
        boolean z = this.b[i];
        this.b[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    @Override // defpackage.dgs, java.util.List, java.util.AbstractList
    public final /* synthetic */ Object remove(int i) {
        c();
        b(i);
        boolean z = this.b[i];
        if (i < this.c - 1) {
            System.arraycopy(this.b, i + 1, this.b, i, this.c - i);
        }
        this.c--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    @Override // defpackage.dgs, java.util.List, java.util.AbstractList
    public final /* synthetic */ void add(int i, Object obj) {
        a(i, ((Boolean) obj).booleanValue());
    }

    @Override // defpackage.diq
    public final /* synthetic */ diq a(int i) {
        if (i >= this.c) {
            return new dgy(Arrays.copyOf(this.b, i), this.c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object get(int i) {
        b(i);
        return Boolean.valueOf(this.b[i]);
    }

    static {
        new dgy().a = false;
    }
}
