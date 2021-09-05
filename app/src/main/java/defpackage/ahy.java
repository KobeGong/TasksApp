package defpackage;

/* renamed from: ahy reason: default package */
/* compiled from: PG */
public abstract class ahy {
    private static final defpackage.aig a;
    private static final android.view.animation.Interpolator b = new defpackage.ahz();
    private static final android.view.animation.Interpolator c = new defpackage.aia();
    private int d = -1;

    public abstract int a(defpackage.afv afv);

    public abstract void a(defpackage.afv afv, int i);

    public abstract boolean a(defpackage.afv afv, defpackage.afv afv2);

    public static int a(int i, int i2) {
        int i3 = i & 789516;
        if (i3 == 0) {
            return i;
        }
        int i4 = (i3 ^ -1) & i;
        if (i2 == 0) {
            return i4 | (i3 << 2);
        }
        return i4 | ((i3 << 1) & -789517) | (((i3 << 1) & 789516) << 2);
    }

    public static int b(int i, int i2) {
        return i2 | i | (i2 << 8) | (i << 16);
    }

    public static int c(int i, int i2) {
        int i3 = i & 3158064;
        if (i3 == 0) {
            return i;
        }
        int i4 = (i3 ^ -1) & i;
        if (i2 == 0) {
            return i4 | (i3 >> 2);
        }
        return i4 | ((i3 >> 1) & -3158065) | (((i3 >> 1) & 3158064) >> 2);
    }

    /* access modifiers changed from: 0000 */
    public final int a(android.support.v7.widget.RecyclerView recyclerView, defpackage.afv afv) {
        return c(a(afv), ViewCompat.a.j(recyclerView));
    }

    public static boolean a() {
        return true;
    }

    public boolean b() {
        return true;
    }

    public boolean c() {
        return true;
    }

    public static int d() {
        return 0;
    }

    public static float e() {
        return 0.5f;
    }

    public static float f() {
        return 0.5f;
    }

    public static float a(float f) {
        return f;
    }

    public static float b(float f) {
        return f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0094  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.afv a(defpackage.afv r13, java.util.List r14, int r15, int r16) {
        /*
            android.view.View r0 = r13.a
            int r0 = r0.getWidth()
            int r5 = r15 + r0
            android.view.View r0 = r13.a
            int r0 = r0.getHeight()
            int r6 = r16 + r0
            r2 = 0
            r1 = -1
            android.view.View r0 = r13.a
            int r0 = r0.getLeft()
            int r7 = r15 - r0
            android.view.View r0 = r13.a
            int r0 = r0.getTop()
            int r8 = r16 - r0
            int r9 = r14.size()
            r0 = 0
            r4 = r0
        L_0x0028:
            if (r4 >= r9) goto L_0x00bb
            java.lang.Object r0 = r14.get(r4)
            afv r0 = (defpackage.afv) r0
            if (r7 <= 0) goto L_0x00bc
            android.view.View r3 = r0.a
            int r3 = r3.getRight()
            int r3 = r3 - r5
            if (r3 >= 0) goto L_0x00bc
            android.view.View r10 = r0.a
            int r10 = r10.getRight()
            android.view.View r11 = r13.a
            int r11 = r11.getRight()
            if (r10 <= r11) goto L_0x00bc
            int r3 = java.lang.Math.abs(r3)
            if (r3 <= r1) goto L_0x00bc
            r2 = r3
            r3 = r0
        L_0x0051:
            if (r7 >= 0) goto L_0x00c4
            android.view.View r1 = r0.a
            int r1 = r1.getLeft()
            int r1 = r1 - r15
            if (r1 <= 0) goto L_0x00c4
            android.view.View r10 = r0.a
            int r10 = r10.getLeft()
            android.view.View r11 = r13.a
            int r11 = r11.getLeft()
            if (r10 >= r11) goto L_0x00c4
            int r1 = java.lang.Math.abs(r1)
            if (r1 <= r2) goto L_0x00c4
            r3 = r0
        L_0x0071:
            if (r8 >= 0) goto L_0x00c2
            android.view.View r2 = r0.a
            int r2 = r2.getTop()
            int r2 = r2 - r16
            if (r2 <= 0) goto L_0x00c2
            android.view.View r10 = r0.a
            int r10 = r10.getTop()
            android.view.View r11 = r13.a
            int r11 = r11.getTop()
            if (r10 >= r11) goto L_0x00c2
            int r2 = java.lang.Math.abs(r2)
            if (r2 <= r1) goto L_0x00c2
            r3 = r0
        L_0x0092:
            if (r8 <= 0) goto L_0x00bf
            android.view.View r1 = r0.a
            int r1 = r1.getBottom()
            int r1 = r1 - r6
            if (r1 >= 0) goto L_0x00bf
            android.view.View r10 = r0.a
            int r10 = r10.getBottom()
            android.view.View r11 = r13.a
            int r11 = r11.getBottom()
            if (r10 <= r11) goto L_0x00bf
            int r1 = java.lang.Math.abs(r1)
            if (r1 <= r2) goto L_0x00bf
            r12 = r1
            r1 = r0
            r0 = r12
        L_0x00b4:
            int r2 = r4 + 1
            r4 = r2
            r2 = r1
            r1 = r0
            goto L_0x0028
        L_0x00bb:
            return r2
        L_0x00bc:
            r3 = r2
            r2 = r1
            goto L_0x0051
        L_0x00bf:
            r0 = r2
            r1 = r3
            goto L_0x00b4
        L_0x00c2:
            r2 = r1
            goto L_0x0092
        L_0x00c4:
            r1 = r2
            goto L_0x0071
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahy.a(afv, java.util.List, int, int):afv");
    }

    public void b(defpackage.afv afv, int i) {
        if (afv != null) {
            android.view.View view = afv.a;
        }
    }

    public static void a(android.support.v7.widget.RecyclerView recyclerView, defpackage.afv afv, defpackage.afv afv2, int i) {
        defpackage.afd afd = recyclerView.l;
        if (afd instanceof defpackage.aif) {
            ((defpackage.aif) afd).a(afv.a, afv2.a);
            return;
        }
        if (afd.d()) {
            if (defpackage.afd.b(afv2.a) <= recyclerView.getPaddingLeft()) {
                recyclerView.c(i);
            }
            if (defpackage.afd.d(afv2.a) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                recyclerView.c(i);
            }
        }
        if (afd.e()) {
            if (defpackage.afd.c(afv2.a) <= recyclerView.getPaddingTop()) {
                recyclerView.c(i);
            }
            if (defpackage.afd.e(afv2.a) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                recyclerView.c(i);
            }
        }
    }

    public void b(android.support.v7.widget.RecyclerView recyclerView, defpackage.afv afv) {
        a.a(afv.a);
    }

    public void a(android.graphics.Canvas canvas, android.support.v7.widget.RecyclerView recyclerView, defpackage.afv afv, float f, float f2, int i, boolean z) {
        a.a(canvas, recyclerView, afv.a, f, f2, i, z);
    }

    public static void b(defpackage.afv afv) {
        android.view.View view = afv.a;
    }

    public static long a(android.support.v7.widget.RecyclerView recyclerView, int i) {
        defpackage.aey aey = recyclerView.z;
        if (aey == null) {
            return i == 8 ? 200 : 250;
        }
        if (i == 8) {
            return aey.k;
        }
        return aey.j;
    }

    public final int a(android.support.v7.widget.RecyclerView recyclerView, int i, int i2, long j) {
        float f = 1.0f;
        if (this.d == -1) {
            this.d = recyclerView.getResources().getDimensionPixelSize(2131689764);
        }
        int signum = (int) (((float) (this.d * ((int) java.lang.Math.signum((float) i2)))) * c.getInterpolation(java.lang.Math.min(1.0f, (((float) java.lang.Math.abs(i2)) * 1.0f) / ((float) i))));
        if (j <= 2000) {
            f = ((float) j) / 2000.0f;
        }
        int interpolation = (int) (b.getInterpolation(f) * ((float) signum));
        if (interpolation != 0) {
            return interpolation;
        }
        if (i2 > 0) {
            return 1;
        }
        return -1;
    }

    static {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            a = new defpackage.aih();
        } else {
            a = new defpackage.aig();
        }
    }
}
