package defpackage;

/* renamed from: cng reason: default package */
/* compiled from: PG */
public final class cng {
    public static final java.lang.Object a = new java.lang.Object();
    public int[] b;
    public java.lang.Object[] c;
    private int d;
    private int e;

    public cng() {
        a();
    }

    public final void a() {
        this.d = 0;
        this.b = new int[defpackage.cne.a[this.d]];
        this.c = new java.lang.Object[defpackage.cne.a[this.d]];
    }

    public final java.lang.Object a(int i, java.lang.Object obj) {
        boolean z = false;
        defpackage.cky.a(obj);
        int b2 = b(i);
        if (this.c[b2] != null && this.c[b2] != a) {
            return this.c[b2];
        }
        this.b[b2] = i;
        this.e++;
        this.c[b2] = obj;
        if (this.e > this.b.length / 2) {
            if (this.d < defpackage.cne.a.length - 1) {
                int[] iArr = this.b;
                java.lang.Object[] objArr = this.c;
                this.d++;
                this.b = new int[defpackage.cne.a[this.d]];
                this.c = new java.lang.Object[defpackage.cne.a[this.d]];
                int i2 = this.e;
                int length = iArr.length;
                this.e = 0;
                for (int i3 = 0; i3 < length; i3++) {
                    if (!(objArr[i3] == null || objArr[i3] == a)) {
                        a(iArr[i3], objArr[i3]);
                    }
                }
                if (i2 == this.e) {
                    z = true;
                }
                defpackage.cky.b(z);
            } else {
                throw new java.lang.IllegalStateException("Too many items, you'd better use array map instead.");
            }
        }
        return null;
    }

    public final java.lang.Object a(int i) {
        java.lang.Object obj = this.c[b(i)];
        if (obj == a) {
            return null;
        }
        return obj;
    }

    private final int b(int i) {
        int length = this.b.length;
        boolean z = false;
        int a2 = (defpackage.cne.a(i) & Integer.MAX_VALUE) % length;
        int i2 = 0;
        while (true) {
            if (this.c[a2] == a) {
                if (!z) {
                    z = true;
                    i2 = a2;
                }
            } else if (this.c[a2] == null) {
                if (z) {
                    return i2;
                }
                return a2;
            } else if (this.b[a2] == i) {
                return a2;
            }
            a2++;
            if (a2 >= length) {
                a2 = 0;
            }
        }
    }
}
