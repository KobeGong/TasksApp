package defpackage;

import java.util.Collections;

/* renamed from: dlz  reason: default package */
/* compiled from: PG */
public abstract class dlz extends dmf {
    public dmb j;

    @Override // defpackage.dmf
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

    @Override // defpackage.dmf
    public void a(dlx dlx) {
        if (this.j != null) {
            for (int i = 0; i < this.j.d; i++) {
                this.j.c[i].a(dlx);
            }
        }
    }

    public final boolean a(dlw dlw, int i) {
        byte[] bArr;
        dmc dmc;
        dmc dmc2;
        int i2 = dlw.i();
        if (!dlw.b(i)) {
            return false;
        }
        int i3 = i >>> 3;
        int i4 = dlw.i() - i2;
        if (i4 == 0) {
            bArr = dmh.d;
        } else {
            bArr = new byte[i4];
            System.arraycopy(dlw.a, i2 + dlw.b, bArr, 0, i4);
        }
        dmg dmg = new dmg(i, bArr);
        if (this.j == null) {
            this.j = new dmb();
            dmc = null;
        } else {
            dmb dmb = this.j;
            int b = dmb.b(i3);
            if (b < 0 || dmb.c[b] == dmb.a) {
                dmc = null;
            } else {
                dmc = dmb.c[b];
            }
        }
        if (dmc == null) {
            dmc dmc3 = new dmc();
            dmb dmb2 = this.j;
            int b2 = dmb2.b(i3);
            if (b2 >= 0) {
                dmb2.c[b2] = dmc3;
                dmc2 = dmc3;
            } else {
                int i5 = b2 ^ -1;
                if (i5 >= dmb2.d || dmb2.c[i5] != dmb.a) {
                    if (dmb2.d >= dmb2.b.length) {
                        int a = dmb.a(dmb2.d + 1);
                        int[] iArr = new int[a];
                        dmc[] dmcArr = new dmc[a];
                        System.arraycopy(dmb2.b, 0, iArr, 0, dmb2.b.length);
                        System.arraycopy(dmb2.c, 0, dmcArr, 0, dmb2.c.length);
                        dmb2.b = iArr;
                        dmb2.c = dmcArr;
                    }
                    if (dmb2.d - i5 != 0) {
                        System.arraycopy(dmb2.b, i5, dmb2.b, i5 + 1, dmb2.d - i5);
                        System.arraycopy(dmb2.c, i5, dmb2.c, i5 + 1, dmb2.d - i5);
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
        } else if (dmc2.b instanceof dmf) {
            byte[] bArr2 = dmg.b;
            dlw a2 = dlw.a(bArr2, 0, bArr2.length);
            int e = a2.e();
            if (e != bArr2.length - dlx.a(e)) {
                throw dme.a();
            }
            dmf a3 = ((dmf) dmc2.b).a(a2);
            dmc2.a = dmc2.a;
            dmc2.b = a3;
            dmc2.c = null;
        } else if (dmc2.b instanceof dmf[]) {
            Collections.singletonList(dmg);
            throw new NoSuchMethodError();
        } else {
            Collections.singletonList(dmg);
            throw new NoSuchMethodError();
        }
        return true;
    }

    @Override // defpackage.dmf
    public final /* synthetic */ dmf b() {
        return (dlz) clone();
    }

    @Override // defpackage.dmf
    public /* synthetic */ Object clone() {
        dlz dlz = (dlz) super.clone();
        dmd.a(this, dlz);
        return dlz;
    }
}
