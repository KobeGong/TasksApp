package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: dhu  reason: default package */
/* compiled from: PG */
final class dhu extends dgs implements diq, djy, RandomAccess {
    private double[] b;
    private int c;

    dhu() {
        this(new double[10], 0);
    }

    private dhu(double[] dArr, int i) {
        this.b = dArr;
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
        if (!(obj instanceof dhu)) {
            return super.equals(obj);
        }
        dhu dhu = (dhu) obj;
        if (this.c != dhu.c) {
            return false;
        }
        double[] dArr = dhu.b;
        for (int i = 0; i < this.c; i++) {
            if (this.b[i] != dArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.dgs
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.c; i2++) {
            i = (i * 31) + dim.a(Double.doubleToLongBits(this.b[i2]));
        }
        return i;
    }

    public final int size() {
        return this.c;
    }

    public final void a(double d) {
        a(this.c, d);
    }

    private final void a(int i, double d) {
        c();
        if (i < 0 || i > this.c) {
            throw new IndexOutOfBoundsException(c(i));
        }
        if (this.c < this.b.length) {
            System.arraycopy(this.b, i, this.b, i + 1, this.c - i);
        } else {
            double[] dArr = new double[(((this.c * 3) / 2) + 1)];
            System.arraycopy(this.b, 0, dArr, 0, i);
            System.arraycopy(this.b, i, dArr, i + 1, this.c - i);
            this.b = dArr;
        }
        this.b[i] = d;
        this.c++;
        this.modCount++;
    }

    @Override // defpackage.dgs, java.util.AbstractCollection, java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        c();
        dim.a(collection);
        if (!(collection instanceof dhu)) {
            return super.addAll(collection);
        }
        dhu dhu = (dhu) collection;
        if (dhu.c == 0) {
            return false;
        }
        if (Integer.MAX_VALUE - this.c < dhu.c) {
            throw new OutOfMemoryError();
        }
        int i = this.c + dhu.c;
        if (i > this.b.length) {
            this.b = Arrays.copyOf(this.b, i);
        }
        System.arraycopy(dhu.b, 0, this.b, this.c, dhu.c);
        this.c = i;
        this.modCount++;
        return true;
    }

    @Override // defpackage.dgs, java.util.List
    public final boolean remove(Object obj) {
        c();
        for (int i = 0; i < this.c; i++) {
            if (obj.equals(Double.valueOf(this.b[i]))) {
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
        double doubleValue = ((Double) obj).doubleValue();
        c();
        b(i);
        double d = this.b[i];
        this.b[i] = doubleValue;
        return Double.valueOf(d);
    }

    @Override // defpackage.dgs, java.util.List, java.util.AbstractList
    public final /* synthetic */ Object remove(int i) {
        c();
        b(i);
        double d = this.b[i];
        if (i < this.c - 1) {
            System.arraycopy(this.b, i + 1, this.b, i, this.c - i);
        }
        this.c--;
        this.modCount++;
        return Double.valueOf(d);
    }

    @Override // defpackage.dgs, java.util.List, java.util.AbstractList
    public final /* synthetic */ void add(int i, Object obj) {
        a(i, ((Double) obj).doubleValue());
    }

    @Override // defpackage.diq
    public final /* synthetic */ diq a(int i) {
        if (i >= this.c) {
            return new dhu(Arrays.copyOf(this.b, i), this.c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object get(int i) {
        b(i);
        return Double.valueOf(this.b[i]);
    }

    static {
        new dhu().a = false;
    }
}
