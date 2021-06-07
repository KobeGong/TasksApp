package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: dil  reason: default package */
/* compiled from: PG */
public final class dil extends dgs implements dip, djy, RandomAccess {
    public static final dil b;
    private int[] c;
    private int d;

    dil() {
        this(new int[10], 0);
    }

    private dil(int[] iArr, int i) {
        this.c = iArr;
        this.d = i;
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        c();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        System.arraycopy(this.c, i2, this.c, i, this.d - i2);
        this.d -= i2 - i;
        this.modCount++;
    }

    @Override // defpackage.dgs
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dil)) {
            return super.equals(obj);
        }
        dil dil = (dil) obj;
        if (this.d != dil.d) {
            return false;
        }
        int[] iArr = dil.c;
        for (int i = 0; i < this.d; i++) {
            if (this.c[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.dgs
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.d; i2++) {
            i = (i * 31) + this.c[i2];
        }
        return i;
    }

    @Override // defpackage.dip
    /* renamed from: b */
    public final dip a(int i) {
        if (i >= this.d) {
            return new dil(Arrays.copyOf(this.c, i), this.d);
        }
        throw new IllegalArgumentException();
    }

    public final int c(int i) {
        e(i);
        return this.c[i];
    }

    public final int size() {
        return this.d;
    }

    @Override // defpackage.dip
    public final void d(int i) {
        a(this.d, i);
    }

    private final void a(int i, int i2) {
        c();
        if (i < 0 || i > this.d) {
            throw new IndexOutOfBoundsException(f(i));
        }
        if (this.d < this.c.length) {
            System.arraycopy(this.c, i, this.c, i + 1, this.d - i);
        } else {
            int[] iArr = new int[(((this.d * 3) / 2) + 1)];
            System.arraycopy(this.c, 0, iArr, 0, i);
            System.arraycopy(this.c, i, iArr, i + 1, this.d - i);
            this.c = iArr;
        }
        this.c[i] = i2;
        this.d++;
        this.modCount++;
    }

    @Override // defpackage.dgs, java.util.AbstractCollection, java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        c();
        dim.a(collection);
        if (!(collection instanceof dil)) {
            return super.addAll(collection);
        }
        dil dil = (dil) collection;
        if (dil.d == 0) {
            return false;
        }
        if (Integer.MAX_VALUE - this.d < dil.d) {
            throw new OutOfMemoryError();
        }
        int i = this.d + dil.d;
        if (i > this.c.length) {
            this.c = Arrays.copyOf(this.c, i);
        }
        System.arraycopy(dil.c, 0, this.c, this.d, dil.d);
        this.d = i;
        this.modCount++;
        return true;
    }

    @Override // defpackage.dgs, java.util.List
    public final boolean remove(Object obj) {
        c();
        for (int i = 0; i < this.d; i++) {
            if (obj.equals(Integer.valueOf(this.c[i]))) {
                System.arraycopy(this.c, i + 1, this.c, i, this.d - i);
                this.d--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    private final void e(int i) {
        if (i < 0 || i >= this.d) {
            throw new IndexOutOfBoundsException(f(i));
        }
    }

    private final String f(int i) {
        return new StringBuilder(35).append("Index:").append(i).append(", Size:").append(this.d).toString();
    }

    @Override // defpackage.dgs, java.util.List, java.util.AbstractList
    public final /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        c();
        e(i);
        int i2 = this.c[i];
        this.c[i] = intValue;
        return Integer.valueOf(i2);
    }

    @Override // defpackage.dgs, java.util.List, java.util.AbstractList
    public final /* synthetic */ Object remove(int i) {
        c();
        e(i);
        int i2 = this.c[i];
        if (i < this.d - 1) {
            System.arraycopy(this.c, i + 1, this.c, i, this.d - i);
        }
        this.d--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    @Override // defpackage.dgs, java.util.List, java.util.AbstractList
    public final /* synthetic */ void add(int i, Object obj) {
        a(i, ((Integer) obj).intValue());
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object get(int i) {
        return Integer.valueOf(c(i));
    }

    static {
        dil dil = new dil();
        b = dil;
        dil.a = false;
    }
}
