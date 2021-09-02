package defpackage;

/* renamed from: dlz reason: default package */
/* compiled from: PG */
public abstract class dlz extends defpackage.dmf {
    public defpackage.dmb j;

    public int a() {
        if (this.j == null) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.j.d; i2++) {
            i += this.j.c[i2].a();
        }
        return i;
    }

    public void a(defpackage.dlx dlx) {
        if (this.j != null) {
            for (int i = 0; i < this.j.d; i++) {
                this.j.c[i].a(dlx);
            }
        }
    }

    public final boolean a(defpackage.dlw dlw, int i) {
        byte[] bArr;
        defpackage.dmc dmc;
        defpackage.dmc dmc2;
        int i2 = dlw.i();
        if (!dlw.b(i)) {
            return false;
        }
        int i3 = i >>> 3;
        int i4 = dlw.i() - i2;
        if (i4 == 0) {
            bArr = defpackage.dmh.d;
        } else {
            bArr = new byte[i4];
            java.lang.System.arraycopy(dlw.a, i2 + dlw.b, bArr, 0, i4);
        }
        defpackage.dmg dmg = new defpackage.dmg(i, bArr);
        if (this.j == null) {
            this.j = new defpackage.dmb();
            dmc = null;
        } else {
            defpackage.dmb dmb = this.j;
            int b = dmb.b(i3);
            if (b < 0 || dmb.c[b] == defpackage.dmb.a) {
                dmc = null;
            } else {
                dmc = dmb.c[b];
            }
        }
        if (dmc == null) {
            defpackage.dmc dmc3 = new defpackage.dmc();
            defpackage.dmb dmb2 = this.j;
            int b2 = dmb2.b(i3);
            if (b2 >= 0) {
                dmb2.c[b2] = dmc3;
                dmc2 = dmc3;
            } else {
                int i5 = b2 ^ -1;
                if (i5 >= dmb2.d || dmb2.c[i5] != defpackage.dmb.a) {
                    if (dmb2.d >= dmb2.b.length) {
                        int a = defpackage.dmb.a(dmb2.d + 1);
                        int[] iArr = new int[a];
                        defpackage.dmc[] dmcArr = new defpackage.dmc[a];
                        java.lang.System.arraycopy(dmb2.b, 0, iArr, 0, dmb2.b.length);
                        java.lang.System.arraycopy(dmb2.c, 0, dmcArr, 0, dmb2.c.length);
                        dmb2.b = iArr;
                        dmb2.c = dmcArr;
                    }
                    if (dmb2.d - i5 != 0) {
                        java.lang.System.arraycopy(dmb2.b, i5, dmb2.b, i5 + 1, dmb2.d - i5);
                        java.lang.System.arraycopy(dmb2.c, i5, dmb2.c, i5 + 1, dmb2.d - i5);
                    }
                    dmb2.b[i5] = i3;
                    dmb2.c[i5] = dmc3;
                    dmb2.d++;
                    dmc2 = dmc3;
                } else {
                    dmb2.b[i5] = i3;
                    dmb2.c[i5] = dmc3;
                    dmc2 = dmc3;
                }
            }
        } else {
            dmc2 = dmc;
        }
        if (dmc2.c != null) {
            dmc2.c.add(dmg);
        } else if (dmc2.b instanceof defpackage.dmf) {
            byte[] bArr2 = dmg.b;
            defpackage.dlw a2 = defpackage.dlw.a(bArr2, 0, bArr2.length);
            int e = a2.e();
            if (e != bArr2.length - defpackage.dlx.a(e)) {
                throw defpackage.dme.a();
            }
            defpackage.dmf a3 = ((defpackage.dmf) dmc2.b).a(a2);
            dmc2.a = dmc2.a;
            dmc2.b = a3;
            dmc2.c = null;
        } else if (dmc2.b instanceof defpackage.dmf[]) {
            java.util.Collections.singletonList(dmg);
            throw new java.lang.NoSuchMethodError();
        } else {
            java.util.Collections.singletonList(dmg);
            throw new java.lang.NoSuchMethodError();
        }
        return true;
    }

    public final /* synthetic */ defpackage.dmf b() {
        return (defpackage.dlz) clone();
    }

    public /* synthetic */ java.lang.Object clone() {
        defpackage.dlz dlz = (defpackage.dlz) super.clone();
        defpackage.dmd.a(this, dlz);
        return dlz;
    }
}
