package defpackage;

/* renamed from: qx reason: default package */
/* compiled from: PG */
public final class qx implements java.lang.Cloneable {
    public static final java.lang.Object a = new java.lang.Object();
    public boolean b;
    public long[] c;
    public java.lang.Object[] d;
    public int e;

    public qx() {
        this(0);
    }

    private qx(byte b2) {
        this.b = false;
        int b3 = defpackage.qv.b(10);
        this.c = new long[b3];
        this.d = new java.lang.Object[b3];
        this.e = 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final defpackage.qx clone() {
        try {
            defpackage.qx qxVar = (defpackage.qx) super.clone();
            try {
                qxVar.c = (long[]) this.c.clone();
                qxVar.d = (java.lang.Object[]) this.d.clone();
                return qxVar;
            } catch (java.lang.CloneNotSupportedException e2) {
                return qxVar;
            }
        } catch (java.lang.CloneNotSupportedException e3) {
            return null;
        }
    }

    public final java.lang.Object a(long j) {
        int a2 = defpackage.qv.a(this.c, this.e, j);
        if (a2 < 0 || this.d[a2] == a) {
            return null;
        }
        return this.d[a2];
    }

    public final void a() {
        int i = this.e;
        long[] jArr = this.c;
        java.lang.Object[] objArr = this.d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            java.lang.Object obj = objArr[i3];
            if (obj != a) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.b = false;
        this.e = i2;
    }

    public final void a(long j, java.lang.Object obj) {
        int a2 = defpackage.qv.a(this.c, this.e, j);
        if (a2 >= 0) {
            this.d[a2] = obj;
            return;
        }
        int i = a2 ^ -1;
        if (i >= this.e || this.d[i] != a) {
            if (this.b && this.e >= this.c.length) {
                a();
                i = defpackage.qv.a(this.c, this.e, j) ^ -1;
            }
            if (this.e >= this.c.length) {
                int b2 = defpackage.qv.b(this.e + 1);
                long[] jArr = new long[b2];
                java.lang.Object[] objArr = new java.lang.Object[b2];
                java.lang.System.arraycopy(this.c, 0, jArr, 0, this.c.length);
                java.lang.System.arraycopy(this.d, 0, objArr, 0, this.d.length);
                this.c = jArr;
                this.d = objArr;
            }
            if (this.e - i != 0) {
                java.lang.System.arraycopy(this.c, i, this.c, i + 1, this.e - i);
                java.lang.System.arraycopy(this.d, i, this.d, i + 1, this.e - i);
            }
            this.c[i] = j;
            this.d[i] = obj;
            this.e++;
            return;
        }
        this.c[i] = j;
        this.d[i] = obj;
    }

    public final int b() {
        if (this.b) {
            a();
        }
        return this.e;
    }

    public final long a(int i) {
        if (this.b) {
            a();
        }
        return this.c[i];
    }

    public final java.lang.Object b(int i) {
        if (this.b) {
            a();
        }
        return this.d[i];
    }

    public final void c() {
        int i = this.e;
        java.lang.Object[] objArr = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.e = 0;
        this.b = false;
    }

    public final java.lang.String toString() {
        if (b() <= 0) {
            return "{}";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(this.e * 28);
        sb.append('{');
        for (int i = 0; i < this.e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(a(i));
            sb.append('=');
            java.lang.Object b2 = b(i);
            if (b2 != this) {
                sb.append(b2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
