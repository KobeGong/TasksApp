package defpackage;

/* renamed from: blh reason: default package */
/* compiled from: PG */
public final class blh extends defpackage.bkw implements java.lang.Cloneable {
    public long c;
    public long d;
    public byte[] e;
    public long f;
    public byte[] g;
    private java.lang.String h;
    private defpackage.bli[] i;
    private byte[] j;
    private defpackage.blf k;
    private java.lang.String l;
    private java.lang.String m;
    private defpackage.ble n;
    private java.lang.String o;
    private defpackage.blg p;
    private java.lang.String q;
    private int[] r;
    private defpackage.blj s;

    public blh() {
        this.c = 0;
        this.d = 0;
        this.h = "";
        this.i = defpackage.bli.e();
        this.j = defpackage.bld.e;
        this.k = null;
        this.e = defpackage.bld.e;
        this.l = "";
        this.m = "";
        this.n = null;
        this.o = "";
        this.f = 180000;
        this.p = null;
        this.g = defpackage.bld.e;
        this.q = "";
        this.r = defpackage.bld.a;
        this.s = null;
        this.a = null;
        this.b = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final defpackage.blh clone() {
        try {
            defpackage.blh blh = (defpackage.blh) super.clone();
            if (this.i != null && this.i.length > 0) {
                blh.i = new defpackage.bli[this.i.length];
                int i2 = 0;
                while (true) {
                    int i3 = i2;
                    if (i3 >= this.i.length) {
                        break;
                    }
                    if (this.i[i3] != null) {
                        blh.i[i3] = (defpackage.bli) this.i[i3].clone();
                    }
                    i2 = i3 + 1;
                }
            }
            if (this.k != null) {
                blh.k = (defpackage.blf) this.k.clone();
            }
            if (this.n != null) {
                blh.n = (defpackage.ble) this.n.clone();
            }
            if (this.p != null) {
                blh.p = (defpackage.blg) this.p.clone();
            }
            if (this.r != null && this.r.length > 0) {
                blh.r = (int[]) this.r.clone();
            }
            if (this.s != null) {
                blh.s = (defpackage.blj) this.s.clone();
            }
            return blh;
        } catch (java.lang.CloneNotSupportedException e2) {
            throw new java.lang.AssertionError(e2);
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.blh)) {
            return false;
        }
        defpackage.blh blh = (defpackage.blh) obj;
        if (this.c != blh.c) {
            return false;
        }
        if (this.d != blh.d) {
            return false;
        }
        if (0 != 0) {
            return false;
        }
        if (this.h == null) {
            if (blh.h != null) {
                return false;
            }
        } else if (!this.h.equals(blh.h)) {
            return false;
        }
        if (!defpackage.bla.a((java.lang.Object[]) this.i, (java.lang.Object[]) blh.i)) {
            return false;
        }
        if (!java.util.Arrays.equals(this.j, blh.j)) {
            return false;
        }
        if (this.k == null) {
            if (blh.k != null) {
                return false;
            }
        } else if (!this.k.equals(blh.k)) {
            return false;
        }
        if (!java.util.Arrays.equals(this.e, blh.e)) {
            return false;
        }
        if (this.l == null) {
            if (blh.l != null) {
                return false;
            }
        } else if (!this.l.equals(blh.l)) {
            return false;
        }
        if (this.m == null) {
            if (blh.m != null) {
                return false;
            }
        } else if (!this.m.equals(blh.m)) {
            return false;
        }
        if (this.n == null) {
            if (blh.n != null) {
                return false;
            }
        } else if (!this.n.equals(blh.n)) {
            return false;
        }
        if (this.o == null) {
            if (blh.o != null) {
                return false;
            }
        } else if (!this.o.equals(blh.o)) {
            return false;
        }
        if (this.f != blh.f) {
            return false;
        }
        if (this.p == null) {
            if (blh.p != null) {
                return false;
            }
        } else if (!this.p.equals(blh.p)) {
            return false;
        }
        if (!java.util.Arrays.equals(this.g, blh.g)) {
            return false;
        }
        if (this.q == null) {
            if (blh.q != null) {
                return false;
            }
        } else if (!this.q.equals(blh.q)) {
            return false;
        }
        if (!defpackage.bla.a(this.r, blh.r)) {
            return false;
        }
        if (0 != 0) {
            return false;
        }
        if (this.s == null) {
            if (blh.s != null) {
                return false;
            }
        } else if (!this.s.equals(blh.s)) {
            return false;
        }
        if (this.a != null && !this.a.a()) {
            return this.a.equals(blh.a);
        }
        if (blh.a == null || blh.a.a()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i2 = 0;
        int hashCode = (((((((this.h == null ? 0 : this.h.hashCode()) + ((((((getClass().getName().hashCode() + 527) * 31) + ((int) (this.c ^ (this.c >>> 32)))) * 31) + ((int) (this.d ^ (this.d >>> 32)))) * 31 * 31)) * 31 * 31 * 31) + 1237) * 31) + defpackage.bla.a((java.lang.Object[]) this.i)) * 31) + java.util.Arrays.hashCode(this.j);
        defpackage.blf blf = this.k;
        int hashCode2 = (this.m == null ? 0 : this.m.hashCode()) + (((this.l == null ? 0 : this.l.hashCode()) + (((((blf == null ? 0 : blf.hashCode()) + (hashCode * 31)) * 31) + java.util.Arrays.hashCode(this.e)) * 31)) * 31);
        defpackage.ble ble = this.n;
        int hashCode3 = (((this.o == null ? 0 : this.o.hashCode()) + (((ble == null ? 0 : ble.hashCode()) + (hashCode2 * 31)) * 31)) * 31) + ((int) (this.f ^ (this.f >>> 32)));
        defpackage.blg blg = this.p;
        int hashCode4 = ((((this.q == null ? 0 : this.q.hashCode()) + (((((blg == null ? 0 : blg.hashCode()) + (hashCode3 * 31)) * 31) + java.util.Arrays.hashCode(this.g)) * 31)) * 31 * 31) + defpackage.bla.a(this.r)) * 31;
        defpackage.blj blj = this.s;
        int hashCode5 = ((blj == null ? 0 : blj.hashCode()) + (hashCode4 * 31)) * 31;
        if (this.a != null && !this.a.a()) {
            i2 = this.a.hashCode();
        }
        return hashCode5 + i2;
    }

    public final void a(defpackage.bku bku) {
        if (this.c != 0) {
            bku.a(1, this.c);
        }
        if (this.h != null && !this.h.equals("")) {
            bku.a(2, this.h);
        }
        if (this.i != null && this.i.length > 0) {
            for (defpackage.bli bli : this.i) {
                if (bli != null) {
                    bku.a(3, (defpackage.blb) bli);
                }
            }
        }
        if (!java.util.Arrays.equals(this.j, defpackage.bld.e)) {
            bku.a(4, this.j);
        }
        if (!java.util.Arrays.equals(this.e, defpackage.bld.e)) {
            bku.a(6, this.e);
        }
        if (this.n != null) {
            bku.a(7, (defpackage.blb) this.n);
        }
        if (this.l != null && !this.l.equals("")) {
            bku.a(8, this.l);
        }
        if (this.k != null) {
            bku.a(9, (defpackage.blb) this.k);
        }
        if (this.m != null && !this.m.equals("")) {
            bku.a(13, this.m);
        }
        if (this.o != null && !this.o.equals("")) {
            bku.a(14, this.o);
        }
        if (this.f != 180000) {
            long j2 = this.f;
            bku.b(15, 0);
            bku.a(defpackage.bku.c(j2));
        }
        if (this.p != null) {
            bku.a(16, (defpackage.blb) this.p);
        }
        if (this.d != 0) {
            bku.a(17, this.d);
        }
        if (!java.util.Arrays.equals(this.g, defpackage.bld.e)) {
            bku.a(18, this.g);
        }
        if (this.r != null && this.r.length > 0) {
            for (int a : this.r) {
                bku.a(20, a);
            }
        }
        if (0 != 0) {
            bku.a(21, 0);
        }
        if (0 != 0) {
            bku.a(22, 0);
        }
        if (this.s != null) {
            bku.a(23, (defpackage.blb) this.s);
        }
        if (this.q != null && !this.q.equals("")) {
            bku.a(24, this.q);
        }
        super.a(bku);
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a = super.a();
        if (this.c != 0) {
            a += defpackage.bku.b(1, this.c);
        }
        if (this.h != null && !this.h.equals("")) {
            a += defpackage.bku.b(2, this.h);
        }
        if (this.i != null && this.i.length > 0) {
            int i2 = a;
            for (defpackage.bli bli : this.i) {
                if (bli != null) {
                    i2 += defpackage.bku.b(3, (defpackage.blb) bli);
                }
            }
            a = i2;
        }
        if (!java.util.Arrays.equals(this.j, defpackage.bld.e)) {
            a += defpackage.bku.b(4, this.j);
        }
        if (!java.util.Arrays.equals(this.e, defpackage.bld.e)) {
            a += defpackage.bku.b(6, this.e);
        }
        if (this.n != null) {
            a += defpackage.bku.b(7, (defpackage.blb) this.n);
        }
        if (this.l != null && !this.l.equals("")) {
            a += defpackage.bku.b(8, this.l);
        }
        if (this.k != null) {
            a += defpackage.bku.b(9, (defpackage.blb) this.k);
        }
        if (this.m != null && !this.m.equals("")) {
            a += defpackage.bku.b(13, this.m);
        }
        if (this.o != null && !this.o.equals("")) {
            a += defpackage.bku.b(14, this.o);
        }
        if (this.f != 180000) {
            a += defpackage.bku.b(defpackage.bku.c(this.f)) + defpackage.bku.c(120);
        }
        if (this.p != null) {
            a += defpackage.bku.b(16, (defpackage.blb) this.p);
        }
        if (this.d != 0) {
            a += defpackage.bku.b(17, this.d);
        }
        if (!java.util.Arrays.equals(this.g, defpackage.bld.e)) {
            a += defpackage.bku.b(18, this.g);
        }
        if (this.r != null && this.r.length > 0) {
            int i3 = 0;
            for (int a2 : this.r) {
                i3 += defpackage.bku.a(a2);
            }
            a = a + i3 + (this.r.length * 2);
        }
        if (0 != 0) {
            a += defpackage.bku.b(21, 0);
        }
        if (0 != 0) {
            a += defpackage.bku.b(22, 0);
        }
        if (this.s != null) {
            a += defpackage.bku.b(23, (defpackage.blb) this.s);
        }
        if (this.q == null || this.q.equals("")) {
            return a;
        }
        return a + defpackage.bku.b(24, this.q);
    }

    public final /* synthetic */ defpackage.bkw b() {
        return (defpackage.blh) clone();
    }

    public final /* synthetic */ defpackage.blb c() {
        return (defpackage.blh) clone();
    }
}
