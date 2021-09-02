package defpackage;

/* renamed from: dkd reason: default package */
/* compiled from: PG */
final class dkd extends defpackage.dha {
    public static final int[] c;
    public static final long serialVersionUID = 1;
    public final defpackage.dha d;
    public final defpackage.dha e;
    private final int f;
    private final int g;
    private final int h;

    dkd(defpackage.dha dha, defpackage.dha dha2) {
        this.d = dha;
        this.e = dha2;
        this.g = dha.a();
        this.f = this.g + dha2.a();
        this.h = java.lang.Math.max(dha.f(), dha2.f()) + 1;
    }

    static defpackage.dha a(defpackage.dha dha, defpackage.dha dha2) {
        if (dha2.a() == 0) {
            return dha;
        }
        if (dha.a() == 0) {
            return dha2;
        }
        int a = dha2.a() + dha.a();
        if (a < 128) {
            return b(dha, dha2);
        }
        if (dha instanceof defpackage.dkd) {
            defpackage.dkd dkd = (defpackage.dkd) dha;
            if (dkd.e.a() + dha2.a() < 128) {
                return new defpackage.dkd(dkd.d, b(dkd.e, dha2));
            } else if (dkd.d.f() > dkd.e.f() && dkd.f() > dha2.f()) {
                return new defpackage.dkd(dkd.d, new defpackage.dkd(dkd.e, dha2));
            }
        }
        if (a >= c[java.lang.Math.max(dha.f(), dha2.f()) + 1]) {
            return new defpackage.dkd(dha, dha2);
        }
        defpackage.dke dke = new defpackage.dke();
        dke.a(dha);
        dke.a(dha2);
        defpackage.dha dha3 = (defpackage.dha) dke.a.pop();
        while (!dke.a.isEmpty()) {
            dha3 = new defpackage.dkd((defpackage.dha) dke.a.pop(), dha3);
        }
        return dha3;
    }

    private static defpackage.dha b(defpackage.dha dha, defpackage.dha dha2) {
        int a = dha.a();
        int a2 = dha2.a();
        byte[] bArr = new byte[(a + a2)];
        dha.a(bArr, 0, 0, a);
        dha2.a(bArr, 0, a, a2);
        return defpackage.dha.a(bArr);
    }

    public final byte a(int i) {
        b(i, this.f);
        if (i < this.g) {
            return this.d.a(i);
        }
        return this.e.a(i - this.g);
    }

    public final int a() {
        return this.f;
    }

    /* access modifiers changed from: protected */
    public final int f() {
        return this.h;
    }

    /* access modifiers changed from: protected */
    public final boolean g() {
        return this.f >= c[this.h];
    }

    public final defpackage.dha a(int i, int i2) {
        int c2 = c(i, i2, this.f);
        if (c2 == 0) {
            return defpackage.dha.a;
        }
        if (c2 == this.f) {
            return this;
        }
        if (i2 <= this.g) {
            return this.d.a(i, i2);
        }
        if (i >= this.g) {
            return this.e.a(i - this.g, i2 - this.g);
        }
        defpackage.dha dha = this.d;
        return new defpackage.dkd(dha.a(i, dha.a()), this.e.a(0, i2 - this.g));
    }

    /* access modifiers changed from: protected */
    public final void b(byte[] bArr, int i, int i2, int i3) {
        if (i + i3 <= this.g) {
            this.d.b(bArr, i, i2, i3);
        } else if (i >= this.g) {
            this.e.b(bArr, i - this.g, i2, i3);
        } else {
            int i4 = this.g - i;
            this.d.b(bArr, i, i2, i4);
            this.e.b(bArr, 0, i2 + i4, i3 - i4);
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(defpackage.dgz dgz) {
        this.d.a(dgz);
        this.e.a(dgz);
    }

    /* access modifiers changed from: protected */
    public final java.lang.String a(java.nio.charset.Charset charset) {
        return new java.lang.String(b(), charset);
    }

    public final boolean d() {
        if (this.e.a(this.d.a(0, 0, this.g), 0, this.e.a()) == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final int a(int i, int i2, int i3) {
        if (i2 + i3 <= this.g) {
            return this.d.a(i, i2, i3);
        }
        if (i2 >= this.g) {
            return this.e.a(i, i2 - this.g, i3);
        }
        int i4 = this.g - i2;
        return this.e.a(this.d.a(i, i2, i4), 0, i3 - i4);
    }

    public final boolean equals(java.lang.Object obj) {
        boolean a;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.dha)) {
            return false;
        }
        defpackage.dha dha = (defpackage.dha) obj;
        if (this.f != dha.a()) {
            return false;
        }
        if (this.f == 0) {
            return true;
        }
        int i = this.b;
        int i2 = dha.b;
        if (i != 0 && i2 != 0 && i != i2) {
            return false;
        }
        defpackage.dkf dkf = new defpackage.dkf(this);
        defpackage.dhg dhg = (defpackage.dhg) dkf.next();
        defpackage.dkf dkf2 = new defpackage.dkf(dha);
        defpackage.dhg dhg2 = (defpackage.dhg) dkf2.next();
        int i3 = 0;
        defpackage.dhg dhg3 = dhg;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int a2 = dhg3.a() - i4;
            int a3 = dhg2.a() - i3;
            int min = java.lang.Math.min(a2, a3);
            if (i4 == 0) {
                a = dhg3.a(dhg2, i3, min);
            } else {
                a = dhg2.a(dhg3, i4, min);
            }
            if (!a) {
                return false;
            }
            int i6 = i5 + min;
            if (i6 < this.f) {
                if (min == a2) {
                    dhg3 = (defpackage.dhg) dkf.next();
                    i4 = 0;
                } else {
                    i4 += min;
                }
                if (min == a3) {
                    dhg2 = (defpackage.dhg) dkf2.next();
                    i3 = 0;
                    i5 = i6;
                } else {
                    i3 += min;
                    i5 = i6;
                }
            } else if (i6 == this.f) {
                return true;
            } else {
                throw new java.lang.IllegalStateException();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final int b(int i, int i2, int i3) {
        if (i2 + i3 <= this.g) {
            return this.d.b(i, i2, i3);
        }
        if (i2 >= this.g) {
            return this.e.b(i, i2 - this.g, i3);
        }
        int i4 = this.g - i2;
        return this.e.b(this.d.b(i, i2, i4), 0, i3 - i4);
    }

    public final defpackage.dhj e() {
        return defpackage.dhj.a((java.io.InputStream) new defpackage.dkg(this));
    }

    /* access modifiers changed from: 0000 */
    public final java.lang.Object writeReplace() {
        return defpackage.dha.a(b());
    }

    private final void readObject(java.io.ObjectInputStream objectInputStream) {
        throw new java.io.InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }

    static {
        int i = 1;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i2 = 1;
        while (i > 0) {
            arrayList.add(java.lang.Integer.valueOf(i));
            int i3 = i2 + i;
            i2 = i;
            i = i3;
        }
        arrayList.add(java.lang.Integer.valueOf(Integer.MAX_VALUE));
        c = new int[arrayList.size()];
        int i4 = 0;
        while (true) {
            int i5 = i4;
            if (i5 < c.length) {
                c[i5] = ((java.lang.Integer) arrayList.get(i5)).intValue();
                i4 = i5 + 1;
            } else {
                return;
            }
        }
    }
}
