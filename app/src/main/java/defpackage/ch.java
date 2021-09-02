package defpackage;

/* renamed from: ch reason: default package */
/* compiled from: PG */
public class ch {
    private static float ah = 0.5f;
    public int A;
    public int B;
    public int C;
    public int D;
    public float E = ah;
    public float F = ah;
    public int G = defpackage.bg.w;
    public int H = defpackage.bg.w;
    public java.lang.Object I;
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
    public defpackage.ch aa = null;
    public defpackage.ch ab = null;
    private defpackage.cg ac = new defpackage.cg(this, defpackage.bg.t);
    private defpackage.cg ad = new defpackage.cg(this, defpackage.bg.u);
    private defpackage.cg ae = new defpackage.cg(this, defpackage.bg.s);
    private int af = 0;
    private int ag = 0;
    public int b = -1;
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public int f = 0;
    public int g = 0;
    public int h = 0;
    public defpackage.cg i = new defpackage.cg(this, defpackage.bg.n);
    public defpackage.cg j = new defpackage.cg(this, defpackage.bg.o);
    public defpackage.cg k = new defpackage.cg(this, defpackage.bg.p);
    public defpackage.cg l = new defpackage.cg(this, defpackage.bg.q);
    public defpackage.cg m = new defpackage.cg(this, defpackage.bg.r);
    public java.util.ArrayList n = new java.util.ArrayList();
    public defpackage.ch o = null;
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
        this.G = defpackage.bg.w;
        this.H = defpackage.bg.w;
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

    public void a(defpackage.cb cbVar) {
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

    public java.lang.String toString() {
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
        if (this.G != defpackage.bg.y) {
            return i3;
        }
        if (this.c == 1) {
            i2 = java.lang.Math.max(this.e, i3);
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
        if (this.H != defpackage.bg.y) {
            return i3;
        }
        if (this.d == 1) {
            i2 = java.lang.Math.max(this.g, i3);
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

    public java.util.ArrayList l() {
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
        int i5 = this.u + this.q;
        this.af = i2;
        this.ag = i3;
        this.v = i4 - i2;
        this.w = i5 - i3;
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

    public final void a(int i2, defpackage.ch chVar, int i3, int i4, int i5) {
        e(i2).a(chVar.e(i3), i4, i5, defpackage.bg.m, 0, true);
    }

    public defpackage.cg e(int i2) {
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
        if (this.G == defpackage.bg.x) {
            a(this.C);
        }
    }

    public final void g(int i2) {
        this.H = i2;
        if (this.H == defpackage.bg.x) {
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
            r31 = this;
            r0 = r31
            cg r4 = r0.i
            r0 = r32
            cf r26 = r0.a(r4)
            r0 = r31
            cg r4 = r0.k
            r0 = r32
            cf r27 = r0.a(r4)
            r0 = r31
            cg r4 = r0.j
            r0 = r32
            cf r28 = r0.a(r4)
            r0 = r31
            cg r4 = r0.l
            r0 = r32
            cf r29 = r0.a(r4)
            r0 = r31
            cg r4 = r0.m
            r0 = r32
            cf r30 = r0.a(r4)
            r4 = 0
            r6 = 0
            r0 = r31
            ch r5 = r0.o
            if (r5 == 0) goto L_0x0685
            r0 = r31
            cg r5 = r0.i
            cg r5 = r5.c
            if (r5 == 0) goto L_0x0050
            r0 = r31
            cg r5 = r0.i
            cg r5 = r5.c
            cg r5 = r5.c
            r0 = r31
            cg r7 = r0.i
            if (r5 == r7) goto L_0x0066
        L_0x0050:
            r0 = r31
            cg r5 = r0.k
            cg r5 = r5.c
            if (r5 == 0) goto L_0x0682
            r0 = r31
            cg r5 = r0.k
            cg r5 = r5.c
            cg r5 = r5.c
            r0 = r31
            cg r7 = r0.k
            if (r5 != r7) goto L_0x0682
        L_0x0066:
            r0 = r31
            ch r4 = r0.o
            ci r4 = (defpackage.ci) r4
            r5 = 0
            r0 = r31
            r4.a(r0, r5)
            r4 = 1
            r5 = r4
        L_0x0074:
            r0 = r31
            cg r4 = r0.j
            cg r4 = r4.c
            if (r4 == 0) goto L_0x008a
            r0 = r31
            cg r4 = r0.j
            cg r4 = r4.c
            cg r4 = r4.c
            r0 = r31
            cg r7 = r0.j
            if (r4 == r7) goto L_0x00a0
        L_0x008a:
            r0 = r31
            cg r4 = r0.l
            cg r4 = r4.c
            if (r4 == 0) goto L_0x067f
            r0 = r31
            cg r4 = r0.l
            cg r4 = r4.c
            cg r4 = r4.c
            r0 = r31
            cg r7 = r0.l
            if (r4 != r7) goto L_0x067f
        L_0x00a0:
            r0 = r31
            ch r4 = r0.o
            ci r4 = (defpackage.ci) r4
            r6 = 1
            r0 = r31
            r4.a(r0, r6)
            r4 = 1
        L_0x00ad:
            r0 = r31
            ch r6 = r0.o
            int r6 = r6.G
            int r7 = defpackage.bg.x
            if (r6 != r7) goto L_0x0123
            if (r5 != 0) goto L_0x0123
            r0 = r31
            cg r6 = r0.i
            cg r6 = r6.c
            if (r6 == 0) goto L_0x00cf
            r0 = r31
            cg r6 = r0.i
            cg r6 = r6.c
            ch r6 = r6.a
            r0 = r31
            ch r7 = r0.o
            if (r6 == r7) goto L_0x0301
        L_0x00cf:
            r0 = r31
            ch r6 = r0.o
            cg r6 = r6.i
            r0 = r32
            cf r6 = r0.a(r6)
            ca r7 = r32.b()
            cf r8 = r32.c()
            r9 = 0
            r0 = r26
            r7.a(r0, r6, r8, r9)
            r0 = r32
            r0.a(r7)
        L_0x00ee:
            r0 = r31
            cg r6 = r0.k
            cg r6 = r6.c
            if (r6 == 0) goto L_0x0104
            r0 = r31
            cg r6 = r0.k
            cg r6 = r6.c
            ch r6 = r6.a
            r0 = r31
            ch r7 = r0.o
            if (r6 == r7) goto L_0x0321
        L_0x0104:
            r0 = r31
            ch r6 = r0.o
            cg r6 = r6.k
            r0 = r32
            cf r6 = r0.a(r6)
            ca r7 = r32.b()
            cf r8 = r32.c()
            r9 = 0
            r0 = r27
            r7.a(r6, r0, r8, r9)
            r0 = r32
            r0.a(r7)
        L_0x0123:
            r0 = r31
            ch r6 = r0.o
            int r6 = r6.H
            int r7 = defpackage.bg.x
            if (r6 != r7) goto L_0x037f
            if (r4 != 0) goto L_0x037f
            r0 = r31
            cg r6 = r0.j
            cg r6 = r6.c
            if (r6 == 0) goto L_0x0145
            r0 = r31
            cg r6 = r0.j
            cg r6 = r6.c
            ch r6 = r6.a
            r0 = r31
            ch r7 = r0.o
            if (r6 == r7) goto L_0x0341
        L_0x0145:
            r0 = r31
            ch r6 = r0.o
            cg r6 = r6.j
            r0 = r32
            cf r6 = r0.a(r6)
            ca r7 = r32.b()
            cf r8 = r32.c()
            r9 = 0
            r0 = r28
            r7.a(r0, r6, r8, r9)
            r0 = r32
            r0.a(r7)
        L_0x0164:
            r0 = r31
            cg r6 = r0.l
            cg r6 = r6.c
            if (r6 == 0) goto L_0x017a
            r0 = r31
            cg r6 = r0.l
            cg r6 = r6.c
            ch r6 = r6.a
            r0 = r31
            ch r7 = r0.o
            if (r6 == r7) goto L_0x0361
        L_0x017a:
            r0 = r31
            ch r6 = r0.o
            cg r6 = r6.l
            r0 = r32
            cf r6 = r0.a(r6)
            ca r7 = r32.b()
            cf r8 = r32.c()
            r9 = 0
            r0 = r29
            r7.a(r6, r0, r8, r9)
            r0 = r32
            r0.a(r7)
            r20 = r4
            r16 = r5
        L_0x019d:
            r0 = r31
            int r4 = r0.p
            r0 = r31
            int r5 = r0.A
            if (r4 >= r5) goto L_0x01ab
            r0 = r31
            int r4 = r0.A
        L_0x01ab:
            r0 = r31
            int r5 = r0.q
            r0 = r31
            int r6 = r0.B
            if (r5 >= r6) goto L_0x01b9
            r0 = r31
            int r5 = r0.B
        L_0x01b9:
            r0 = r31
            int r6 = r0.G
            int r7 = defpackage.bg.y
            if (r6 == r7) goto L_0x0385
            r6 = 1
        L_0x01c2:
            r0 = r31
            int r7 = r0.H
            int r8 = defpackage.bg.y
            if (r7 == r8) goto L_0x0388
            r7 = 1
        L_0x01cb:
            if (r6 != 0) goto L_0x067c
            r0 = r31
            cg r8 = r0.i
            if (r8 == 0) goto L_0x067c
            r0 = r31
            cg r8 = r0.k
            if (r8 == 0) goto L_0x067c
            r0 = r31
            cg r8 = r0.i
            cg r8 = r8.c
            if (r8 == 0) goto L_0x01e9
            r0 = r31
            cg r8 = r0.k
            cg r8 = r8.c
            if (r8 != 0) goto L_0x067c
        L_0x01e9:
            r6 = 1
            r10 = r6
        L_0x01eb:
            if (r7 != 0) goto L_0x0679
            r0 = r31
            cg r6 = r0.j
            if (r6 == 0) goto L_0x0679
            r0 = r31
            cg r6 = r0.l
            if (r6 == 0) goto L_0x0679
            r0 = r31
            cg r6 = r0.j
            cg r6 = r6.c
            if (r6 == 0) goto L_0x0209
            r0 = r31
            cg r6 = r0.l
            cg r6 = r6.c
            if (r6 != 0) goto L_0x0679
        L_0x0209:
            r0 = r31
            int r6 = r0.z
            if (r6 == 0) goto L_0x0225
            r0 = r31
            cg r6 = r0.m
            if (r6 == 0) goto L_0x0679
            r0 = r31
            cg r6 = r0.j
            cg r6 = r6.c
            if (r6 == 0) goto L_0x0225
            r0 = r31
            cg r6 = r0.m
            cg r6 = r6.c
            if (r6 != 0) goto L_0x0679
        L_0x0225:
            r6 = 1
        L_0x0226:
            r9 = 0
            r0 = r31
            int r8 = r0.s
            r0 = r31
            float r7 = r0.r
            r0 = r31
            float r11 = r0.r
            r12 = 0
            int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r11 <= 0) goto L_0x066b
            r0 = r31
            int r11 = r0.J
            r12 = 8
            if (r11 == r12) goto L_0x066b
            r0 = r31
            int r11 = r0.G
            int r12 = defpackage.bg.y
            if (r11 != r12) goto L_0x03a9
            r0 = r31
            int r11 = r0.H
            int r12 = defpackage.bg.y
            if (r11 != r12) goto L_0x03a9
            r9 = 1
            if (r10 == 0) goto L_0x038b
            if (r6 != 0) goto L_0x038b
            r8 = 0
            r22 = r7
            r23 = r8
            r24 = r9
            r25 = r6
            r21 = r5
            r12 = r4
            r7 = r10
        L_0x0262:
            if (r24 == 0) goto L_0x03f0
            if (r23 == 0) goto L_0x026b
            r4 = -1
            r0 = r23
            if (r0 != r4) goto L_0x03f0
        L_0x026b:
            r15 = 1
        L_0x026c:
            r0 = r31
            int r4 = r0.G
            int r5 = defpackage.bg.x
            if (r4 != r5) goto L_0x03f3
            r0 = r31
            boolean r4 = r0 instanceof defpackage.ci
            if (r4 == 0) goto L_0x03f3
            r6 = 1
        L_0x027b:
            r0 = r31
            int r4 = r0.a
            r5 = 2
            if (r4 == r5) goto L_0x02f9
            if (r15 == 0) goto L_0x03f6
            r0 = r31
            cg r4 = r0.i
            cg r4 = r4.c
            if (r4 == 0) goto L_0x03f6
            r0 = r31
            cg r4 = r0.k
            cg r4 = r4.c
            if (r4 == 0) goto L_0x03f6
            r0 = r31
            cg r4 = r0.i
            r0 = r32
            cf r5 = r0.a(r4)
            r0 = r31
            cg r4 = r0.k
            r0 = r32
            cf r10 = r0.a(r4)
            r0 = r31
            cg r4 = r0.i
            cg r4 = r4.c
            r0 = r32
            cf r6 = r0.a(r4)
            r0 = r31
            cg r4 = r0.k
            cg r4 = r4.c
            r0 = r32
            cf r9 = r0.a(r4)
            r0 = r31
            cg r4 = r0.i
            int r4 = r4.b()
            r7 = 3
            r0 = r32
            r0.a(r5, r6, r4, r7)
            r0 = r31
            cg r4 = r0.k
            int r4 = r4.b()
            int r4 = r4 * -1
            r7 = 3
            r0 = r32
            r0.b(r10, r9, r4, r7)
            if (r16 != 0) goto L_0x02f9
            r0 = r31
            cg r4 = r0.i
            int r7 = r4.b()
            r0 = r31
            float r8 = r0.E
            r0 = r31
            cg r4 = r0.k
            int r11 = r4.b()
            r4 = r32
            r4.a(r5, r6, r7, r8, r9, r10, r11)
        L_0x02f9:
            r0 = r31
            int r4 = r0.b
            r5 = 2
            if (r4 != r5) goto L_0x042b
        L_0x0300:
            return
        L_0x0301:
            r0 = r31
            cg r6 = r0.i
            cg r6 = r6.c
            if (r6 == 0) goto L_0x00ee
            r0 = r31
            cg r6 = r0.i
            cg r6 = r6.c
            ch r6 = r6.a
            r0 = r31
            ch r7 = r0.o
            if (r6 != r7) goto L_0x00ee
            r0 = r31
            cg r6 = r0.i
            int r7 = defpackage.bg.k
            r6.f = r7
            goto L_0x00ee
        L_0x0321:
            r0 = r31
            cg r6 = r0.k
            cg r6 = r6.c
            if (r6 == 0) goto L_0x0123
            r0 = r31
            cg r6 = r0.k
            cg r6 = r6.c
            ch r6 = r6.a
            r0 = r31
            ch r7 = r0.o
            if (r6 != r7) goto L_0x0123
            r0 = r31
            cg r6 = r0.k
            int r7 = defpackage.bg.k
            r6.f = r7
            goto L_0x0123
        L_0x0341:
            r0 = r31
            cg r6 = r0.j
            cg r6 = r6.c
            if (r6 == 0) goto L_0x0164
            r0 = r31
            cg r6 = r0.j
            cg r6 = r6.c
            ch r6 = r6.a
            r0 = r31
            ch r7 = r0.o
            if (r6 != r7) goto L_0x0164
            r0 = r31
            cg r6 = r0.j
            int r7 = defpackage.bg.k
            r6.f = r7
            goto L_0x0164
        L_0x0361:
            r0 = r31
            cg r6 = r0.l
            cg r6 = r6.c
            if (r6 == 0) goto L_0x037f
            r0 = r31
            cg r6 = r0.l
            cg r6 = r6.c
            ch r6 = r6.a
            r0 = r31
            ch r7 = r0.o
            if (r6 != r7) goto L_0x037f
            r0 = r31
            cg r6 = r0.l
            int r7 = defpackage.bg.k
            r6.f = r7
        L_0x037f:
            r20 = r4
            r16 = r5
            goto L_0x019d
        L_0x0385:
            r6 = 0
            goto L_0x01c2
        L_0x0388:
            r7 = 0
            goto L_0x01cb
        L_0x038b:
            if (r10 != 0) goto L_0x066b
            if (r6 == 0) goto L_0x066b
            r8 = 1
            r0 = r31
            int r11 = r0.s
            r12 = -1
            if (r11 != r12) goto L_0x066b
            r11 = 1065353216(0x3f800000, float:1.0)
            float r7 = r11 / r7
            r22 = r7
            r23 = r8
            r24 = r9
            r25 = r6
            r21 = r5
            r12 = r4
            r7 = r10
            goto L_0x0262
        L_0x03a9:
            r0 = r31
            int r11 = r0.G
            int r12 = defpackage.bg.y
            if (r11 != r12) goto L_0x03c7
            r4 = 0
            r0 = r31
            int r8 = r0.q
            float r8 = (float) r8
            float r8 = r8 * r7
            int r12 = (int) r8
            r8 = 1
            r22 = r7
            r23 = r4
            r24 = r9
            r25 = r6
            r21 = r5
            r7 = r8
            goto L_0x0262
        L_0x03c7:
            r0 = r31
            int r11 = r0.H
            int r12 = defpackage.bg.y
            if (r11 != r12) goto L_0x066b
            r6 = 1
            r0 = r31
            int r5 = r0.s
            r8 = -1
            if (r5 != r8) goto L_0x0668
            r5 = 1065353216(0x3f800000, float:1.0)
            float r5 = r5 / r7
        L_0x03da:
            r0 = r31
            int r7 = r0.p
            float r7 = (float) r7
            float r7 = r7 * r5
            int r0 = (int) r7
            r21 = r0
            r7 = 1
            r22 = r5
            r23 = r6
            r24 = r9
            r25 = r7
            r12 = r4
            r7 = r10
            goto L_0x0262
        L_0x03f0:
            r15 = 0
            goto L_0x026c
        L_0x03f3:
            r6 = 0
            goto L_0x027b
        L_0x03f6:
            r0 = r31
            cg r8 = r0.i
            r0 = r31
            cg r9 = r0.k
            r0 = r31
            int r10 = r0.t
            r0 = r31
            int r4 = r0.t
            int r11 = r4 + r12
            r0 = r31
            int r13 = r0.A
            r0 = r31
            float r14 = r0.E
            r0 = r31
            int r0 = r0.c
            r17 = r0
            r0 = r31
            int r0 = r0.e
            r18 = r0
            r0 = r31
            int r0 = r0.f
            r19 = r0
            r4 = r31
            r5 = r32
            r4.a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            goto L_0x02f9
        L_0x042b:
            r0 = r31
            int r4 = r0.H
            int r5 = defpackage.bg.x
            if (r4 != r5) goto L_0x0503
            r0 = r31
            boolean r4 = r0 instanceof defpackage.ci
            if (r4 == 0) goto L_0x0503
            r6 = 1
        L_0x043a:
            if (r24 == 0) goto L_0x0506
            r4 = 1
            r0 = r23
            if (r0 == r4) goto L_0x0446
            r4 = -1
            r0 = r23
            if (r0 != r4) goto L_0x0506
        L_0x0446:
            r15 = 1
        L_0x0447:
            r0 = r31
            int r4 = r0.z
            if (r4 <= 0) goto L_0x0549
            r0 = r31
            cg r9 = r0.l
            r0 = r31
            int r4 = r0.z
            r5 = 5
            r0 = r32
            r1 = r30
            r2 = r28
            r0.c(r1, r2, r4, r5)
            r0 = r31
            cg r4 = r0.m
            cg r4 = r4.c
            if (r4 == 0) goto L_0x0664
            r0 = r31
            int r12 = r0.z
            r0 = r31
            cg r9 = r0.m
        L_0x046f:
            if (r15 == 0) goto L_0x0509
            r0 = r31
            cg r4 = r0.j
            cg r4 = r4.c
            if (r4 == 0) goto L_0x0509
            r0 = r31
            cg r4 = r0.l
            cg r4 = r4.c
            if (r4 == 0) goto L_0x0509
            r0 = r31
            cg r4 = r0.j
            r0 = r32
            cf r5 = r0.a(r4)
            r0 = r31
            cg r4 = r0.l
            r0 = r32
            cf r10 = r0.a(r4)
            r0 = r31
            cg r4 = r0.j
            cg r4 = r4.c
            r0 = r32
            cf r6 = r0.a(r4)
            r0 = r31
            cg r4 = r0.l
            cg r4 = r4.c
            r0 = r32
            cf r9 = r0.a(r4)
            r0 = r31
            cg r4 = r0.j
            int r4 = r4.b()
            r7 = 3
            r0 = r32
            r0.a(r5, r6, r4, r7)
            r0 = r31
            cg r4 = r0.l
            int r4 = r4.b()
            int r4 = r4 * -1
            r7 = 3
            r0 = r32
            r0.b(r10, r9, r4, r7)
            if (r20 != 0) goto L_0x04e6
            r0 = r31
            cg r4 = r0.j
            int r7 = r4.b()
            r0 = r31
            float r8 = r0.F
            r0 = r31
            cg r4 = r0.l
            int r11 = r4.b()
            r4 = r32
            r4.a(r5, r6, r7, r8, r9, r10, r11)
        L_0x04e6:
            if (r24 == 0) goto L_0x0300
            ca r4 = r32.b()
            if (r23 != 0) goto L_0x05fd
            r5 = r27
            r6 = r26
            r7 = r29
            r8 = r28
            r9 = r22
            ca r4 = r4.a(r5, r6, r7, r8, r9)
            r0 = r32
            r0.a(r4)
            goto L_0x0300
        L_0x0503:
            r6 = 0
            goto L_0x043a
        L_0x0506:
            r15 = 0
            goto L_0x0447
        L_0x0509:
            r0 = r31
            cg r8 = r0.j
            r0 = r31
            int r10 = r0.u
            r0 = r31
            int r4 = r0.u
            int r11 = r4 + r12
            r0 = r31
            int r13 = r0.B
            r0 = r31
            float r14 = r0.F
            r0 = r31
            int r0 = r0.d
            r17 = r0
            r0 = r31
            int r0 = r0.g
            r18 = r0
            r0 = r31
            int r0 = r0.h
            r19 = r0
            r4 = r31
            r5 = r32
            r7 = r25
            r16 = r20
            r4.a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r4 = 5
            r0 = r32
            r1 = r29
            r2 = r28
            r3 = r21
            r0.c(r1, r2, r3, r4)
            goto L_0x04e6
        L_0x0549:
            if (r15 == 0) goto L_0x05c2
            r0 = r31
            cg r4 = r0.j
            cg r4 = r4.c
            if (r4 == 0) goto L_0x05c2
            r0 = r31
            cg r4 = r0.l
            cg r4 = r4.c
            if (r4 == 0) goto L_0x05c2
            r0 = r31
            cg r4 = r0.j
            r0 = r32
            cf r5 = r0.a(r4)
            r0 = r31
            cg r4 = r0.l
            r0 = r32
            cf r10 = r0.a(r4)
            r0 = r31
            cg r4 = r0.j
            cg r4 = r4.c
            r0 = r32
            cf r6 = r0.a(r4)
            r0 = r31
            cg r4 = r0.l
            cg r4 = r4.c
            r0 = r32
            cf r9 = r0.a(r4)
            r0 = r31
            cg r4 = r0.j
            int r4 = r4.b()
            r7 = 3
            r0 = r32
            r0.a(r5, r6, r4, r7)
            r0 = r31
            cg r4 = r0.l
            int r4 = r4.b()
            int r4 = r4 * -1
            r7 = 3
            r0 = r32
            r0.b(r10, r9, r4, r7)
            if (r20 != 0) goto L_0x04e6
            r0 = r31
            cg r4 = r0.j
            int r7 = r4.b()
            r0 = r31
            float r8 = r0.F
            r0 = r31
            cg r4 = r0.l
            int r11 = r4.b()
            r4 = r32
            r4.a(r5, r6, r7, r8, r9, r10, r11)
            goto L_0x04e6
        L_0x05c2:
            r0 = r31
            cg r8 = r0.j
            r0 = r31
            cg r9 = r0.l
            r0 = r31
            int r10 = r0.u
            r0 = r31
            int r4 = r0.u
            int r11 = r4 + r21
            r0 = r31
            int r13 = r0.B
            r0 = r31
            float r14 = r0.F
            r0 = r31
            int r0 = r0.d
            r17 = r0
            r0 = r31
            int r0 = r0.g
            r18 = r0
            r0 = r31
            int r0 = r0.h
            r19 = r0
            r4 = r31
            r5 = r32
            r7 = r25
            r12 = r21
            r16 = r20
            r4.a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            goto L_0x04e6
        L_0x05fd:
            r5 = 1
            r0 = r23
            if (r0 != r5) goto L_0x0617
            r5 = r29
            r6 = r28
            r7 = r27
            r8 = r26
            r9 = r22
            ca r4 = r4.a(r5, r6, r7, r8, r9)
            r0 = r32
            r0.a(r4)
            goto L_0x0300
        L_0x0617:
            r0 = r31
            int r5 = r0.e
            if (r5 <= 0) goto L_0x062b
            r0 = r31
            int r5 = r0.e
            r6 = 3
            r0 = r32
            r1 = r27
            r2 = r26
            r0.a(r1, r2, r5, r6)
        L_0x062b:
            r0 = r31
            int r5 = r0.g
            if (r5 <= 0) goto L_0x063f
            r0 = r31
            int r5 = r0.g
            r6 = 3
            r0 = r32
            r1 = r29
            r2 = r28
            r0.a(r1, r2, r5, r6)
        L_0x063f:
            r5 = r27
            r6 = r26
            r7 = r29
            r8 = r28
            r9 = r22
            r4.a(r5, r6, r7, r8, r9)
            cf r5 = r32.d()
            cf r6 = r32.d()
            r7 = 4
            r5.c = r7
            r7 = 4
            r6.c = r7
            r4.a(r5, r6)
            r0 = r32
            r0.a(r4)
            goto L_0x0300
        L_0x0664:
            r12 = r21
            goto L_0x046f
        L_0x0668:
            r5 = r7
            goto L_0x03da
        L_0x066b:
            r22 = r7
            r23 = r8
            r24 = r9
            r25 = r6
            r21 = r5
            r12 = r4
            r7 = r10
            goto L_0x0262
        L_0x0679:
            r6 = r7
            goto L_0x0226
        L_0x067c:
            r10 = r6
            goto L_0x01eb
        L_0x067f:
            r4 = r6
            goto L_0x00ad
        L_0x0682:
            r5 = r4
            goto L_0x0074
        L_0x0685:
            r20 = r6
            r16 = r4
            goto L_0x019d
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ch.a(cd):void");
    }

    private final void a(defpackage.cd cdVar, boolean z2, boolean z3, defpackage.cg cgVar, defpackage.cg cgVar2, int i2, int i3, int i4, int i5, float f2, boolean z4, boolean z5, int i6, int i7, int i8) {
        int i9;
        defpackage.cf a2 = cdVar.a((java.lang.Object) cgVar);
        defpackage.cf a3 = cdVar.a((java.lang.Object) cgVar2);
        defpackage.cf a4 = cdVar.a((java.lang.Object) cgVar.c);
        defpackage.cf a5 = cdVar.a((java.lang.Object) cgVar2.c);
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
                cdVar.a(defpackage.cd.a(cdVar, a3, a2, i5, true));
            } else if (z3) {
                cdVar.a(defpackage.cd.a(cdVar, a3, a2, i9, false));
            } else {
                cdVar.a(cdVar.b().a(a3, i3));
            }
        } else if (a4 != null && a5 == null) {
            cdVar.a(cdVar.b().a(a2, a4, b2));
            if (z2) {
                cdVar.a(defpackage.cd.a(cdVar, a3, a2, i5, true));
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
                cdVar.a(defpackage.cd.a(cdVar, a3, a2, i5, true));
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
                cdVar.a(defpackage.cd.a(cdVar, a3, a2, i5, true));
            } else {
                cdVar.a(cdVar.b().a(a3, a2, i9));
            }
            if (cgVar.e != cgVar2.e) {
                if (cgVar.e == defpackage.bg.m) {
                    cdVar.a(cdVar.b().a(a2, a4, b2));
                    defpackage.cf c2 = cdVar.c();
                    defpackage.ca b4 = cdVar.b();
                    b4.b(a3, a5, c2, b3 * -1);
                    cdVar.a(b4);
                    return;
                }
                defpackage.cf c3 = cdVar.c();
                defpackage.ca b5 = cdVar.b();
                b5.a(a2, a4, c3, b2);
                cdVar.a(b5);
                cdVar.a(cdVar.b().a(a3, a5, b3 * -1));
            } else if (a4 == a5) {
                cdVar.a(defpackage.cd.a(cdVar, a2, a4, 0, 0.5f, a5, a3, 0, true));
            } else if (!z5) {
                boolean z6 = cgVar.f != defpackage.bg.k;
                defpackage.cf c4 = cdVar.c();
                defpackage.ca b6 = cdVar.b();
                b6.a(a2, a4, c4, b2);
                if (z6) {
                    cdVar.a(b6, (int) (b6.c.b(c4) * -1.0f));
                }
                cdVar.a(b6);
                boolean z7 = cgVar2.f != defpackage.bg.k;
                int i10 = b3 * -1;
                defpackage.cf c5 = cdVar.c();
                defpackage.ca b7 = cdVar.b();
                b7.b(a3, a5, c5, i10);
                if (z7) {
                    cdVar.a(b7, (int) (b7.c.b(c5) * -1.0f));
                }
                cdVar.a(b7);
                cdVar.a(defpackage.cd.a(cdVar, a2, a4, b2, f2, a5, a3, b3, false));
            }
        } else if (z4) {
            cdVar.a(a2, a4, b2, 3);
            cdVar.b(a3, a5, b3 * -1, 3);
            cdVar.a(defpackage.cd.a(cdVar, a2, a4, b2, f2, a5, a3, b3, true));
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
        int b2 = defpackage.cd.b((java.lang.Object) this.i);
        int b3 = defpackage.cd.b((java.lang.Object) this.j);
        int b4 = defpackage.cd.b((java.lang.Object) this.k) - b2;
        int b5 = defpackage.cd.b((java.lang.Object) this.l) - b3;
        this.t = b2;
        this.u = b3;
        if (this.J == 8) {
            this.p = 0;
            this.q = 0;
            return;
        }
        if (this.G == defpackage.bg.w && b4 < this.p) {
            b4 = this.p;
        }
        if (this.H == defpackage.bg.w && b5 < this.q) {
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
