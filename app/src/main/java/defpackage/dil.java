package defpackage;

/* renamed from: dil reason: default package */
/* compiled from: PG */
public final class dil extends defpackage.dgs implements defpackage.dip, defpackage.djy, java.util.RandomAccess {
    public static final defpackage.dil b;
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
            throw new java.lang.IndexOutOfBoundsException("toIndex < fromIndex");
        }
        java.lang.System.arraycopy(this.c, i2, this.c, i, this.d - i2);
        this.d -= i2 - i;
        this.modCount++;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.dil)) {
            return super.equals(obj);
        }
        defpackage.dil dil = (defpackage.dil) obj;
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

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.d; i2++) {
            i = (i * 31) + this.c[i2];
        }
        return i;
    }

    /* renamed from: b */
    public final defpackage.dip a(int i) {
        if (i >= this.d) {
            return new defpackage.dil(java.util.Arrays.copyOf(this.c, i), this.d);
        }
        throw new java.lang.IllegalArgumentException();
    }

    public final int c(int i) {
        e(i);
        return this.c[i];
    }

    public final int size() {
        return this.d;
    }

    public final void d(int i) {
        a(this.d, i);
    }

    private final void a(int i, int i2) {
        c();
        if (i < 0 || i > this.d) {
            throw new java.lang.IndexOutOfBoundsException(f(i));
        }
        if (this.d < this.c.length) {
            java.lang.System.arraycopy(this.c, i, this.c, i + 1, this.d - i);
        } else {
            int[] iArr = new int[(((this.d * 3) / 2) + 1)];
            java.lang.System.arraycopy(this.c, 0, iArr, 0, i);
            java.lang.System.arraycopy(this.c, i, iArr, i + 1, this.d - i);
            this.c = iArr;
        }
        this.c[i] = i2;
        this.d++;
        this.modCount++;
    }

    public final boolean addAll(java.util.Collection collection) {
        c();
        defpackage.dim.a((java.lang.Object) collection);
        if (!(collection instanceof defpackage.dil)) {
            return super.addAll(collection);
        }
        defpackage.dil dil = (defpackage.dil) collection;
        if (dil.d == 0) {
            return false;
        }
        if (Integer.MAX_VALUE - this.d < dil.d) {
            throw new java.lang.OutOfMemoryError();
        }
        int i = this.d + dil.d;
        if (i > this.c.length) {
            this.c = java.util.Arrays.copyOf(this.c, i);
        }
        java.lang.System.arraycopy(dil.c, 0, this.c, this.d, dil.d);
        this.d = i;
        this.modCount++;
        return true;
    }

    public final boolean remove(java.lang.Object obj) {
        c();
        for (int i = 0; i < this.d; i++) {
            if (obj.equals(java.lang.Integer.valueOf(this.c[i]))) {
                java.lang.System.arraycopy(this.c, i + 1, this.c, i, this.d - i);
                this.d--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    private final void e(int i) {
        if (i < 0 || i >= this.d) {
            throw new java.lang.IndexOutOfBoundsException(f(i));
        }
    }

    private final java.lang.String f(int i) {
        return "Index:" + i + ", Size:" + this.d;
    }

    public final /* synthetic */ java.lang.Object set(int i, java.lang.Object obj) {
        int intValue = ((java.lang.Integer) obj).intValue();
        c();
        e(i);
        int i2 = this.c[i];
        this.c[i] = intValue;
        return java.lang.Integer.valueOf(i2);
    }

    public final /* synthetic */ java.lang.Object remove(int i) {
        c();
        e(i);
        int i2 = this.c[i];
        if (i < this.d - 1) {
            java.lang.System.arraycopy(this.c, i + 1, this.c, i, this.d - i);
        }
        this.d--;
        this.modCount++;
        return java.lang.Integer.valueOf(i2);
    }

    public final /* synthetic */ void add(int i, java.lang.Object obj) {
        a(i, ((java.lang.Integer) obj).intValue());
    }

    public final /* synthetic */ java.lang.Object get(int i) {
        return java.lang.Integer.valueOf(c(i));
    }

    static {
        defpackage.dil dil = new defpackage.dil();
        b = dil;
        dil.a = false;
    }
}
