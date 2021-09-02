package defpackage;

/* renamed from: ado reason: default package */
/* compiled from: PG */
public abstract class ado implements android.view.View.OnAttachStateChangeListener, android.view.View.OnTouchListener {
    public final android.view.View a;
    public boolean b;
    private final float c;
    private final int d;
    private final int e;
    private java.lang.Runnable f;
    private java.lang.Runnable g;
    private int h;
    private final int[] i = new int[2];

    public ado(android.view.View view) {
        this.a = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.c = (float) android.view.ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.d = android.view.ViewConfiguration.getTapTimeout();
        this.e = (this.d + android.view.ViewConfiguration.getLongPressTimeout()) / 2;
    }

    public abstract defpackage.zz a();

    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r12, android.view.MotionEvent r13) {
        /*
            r11 = this;
            r4 = 3
            r5 = 0
            r8 = 1
            r7 = 0
            boolean r10 = r11.b
            if (r10 == 0) goto L_0x0078
            android.view.View r1 = r11.a
            zz r0 = r11.a()
            if (r0 == 0) goto L_0x0016
            boolean r2 = r0.f()
            if (r2 != 0) goto L_0x0028
        L_0x0016:
            r0 = r7
        L_0x0017:
            if (r0 != 0) goto L_0x001f
            boolean r0 = r11.c()
            if (r0 != 0) goto L_0x0076
        L_0x001f:
            r0 = r8
        L_0x0020:
            r11.b = r0
            if (r0 != 0) goto L_0x0026
            if (r10 == 0) goto L_0x0027
        L_0x0026:
            r7 = r8
        L_0x0027:
            return r7
        L_0x0028:
            android.widget.ListView r0 = r0.g()
            ade r0 = (defpackage.ade) r0
            if (r0 == 0) goto L_0x0036
            boolean r2 = r0.isShown()
            if (r2 != 0) goto L_0x0038
        L_0x0036:
            r0 = r7
            goto L_0x0017
        L_0x0038:
            android.view.MotionEvent r2 = android.view.MotionEvent.obtainNoHistory(r13)
            int[] r3 = r11.i
            r1.getLocationOnScreen(r3)
            r1 = r3[r7]
            float r1 = (float) r1
            r3 = r3[r8]
            float r3 = (float) r3
            r2.offsetLocation(r1, r3)
            int[] r1 = r11.i
            r0.getLocationOnScreen(r1)
            r3 = r1[r7]
            int r3 = -r3
            float r3 = (float) r3
            r1 = r1[r8]
            int r1 = -r1
            float r1 = (float) r1
            r2.offsetLocation(r3, r1)
            int r1 = r11.h
            boolean r1 = r0.a(r2, r1)
            r2.recycle()
            int r0 = r13.getActionMasked()
            if (r0 == r8) goto L_0x0072
            if (r0 == r4) goto L_0x0072
            r0 = r8
        L_0x006c:
            if (r1 == 0) goto L_0x0074
            if (r0 == 0) goto L_0x0074
            r0 = r8
            goto L_0x0017
        L_0x0072:
            r0 = r7
            goto L_0x006c
        L_0x0074:
            r0 = r7
            goto L_0x0017
        L_0x0076:
            r0 = r7
            goto L_0x0020
        L_0x0078:
            android.view.View r1 = r11.a
            boolean r0 = r1.isEnabled()
            if (r0 == 0) goto L_0x0087
            int r0 = r13.getActionMasked()
            switch(r0) {
                case 0: goto L_0x00a8;
                case 1: goto L_0x0121;
                case 2: goto L_0x00d5;
                case 3: goto L_0x0121;
                default: goto L_0x0087;
            }
        L_0x0087:
            r0 = r7
        L_0x0088:
            if (r0 == 0) goto L_0x0126
            boolean r0 = r11.b()
            if (r0 == 0) goto L_0x0126
            r9 = r8
        L_0x0091:
            if (r9 == 0) goto L_0x00a5
            long r0 = android.os.SystemClock.uptimeMillis()
            r2 = r0
            r6 = r5
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r0, r2, r4, r5, r6, r7)
            android.view.View r1 = r11.a
            r1.onTouchEvent(r0)
            r0.recycle()
        L_0x00a5:
            r0 = r9
            goto L_0x0020
        L_0x00a8:
            int r0 = r13.getPointerId(r7)
            r11.h = r0
            java.lang.Runnable r0 = r11.f
            if (r0 != 0) goto L_0x00b9
            adp r0 = new adp
            r0.<init>(r11)
            r11.f = r0
        L_0x00b9:
            java.lang.Runnable r0 = r11.f
            int r2 = r11.d
            long r2 = (long) r2
            r1.postDelayed(r0, r2)
            java.lang.Runnable r0 = r11.g
            if (r0 != 0) goto L_0x00cc
            adq r0 = new adq
            r0.<init>(r11)
            r11.g = r0
        L_0x00cc:
            java.lang.Runnable r0 = r11.g
            int r2 = r11.e
            long r2 = (long) r2
            r1.postDelayed(r0, r2)
            goto L_0x0087
        L_0x00d5:
            int r0 = r11.h
            int r0 = r13.findPointerIndex(r0)
            if (r0 < 0) goto L_0x0087
            float r2 = r13.getX(r0)
            float r0 = r13.getY(r0)
            float r3 = r11.c
            float r6 = -r3
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 < 0) goto L_0x011f
            float r6 = -r3
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 < 0) goto L_0x011f
            int r6 = r1.getRight()
            int r9 = r1.getLeft()
            int r6 = r6 - r9
            float r6 = (float) r6
            float r6 = r6 + r3
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x011f
            int r2 = r1.getBottom()
            int r6 = r1.getTop()
            int r2 = r2 - r6
            float r2 = (float) r2
            float r2 = r2 + r3
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x011f
            r0 = r8
        L_0x0110:
            if (r0 != 0) goto L_0x0087
            r11.d()
            android.view.ViewParent r0 = r1.getParent()
            r0.requestDisallowInterceptTouchEvent(r8)
            r0 = r8
            goto L_0x0088
        L_0x011f:
            r0 = r7
            goto L_0x0110
        L_0x0121:
            r11.d()
            goto L_0x0087
        L_0x0126:
            r9 = r7
            goto L_0x0091
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ado.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public void onViewAttachedToWindow(android.view.View view) {
    }

    public void onViewDetachedFromWindow(android.view.View view) {
        this.b = false;
        this.h = -1;
        if (this.f != null) {
            this.a.removeCallbacks(this.f);
        }
    }

    public boolean b() {
        defpackage.zz a2 = a();
        if (a2 != null && !a2.f()) {
            a2.d();
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean c() {
        defpackage.zz a2 = a();
        if (a2 != null && a2.f()) {
            a2.e();
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    public final void d() {
        if (this.g != null) {
            this.a.removeCallbacks(this.g);
        }
        if (this.f != null) {
            this.a.removeCallbacks(this.f);
        }
    }
}
