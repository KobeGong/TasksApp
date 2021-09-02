package defpackage;

/* renamed from: ble reason: default package */
/* compiled from: PG */
public final class ble extends defpackage.bkw implements java.lang.Cloneable {
    private java.lang.String[] c;
    private java.lang.String[] d;
    private int[] e;
    private long[] f;
    private long[] g;

    public ble() {
        this.c = defpackage.bld.c;
        this.d = defpackage.bld.c;
        this.e = defpackage.bld.a;
        this.f = defpackage.bld.b;
        this.g = defpackage.bld.b;
        this.a = null;
        this.b = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final defpackage.ble clone() {
        try {
            defpackage.ble ble = (defpackage.ble) super.clone();
            if (this.c != null && this.c.length > 0) {
                ble.c = (java.lang.String[]) this.c.clone();
            }
            if (this.d != null && this.d.length > 0) {
                ble.d = (java.lang.String[]) this.d.clone();
            }
            if (this.e != null && this.e.length > 0) {
                ble.e = (int[]) this.e.clone();
            }
            if (this.f != null && this.f.length > 0) {
                ble.f = (long[]) this.f.clone();
            }
            if (this.g != null && this.g.length > 0) {
                ble.g = (long[]) this.g.clone();
            }
            return ble;
        } catch (java.lang.CloneNotSupportedException e2) {
            throw new java.lang.AssertionError(e2);
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.ble)) {
            return false;
        }
        defpackage.ble ble = (defpackage.ble) obj;
        if (!defpackage.bla.a((java.lang.Object[]) this.c, (java.lang.Object[]) ble.c)) {
            return false;
        }
        if (!defpackage.bla.a((java.lang.Object[]) this.d, (java.lang.Object[]) ble.d)) {
            return false;
        }
        if (!defpackage.bla.a(this.e, ble.e)) {
            return false;
        }
        if (!defpackage.bla.a(this.f, ble.f)) {
            return false;
        }
        if (!defpackage.bla.a(this.g, ble.g)) {
            return false;
        }
        if (this.a != null && !this.a.a()) {
            return this.a.equals(ble.a);
        }
        if (ble.a == null || ble.a.a()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((((((((getClass().getName().hashCode() + 527) * 31) + defpackage.bla.a((java.lang.Object[]) this.c)) * 31) + defpackage.bla.a((java.lang.Object[]) this.d)) * 31) + defpackage.bla.a(this.e)) * 31) + defpackage.bla.a(this.f)) * 31) + defpackage.bla.a(this.g)) * 31;
        if (this.a == null || this.a.a()) {
            i = 0;
        } else {
            i = this.a.hashCode();
        }
        return i + hashCode;
    }

    public final void a(defpackage.bku bku) {
        if (this.c != null && this.c.length > 0) {
            for (java.lang.String str : this.c) {
                if (str != null) {
                    bku.a(1, str);
                }
            }
        }
        if (this.d != null && this.d.length > 0) {
            for (java.lang.String str2 : this.d) {
                if (str2 != null) {
                    bku.a(2, str2);
                }
            }
        }
        if (this.e != null && this.e.length > 0) {
            for (int a : this.e) {
                bku.a(3, a);
            }
        }
        if (this.f != null && this.f.length > 0) {
            for (long a2 : this.f) {
                bku.a(4, a2);
            }
        }
        if (this.g != null && this.g.length > 0) {
            for (long a3 : this.g) {
                bku.a(5, a3);
            }
        }
        super.a(bku);
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int i;
        int a = super.a();
        if (this.c == null || this.c.length <= 0) {
            i = a;
        } else {
            int i2 = 0;
            int i3 = 0;
            for (java.lang.String str : this.c) {
                if (str != null) {
                    i3++;
                    i2 += defpackage.bku.a(str);
                }
            }
            i = a + i2 + (i3 * 1);
        }
        if (this.d != null && this.d.length > 0) {
            int i4 = 0;
            int i5 = 0;
            for (java.lang.String str2 : this.d) {
                if (str2 != null) {
                    i5++;
                    i4 += defpackage.bku.a(str2);
                }
            }
            i = i + i4 + (i5 * 1);
        }
        if (this.e != null && this.e.length > 0) {
            int i6 = 0;
            for (int a2 : this.e) {
                i6 += defpackage.bku.a(a2);
            }
            i = i + i6 + (this.e.length * 1);
        }
        if (this.f != null && this.f.length > 0) {
            int i7 = 0;
            for (long b : this.f) {
                i7 += defpackage.bku.b(b);
            }
            i = i + i7 + (this.f.length * 1);
        }
        if (this.g == null || this.g.length <= 0) {
            return i;
        }
        int i8 = 0;
        for (long b2 : this.g) {
            i8 += defpackage.bku.b(b2);
        }
        return i + i8 + (this.g.length * 1);
    }

    public final /* synthetic */ defpackage.bkw b() {
        return (defpackage.ble) clone();
    }

    public final /* synthetic */ defpackage.blb c() {
        return (defpackage.ble) clone();
    }
}
