package defpackage;

/* renamed from: dhu reason: default package */
/* compiled from: PG */
final class dhu extends defpackage.dgs implements defpackage.diq, defpackage.djy, java.util.RandomAccess {
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
            throw new java.lang.IndexOutOfBoundsException("toIndex < fromIndex");
        }
        java.lang.System.arraycopy(this.b, i2, this.b, i, this.c - i2);
        this.c -= i2 - i;
        this.modCount++;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.dhu)) {
            return super.equals(obj);
        }
        defpackage.dhu dhu = (defpackage.dhu) obj;
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

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.c; i2++) {
            i = (i * 31) + defpackage.dim.a(java.lang.Double.doubleToLongBits(this.b[i2]));
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
            throw new java.lang.IndexOutOfBoundsException(c(i));
        }
        if (this.c < this.b.length) {
            java.lang.System.arraycopy(this.b, i, this.b, i + 1, this.c - i);
        } else {
            double[] dArr = new double[(((this.c * 3) / 2) + 1)];
            java.lang.System.arraycopy(this.b, 0, dArr, 0, i);
            java.lang.System.arraycopy(this.b, i, dArr, i + 1, this.c - i);
            this.b = dArr;
        }
        this.b[i] = d;
        this.c++;
        this.modCount++;
    }

    public final boolean addAll(java.util.Collection collection) {
        c();
        defpackage.dim.a((java.lang.Object) collection);
        if (!(collection instanceof defpackage.dhu)) {
            return super.addAll(collection);
        }
        defpackage.dhu dhu = (defpackage.dhu) collection;
        if (dhu.c == 0) {
            return false;
        }
        if (Integer.MAX_VALUE - this.c < dhu.c) {
            throw new java.lang.OutOfMemoryError();
        }
        int i = this.c + dhu.c;
        if (i > this.b.length) {
            this.b = java.util.Arrays.copyOf(this.b, i);
        }
        java.lang.System.arraycopy(dhu.b, 0, this.b, this.c, dhu.c);
        this.c = i;
        this.modCount++;
        return true;
    }

    public final boolean remove(java.lang.Object obj) {
        c();
        for (int i = 0; i < this.c; i++) {
            if (obj.equals(java.lang.Double.valueOf(this.b[i]))) {
                java.lang.System.arraycopy(this.b, i + 1, this.b, i, this.c - i);
                this.c--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    private final void b(int i) {
        if (i < 0 || i >= this.c) {
            throw new java.lang.IndexOutOfBoundsException(c(i));
        }
    }

    private final java.lang.String c(int i) {
        return "Index:" + i + ", Size:" + this.c;
    }

    public final /* synthetic */ java.lang.Object set(int i, java.lang.Object obj) {
        double doubleValue = ((java.lang.Double) obj).doubleValue();
        c();
        b(i);
        double d = this.b[i];
        this.b[i] = doubleValue;
        return java.lang.Double.valueOf(d);
    }

    public final /* synthetic */ java.lang.Object remove(int i) {
        c();
        b(i);
        double d = this.b[i];
        if (i < this.c - 1) {
            java.lang.System.arraycopy(this.b, i + 1, this.b, i, this.c - i);
        }
        this.c--;
        this.modCount++;
        return java.lang.Double.valueOf(d);
    }

    public final /* synthetic */ void add(int i, java.lang.Object obj) {
        a(i, ((java.lang.Double) obj).doubleValue());
    }

    public final /* synthetic */ defpackage.diq a(int i) {
        if (i >= this.c) {
            return new defpackage.dhu(java.util.Arrays.copyOf(this.b, i), this.c);
        }
        throw new java.lang.IllegalArgumentException();
    }

    public final /* synthetic */ java.lang.Object get(int i) {
        b(i);
        return java.lang.Double.valueOf(this.b[i]);
    }

    static {
        new defpackage.dhu().a = false;
    }
}
