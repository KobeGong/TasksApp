package defpackage;

import java.util.Arrays;

/* renamed from: ci  reason: default package */
/* compiled from: PG */
public final class ci extends cn {
    public int ac = 2;
    public boolean ad = false;
    public boolean ae = false;
    private cd ag = new cd();
    private cl ah;
    private int ai;
    private int aj;
    private int ak = 0;
    private int al = 0;
    private ch[] am = new ch[4];
    private ch[] an = new ch[4];
    private ch[] ao = new ch[4];
    private boolean[] ap = new boolean[3];
    private ch[] aq = new ch[4];

    @Override // defpackage.ch, defpackage.cn
    public final void a() {
        this.ag.a();
        super.a();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 694
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:72)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:46)
        */
    private final boolean b(defpackage.cd r23) {
        /*
        // Method dump skipped, instructions count: 4448
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ci.b(cd):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v7, types: [ch] */
    /* JADX WARN: Type inference failed for: r4v5, types: [ch] */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x04d7  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0547  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0569  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0574  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x057f  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x058c  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0592  */
    /* JADX WARNING: Removed duplicated region for block: B:220:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x02be  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0300  */
    /* JADX WARNING: Unknown variable types count: 2 */
    @Override // defpackage.cn
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void o() {
        /*
        // Method dump skipped, instructions count: 1448
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ci.o():void");
    }

    private final void a(ch chVar, boolean[] zArr) {
        ch chVar2;
        int i;
        boolean z;
        int i2;
        ch chVar3 = null;
        boolean z2 = false;
        int i3 = 0;
        z2 = false;
        z2 = false;
        if (chVar.G == bg.y && chVar.H == bg.y && chVar.r > 0.0f) {
            zArr[0] = false;
            return;
        }
        int d = chVar.d();
        if (chVar.G != bg.y || chVar.H == bg.y || chVar.r <= 0.0f) {
            chVar.S = true;
            if (chVar instanceof cj) {
                cj cjVar = (cj) chVar;
                if (cjVar.af != 1) {
                    i2 = d;
                    i3 = d;
                } else if (cjVar.ad != -1) {
                    d = cjVar.ad;
                    i = 0;
                } else if (cjVar.ae != -1) {
                    int i4 = cjVar.ae;
                    i2 = 0;
                    i3 = i4;
                } else {
                    i2 = 0;
                }
                d = i2;
                i = i3;
            } else if (!chVar.k.d() && !chVar.i.d()) {
                i = d;
                d = chVar.t + d;
            } else if (chVar.k.c == null || chVar.i.c == null || (chVar.k.c != chVar.i.c && (chVar.k.c.a != chVar.i.c.a || chVar.k.c.a == chVar.o))) {
                if (chVar.k.c != null) {
                    chVar2 = chVar.k.c.a;
                    i = chVar.k.b() + d;
                    if (!chVar2.b() && !chVar2.S) {
                        a(chVar2, zArr);
                    }
                } else {
                    chVar2 = null;
                    i = d;
                }
                if (chVar.i.c != null) {
                    chVar3 = chVar.i.c.a;
                    d += chVar.i.b();
                    if (!chVar3.b() && !chVar3.S) {
                        a(chVar3, zArr);
                    }
                }
                if (chVar.k.c != null && !chVar2.b()) {
                    if (chVar.k.c.b == bg.p) {
                        i += chVar2.M - chVar2.d();
                    } else if (chVar.k.c.b == bg.n) {
                        i += chVar2.M;
                    }
                    if (chVar2.P || !(chVar2.i.c == null || chVar2.k.c == null || chVar2.G == bg.y)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    chVar.P = z;
                    if (chVar.P && (chVar2.i.c == null || chVar2.i.c.a != chVar)) {
                        i += i - chVar2.M;
                    }
                }
                if (chVar.i.c != null && !chVar3.b()) {
                    if (chVar.i.c.b == bg.n) {
                        d += chVar3.L - chVar3.d();
                    } else if (chVar.i.c.b == bg.p) {
                        d += chVar3.L;
                    }
                    if (chVar3.O || !(chVar3.i.c == null || chVar3.k.c == null || chVar3.G == bg.y)) {
                        z2 = true;
                    }
                    chVar.O = z2;
                    if (chVar.O && (chVar3.k.c == null || chVar3.k.c.a != chVar)) {
                        d += d - chVar3.L;
                    }
                }
            } else {
                zArr[0] = false;
                return;
            }
            if (chVar.J == 8) {
                d -= chVar.p;
                i -= chVar.p;
            }
            chVar.L = d;
            chVar.M = i;
            return;
        }
        zArr[0] = false;
    }

    private final void b(ch chVar, boolean[] zArr) {
        ch chVar2;
        int i;
        boolean z;
        int i2;
        ch chVar3 = null;
        boolean z2 = false;
        r1 = 0;
        int i3 = 0;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        if (chVar.H != bg.y || chVar.G == bg.y || chVar.r <= 0.0f) {
            int e = chVar.e();
            chVar.T = true;
            if (chVar instanceof cj) {
                cj cjVar = (cj) chVar;
                if (cjVar.af != 0) {
                    i2 = e;
                    i3 = e;
                } else if (cjVar.ad != -1) {
                    i = cjVar.ad;
                    e = 0;
                } else {
                    i2 = cjVar.ae != -1 ? cjVar.ae : 0;
                }
                e = i2;
                i = i3;
            } else if (chVar.m.c == null && chVar.j.c == null && chVar.l.c == null) {
                i = e + chVar.u;
            } else if (chVar.l.c != null && chVar.j.c != null && (chVar.l.c == chVar.j.c || (chVar.l.c.a == chVar.j.c.a && chVar.l.c.a != chVar.o))) {
                zArr[0] = false;
                return;
            } else if (chVar.m.d()) {
                ch chVar4 = chVar.m.c.a;
                if (!chVar4.T) {
                    b(chVar4, zArr);
                }
                int max = Math.max((chVar4.K - chVar4.q) + e, e);
                int max2 = Math.max((chVar4.N - chVar4.q) + e, e);
                if (chVar.J == 8) {
                    max -= chVar.q;
                    max2 -= chVar.q;
                }
                chVar.K = max;
                chVar.N = max2;
                return;
            } else {
                if (chVar.j.d()) {
                    chVar2 = chVar.j.c.a;
                    i = chVar.j.b() + e;
                    if (!chVar2.b() && !chVar2.T) {
                        b(chVar2, zArr);
                    }
                } else {
                    chVar2 = null;
                    i = e;
                }
                if (chVar.l.d()) {
                    chVar3 = chVar.l.c.a;
                    e += chVar.l.b();
                    if (!chVar3.b() && !chVar3.T) {
                        b(chVar3, zArr);
                    }
                }
                if (chVar.j.c != null && !chVar2.b()) {
                    if (chVar.j.c.b == bg.o) {
                        i += chVar2.K - chVar2.e();
                    } else if (chVar.j.c.b == bg.q) {
                        i += chVar2.K;
                    }
                    if (chVar2.Q || !(chVar2.j.c == null || chVar2.j.c.a == chVar || chVar2.l.c == null || chVar2.l.c.a == chVar || chVar2.H == bg.y)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    chVar.Q = z;
                    if (chVar.Q && (chVar2.l.c == null || chVar2.l.c.a != chVar)) {
                        i += i - chVar2.K;
                    }
                }
                if (chVar.l.c != null && !chVar3.b()) {
                    if (chVar.l.c.b == bg.q) {
                        e += chVar3.N - chVar3.e();
                    } else if (chVar.l.c.b == bg.o) {
                        e += chVar3.N;
                    }
                    if (chVar3.R || !(chVar3.j.c == null || chVar3.j.c.a == chVar || chVar3.l.c == null || chVar3.l.c.a == chVar || chVar3.H == bg.y)) {
                        z2 = true;
                    }
                    chVar.R = z2;
                    if (chVar.R && (chVar3.j.c == null || chVar3.j.c.a != chVar)) {
                        e += e - chVar3.N;
                    }
                }
            }
            if (chVar.J == 8) {
                i -= chVar.q;
                e -= chVar.q;
            }
            chVar.K = i;
            chVar.N = e;
            return;
        }
        zArr[0] = false;
    }

    /* access modifiers changed from: package-private */
    public final void a(ch chVar, int i) {
        int i2 = 0;
        if (i == 0) {
            while (chVar.i.c != null && chVar.i.c.a.k.c != null && chVar.i.c.a.k.c == chVar.i && chVar.i.c.a != chVar) {
                chVar = chVar.i.c.a;
            }
            while (i2 < this.ak) {
                if (this.ao[i2] != chVar) {
                    i2++;
                } else {
                    return;
                }
            }
            if (this.ak + 1 >= this.ao.length) {
                this.ao = (ch[]) Arrays.copyOf(this.ao, this.ao.length << 1);
            }
            this.ao[this.ak] = chVar;
            this.ak++;
        } else if (i == 1) {
            while (chVar.j.c != null && chVar.j.c.a.l.c != null && chVar.j.c.a.l.c == chVar.j && chVar.j.c.a != chVar) {
                chVar = chVar.j.c.a;
            }
            while (i2 < this.al) {
                if (this.an[i2] != chVar) {
                    i2++;
                } else {
                    return;
                }
            }
            if (this.al + 1 >= this.an.length) {
                this.an = (ch[]) Arrays.copyOf(this.an, this.an.length << 1);
            }
            this.an[this.al] = chVar;
            this.al++;
        }
    }

    private final int a(cd cdVar, ch[] chVarArr, ch chVar, int i, boolean[] zArr) {
        boolean z;
        int i2;
        ch chVar2;
        ch chVar3;
        boolean z2;
        ch chVar4;
        ch chVar5;
        zArr[0] = true;
        zArr[1] = false;
        chVarArr[0] = null;
        chVarArr[2] = null;
        chVarArr[1] = null;
        chVarArr[3] = null;
        if (i == 0) {
            if (chVar.i.c == null || chVar.i.c.a == this) {
                z2 = true;
            } else {
                z2 = false;
            }
            chVar.aa = null;
            ch chVar6 = null;
            if (chVar.J != 8) {
                chVar6 = chVar;
            }
            ch chVar7 = null;
            i2 = 0;
            ch chVar8 = chVar;
            ch chVar9 = chVar6;
            while (true) {
                if (chVar8.k.c == null) {
                    chVar4 = chVar9;
                    chVar5 = chVar6;
                    break;
                }
                chVar8.aa = null;
                if (chVar8.J != 8) {
                    if (chVar9 == null) {
                        chVar4 = chVar8;
                    } else {
                        chVar4 = chVar9;
                    }
                    if (!(chVar6 == null || chVar6 == chVar8)) {
                        chVar6.aa = chVar8;
                    }
                    chVar5 = chVar8;
                } else {
                    cdVar.c(chVar8.i.h, chVar8.i.c.h, 0, 5);
                    cdVar.c(chVar8.k.h, chVar8.i.h, 0, 5);
                    chVar4 = chVar9;
                    chVar5 = chVar6;
                }
                if (chVar8.J != 8 && chVar8.G == bg.y) {
                    if (chVar8.H == bg.y) {
                        zArr[0] = false;
                    }
                    if (chVar8.r <= 0.0f) {
                        zArr[0] = false;
                        if (i2 + 1 >= this.am.length) {
                            this.am = (ch[]) Arrays.copyOf(this.am, this.am.length << 1);
                        }
                        this.am[i2] = chVar8;
                        i2++;
                    }
                }
                if (chVar8.k.c.a.i.c == null || chVar8.k.c.a.i.c.a != chVar8 || chVar8.k.c.a == chVar8) {
                    break;
                }
                ch chVar10 = chVar8.k.c.a;
                chVar7 = chVar10;
                chVar8 = chVar10;
                chVar6 = chVar5;
                chVar9 = chVar4;
            }
            if (!(chVar8.k.c == null || chVar8.k.c.a == this)) {
                z2 = false;
            }
            if (chVar.i.c == null || chVar7.k.c == null) {
                zArr[1] = true;
            }
            chVar.W = z2;
            chVar7.aa = null;
            chVarArr[0] = chVar;
            chVarArr[2] = chVar4;
            chVarArr[1] = chVar7;
            chVarArr[3] = chVar5;
        } else {
            if (chVar.j.c == null || chVar.j.c.a == this) {
                z = true;
            } else {
                z = false;
            }
            chVar.ab = null;
            ch chVar11 = null;
            if (chVar.J != 8) {
                chVar11 = chVar;
            }
            ch chVar12 = null;
            i2 = 0;
            ch chVar13 = chVar;
            ch chVar14 = chVar11;
            while (true) {
                if (chVar13.l.c == null) {
                    chVar2 = chVar14;
                    chVar3 = chVar11;
                    break;
                }
                chVar13.ab = null;
                if (chVar13.J != 8) {
                    if (chVar14 == null) {
                        chVar2 = chVar13;
                    } else {
                        chVar2 = chVar14;
                    }
                    if (!(chVar11 == null || chVar11 == chVar13)) {
                        chVar11.ab = chVar13;
                    }
                    chVar3 = chVar13;
                } else {
                    cdVar.c(chVar13.j.h, chVar13.j.c.h, 0, 5);
                    cdVar.c(chVar13.l.h, chVar13.j.h, 0, 5);
                    chVar2 = chVar14;
                    chVar3 = chVar11;
                }
                if (chVar13.J != 8 && chVar13.H == bg.y) {
                    if (chVar13.G == bg.y) {
                        zArr[0] = false;
                    }
                    if (chVar13.r <= 0.0f) {
                        zArr[0] = false;
                        if (i2 + 1 >= this.am.length) {
                            this.am = (ch[]) Arrays.copyOf(this.am, this.am.length << 1);
                        }
                        this.am[i2] = chVar13;
                        i2++;
                    }
                }
                if (chVar13.l.c.a.j.c == null || chVar13.l.c.a.j.c.a != chVar13 || chVar13.l.c.a == chVar13) {
                    break;
                }
                ch chVar15 = chVar13.l.c.a;
                chVar12 = chVar15;
                chVar13 = chVar15;
                chVar11 = chVar3;
                chVar14 = chVar2;
            }
            if (!(chVar13.l.c == null || chVar13.l.c.a == this)) {
                z = false;
            }
            if (chVar.j.c == null || chVar12.l.c == null) {
                zArr[1] = true;
            }
            chVar.X = z;
            chVar12.ab = null;
            chVarArr[0] = chVar;
            chVarArr[2] = chVar2;
            chVarArr[1] = chVar12;
            chVarArr[3] = chVar3;
        }
        return i2;
    }
}
