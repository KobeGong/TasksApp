package defpackage;

/* renamed from: die reason: default package */
/* compiled from: PG */
final class die extends defpackage.dgs implements defpackage.diq, defpackage.djy, java.util.RandomAccess {
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
        if (!(obj instanceof defpackage.die)) {
            return super.equals(obj);
        }
        defpackage.die die = (defpackage.die) obj;
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

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.c; i2++) {
            i = (i * 31) + java.lang.Float.floatToIntBits(this.b[i2]);
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
            throw new java.lang.IndexOutOfBoundsException(c(i));
        }
        if (this.c < this.b.length) {
            java.lang.System.arraycopy(this.b, i, this.b, i + 1, this.c - i);
        } else {
            float[] fArr = new float[(((this.c * 3) / 2) + 1)];
            java.lang.System.arraycopy(this.b, 0, fArr, 0, i);
            java.lang.System.arraycopy(this.b, i, fArr, i + 1, this.c - i);
            this.b = fArr;
        }
        this.b[i] = f;
        this.c++;
        this.modCount++;
    }

    public final boolean addAll(java.util.Collection collection) {
        c();
        defpackage.dim.a((java.lang.Object) collection);
        if (!(collection instanceof defpackage.die)) {
            return super.addAll(collection);
        }
        defpackage.die die = (defpackage.die) collection;
        if (die.c == 0) {
            return false;
        }
        if (Integer.MAX_VALUE - this.c < die.c) {
            throw new java.lang.OutOfMemoryError();
        }
        int i = this.c + die.c;
        if (i > this.b.length) {
            this.b = java.util.Arrays.copyOf(this.b, i);
        }
        java.lang.System.arraycopy(die.b, 0, this.b, this.c, die.c);
        this.c = i;
        this.modCount++;
        return true;
    }

    public final boolean remove(java.lang.Object obj) {
        c();
        for (int i = 0; i < this.c; i++) {
            if (obj.equals(java.lang.Float.valueOf(this.b[i]))) {
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
        float floatValue = ((java.lang.Float) obj).floatValue();
        c();
        b(i);
        float f = this.b[i];
        this.b[i] = floatValue;
        return java.lang.Float.valueOf(f);
    }

    public final /* synthetic */ java.lang.Object remove(int i) {
        c();
        b(i);
        float f = this.b[i];
        if (i < this.c - 1) {
            java.lang.System.arraycopy(this.b, i + 1, this.b, i, this.c - i);
        }
        this.c--;
        this.modCount++;
        return java.lang.Float.valueOf(f);
    }

    public final /* synthetic */ void add(int i, java.lang.Object obj) {
        a(i, ((java.lang.Float) obj).floatValue());
    }

    public final /* synthetic */ defpackage.diq a(int i) {
        if (i >= this.c) {
            return new defpackage.die(java.util.Arrays.copyOf(this.b, i), this.c);
        }
        throw new java.lang.IllegalArgumentException();
    }

    public final /* synthetic */ java.lang.Object get(int i) {
        b(i);
        return java.lang.Float.valueOf(this.b[i]);
    }

    static {
        new defpackage.die().a = false;
    }
}
