package defpackage;

/* renamed from: djd reason: default package */
/* compiled from: PG */
final class djd extends defpackage.dgs implements defpackage.diq, defpackage.djy, java.util.RandomAccess {
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
        if (!(obj instanceof defpackage.djd)) {
            return super.equals(obj);
        }
        defpackage.djd djd = (defpackage.djd) obj;
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

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.c; i2++) {
            i = (i * 31) + defpackage.dim.a(this.b[i2]);
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
            throw new java.lang.IndexOutOfBoundsException(d(i));
        }
        if (this.c < this.b.length) {
            java.lang.System.arraycopy(this.b, i, this.b, i + 1, this.c - i);
        } else {
            long[] jArr = new long[(((this.c * 3) / 2) + 1)];
            java.lang.System.arraycopy(this.b, 0, jArr, 0, i);
            java.lang.System.arraycopy(this.b, i, jArr, i + 1, this.c - i);
            this.b = jArr;
        }
        this.b[i] = j;
        this.c++;
        this.modCount++;
    }

    public final boolean addAll(java.util.Collection collection) {
        c();
        defpackage.dim.a((java.lang.Object) collection);
        if (!(collection instanceof defpackage.djd)) {
            return super.addAll(collection);
        }
        defpackage.djd djd = (defpackage.djd) collection;
        if (djd.c == 0) {
            return false;
        }
        if (Integer.MAX_VALUE - this.c < djd.c) {
            throw new java.lang.OutOfMemoryError();
        }
        int i = this.c + djd.c;
        if (i > this.b.length) {
            this.b = java.util.Arrays.copyOf(this.b, i);
        }
        java.lang.System.arraycopy(djd.b, 0, this.b, this.c, djd.c);
        this.c = i;
        this.modCount++;
        return true;
    }

    public final boolean remove(java.lang.Object obj) {
        c();
        for (int i = 0; i < this.c; i++) {
            if (obj.equals(java.lang.Long.valueOf(this.b[i]))) {
                java.lang.System.arraycopy(this.b, i + 1, this.b, i, this.c - i);
                this.c--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    private final void c(int i) {
        if (i < 0 || i >= this.c) {
            throw new java.lang.IndexOutOfBoundsException(d(i));
        }
    }

    private final java.lang.String d(int i) {
        return "Index:" + i + ", Size:" + this.c;
    }

    public final /* synthetic */ java.lang.Object set(int i, java.lang.Object obj) {
        long longValue = ((java.lang.Long) obj).longValue();
        c();
        c(i);
        long j = this.b[i];
        this.b[i] = longValue;
        return java.lang.Long.valueOf(j);
    }

    public final /* synthetic */ java.lang.Object remove(int i) {
        c();
        c(i);
        long j = this.b[i];
        if (i < this.c - 1) {
            java.lang.System.arraycopy(this.b, i + 1, this.b, i, this.c - i);
        }
        this.c--;
        this.modCount++;
        return java.lang.Long.valueOf(j);
    }

    public final /* synthetic */ void add(int i, java.lang.Object obj) {
        a(i, ((java.lang.Long) obj).longValue());
    }

    public final /* synthetic */ defpackage.diq a(int i) {
        if (i >= this.c) {
            return new defpackage.djd(java.util.Arrays.copyOf(this.b, i), this.c);
        }
        throw new java.lang.IllegalArgumentException();
    }

    public final /* synthetic */ java.lang.Object get(int i) {
        return java.lang.Long.valueOf(b(i));
    }

    static {
        new defpackage.djd().a = false;
    }
}
