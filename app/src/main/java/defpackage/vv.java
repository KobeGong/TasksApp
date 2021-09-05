package defpackage;

/* renamed from: vv reason: default package */
/* compiled from: PG */
public final class vv {
    private static final android.view.animation.Interpolator u = new defpackage.vw();
    public int a;
    private int b;
    private int c = -1;
    private float[] d;
    private float[] e;
    private float[] f;
    private float[] g;
    private int[] h;
    private int[] i;
    private int[] j;
    private int k;
    private android.view.VelocityTracker l;
    private float m;
    private float n;
    private int o;
    private android.widget.OverScroller p;
    private final defpackage.vy q;
    private android.view.View r;
    private boolean s;
    private final android.view.ViewGroup t;
    private final java.lang.Runnable v = new defpackage.vx(this);

    public static defpackage.vv a(android.view.ViewGroup viewGroup, defpackage.vy vyVar) {
        return new defpackage.vv(viewGroup.getContext(), viewGroup, vyVar);
    }

    private vv(android.content.Context context, android.view.ViewGroup viewGroup, defpackage.vy vyVar) {
        if (viewGroup == null) {
            throw new java.lang.IllegalArgumentException("Parent view may not be null");
        } else if (vyVar == null) {
            throw new java.lang.IllegalArgumentException("Callback may not be null");
        } else {
            this.t = viewGroup;
            this.q = vyVar;
            android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(context);
            this.o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.a = viewConfiguration.getScaledTouchSlop();
            this.m = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.n = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.p = new android.widget.OverScroller(context, u);
        }
    }

    public final void a(android.view.View view, int i2) {
        if (view.getParent() != this.t) {
            throw new java.lang.IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.t + ")");
        }
        this.r = view;
        this.c = i2;
        this.q.b(view, i2);
        a(1);
    }

    private final void b() {
        this.c = -1;
        if (this.d != null) {
            java.util.Arrays.fill(this.d, 0.0f);
            java.util.Arrays.fill(this.e, 0.0f);
            java.util.Arrays.fill(this.f, 0.0f);
            java.util.Arrays.fill(this.g, 0.0f);
            java.util.Arrays.fill(this.h, 0);
            java.util.Arrays.fill(this.i, 0);
            java.util.Arrays.fill(this.j, 0);
            this.k = 0;
        }
        if (this.l != null) {
            this.l.recycle();
            this.l = null;
        }
    }

    public final boolean a(android.view.View view, int i2, int i3) {
        this.r = view;
        this.c = -1;
        boolean a2 = a(i2, i3, 0, 0);
        if (!a2 && this.b == 0 && this.r != null) {
            this.r = null;
        }
        return a2;
    }

    public final boolean a(int i2, int i3) {
        if (this.s) {
            return a(i2, i3, (int) this.l.getXVelocity(this.c), (int) this.l.getYVelocity(this.c));
        }
        throw new java.lang.IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    private final boolean a(int i2, int i3, int i4, int i5) {
        int left = this.r.getLeft();
        int top = this.r.getTop();
        int i6 = i2 - left;
        int i7 = i3 - top;
        if (i6 == 0 && i7 == 0) {
            this.p.abortAnimation();
            a(0);
            return false;
        }
        android.view.View view = this.r;
        int b2 = b(i4, (int) this.n, (int) this.m);
        int b3 = b(i5, (int) this.n, (int) this.m);
        int abs = java.lang.Math.abs(i6);
        int abs2 = java.lang.Math.abs(i7);
        int abs3 = java.lang.Math.abs(b2);
        int abs4 = java.lang.Math.abs(b3);
        int i8 = abs3 + abs4;
        int i9 = abs + abs2;
        this.p.startScroll(left, top, i6, i7, (int) (((b3 != 0 ? ((float) abs4) / ((float) i8) : ((float) abs2) / ((float) i9)) * ((float) a(i7, b3, this.q.a()))) + ((b2 != 0 ? ((float) abs3) / ((float) i8) : ((float) abs) / ((float) i9)) * ((float) a(i6, b2, this.q.a(view))))));
        a(2);
        return true;
    }

    private final int a(int i2, int i3, int i4) {
        int abs;
        if (i2 == 0) {
            return 0;
        }
        int width = this.t.getWidth();
        int i5 = width / 2;
        float sin = (((float) java.lang.Math.sin((double) ((java.lang.Math.min(1.0f, ((float) java.lang.Math.abs(i2)) / ((float) width)) - 0.5f) * 0.47123894f))) * ((float) i5)) + ((float) i5);
        int abs2 = java.lang.Math.abs(i3);
        if (abs2 > 0) {
            abs = java.lang.Math.round(java.lang.Math.abs(sin / ((float) abs2)) * 1000.0f) * 4;
        } else {
            abs = (int) (((((float) java.lang.Math.abs(i2)) / ((float) i4)) + 1.0f) * 256.0f);
        }
        return java.lang.Math.min(abs, 600);
    }

    private static int b(int i2, int i3, int i4) {
        int abs = java.lang.Math.abs(i2);
        if (abs < i3) {
            return 0;
        }
        if (abs <= i4) {
            return i2;
        }
        if (i2 <= 0) {
            return -i4;
        }
        return i4;
    }

    private static float a(float f2, float f3, float f4) {
        float abs = java.lang.Math.abs(f2);
        if (abs < f3) {
            return 0.0f;
        }
        if (abs <= f4) {
            return f2;
        }
        if (f2 <= 0.0f) {
            return -f4;
        }
        return f4;
    }

    public final boolean a() {
        if (this.b == 2) {
            boolean computeScrollOffset = this.p.computeScrollOffset();
            int currX = this.p.getCurrX();
            int currY = this.p.getCurrY();
            int left = currX - this.r.getLeft();
            int top = currY - this.r.getTop();
            if (left != 0) {
                ViewCompat.c(this.r, left);
            }
            if (top != 0) {
                ViewCompat.b(this.r, top);
            }
            if (!(left == 0 && top == 0)) {
                this.q.a(this.r, currX, currY);
            }
            if (computeScrollOffset && currX == this.p.getFinalX() && currY == this.p.getFinalY()) {
                this.p.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                this.t.post(this.v);
            }
        }
        if (this.b == 2) {
            return true;
        }
        return false;
    }

    private final void a(float f2, float f3) {
        this.s = true;
        this.q.a(this.r, f2, f3);
        this.s = false;
        if (this.b == 1) {
            a(0);
        }
    }

    private final void b(int i2) {
        if (this.d != null && c(i2)) {
            this.d[i2] = 0.0f;
            this.e[i2] = 0.0f;
            this.f[i2] = 0.0f;
            this.g[i2] = 0.0f;
            this.h[i2] = 0;
            this.i[i2] = 0;
            this.j[i2] = 0;
            this.k &= (1 << i2) ^ -1;
        }
    }

    private final void a(float f2, float f3, int i2) {
        int i3 = 0;
        if (this.d == null || this.d.length <= i2) {
            float[] fArr = new float[(i2 + 1)];
            float[] fArr2 = new float[(i2 + 1)];
            float[] fArr3 = new float[(i2 + 1)];
            float[] fArr4 = new float[(i2 + 1)];
            int[] iArr = new int[(i2 + 1)];
            int[] iArr2 = new int[(i2 + 1)];
            int[] iArr3 = new int[(i2 + 1)];
            if (this.d != null) {
                java.lang.System.arraycopy(this.d, 0, fArr, 0, this.d.length);
                java.lang.System.arraycopy(this.e, 0, fArr2, 0, this.e.length);
                java.lang.System.arraycopy(this.f, 0, fArr3, 0, this.f.length);
                java.lang.System.arraycopy(this.g, 0, fArr4, 0, this.g.length);
                java.lang.System.arraycopy(this.h, 0, iArr, 0, this.h.length);
                java.lang.System.arraycopy(this.i, 0, iArr2, 0, this.i.length);
                java.lang.System.arraycopy(this.j, 0, iArr3, 0, this.j.length);
            }
            this.d = fArr;
            this.e = fArr2;
            this.f = fArr3;
            this.g = fArr4;
            this.h = iArr;
            this.i = iArr2;
            this.j = iArr3;
        }
        float[] fArr5 = this.d;
        this.f[i2] = f2;
        fArr5[i2] = f2;
        float[] fArr6 = this.e;
        this.g[i2] = f3;
        fArr6[i2] = f3;
        int[] iArr4 = this.h;
        int i4 = (int) f2;
        int i5 = (int) f3;
        if (i4 < this.t.getLeft() + this.o) {
            i3 = 1;
        }
        if (i5 < this.t.getTop() + this.o) {
            i3 |= 4;
        }
        if (i4 > this.t.getRight() - this.o) {
            i3 |= 2;
        }
        if (i5 > this.t.getBottom() - this.o) {
            i3 |= 8;
        }
        iArr4[i2] = i3;
        this.k |= 1 << i2;
    }

    private final void c(android.view.MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i2 = 0; i2 < pointerCount; i2++) {
            int pointerId = motionEvent.getPointerId(i2);
            if (d(pointerId)) {
                float x = motionEvent.getX(i2);
                float y = motionEvent.getY(i2);
                this.f[pointerId] = x;
                this.g[pointerId] = y;
            }
        }
    }

    private final boolean c(int i2) {
        return (this.k & (1 << i2)) != 0;
    }

    /* access modifiers changed from: 0000 */
    public final void a(int i2) {
        this.t.removeCallbacks(this.v);
        if (this.b != i2) {
            this.b = i2;
            this.q.a(i2);
            if (this.b == 0) {
                this.r = null;
            }
        }
    }

    private final boolean b(android.view.View view, int i2) {
        if (view == this.r && this.c == i2) {
            return true;
        }
        if (view == null || !this.q.a(view, i2)) {
            return false;
        }
        this.c = i2;
        a(view, i2);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d6, code lost:
        if (r8 != r7) goto L_0x00de;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(android.view.MotionEvent r14) {
        /*
            r13 = this;
            int r0 = r14.getActionMasked()
            int r1 = r14.getActionIndex()
            if (r0 != 0) goto L_0x000d
            r13.b()
        L_0x000d:
            android.view.VelocityTracker r2 = r13.l
            if (r2 != 0) goto L_0x0017
            android.view.VelocityTracker r2 = android.view.VelocityTracker.obtain()
            r13.l = r2
        L_0x0017:
            android.view.VelocityTracker r2 = r13.l
            r2.addMovement(r14)
            switch(r0) {
                case 0: goto L_0x0026;
                case 1: goto L_0x0102;
                case 2: goto L_0x006f;
                case 3: goto L_0x0102;
                case 4: goto L_0x001f;
                case 5: goto L_0x0049;
                case 6: goto L_0x00f9;
                default: goto L_0x001f;
            }
        L_0x001f:
            int r0 = r13.b
            r1 = 1
            if (r0 != r1) goto L_0x0107
            r0 = 1
        L_0x0025:
            return r0
        L_0x0026:
            float r0 = r14.getX()
            float r1 = r14.getY()
            r2 = 0
            int r2 = r14.getPointerId(r2)
            r13.a(r0, r1, r2)
            int r0 = (int) r0
            int r1 = (int) r1
            android.view.View r0 = r13.b(r0, r1)
            android.view.View r1 = r13.r
            if (r0 != r1) goto L_0x001f
            int r1 = r13.b
            r3 = 2
            if (r1 != r3) goto L_0x001f
            r13.b(r0, r2)
            goto L_0x001f
        L_0x0049:
            int r0 = r14.getPointerId(r1)
            float r2 = r14.getX(r1)
            float r1 = r14.getY(r1)
            r13.a(r2, r1, r0)
            int r3 = r13.b
            if (r3 == 0) goto L_0x001f
            int r3 = r13.b
            r4 = 2
            if (r3 != r4) goto L_0x001f
            int r2 = (int) r2
            int r1 = (int) r1
            android.view.View r1 = r13.b(r2, r1)
            android.view.View r2 = r13.r
            if (r1 != r2) goto L_0x001f
            r13.b(r1, r0)
            goto L_0x001f
        L_0x006f:
            float[] r0 = r13.d
            if (r0 == 0) goto L_0x001f
            float[] r0 = r13.e
            if (r0 == 0) goto L_0x001f
            int r2 = r14.getPointerCount()
            r0 = 0
            r1 = r0
        L_0x007d:
            if (r1 >= r2) goto L_0x00f4
            int r3 = r14.getPointerId(r1)
            boolean r0 = r13.d(r3)
            if (r0 == 0) goto L_0x00ee
            float r0 = r14.getX(r1)
            float r4 = r14.getY(r1)
            float[] r5 = r13.d
            r5 = r5[r3]
            float r5 = r0 - r5
            float[] r6 = r13.e
            r6 = r6[r3]
            float r6 = r4 - r6
            int r0 = (int) r0
            int r4 = (int) r4
            android.view.View r4 = r13.b(r0, r4)
            if (r4 == 0) goto L_0x00f2
            boolean r0 = r13.a(r4, r5, r6)
            if (r0 == 0) goto L_0x00f2
            r0 = 1
        L_0x00ac:
            if (r0 == 0) goto L_0x00de
            int r7 = r4.getLeft()
            int r8 = (int) r5
            int r8 = r8 + r7
            vy r9 = r13.q
            int r8 = r9.c(r4, r8)
            int r9 = r4.getTop()
            int r10 = (int) r6
            int r10 = r10 + r9
            vy r11 = r13.q
            int r10 = r11.d(r4, r10)
            vy r11 = r13.q
            int r11 = r11.a(r4)
            vy r12 = r13.q
            int r12 = r12.a()
            if (r11 == 0) goto L_0x00d8
            if (r11 <= 0) goto L_0x00de
            if (r8 != r7) goto L_0x00de
        L_0x00d8:
            if (r12 == 0) goto L_0x00f4
            if (r12 <= 0) goto L_0x00de
            if (r10 == r9) goto L_0x00f4
        L_0x00de:
            r13.b(r5, r6, r3)
            int r5 = r13.b
            r6 = 1
            if (r5 == r6) goto L_0x00f4
            if (r0 == 0) goto L_0x00ee
            boolean r0 = r13.b(r4, r3)
            if (r0 != 0) goto L_0x00f4
        L_0x00ee:
            int r0 = r1 + 1
            r1 = r0
            goto L_0x007d
        L_0x00f2:
            r0 = 0
            goto L_0x00ac
        L_0x00f4:
            r13.c(r14)
            goto L_0x001f
        L_0x00f9:
            int r0 = r14.getPointerId(r1)
            r13.b(r0)
            goto L_0x001f
        L_0x0102:
            r13.b()
            goto L_0x001f
        L_0x0107:
            r0 = 0
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vv.a(android.view.MotionEvent):boolean");
    }

    public final void b(android.view.MotionEvent motionEvent) {
        int i2;
        int i3 = 0;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            b();
        }
        if (this.l == null) {
            this.l = android.view.VelocityTracker.obtain();
        }
        this.l.addMovement(motionEvent);
        switch (actionMasked) {
            case 0:
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                int pointerId = motionEvent.getPointerId(0);
                android.view.View b2 = b((int) x, (int) y);
                a(x, y, pointerId);
                b(b2, pointerId);
                return;
            case 1:
                if (this.b == 1) {
                    c();
                }
                b();
                return;
            case 2:
                if (this.b != 1) {
                    int pointerCount = motionEvent.getPointerCount();
                    while (i3 < pointerCount) {
                        int pointerId2 = motionEvent.getPointerId(i3);
                        if (d(pointerId2)) {
                            float x2 = motionEvent.getX(i3);
                            float y2 = motionEvent.getY(i3);
                            float f2 = x2 - this.d[pointerId2];
                            float f3 = y2 - this.e[pointerId2];
                            b(f2, f3, pointerId2);
                            if (this.b != 1) {
                                android.view.View b3 = b((int) x2, (int) y2);
                                if (a(b3, f2, f3) && b(b3, pointerId2)) {
                                }
                            }
                            c(motionEvent);
                            return;
                        }
                        i3++;
                    }
                    c(motionEvent);
                    return;
                } else if (d(this.c)) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.c);
                    float x3 = motionEvent.getX(findPointerIndex);
                    int i4 = (int) (x3 - this.f[this.c]);
                    int y3 = (int) (motionEvent.getY(findPointerIndex) - this.g[this.c]);
                    int left = this.r.getLeft() + i4;
                    int top = this.r.getTop() + y3;
                    int left2 = this.r.getLeft();
                    int top2 = this.r.getTop();
                    if (i4 != 0) {
                        left = this.q.c(this.r, left);
                        ViewCompat.c(this.r, left - left2);
                    }
                    if (y3 != 0) {
                        top = this.q.d(this.r, top);
                        ViewCompat.b(this.r, top - top2);
                    }
                    if (!(i4 == 0 && y3 == 0)) {
                        this.q.a(this.r, left, top);
                    }
                    c(motionEvent);
                    return;
                } else {
                    return;
                }
            case 3:
                if (this.b == 1) {
                    a(0.0f, 0.0f);
                }
                b();
                return;
            case 5:
                int pointerId3 = motionEvent.getPointerId(actionIndex);
                float x4 = motionEvent.getX(actionIndex);
                float y4 = motionEvent.getY(actionIndex);
                a(x4, y4, pointerId3);
                if (this.b == 0) {
                    b(b((int) x4, (int) y4), pointerId3);
                    return;
                }
                int i5 = (int) x4;
                int i6 = (int) y4;
                android.view.View view = this.r;
                if (view != null && i5 >= view.getLeft() && i5 < view.getRight() && i6 >= view.getTop() && i6 < view.getBottom()) {
                    i3 = 1;
                }
                if (i3 != 0) {
                    b(this.r, pointerId3);
                    return;
                }
                return;
            case 6:
                int pointerId4 = motionEvent.getPointerId(actionIndex);
                if (this.b == 1 && pointerId4 == this.c) {
                    int pointerCount2 = motionEvent.getPointerCount();
                    while (true) {
                        if (i3 < pointerCount2) {
                            int pointerId5 = motionEvent.getPointerId(i3);
                            if (pointerId5 != this.c) {
                                if (b((int) motionEvent.getX(i3), (int) motionEvent.getY(i3)) == this.r && b(this.r, pointerId5)) {
                                    i2 = this.c;
                                }
                            }
                            i3++;
                        } else {
                            i2 = -1;
                        }
                    }
                    if (i2 == -1) {
                        c();
                    }
                }
                b(pointerId4);
                return;
            default:
                return;
        }
    }

    private final void b(float f2, float f3, int i2) {
        int i3 = 1;
        if (!a(f2, f3, i2, 1)) {
            i3 = 0;
        }
        if (a(f3, f2, i2, 4)) {
            i3 |= 4;
        }
        if (a(f2, f3, i2, 2)) {
            i3 |= 2;
        }
        if (a(f3, f2, i2, 8)) {
            i3 |= 8;
        }
        if (i3 != 0) {
            int[] iArr = this.i;
            iArr[i2] = i3 | iArr[i2];
        }
    }

    private final boolean a(float f2, float f3, int i2, int i3) {
        float abs = java.lang.Math.abs(f2);
        float abs2 = java.lang.Math.abs(f3);
        if ((this.h[i2] & i3) != i3 || (i3 & 0) == 0 || (this.j[i2] & i3) == i3 || (this.i[i2] & i3) == i3) {
            return false;
        }
        if ((abs > ((float) this.a) || abs2 > ((float) this.a)) && (this.i[i2] & i3) == 0 && abs > ((float) this.a)) {
            return true;
        }
        return false;
    }

    private final boolean a(android.view.View view, float f2, float f3) {
        boolean z;
        boolean z2;
        if (view == null) {
            return false;
        }
        if (this.q.a(view) > 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.q.a() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z || !z2) {
            if (z) {
                if (java.lang.Math.abs(f2) > ((float) this.a)) {
                    return true;
                }
                return false;
            } else if (!z2 || java.lang.Math.abs(f3) <= ((float) this.a)) {
                return false;
            } else {
                return true;
            }
        } else if ((f2 * f2) + (f3 * f3) > ((float) (this.a * this.a))) {
            return true;
        } else {
            return false;
        }
    }

    private final void c() {
        this.l.computeCurrentVelocity(1000, this.m);
        a(a(this.l.getXVelocity(this.c), this.n, this.m), a(this.l.getYVelocity(this.c), this.n, this.m));
    }

    private final android.view.View b(int i2, int i3) {
        for (int childCount = this.t.getChildCount() - 1; childCount >= 0; childCount--) {
            android.view.View childAt = this.t.getChildAt(childCount);
            if (i2 >= childAt.getLeft() && i2 < childAt.getRight() && i3 >= childAt.getTop() && i3 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    private final boolean d(int i2) {
        if (c(i2)) {
            return true;
        }
        android.util.Log.e("ViewDragHelper", "Ignoring pointerId=" + i2 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }
}
