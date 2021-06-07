package defpackage;

/* renamed from: rj  reason: default package */
/* compiled from: PG */
public final class rj implements Cloneable {
    public static final Object a = new Object();
    public boolean b;
    public int[] c;
    public Object[] d;
    public int e;

    public rj() {
        this(10);
    }

    public rj(int i) {
        this.b = false;
        if (i == 0) {
            this.c = qv.a;
            this.d = qv.b;
        } else {
            int a2 = qv.a(i);
            this.c = new int[a2];
            this.d = new Object[a2];
        }
        this.e = 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final rj clone() {
        try {
            rj rjVar = (rj) super.clone();
            try {
                rjVar.c = (int[]) this.c.clone();
                rjVar.d = (Object[]) this.d.clone();
                return rjVar;
            } catch (CloneNotSupportedException e2) {
                return rjVar;
            }
        } catch (CloneNotSupportedException e3) {
            return null;
        }
    }

    public final Object a(int i) {
        int a2 = qv.a(this.c, this.e, i);
        if (a2 < 0 || this.d[a2] == a) {
            return null;
        }
        return this.d[a2];
    }

    public final void a() {
        int i = this.e;
        int[] iArr = this.c;
        Object[] objArr = this.d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != a) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.b = false;
        this.e = i2;
    }

    public final void a(int i, Object obj) {
        int a2 = qv.a(this.c, this.e, i);
        if (a2 >= 0) {
            this.d[a2] = obj;
            return;
        }
        int i2 = a2 ^ -1;
        if (i2 >= this.e || this.d[i2] != a) {
            if (this.b && this.e >= this.c.length) {
                a();
                i2 = qv.a(this.c, this.e, i) ^ -1;
            }
            if (this.e >= this.c.length) {
                int a3 = qv.a(this.e + 1);
                int[] iArr = new int[a3];
                Object[] objArr = new Object[a3];
                System.arraycopy(this.c, 0, iArr, 0, this.c.length);
                System.arraycopy(this.d, 0, objArr, 0, this.d.length);
                this.c = iArr;
                this.d = objArr;
            }
            if (this.e - i2 != 0) {
                System.arraycopy(this.c, i2, this.c, i2 + 1, this.e - i2);
                System.arraycopy(this.d, i2, this.d, i2 + 1, this.e - i2);
            }
            this.c[i2] = i;
            this.d[i2] = obj;
            this.e++;
            return;
        }
        this.c[i2] = i;
        this.d[i2] = obj;
    }

    public final int b() {
        if (this.b) {
            a();
        }
        return this.e;
    }

    public final int b(int i) {
        if (this.b) {
            a();
        }
        return this.c[i];
    }

    public final Object c(int i) {
        if (this.b) {
            a();
        }
        return this.d[i];
    }

    public final void b(int i, Object obj) {
        if (this.e == 0 || i > this.c[this.e - 1]) {
            if (this.b && this.e >= this.c.length) {
                a();
            }
            int i2 = this.e;
            if (i2 >= this.c.length) {
                int a2 = qv.a(i2 + 1);
                int[] iArr = new int[a2];
                Object[] objArr = new Object[a2];
                System.arraycopy(this.c, 0, iArr, 0, this.c.length);
                System.arraycopy(this.d, 0, objArr, 0, this.d.length);
                this.c = iArr;
                this.d = objArr;
            }
            this.c[i2] = i;
            this.d[i2] = obj;
            this.e = i2 + 1;
            return;
        }
        a(i, obj);
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
            sb.append(b(i));
            sb.append('=');
            Object c2 = c(i);
            if (c2 != this) {
                sb.append(c2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
