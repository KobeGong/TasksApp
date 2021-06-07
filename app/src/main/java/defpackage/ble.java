package defpackage;

/* renamed from: ble  reason: default package */
/* compiled from: PG */
public final class ble extends bkw implements Cloneable {
    private String[] c = bld.c;
    private String[] d = bld.c;
    private int[] e = bld.a;
    private long[] f = bld.b;
    private long[] g = bld.b;

    public ble() {
        this.a = null;
        this.b = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final ble clone() {
        try {
            ble ble = (ble) super.clone();
            if (this.c != null && this.c.length > 0) {
                ble.c = (String[]) this.c.clone();
            }
            if (this.d != null && this.d.length > 0) {
                ble.d = (String[]) this.d.clone();
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
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ble)) {
            return false;
        }
        ble ble = (ble) obj;
        if (!bla.a(this.c, ble.c)) {
            return false;
        }
        if (!bla.a(this.d, ble.d)) {
            return false;
        }
        if (!bla.a(this.e, ble.e)) {
            return false;
        }
        if (!bla.a(this.f, ble.f)) {
            return false;
        }
        if (!bla.a(this.g, ble.g)) {
            return false;
        }
        if (this.a == null || this.a.a()) {
            return ble.a == null || ble.a.a();
        }
        return this.a.equals(ble.a);
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((((((((getClass().getName().hashCode() + 527) * 31) + bla.a(this.c)) * 31) + bla.a(this.d)) * 31) + bla.a(this.e)) * 31) + bla.a(this.f)) * 31) + bla.a(this.g)) * 31;
        if (this.a == null || this.a.a()) {
            i = 0;
        } else {
            i = this.a.hashCode();
        }
        return i + hashCode;
    }

    @Override // defpackage.blb, defpackage.bkw
    public final void a(bku bku) {
        if (this.c != null && this.c.length > 0) {
            for (int i = 0; i < this.c.length; i++) {
                String str = this.c[i];
                if (str != null) {
                    bku.a(1, str);
                }
            }
        }
        if (this.d != null && this.d.length > 0) {
            for (int i2 = 0; i2 < this.d.length; i2++) {
                String str2 = this.d[i2];
                if (str2 != null) {
                    bku.a(2, str2);
                }
            }
        }
        if (this.e != null && this.e.length > 0) {
            for (int i3 = 0; i3 < this.e.length; i3++) {
                bku.a(3, this.e[i3]);
            }
        }
        if (this.f != null && this.f.length > 0) {
            for (int i4 = 0; i4 < this.f.length; i4++) {
                bku.a(4, this.f[i4]);
            }
        }
        if (this.g != null && this.g.length > 0) {
            for (int i5 = 0; i5 < this.g.length; i5++) {
                bku.a(5, this.g[i5]);
            }
        }
        super.a(bku);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.blb, defpackage.bkw
    public final int a() {
        int i;
        int a = super.a();
        if (this.c == null || this.c.length <= 0) {
            i = a;
        } else {
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < this.c.length; i4++) {
                String str = this.c[i4];
                if (str != null) {
                    i3++;
                    i2 += bku.a(str);
                }
            }
            i = a + i2 + (i3 * 1);
        }
        if (this.d != null && this.d.length > 0) {
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < this.d.length; i7++) {
                String str2 = this.d[i7];
                if (str2 != null) {
                    i6++;
                    i5 += bku.a(str2);
                }
            }
            i = i + i5 + (i6 * 1);
        }
        if (this.e != null && this.e.length > 0) {
            int i8 = 0;
            for (int i9 = 0; i9 < this.e.length; i9++) {
                i8 += bku.a(this.e[i9]);
            }
            i = i + i8 + (this.e.length * 1);
        }
        if (this.f != null && this.f.length > 0) {
            int i10 = 0;
            for (int i11 = 0; i11 < this.f.length; i11++) {
                i10 += bku.b(this.f[i11]);
            }
            i = i + i10 + (this.f.length * 1);
        }
        if (this.g == null || this.g.length <= 0) {
            return i;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.g.length; i13++) {
            i12 += bku.b(this.g[i13]);
        }
        return i + i12 + (this.g.length * 1);
    }

    @Override // defpackage.bkw
    public final /* synthetic */ bkw b() {
        return (ble) clone();
    }

    @Override // defpackage.blb, defpackage.bkw
    public final /* synthetic */ blb c() {
        return (ble) clone();
    }
}
