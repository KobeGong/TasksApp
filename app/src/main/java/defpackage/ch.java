package defpackage;

import java.util.ArrayList;

/* renamed from: ch  reason: default package */
/* compiled from: PG */
public class ch {
    private static float ah = 0.5f;
    public int A;
    public int B;
    public int C;
    public int D;
    public float E = ah;
    public float F = ah;
    public int G = bg.w;
    public int H = bg.w;
    public Object I;
    public int J = 0;
    public int K;
    public int L;
    public int M;
    public int N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public int U = 0;
    public int V = 0;
    public boolean W;
    public boolean X;
    public float Y = 0.0f;
    public float Z = 0.0f;
    public int a = -1;
    public ch aa = null;
    public ch ab = null;
    private cg ac = new cg(this, bg.t);
    private cg ad = new cg(this, bg.u);
    private cg ae = new cg(this, bg.s);
    private int af = 0;
    private int ag = 0;
    public int b = -1;
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public int f = 0;
    public int g = 0;
    public int h = 0;
    public cg i = new cg(this, bg.n);
    public cg j = new cg(this, bg.o);
    public cg k = new cg(this, bg.p);
    public cg l = new cg(this, bg.q);
    public cg m = new cg(this, bg.r);
    public ArrayList n = new ArrayList();
    public ch o = null;
    public int p = 0;
    public int q = 0;
    public float r = 0.0f;
    public int s = -1;
    public int t = 0;
    public int u = 0;
    public int v = 0;
    public int w = 0;
    public int x = 0;
    public int y = 0;
    public int z = 0;

    public void a() {
        this.i.c();
        this.j.c();
        this.k.c();
        this.l.c();
        this.m.c();
        this.ac.c();
        this.ad.c();
        this.ae.c();
        this.o = null;
        this.p = 0;
        this.q = 0;
        this.r = 0.0f;
        this.s = -1;
        this.t = 0;
        this.u = 0;
        this.af = 0;
        this.ag = 0;
        this.v = 0;
        this.w = 0;
        this.x = 0;
        this.y = 0;
        this.z = 0;
        this.A = 0;
        this.B = 0;
        this.C = 0;
        this.D = 0;
        this.E = ah;
        this.F = ah;
        this.G = bg.w;
        this.H = bg.w;
        this.I = null;
        this.J = 0;
        this.S = false;
        this.T = false;
        this.U = 0;
        this.V = 0;
        this.W = false;
        this.X = false;
        this.Y = 0.0f;
        this.Z = 0.0f;
        this.a = -1;
        this.b = -1;
    }

    public ch() {
        this.n.add(this.i);
        this.n.add(this.j);
        this.n.add(this.k);
        this.n.add(this.l);
        this.n.add(this.ac);
        this.n.add(this.ad);
        this.n.add(this.m);
    }

    public void a(cb cbVar) {
        this.i.a();
        this.j.a();
        this.k.a();
        this.l.a();
        this.m.a();
        this.ae.a();
        this.ac.a();
        this.ad.a();
    }

    public final boolean b() {
        return this.o == null;
    }

    public String toString() {
        return "(" + this.t + ", " + this.u + ") - (" + this.p + " x " + this.q + ") wrap: (" + this.C + " x " + this.D + ")";
    }

    public final int c() {
        if (this.J == 8) {
            return 0;
        }
        return this.p;
    }

    public final int d() {
        int i2;
        int i3 = this.p;
        if (this.G != bg.y) {
            return i3;
        }
        if (this.c == 1) {
            i2 = Math.max(this.e, i3);
        } else if (this.e > 0) {
            i2 = this.e;
            this.p = i2;
        } else {
            i2 = 0;
        }
        if (this.f <= 0 || this.f >= i2) {
            return i2;
        }
        return this.f;
    }

    public final int e() {
        int i2;
        int i3 = this.q;
        if (this.H != bg.y) {
            return i3;
        }
        if (this.d == 1) {
            i2 = Math.max(this.g, i3);
        } else if (this.g > 0) {
            i2 = this.g;
            this.q = i2;
        } else {
            i2 = 0;
        }
        if (this.h <= 0 || this.h >= i2) {
            return i2;
        }
        return this.h;
    }

    public final int f() {
        if (this.J == 8) {
            return 0;
        }
        return this.q;
    }

    public final int g() {
        return this.af + this.x;
    }

    public final int h() {
        return this.ag + this.y;
    }

    public final int i() {
        return this.t + this.p;
    }

    public final int j() {
        return this.u + this.q;
    }

    public final boolean k() {
        return this.z > 0;
    }

    public ArrayList l() {
        return this.n;
    }

    public void a(int i2, int i3) {
        this.x = i2;
        this.y = i3;
    }

    public void m() {
        int i2 = this.t;
        int i3 = this.u;
        int i4 = this.t + this.p;
        this.af = i2;
        this.ag = i3;
        this.v = i4 - i2;
        this.w = (this.u + this.q) - i3;
    }

    public final void a(int i2) {
        this.p = i2;
        if (this.p < this.A) {
            this.p = this.A;
        }
    }

    public final void b(int i2) {
        this.q = i2;
        if (this.q < this.B) {
            this.q = this.B;
        }
    }

    public final void c(int i2) {
        if (i2 < 0) {
            this.A = 0;
        } else {
            this.A = i2;
        }
    }

    public final void d(int i2) {
        if (i2 < 0) {
            this.B = 0;
        } else {
            this.B = i2;
        }
    }

    public final void b(int i2, int i3) {
        this.t = i2;
        this.p = i3 - i2;
        if (this.p < this.A) {
            this.p = this.A;
        }
    }

    public final void c(int i2, int i3) {
        this.u = i2;
        this.q = i3 - i2;
        if (this.q < this.B) {
            this.q = this.B;
        }
    }

    public final void a(int i2, ch chVar, int i3, int i4, int i5) {
        e(i2).a(chVar.e(i3), i4, i5, bg.m, 0, true);
    }

    public cg e(int i2) {
        switch (i2 - 1) {
            case 1:
                return this.i;
            case 2:
                return this.j;
            case 3:
                return this.k;
            case 4:
                return this.l;
            case 5:
                return this.m;
            case 6:
                return this.ae;
            case 7:
                return this.ac;
            case 8:
                return this.ad;
            default:
                return null;
        }
    }

    public final void f(int i2) {
        this.G = i2;
        if (this.G == bg.x) {
            a(this.C);
        }
    }

    public final void g(int i2) {
        this.H = i2;
        if (this.H == bg.x) {
            b(this.D);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x0274  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0282  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x042b  */
    /* JADX WARNING: Removed duplicated region for block: B:218:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0264 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(defpackage.cd r32) {
        /*
        // Method dump skipped, instructions count: 1675
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ch.a(cd):void");
    }

    private final void a(cd cdVar, boolean z2, boolean z3, cg cgVar, cg cgVar2, int i2, int i3, int i4, int i5, float f2, boolean z4, boolean z5, int i6, int i7, int i8) {
        int i9;
        cf a2 = cdVar.a(cgVar);
        cf a3 = cdVar.a(cgVar2);
        cf a4 = cdVar.a(cgVar.c);
        cf a5 = cdVar.a(cgVar2.c);
        int b2 = cgVar.b();
        int b3 = cgVar2.b();
        if (this.J == 8) {
            i9 = 0;
            z3 = true;
        } else {
            i9 = i4;
        }
        if (a4 == null && a5 == null) {
            cdVar.a(cdVar.b().a(a2, i2));
            if (z4) {
                return;
            }
            if (z2) {
                cdVar.a(cd.a(cdVar, a3, a2, i5, true));
            } else if (z3) {
                cdVar.a(cd.a(cdVar, a3, a2, i9, false));
            } else {
                cdVar.a(cdVar.b().a(a3, i3));
            }
        } else if (a4 != null && a5 == null) {
            cdVar.a(cdVar.b().a(a2, a4, b2));
            if (z2) {
                cdVar.a(cd.a(cdVar, a3, a2, i5, true));
            } else if (z4) {
            } else {
                if (z3) {
                    cdVar.a(cdVar.b().a(a3, a2, i9));
                } else {
                    cdVar.a(cdVar.b().a(a3, i3));
                }
            }
        } else if (a4 == null && a5 != null) {
            cdVar.a(cdVar.b().a(a3, a5, b3 * -1));
            if (z2) {
                cdVar.a(cd.a(cdVar, a3, a2, i5, true));
            } else if (z4) {
            } else {
                if (z3) {
                    cdVar.a(cdVar.b().a(a3, a2, i9));
                } else {
                    cdVar.a(cdVar.b().a(a2, i2));
                }
            }
        } else if (z3) {
            if (z2) {
                cdVar.a(cd.a(cdVar, a3, a2, i5, true));
            } else {
                cdVar.a(cdVar.b().a(a3, a2, i9));
            }
            if (cgVar.e != cgVar2.e) {
                if (cgVar.e == bg.m) {
                    cdVar.a(cdVar.b().a(a2, a4, b2));
                    cf c2 = cdVar.c();
                    ca b4 = cdVar.b();
                    b4.b(a3, a5, c2, b3 * -1);
                    cdVar.a(b4);
                    return;
                }
                cf c3 = cdVar.c();
                ca b5 = cdVar.b();
                b5.a(a2, a4, c3, b2);
                cdVar.a(b5);
                cdVar.a(cdVar.b().a(a3, a5, b3 * -1));
            } else if (a4 == a5) {
                cdVar.a(cd.a(cdVar, a2, a4, 0, 0.5f, a5, a3, 0, true));
            } else if (!z5) {
                boolean z6 = cgVar.f != bg.k;
                cf c4 = cdVar.c();
                ca b6 = cdVar.b();
                b6.a(a2, a4, c4, b2);
                if (z6) {
                    cdVar.a(b6, (int) (b6.c.b(c4) * -1.0f));
                }
                cdVar.a(b6);
                boolean z7 = cgVar2.f != bg.k;
                cf c5 = cdVar.c();
                ca b7 = cdVar.b();
                b7.b(a3, a5, c5, b3 * -1);
                if (z7) {
                    cdVar.a(b7, (int) (b7.c.b(c5) * -1.0f));
                }
                cdVar.a(b7);
                cdVar.a(cd.a(cdVar, a2, a4, b2, f2, a5, a3, b3, false));
            }
        } else if (z4) {
            cdVar.a(a2, a4, b2, 3);
            cdVar.b(a3, a5, b3 * -1, 3);
            cdVar.a(cd.a(cdVar, a2, a4, b2, f2, a5, a3, b3, true));
        } else if (!z5) {
            if (i6 == 1) {
                if (i7 > i9) {
                    i9 = i7;
                }
                if (i8 > 0) {
                    if (i8 >= i9) {
                        cdVar.b(a3, a2, i8, 3);
                    }
                    cdVar.c(a3, a2, i8, 3);
                }
                i8 = i9;
                cdVar.c(a3, a2, i8, 3);
            } else if (i7 == 0 && i8 == 0) {
                cdVar.a(cdVar.b().a(a2, a4, b2));
                cdVar.a(cdVar.b().a(a3, a5, b3 * -1));
                return;
            } else if (i8 > 0) {
                cdVar.b(a3, a2, i8, 3);
            }
            cdVar.a(a2, a4, b2, 2);
            cdVar.b(a3, a5, -b3, 2);
            cdVar.a(a2, a4, b2, f2, a5, a3, b3);
        }
    }

    public void n() {
        int b2 = cd.b(this.i);
        int b3 = cd.b(this.j);
        int b4 = cd.b(this.k) - b2;
        int b5 = cd.b(this.l) - b3;
        this.t = b2;
        this.u = b3;
        if (this.J == 8) {
            this.p = 0;
            this.q = 0;
            return;
        }
        if (this.G == bg.w && b4 < this.p) {
            b4 = this.p;
        }
        if (this.H == bg.w && b5 < this.q) {
            b5 = this.q;
        }
        this.p = b4;
        this.q = b5;
        if (this.q < this.B) {
            this.q = this.B;
        }
        if (this.p < this.A) {
            this.p = this.A;
        }
    }
}
