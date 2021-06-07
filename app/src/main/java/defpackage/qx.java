package defpackage;

/* renamed from: qx  reason: default package */
/* compiled from: PG */
public final class qx implements Cloneable {
    public static final Object a = new Object();
    public boolean b;
    public long[] c;
    public Object[] d;
    public int e;

    public qx() {
        this((byte) 0);
    }

    private qx(byte b2) {
        this.b = false;
        int b3 = qv.b(10);
        this.c = new long[b3];
        this.d = new Object[b3];
        this.e = 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final qx clone() {
        try {
            qx qxVar = (qx) super.clone();
            try {
                qxVar.c = (long[]) this.c.clone();
                qxVar.d = (Object[]) this.d.clone();
                return qxVar;
            } catch (CloneNotSupportedException e2) {
                return qxVar;
            }
        } catch (CloneNotSupportedException e3) {
            return null;
        }
    }

    public final Object a(long j) {
        int a2 = qv.a(this.c, this.e, j);
        if (a2 < 0 || this.d[a2] == a) {
            return null;
        }
        return this.d[a2];
    }

    public final void a() {
        int i = this.e;
        long[] jArr = this.c;
        Object[] objArr = this.d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
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

    public final void a(long j, Object obj) {
        int a2 = qv.a(this.c, this.e, j);
        if (a2 >= 0) {
            this.d[a2] = obj;
            return;
        }
        int i = a2 ^ -1;
        if (i >= this.e || this.d[i] != a) {
            if (this.b && this.e >= this.c.length) {
                a();
                i = qv.a(this.c, this.e, j) ^ -1;
            }
            if (this.e >= this.c.length) {
                int b2 = qv.b(this.e + 1);
                long[] jArr = new long[b2];
                Object[] objArr = new Object[b2];
                System.arraycopy(this.c, 0, jArr, 0, this.c.length);
                System.arraycopy(this.d, 0, objArr, 0, this.d.length);
                this.c = jArr;
                this.d = objArr;
            }
            if (this.e - i != 0) {
                System.arraycopy(this.c, i, this.c, i + 1, this.e - i);
                System.arraycopy(this.d, i, this.d, i + 1, this.e - i);
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

    public final Object b(int i) {
        if (this.b) {
            a();
        }
        return this.d[i];
    }

    public final void c() {
        int i = this.e;
        Object[] objArr = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.e = 0;
        this.b = false;
    }

    public final String toString() {
        if (b() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.e * 28);
        sb.append('{');
        for (int i = 0; i < this.e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(a(i));
            sb.append('=');
            Object b2 = b(i);
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
