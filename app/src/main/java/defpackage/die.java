package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: die  reason: default package */
/* compiled from: PG */
final class die extends dgs implements diq, djy, RandomAccess {
    private float[] b;
    private int c;

    die() {
        this(new float[10], 0);
    }

    private die(float[] fArr, int i) {
        this.b = fArr;
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
        if (!(obj instanceof die)) {
            return super.equals(obj);
        }
        die die = (die) obj;
        if (this.c != die.c) {
            return false;
        }
        float[] fArr = die.b;
        for (int i = 0; i < this.c; i++) {
            if (this.b[i] != fArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.dgs
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.c; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.b[i2]);
        }
        return i;
    }

    public final int size() {
        return this.c;
    }

    public final void a(float f) {
        a(this.c, f);
    }

    private final void a(int i, float f) {
        c();
        if (i < 0 || i > this.c) {
            throw new IndexOutOfBoundsException(c(i));
        }
        if (this.c < this.b.length) {
            System.arraycopy(this.b, i, this.b, i + 1, this.c - i);
        } else {
            float[] fArr = new float[(((this.c * 3) / 2) + 1)];
            System.arraycopy(this.b, 0, fArr, 0, i);
            System.arraycopy(this.b, i, fArr, i + 1, this.c - i);
            this.b = fArr;
        }
        this.b[i] = f;
        this.c++;
        this.modCount++;
    }

    @Override // defpackage.dgs, java.util.AbstractCollection, java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        c();
        dim.a(collection);
        if (!(collection instanceof die)) {
            return super.addAll(collection);
        }
        die die = (die) collection;
        if (die.c == 0) {
            return false;
        }
        if (Integer.MAX_VALUE - this.c < die.c) {
            throw new OutOfMemoryError();
        }
        int i = this.c + die.c;
        if (i > this.b.length) {
            this.b = Arrays.copyOf(this.b, i);
        }
        System.arraycopy(die.b, 0, this.b, this.c, die.c);
        this.c = i;
        this.modCount++;
        return true;
    }

    @Override // defpackage.dgs, java.util.List
    public final boolean remove(Object obj) {
        c();
        for (int i = 0; i < this.c; i++) {
            if (obj.equals(Float.valueOf(this.b[i]))) {
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
        float floatValue = ((Float) obj).floatValue();
        c();
        b(i);
        float f = this.b[i];
        this.b[i] = floatValue;
        return Float.valueOf(f);
    }

    @Override // defpackage.dgs, java.util.List, java.util.AbstractList
    public final /* synthetic */ Object remove(int i) {
        c();
        b(i);
        float f = this.b[i];
        if (i < this.c - 1) {
            System.arraycopy(this.b, i + 1, this.b, i, this.c - i);
        }
        this.c--;
        this.modCount++;
        return Float.valueOf(f);
    }

    @Override // defpackage.dgs, java.util.List, java.util.AbstractList
    public final /* synthetic */ void add(int i, Object obj) {
        a(i, ((Float) obj).floatValue());
    }

    @Override // defpackage.diq
    public final /* synthetic */ diq a(int i) {
        if (i >= this.c) {
            return new die(Arrays.copyOf(this.b, i), this.c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object get(int i) {
        b(i);
        return Float.valueOf(this.b[i]);
    }

    static {
        new die().a = false;
    }
}
