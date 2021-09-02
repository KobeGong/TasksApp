package defpackage;

/* renamed from: cg reason: default package */
/* compiled from: PG */
public final class cg {
    public final defpackage.ch a;
    public final int b;
    public defpackage.cg c;
    public int d = 0;
    public int e = defpackage.bg.l;
    public int f = defpackage.bg.j;
    public int g = 0;
    public defpackage.cf h;
    private int i = -1;

    public cg(defpackage.ch chVar, int i2) {
        this.a = chVar;
        this.b = i2;
    }

    public final void a() {
        if (this.h == null) {
            this.h = new defpackage.cf(defpackage.bg.f);
        } else {
            this.h.a();
        }
    }

    public final int b() {
        if (this.a.J == 8) {
            return 0;
        }
        if (this.i < 0 || this.c == null || this.c.a.J != 8) {
            return this.d;
        }
        return this.i;
    }

    public final void c() {
        this.c = null;
        this.d = 0;
        this.i = -1;
        this.e = defpackage.bg.m;
        this.g = 0;
        this.f = defpackage.bg.j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(defpackage.cg r6, int r7, int r8, int r9, int r10, boolean r11) {
        /*
            r5 = this;
            r2 = 1
            r1 = 0
            if (r6 != 0) goto L_0x0014
            r0 = 0
            r5.c = r0
            r5.d = r1
            r0 = -1
            r5.i = r0
            int r0 = defpackage.bg.l
            r5.e = r0
            r0 = 2
            r5.g = r0
        L_0x0013:
            return r2
        L_0x0014:
            if (r11 != 0) goto L_0x0090
            if (r6 == 0) goto L_0x0048
            int r3 = r6.b
            int r0 = r5.b
            if (r3 != r0) goto L_0x0041
            int r0 = r5.b
            int r3 = defpackage.bg.s
            if (r0 == r3) goto L_0x0048
            int r0 = r5.b
            int r3 = defpackage.bg.r
            if (r0 != r3) goto L_0x003f
            ch r0 = r6.a
            boolean r0 = r0.k()
            if (r0 == 0) goto L_0x003a
            ch r0 = r5.a
            boolean r0 = r0.k()
            if (r0 != 0) goto L_0x003f
        L_0x003a:
            r0 = r1
        L_0x003b:
            if (r0 != 0) goto L_0x0090
            r2 = r1
            goto L_0x0013
        L_0x003f:
            r0 = r2
            goto L_0x003b
        L_0x0041:
            int r0 = r5.b
            int r0 = r0 + -1
            switch(r0) {
                case 1: goto L_0x005a;
                case 2: goto L_0x0075;
                case 3: goto L_0x005a;
                case 4: goto L_0x0075;
                case 5: goto L_0x0048;
                case 6: goto L_0x004a;
                default: goto L_0x0048;
            }
        L_0x0048:
            r0 = r1
            goto L_0x003b
        L_0x004a:
            int r0 = defpackage.bg.r
            if (r3 == r0) goto L_0x0058
            int r0 = defpackage.bg.t
            if (r3 == r0) goto L_0x0058
            int r0 = defpackage.bg.u
            if (r3 == r0) goto L_0x0058
            r0 = r2
            goto L_0x003b
        L_0x0058:
            r0 = r1
            goto L_0x003b
        L_0x005a:
            int r0 = defpackage.bg.n
            if (r3 == r0) goto L_0x0062
            int r0 = defpackage.bg.p
            if (r3 != r0) goto L_0x0071
        L_0x0062:
            r0 = r2
        L_0x0063:
            ch r4 = r6.a
            boolean r4 = r4 instanceof defpackage.cj
            if (r4 == 0) goto L_0x003b
            if (r0 != 0) goto L_0x006f
            int r0 = defpackage.bg.t
            if (r3 != r0) goto L_0x0073
        L_0x006f:
            r0 = r2
            goto L_0x003b
        L_0x0071:
            r0 = r1
            goto L_0x0063
        L_0x0073:
            r0 = r1
            goto L_0x003b
        L_0x0075:
            int r0 = defpackage.bg.o
            if (r3 == r0) goto L_0x007d
            int r0 = defpackage.bg.q
            if (r3 != r0) goto L_0x008c
        L_0x007d:
            r0 = r2
        L_0x007e:
            ch r4 = r6.a
            boolean r4 = r4 instanceof defpackage.cj
            if (r4 == 0) goto L_0x003b
            if (r0 != 0) goto L_0x008a
            int r0 = defpackage.bg.u
            if (r3 != r0) goto L_0x008e
        L_0x008a:
            r0 = r2
            goto L_0x003b
        L_0x008c:
            r0 = r1
            goto L_0x007e
        L_0x008e:
            r0 = r1
            goto L_0x003b
        L_0x0090:
            r5.c = r6
            if (r7 <= 0) goto L_0x009e
            r5.d = r7
        L_0x0096:
            r5.i = r8
            r5.e = r9
            r5.g = r10
            goto L_0x0013
        L_0x009e:
            r5.d = r1
            goto L_0x0096
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cg.a(cg, int, int, int, int, boolean):boolean");
    }

    public final boolean d() {
        return this.c != null;
    }

    public final java.lang.String toString() {
        return null + ":" + defpackage.bg.v[this.b - 1] + (this.c != null ? " connected to " + this.c.a(new java.util.HashSet()) : "");
    }

    private final java.lang.String a(java.util.HashSet hashSet) {
        if (!hashSet.add(this)) {
            return "<-";
        }
        return null + ":" + defpackage.bg.v[this.b - 1] + (this.c != null ? " connected to " + this.c.a(hashSet) : "");
    }
}
