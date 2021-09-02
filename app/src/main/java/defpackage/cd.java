package defpackage;

/* renamed from: cd reason: default package */
/* compiled from: PG */
public final class cd {
    private static int f = 1000;
    public defpackage.cc a;
    public defpackage.ca[] b;
    public int c;
    public int d;
    public final defpackage.cb e;
    private int g;
    private int h;
    private int i;
    private boolean[] j;
    private int k;
    private defpackage.cf[] l;
    private int m;
    private defpackage.ca[] n;

    public cd() {
        this.g = 0;
        this.a = new defpackage.cc();
        this.h = 32;
        this.i = this.h;
        this.b = null;
        this.j = new boolean[this.h];
        this.c = 1;
        this.d = 0;
        this.k = this.h;
        this.l = new defpackage.cf[f];
        this.m = 0;
        this.n = new defpackage.ca[this.h];
        this.b = new defpackage.ca[this.h];
        f();
        this.e = new defpackage.cb();
    }

    private final void e() {
        this.h <<= 1;
        this.b = (defpackage.ca[]) java.util.Arrays.copyOf(this.b, this.h);
        this.e.c = (defpackage.cf[]) java.util.Arrays.copyOf(this.e.c, this.h);
        this.j = new boolean[this.h];
        this.i = this.h;
        this.k = this.h;
        this.a.a.clear();
    }

    private final void f() {
        for (int i2 = 0; i2 < this.b.length; i2++) {
            defpackage.ca caVar = this.b[i2];
            if (caVar != null) {
                this.e.a.a(caVar);
            }
            this.b[i2] = null;
        }
    }

    public final void a() {
        for (defpackage.cf cfVar : this.e.c) {
            if (cfVar != null) {
                cfVar.a();
            }
        }
        defpackage.ce ceVar = this.e.b;
        defpackage.cf[] cfVarArr = this.l;
        int i2 = this.m;
        if (i2 > cfVarArr.length) {
            i2 = cfVarArr.length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            defpackage.cf cfVar2 = cfVarArr[i3];
            if (ceVar.b < ceVar.a.length) {
                ceVar.a[ceVar.b] = cfVar2;
                ceVar.b++;
            }
        }
        this.m = 0;
        java.util.Arrays.fill(this.e.c, null);
        this.g = 0;
        this.a.a.clear();
        this.c = 1;
        f();
        this.d = 0;
    }

    public final defpackage.cf a(java.lang.Object obj) {
        defpackage.cf cfVar = null;
        if (obj != null) {
            if (this.c + 1 >= this.i) {
                e();
            }
            if (obj instanceof defpackage.cg) {
                cfVar = ((defpackage.cg) obj).h;
                if (cfVar == null) {
                    ((defpackage.cg) obj).a();
                    cfVar = ((defpackage.cg) obj).h;
                }
                if (cfVar.a == -1 || cfVar.a > this.g || this.e.c[cfVar.a] == null) {
                    if (cfVar.a != -1) {
                        cfVar.a();
                    }
                    this.g++;
                    this.c++;
                    cfVar.a = this.g;
                    cfVar.f = defpackage.bg.f;
                    this.e.c[this.g] = cfVar;
                }
            }
        }
        return cfVar;
    }

    public final defpackage.ca b() {
        defpackage.ca caVar = (defpackage.ca) this.e.a.a();
        if (caVar == null) {
            return new defpackage.ca(this.e);
        }
        caVar.a = null;
        defpackage.bz bzVar = caVar.c;
        bzVar.f = -1;
        bzVar.g = -1;
        bzVar.h = false;
        bzVar.a = 0;
        caVar.b = 0.0f;
        caVar.d = false;
        return caVar;
    }

    public final defpackage.cf c() {
        if (this.c + 1 >= this.i) {
            e();
        }
        defpackage.cf a2 = a(defpackage.bg.g);
        this.g++;
        this.c++;
        a2.a = this.g;
        this.e.c[this.g] = a2;
        return a2;
    }

    public final void a(defpackage.ca caVar, int i2) {
        caVar.c.a(d(), (float) i2);
    }

    public final defpackage.cf d() {
        if (this.c + 1 >= this.i) {
            e();
        }
        defpackage.cf a2 = a(defpackage.bg.h);
        this.g++;
        this.c++;
        a2.a = this.g;
        this.e.c[this.g] = a2;
        return a2;
    }

    private final defpackage.cf a(int i2) {
        defpackage.cf cfVar;
        defpackage.cf cfVar2 = (defpackage.cf) this.e.b.a();
        if (cfVar2 == null) {
            cfVar = new defpackage.cf(i2);
        } else {
            cfVar2.a();
            cfVar2.f = i2;
            cfVar = cfVar2;
        }
        if (this.m >= f) {
            f <<= 1;
            this.l = (defpackage.cf[]) java.util.Arrays.copyOf(this.l, f);
        }
        defpackage.cf[] cfVarArr = this.l;
        int i3 = this.m;
        this.m = i3 + 1;
        cfVarArr[i3] = cfVar;
        return cfVar;
    }

    public static int b(java.lang.Object obj) {
        defpackage.cf cfVar = ((defpackage.cg) obj).h;
        if (cfVar != null) {
            return (int) (cfVar.d + 0.5f);
        }
        return 0;
    }

    public final void a(defpackage.ca caVar) {
        defpackage.cf cfVar;
        float f2;
        defpackage.cf cfVar2;
        if (caVar != null) {
            if (this.d + 1 >= this.k || this.c + 1 >= this.i) {
                e();
            }
            if (!caVar.d) {
                if (this.d > 0) {
                    defpackage.bz bzVar = caVar.c;
                    defpackage.ca[] caVarArr = this.b;
                    int i2 = bzVar.f;
                    int i3 = 0;
                    while (i2 != -1 && i3 < bzVar.a) {
                        defpackage.cf cfVar3 = bzVar.b.c[bzVar.c[i2]];
                        if (cfVar3.b != -1) {
                            float f3 = bzVar.e[i2];
                            bzVar.a(cfVar3);
                            defpackage.ca caVar2 = caVarArr[cfVar3.b];
                            if (!caVar2.d) {
                                defpackage.bz bzVar2 = caVar2.c;
                                int i4 = bzVar2.f;
                                int i5 = 0;
                                while (i4 != -1 && i5 < bzVar2.a) {
                                    bzVar.b(bzVar.b.c[bzVar2.c[i4]], bzVar2.e[i4] * f3);
                                    i4 = bzVar2.d[i4];
                                    i5++;
                                }
                            }
                            caVar.b += caVar2.b * f3;
                            caVar2.a.a(caVar);
                            i2 = bzVar.f;
                            i3 = 0;
                        } else {
                            i2 = bzVar.d[i2];
                            i3++;
                        }
                    }
                    if (caVar.c.a == 0) {
                        caVar.d = true;
                    }
                }
                if (caVar.b < 0.0f) {
                    caVar.b = -caVar.b;
                    defpackage.bz bzVar3 = caVar.c;
                    int i6 = bzVar3.f;
                    int i7 = 0;
                    while (i6 != -1 && i7 < bzVar3.a) {
                        float[] fArr = bzVar3.e;
                        fArr[i6] = -fArr[i6];
                        i6 = bzVar3.d[i6];
                        i7++;
                    }
                }
                defpackage.bz bzVar4 = caVar.c;
                int i8 = 0;
                int i9 = bzVar4.f;
                defpackage.cf cfVar4 = null;
                defpackage.cf cfVar5 = null;
                while (true) {
                    if (i9 != -1 && i8 < bzVar4.a) {
                        float f4 = bzVar4.e[i9];
                        if (f4 < 0.0f) {
                            if (f4 > -0.001f) {
                                bzVar4.e[i9] = 0.0f;
                                f2 = 0.0f;
                            }
                            f2 = f4;
                        } else {
                            if (f4 < 0.001f) {
                                bzVar4.e[i9] = 0.0f;
                                f2 = 0.0f;
                            }
                            f2 = f4;
                        }
                        if (f2 != 0.0f) {
                            cfVar = bzVar4.b.c[bzVar4.c[i9]];
                            if (cfVar.f == defpackage.bg.f) {
                                if (f2 < 0.0f) {
                                    break;
                                } else if (cfVar4 == null) {
                                    cfVar2 = cfVar5;
                                    i8++;
                                    i9 = bzVar4.d[i9];
                                    cfVar5 = cfVar2;
                                    cfVar4 = cfVar;
                                }
                            } else if (f2 < 0.0f && (cfVar5 == null || cfVar.c < cfVar5.c)) {
                                defpackage.cf cfVar6 = cfVar4;
                                cfVar2 = cfVar;
                                cfVar = cfVar6;
                                i8++;
                                i9 = bzVar4.d[i9];
                                cfVar5 = cfVar2;
                                cfVar4 = cfVar;
                            }
                        }
                        cfVar = cfVar4;
                        cfVar2 = cfVar5;
                        i8++;
                        i9 = bzVar4.d[i9];
                        cfVar5 = cfVar2;
                        cfVar4 = cfVar;
                    } else if (cfVar4 != null) {
                        cfVar = cfVar4;
                    } else {
                        cfVar = cfVar5;
                    }
                }
                if (cfVar != null) {
                    caVar.a(cfVar);
                }
                if (caVar.c.a == 0) {
                    caVar.d = true;
                }
                if (!(caVar.a != null && (caVar.a.f == defpackage.bg.f || caVar.b >= 0.0f))) {
                    return;
                }
            }
            if (this.b[this.d] != null) {
                this.e.a.a(this.b[this.d]);
            }
            if (!caVar.d) {
                caVar.a();
            }
            this.b[this.d] = caVar;
            caVar.a.b = this.d;
            this.d++;
            int i10 = caVar.a.h;
            if (i10 > 0) {
                while (this.n.length < i10) {
                    this.n = new defpackage.ca[(this.n.length << 1)];
                }
                defpackage.ca[] caVarArr2 = this.n;
                for (int i11 = 0; i11 < i10; i11++) {
                    caVarArr2[i11] = caVar.a.g[i11];
                }
                for (int i12 = 0; i12 < i10; i12++) {
                    defpackage.ca caVar3 = caVarArr2[i12];
                    if (caVar3 != caVar) {
                        caVar3.c.a(caVar3, caVar);
                        caVar3.a();
                    }
                }
            }
        }
    }

    public final int a(defpackage.cc ccVar) {
        int i2;
        boolean z;
        defpackage.cf cfVar;
        float f2;
        boolean z2;
        for (int i3 = 0; i3 < this.c; i3++) {
            this.j[i3] = false;
        }
        int i4 = 0;
        int i5 = 0;
        boolean z3 = false;
        while (!z3) {
            int i6 = i5 + 1;
            int size = ccVar.a.size();
            int i7 = 0;
            defpackage.cf cfVar2 = null;
            int i8 = 0;
            while (i7 < size) {
                defpackage.cf cfVar3 = (defpackage.cf) ccVar.a.get(i7);
                defpackage.cf cfVar4 = cfVar2;
                int i9 = i8;
                for (int i10 = 5; i10 >= 0; i10--) {
                    float f3 = cfVar3.e[i10];
                    if (cfVar4 == null && f3 < 0.0f && i10 >= i9) {
                        i9 = i10;
                        cfVar4 = cfVar3;
                    }
                    if (f3 > 0.0f && i10 > i9) {
                        cfVar4 = null;
                        i9 = i10;
                    }
                }
                i7++;
                i8 = i9;
                cfVar2 = cfVar4;
            }
            if (cfVar2 == null) {
                i2 = i4;
                z = z3;
                cfVar = cfVar2;
            } else if (this.j[cfVar2.a]) {
                i2 = i4;
                z = z3;
                cfVar = null;
            } else {
                this.j[cfVar2.a] = true;
                int i11 = i4 + 1;
                if (i11 >= this.c) {
                    cfVar = cfVar2;
                    i2 = i11;
                    z = true;
                } else {
                    i2 = i11;
                    z = z3;
                    cfVar = cfVar2;
                }
            }
            if (cfVar != null) {
                float f4 = Float.MAX_VALUE;
                int i12 = -1;
                int i13 = 0;
                while (i13 < this.d) {
                    defpackage.ca caVar = this.b[i13];
                    if (caVar.a.f != defpackage.bg.f) {
                        defpackage.bz bzVar = caVar.c;
                        if (bzVar.f != -1) {
                            int i14 = bzVar.f;
                            int i15 = 0;
                            while (true) {
                                if (i14 == -1 || i15 >= bzVar.a) {
                                    break;
                                } else if (bzVar.c[i14] == cfVar.a) {
                                    z2 = true;
                                    break;
                                } else {
                                    i14 = bzVar.d[i14];
                                    i15++;
                                }
                            }
                        }
                        z2 = false;
                        if (z2) {
                            float b2 = caVar.c.b(cfVar);
                            if (b2 < 0.0f) {
                                f2 = (-caVar.b) / b2;
                                if (f2 < f4) {
                                    i12 = i13;
                                    i13++;
                                    f4 = f2;
                                }
                            }
                        }
                    }
                    f2 = f4;
                    i13++;
                    f4 = f2;
                }
                if (i12 >= 0) {
                    defpackage.ca caVar2 = this.b[i12];
                    caVar2.a.b = -1;
                    caVar2.a(cfVar);
                    caVar2.a.b = i12;
                    for (int i16 = 0; i16 < this.d; i16++) {
                        this.b[i16].a(caVar2);
                    }
                    ccVar.a(this);
                    try {
                        b(ccVar);
                        i4 = i2;
                        i5 = i6;
                        z3 = z;
                    } catch (java.lang.Exception e2) {
                        defpackage.cza.a.a(e2);
                        i4 = i2;
                        i5 = i6;
                        z3 = z;
                    }
                } else {
                    i4 = i2;
                    i5 = i6;
                    z3 = true;
                }
            } else {
                i4 = i2;
                i5 = i6;
                z3 = true;
            }
        }
        return i5;
    }

    public final int b(defpackage.cc ccVar) {
        boolean z;
        int i2;
        int i3 = 0;
        while (true) {
            if (i3 < this.d) {
                if (this.b[i3].a.f != defpackage.bg.f && this.b[i3].b < 0.0f) {
                    z = true;
                    break;
                }
                i3++;
            } else {
                z = false;
                break;
            }
        }
        if (z) {
            boolean z2 = false;
            i2 = 0;
            while (!z2) {
                int i4 = i2 + 1;
                float f2 = Float.MAX_VALUE;
                int i5 = 0;
                int i6 = -1;
                int i7 = -1;
                for (int i8 = 0; i8 < this.d; i8++) {
                    defpackage.ca caVar = this.b[i8];
                    if (caVar.a.f != defpackage.bg.f && caVar.b < 0.0f) {
                        float f3 = f2;
                        int i9 = i5;
                        int i10 = i6;
                        int i11 = i7;
                        for (int i12 = 1; i12 < this.c; i12++) {
                            defpackage.cf cfVar = this.e.c[i12];
                            float b2 = caVar.c.b(cfVar);
                            if (b2 > 0.0f) {
                                float f4 = f3;
                                int i13 = 0;
                                while (i13 < 6) {
                                    float f5 = cfVar.e[i13] / b2;
                                    if ((f5 >= f4 || i13 != i9) && i13 <= i9) {
                                        f5 = f4;
                                    } else {
                                        i11 = i12;
                                        i10 = i8;
                                        i9 = i13;
                                    }
                                    i13++;
                                    f4 = f5;
                                }
                                f3 = f4;
                            }
                        }
                        i7 = i11;
                        i6 = i10;
                        i5 = i9;
                        f2 = f3;
                    }
                }
                if (i6 != -1) {
                    defpackage.ca caVar2 = this.b[i6];
                    caVar2.a.b = -1;
                    caVar2.a(this.e.c[i7]);
                    caVar2.a.b = i6;
                    for (int i14 = 0; i14 < this.d; i14++) {
                        this.b[i14].a(caVar2);
                    }
                    ccVar.a(this);
                    i2 = i4;
                } else {
                    z2 = true;
                    i2 = i4;
                }
            }
        } else {
            i2 = 0;
        }
        int i15 = 0;
        while (i15 < this.d && (this.b[i15].a.f == defpackage.bg.f || this.b[i15].b >= 0.0f)) {
            i15++;
        }
        return i2;
    }

    public final void a(defpackage.cf cfVar, defpackage.cf cfVar2, int i2, int i3) {
        defpackage.ca b2 = b();
        defpackage.cf c2 = c();
        c2.c = i3;
        b2.a(cfVar, cfVar2, c2, i2);
        a(b2);
    }

    public final void b(defpackage.cf cfVar, defpackage.cf cfVar2, int i2, int i3) {
        defpackage.ca b2 = b();
        defpackage.cf c2 = c();
        c2.c = i3;
        b2.b(cfVar, cfVar2, c2, i2);
        a(b2);
    }

    public final void a(defpackage.cf cfVar, defpackage.cf cfVar2, int i2, float f2, defpackage.cf cfVar3, defpackage.cf cfVar4, int i3) {
        defpackage.ca b2 = b();
        b2.a(cfVar, cfVar2, i2, f2, cfVar3, cfVar4, i3);
        defpackage.cf d2 = d();
        defpackage.cf d3 = d();
        d2.c = 4;
        d3.c = 4;
        b2.a(d2, d3);
        a(b2);
    }

    public final defpackage.ca c(defpackage.cf cfVar, defpackage.cf cfVar2, int i2, int i3) {
        defpackage.ca b2 = b();
        b2.a(cfVar, cfVar2, i2);
        defpackage.cf d2 = d();
        defpackage.cf d3 = d();
        d2.c = i3;
        d3.c = i3;
        b2.a(d2, d3);
        a(b2);
        return b2;
    }

    public final void a(defpackage.cf cfVar, int i2) {
        int i3 = cfVar.b;
        if (cfVar.b != -1) {
            defpackage.ca caVar = this.b[i3];
            if (caVar.d) {
                caVar.b = (float) i2;
                return;
            }
            defpackage.ca b2 = b();
            b2.a(cfVar, i2);
            a(b2);
            return;
        }
        defpackage.ca b3 = b();
        b3.a = cfVar;
        cfVar.d = (float) i2;
        b3.b = (float) i2;
        b3.d = true;
        a(b3);
    }

    public static defpackage.ca a(defpackage.cd cdVar, defpackage.cf cfVar, defpackage.cf cfVar2, int i2, boolean z) {
        defpackage.ca b2 = cdVar.b();
        b2.a(cfVar, cfVar2, i2);
        if (z) {
            cdVar.a(b2, 1);
        }
        return b2;
    }

    public static defpackage.ca a(defpackage.cd cdVar, defpackage.cf cfVar, defpackage.cf cfVar2, int i2, float f2, defpackage.cf cfVar3, defpackage.cf cfVar4, int i3, boolean z) {
        defpackage.ca b2 = cdVar.b();
        b2.a(cfVar, cfVar2, i2, f2, cfVar3, cfVar4, i3);
        if (z) {
            defpackage.cf d2 = cdVar.d();
            defpackage.cf d3 = cdVar.d();
            d2.c = 4;
            d3.c = 4;
            b2.a(d2, d3);
        }
        return b2;
    }
}
