package defpackage;

/* renamed from: adw reason: default package */
/* compiled from: PG */
public final class adw extends defpackage.afd implements defpackage.aif {
    private int n;
    private defpackage.adz o;
    private defpackage.aep p;
    private boolean q;
    private boolean r;
    private int s;
    private int t;
    private defpackage.aea u;
    private final defpackage.adx v;
    private final defpackage.ady w;
    private int x;

    public adw() {
        this(0);
    }

    public adw(byte b) {
        this.n = 1;
        this.q = false;
        this.r = true;
        this.s = -1;
        this.t = Integer.MIN_VALUE;
        this.u = null;
        this.v = new defpackage.adx();
        this.w = new defpackage.ady();
        this.x = 2;
        a((java.lang.String) null);
        if (1 != this.n || this.p == null) {
            this.p = new defpackage.aep(this, 0);
            this.v.a = this.p;
            this.n = 1;
            h();
        }
        a((java.lang.String) null);
    }

    public final boolean a() {
        return true;
    }

    public final defpackage.afh b() {
        return new defpackage.afh();
    }

    public final void a(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        int i = -1;
        super.a(accessibilityEvent);
        if (k() > 0) {
            android.view.View a = a(0, k(), false);
            accessibilityEvent.setFromIndex(a == null ? -1 : a(a));
            android.view.View a2 = a(k() - 1, -1, false);
            if (a2 != null) {
                i = a(a2);
            }
            accessibilityEvent.setToIndex(i);
        }
    }

    public final android.os.Parcelable c() {
        if (this.u != null) {
            return new defpackage.aea(this.u);
        }
        defpackage.aea aea = new defpackage.aea();
        if (k() > 0) {
            y();
            boolean z = this.q;
            aea.c = z;
            if (z) {
                android.view.View B = B();
                aea.b = this.p.c() - this.p.b(B);
                aea.a = a(B);
                return aea;
            }
            android.view.View A = A();
            aea.a = a(A);
            aea.b = this.p.a(A) - this.p.b();
            return aea;
        }
        aea.a = -1;
        return aea;
    }

    public final void a(android.os.Parcelable parcelable) {
        if (parcelable instanceof defpackage.aea) {
            this.u = (defpackage.aea) parcelable;
            h();
        }
    }

    public final boolean d() {
        return this.n == 0;
    }

    public final boolean e() {
        return this.n == 1;
    }

    private final void w() {
        boolean z = true;
        if (this.n == 1 || !x()) {
            z = false;
        }
        this.q = z;
    }

    public final android.view.View a(int i) {
        int k = k();
        if (k == 0) {
            return null;
        }
        int a = i - a(e(0));
        if (a >= 0 && a < k) {
            android.view.View e = e(a);
            if (a(e) == i) {
                return e;
            }
        }
        return super.a(i);
    }

    private final int h(defpackage.aft aft) {
        if (aft.a != -1) {
            return this.p.e();
        }
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0097  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.afn r13, defpackage.aft r14) {
        /*
            r12 = this;
            aea r0 = r12.u
            if (r0 != 0) goto L_0x0009
            int r0 = r12.s
            r1 = -1
            if (r0 == r1) goto L_0x0013
        L_0x0009:
            int r0 = r14.a()
            if (r0 != 0) goto L_0x0013
            r12.b(r13)
        L_0x0012:
            return
        L_0x0013:
            aea r0 = r12.u
            if (r0 == 0) goto L_0x0025
            aea r0 = r12.u
            boolean r0 = r0.a()
            if (r0 == 0) goto L_0x0025
            aea r0 = r12.u
            int r0 = r0.a
            r12.s = r0
        L_0x0025:
            r12.y()
            adz r0 = r12.o
            r1 = 0
            r0.a = r1
            r12.w()
            android.view.View r0 = r12.p()
            adx r1 = r12.v
            boolean r1 = r1.e
            if (r1 == 0) goto L_0x0043
            int r1 = r12.s
            r2 = -1
            if (r1 != r2) goto L_0x0043
            aea r1 = r12.u
            if (r1 == 0) goto L_0x029a
        L_0x0043:
            adx r0 = r12.v
            r0.a()
            adx r0 = r12.v
            boolean r1 = r12.q
            r0.d = r1
            adx r2 = r12.v
            boolean r0 = r14.g
            if (r0 != 0) goto L_0x0059
            int r0 = r12.s
            r1 = -1
            if (r0 != r1) goto L_0x011d
        L_0x0059:
            r0 = 0
        L_0x005a:
            if (r0 != 0) goto L_0x009d
            int r0 = r12.k()
            if (r0 == 0) goto L_0x0297
            android.view.View r1 = r12.p()
            if (r1 == 0) goto L_0x0228
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            afh r0 = (defpackage.afh) r0
            afv r3 = r0.a
            boolean r3 = r3.m()
            if (r3 != 0) goto L_0x0225
            afv r3 = r0.a
            int r3 = r3.c()
            if (r3 < 0) goto L_0x0225
            afv r0 = r0.a
            int r0 = r0.c()
            int r3 = r14.a()
            if (r0 >= r3) goto L_0x0225
            r0 = 1
        L_0x008b:
            if (r0 == 0) goto L_0x0228
            int r0 = a(r1)
            r2.a(r1, r0)
            r0 = 1
        L_0x0095:
            if (r0 != 0) goto L_0x009d
            r2.b()
            r0 = 0
            r2.b = r0
        L_0x009d:
            adx r0 = r12.v
            r1 = 1
            r0.e = r1
        L_0x00a2:
            int r0 = r12.h(r14)
            adz r1 = r12.o
            int r1 = r1.i
            if (r1 < 0) goto L_0x02c3
            r1 = 0
        L_0x00ad:
            aep r2 = r12.p
            int r2 = r2.b()
            int r1 = r1 + r2
            aep r2 = r12.p
            int r2 = r2.f()
            int r0 = r0 + r2
            boolean r2 = r14.g
            if (r2 == 0) goto L_0x00ea
            int r2 = r12.s
            r3 = -1
            if (r2 == r3) goto L_0x00ea
            int r2 = r12.t
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == r3) goto L_0x00ea
            int r2 = r12.s
            android.view.View r2 = r12.a(r2)
            if (r2 == 0) goto L_0x00ea
            boolean r3 = r12.q
            if (r3 == 0) goto L_0x02c9
            aep r3 = r12.p
            int r3 = r3.c()
            aep r4 = r12.p
            int r2 = r4.b(r2)
            int r2 = r3 - r2
            int r3 = r12.t
            int r2 = r2 - r3
        L_0x00e7:
            if (r2 <= 0) goto L_0x02dc
            int r1 = r1 + r2
        L_0x00ea:
            int r2 = r12.k()
            int r2 = r2 + -1
        L_0x00f0:
            if (r2 < 0) goto L_0x02ee
            android.view.View r3 = r12.e(r2)
            afv r4 = android.support.v7.widget.RecyclerView.c(r3)
            boolean r5 = r4.b()
            if (r5 != 0) goto L_0x011a
            boolean r5 = r4.j()
            if (r5 == 0) goto L_0x02df
            boolean r5 = r4.m()
            if (r5 != 0) goto L_0x02df
            android.support.v7.widget.RecyclerView r5 = r12.b
            aet r5 = r5.k
            boolean r5 = r5.e
            if (r5 != 0) goto L_0x02df
            r12.c(r2)
            r13.a(r4)
        L_0x011a:
            int r2 = r2 + -1
            goto L_0x00f0
        L_0x011d:
            int r0 = r12.s
            if (r0 < 0) goto L_0x0129
            int r0 = r12.s
            int r1 = r14.a()
            if (r0 < r1) goto L_0x0133
        L_0x0129:
            r0 = -1
            r12.s = r0
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r12.t = r0
            r0 = 0
            goto L_0x005a
        L_0x0133:
            int r0 = r12.s
            r2.b = r0
            aea r0 = r12.u
            if (r0 == 0) goto L_0x016b
            aea r0 = r12.u
            boolean r0 = r0.a()
            if (r0 == 0) goto L_0x016b
            aea r0 = r12.u
            boolean r0 = r0.c
            r2.d = r0
            boolean r0 = r2.d
            if (r0 == 0) goto L_0x015d
            aep r0 = r12.p
            int r0 = r0.c()
            aea r1 = r12.u
            int r1 = r1.b
            int r0 = r0 - r1
            r2.c = r0
        L_0x015a:
            r0 = 1
            goto L_0x005a
        L_0x015d:
            aep r0 = r12.p
            int r0 = r0.b()
            aea r1 = r12.u
            int r1 = r1.b
            int r0 = r0 + r1
            r2.c = r0
            goto L_0x015a
        L_0x016b:
            int r0 = r12.t
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r1) goto L_0x0203
            int r0 = r12.s
            android.view.View r0 = r12.a(r0)
            if (r0 == 0) goto L_0x01e0
            aep r1 = r12.p
            int r1 = r1.e(r0)
            aep r3 = r12.p
            int r3 = r3.e()
            if (r1 <= r3) goto L_0x018d
            r2.b()
        L_0x018a:
            r0 = 1
            goto L_0x005a
        L_0x018d:
            aep r1 = r12.p
            int r1 = r1.a(r0)
            aep r3 = r12.p
            int r3 = r3.b()
            int r1 = r1 - r3
            if (r1 >= 0) goto L_0x01a8
            aep r0 = r12.p
            int r0 = r0.b()
            r2.c = r0
            r0 = 0
            r2.d = r0
            goto L_0x018a
        L_0x01a8:
            aep r1 = r12.p
            int r1 = r1.c()
            aep r3 = r12.p
            int r3 = r3.b(r0)
            int r1 = r1 - r3
            if (r1 >= 0) goto L_0x01c3
            aep r0 = r12.p
            int r0 = r0.c()
            r2.c = r0
            r0 = 1
            r2.d = r0
            goto L_0x018a
        L_0x01c3:
            boolean r1 = r2.d
            if (r1 == 0) goto L_0x01d9
            aep r1 = r12.p
            int r0 = r1.b(r0)
            aep r1 = r12.p
            int r1 = r1.a()
            int r0 = r0 + r1
        L_0x01d4:
            r2.c = r0
        L_0x01d6:
            r0 = 1
            goto L_0x005a
        L_0x01d9:
            aep r1 = r12.p
            int r0 = r1.a(r0)
            goto L_0x01d4
        L_0x01e0:
            int r0 = r12.k()
            if (r0 <= 0) goto L_0x01fb
            r0 = 0
            android.view.View r0 = r12.e(r0)
            int r0 = a(r0)
            int r1 = r12.s
            if (r1 >= r0) goto L_0x01ff
            r0 = 1
        L_0x01f4:
            boolean r1 = r12.q
            if (r0 != r1) goto L_0x0201
            r0 = 1
        L_0x01f9:
            r2.d = r0
        L_0x01fb:
            r2.b()
            goto L_0x01d6
        L_0x01ff:
            r0 = 0
            goto L_0x01f4
        L_0x0201:
            r0 = 0
            goto L_0x01f9
        L_0x0203:
            boolean r0 = r12.q
            r2.d = r0
            boolean r0 = r12.q
            if (r0 == 0) goto L_0x0218
            aep r0 = r12.p
            int r0 = r0.c()
            int r1 = r12.t
            int r0 = r0 - r1
            r2.c = r0
            goto L_0x018a
        L_0x0218:
            aep r0 = r12.p
            int r0 = r0.b()
            int r1 = r12.t
            int r0 = r0 + r1
            r2.c = r0
            goto L_0x018a
        L_0x0225:
            r0 = 0
            goto L_0x008b
        L_0x0228:
            boolean r0 = r2.d
            if (r0 == 0) goto L_0x0275
            boolean r0 = r12.q
            if (r0 != 0) goto L_0x027e
            android.view.View r0 = r12.l(r14)
        L_0x0234:
            if (r0 == 0) goto L_0x0297
            int r1 = a(r0)
            r2.b(r0, r1)
            boolean r1 = r14.g
            if (r1 != 0) goto L_0x0272
            boolean r1 = r12.g()
            if (r1 == 0) goto L_0x0272
            aep r1 = r12.p
            int r1 = r1.a(r0)
            aep r3 = r12.p
            int r3 = r3.c()
            if (r1 >= r3) goto L_0x0263
            aep r1 = r12.p
            int r0 = r1.b(r0)
            aep r1 = r12.p
            int r1 = r1.b()
            if (r0 >= r1) goto L_0x028e
        L_0x0263:
            r0 = 1
        L_0x0264:
            if (r0 == 0) goto L_0x0272
            boolean r0 = r2.d
            if (r0 == 0) goto L_0x0290
            aep r0 = r12.p
            int r0 = r0.c()
        L_0x0270:
            r2.c = r0
        L_0x0272:
            r0 = 1
            goto L_0x0095
        L_0x0275:
            boolean r0 = r12.q
            if (r0 == 0) goto L_0x027e
            android.view.View r0 = r12.l(r14)
            goto L_0x0234
        L_0x027e:
            r0 = r14
            r1 = r12
            r3 = 0
            int r4 = r1.k()
            int r0 = r0.a()
            android.view.View r0 = r1.c(r3, r4, r0)
            goto L_0x0234
        L_0x028e:
            r0 = 0
            goto L_0x0264
        L_0x0290:
            aep r0 = r12.p
            int r0 = r0.b()
            goto L_0x0270
        L_0x0297:
            r0 = 0
            goto L_0x0095
        L_0x029a:
            if (r0 == 0) goto L_0x00a2
            aep r1 = r12.p
            int r1 = r1.a(r0)
            aep r2 = r12.p
            int r2 = r2.c()
            if (r1 >= r2) goto L_0x02b8
            aep r1 = r12.p
            int r1 = r1.b(r0)
            aep r2 = r12.p
            int r2 = r2.b()
            if (r1 > r2) goto L_0x00a2
        L_0x02b8:
            adx r1 = r12.v
            int r2 = a(r0)
            r1.a(r0, r2)
            goto L_0x00a2
        L_0x02c3:
            r1 = 0
            r11 = r1
            r1 = r0
            r0 = r11
            goto L_0x00ad
        L_0x02c9:
            aep r3 = r12.p
            int r2 = r3.a(r2)
            aep r3 = r12.p
            int r3 = r3.b()
            int r2 = r2 - r3
            int r3 = r12.t
            int r2 = r3 - r2
            goto L_0x00e7
        L_0x02dc:
            int r0 = r0 - r2
            goto L_0x00ea
        L_0x02df:
            r12.d(r2)
            r13.c(r3)
            android.support.v7.widget.RecyclerView r3 = r12.b
            aho r3 = r3.h
            r3.c(r4)
            goto L_0x011a
        L_0x02ee:
            adz r2 = r12.o
            boolean r3 = r12.z()
            r2.k = r3
            adx r2 = r12.v
            boolean r2 = r2.d
            if (r2 == 0) goto L_0x0395
            adx r2 = r12.v
            r12.b(r2)
            adz r2 = r12.o
            r2.h = r1
            adz r1 = r12.o
            r2 = 0
            r12.a(r13, r1, r14, r2)
            adz r1 = r12.o
            int r1 = r1.b
            adz r2 = r12.o
            int r3 = r2.d
            adz r2 = r12.o
            int r2 = r2.c
            if (r2 <= 0) goto L_0x031e
            adz r2 = r12.o
            int r2 = r2.c
            int r0 = r0 + r2
        L_0x031e:
            adx r2 = r12.v
            r12.a(r2)
            adz r2 = r12.o
            r2.h = r0
            adz r0 = r12.o
            int r2 = r0.d
            adz r4 = r12.o
            int r4 = r4.e
            int r2 = r2 + r4
            r0.d = r2
            adz r0 = r12.o
            r2 = 0
            r12.a(r13, r0, r14, r2)
            adz r0 = r12.o
            int r2 = r0.b
            adz r0 = r12.o
            int r0 = r0.c
            if (r0 <= 0) goto L_0x04b1
            adz r0 = r12.o
            int r0 = r0.c
            r12.e(r3, r1)
            adz r1 = r12.o
            r1.h = r0
            adz r0 = r12.o
            r1 = 0
            r12.a(r13, r0, r14, r1)
            adz r0 = r12.o
            int r0 = r0.b
        L_0x0357:
            r1 = r0
            r0 = r2
        L_0x0359:
            int r2 = r12.k()
            if (r2 <= 0) goto L_0x04ad
            boolean r2 = r12.q
            if (r2 == 0) goto L_0x03f2
            r2 = 1
            int r2 = r12.a(r0, r13, r14, r2)
            int r1 = r1 + r2
            int r0 = r0 + r2
            r2 = 0
            int r2 = r12.b(r1, r13, r14, r2)
            int r1 = r1 + r2
            int r0 = r0 + r2
            r2 = r1
            r1 = r0
        L_0x0373:
            boolean r0 = r14.k
            if (r0 == 0) goto L_0x0387
            int r0 = r12.k()
            if (r0 == 0) goto L_0x0387
            boolean r0 = r14.g
            if (r0 != 0) goto L_0x0387
            boolean r0 = r12.g()
            if (r0 != 0) goto L_0x0404
        L_0x0387:
            boolean r0 = r14.g
            if (r0 != 0) goto L_0x04a3
            aep r0 = r12.p
            int r1 = r0.e()
            r0.b = r1
            goto L_0x0012
        L_0x0395:
            adx r2 = r12.v
            r12.a(r2)
            adz r2 = r12.o
            r2.h = r0
            adz r0 = r12.o
            r2 = 0
            r12.a(r13, r0, r14, r2)
            adz r0 = r12.o
            int r0 = r0.b
            adz r2 = r12.o
            int r2 = r2.d
            adz r3 = r12.o
            int r3 = r3.c
            if (r3 <= 0) goto L_0x03b7
            adz r3 = r12.o
            int r3 = r3.c
            int r1 = r1 + r3
        L_0x03b7:
            adx r3 = r12.v
            r12.b(r3)
            adz r3 = r12.o
            r3.h = r1
            adz r1 = r12.o
            int r3 = r1.d
            adz r4 = r12.o
            int r4 = r4.e
            int r3 = r3 + r4
            r1.d = r3
            adz r1 = r12.o
            r3 = 0
            r12.a(r13, r1, r14, r3)
            adz r1 = r12.o
            int r1 = r1.b
            adz r3 = r12.o
            int r3 = r3.c
            if (r3 <= 0) goto L_0x0359
            adz r3 = r12.o
            int r3 = r3.c
            r12.d(r2, r0)
            adz r0 = r12.o
            r0.h = r3
            adz r0 = r12.o
            r2 = 0
            r12.a(r13, r0, r14, r2)
            adz r0 = r12.o
            int r0 = r0.b
            goto L_0x0359
        L_0x03f2:
            r2 = 1
            int r2 = r12.b(r1, r13, r14, r2)
            int r1 = r1 + r2
            int r0 = r0 + r2
            r2 = 0
            int r2 = r12.a(r0, r13, r14, r2)
            int r1 = r1 + r2
            int r0 = r0 + r2
            r2 = r1
            r1 = r0
            goto L_0x0373
        L_0x0404:
            r5 = 0
            r4 = 0
            java.util.List r7 = r13.d
            int r8 = r7.size()
            r0 = 0
            android.view.View r0 = r12.e(r0)
            int r9 = a(r0)
            r0 = 0
            r6 = r0
        L_0x0417:
            if (r6 >= r8) goto L_0x0454
            java.lang.Object r0 = r7.get(r6)
            afv r0 = (defpackage.afv) r0
            boolean r3 = r0.m()
            if (r3 != 0) goto L_0x04aa
            int r3 = r0.c()
            if (r3 >= r9) goto L_0x0445
            r3 = 1
        L_0x042c:
            boolean r10 = r12.q
            if (r3 == r10) goto L_0x0447
            r3 = -1
        L_0x0431:
            r10 = -1
            if (r3 != r10) goto L_0x0449
            aep r3 = r12.p
            android.view.View r0 = r0.a
            int r0 = r3.e(r0)
            int r0 = r0 + r5
            r3 = r0
            r0 = r4
        L_0x043f:
            int r4 = r6 + 1
            r6 = r4
            r5 = r3
            r4 = r0
            goto L_0x0417
        L_0x0445:
            r3 = 0
            goto L_0x042c
        L_0x0447:
            r3 = 1
            goto L_0x0431
        L_0x0449:
            aep r3 = r12.p
            android.view.View r0 = r0.a
            int r0 = r3.e(r0)
            int r0 = r0 + r4
            r3 = r5
            goto L_0x043f
        L_0x0454:
            adz r0 = r12.o
            r0.j = r7
            if (r5 <= 0) goto L_0x047a
            android.view.View r0 = r12.A()
            int r0 = a(r0)
            r12.e(r0, r2)
            adz r0 = r12.o
            r0.h = r5
            adz r0 = r12.o
            r2 = 0
            r0.c = r2
            adz r0 = r12.o
            r2 = 0
            r0.a(r2)
            adz r0 = r12.o
            r2 = 0
            r12.a(r13, r0, r14, r2)
        L_0x047a:
            if (r4 <= 0) goto L_0x049c
            android.view.View r0 = r12.B()
            int r0 = a(r0)
            r12.d(r0, r1)
            adz r0 = r12.o
            r0.h = r4
            adz r0 = r12.o
            r1 = 0
            r0.c = r1
            adz r0 = r12.o
            r1 = 0
            r0.a(r1)
            adz r0 = r12.o
            r1 = 0
            r12.a(r13, r0, r14, r1)
        L_0x049c:
            adz r0 = r12.o
            r1 = 0
            r0.j = r1
            goto L_0x0387
        L_0x04a3:
            adx r0 = r12.v
            r0.a()
            goto L_0x0012
        L_0x04aa:
            r0 = r4
            r3 = r5
            goto L_0x043f
        L_0x04ad:
            r2 = r1
            r1 = r0
            goto L_0x0373
        L_0x04b1:
            r0 = r1
            goto L_0x0357
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adw.a(afn, aft):void");
    }

    public final void a(defpackage.aft aft) {
        super.a(aft);
        this.u = null;
        this.s = -1;
        this.t = Integer.MIN_VALUE;
        this.v.a();
    }

    private final int a(int i, defpackage.afn afn, defpackage.aft aft, boolean z) {
        int c = this.p.c() - i;
        if (c <= 0) {
            return 0;
        }
        int i2 = -d(-c, afn, aft);
        int i3 = i + i2;
        if (!z) {
            return i2;
        }
        int c2 = this.p.c() - i3;
        if (c2 <= 0) {
            return i2;
        }
        this.p.a(c2);
        return i2 + c2;
    }

    private final int b(int i, defpackage.afn afn, defpackage.aft aft, boolean z) {
        int b = i - this.p.b();
        if (b <= 0) {
            return 0;
        }
        int i2 = -d(b, afn, aft);
        int i3 = i + i2;
        if (!z) {
            return i2;
        }
        int b2 = i3 - this.p.b();
        if (b2 <= 0) {
            return i2;
        }
        this.p.a(-b2);
        return i2 - b2;
    }

    private final void a(defpackage.adx adx) {
        d(adx.b, adx.c);
    }

    private final void d(int i, int i2) {
        this.o.c = this.p.c() - i2;
        this.o.e = this.q ? -1 : 1;
        this.o.d = i;
        this.o.f = 1;
        this.o.b = i2;
        this.o.g = Integer.MIN_VALUE;
    }

    private final void b(defpackage.adx adx) {
        e(adx.b, adx.c);
    }

    private final void e(int i, int i2) {
        int i3;
        this.o.c = i2 - this.p.b();
        this.o.d = i;
        defpackage.adz adz = this.o;
        if (this.q) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        adz.e = i3;
        this.o.f = -1;
        this.o.b = i2;
        this.o.g = Integer.MIN_VALUE;
    }

    private final boolean x() {
        if (defpackage.sn.a.j(this.b) == 1) {
            return true;
        }
        return false;
    }

    private final void y() {
        if (this.o == null) {
            this.o = new defpackage.adz();
        }
    }

    public final void b(int i) {
        this.s = i;
        this.t = Integer.MIN_VALUE;
        if (this.u != null) {
            this.u.a = -1;
        }
        h();
    }

    private final void f(int i, int i2) {
        this.s = i;
        this.t = i2;
        if (this.u != null) {
            this.u.a = -1;
        }
        h();
    }

    public final int a(int i, defpackage.afn afn, defpackage.aft aft) {
        if (this.n == 1) {
            return 0;
        }
        return d(i, afn, aft);
    }

    public final int b(int i, defpackage.afn afn, defpackage.aft aft) {
        if (this.n == 0) {
            return 0;
        }
        return d(i, afn, aft);
    }

    public final int b(defpackage.aft aft) {
        return i(aft);
    }

    public final int c(defpackage.aft aft) {
        return i(aft);
    }

    public final int d(defpackage.aft aft) {
        return j(aft);
    }

    public final int e(defpackage.aft aft) {
        return j(aft);
    }

    public final int f(defpackage.aft aft) {
        return k(aft);
    }

    public final int g(defpackage.aft aft) {
        return k(aft);
    }

    private final int i(defpackage.aft aft) {
        int max;
        boolean z = true;
        if (k() == 0) {
            return 0;
        }
        y();
        defpackage.aep aep = this.p;
        android.view.View a = a(!this.r);
        if (this.r) {
            z = false;
        }
        android.view.View b = b(z);
        boolean z2 = this.r;
        boolean z3 = this.q;
        if (k() == 0 || aft.a() == 0 || a == null || b == null) {
            return 0;
        }
        int min = java.lang.Math.min(defpackage.afd.a(a), defpackage.afd.a(b));
        int max2 = java.lang.Math.max(defpackage.afd.a(a), defpackage.afd.a(b));
        if (z3) {
            max = java.lang.Math.max(0, (aft.a() - max2) - 1);
        } else {
            max = java.lang.Math.max(0, min);
        }
        if (!z2) {
            return max;
        }
        return java.lang.Math.round(((float) (aep.b() - aep.a(a))) + ((((float) java.lang.Math.abs(aep.b(b) - aep.a(a))) / ((float) (java.lang.Math.abs(defpackage.afd.a(a) - defpackage.afd.a(b)) + 1))) * ((float) max)));
    }

    private final int j(defpackage.aft aft) {
        boolean z = true;
        if (k() == 0) {
            return 0;
        }
        y();
        defpackage.aep aep = this.p;
        android.view.View a = a(!this.r);
        if (this.r) {
            z = false;
        }
        android.view.View b = b(z);
        boolean z2 = this.r;
        if (k() == 0 || aft.a() == 0 || a == null || b == null) {
            return 0;
        }
        if (!z2) {
            return java.lang.Math.abs(defpackage.afd.a(a) - defpackage.afd.a(b)) + 1;
        }
        return java.lang.Math.min(aep.e(), aep.b(b) - aep.a(a));
    }

    private final int k(defpackage.aft aft) {
        boolean z = true;
        if (k() == 0) {
            return 0;
        }
        y();
        defpackage.aep aep = this.p;
        android.view.View a = a(!this.r);
        if (this.r) {
            z = false;
        }
        android.view.View b = b(z);
        boolean z2 = this.r;
        if (k() == 0 || aft.a() == 0 || a == null || b == null) {
            return 0;
        }
        if (!z2) {
            return aft.a();
        }
        return (int) ((((float) (aep.b(b) - aep.a(a))) / ((float) (java.lang.Math.abs(defpackage.afd.a(a) - defpackage.afd.a(b)) + 1))) * ((float) aft.a()));
    }

    private final void a(int i, int i2, boolean z, defpackage.aft aft) {
        int b;
        int i3 = -1;
        int i4 = 1;
        this.o.k = z();
        this.o.h = h(aft);
        this.o.f = i;
        if (i == 1) {
            this.o.h += this.p.f();
            android.view.View B = B();
            defpackage.adz adz = this.o;
            if (!this.q) {
                i3 = 1;
            }
            adz.e = i3;
            this.o.d = a(B) + this.o.e;
            this.o.b = this.p.b(B);
            b = this.p.b(B) - this.p.c();
        } else {
            android.view.View A = A();
            this.o.h += this.p.b();
            defpackage.adz adz2 = this.o;
            if (!this.q) {
                i4 = -1;
            }
            adz2.e = i4;
            this.o.d = a(A) + this.o.e;
            this.o.b = this.p.a(A);
            b = (-this.p.a(A)) + this.p.b();
        }
        this.o.c = i2;
        if (z) {
            this.o.c -= b;
        }
        this.o.g = b;
    }

    private final boolean z() {
        return this.p.g() == 0 && this.p.d() == 0;
    }

    public final void a(int i, defpackage.afg afg) {
        int i2;
        boolean z;
        if (this.u == null || !this.u.a()) {
            w();
            boolean z2 = this.q;
            if (this.s == -1) {
                i2 = z2 ? i - 1 : 0;
                z = z2;
            } else {
                i2 = this.s;
                z = z2;
            }
        } else {
            z = this.u.c;
            i2 = this.u.a;
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.x && i2 >= 0 && i2 < i; i4++) {
            afg.a(i2, 0);
            i2 += i3;
        }
    }

    public final void a(int i, int i2, defpackage.aft aft, defpackage.afg afg) {
        if (this.n != 0) {
            i = i2;
        }
        if (k() != 0 && i != 0) {
            y();
            a(i > 0 ? 1 : -1, java.lang.Math.abs(i), true, aft);
            defpackage.adz adz = this.o;
            int i3 = adz.d;
            if (i3 >= 0 && i3 < aft.a()) {
                afg.a(i3, java.lang.Math.max(0, adz.g));
            }
        }
    }

    private final int d(int i, defpackage.afn afn, defpackage.aft aft) {
        if (k() == 0 || i == 0) {
            return 0;
        }
        this.o.a = true;
        y();
        int i2 = i > 0 ? 1 : -1;
        int abs = java.lang.Math.abs(i);
        a(i2, abs, true, aft);
        int a = this.o.g + a(afn, this.o, aft, false);
        if (a < 0) {
            return 0;
        }
        if (abs > a) {
            i = i2 * a;
        }
        this.p.a(-i);
        this.o.i = i;
        return i;
    }

    public final void a(java.lang.String str) {
        if (this.u == null) {
            super.a(str);
        }
    }

    private final void a(defpackage.afn afn, int i, int i2) {
        if (i != i2) {
            if (i2 > i) {
                for (int i3 = i2 - 1; i3 >= i; i3--) {
                    a(i3, afn);
                }
                return;
            }
            while (i > i2) {
                a(i, afn);
                i--;
            }
        }
    }

    private final void a(defpackage.afn afn, defpackage.adz adz) {
        if (adz.a && !adz.k) {
            if (adz.f == -1) {
                int i = adz.g;
                int k = k();
                if (i >= 0) {
                    int d = this.p.d() - i;
                    if (this.q) {
                        for (int i2 = 0; i2 < k; i2++) {
                            android.view.View e = e(i2);
                            if (this.p.a(e) < d || this.p.d(e) < d) {
                                a(afn, 0, i2);
                                return;
                            }
                        }
                        return;
                    }
                    for (int i3 = k - 1; i3 >= 0; i3--) {
                        android.view.View e2 = e(i3);
                        if (this.p.a(e2) < d || this.p.d(e2) < d) {
                            a(afn, k - 1, i3);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            int i4 = adz.g;
            if (i4 >= 0) {
                int k2 = k();
                if (this.q) {
                    for (int i5 = k2 - 1; i5 >= 0; i5--) {
                        android.view.View e3 = e(i5);
                        if (this.p.b(e3) > i4 || this.p.c(e3) > i4) {
                            a(afn, k2 - 1, i5);
                            return;
                        }
                    }
                    return;
                }
                for (int i6 = 0; i6 < k2; i6++) {
                    android.view.View e4 = e(i6);
                    if (this.p.b(e4) > i4 || this.p.c(e4) > i4) {
                        a(afn, 0, i6);
                        return;
                    }
                }
            }
        }
    }

    private final int a(defpackage.afn afn, defpackage.adz adz, defpackage.aft aft, boolean z) {
        android.view.View view;
        int i;
        int i2;
        int i3;
        int i4;
        int l;
        int f;
        int i5 = adz.c;
        if (adz.g != Integer.MIN_VALUE) {
            if (adz.c < 0) {
                adz.g += adz.c;
            }
            a(afn, adz);
        }
        int i6 = adz.c + adz.h;
        defpackage.ady ady = this.w;
        while (true) {
            int i7 = i6;
            if (!adz.k && i7 <= 0) {
                break;
            }
            if (!(adz.d >= 0 && adz.d < aft.a())) {
                break;
            }
            ady.a = 0;
            ady.b = false;
            ady.c = false;
            ady.d = false;
            if (adz.j != null) {
                int size = adz.j.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size) {
                        view = null;
                        break;
                    }
                    android.view.View view2 = ((defpackage.afv) adz.j.get(i8)).a;
                    defpackage.afh afh = (defpackage.afh) view2.getLayoutParams();
                    if (!afh.a.m() && adz.d == afh.a.c()) {
                        adz.a(view2);
                        view = view2;
                        break;
                    }
                    i8++;
                }
            } else {
                android.view.View view3 = afn.a(adz.d, Long.MAX_VALUE).a;
                adz.d += adz.e;
                view = view3;
            }
            if (view == null) {
                ady.b = true;
            } else {
                defpackage.afh afh2 = (defpackage.afh) view.getLayoutParams();
                if (adz.j == null) {
                    if (this.q == (adz.f == -1)) {
                        super.a(view, -1, false);
                    } else {
                        super.a(view, 0, false);
                    }
                } else {
                    if (this.q == (adz.f == -1)) {
                        super.a(view, -1, true);
                    } else {
                        super.a(view, 0, true);
                    }
                }
                defpackage.afh afh3 = (defpackage.afh) view.getLayoutParams();
                android.graphics.Rect e = this.b.e(view);
                int i9 = e.left + e.right + 0;
                int i10 = e.bottom + e.top + 0;
                int a = defpackage.afd.a(this.l, this.j, i9 + l() + n() + afh3.leftMargin + afh3.rightMargin, afh3.width, d());
                int a2 = defpackage.afd.a(this.m, this.k, i10 + m() + o() + afh3.topMargin + afh3.bottomMargin, afh3.height, e());
                if (view.isLayoutRequested() || !this.f || !defpackage.afd.b(view.getWidth(), a, afh3.width) || !defpackage.afd.b(view.getHeight(), a2, afh3.height)) {
                    view.measure(a, a2);
                }
                ady.a = this.p.e(view);
                if (this.n == 1) {
                    if (x()) {
                        f = this.l - n();
                        l = f - this.p.f(view);
                    } else {
                        l = l();
                        f = this.p.f(view) + l;
                    }
                    if (adz.f == -1) {
                        i2 = adz.b - ady.a;
                        i = l;
                        i4 = adz.b;
                        i3 = f;
                    } else {
                        i2 = adz.b;
                        i = l;
                        i4 = adz.b + ady.a;
                        i3 = f;
                    }
                } else {
                    int m = m();
                    int f2 = this.p.f(view) + m;
                    if (adz.f == -1) {
                        i = adz.b - ady.a;
                        i2 = m;
                        i3 = adz.b;
                        i4 = f2;
                    } else {
                        i = adz.b;
                        i2 = m;
                        i3 = adz.b + ady.a;
                        i4 = f2;
                    }
                }
                defpackage.afh afh4 = (defpackage.afh) view.getLayoutParams();
                android.graphics.Rect rect = afh4.b;
                view.layout(i + rect.left + afh4.leftMargin, i2 + rect.top + afh4.topMargin, (i3 - rect.right) - afh4.rightMargin, (i4 - rect.bottom) - afh4.bottomMargin);
                if (afh2.a.m() || afh2.a.s()) {
                    ady.c = true;
                }
                ady.d = view.hasFocusable();
            }
            if (ady.b) {
                break;
            }
            adz.b += ady.a * adz.f;
            if (!ady.c || this.o.j != null || !aft.g) {
                adz.c -= ady.a;
                i6 = i7 - ady.a;
            } else {
                i6 = i7;
            }
            if (adz.g != Integer.MIN_VALUE) {
                adz.g += ady.a;
                if (adz.c < 0) {
                    adz.g += adz.c;
                }
                a(afn, adz);
            }
            if (z && ady.d) {
                break;
            }
        }
        return i5 - adz.c;
    }

    /* access modifiers changed from: 0000 */
    public final boolean f() {
        boolean z;
        if (!(this.k == 1073741824 || this.j == 1073741824)) {
            int k = k();
            int i = 0;
            while (true) {
                if (i >= k) {
                    z = false;
                    break;
                }
                android.view.ViewGroup.LayoutParams layoutParams = e(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    z = true;
                    break;
                }
                i++;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    private final android.view.View A() {
        return e(this.q ? k() - 1 : 0);
    }

    private final android.view.View B() {
        return e(this.q ? 0 : k() - 1);
    }

    private final android.view.View a(boolean z) {
        if (this.q) {
            return a(k() - 1, -1, z);
        }
        return a(0, k(), z);
    }

    private final android.view.View b(boolean z) {
        if (this.q) {
            return a(0, k(), z);
        }
        return a(k() - 1, -1, z);
    }

    private final android.view.View l(defpackage.aft aft) {
        return c(k() - 1, -1, aft.a());
    }

    private final android.view.View c(int i, int i2, int i3) {
        android.view.View view;
        android.view.View view2 = null;
        y();
        int b = this.p.b();
        int c = this.p.c();
        int i4 = i2 > i ? 1 : -1;
        android.view.View view3 = null;
        while (i != i2) {
            android.view.View e = e(i);
            int a = a(e);
            if (a >= 0 && a < i3) {
                if (((defpackage.afh) e.getLayoutParams()).a.m()) {
                    if (view3 == null) {
                        view = view2;
                        i += i4;
                        view2 = view;
                        view3 = e;
                    }
                } else if (this.p.a(e) < c && this.p.b(e) >= b) {
                    return e;
                } else {
                    if (view2 == null) {
                        view = e;
                        e = view3;
                        i += i4;
                        view2 = view;
                        view3 = e;
                    }
                }
            }
            view = view2;
            e = view3;
            i += i4;
            view2 = view;
            view3 = e;
        }
        return view2 != null ? view2 : view3;
    }

    private final android.view.View C() {
        return g(0, k());
    }

    private final android.view.View D() {
        return g(k() - 1, -1);
    }

    private final android.view.View a(int i, int i2, boolean z) {
        int i3;
        y();
        if (z) {
            i3 = 24579;
        } else {
            i3 = 320;
        }
        if (this.n == 0) {
            return this.c.a(i, i2, i3, 320);
        }
        return this.d.a(i, i2, i3, 320);
    }

    private final android.view.View g(int i, int i2) {
        int i3;
        int i4;
        y();
        char c = i2 > i ? 1 : i2 < i ? (char) 65535 : 0;
        if (c == 0) {
            return e(i);
        }
        if (this.p.a(e(i)) < this.p.b()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        if (this.n == 0) {
            return this.c.a(i, i2, i3, i4);
        }
        return this.d.a(i, i2, i3, i4);
    }

    public final android.view.View c(int i, defpackage.afn afn, defpackage.aft aft) {
        int i2;
        android.view.View D;
        android.view.View view;
        android.view.View B;
        android.view.View C;
        w();
        if (k() == 0) {
            return null;
        }
        switch (i) {
            case 1:
                if (this.n != 1) {
                    if (!x()) {
                        i2 = -1;
                        break;
                    } else {
                        i2 = 1;
                        break;
                    }
                } else {
                    i2 = -1;
                    break;
                }
            case 2:
                if (this.n != 1) {
                    if (!x()) {
                        i2 = 1;
                        break;
                    } else {
                        i2 = -1;
                        break;
                    }
                } else {
                    i2 = 1;
                    break;
                }
            case 17:
                if (this.n != 0) {
                    i2 = Integer.MIN_VALUE;
                    break;
                } else {
                    i2 = -1;
                    break;
                }
            case 33:
                if (this.n != 1) {
                    i2 = Integer.MIN_VALUE;
                    break;
                } else {
                    i2 = -1;
                    break;
                }
            case 66:
                if (this.n != 0) {
                    i2 = Integer.MIN_VALUE;
                    break;
                } else {
                    i2 = 1;
                    break;
                }
            case 130:
                if (this.n != 1) {
                    i2 = Integer.MIN_VALUE;
                    break;
                } else {
                    i2 = 1;
                    break;
                }
            default:
                i2 = Integer.MIN_VALUE;
                break;
        }
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        y();
        y();
        a(i2, (int) (0.33333334f * ((float) this.p.e())), false, aft);
        this.o.g = Integer.MIN_VALUE;
        this.o.a = false;
        a(afn, this.o, aft, true);
        if (i2 == -1) {
            if (this.q) {
                C = D();
            } else {
                C = C();
            }
            view = C;
        } else {
            if (this.q) {
                D = C();
            } else {
                D = D();
            }
            view = D;
        }
        if (i2 == -1) {
            B = A();
        } else {
            B = B();
        }
        if (!B.hasFocusable()) {
            return view;
        }
        if (view == null) {
            return null;
        }
        return B;
    }

    public final boolean g() {
        return this.u == null;
    }

    public final void a(android.view.View view, android.view.View view2) {
        a("Cannot drop a view during a scroll or layout calculation");
        y();
        w();
        int a = a(view);
        int a2 = a(view2);
        boolean z = a < a2 ? true : true;
        if (this.q) {
            if (z) {
                f(a2, this.p.c() - (this.p.a(view2) + this.p.e(view)));
            } else {
                f(a2, this.p.c() - this.p.b(view2));
            }
        } else if (z) {
            f(a2, this.p.a(view2));
        } else {
            f(a2, this.p.b(view2) - this.p.e(view));
        }
    }
}
