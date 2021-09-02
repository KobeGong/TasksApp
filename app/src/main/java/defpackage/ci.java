package defpackage;

/* renamed from: ci reason: default package */
/* compiled from: PG */
public final class ci extends defpackage.cn {
    public int ac = 2;
    public boolean ad = false;
    public boolean ae = false;
    private defpackage.cd ag = new defpackage.cd();
    private defpackage.cl ah;
    private int ai;
    private int aj;
    private int ak = 0;
    private int al = 0;
    private defpackage.ch[] am = new defpackage.ch[4];
    private defpackage.ch[] an = new defpackage.ch[4];
    private defpackage.ch[] ao = new defpackage.ch[4];
    private boolean[] ap = new boolean[3];
    private defpackage.ch[] aq = new defpackage.ch[4];

    public final void a() {
        this.ag.a();
        super.a();
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 694 */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x04c1  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x05c3  */
    /* JADX WARNING: Removed duplicated region for block: B:365:0x0b69  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean b(defpackage.cd r23) {
        /*
            r22 = this;
            r22.a(r23)
            r0 = r22
            java.util.ArrayList r4 = r0.af
            int r14 = r4.size()
            r10 = 0
            r0 = r22
            int r4 = r0.ac
            r5 = 2
            if (r4 == r5) goto L_0x001a
            r0 = r22
            int r4 = r0.ac
            r5 = 4
            if (r4 != r5) goto L_0x04bb
        L_0x001a:
            r0 = r22
            java.util.ArrayList r4 = r0.af
            int r15 = r4.size()
            r9 = 0
            r7 = 0
            r8 = 0
            r4 = 0
            r5 = r4
        L_0x0027:
            if (r5 >= r15) goto L_0x115c
            r0 = r22
            java.util.ArrayList r4 = r0.af
            java.lang.Object r4 = r4.get(r5)
            ch r4 = (defpackage.ch) r4
            r6 = -1
            r4.a = r6
            r6 = -1
            r4.b = r6
            int r6 = r4.G
            int r11 = defpackage.bg.y
            if (r6 == r11) goto L_0x0045
            int r6 = r4.H
            int r11 = defpackage.bg.y
            if (r6 != r11) goto L_0x004b
        L_0x0045:
            r6 = 1
            r4.a = r6
            r6 = 1
            r4.b = r6
        L_0x004b:
            int r4 = r5 + 1
            r5 = r4
            goto L_0x0027
        L_0x004f:
            if (r7 != 0) goto L_0x0479
            if (r8 != 0) goto L_0x0479
            r9 = 1
            r12 = r8
            r13 = r7
        L_0x0056:
            if (r9 != 0) goto L_0x0483
            r7 = 0
            r8 = 0
            r4 = 0
            r11 = r4
        L_0x005c:
            if (r11 >= r15) goto L_0x004f
            r0 = r22
            java.util.ArrayList r4 = r0.af
            java.lang.Object r4 = r4.get(r11)
            ch r4 = (defpackage.ch) r4
            int r5 = r4.a
            r6 = -1
            if (r5 != r6) goto L_0x0078
            r0 = r22
            int r5 = r0.G
            int r6 = defpackage.bg.x
            if (r5 != r6) goto L_0x009c
            r5 = 1
            r4.a = r5
        L_0x0078:
            int r5 = r4.b
            r6 = -1
            if (r5 != r6) goto L_0x0088
            r0 = r22
            int r5 = r0.H
            int r6 = defpackage.bg.x
            if (r5 != r6) goto L_0x0470
            r5 = 1
            r4.b = r5
        L_0x0088:
            int r5 = r4.b
            r6 = -1
            if (r5 != r6) goto L_0x1159
            int r5 = r7 + 1
        L_0x008f:
            int r4 = r4.a
            r6 = -1
            if (r4 != r6) goto L_0x1156
            int r4 = r8 + 1
        L_0x0096:
            int r6 = r11 + 1
            r11 = r6
            r8 = r4
            r7 = r5
            goto L_0x005c
        L_0x009c:
            int r5 = r4.G
            int r6 = defpackage.bg.y
            if (r5 != r6) goto L_0x00a6
            r5 = 1
            r4.a = r5
            goto L_0x0078
        L_0x00a6:
            r0 = r22
            int r5 = r0.G
            int r6 = defpackage.bg.x
            if (r5 == r6) goto L_0x010a
            int r5 = r4.G
            int r6 = defpackage.bg.z
            if (r5 != r6) goto L_0x010a
            cg r5 = r4.i
            cg r6 = r4.i
            r0 = r23
            cf r6 = r0.a(r6)
            r5.h = r6
            cg r5 = r4.k
            cg r6 = r4.k
            r0 = r23
            cf r6 = r0.a(r6)
            r5.h = r6
            cg r5 = r4.i
            int r5 = r5.d
            int r6 = r22.c()
            cg r0 = r4.k
            r16 = r0
            r0 = r16
            int r0 = r0.d
            r16 = r0
            int r6 = r6 - r16
            cg r0 = r4.i
            r16 = r0
            r0 = r16
            cf r0 = r0.h
            r16 = r0
            r0 = r23
            r1 = r16
            r0.a(r1, r5)
            cg r0 = r4.k
            r16 = r0
            r0 = r16
            cf r0 = r0.h
            r16 = r0
            r0 = r23
            r1 = r16
            r0.a(r1, r6)
            r4.b(r5, r6)
            r5 = 2
            r4.a = r5
            goto L_0x0078
        L_0x010a:
            cg r5 = r4.i
            cg r5 = r5.c
            if (r5 == 0) goto L_0x01c9
            cg r5 = r4.k
            cg r5 = r5.c
            if (r5 == 0) goto L_0x01c9
            cg r5 = r4.i
            cg r5 = r5.c
            ch r5 = r5.a
            r0 = r22
            if (r5 != r0) goto L_0x01c4
            cg r5 = r4.k
            cg r5 = r5.c
            ch r5 = r5.a
            r0 = r22
            if (r5 != r0) goto L_0x01c4
            cg r5 = r4.i
            int r6 = r5.b()
            cg r5 = r4.k
            int r5 = r5.b()
            r0 = r22
            int r0 = r0.G
            r16 = r0
            int r17 = defpackage.bg.y
            r0 = r16
            r1 = r17
            if (r0 != r1) goto L_0x01a3
            int r16 = r22.c()
            int r5 = r16 - r5
        L_0x014a:
            cg r0 = r4.i
            r16 = r0
            cg r0 = r4.i
            r17 = r0
            r0 = r23
            r1 = r17
            cf r17 = r0.a(r1)
            r0 = r17
            r1 = r16
            r1.h = r0
            cg r0 = r4.k
            r16 = r0
            cg r0 = r4.k
            r17 = r0
            r0 = r23
            r1 = r17
            cf r17 = r0.a(r1)
            r0 = r17
            r1 = r16
            r1.h = r0
            cg r0 = r4.i
            r16 = r0
            r0 = r16
            cf r0 = r0.h
            r16 = r0
            r0 = r23
            r1 = r16
            r0.a(r1, r6)
            cg r0 = r4.k
            r16 = r0
            r0 = r16
            cf r0 = r0.h
            r16 = r0
            r0 = r23
            r1 = r16
            r0.a(r1, r5)
            r16 = 2
            r0 = r16
            r4.a = r0
            r4.b(r6, r5)
            goto L_0x0078
        L_0x01a3:
            int r16 = r4.c()
            int r17 = r22.c()
            int r17 = r17 - r6
            int r5 = r17 - r5
            int r5 = r5 - r16
            float r5 = (float) r5
            float r0 = r4.E
            r16 = r0
            float r5 = r5 * r16
            r16 = 1056964608(0x3f000000, float:0.5)
            float r5 = r5 + r16
            int r5 = (int) r5
            int r6 = r6 + r5
            int r5 = r4.c()
            int r5 = r5 + r6
            goto L_0x014a
        L_0x01c4:
            r5 = 1
            r4.a = r5
            goto L_0x0078
        L_0x01c9:
            cg r5 = r4.i
            cg r5 = r5.c
            if (r5 == 0) goto L_0x023d
            cg r5 = r4.i
            cg r5 = r5.c
            ch r5 = r5.a
            r0 = r22
            if (r5 != r0) goto L_0x023d
            cg r5 = r4.i
            int r5 = r5.b()
            int r6 = r4.c()
            int r6 = r6 + r5
            cg r0 = r4.i
            r16 = r0
            cg r0 = r4.i
            r17 = r0
            r0 = r23
            r1 = r17
            cf r17 = r0.a(r1)
            r0 = r17
            r1 = r16
            r1.h = r0
            cg r0 = r4.k
            r16 = r0
            cg r0 = r4.k
            r17 = r0
            r0 = r23
            r1 = r17
            cf r17 = r0.a(r1)
            r0 = r17
            r1 = r16
            r1.h = r0
            cg r0 = r4.i
            r16 = r0
            r0 = r16
            cf r0 = r0.h
            r16 = r0
            r0 = r23
            r1 = r16
            r0.a(r1, r5)
            cg r0 = r4.k
            r16 = r0
            r0 = r16
            cf r0 = r0.h
            r16 = r0
            r0 = r23
            r1 = r16
            r0.a(r1, r6)
            r16 = 2
            r0 = r16
            r4.a = r0
            r4.b(r5, r6)
            goto L_0x0078
        L_0x023d:
            cg r5 = r4.k
            cg r5 = r5.c
            if (r5 == 0) goto L_0x02a3
            cg r5 = r4.k
            cg r5 = r5.c
            ch r5 = r5.a
            r0 = r22
            if (r5 != r0) goto L_0x02a3
            cg r5 = r4.i
            cg r6 = r4.i
            r0 = r23
            cf r6 = r0.a(r6)
            r5.h = r6
            cg r5 = r4.k
            cg r6 = r4.k
            r0 = r23
            cf r6 = r0.a(r6)
            r5.h = r6
            int r5 = r22.c()
            cg r6 = r4.k
            int r6 = r6.b()
            int r5 = r5 - r6
            int r6 = r4.c()
            int r6 = r5 - r6
            cg r0 = r4.i
            r16 = r0
            r0 = r16
            cf r0 = r0.h
            r16 = r0
            r0 = r23
            r1 = r16
            r0.a(r1, r6)
            cg r0 = r4.k
            r16 = r0
            r0 = r16
            cf r0 = r0.h
            r16 = r0
            r0 = r23
            r1 = r16
            r0.a(r1, r5)
            r16 = 2
            r0 = r16
            r4.a = r0
            r4.b(r6, r5)
            goto L_0x0078
        L_0x02a3:
            cg r5 = r4.i
            cg r5 = r5.c
            if (r5 == 0) goto L_0x031e
            cg r5 = r4.i
            cg r5 = r5.c
            ch r5 = r5.a
            int r5 = r5.a
            r6 = 2
            if (r5 != r6) goto L_0x031e
            cg r5 = r4.i
            cg r5 = r5.c
            cf r5 = r5.h
            cg r6 = r4.i
            cg r0 = r4.i
            r16 = r0
            r0 = r23
            r1 = r16
            cf r16 = r0.a(r1)
            r0 = r16
            r6.h = r0
            cg r6 = r4.k
            cg r0 = r4.k
            r16 = r0
            r0 = r23
            r1 = r16
            cf r16 = r0.a(r1)
            r0 = r16
            r6.h = r0
            float r5 = r5.d
            cg r6 = r4.i
            int r6 = r6.b()
            float r6 = (float) r6
            float r5 = r5 + r6
            r6 = 1056964608(0x3f000000, float:0.5)
            float r5 = r5 + r6
            int r5 = (int) r5
            int r6 = r4.c()
            int r6 = r6 + r5
            cg r0 = r4.i
            r16 = r0
            r0 = r16
            cf r0 = r0.h
            r16 = r0
            r0 = r23
            r1 = r16
            r0.a(r1, r5)
            cg r0 = r4.k
            r16 = r0
            r0 = r16
            cf r0 = r0.h
            r16 = r0
            r0 = r23
            r1 = r16
            r0.a(r1, r6)
            r16 = 2
            r0 = r16
            r4.a = r0
            r4.b(r5, r6)
            goto L_0x0078
        L_0x031e:
            cg r5 = r4.k
            cg r5 = r5.c
            if (r5 == 0) goto L_0x039a
            cg r5 = r4.k
            cg r5 = r5.c
            ch r5 = r5.a
            int r5 = r5.a
            r6 = 2
            if (r5 != r6) goto L_0x039a
            cg r5 = r4.k
            cg r5 = r5.c
            cf r5 = r5.h
            cg r6 = r4.i
            cg r0 = r4.i
            r16 = r0
            r0 = r23
            r1 = r16
            cf r16 = r0.a(r1)
            r0 = r16
            r6.h = r0
            cg r6 = r4.k
            cg r0 = r4.k
            r16 = r0
            r0 = r23
            r1 = r16
            cf r16 = r0.a(r1)
            r0 = r16
            r6.h = r0
            float r5 = r5.d
            cg r6 = r4.k
            int r6 = r6.b()
            float r6 = (float) r6
            float r5 = r5 - r6
            r6 = 1056964608(0x3f000000, float:0.5)
            float r5 = r5 + r6
            int r5 = (int) r5
            int r6 = r4.c()
            int r6 = r5 - r6
            cg r0 = r4.i
            r16 = r0
            r0 = r16
            cf r0 = r0.h
            r16 = r0
            r0 = r23
            r1 = r16
            r0.a(r1, r6)
            cg r0 = r4.k
            r16 = r0
            r0 = r16
            cf r0 = r0.h
            r16 = r0
            r0 = r23
            r1 = r16
            r0.a(r1, r5)
            r16 = 2
            r0 = r16
            r4.a = r0
            r4.b(r6, r5)
            goto L_0x0078
        L_0x039a:
            cg r5 = r4.i
            cg r5 = r5.c
            if (r5 == 0) goto L_0x0413
            r5 = 1
        L_0x03a1:
            cg r6 = r4.k
            cg r6 = r6.c
            if (r6 == 0) goto L_0x0415
            r6 = 1
        L_0x03a8:
            if (r5 != 0) goto L_0x0078
            if (r6 != 0) goto L_0x0078
            boolean r5 = r4 instanceof defpackage.cj
            if (r5 == 0) goto L_0x0432
            r5 = r4
            cj r5 = (defpackage.cj) r5
            int r6 = r5.af
            r16 = 1
            r0 = r16
            if (r6 != r0) goto L_0x0078
            cg r6 = r4.i
            cg r0 = r4.i
            r16 = r0
            r0 = r23
            r1 = r16
            cf r16 = r0.a(r1)
            r0 = r16
            r6.h = r0
            cg r6 = r4.k
            cg r0 = r4.k
            r16 = r0
            r0 = r23
            r1 = r16
            cf r16 = r0.a(r1)
            r0 = r16
            r6.h = r0
            int r6 = r5.ad
            r16 = -1
            r0 = r16
            if (r6 == r0) goto L_0x0417
            int r5 = r5.ad
            float r5 = (float) r5
        L_0x03ea:
            r6 = 1056964608(0x3f000000, float:0.5)
            float r5 = r5 + r6
            int r5 = (int) r5
            cg r6 = r4.i
            cf r6 = r6.h
            r0 = r23
            r0.a(r6, r5)
            cg r6 = r4.k
            cf r6 = r6.h
            r0 = r23
            r0.a(r6, r5)
            r6 = 2
            r4.a = r6
            r6 = 2
            r4.b = r6
            r4.b(r5, r5)
            r5 = 0
            int r6 = r22.f()
            r4.c(r5, r6)
            goto L_0x0078
        L_0x0413:
            r5 = 0
            goto L_0x03a1
        L_0x0415:
            r6 = 0
            goto L_0x03a8
        L_0x0417:
            int r6 = r5.ae
            r16 = -1
            r0 = r16
            if (r6 == r0) goto L_0x0429
            int r6 = r22.c()
            int r5 = r5.ae
            int r5 = r6 - r5
            float r5 = (float) r5
            goto L_0x03ea
        L_0x0429:
            int r6 = r22.c()
            float r6 = (float) r6
            float r5 = r5.ac
            float r5 = r5 * r6
            goto L_0x03ea
        L_0x0432:
            cg r5 = r4.i
            cg r6 = r4.i
            r0 = r23
            cf r6 = r0.a(r6)
            r5.h = r6
            cg r5 = r4.k
            cg r6 = r4.k
            r0 = r23
            cf r6 = r0.a(r6)
            r5.h = r6
            int r5 = r4.t
            int r6 = r4.c()
            int r6 = r6 + r5
            cg r0 = r4.i
            r16 = r0
            r0 = r16
            cf r0 = r0.h
            r16 = r0
            r0 = r23
            r1 = r16
            r0.a(r1, r5)
            cg r5 = r4.k
            cf r5 = r5.h
            r0 = r23
            r0.a(r5, r6)
            r5 = 2
            r4.a = r5
            goto L_0x0078
        L_0x0470:
            r0 = r22
            r1 = r23
            defpackage.gm.a(r0, r1, r4)
            goto L_0x0088
        L_0x0479:
            if (r13 != r7) goto L_0x1153
            if (r12 != r8) goto L_0x1153
            r4 = 1
        L_0x047e:
            r12 = r8
            r13 = r7
            r9 = r4
            goto L_0x0056
        L_0x0483:
            r5 = 0
            r6 = 0
            r4 = 0
            r7 = r4
        L_0x0487:
            if (r7 >= r15) goto L_0x04b0
            r0 = r22
            java.util.ArrayList r4 = r0.af
            java.lang.Object r4 = r4.get(r7)
            ch r4 = (defpackage.ch) r4
            int r8 = r4.a
            r9 = 1
            if (r8 == r9) goto L_0x049d
            int r8 = r4.a
            r9 = -1
            if (r8 != r9) goto L_0x049f
        L_0x049d:
            int r5 = r5 + 1
        L_0x049f:
            int r8 = r4.b
            r9 = 1
            if (r8 == r9) goto L_0x04a9
            int r4 = r4.b
            r8 = -1
            if (r4 != r8) goto L_0x1150
        L_0x04a9:
            int r4 = r6 + 1
        L_0x04ab:
            int r6 = r7 + 1
            r7 = r6
            r6 = r4
            goto L_0x0487
        L_0x04b0:
            if (r5 != 0) goto L_0x04b9
            if (r6 != 0) goto L_0x04b9
            r4 = 1
        L_0x04b5:
            if (r4 == 0) goto L_0x114d
            r4 = 0
        L_0x04b8:
            return r4
        L_0x04b9:
            r4 = 0
            goto L_0x04b5
        L_0x04bb:
            r4 = 1
            r5 = r4
        L_0x04bd:
            r4 = 0
            r6 = r4
        L_0x04bf:
            if (r6 >= r14) goto L_0x05bd
            r0 = r22
            java.util.ArrayList r4 = r0.af
            java.lang.Object r4 = r4.get(r6)
            ch r4 = (defpackage.ch) r4
            boolean r7 = r4 instanceof defpackage.ci
            if (r7 == 0) goto L_0x04fc
            int r7 = r4.G
            int r8 = r4.H
            int r9 = defpackage.bg.x
            if (r7 != r9) goto L_0x04dc
            int r9 = defpackage.bg.w
            r4.f(r9)
        L_0x04dc:
            int r9 = defpackage.bg.x
            if (r8 != r9) goto L_0x04e5
            int r9 = defpackage.bg.w
            r4.g(r9)
        L_0x04e5:
            r0 = r23
            r4.a(r0)
            int r9 = defpackage.bg.x
            if (r7 != r9) goto L_0x04f1
            r4.f(r7)
        L_0x04f1:
            int r7 = defpackage.bg.x
            if (r8 != r7) goto L_0x04f8
            r4.g(r8)
        L_0x04f8:
            int r4 = r6 + 1
            r6 = r4
            goto L_0x04bf
        L_0x04fc:
            if (r5 == 0) goto L_0x05b6
            r0 = r22
            int r7 = r0.G
            int r8 = defpackage.bg.x
            if (r7 == r8) goto L_0x0549
            int r7 = r4.G
            int r8 = defpackage.bg.z
            if (r7 != r8) goto L_0x0549
            cg r7 = r4.i
            cg r8 = r4.i
            r0 = r23
            cf r8 = r0.a(r8)
            r7.h = r8
            cg r7 = r4.k
            cg r8 = r4.k
            r0 = r23
            cf r8 = r0.a(r8)
            r7.h = r8
            cg r7 = r4.i
            int r7 = r7.d
            int r8 = r22.c()
            cg r9 = r4.k
            int r9 = r9.d
            int r8 = r8 - r9
            cg r9 = r4.i
            cf r9 = r9.h
            r0 = r23
            r0.a(r9, r7)
            cg r9 = r4.k
            cf r9 = r9.h
            r0 = r23
            r0.a(r9, r8)
            r4.b(r7, r8)
            r7 = 2
            r4.a = r7
        L_0x0549:
            r0 = r22
            int r7 = r0.H
            int r8 = defpackage.bg.x
            if (r7 == r8) goto L_0x05b6
            int r7 = r4.H
            int r8 = defpackage.bg.z
            if (r7 != r8) goto L_0x05b6
            cg r7 = r4.j
            cg r8 = r4.j
            r0 = r23
            cf r8 = r0.a(r8)
            r7.h = r8
            cg r7 = r4.l
            cg r8 = r4.l
            r0 = r23
            cf r8 = r0.a(r8)
            r7.h = r8
            cg r7 = r4.j
            int r7 = r7.d
            int r8 = r22.f()
            cg r9 = r4.l
            int r9 = r9.d
            int r8 = r8 - r9
            cg r9 = r4.j
            cf r9 = r9.h
            r0 = r23
            r0.a(r9, r7)
            cg r9 = r4.l
            cf r9 = r9.h
            r0 = r23
            r0.a(r9, r8)
            int r9 = r4.z
            if (r9 > 0) goto L_0x0598
            int r9 = r4.J
            r10 = 8
            if (r9 != r10) goto L_0x05b0
        L_0x0598:
            cg r9 = r4.m
            cg r10 = r4.m
            r0 = r23
            cf r10 = r0.a(r10)
            r9.h = r10
            cg r9 = r4.m
            cf r9 = r9.h
            int r10 = r4.z
            int r10 = r10 + r7
            r0 = r23
            r0.a(r9, r10)
        L_0x05b0:
            r4.c(r7, r8)
            r7 = 2
            r4.b = r7
        L_0x05b6:
            r0 = r23
            r4.a(r0)
            goto L_0x04f8
        L_0x05bd:
            r0 = r22
            int r4 = r0.ak
            if (r4 <= 0) goto L_0x0b63
            r4 = 0
            r16 = r4
        L_0x05c6:
            r0 = r22
            int r4 = r0.ak
            r0 = r16
            if (r0 >= r4) goto L_0x0b63
            r0 = r22
            ch[] r4 = r0.ao
            r20 = r4[r16]
            r0 = r22
            ch[] r6 = r0.aq
            r0 = r22
            ch[] r4 = r0.ao
            r7 = r4[r16]
            r8 = 0
            r0 = r22
            boolean[] r9 = r0.ap
            r4 = r22
            r5 = r23
            int r18 = r4.a(r5, r6, r7, r8, r9)
            r0 = r22
            ch[] r4 = r0.aq
            r5 = 2
            r14 = r4[r5]
            if (r14 == 0) goto L_0x0670
            r0 = r22
            boolean[] r4 = r0.ap
            r5 = 1
            boolean r4 = r4[r5]
            if (r4 == 0) goto L_0x0623
            int r4 = r20.g()
        L_0x0601:
            if (r14 == 0) goto L_0x0670
            cg r5 = r14.i
            cf r5 = r5.h
            r0 = r23
            r0.a(r5, r4)
            ch r5 = r14.aa
            cg r6 = r14.i
            int r6 = r6.b()
            int r7 = r14.c()
            int r6 = r6 + r7
            cg r7 = r14.k
            int r7 = r7.b()
            int r6 = r6 + r7
            int r4 = r4 + r6
            r14 = r5
            goto L_0x0601
        L_0x0623:
            r0 = r20
            int r4 = r0.U
            if (r4 != 0) goto L_0x0676
            r4 = 1
            r12 = r4
        L_0x062b:
            r0 = r20
            int r4 = r0.U
            r5 = 2
            if (r4 != r5) goto L_0x0679
            r4 = 1
            r13 = r4
        L_0x0634:
            r0 = r22
            int r4 = r0.G
            int r5 = defpackage.bg.x
            if (r4 != r5) goto L_0x067c
            r4 = 1
        L_0x063d:
            r0 = r22
            int r5 = r0.ac
            r6 = 2
            if (r5 == r6) goto L_0x064c
            r0 = r22
            int r5 = r0.ac
            r6 = 8
            if (r5 != r6) goto L_0x067e
        L_0x064c:
            r0 = r22
            boolean[] r5 = r0.ap
            r6 = 0
            boolean r5 = r5[r6]
            if (r5 == 0) goto L_0x067e
            r0 = r20
            boolean r5 = r0.W
            if (r5 == 0) goto L_0x067e
            if (r13 != 0) goto L_0x067e
            if (r4 != 0) goto L_0x067e
            r0 = r20
            int r4 = r0.U
            if (r4 != 0) goto L_0x067e
            r0 = r22
            r1 = r23
            r2 = r18
            r3 = r20
            defpackage.gm.a(r0, r1, r2, r3)
        L_0x0670:
            int r4 = r16 + 1
            r16 = r4
            goto L_0x05c6
        L_0x0676:
            r4 = 0
            r12 = r4
            goto L_0x062b
        L_0x0679:
            r4 = 0
            r13 = r4
            goto L_0x0634
        L_0x067c:
            r4 = 0
            goto L_0x063d
        L_0x067e:
            if (r18 == 0) goto L_0x0682
            if (r13 == 0) goto L_0x086e
        L_0x0682:
            r5 = 0
            r8 = 0
            r4 = 0
            r9 = r5
            r19 = r14
        L_0x0688:
            if (r19 == 0) goto L_0x0824
            r0 = r19
            ch r5 = r0.aa
            if (r5 != 0) goto L_0x1147
            r0 = r22
            ch[] r4 = r0.aq
            r6 = 1
            r6 = r4[r6]
            r4 = 1
            r17 = r4
            r18 = r6
        L_0x069c:
            if (r13 == 0) goto L_0x0715
            r0 = r19
            cg r7 = r0.i
            int r4 = r7.b()
            if (r9 == 0) goto L_0x1144
            cg r6 = r9.k
            int r6 = r6.b()
            int r4 = r4 + r6
            r6 = r4
        L_0x06b0:
            r4 = 1
            r0 = r19
            if (r14 == r0) goto L_0x06b6
            r4 = 3
        L_0x06b6:
            cf r8 = r7.h
            cg r9 = r7.c
            cf r9 = r9.h
            r0 = r23
            r0.a(r8, r9, r6, r4)
            r0 = r19
            int r4 = r0.G
            int r6 = defpackage.bg.y
            if (r4 != r6) goto L_0x0713
            r0 = r19
            cg r4 = r0.k
            r0 = r19
            int r6 = r0.c
            r8 = 1
            if (r6 != r8) goto L_0x06f7
            r0 = r19
            int r6 = r0.e
            int r8 = r19.c()
            int r6 = java.lang.Math.max(r6, r8)
            cf r4 = r4.h
            cf r7 = r7.h
            r8 = 3
            r0 = r23
            r0.c(r4, r7, r6, r8)
            r4 = r5
        L_0x06eb:
            if (r17 == 0) goto L_0x06ee
            r4 = 0
        L_0x06ee:
            r8 = r18
            r9 = r19
            r19 = r4
            r4 = r17
            goto L_0x0688
        L_0x06f7:
            cf r6 = r7.h
            cg r8 = r7.c
            cf r8 = r8.h
            int r9 = r7.d
            r10 = 3
            r0 = r23
            r0.a(r6, r8, r9, r10)
            cf r4 = r4.h
            cf r6 = r7.h
            r0 = r19
            int r7 = r0.e
            r8 = 3
            r0 = r23
            r0.b(r4, r6, r7, r8)
        L_0x0713:
            r4 = r5
            goto L_0x06eb
        L_0x0715:
            if (r12 != 0) goto L_0x0758
            if (r17 == 0) goto L_0x0758
            if (r9 == 0) goto L_0x0758
            r0 = r19
            cg r4 = r0.k
            cg r4 = r4.c
            if (r4 != 0) goto L_0x0739
            r0 = r19
            cg r4 = r0.k
            cf r4 = r4.h
            int r6 = r19.g()
            r0 = r19
            int r7 = r0.v
            int r6 = r6 + r7
            r0 = r23
            r0.a(r4, r6)
            r4 = r5
            goto L_0x06eb
        L_0x0739:
            r0 = r19
            cg r4 = r0.k
            int r4 = r4.b()
            r0 = r19
            cg r6 = r0.k
            cf r6 = r6.h
            r0 = r18
            cg r7 = r0.k
            cg r7 = r7.c
            cf r7 = r7.h
            int r4 = -r4
            r8 = 5
            r0 = r23
            r0.c(r6, r7, r4, r8)
            r4 = r5
            goto L_0x06eb
        L_0x0758:
            if (r12 != 0) goto L_0x0797
            if (r17 != 0) goto L_0x0797
            if (r9 != 0) goto L_0x0797
            r0 = r19
            cg r4 = r0.i
            cg r4 = r4.c
            if (r4 != 0) goto L_0x0778
            r0 = r19
            cg r4 = r0.i
            cf r4 = r4.h
            int r6 = r19.g()
            r0 = r23
            r0.a(r4, r6)
            r4 = r5
            goto L_0x06eb
        L_0x0778:
            r0 = r19
            cg r4 = r0.i
            int r4 = r4.b()
            r0 = r19
            cg r6 = r0.i
            cf r6 = r6.h
            r0 = r20
            cg r7 = r0.i
            cg r7 = r7.c
            cf r7 = r7.h
            r8 = 5
            r0 = r23
            r0.c(r6, r7, r4, r8)
            r4 = r5
            goto L_0x06eb
        L_0x0797:
            r0 = r19
            cg r8 = r0.i
            r0 = r19
            cg r10 = r0.k
            int r7 = r8.b()
            int r11 = r10.b()
            cf r4 = r8.h
            cg r6 = r8.c
            cf r6 = r6.h
            r15 = 1
            r0 = r23
            r0.a(r4, r6, r7, r15)
            cf r4 = r10.h
            cg r6 = r10.c
            cf r6 = r6.h
            int r15 = -r11
            r21 = 1
            r0 = r23
            r1 = r21
            r0.b(r4, r6, r15, r1)
            cg r4 = r8.c
            if (r4 == 0) goto L_0x081c
            cg r4 = r8.c
            cf r6 = r4.h
        L_0x07cb:
            if (r9 != 0) goto L_0x07de
            r0 = r20
            cg r4 = r0.i
            cg r4 = r4.c
            if (r4 == 0) goto L_0x081e
            r0 = r20
            cg r4 = r0.i
            cg r4 = r4.c
            cf r4 = r4.h
        L_0x07dd:
            r6 = r4
        L_0x07de:
            if (r5 != 0) goto L_0x1141
            r0 = r18
            cg r4 = r0.k
            cg r4 = r4.c
            if (r4 == 0) goto L_0x0820
            r0 = r18
            cg r4 = r0.k
            cg r4 = r4.c
            ch r4 = r4.a
        L_0x07f0:
            r15 = r4
        L_0x07f1:
            if (r15 == 0) goto L_0x0819
            cg r4 = r15.i
            cf r9 = r4.h
            if (r17 == 0) goto L_0x080a
            r0 = r18
            cg r4 = r0.k
            cg r4 = r4.c
            if (r4 == 0) goto L_0x0822
            r0 = r18
            cg r4 = r0.k
            cg r4 = r4.c
            cf r4 = r4.h
        L_0x0809:
            r9 = r4
        L_0x080a:
            if (r6 == 0) goto L_0x0819
            if (r9 == 0) goto L_0x0819
            cf r5 = r8.h
            r8 = 1056964608(0x3f000000, float:0.5)
            cf r10 = r10.h
            r4 = r23
            r4.a(r5, r6, r7, r8, r9, r10, r11)
        L_0x0819:
            r4 = r15
            goto L_0x06eb
        L_0x081c:
            r6 = 0
            goto L_0x07cb
        L_0x081e:
            r4 = 0
            goto L_0x07dd
        L_0x0820:
            r4 = 0
            goto L_0x07f0
        L_0x0822:
            r4 = 0
            goto L_0x0809
        L_0x0824:
            if (r13 == 0) goto L_0x0670
            cg r4 = r14.i
            cg r10 = r8.k
            int r7 = r4.b()
            int r11 = r10.b()
            r0 = r20
            cg r5 = r0.i
            cg r5 = r5.c
            if (r5 == 0) goto L_0x086a
            r0 = r20
            cg r5 = r0.i
            cg r5 = r5.c
            cf r6 = r5.h
        L_0x0842:
            cg r5 = r8.k
            cg r5 = r5.c
            if (r5 == 0) goto L_0x086c
            cg r5 = r8.k
            cg r5 = r5.c
            cf r9 = r5.h
        L_0x084e:
            if (r6 == 0) goto L_0x0670
            if (r9 == 0) goto L_0x0670
            cf r5 = r10.h
            int r8 = -r11
            r12 = 1
            r0 = r23
            r0.b(r5, r9, r8, r12)
            cf r5 = r4.h
            r0 = r20
            float r8 = r0.E
            cf r10 = r10.h
            r4 = r23
            r4.a(r5, r6, r7, r8, r9, r10, r11)
            goto L_0x0670
        L_0x086a:
            r6 = 0
            goto L_0x0842
        L_0x086c:
            r9 = 0
            goto L_0x084e
        L_0x086e:
            r4 = 0
            r6 = 0
            r5 = r4
            r7 = r14
        L_0x0872:
            if (r7 == 0) goto L_0x093e
            int r4 = r7.G
            int r8 = defpackage.bg.y
            if (r4 == r8) goto L_0x08f7
            cg r4 = r7.i
            int r4 = r4.b()
            if (r5 == 0) goto L_0x0889
            cg r5 = r5.k
            int r5 = r5.b()
            int r4 = r4 + r5
        L_0x0889:
            r5 = 3
            cg r8 = r7.i
            cg r8 = r8.c
            ch r8 = r8.a
            int r8 = r8.G
            int r9 = defpackage.bg.y
            if (r8 != r9) goto L_0x0897
            r5 = 2
        L_0x0897:
            cg r8 = r7.i
            cf r8 = r8.h
            cg r9 = r7.i
            cg r9 = r9.c
            cf r9 = r9.h
            r0 = r23
            r0.a(r8, r9, r4, r5)
            cg r4 = r7.k
            int r4 = r4.b()
            cg r5 = r7.k
            cg r5 = r5.c
            ch r5 = r5.a
            cg r5 = r5.i
            cg r5 = r5.c
            if (r5 == 0) goto L_0x08d3
            cg r5 = r7.k
            cg r5 = r5.c
            ch r5 = r5.a
            cg r5 = r5.i
            cg r5 = r5.c
            ch r5 = r5.a
            if (r5 != r7) goto L_0x08d3
            cg r5 = r7.k
            cg r5 = r5.c
            ch r5 = r5.a
            cg r5 = r5.i
            int r5 = r5.b()
            int r4 = r4 + r5
        L_0x08d3:
            r5 = 3
            cg r8 = r7.k
            cg r8 = r8.c
            ch r8 = r8.a
            int r8 = r8.G
            int r9 = defpackage.bg.y
            if (r8 != r9) goto L_0x08e1
            r5 = 2
        L_0x08e1:
            cg r8 = r7.k
            cf r8 = r8.h
            cg r9 = r7.k
            cg r9 = r9.c
            cf r9 = r9.h
            int r4 = -r4
            r0 = r23
            r0.b(r8, r9, r4, r5)
        L_0x08f1:
            ch r4 = r7.aa
            r5 = r7
            r7 = r4
            goto L_0x0872
        L_0x08f7:
            float r4 = r7.Y
            float r6 = r6 + r4
            r4 = 0
            cg r5 = r7.k
            cg r5 = r5.c
            if (r5 == 0) goto L_0x091d
            cg r4 = r7.k
            int r4 = r4.b()
            r0 = r22
            ch[] r5 = r0.aq
            r8 = 3
            r5 = r5[r8]
            if (r7 == r5) goto L_0x091d
            cg r5 = r7.k
            cg r5 = r5.c
            ch r5 = r5.a
            cg r5 = r5.i
            int r5 = r5.b()
            int r4 = r4 + r5
        L_0x091d:
            cg r5 = r7.k
            cf r5 = r5.h
            cg r8 = r7.i
            cf r8 = r8.h
            r9 = 0
            r10 = 1
            r0 = r23
            r0.a(r5, r8, r9, r10)
            cg r5 = r7.k
            cf r5 = r5.h
            cg r8 = r7.k
            cg r8 = r8.c
            cf r8 = r8.h
            int r4 = -r4
            r9 = 1
            r0 = r23
            r0.b(r5, r8, r4, r9)
            goto L_0x08f1
        L_0x093e:
            r4 = 1
            r0 = r18
            if (r0 != r4) goto L_0x09ed
            r0 = r22
            ch[] r4 = r0.am
            r5 = 0
            r7 = r4[r5]
            cg r4 = r7.i
            int r4 = r4.b()
            cg r5 = r7.i
            cg r5 = r5.c
            if (r5 == 0) goto L_0x095f
            cg r5 = r7.i
            cg r5 = r5.c
            int r5 = r5.b()
            int r4 = r4 + r5
        L_0x095f:
            cg r5 = r7.k
            int r5 = r5.b()
            cg r6 = r7.k
            cg r6 = r6.c
            if (r6 == 0) goto L_0x0974
            cg r6 = r7.k
            cg r6 = r6.c
            int r6 = r6.b()
            int r5 = r5 + r6
        L_0x0974:
            r0 = r20
            cg r6 = r0.k
            cg r6 = r6.c
            cf r6 = r6.h
            r0 = r22
            ch[] r8 = r0.aq
            r9 = 3
            r8 = r8[r9]
            if (r7 != r8) goto L_0x0992
            r0 = r22
            ch[] r6 = r0.aq
            r8 = 1
            r6 = r6[r8]
            cg r6 = r6.k
            cg r6 = r6.c
            cf r6 = r6.h
        L_0x0992:
            int r8 = r7.c
            r9 = 1
            if (r8 != r9) goto L_0x09d0
            r0 = r20
            cg r7 = r0.i
            cf r7 = r7.h
            r0 = r20
            cg r8 = r0.i
            cg r8 = r8.c
            cf r8 = r8.h
            r9 = 1
            r0 = r23
            r0.a(r7, r8, r4, r9)
            r0 = r20
            cg r4 = r0.k
            cf r4 = r4.h
            int r5 = -r5
            r7 = 1
            r0 = r23
            r0.b(r4, r6, r5, r7)
            r0 = r20
            cg r4 = r0.k
            cf r4 = r4.h
            r0 = r20
            cg r5 = r0.i
            cf r5 = r5.h
            int r6 = r20.c()
            r7 = 2
            r0 = r23
            r0.c(r4, r5, r6, r7)
            goto L_0x0670
        L_0x09d0:
            cg r8 = r7.i
            cf r8 = r8.h
            cg r9 = r7.i
            cg r9 = r9.c
            cf r9 = r9.h
            r10 = 1
            r0 = r23
            r0.c(r8, r9, r4, r10)
            cg r4 = r7.k
            cf r4 = r4.h
            int r5 = -r5
            r7 = 1
            r0 = r23
            r0.c(r4, r6, r5, r7)
            goto L_0x0670
        L_0x09ed:
            r4 = 0
            r17 = r4
        L_0x09f0:
            int r4 = r18 + -1
            r0 = r17
            if (r0 >= r4) goto L_0x0670
            r0 = r22
            ch[] r4 = r0.am
            r11 = r4[r17]
            r0 = r22
            ch[] r4 = r0.am
            int r5 = r17 + 1
            r15 = r4[r5]
            cg r4 = r11.i
            cf r8 = r4.h
            cg r4 = r11.k
            cf r10 = r4.h
            cg r4 = r15.i
            cf r12 = r4.h
            cg r4 = r15.k
            cf r14 = r4.h
            r0 = r22
            ch[] r4 = r0.aq
            r5 = 3
            r4 = r4[r5]
            if (r15 != r4) goto L_0x0a28
            r0 = r22
            ch[] r4 = r0.aq
            r5 = 1
            r4 = r4[r5]
            cg r4 = r4.k
            cf r14 = r4.h
        L_0x0a28:
            cg r4 = r11.i
            int r4 = r4.b()
            cg r5 = r11.i
            cg r5 = r5.c
            if (r5 == 0) goto L_0x0a5b
            cg r5 = r11.i
            cg r5 = r5.c
            ch r5 = r5.a
            cg r5 = r5.k
            cg r5 = r5.c
            if (r5 == 0) goto L_0x0a5b
            cg r5 = r11.i
            cg r5 = r5.c
            ch r5 = r5.a
            cg r5 = r5.k
            cg r5 = r5.c
            ch r5 = r5.a
            if (r5 != r11) goto L_0x0a5b
            cg r5 = r11.i
            cg r5 = r5.c
            ch r5 = r5.a
            cg r5 = r5.k
            int r5 = r5.b()
            int r4 = r4 + r5
        L_0x0a5b:
            cg r5 = r11.i
            cg r5 = r5.c
            cf r5 = r5.h
            r7 = 2
            r0 = r23
            r0.a(r8, r5, r4, r7)
            cg r4 = r11.k
            int r5 = r4.b()
            cg r4 = r11.k
            cg r4 = r4.c
            if (r4 == 0) goto L_0x113e
            ch r4 = r11.aa
            if (r4 == 0) goto L_0x113e
            ch r4 = r11.aa
            cg r4 = r4.i
            cg r4 = r4.c
            if (r4 == 0) goto L_0x0b60
            ch r4 = r11.aa
            cg r4 = r4.i
            int r4 = r4.b()
        L_0x0a87:
            int r4 = r4 + r5
        L_0x0a88:
            cg r5 = r11.k
            cg r5 = r5.c
            cf r5 = r5.h
            int r4 = -r4
            r7 = 2
            r0 = r23
            r0.b(r10, r5, r4, r7)
            int r4 = r17 + 1
            int r5 = r18 + -1
            if (r4 != r5) goto L_0x0b22
            cg r4 = r15.i
            int r4 = r4.b()
            cg r5 = r15.i
            cg r5 = r5.c
            if (r5 == 0) goto L_0x0ace
            cg r5 = r15.i
            cg r5 = r5.c
            ch r5 = r5.a
            cg r5 = r5.k
            cg r5 = r5.c
            if (r5 == 0) goto L_0x0ace
            cg r5 = r15.i
            cg r5 = r5.c
            ch r5 = r5.a
            cg r5 = r5.k
            cg r5 = r5.c
            ch r5 = r5.a
            if (r5 != r15) goto L_0x0ace
            cg r5 = r15.i
            cg r5 = r5.c
            ch r5 = r5.a
            cg r5 = r5.k
            int r5 = r5.b()
            int r4 = r4 + r5
        L_0x0ace:
            cg r5 = r15.i
            cg r5 = r5.c
            cf r5 = r5.h
            r7 = 2
            r0 = r23
            r0.a(r12, r5, r4, r7)
            cg r4 = r15.k
            r0 = r22
            ch[] r5 = r0.aq
            r7 = 3
            r5 = r5[r7]
            if (r15 != r5) goto L_0x0aee
            r0 = r22
            ch[] r4 = r0.aq
            r5 = 1
            r4 = r4[r5]
            cg r4 = r4.k
        L_0x0aee:
            int r5 = r4.b()
            cg r7 = r4.c
            if (r7 == 0) goto L_0x0b17
            cg r7 = r4.c
            ch r7 = r7.a
            cg r7 = r7.i
            cg r7 = r7.c
            if (r7 == 0) goto L_0x0b17
            cg r7 = r4.c
            ch r7 = r7.a
            cg r7 = r7.i
            cg r7 = r7.c
            ch r7 = r7.a
            if (r7 != r15) goto L_0x0b17
            cg r7 = r4.c
            ch r7 = r7.a
            cg r7 = r7.i
            int r7 = r7.b()
            int r5 = r5 + r7
        L_0x0b17:
            cg r4 = r4.c
            cf r4 = r4.h
            int r5 = -r5
            r7 = 2
            r0 = r23
            r0.b(r14, r4, r5, r7)
        L_0x0b22:
            r0 = r20
            int r4 = r0.f
            if (r4 <= 0) goto L_0x0b32
            r0 = r20
            int r4 = r0.f
            r5 = 2
            r0 = r23
            r0.b(r10, r8, r4, r5)
        L_0x0b32:
            ca r4 = r23.b()
            float r5 = r11.Y
            float r7 = r15.Y
            cg r9 = r11.i
            int r9 = r9.b()
            cg r11 = r11.k
            int r11 = r11.b()
            cg r13 = r15.i
            int r13 = r13.b()
            cg r15 = r15.k
            int r15 = r15.b()
            r4.a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r0 = r23
            r0.a(r4)
            int r4 = r17 + 1
            r17 = r4
            goto L_0x09f0
        L_0x0b60:
            r4 = 0
            goto L_0x0a87
        L_0x0b63:
            r0 = r22
            int r4 = r0.al
            if (r4 <= 0) goto L_0x112f
            r4 = 0
            r16 = r4
        L_0x0b6c:
            r0 = r22
            int r4 = r0.al
            r0 = r16
            if (r0 >= r4) goto L_0x112f
            r0 = r22
            ch[] r4 = r0.an
            r20 = r4[r16]
            r0 = r22
            ch[] r6 = r0.aq
            r0 = r22
            ch[] r4 = r0.an
            r7 = r4[r16]
            r8 = 1
            r0 = r22
            boolean[] r9 = r0.ap
            r4 = r22
            r5 = r23
            int r18 = r4.a(r5, r6, r7, r8, r9)
            r0 = r22
            ch[] r4 = r0.aq
            r5 = 2
            r14 = r4[r5]
            if (r14 == 0) goto L_0x0c16
            r0 = r22
            boolean[] r4 = r0.ap
            r5 = 1
            boolean r4 = r4[r5]
            if (r4 == 0) goto L_0x0bc9
            int r4 = r20.h()
        L_0x0ba7:
            if (r14 == 0) goto L_0x0c16
            cg r5 = r14.j
            cf r5 = r5.h
            r0 = r23
            r0.a(r5, r4)
            ch r5 = r14.ab
            cg r6 = r14.j
            int r6 = r6.b()
            int r7 = r14.f()
            int r6 = r6 + r7
            cg r7 = r14.l
            int r7 = r7.b()
            int r6 = r6 + r7
            int r4 = r4 + r6
            r14 = r5
            goto L_0x0ba7
        L_0x0bc9:
            r0 = r20
            int r4 = r0.V
            if (r4 != 0) goto L_0x0c1c
            r4 = 1
            r12 = r4
        L_0x0bd1:
            r0 = r20
            int r4 = r0.V
            r5 = 2
            if (r4 != r5) goto L_0x0c1f
            r4 = 1
            r13 = r4
        L_0x0bda:
            r0 = r22
            int r4 = r0.H
            int r5 = defpackage.bg.x
            if (r4 != r5) goto L_0x0c22
            r4 = 1
        L_0x0be3:
            r0 = r22
            int r5 = r0.ac
            r6 = 2
            if (r5 == r6) goto L_0x0bf2
            r0 = r22
            int r5 = r0.ac
            r6 = 8
            if (r5 != r6) goto L_0x0c24
        L_0x0bf2:
            r0 = r22
            boolean[] r5 = r0.ap
            r6 = 0
            boolean r5 = r5[r6]
            if (r5 == 0) goto L_0x0c24
            r0 = r20
            boolean r5 = r0.X
            if (r5 == 0) goto L_0x0c24
            if (r13 != 0) goto L_0x0c24
            if (r4 != 0) goto L_0x0c24
            r0 = r20
            int r4 = r0.V
            if (r4 != 0) goto L_0x0c24
            r0 = r22
            r1 = r23
            r2 = r18
            r3 = r20
            defpackage.gm.b(r0, r1, r2, r3)
        L_0x0c16:
            int r4 = r16 + 1
            r16 = r4
            goto L_0x0b6c
        L_0x0c1c:
            r4 = 0
            r12 = r4
            goto L_0x0bd1
        L_0x0c1f:
            r4 = 0
            r13 = r4
            goto L_0x0bda
        L_0x0c22:
            r4 = 0
            goto L_0x0be3
        L_0x0c24:
            if (r18 == 0) goto L_0x0c28
            if (r13 == 0) goto L_0x0e3a
        L_0x0c28:
            r5 = 0
            r8 = 0
            r4 = 0
            r9 = r5
            r19 = r14
        L_0x0c2e:
            if (r19 == 0) goto L_0x0df0
            r0 = r19
            ch r5 = r0.ab
            if (r5 != 0) goto L_0x1138
            r0 = r22
            ch[] r4 = r0.aq
            r6 = 1
            r6 = r4[r6]
            r4 = 1
            r17 = r4
            r18 = r6
        L_0x0c42:
            if (r13 == 0) goto L_0x0ce0
            r0 = r19
            cg r10 = r0.j
            int r8 = r10.b()
            if (r9 == 0) goto L_0x0c55
            cg r4 = r9.l
            int r4 = r4.b()
            int r8 = r8 + r4
        L_0x0c55:
            r4 = 1
            r0 = r19
            if (r14 == r0) goto L_0x0c5b
            r4 = 3
        L_0x0c5b:
            r7 = 0
            r6 = 0
            cg r9 = r10.c
            if (r9 == 0) goto L_0x0ca6
            cf r7 = r10.h
            cg r6 = r10.c
            cf r6 = r6.h
        L_0x0c67:
            if (r7 == 0) goto L_0x0c70
            if (r6 == 0) goto L_0x0c70
            r0 = r23
            r0.a(r7, r6, r8, r4)
        L_0x0c70:
            r0 = r19
            int r4 = r0.H
            int r6 = defpackage.bg.y
            if (r4 != r6) goto L_0x0cde
            r0 = r19
            cg r4 = r0.l
            r0 = r19
            int r6 = r0.d
            r7 = 1
            if (r6 != r7) goto L_0x0cc2
            r0 = r19
            int r6 = r0.g
            int r7 = r19.f()
            int r6 = java.lang.Math.max(r6, r7)
            cf r4 = r4.h
            cf r7 = r10.h
            r8 = 3
            r0 = r23
            r0.c(r4, r7, r6, r8)
            r4 = r5
        L_0x0c9a:
            if (r17 == 0) goto L_0x0c9d
            r4 = 0
        L_0x0c9d:
            r8 = r18
            r9 = r19
            r19 = r4
            r4 = r17
            goto L_0x0c2e
        L_0x0ca6:
            r0 = r19
            cg r9 = r0.m
            cg r9 = r9.c
            if (r9 == 0) goto L_0x0c67
            r0 = r19
            cg r6 = r0.m
            cf r7 = r6.h
            r0 = r19
            cg r6 = r0.m
            cg r6 = r6.c
            cf r6 = r6.h
            int r9 = r10.b()
            int r8 = r8 - r9
            goto L_0x0c67
        L_0x0cc2:
            cf r6 = r10.h
            cg r7 = r10.c
            cf r7 = r7.h
            int r8 = r10.d
            r9 = 3
            r0 = r23
            r0.a(r6, r7, r8, r9)
            cf r4 = r4.h
            cf r6 = r10.h
            r0 = r19
            int r7 = r0.g
            r8 = 3
            r0 = r23
            r0.b(r4, r6, r7, r8)
        L_0x0cde:
            r4 = r5
            goto L_0x0c9a
        L_0x0ce0:
            if (r12 != 0) goto L_0x0d24
            if (r17 == 0) goto L_0x0d24
            if (r9 == 0) goto L_0x0d24
            r0 = r19
            cg r4 = r0.l
            cg r4 = r4.c
            if (r4 != 0) goto L_0x0d04
            r0 = r19
            cg r4 = r0.l
            cf r4 = r4.h
            int r6 = r19.h()
            r0 = r19
            int r7 = r0.w
            int r6 = r6 + r7
            r0 = r23
            r0.a(r4, r6)
            r4 = r5
            goto L_0x0c9a
        L_0x0d04:
            r0 = r19
            cg r4 = r0.l
            int r4 = r4.b()
            r0 = r19
            cg r6 = r0.l
            cf r6 = r6.h
            r0 = r18
            cg r7 = r0.l
            cg r7 = r7.c
            cf r7 = r7.h
            int r4 = -r4
            r8 = 5
            r0 = r23
            r0.c(r6, r7, r4, r8)
            r4 = r5
            goto L_0x0c9a
        L_0x0d24:
            if (r12 != 0) goto L_0x0d63
            if (r17 != 0) goto L_0x0d63
            if (r9 != 0) goto L_0x0d63
            r0 = r19
            cg r4 = r0.j
            cg r4 = r4.c
            if (r4 != 0) goto L_0x0d44
            r0 = r19
            cg r4 = r0.j
            cf r4 = r4.h
            int r6 = r19.h()
            r0 = r23
            r0.a(r4, r6)
            r4 = r5
            goto L_0x0c9a
        L_0x0d44:
            r0 = r19
            cg r4 = r0.j
            int r4 = r4.b()
            r0 = r19
            cg r6 = r0.j
            cf r6 = r6.h
            r0 = r20
            cg r7 = r0.j
            cg r7 = r7.c
            cf r7 = r7.h
            r8 = 5
            r0 = r23
            r0.c(r6, r7, r4, r8)
            r4 = r5
            goto L_0x0c9a
        L_0x0d63:
            r0 = r19
            cg r8 = r0.j
            r0 = r19
            cg r10 = r0.l
            int r7 = r8.b()
            int r11 = r10.b()
            cf r4 = r8.h
            cg r6 = r8.c
            cf r6 = r6.h
            r15 = 1
            r0 = r23
            r0.a(r4, r6, r7, r15)
            cf r4 = r10.h
            cg r6 = r10.c
            cf r6 = r6.h
            int r15 = -r11
            r21 = 1
            r0 = r23
            r1 = r21
            r0.b(r4, r6, r15, r1)
            cg r4 = r8.c
            if (r4 == 0) goto L_0x0de8
            cg r4 = r8.c
            cf r6 = r4.h
        L_0x0d97:
            if (r9 != 0) goto L_0x0daa
            r0 = r20
            cg r4 = r0.j
            cg r4 = r4.c
            if (r4 == 0) goto L_0x0dea
            r0 = r20
            cg r4 = r0.j
            cg r4 = r4.c
            cf r4 = r4.h
        L_0x0da9:
            r6 = r4
        L_0x0daa:
            if (r5 != 0) goto L_0x1135
            r0 = r18
            cg r4 = r0.l
            cg r4 = r4.c
            if (r4 == 0) goto L_0x0dec
            r0 = r18
            cg r4 = r0.l
            cg r4 = r4.c
            ch r4 = r4.a
        L_0x0dbc:
            r15 = r4
        L_0x0dbd:
            if (r15 == 0) goto L_0x0de5
            cg r4 = r15.j
            cf r9 = r4.h
            if (r17 == 0) goto L_0x0dd6
            r0 = r18
            cg r4 = r0.l
            cg r4 = r4.c
            if (r4 == 0) goto L_0x0dee
            r0 = r18
            cg r4 = r0.l
            cg r4 = r4.c
            cf r4 = r4.h
        L_0x0dd5:
            r9 = r4
        L_0x0dd6:
            if (r6 == 0) goto L_0x0de5
            if (r9 == 0) goto L_0x0de5
            cf r5 = r8.h
            r8 = 1056964608(0x3f000000, float:0.5)
            cf r10 = r10.h
            r4 = r23
            r4.a(r5, r6, r7, r8, r9, r10, r11)
        L_0x0de5:
            r4 = r15
            goto L_0x0c9a
        L_0x0de8:
            r6 = 0
            goto L_0x0d97
        L_0x0dea:
            r4 = 0
            goto L_0x0da9
        L_0x0dec:
            r4 = 0
            goto L_0x0dbc
        L_0x0dee:
            r4 = 0
            goto L_0x0dd5
        L_0x0df0:
            if (r13 == 0) goto L_0x0c16
            cg r4 = r14.j
            cg r10 = r8.l
            int r7 = r4.b()
            int r11 = r10.b()
            r0 = r20
            cg r5 = r0.j
            cg r5 = r5.c
            if (r5 == 0) goto L_0x0e36
            r0 = r20
            cg r5 = r0.j
            cg r5 = r5.c
            cf r6 = r5.h
        L_0x0e0e:
            cg r5 = r8.l
            cg r5 = r5.c
            if (r5 == 0) goto L_0x0e38
            cg r5 = r8.l
            cg r5 = r5.c
            cf r9 = r5.h
        L_0x0e1a:
            if (r6 == 0) goto L_0x0c16
            if (r9 == 0) goto L_0x0c16
            cf r5 = r10.h
            int r8 = -r11
            r12 = 1
            r0 = r23
            r0.b(r5, r9, r8, r12)
            cf r5 = r4.h
            r0 = r20
            float r8 = r0.F
            cf r10 = r10.h
            r4 = r23
            r4.a(r5, r6, r7, r8, r9, r10, r11)
            goto L_0x0c16
        L_0x0e36:
            r6 = 0
            goto L_0x0e0e
        L_0x0e38:
            r9 = 0
            goto L_0x0e1a
        L_0x0e3a:
            r4 = 0
            r6 = 0
            r5 = r4
            r7 = r14
        L_0x0e3e:
            if (r7 == 0) goto L_0x0f0a
            int r4 = r7.H
            int r8 = defpackage.bg.y
            if (r4 == r8) goto L_0x0ec3
            cg r4 = r7.j
            int r4 = r4.b()
            if (r5 == 0) goto L_0x0e55
            cg r5 = r5.l
            int r5 = r5.b()
            int r4 = r4 + r5
        L_0x0e55:
            r5 = 3
            cg r8 = r7.j
            cg r8 = r8.c
            ch r8 = r8.a
            int r8 = r8.H
            int r9 = defpackage.bg.y
            if (r8 != r9) goto L_0x0e63
            r5 = 2
        L_0x0e63:
            cg r8 = r7.j
            cf r8 = r8.h
            cg r9 = r7.j
            cg r9 = r9.c
            cf r9 = r9.h
            r0 = r23
            r0.a(r8, r9, r4, r5)
            cg r4 = r7.l
            int r4 = r4.b()
            cg r5 = r7.l
            cg r5 = r5.c
            ch r5 = r5.a
            cg r5 = r5.j
            cg r5 = r5.c
            if (r5 == 0) goto L_0x0e9f
            cg r5 = r7.l
            cg r5 = r5.c
            ch r5 = r5.a
            cg r5 = r5.j
            cg r5 = r5.c
            ch r5 = r5.a
            if (r5 != r7) goto L_0x0e9f
            cg r5 = r7.l
            cg r5 = r5.c
            ch r5 = r5.a
            cg r5 = r5.j
            int r5 = r5.b()
            int r4 = r4 + r5
        L_0x0e9f:
            r5 = 3
            cg r8 = r7.l
            cg r8 = r8.c
            ch r8 = r8.a
            int r8 = r8.H
            int r9 = defpackage.bg.y
            if (r8 != r9) goto L_0x0ead
            r5 = 2
        L_0x0ead:
            cg r8 = r7.l
            cf r8 = r8.h
            cg r9 = r7.l
            cg r9 = r9.c
            cf r9 = r9.h
            int r4 = -r4
            r0 = r23
            r0.b(r8, r9, r4, r5)
        L_0x0ebd:
            ch r4 = r7.ab
            r5 = r7
            r7 = r4
            goto L_0x0e3e
        L_0x0ec3:
            float r4 = r7.Z
            float r6 = r6 + r4
            r4 = 0
            cg r5 = r7.l
            cg r5 = r5.c
            if (r5 == 0) goto L_0x0ee9
            cg r4 = r7.l
            int r4 = r4.b()
            r0 = r22
            ch[] r5 = r0.aq
            r8 = 3
            r5 = r5[r8]
            if (r7 == r5) goto L_0x0ee9
            cg r5 = r7.l
            cg r5 = r5.c
            ch r5 = r5.a
            cg r5 = r5.j
            int r5 = r5.b()
            int r4 = r4 + r5
        L_0x0ee9:
            cg r5 = r7.l
            cf r5 = r5.h
            cg r8 = r7.j
            cf r8 = r8.h
            r9 = 0
            r10 = 1
            r0 = r23
            r0.a(r5, r8, r9, r10)
            cg r5 = r7.l
            cf r5 = r5.h
            cg r8 = r7.l
            cg r8 = r8.c
            cf r8 = r8.h
            int r4 = -r4
            r9 = 1
            r0 = r23
            r0.b(r5, r8, r4, r9)
            goto L_0x0ebd
        L_0x0f0a:
            r4 = 1
            r0 = r18
            if (r0 != r4) goto L_0x0fb9
            r0 = r22
            ch[] r4 = r0.am
            r5 = 0
            r7 = r4[r5]
            cg r4 = r7.j
            int r4 = r4.b()
            cg r5 = r7.j
            cg r5 = r5.c
            if (r5 == 0) goto L_0x0f2b
            cg r5 = r7.j
            cg r5 = r5.c
            int r5 = r5.b()
            int r4 = r4 + r5
        L_0x0f2b:
            cg r5 = r7.l
            int r5 = r5.b()
            cg r6 = r7.l
            cg r6 = r6.c
            if (r6 == 0) goto L_0x0f40
            cg r6 = r7.l
            cg r6 = r6.c
            int r6 = r6.b()
            int r5 = r5 + r6
        L_0x0f40:
            r0 = r20
            cg r6 = r0.l
            cg r6 = r6.c
            cf r6 = r6.h
            r0 = r22
            ch[] r8 = r0.aq
            r9 = 3
            r8 = r8[r9]
            if (r7 != r8) goto L_0x0f5e
            r0 = r22
            ch[] r6 = r0.aq
            r8 = 1
            r6 = r6[r8]
            cg r6 = r6.l
            cg r6 = r6.c
            cf r6 = r6.h
        L_0x0f5e:
            int r8 = r7.d
            r9 = 1
            if (r8 != r9) goto L_0x0f9c
            r0 = r20
            cg r7 = r0.j
            cf r7 = r7.h
            r0 = r20
            cg r8 = r0.j
            cg r8 = r8.c
            cf r8 = r8.h
            r9 = 1
            r0 = r23
            r0.a(r7, r8, r4, r9)
            r0 = r20
            cg r4 = r0.l
            cf r4 = r4.h
            int r5 = -r5
            r7 = 1
            r0 = r23
            r0.b(r4, r6, r5, r7)
            r0 = r20
            cg r4 = r0.l
            cf r4 = r4.h
            r0 = r20
            cg r5 = r0.j
            cf r5 = r5.h
            int r6 = r20.f()
            r7 = 2
            r0 = r23
            r0.c(r4, r5, r6, r7)
            goto L_0x0c16
        L_0x0f9c:
            cg r8 = r7.j
            cf r8 = r8.h
            cg r9 = r7.j
            cg r9 = r9.c
            cf r9 = r9.h
            r10 = 1
            r0 = r23
            r0.c(r8, r9, r4, r10)
            cg r4 = r7.l
            cf r4 = r4.h
            int r5 = -r5
            r7 = 1
            r0 = r23
            r0.c(r4, r6, r5, r7)
            goto L_0x0c16
        L_0x0fb9:
            r4 = 0
            r17 = r4
        L_0x0fbc:
            int r4 = r18 + -1
            r0 = r17
            if (r0 >= r4) goto L_0x0c16
            r0 = r22
            ch[] r4 = r0.am
            r11 = r4[r17]
            r0 = r22
            ch[] r4 = r0.am
            int r5 = r17 + 1
            r15 = r4[r5]
            cg r4 = r11.j
            cf r8 = r4.h
            cg r4 = r11.l
            cf r10 = r4.h
            cg r4 = r15.j
            cf r12 = r4.h
            cg r4 = r15.l
            cf r14 = r4.h
            r0 = r22
            ch[] r4 = r0.aq
            r5 = 3
            r4 = r4[r5]
            if (r15 != r4) goto L_0x0ff4
            r0 = r22
            ch[] r4 = r0.aq
            r5 = 1
            r4 = r4[r5]
            cg r4 = r4.l
            cf r14 = r4.h
        L_0x0ff4:
            cg r4 = r11.j
            int r4 = r4.b()
            cg r5 = r11.j
            cg r5 = r5.c
            if (r5 == 0) goto L_0x1027
            cg r5 = r11.j
            cg r5 = r5.c
            ch r5 = r5.a
            cg r5 = r5.l
            cg r5 = r5.c
            if (r5 == 0) goto L_0x1027
            cg r5 = r11.j
            cg r5 = r5.c
            ch r5 = r5.a
            cg r5 = r5.l
            cg r5 = r5.c
            ch r5 = r5.a
            if (r5 != r11) goto L_0x1027
            cg r5 = r11.j
            cg r5 = r5.c
            ch r5 = r5.a
            cg r5 = r5.l
            int r5 = r5.b()
            int r4 = r4 + r5
        L_0x1027:
            cg r5 = r11.j
            cg r5 = r5.c
            cf r5 = r5.h
            r7 = 2
            r0 = r23
            r0.a(r8, r5, r4, r7)
            cg r4 = r11.l
            int r5 = r4.b()
            cg r4 = r11.l
            cg r4 = r4.c
            if (r4 == 0) goto L_0x1132
            ch r4 = r11.ab
            if (r4 == 0) goto L_0x1132
            ch r4 = r11.ab
            cg r4 = r4.j
            cg r4 = r4.c
            if (r4 == 0) goto L_0x112c
            ch r4 = r11.ab
            cg r4 = r4.j
            int r4 = r4.b()
        L_0x1053:
            int r4 = r4 + r5
        L_0x1054:
            cg r5 = r11.l
            cg r5 = r5.c
            cf r5 = r5.h
            int r4 = -r4
            r7 = 2
            r0 = r23
            r0.b(r10, r5, r4, r7)
            int r4 = r17 + 1
            int r5 = r18 + -1
            if (r4 != r5) goto L_0x10ee
            cg r4 = r15.j
            int r4 = r4.b()
            cg r5 = r15.j
            cg r5 = r5.c
            if (r5 == 0) goto L_0x109a
            cg r5 = r15.j
            cg r5 = r5.c
            ch r5 = r5.a
            cg r5 = r5.l
            cg r5 = r5.c
            if (r5 == 0) goto L_0x109a
            cg r5 = r15.j
            cg r5 = r5.c
            ch r5 = r5.a
            cg r5 = r5.l
            cg r5 = r5.c
            ch r5 = r5.a
            if (r5 != r15) goto L_0x109a
            cg r5 = r15.j
            cg r5 = r5.c
            ch r5 = r5.a
            cg r5 = r5.l
            int r5 = r5.b()
            int r4 = r4 + r5
        L_0x109a:
            cg r5 = r15.j
            cg r5 = r5.c
            cf r5 = r5.h
            r7 = 2
            r0 = r23
            r0.a(r12, r5, r4, r7)
            cg r4 = r15.l
            r0 = r22
            ch[] r5 = r0.aq
            r7 = 3
            r5 = r5[r7]
            if (r15 != r5) goto L_0x10ba
            r0 = r22
            ch[] r4 = r0.aq
            r5 = 1
            r4 = r4[r5]
            cg r4 = r4.l
        L_0x10ba:
            int r5 = r4.b()
            cg r7 = r4.c
            if (r7 == 0) goto L_0x10e3
            cg r7 = r4.c
            ch r7 = r7.a
            cg r7 = r7.j
            cg r7 = r7.c
            if (r7 == 0) goto L_0x10e3
            cg r7 = r4.c
            ch r7 = r7.a
            cg r7 = r7.j
            cg r7 = r7.c
            ch r7 = r7.a
            if (r7 != r15) goto L_0x10e3
            cg r7 = r4.c
            ch r7 = r7.a
            cg r7 = r7.j
            int r7 = r7.b()
            int r5 = r5 + r7
        L_0x10e3:
            cg r4 = r4.c
            cf r4 = r4.h
            int r5 = -r5
            r7 = 2
            r0 = r23
            r0.b(r14, r4, r5, r7)
        L_0x10ee:
            r0 = r20
            int r4 = r0.h
            if (r4 <= 0) goto L_0x10fe
            r0 = r20
            int r4 = r0.h
            r5 = 2
            r0 = r23
            r0.b(r10, r8, r4, r5)
        L_0x10fe:
            ca r4 = r23.b()
            float r5 = r11.Z
            float r7 = r15.Z
            cg r9 = r11.j
            int r9 = r9.b()
            cg r11 = r11.l
            int r11 = r11.b()
            cg r13 = r15.j
            int r13 = r13.b()
            cg r15 = r15.l
            int r15 = r15.b()
            r4.a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r0 = r23
            r0.a(r4)
            int r4 = r17 + 1
            r17 = r4
            goto L_0x0fbc
        L_0x112c:
            r4 = 0
            goto L_0x1053
        L_0x112f:
            r4 = 1
            goto L_0x04b8
        L_0x1132:
            r4 = r5
            goto L_0x1054
        L_0x1135:
            r15 = r5
            goto L_0x0dbd
        L_0x1138:
            r17 = r4
            r18 = r8
            goto L_0x0c42
        L_0x113e:
            r4 = r5
            goto L_0x0a88
        L_0x1141:
            r15 = r5
            goto L_0x07f1
        L_0x1144:
            r6 = r4
            goto L_0x06b0
        L_0x1147:
            r17 = r4
            r18 = r8
            goto L_0x069c
        L_0x114d:
            r5 = r10
            goto L_0x04bd
        L_0x1150:
            r4 = r6
            goto L_0x04ab
        L_0x1153:
            r4 = r9
            goto L_0x047e
        L_0x1156:
            r4 = r8
            goto L_0x0096
        L_0x1159:
            r5 = r7
            goto L_0x008f
        L_0x115c:
            r12 = r8
            r13 = r7
            goto L_0x0056
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ci.b(cd):boolean");
    }

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
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void o() {
        /*
            r24 = this;
            r0 = r24
            int r12 = r0.t
            r0 = r24
            int r13 = r0.u
            r2 = 0
            int r3 = r24.c()
            int r14 = java.lang.Math.max(r2, r3)
            r2 = 0
            int r3 = r24.f()
            int r15 = java.lang.Math.max(r2, r3)
            r2 = 0
            r0 = r24
            r0.ad = r2
            r2 = 0
            r0 = r24
            r0.ae = r2
            r0 = r24
            ch r2 = r0.o
            if (r2 == 0) goto L_0x01f5
            r0 = r24
            cl r2 = r0.ah
            if (r2 != 0) goto L_0x003b
            cl r2 = new cl
            r0 = r24
            r2.<init>(r0)
            r0 = r24
            r0.ah = r2
        L_0x003b:
            r0 = r24
            cl r4 = r0.ah
            r0 = r24
            int r2 = r0.t
            r4.a = r2
            r0 = r24
            int r2 = r0.u
            r4.b = r2
            int r2 = r24.c()
            r4.c = r2
            int r2 = r24.f()
            r4.d = r2
            java.util.ArrayList r2 = r4.e
            int r5 = r2.size()
            r2 = 0
            r3 = r2
        L_0x005f:
            if (r3 >= r5) goto L_0x00a5
            java.util.ArrayList r2 = r4.e
            java.lang.Object r2 = r2.get(r3)
            cm r2 = (defpackage.cm) r2
            cg r6 = r2.a
            int r6 = r6.b
            r0 = r24
            cg r6 = r0.e(r6)
            r2.a = r6
            cg r6 = r2.a
            if (r6 == 0) goto L_0x0097
            cg r6 = r2.a
            cg r6 = r6.c
            r2.b = r6
            cg r6 = r2.a
            int r6 = r6.b()
            r2.c = r6
            cg r6 = r2.a
            int r6 = r6.e
            r2.d = r6
            cg r6 = r2.a
            int r6 = r6.g
            r2.e = r6
        L_0x0093:
            int r2 = r3 + 1
            r3 = r2
            goto L_0x005f
        L_0x0097:
            r6 = 0
            r2.b = r6
            r6 = 0
            r2.c = r6
            int r6 = defpackage.bg.m
            r2.d = r6
            r6 = 0
            r2.e = r6
            goto L_0x0093
        L_0x00a5:
            r2 = 0
            r0 = r24
            r0.t = r2
            r2 = 0
            r0 = r24
            r0.u = r2
            r2 = 0
            r0 = r24
            java.util.ArrayList r3 = r0.n
            int r4 = r3.size()
            r3 = r2
        L_0x00b9:
            if (r3 >= r4) goto L_0x00cc
            r0 = r24
            java.util.ArrayList r2 = r0.n
            java.lang.Object r2 = r2.get(r3)
            cg r2 = (defpackage.cg) r2
            r2.c()
            int r2 = r3 + 1
            r3 = r2
            goto L_0x00b9
        L_0x00cc:
            r0 = r24
            cd r2 = r0.ag
            cb r2 = r2.e
            r0 = r24
            r0.a(r2)
        L_0x00d7:
            r2 = 0
            r0 = r24
            int r0 = r0.H
            r16 = r0
            r0 = r24
            int r0 = r0.G
            r17 = r0
            r0 = r24
            int r3 = r0.ac
            r4 = 2
            if (r3 != r4) goto L_0x02f8
            r0 = r24
            int r3 = r0.H
            int r4 = defpackage.bg.x
            if (r3 == r4) goto L_0x00fb
            r0 = r24
            int r3 = r0.G
            int r4 = defpackage.bg.x
            if (r3 != r4) goto L_0x02f8
        L_0x00fb:
            r0 = r24
            java.util.ArrayList r0 = r0.af
            r18 = r0
            r0 = r24
            boolean[] r0 = r0.ap
            r19 = r0
            r10 = 0
            r9 = 0
            r8 = 0
            r7 = 0
            r6 = 0
            r5 = 0
            int r20 = r18.size()
            r2 = 0
            r3 = 1
            r19[r2] = r3
            r2 = 0
            r11 = r2
        L_0x0117:
            r0 = r20
            if (r11 >= r0) goto L_0x0201
            r0 = r18
            java.lang.Object r2 = r0.get(r11)
            ch r2 = (defpackage.ch) r2
            boolean r3 = r2.b()
            if (r3 != 0) goto L_0x05a0
            boolean r3 = r2.S
            if (r3 != 0) goto L_0x0134
            r0 = r24
            r1 = r19
            r0.a(r2, r1)
        L_0x0134:
            boolean r3 = r2.T
            if (r3 != 0) goto L_0x013f
            r0 = r24
            r1 = r19
            r0.b(r2, r1)
        L_0x013f:
            r3 = 0
            boolean r3 = r19[r3]
            if (r3 == 0) goto L_0x024d
            int r3 = r2.L
            int r4 = r2.M
            int r3 = r3 + r4
            int r4 = r2.c()
            int r3 = r3 - r4
            int r4 = r2.K
            int r0 = r2.N
            r21 = r0
            int r4 = r4 + r21
            int r21 = r2.f()
            int r4 = r4 - r21
            int r0 = r2.G
            r21 = r0
            int r22 = defpackage.bg.z
            r0 = r21
            r1 = r22
            if (r0 != r1) goto L_0x0184
            int r3 = r2.c()
            cg r0 = r2.i
            r21 = r0
            r0 = r21
            int r0 = r0.d
            r21 = r0
            int r3 = r3 + r21
            cg r0 = r2.k
            r21 = r0
            r0 = r21
            int r0 = r0.d
            r21 = r0
            int r3 = r3 + r21
        L_0x0184:
            int r0 = r2.H
            r21 = r0
            int r22 = defpackage.bg.z
            r0 = r21
            r1 = r22
            if (r0 != r1) goto L_0x01ac
            int r4 = r2.f()
            cg r0 = r2.j
            r21 = r0
            r0 = r21
            int r0 = r0.d
            r21 = r0
            int r4 = r4 + r21
            cg r0 = r2.l
            r21 = r0
            r0 = r21
            int r0 = r0.d
            r21 = r0
            int r4 = r4 + r21
        L_0x01ac:
            int r0 = r2.J
            r21 = r0
            r22 = 8
            r0 = r21
            r1 = r22
            if (r0 != r1) goto L_0x01ba
            r3 = 0
            r4 = 0
        L_0x01ba:
            int r0 = r2.L
            r21 = r0
            r0 = r21
            int r9 = java.lang.Math.max(r9, r0)
            int r0 = r2.M
            r21 = r0
            r0 = r21
            int r8 = java.lang.Math.max(r8, r0)
            int r0 = r2.N
            r21 = r0
            r0 = r21
            int r7 = java.lang.Math.max(r7, r0)
            int r2 = r2.K
            int r10 = java.lang.Math.max(r10, r2)
            int r3 = java.lang.Math.max(r6, r3)
            int r2 = java.lang.Math.max(r5, r4)
            r4 = r7
            r5 = r8
            r6 = r9
            r7 = r10
        L_0x01ea:
            int r8 = r11 + 1
            r11 = r8
            r9 = r6
            r10 = r7
            r7 = r4
            r8 = r5
            r6 = r3
            r5 = r2
            goto L_0x0117
        L_0x01f5:
            r2 = 0
            r0 = r24
            r0.t = r2
            r2 = 0
            r0 = r24
            r0.u = r2
            goto L_0x00d7
        L_0x0201:
            int r2 = java.lang.Math.max(r9, r8)
            r0 = r24
            int r3 = r0.A
            int r2 = java.lang.Math.max(r2, r6)
            int r2 = java.lang.Math.max(r3, r2)
            r0 = r24
            r0.ai = r2
            int r2 = java.lang.Math.max(r10, r7)
            r0 = r24
            int r3 = r0.B
            int r2 = java.lang.Math.max(r2, r5)
            int r2 = java.lang.Math.max(r3, r2)
            r0 = r24
            r0.aj = r2
            r2 = 0
            r3 = r2
        L_0x022b:
            r0 = r20
            if (r3 >= r0) goto L_0x024d
            r0 = r18
            java.lang.Object r2 = r0.get(r3)
            ch r2 = (defpackage.ch) r2
            r4 = 0
            r2.S = r4
            r4 = 0
            r2.T = r4
            r4 = 0
            r2.O = r4
            r4 = 0
            r2.P = r4
            r4 = 0
            r2.Q = r4
            r4 = 0
            r2.R = r4
            int r2 = r3 + 1
            r3 = r2
            goto L_0x022b
        L_0x024d:
            r0 = r24
            boolean[] r2 = r0.ap
            r3 = 0
            boolean r2 = r2[r3]
            if (r14 <= 0) goto L_0x0265
            if (r15 <= 0) goto L_0x0265
            r0 = r24
            int r3 = r0.ai
            if (r3 > r14) goto L_0x0264
            r0 = r24
            int r3 = r0.aj
            if (r3 <= r15) goto L_0x0265
        L_0x0264:
            r2 = 0
        L_0x0265:
            if (r2 == 0) goto L_0x02f8
            r0 = r24
            int r3 = r0.G
            int r4 = defpackage.bg.x
            if (r3 != r4) goto L_0x0287
            int r3 = defpackage.bg.w
            r0 = r24
            r0.G = r3
            if (r14 <= 0) goto L_0x02d5
            r0 = r24
            int r3 = r0.ai
            if (r14 >= r3) goto L_0x02d5
            r3 = 1
            r0 = r24
            r0.ad = r3
            r0 = r24
            r0.a(r14)
        L_0x0287:
            r0 = r24
            int r3 = r0.H
            int r4 = defpackage.bg.x
            if (r3 != r4) goto L_0x02f8
            int r3 = defpackage.bg.w
            r0 = r24
            r0.H = r3
            if (r15 <= 0) goto L_0x02e7
            r0 = r24
            int r3 = r0.aj
            if (r15 >= r3) goto L_0x02e7
            r3 = 1
            r0 = r24
            r0.ae = r3
            r0 = r24
            r0.b(r15)
            r3 = r2
        L_0x02a8:
            r2 = 0
            r0 = r24
            r0.ak = r2
            r2 = 0
            r0 = r24
            r0.al = r2
            r0 = r24
            java.util.ArrayList r2 = r0.af
            int r8 = r2.size()
            r2 = 0
            r4 = r2
        L_0x02bc:
            if (r4 >= r8) goto L_0x02fa
            r0 = r24
            java.util.ArrayList r2 = r0.af
            java.lang.Object r2 = r2.get(r4)
            ch r2 = (defpackage.ch) r2
            boolean r5 = r2 instanceof defpackage.cn
            if (r5 == 0) goto L_0x02d1
            cn r2 = (defpackage.cn) r2
            r2.o()
        L_0x02d1:
            int r2 = r4 + 1
            r4 = r2
            goto L_0x02bc
        L_0x02d5:
            r0 = r24
            int r3 = r0.A
            r0 = r24
            int r4 = r0.ai
            int r3 = java.lang.Math.max(r3, r4)
            r0 = r24
            r0.a(r3)
            goto L_0x0287
        L_0x02e7:
            r0 = r24
            int r3 = r0.B
            r0 = r24
            int r4 = r0.aj
            int r3 = java.lang.Math.max(r3, r4)
            r0 = r24
            r0.b(r3)
        L_0x02f8:
            r3 = r2
            goto L_0x02a8
        L_0x02fa:
            r4 = 1
            r2 = 0
            r9 = r3
            r3 = r4
        L_0x02fe:
            if (r3 == 0) goto L_0x04d1
            int r4 = r2 + 1
            r0 = r24
            cd r2 = r0.ag     // Catch:{ Exception -> 0x0336 }
            r2.a()     // Catch:{ Exception -> 0x0336 }
            r0 = r24
            cd r2 = r0.ag     // Catch:{ Exception -> 0x0336 }
            r0 = r24
            boolean r3 = r0.b(r2)     // Catch:{ Exception -> 0x0336 }
            if (r3 == 0) goto L_0x033c
            r0 = r24
            cd r5 = r0.ag     // Catch:{ Exception -> 0x0336 }
            cc r2 = r5.a     // Catch:{ Exception -> 0x0336 }
            r2.a(r5)     // Catch:{ Exception -> 0x0336 }
            r5.b(r2)     // Catch:{ Exception -> 0x0336 }
            r5.a(r2)     // Catch:{ Exception -> 0x0336 }
            r2 = 0
        L_0x0325:
            int r6 = r5.d     // Catch:{ Exception -> 0x0336 }
            if (r2 >= r6) goto L_0x033c
            ca[] r6 = r5.b     // Catch:{ Exception -> 0x0336 }
            r6 = r6[r2]     // Catch:{ Exception -> 0x0336 }
            cf r7 = r6.a     // Catch:{ Exception -> 0x0336 }
            float r6 = r6.b     // Catch:{ Exception -> 0x0336 }
            r7.d = r6     // Catch:{ Exception -> 0x0336 }
            int r2 = r2 + 1
            goto L_0x0325
        L_0x0336:
            r2 = move-exception
            czb r5 = defpackage.cza.a
            r5.a(r2)
        L_0x033c:
            if (r3 == 0) goto L_0x038a
            r0 = r24
            boolean[] r5 = r0.ap
            r2 = 2
            r3 = 0
            r5[r2] = r3
            r24.n()
            r0 = r24
            java.util.ArrayList r2 = r0.af
            int r6 = r2.size()
            r2 = 0
            r3 = r2
        L_0x0353:
            if (r3 >= r6) goto L_0x03b1
            r0 = r24
            java.util.ArrayList r2 = r0.af
            java.lang.Object r2 = r2.get(r3)
            ch r2 = (defpackage.ch) r2
            r2.n()
            int r7 = r2.G
            int r10 = defpackage.bg.y
            if (r7 != r10) goto L_0x0374
            int r7 = r2.c()
            int r10 = r2.C
            if (r7 >= r10) goto L_0x0374
            r7 = 2
            r10 = 1
            r5[r7] = r10
        L_0x0374:
            int r7 = r2.H
            int r10 = defpackage.bg.y
            if (r7 != r10) goto L_0x0386
            int r7 = r2.f()
            int r2 = r2.D
            if (r7 >= r2) goto L_0x0386
            r2 = 2
            r7 = 1
            r5[r2] = r7
        L_0x0386:
            int r2 = r3 + 1
            r3 = r2
            goto L_0x0353
        L_0x038a:
            r24.n()
            r2 = 0
            r3 = r2
        L_0x038f:
            if (r3 >= r8) goto L_0x03b1
            r0 = r24
            java.util.ArrayList r2 = r0.af
            java.lang.Object r2 = r2.get(r3)
            ch r2 = (defpackage.ch) r2
            int r5 = r2.G
            int r6 = defpackage.bg.y
            if (r5 != r6) goto L_0x03eb
            int r5 = r2.c()
            int r6 = r2.C
            if (r5 >= r6) goto L_0x03eb
            r0 = r24
            boolean[] r2 = r0.ap
            r3 = 2
            r5 = 1
            r2[r3] = r5
        L_0x03b1:
            r3 = 0
            r2 = 8
            if (r4 >= r2) goto L_0x059c
            r0 = r24
            boolean[] r2 = r0.ap
            r5 = 2
            boolean r2 = r2[r5]
            if (r2 == 0) goto L_0x059c
            r6 = 0
            r5 = 0
            r2 = 0
            r7 = r6
            r6 = r5
            r5 = r2
        L_0x03c5:
            if (r5 >= r8) goto L_0x0406
            r0 = r24
            java.util.ArrayList r2 = r0.af
            java.lang.Object r2 = r2.get(r5)
            ch r2 = (defpackage.ch) r2
            int r10 = r2.t
            int r11 = r2.c()
            int r10 = r10 + r11
            int r7 = java.lang.Math.max(r7, r10)
            int r10 = r2.u
            int r2 = r2.f()
            int r2 = r2 + r10
            int r6 = java.lang.Math.max(r6, r2)
            int r2 = r5 + 1
            r5 = r2
            goto L_0x03c5
        L_0x03eb:
            int r5 = r2.H
            int r6 = defpackage.bg.y
            if (r5 != r6) goto L_0x0402
            int r5 = r2.f()
            int r2 = r2.D
            if (r5 >= r2) goto L_0x0402
            r0 = r24
            boolean[] r2 = r0.ap
            r3 = 2
            r5 = 1
            r2[r3] = r5
            goto L_0x03b1
        L_0x0402:
            int r2 = r3 + 1
            r3 = r2
            goto L_0x038f
        L_0x0406:
            r0 = r24
            int r2 = r0.A
            int r2 = java.lang.Math.max(r2, r7)
            r0 = r24
            int r5 = r0.B
            int r5 = java.lang.Math.max(r5, r6)
            int r6 = defpackage.bg.x
            r0 = r17
            if (r0 != r6) goto L_0x0598
            int r6 = r24.c()
            if (r6 >= r2) goto L_0x0598
            r0 = r24
            r0.a(r2)
            int r2 = defpackage.bg.x
            r0 = r24
            r0.G = r2
            r3 = 1
            r2 = 1
        L_0x042f:
            int r6 = defpackage.bg.x
            r0 = r16
            if (r0 != r6) goto L_0x0448
            int r6 = r24.f()
            if (r6 >= r5) goto L_0x0448
            r0 = r24
            r0.b(r5)
            int r2 = defpackage.bg.x
            r0 = r24
            r0.H = r2
            r3 = 1
            r2 = 1
        L_0x0448:
            r0 = r24
            int r5 = r0.A
            int r6 = r24.c()
            int r5 = java.lang.Math.max(r5, r6)
            int r6 = r24.c()
            if (r5 <= r6) goto L_0x0467
            r0 = r24
            r0.a(r5)
            int r2 = defpackage.bg.w
            r0 = r24
            r0.G = r2
            r3 = 1
            r2 = 1
        L_0x0467:
            r0 = r24
            int r5 = r0.B
            int r6 = r24.f()
            int r5 = java.lang.Math.max(r5, r6)
            int r6 = r24.f()
            if (r5 <= r6) goto L_0x0486
            r0 = r24
            r0.b(r5)
            int r2 = defpackage.bg.w
            r0 = r24
            r0.H = r2
            r3 = 1
            r2 = 1
        L_0x0486:
            if (r3 != 0) goto L_0x04cc
            r0 = r24
            int r5 = r0.G
            int r6 = defpackage.bg.x
            if (r5 != r6) goto L_0x04aa
            if (r14 <= 0) goto L_0x04aa
            int r5 = r24.c()
            if (r5 <= r14) goto L_0x04aa
            r2 = 1
            r0 = r24
            r0.ad = r2
            r3 = 1
            int r2 = defpackage.bg.w
            r0 = r24
            r0.G = r2
            r0 = r24
            r0.a(r14)
            r2 = 1
        L_0x04aa:
            r0 = r24
            int r5 = r0.H
            int r6 = defpackage.bg.x
            if (r5 != r6) goto L_0x04cc
            if (r15 <= 0) goto L_0x04cc
            int r5 = r24.f()
            if (r5 <= r15) goto L_0x04cc
            r2 = 1
            r0 = r24
            r0.ae = r2
            r3 = 1
            int r2 = defpackage.bg.w
            r0 = r24
            r0.H = r2
            r0 = r24
            r0.b(r15)
            r2 = 1
        L_0x04cc:
            r9 = r3
            r3 = r2
            r2 = r4
            goto L_0x02fe
        L_0x04d1:
            r0 = r24
            ch r2 = r0.o
            if (r2 == 0) goto L_0x057f
            r0 = r24
            int r2 = r0.A
            int r3 = r24.c()
            int r11 = java.lang.Math.max(r2, r3)
            r0 = r24
            int r2 = r0.B
            int r3 = r24.f()
            int r12 = java.lang.Math.max(r2, r3)
            r0 = r24
            cl r13 = r0.ah
            int r2 = r13.a
            r0 = r24
            r0.t = r2
            int r2 = r13.b
            r0 = r24
            r0.u = r2
            int r2 = r13.c
            r0 = r24
            r0.a(r2)
            int r2 = r13.d
            r0 = r24
            r0.b(r2)
            r2 = 0
            java.util.ArrayList r3 = r13.e
            int r14 = r3.size()
            r10 = r2
        L_0x0515:
            if (r10 >= r14) goto L_0x053b
            java.util.ArrayList r2 = r13.e
            java.lang.Object r2 = r2.get(r10)
            r5 = r2
            cm r5 = (defpackage.cm) r5
            cg r2 = r5.a
            int r2 = r2.b
            r0 = r24
            cg r2 = r0.e(r2)
            cg r3 = r5.b
            int r4 = r5.c
            int r6 = r5.d
            int r7 = r5.e
            r5 = -1
            r8 = 0
            r2.a(r3, r4, r5, r6, r7, r8)
            int r2 = r10 + 1
            r10 = r2
            goto L_0x0515
        L_0x053b:
            r0 = r24
            r0.a(r11)
            r0 = r24
            r0.b(r12)
        L_0x0545:
            if (r9 == 0) goto L_0x0553
            r0 = r17
            r1 = r24
            r1.G = r0
            r0 = r16
            r1 = r24
            r1.H = r0
        L_0x0553:
            r0 = r24
            cd r2 = r0.ag
            cb r2 = r2.e
            r0 = r24
            r0.a(r2)
            r0 = r24
            ch r3 = r0.o
            r2 = 0
            r0 = r24
            boolean r4 = r0 instanceof defpackage.ci
            if (r4 == 0) goto L_0x0592
            r2 = r24
            ci r2 = (defpackage.ci) r2
            r23 = r2
            r2 = r3
            r3 = r23
        L_0x0572:
            if (r2 == 0) goto L_0x0588
            ch r4 = r2.o
            boolean r5 = r2 instanceof defpackage.ci
            if (r5 == 0) goto L_0x0590
            ci r2 = (defpackage.ci) r2
            r3 = r2
            r2 = r4
            goto L_0x0572
        L_0x057f:
            r0 = r24
            r0.t = r12
            r0 = r24
            r0.u = r13
            goto L_0x0545
        L_0x0588:
            r0 = r24
            if (r0 != r3) goto L_0x058f
            r24.m()
        L_0x058f:
            return
        L_0x0590:
            r2 = r4
            goto L_0x0572
        L_0x0592:
            r23 = r2
            r2 = r3
            r3 = r23
            goto L_0x0572
        L_0x0598:
            r2 = r3
            r3 = r9
            goto L_0x042f
        L_0x059c:
            r2 = r3
            r3 = r9
            goto L_0x0448
        L_0x05a0:
            r2 = r5
            r3 = r6
            r4 = r7
            r5 = r8
            r6 = r9
            r7 = r10
            goto L_0x01ea
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ci.o():void");
    }

    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: type inference failed for: r2v15, types: [int] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(defpackage.ch r9, boolean[] r10) {
        /*
            r8 = this;
            r3 = 0
            r7 = -1
            r5 = 0
            r6 = 1
            r1 = 0
            int r0 = r9.G
            int r2 = defpackage.bg.y
            if (r0 != r2) goto L_0x001a
            int r0 = r9.H
            int r2 = defpackage.bg.y
            if (r0 != r2) goto L_0x001a
            float r0 = r9.r
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x001a
            r10[r1] = r1
        L_0x0019:
            return
        L_0x001a:
            int r2 = r9.d()
            int r0 = r9.G
            int r4 = defpackage.bg.y
            if (r0 != r4) goto L_0x0033
            int r0 = r9.H
            int r4 = defpackage.bg.y
            if (r0 == r4) goto L_0x0033
            float r0 = r9.r
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0033
            r10[r1] = r1
            goto L_0x0019
        L_0x0033:
            r9.S = r6
            boolean r0 = r9 instanceof defpackage.cj
            if (r0 == 0) goto L_0x0063
            r0 = r9
            cj r0 = (defpackage.cj) r0
            int r3 = r0.af
            if (r3 != r6) goto L_0x01af
            int r2 = r0.ad
            if (r2 == r7) goto L_0x0058
            int r2 = r0.ad
            r4 = r1
        L_0x0047:
            int r0 = r9.J
            r1 = 8
            if (r0 != r1) goto L_0x0053
            int r0 = r9.p
            int r2 = r2 - r0
            int r0 = r9.p
            int r4 = r4 - r0
        L_0x0053:
            r9.L = r2
            r9.M = r4
            goto L_0x0019
        L_0x0058:
            int r2 = r0.ae
            if (r2 == r7) goto L_0x01ac
            int r2 = r0.ae
            r0 = r1
            r1 = r2
        L_0x0060:
            r2 = r0
            r4 = r1
            goto L_0x0047
        L_0x0063:
            cg r0 = r9.k
            boolean r0 = r0.d()
            if (r0 != 0) goto L_0x0079
            cg r0 = r9.i
            boolean r0 = r0.d()
            if (r0 != 0) goto L_0x0079
            int r0 = r9.t
            int r0 = r0 + r2
            r4 = r2
            r2 = r0
            goto L_0x0047
        L_0x0079:
            cg r0 = r9.k
            cg r0 = r0.c
            if (r0 == 0) goto L_0x00ab
            cg r0 = r9.i
            cg r0 = r0.c
            if (r0 == 0) goto L_0x00ab
            cg r0 = r9.k
            cg r0 = r0.c
            cg r4 = r9.i
            cg r4 = r4.c
            if (r0 == r4) goto L_0x00a7
            cg r0 = r9.k
            cg r0 = r0.c
            ch r0 = r0.a
            cg r4 = r9.i
            cg r4 = r4.c
            ch r4 = r4.a
            if (r0 != r4) goto L_0x00ab
            cg r0 = r9.k
            cg r0 = r0.c
            ch r0 = r0.a
            ch r4 = r9.o
            if (r0 == r4) goto L_0x00ab
        L_0x00a7:
            r10[r1] = r1
            goto L_0x0019
        L_0x00ab:
            cg r0 = r9.k
            cg r0 = r0.c
            if (r0 == 0) goto L_0x01a8
            cg r0 = r9.k
            cg r0 = r0.c
            ch r0 = r0.a
            cg r4 = r9.k
            int r4 = r4.b()
            int r4 = r4 + r2
            boolean r5 = r0.b()
            if (r5 != 0) goto L_0x00cb
            boolean r5 = r0.S
            if (r5 != 0) goto L_0x00cb
            r8.a(r0, r10)
        L_0x00cb:
            cg r5 = r9.i
            cg r5 = r5.c
            if (r5 == 0) goto L_0x00eb
            cg r3 = r9.i
            cg r3 = r3.c
            ch r3 = r3.a
            cg r5 = r9.i
            int r5 = r5.b()
            int r2 = r2 + r5
            boolean r5 = r3.b()
            if (r5 != 0) goto L_0x00eb
            boolean r5 = r3.S
            if (r5 != 0) goto L_0x00eb
            r8.a(r3, r10)
        L_0x00eb:
            cg r5 = r9.k
            cg r5 = r5.c
            if (r5 == 0) goto L_0x0139
            boolean r5 = r0.b()
            if (r5 != 0) goto L_0x0139
            cg r5 = r9.k
            cg r5 = r5.c
            int r5 = r5.b
            int r7 = defpackage.bg.p
            if (r5 != r7) goto L_0x0189
            int r5 = r0.M
            int r7 = r0.d()
            int r5 = r5 - r7
            int r4 = r4 + r5
        L_0x0109:
            boolean r5 = r0.P
            if (r5 != 0) goto L_0x011f
            cg r5 = r0.i
            cg r5 = r5.c
            if (r5 == 0) goto L_0x0198
            cg r5 = r0.k
            cg r5 = r5.c
            if (r5 == 0) goto L_0x0198
            int r5 = r0.G
            int r7 = defpackage.bg.y
            if (r5 == r7) goto L_0x0198
        L_0x011f:
            r5 = r6
        L_0x0120:
            r9.P = r5
            boolean r5 = r9.P
            if (r5 == 0) goto L_0x0139
            cg r5 = r0.i
            cg r5 = r5.c
            if (r5 == 0) goto L_0x0134
            cg r5 = r0.i
            cg r5 = r5.c
            ch r5 = r5.a
            if (r5 == r9) goto L_0x0139
        L_0x0134:
            int r0 = r0.M
            int r0 = r4 - r0
            int r4 = r4 + r0
        L_0x0139:
            cg r0 = r9.i
            cg r0 = r0.c
            if (r0 == 0) goto L_0x0047
            boolean r0 = r3.b()
            if (r0 != 0) goto L_0x0047
            cg r0 = r9.i
            cg r0 = r0.c
            int r0 = r0.b
            int r5 = defpackage.bg.n
            if (r0 != r5) goto L_0x019a
            int r0 = r3.L
            int r5 = r3.d()
            int r0 = r0 - r5
            int r2 = r2 + r0
        L_0x0157:
            boolean r0 = r3.O
            if (r0 != 0) goto L_0x016d
            cg r0 = r3.i
            cg r0 = r0.c
            if (r0 == 0) goto L_0x016e
            cg r0 = r3.k
            cg r0 = r0.c
            if (r0 == 0) goto L_0x016e
            int r0 = r3.G
            int r5 = defpackage.bg.y
            if (r0 == r5) goto L_0x016e
        L_0x016d:
            r1 = r6
        L_0x016e:
            r9.O = r1
            boolean r0 = r9.O
            if (r0 == 0) goto L_0x0047
            cg r0 = r3.k
            cg r0 = r0.c
            if (r0 == 0) goto L_0x0182
            cg r0 = r3.k
            cg r0 = r0.c
            ch r0 = r0.a
            if (r0 == r9) goto L_0x0047
        L_0x0182:
            int r0 = r3.L
            int r0 = r2 - r0
            int r2 = r2 + r0
            goto L_0x0047
        L_0x0189:
            cg r5 = r9.k
            cg r5 = r5.c
            int r5 = r5.b
            int r7 = defpackage.bg.n
            if (r5 != r7) goto L_0x0109
            int r5 = r0.M
            int r4 = r4 + r5
            goto L_0x0109
        L_0x0198:
            r5 = r1
            goto L_0x0120
        L_0x019a:
            cg r0 = r9.i
            cg r0 = r0.c
            int r0 = r0.b
            int r5 = defpackage.bg.p
            if (r0 != r5) goto L_0x0157
            int r0 = r3.L
            int r2 = r2 + r0
            goto L_0x0157
        L_0x01a8:
            r0 = r3
            r4 = r2
            goto L_0x00cb
        L_0x01ac:
            r0 = r1
            goto L_0x0060
        L_0x01af:
            r0 = r2
            r1 = r2
            goto L_0x0060
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ci.a(ch, boolean[]):void");
    }

    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v11 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void b(defpackage.ch r10, boolean[] r11) {
        /*
            r9 = this;
            r3 = 0
            r8 = 8
            r4 = -1
            r6 = 1
            r1 = 0
            int r0 = r10.H
            int r2 = defpackage.bg.y
            if (r0 != r2) goto L_0x001c
            int r0 = r10.G
            int r2 = defpackage.bg.y
            if (r0 == r2) goto L_0x001c
            float r0 = r10.r
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x001c
            r11[r1] = r1
        L_0x001b:
            return
        L_0x001c:
            int r2 = r10.e()
            r10.T = r6
            boolean r0 = r10 instanceof defpackage.cj
            if (r0 == 0) goto L_0x004c
            r0 = r10
            cj r0 = (defpackage.cj) r0
            int r3 = r0.af
            if (r3 != 0) goto L_0x01f7
            int r2 = r0.ad
            if (r2 == r4) goto L_0x0043
            int r4 = r0.ad
            r2 = r1
        L_0x0034:
            int r0 = r10.J
            if (r0 != r8) goto L_0x003e
            int r0 = r10.q
            int r4 = r4 - r0
            int r0 = r10.q
            int r2 = r2 - r0
        L_0x003e:
            r10.K = r4
            r10.N = r2
            goto L_0x001b
        L_0x0043:
            int r2 = r0.ae
            if (r2 == r4) goto L_0x01f4
            int r0 = r0.ae
        L_0x0049:
            r2 = r0
            r4 = r1
            goto L_0x0034
        L_0x004c:
            cg r0 = r10.m
            cg r0 = r0.c
            if (r0 != 0) goto L_0x0063
            cg r0 = r10.j
            cg r0 = r0.c
            if (r0 != 0) goto L_0x0063
            cg r0 = r10.l
            cg r0 = r0.c
            if (r0 != 0) goto L_0x0063
            int r0 = r10.u
            int r4 = r2 + r0
            goto L_0x0034
        L_0x0063:
            cg r0 = r10.l
            cg r0 = r0.c
            if (r0 == 0) goto L_0x0094
            cg r0 = r10.j
            cg r0 = r0.c
            if (r0 == 0) goto L_0x0094
            cg r0 = r10.l
            cg r0 = r0.c
            cg r4 = r10.j
            cg r4 = r4.c
            if (r0 == r4) goto L_0x0091
            cg r0 = r10.l
            cg r0 = r0.c
            ch r0 = r0.a
            cg r4 = r10.j
            cg r4 = r4.c
            ch r4 = r4.a
            if (r0 != r4) goto L_0x0094
            cg r0 = r10.l
            cg r0 = r0.c
            ch r0 = r0.a
            ch r4 = r10.o
            if (r0 == r4) goto L_0x0094
        L_0x0091:
            r11[r1] = r1
            goto L_0x001b
        L_0x0094:
            cg r0 = r10.m
            boolean r0 = r0.d()
            if (r0 == 0) goto L_0x00ce
            cg r0 = r10.m
            cg r0 = r0.c
            ch r0 = r0.a
            boolean r1 = r0.T
            if (r1 != 0) goto L_0x00a9
            r9.b(r0, r11)
        L_0x00a9:
            int r1 = r0.K
            int r3 = r0.q
            int r1 = r1 - r3
            int r1 = r1 + r2
            int r1 = java.lang.Math.max(r1, r2)
            int r3 = r0.N
            int r0 = r0.q
            int r0 = r3 - r0
            int r0 = r0 + r2
            int r0 = java.lang.Math.max(r0, r2)
            int r2 = r10.J
            if (r2 != r8) goto L_0x00c8
            int r2 = r10.q
            int r1 = r1 - r2
            int r2 = r10.q
            int r0 = r0 - r2
        L_0x00c8:
            r10.K = r1
            r10.N = r0
            goto L_0x001b
        L_0x00ce:
            cg r0 = r10.j
            boolean r0 = r0.d()
            if (r0 == 0) goto L_0x01f0
            cg r0 = r10.j
            cg r0 = r0.c
            ch r0 = r0.a
            cg r4 = r10.j
            int r4 = r4.b()
            int r4 = r4 + r2
            boolean r5 = r0.b()
            if (r5 != 0) goto L_0x00f0
            boolean r5 = r0.T
            if (r5 != 0) goto L_0x00f0
            r9.b(r0, r11)
        L_0x00f0:
            cg r5 = r10.l
            boolean r5 = r5.d()
            if (r5 == 0) goto L_0x0112
            cg r3 = r10.l
            cg r3 = r3.c
            ch r3 = r3.a
            cg r5 = r10.l
            int r5 = r5.b()
            int r2 = r2 + r5
            boolean r5 = r3.b()
            if (r5 != 0) goto L_0x0112
            boolean r5 = r3.T
            if (r5 != 0) goto L_0x0112
            r9.b(r3, r11)
        L_0x0112:
            cg r5 = r10.j
            cg r5 = r5.c
            if (r5 == 0) goto L_0x0170
            boolean r5 = r0.b()
            if (r5 != 0) goto L_0x0170
            cg r5 = r10.j
            cg r5 = r5.c
            int r5 = r5.b
            int r7 = defpackage.bg.o
            if (r5 != r7) goto L_0x01d0
            int r5 = r0.K
            int r7 = r0.e()
            int r5 = r5 - r7
            int r4 = r4 + r5
        L_0x0130:
            boolean r5 = r0.Q
            if (r5 != 0) goto L_0x0156
            cg r5 = r0.j
            cg r5 = r5.c
            if (r5 == 0) goto L_0x01df
            cg r5 = r0.j
            cg r5 = r5.c
            ch r5 = r5.a
            if (r5 == r10) goto L_0x01df
            cg r5 = r0.l
            cg r5 = r5.c
            if (r5 == 0) goto L_0x01df
            cg r5 = r0.l
            cg r5 = r5.c
            ch r5 = r5.a
            if (r5 == r10) goto L_0x01df
            int r5 = r0.H
            int r7 = defpackage.bg.y
            if (r5 == r7) goto L_0x01df
        L_0x0156:
            r5 = r6
        L_0x0157:
            r10.Q = r5
            boolean r5 = r10.Q
            if (r5 == 0) goto L_0x0170
            cg r5 = r0.l
            cg r5 = r5.c
            if (r5 == 0) goto L_0x016b
            cg r5 = r0.l
            cg r5 = r5.c
            ch r5 = r5.a
            if (r5 == r10) goto L_0x0170
        L_0x016b:
            int r0 = r0.K
            int r0 = r4 - r0
            int r4 = r4 + r0
        L_0x0170:
            cg r0 = r10.l
            cg r0 = r0.c
            if (r0 == 0) goto L_0x0034
            boolean r0 = r3.b()
            if (r0 != 0) goto L_0x0034
            cg r0 = r10.l
            cg r0 = r0.c
            int r0 = r0.b
            int r5 = defpackage.bg.q
            if (r0 != r5) goto L_0x01e2
            int r0 = r3.N
            int r5 = r3.e()
            int r0 = r0 - r5
            int r2 = r2 + r0
        L_0x018e:
            boolean r0 = r3.R
            if (r0 != 0) goto L_0x01b4
            cg r0 = r3.j
            cg r0 = r0.c
            if (r0 == 0) goto L_0x01b5
            cg r0 = r3.j
            cg r0 = r0.c
            ch r0 = r0.a
            if (r0 == r10) goto L_0x01b5
            cg r0 = r3.l
            cg r0 = r0.c
            if (r0 == 0) goto L_0x01b5
            cg r0 = r3.l
            cg r0 = r0.c
            ch r0 = r0.a
            if (r0 == r10) goto L_0x01b5
            int r0 = r3.H
            int r5 = defpackage.bg.y
            if (r0 == r5) goto L_0x01b5
        L_0x01b4:
            r1 = r6
        L_0x01b5:
            r10.R = r1
            boolean r0 = r10.R
            if (r0 == 0) goto L_0x0034
            cg r0 = r3.j
            cg r0 = r0.c
            if (r0 == 0) goto L_0x01c9
            cg r0 = r3.j
            cg r0 = r0.c
            ch r0 = r0.a
            if (r0 == r10) goto L_0x0034
        L_0x01c9:
            int r0 = r3.N
            int r0 = r2 - r0
            int r2 = r2 + r0
            goto L_0x0034
        L_0x01d0:
            cg r5 = r10.j
            cg r5 = r5.c
            int r5 = r5.b
            int r7 = defpackage.bg.q
            if (r5 != r7) goto L_0x0130
            int r5 = r0.K
            int r4 = r4 + r5
            goto L_0x0130
        L_0x01df:
            r5 = r1
            goto L_0x0157
        L_0x01e2:
            cg r0 = r10.l
            cg r0 = r0.c
            int r0 = r0.b
            int r5 = defpackage.bg.o
            if (r0 != r5) goto L_0x018e
            int r0 = r3.N
            int r2 = r2 + r0
            goto L_0x018e
        L_0x01f0:
            r0 = r3
            r4 = r2
            goto L_0x00f0
        L_0x01f4:
            r0 = r1
            goto L_0x0049
        L_0x01f7:
            r0 = r2
            r1 = r2
            goto L_0x0049
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ci.b(ch, boolean[]):void");
    }

    /* access modifiers changed from: 0000 */
    public final void a(defpackage.ch chVar, int i) {
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
                this.ao = (defpackage.ch[]) java.util.Arrays.copyOf(this.ao, this.ao.length << 1);
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
                this.an = (defpackage.ch[]) java.util.Arrays.copyOf(this.an, this.an.length << 1);
            }
            this.an[this.al] = chVar;
            this.al++;
        }
    }

    private final int a(defpackage.cd cdVar, defpackage.ch[] chVarArr, defpackage.ch chVar, int i, boolean[] zArr) {
        boolean z;
        defpackage.ch chVar2;
        defpackage.ch chVar3;
        int i2;
        boolean z2;
        defpackage.ch chVar4;
        defpackage.ch chVar5;
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
            defpackage.ch chVar6 = null;
            if (chVar.J != 8) {
                chVar6 = chVar;
            }
            defpackage.ch chVar7 = null;
            i2 = 0;
            defpackage.ch chVar8 = chVar;
            defpackage.ch chVar9 = chVar6;
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
                if (chVar8.J != 8 && chVar8.G == defpackage.bg.y) {
                    if (chVar8.H == defpackage.bg.y) {
                        zArr[0] = false;
                    }
                    if (chVar8.r <= 0.0f) {
                        zArr[0] = false;
                        if (i2 + 1 >= this.am.length) {
                            this.am = (defpackage.ch[]) java.util.Arrays.copyOf(this.am, this.am.length << 1);
                        }
                        int i3 = i2 + 1;
                        this.am[i2] = chVar8;
                        i2 = i3;
                    }
                }
                if (chVar8.k.c.a.i.c == null || chVar8.k.c.a.i.c.a != chVar8 || chVar8.k.c.a == chVar8) {
                    break;
                }
                defpackage.ch chVar10 = chVar8.k.c.a;
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
            defpackage.ch chVar11 = null;
            if (chVar.J != 8) {
                chVar11 = chVar;
            }
            defpackage.ch chVar12 = null;
            int i4 = 0;
            defpackage.ch chVar13 = chVar;
            defpackage.ch chVar14 = chVar11;
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
                if (chVar13.J != 8 && chVar13.H == defpackage.bg.y) {
                    if (chVar13.G == defpackage.bg.y) {
                        zArr[0] = false;
                    }
                    if (chVar13.r <= 0.0f) {
                        zArr[0] = false;
                        if (i4 + 1 >= this.am.length) {
                            this.am = (defpackage.ch[]) java.util.Arrays.copyOf(this.am, this.am.length << 1);
                        }
                        int i5 = i4 + 1;
                        this.am[i4] = chVar13;
                        i4 = i5;
                    }
                }
                if (chVar13.l.c.a.j.c == null || chVar13.l.c.a.j.c.a != chVar13 || chVar13.l.c.a == chVar13) {
                    break;
                }
                defpackage.ch chVar15 = chVar13.l.c.a;
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
