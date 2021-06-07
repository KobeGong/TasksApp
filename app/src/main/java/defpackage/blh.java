package defpackage;

import java.util.Arrays;

/* renamed from: blh  reason: default package */
/* compiled from: PG */
public final class blh extends bkw implements Cloneable {
    public long c = 0;
    public long d = 0;
    public byte[] e = bld.e;
    public long f = 180000;
    public byte[] g = bld.e;
    private String h = "";
    private bli[] i = bli.e();
    private byte[] j = bld.e;
    private blf k = null;
    private String l = "";
    private String m = "";
    private ble n = null;
    private String o = "";
    private blg p = null;
    private String q = "";
    private int[] r = bld.a;
    private blj s = null;

    public blh() {
        this.a = null;
        this.b = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final blh clone() {
        try {
            blh blh = (blh) super.clone();
            if (this.i != null && this.i.length > 0) {
                blh.i = new bli[this.i.length];
                for (int i2 = 0; i2 < this.i.length; i2++) {
                    if (this.i[i2] != null) {
                        blh.i[i2] = (bli) this.i[i2].clone();
                    }
                }
            }
            if (this.k != null) {
                blh.k = (blf) this.k.clone();
            }
            if (this.n != null) {
                blh.n = (ble) this.n.clone();
            }
            if (this.p != null) {
                blh.p = (blg) this.p.clone();
            }
            if (this.r != null && this.r.length > 0) {
                blh.r = (int[]) this.r.clone();
            }
            if (this.s != null) {
                blh.s = (blj) this.s.clone();
            }
            return blh;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof blh)) {
            return false;
        }
        blh blh = (blh) obj;
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
        if (!bla.a(this.i, blh.i)) {
            return false;
        }
        if (!Arrays.equals(this.j, blh.j)) {
            return false;
        }
        if (this.k == null) {
            if (blh.k != null) {
                return false;
            }
        } else if (!this.k.equals(blh.k)) {
            return false;
        }
        if (!Arrays.equals(this.e, blh.e)) {
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
        if (!Arrays.equals(this.g, blh.g)) {
            return false;
        }
        if (this.q == null) {
            if (blh.q != null) {
                return false;
            }
        } else if (!this.q.equals(blh.q)) {
            return false;
        }
        if (!bla.a(this.r, blh.r)) {
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
        if (this.a == null || this.a.a()) {
            return blh.a == null || blh.a.a();
        }
        return this.a.equals(blh.a);
    }

    public final int hashCode() {
        int i2 = 0;
        int hashCode = (((((((this.h == null ? 0 : this.h.hashCode()) + ((((((getClass().getName().hashCode() + 527) * 31) + ((int) (this.c ^ (this.c >>> 32)))) * 31) + ((int) (this.d ^ (this.d >>> 32)))) * 31 * 31)) * 31 * 31 * 31) + 1237) * 31) + bla.a(this.i)) * 31) + Arrays.hashCode(this.j);
        blf blf = this.k;
        int hashCode2 = (this.m == null ? 0 : this.m.hashCode()) + (((this.l == null ? 0 : this.l.hashCode()) + (((((blf == null ? 0 : blf.hashCode()) + (hashCode * 31)) * 31) + Arrays.hashCode(this.e)) * 31)) * 31);
        ble ble = this.n;
        int hashCode3 = (((this.o == null ? 0 : this.o.hashCode()) + (((ble == null ? 0 : ble.hashCode()) + (hashCode2 * 31)) * 31)) * 31) + ((int) (this.f ^ (this.f >>> 32)));
        blg blg = this.p;
        int hashCode4 = ((((blg == null ? 0 : blg.hashCode()) + (hashCode3 * 31)) * 31) + Arrays.hashCode(this.g)) * 31;
        int hashCode5 = this.q == null ? 0 : this.q.hashCode();
        blj blj = this.s;
        int hashCode6 = ((blj == null ? 0 : blj.hashCode()) + ((((hashCode5 + hashCode4) * 31 * 31) + bla.a(this.r)) * 31 * 31)) * 31;
        if (this.a != null && !this.a.a()) {
            i2 = this.a.hashCode();
        }
        return hashCode6 + i2;
    }

    @Override // defpackage.blb, defpackage.bkw
    public final void a(bku bku) {
        if (this.c != 0) {
            bku.a(1, this.c);
        }
        if (this.h != null && !this.h.equals("")) {
            bku.a(2, this.h);
        }
        if (this.i != null && this.i.length > 0) {
            for (int i2 = 0; i2 < this.i.length; i2++) {
                bli bli = this.i[i2];
                if (bli != null) {
                    bku.a(3, bli);
                }
            }
        }
        if (!Arrays.equals(this.j, bld.e)) {
            bku.a(4, this.j);
        }
        if (!Arrays.equals(this.e, bld.e)) {
            bku.a(6, this.e);
        }
        if (this.n != null) {
            bku.a(7, this.n);
        }
        if (this.l != null && !this.l.equals("")) {
            bku.a(8, this.l);
        }
        if (this.k != null) {
            bku.a(9, this.k);
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
            bku.a(bku.c(j2));
        }
        if (this.p != null) {
            bku.a(16, this.p);
        }
        if (this.d != 0) {
            bku.a(17, this.d);
        }
        if (!Arrays.equals(this.g, bld.e)) {
            bku.a(18, this.g);
        }
        if (this.r != null && this.r.length > 0) {
            for (int i3 = 0; i3 < this.r.length; i3++) {
                bku.a(20, this.r[i3]);
            }
        }
        if (0 != 0) {
            bku.a(21, 0L);
        }
        if (0 != 0) {
            bku.a(22, 0L);
        }
        if (this.s != null) {
            bku.a(23, this.s);
        }
        if (this.q != null && !this.q.equals("")) {
            bku.a(24, this.q);
        }
        super.a(bku);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.blb, defpackage.bkw
    public final int a() {
        int a = super.a();
        if (this.c != 0) {
            a += bku.b(1, this.c);
        }
        if (this.h != null && !this.h.equals("")) {
            a += bku.b(2, this.h);
        }
        if (this.i != null && this.i.length > 0) {
            int i2 = a;
            for (int i3 = 0; i3 < this.i.length; i3++) {
                bli bli = this.i[i3];
                if (bli != null) {
                    i2 += bku.b(3, bli);
                }
            }
            a = i2;
        }
        if (!Arrays.equals(this.j, bld.e)) {
            a += bku.b(4, this.j);
        }
        if (!Arrays.equals(this.e, bld.e)) {
            a += bku.b(6, this.e);
        }
        if (this.n != null) {
            a += bku.b(7, this.n);
        }
        if (this.l != null && !this.l.equals("")) {
            a += bku.b(8, this.l);
        }
        if (this.k != null) {
            a += bku.b(9, this.k);
        }
        if (this.m != null && !this.m.equals("")) {
            a += bku.b(13, this.m);
        }
        if (this.o != null && !this.o.equals("")) {
            a += bku.b(14, this.o);
        }
        if (this.f != 180000) {
            a += bku.b(bku.c(this.f)) + bku.c((int) xu.an);
        }
        if (this.p != null) {
            a += bku.b(16, this.p);
        }
        if (this.d != 0) {
            a += bku.b(17, this.d);
        }
        if (!Arrays.equals(this.g, bld.e)) {
            a += bku.b(18, this.g);
        }
        if (this.r != null && this.r.length > 0) {
            int i4 = 0;
            for (int i5 = 0; i5 < this.r.length; i5++) {
                i4 += bku.a(this.r[i5]);
            }
            a = a + i4 + (this.r.length * 2);
        }
        if (0 != 0) {
            a += bku.b(21, 0L);
        }
        if (0 != 0) {
            a += bku.b(22, 0L);
        }
        if (this.s != null) {
            a += bku.b(23, this.s);
        }
        if (this.q == null || this.q.equals("")) {
            return a;
        }
        return a + bku.b(24, this.q);
    }

    @Override // defpackage.bkw
    public final /* synthetic */ bkw b() {
        return (blh) clone();
    }

    @Override // defpackage.blb, defpackage.bkw
    public final /* synthetic */ blb c() {
        return (blh) clone();
    }
}
