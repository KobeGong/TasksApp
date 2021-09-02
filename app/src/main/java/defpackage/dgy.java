package defpackage;

/* renamed from: dgy reason: default package */
/* compiled from: PG */
final class dgy extends defpackage.dgs implements defpackage.diq, defpackage.djy, java.util.RandomAccess {
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
        if (!(obj instanceof defpackage.dgy)) {
            return super.equals(obj);
        }
        defpackage.dgy dgy = (defpackage.dgy) obj;
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

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.c; i2++) {
            i = (i * 31) + defpackage.dim.a(this.b[i2]);
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
            throw new java.lang.IndexOutOfBoundsException(c(i));
        }
        if (this.c < this.b.length) {
            java.lang.System.arraycopy(this.b, i, this.b, i + 1, this.c - i);
        } else {
            boolean[] zArr = new boolean[(((this.c * 3) / 2) + 1)];
            java.lang.System.arraycopy(this.b, 0, zArr, 0, i);
            java.lang.System.arraycopy(this.b, i, zArr, i + 1, this.c - i);
            this.b = zArr;
        }
        this.b[i] = z;
        this.c++;
        this.modCount++;
    }

    public final boolean addAll(java.util.Collection collection) {
        c();
        defpackage.dim.a((java.lang.Object) collection);
        if (!(collection instanceof defpackage.dgy)) {
            return super.addAll(collection);
        }
        defpackage.dgy dgy = (defpackage.dgy) collection;
        if (dgy.c == 0) {
            return false;
        }
        if (Integer.MAX_VALUE - this.c < dgy.c) {
            throw new java.lang.OutOfMemoryError();
        }
        int i = this.c + dgy.c;
        if (i > this.b.length) {
            this.b = java.util.Arrays.copyOf(this.b, i);
        }
        java.lang.System.arraycopy(dgy.b, 0, this.b, this.c, dgy.c);
        this.c = i;
        this.modCount++;
        return true;
    }

    public final boolean remove(java.lang.Object obj) {
        c();
        for (int i = 0; i < this.c; i++) {
            if (obj.equals(java.lang.Boolean.valueOf(this.b[i]))) {
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
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        c();
        b(i);
        boolean z = this.b[i];
        this.b[i] = booleanValue;
        return java.lang.Boolean.valueOf(z);
    }

    public final /* synthetic */ java.lang.Object remove(int i) {
        c();
        b(i);
        boolean z = this.b[i];
        if (i < this.c - 1) {
            java.lang.System.arraycopy(this.b, i + 1, this.b, i, this.c - i);
        }
        this.c--;
        this.modCount++;
        return java.lang.Boolean.valueOf(z);
    }

    public final /* synthetic */ void add(int i, java.lang.Object obj) {
        a(i, ((java.lang.Boolean) obj).booleanValue());
    }

    public final /* synthetic */ defpackage.diq a(int i) {
        if (i >= this.c) {
            return new defpackage.dgy(java.util.Arrays.copyOf(this.b, i), this.c);
        }
        throw new java.lang.IllegalArgumentException();
    }

    public final /* synthetic */ java.lang.Object get(int i) {
        b(i);
        return java.lang.Boolean.valueOf(this.b[i]);
    }

    static {
        new defpackage.dgy().a = false;
    }
}
