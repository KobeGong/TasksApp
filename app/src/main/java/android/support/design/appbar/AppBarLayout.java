package android.support.design.appbar;

@defpackage.gy(a = android.support.design.appbar.AppBarLayout.Behavior.class)
/* compiled from: PG */
public class AppBarLayout extends android.widget.LinearLayout {
    public boolean a;
    public int b;
    public defpackage.tk c;
    public java.util.List d;
    public boolean e;
    private int f;
    private int g;
    private int h;
    private boolean i;
    private int[] j;

    /* compiled from: PG */
    public class BaseBehavior extends defpackage.de {
        public int a;
        public defpackage.cw b;
        private int d;
        private android.animation.ValueAnimator e;
        private int f = -1;
        private boolean g;
        private float h;
        private java.lang.ref.WeakReference i;

        public BaseBehavior() {
        }

        public BaseBehavior(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x001c, code lost:
            if ((r5.getHeight() - r7.getHeight()) <= r6.getHeight()) goto L_0x001e;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean a(android.support.design.widget.CoordinatorLayout r5, android.support.design.appbar.AppBarLayout r6, android.view.View r7, android.view.View r8, int r9, int r10) {
            /*
                r4 = this;
                r0 = 1
                r1 = 0
                r2 = r9 & 2
                if (r2 == 0) goto L_0x0031
                int r2 = r6.c()
                if (r2 == 0) goto L_0x002f
                r2 = r0
            L_0x000d:
                if (r2 == 0) goto L_0x0031
                int r2 = r5.getHeight()
                int r3 = r7.getHeight()
                int r2 = r2 - r3
                int r3 = r6.getHeight()
                if (r2 > r3) goto L_0x0031
            L_0x001e:
                if (r0 == 0) goto L_0x0029
                android.animation.ValueAnimator r1 = r4.e
                if (r1 == 0) goto L_0x0029
                android.animation.ValueAnimator r1 = r4.e
                r1.cancel()
            L_0x0029:
                r1 = 0
                r4.i = r1
                r4.d = r10
                return r0
            L_0x002f:
                r2 = r1
                goto L_0x000d
            L_0x0031:
                r0 = r1
                goto L_0x001e
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.design.appbar.AppBarLayout.BaseBehavior.a(android.support.design.widget.CoordinatorLayout, android.support.design.appbar.AppBarLayout, android.view.View, android.view.View, int, int):boolean");
        }

        private final void a(int i2, android.support.design.appbar.AppBarLayout appBarLayout, android.view.View view, int i3) {
            if (i3 == 1) {
                int a2 = a();
                if ((i2 < 0 && a2 == 0) || (i2 > 0 && a2 == (-appBarLayout.e()))) {
                    defpackage.sn.c(view);
                }
            }
        }

        private final void a(android.support.design.widget.CoordinatorLayout coordinatorLayout, android.support.design.appbar.AppBarLayout appBarLayout, int i2) {
            int height;
            int abs = java.lang.Math.abs(a() - i2);
            float abs2 = java.lang.Math.abs(0.0f);
            if (abs2 > 0.0f) {
                height = java.lang.Math.round((((float) abs) / abs2) * 1000.0f) * 3;
            } else {
                height = (int) (((((float) abs) / ((float) appBarLayout.getHeight())) + 1.0f) * 150.0f);
            }
            int a2 = a();
            if (a2 != i2) {
                if (this.e == null) {
                    this.e = new android.animation.ValueAnimator();
                    this.e.setInterpolator(defpackage.cs.d);
                    this.e.addUpdateListener(new defpackage.cv(this, coordinatorLayout, appBarLayout));
                } else {
                    this.e.cancel();
                }
                this.e.setDuration((long) java.lang.Math.min(height, 600));
                this.e.setIntValues(new int[]{a2, i2});
                this.e.start();
            } else if (this.e != null && this.e.isRunning()) {
                this.e.cancel();
            }
        }

        /* access modifiers changed from: private */
        public final void a(android.support.design.widget.CoordinatorLayout coordinatorLayout, android.support.design.appbar.AppBarLayout appBarLayout) {
            int i2;
            int i3;
            int i4;
            int i5;
            int a2 = a();
            int childCount = appBarLayout.getChildCount();
            int i6 = 0;
            while (true) {
                if (i6 >= childCount) {
                    i2 = -1;
                    break;
                }
                android.view.View childAt = appBarLayout.getChildAt(i6);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                defpackage.da daVar = (defpackage.da) childAt.getLayoutParams();
                if (a(daVar.a, 32)) {
                    int i7 = top - daVar.topMargin;
                    i4 = daVar.bottomMargin + bottom;
                    i5 = i7;
                } else {
                    i4 = bottom;
                    i5 = top;
                }
                if (i5 <= (-a2) && i4 >= (-a2)) {
                    i2 = i6;
                    break;
                }
                i6++;
            }
            if (i2 >= 0) {
                android.view.View childAt2 = appBarLayout.getChildAt(i2);
                defpackage.da daVar2 = (defpackage.da) childAt2.getLayoutParams();
                int i8 = daVar2.a;
                if ((i8 & 17) == 17) {
                    int i9 = -childAt2.getTop();
                    int i10 = -childAt2.getBottom();
                    if (i2 == appBarLayout.getChildCount() - 1) {
                        i10 += appBarLayout.f();
                    }
                    if (a(i8, 2)) {
                        i10 += defpackage.sn.a.f(childAt2);
                        i3 = i9;
                    } else if (a(i8, 5)) {
                        i3 = defpackage.sn.a.f(childAt2) + i10;
                        if (a2 >= i3) {
                            i10 = i3;
                            i3 = i9;
                        }
                    } else {
                        i3 = i9;
                    }
                    if (a(i8, 32)) {
                        i3 += daVar2.topMargin;
                        i10 -= daVar2.bottomMargin;
                    }
                    if (a2 >= (i10 + i3) / 2) {
                        i10 = i3;
                    }
                    a(coordinatorLayout, appBarLayout, defpackage.gm.a(i10, -appBarLayout.c(), 0));
                }
            }
        }

        private static boolean a(int i2, int i3) {
            return (i2 & i3) == i3;
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x004a  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0052  */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x009c  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static void a(android.support.design.widget.CoordinatorLayout r7, android.support.design.appbar.AppBarLayout r8, int r9, int r10, boolean r11) {
            /*
                r1 = 1
                r2 = 0
                int r4 = java.lang.Math.abs(r9)
                int r5 = r8.getChildCount()
                r3 = r2
            L_0x000b:
                if (r3 >= r5) goto L_0x0082
                android.view.View r0 = r8.getChildAt(r3)
                int r6 = r0.getTop()
                if (r4 < r6) goto L_0x007e
                int r6 = r0.getBottom()
                if (r4 > r6) goto L_0x007e
                r3 = r0
            L_0x001e:
                if (r3 == 0) goto L_0x007d
                android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
                da r0 = (defpackage.da) r0
                int r0 = r0.a
                r4 = r0 & 1
                if (r4 == 0) goto L_0x00a2
                sw r4 = defpackage.sn.a
                int r4 = r4.f(r3)
                if (r10 <= 0) goto L_0x0087
                r5 = r0 & 12
                if (r5 == 0) goto L_0x0087
                int r0 = -r9
                int r3 = r3.getBottom()
                int r3 = r3 - r4
                int r4 = r8.f()
                int r3 = r3 - r4
                if (r0 < r3) goto L_0x0085
                r0 = r1
            L_0x0046:
                boolean r3 = r8.e
                if (r3 == r0) goto L_0x009c
                r8.e = r0
                r8.refreshDrawableState()
                r0 = r1
            L_0x0050:
                if (r11 != 0) goto L_0x007a
                if (r0 == 0) goto L_0x007d
                java.util.List r4 = r7.b(r8)
                int r5 = r4.size()
                r3 = r2
            L_0x005d:
                if (r3 >= r5) goto L_0x0078
                java.lang.Object r0 = r4.get(r3)
                android.view.View r0 = (android.view.View) r0
                android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
                ha r0 = (defpackage.ha) r0
                gx r0 = r0.a
                boolean r6 = r0 instanceof android.support.design.appbar.AppBarLayout.ScrollingViewBehavior
                if (r6 == 0) goto L_0x009e
                android.support.design.appbar.AppBarLayout$ScrollingViewBehavior r0 = (android.support.design.appbar.AppBarLayout.ScrollingViewBehavior) r0
                int r0 = r0.c
                if (r0 == 0) goto L_0x0078
                r2 = r1
            L_0x0078:
                if (r2 == 0) goto L_0x007d
            L_0x007a:
                r8.jumpDrawablesToCurrentState()
            L_0x007d:
                return
            L_0x007e:
                int r0 = r3 + 1
                r3 = r0
                goto L_0x000b
            L_0x0082:
                r0 = 0
                r3 = r0
                goto L_0x001e
            L_0x0085:
                r0 = r2
                goto L_0x0046
            L_0x0087:
                r0 = r0 & 2
                if (r0 == 0) goto L_0x00a2
                int r0 = -r9
                int r3 = r3.getBottom()
                int r3 = r3 - r4
                int r4 = r8.f()
                int r3 = r3 - r4
                if (r0 < r3) goto L_0x009a
                r0 = r1
                goto L_0x0046
            L_0x009a:
                r0 = r2
                goto L_0x0046
            L_0x009c:
                r0 = r2
                goto L_0x0050
            L_0x009e:
                int r0 = r3 + 1
                r3 = r0
                goto L_0x005d
            L_0x00a2:
                r0 = r2
                goto L_0x0046
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.design.appbar.AppBarLayout.BaseBehavior.a(android.support.design.widget.CoordinatorLayout, android.support.design.appbar.AppBarLayout, int, int, boolean):void");
        }

        /* access modifiers changed from: 0000 */
        public final int a() {
            return c() + this.a;
        }

        /* access modifiers changed from: 0000 */
        public final /* synthetic */ int a(android.view.View view) {
            return ((android.support.design.appbar.AppBarLayout) view).c();
        }

        /* access modifiers changed from: 0000 */
        public final /* synthetic */ int b(android.view.View view) {
            return -((android.support.design.appbar.AppBarLayout) view).e();
        }

        /* access modifiers changed from: 0000 */
        public final /* synthetic */ boolean b() {
            if (this.b == null) {
                if (this.i != null) {
                    android.view.View view = (android.view.View) this.i.get();
                    if (view == null || !view.isShown() || view.canScrollVertically(-1)) {
                        return false;
                    }
                }
                return true;
            } else if (!this.b.a.d) {
                return true;
            } else {
                return false;
            }
        }

        /* access modifiers changed from: 0000 */
        public final /* synthetic */ int a(android.support.design.widget.CoordinatorLayout coordinatorLayout, android.view.View view, int i2, int i3, int i4) {
            int i5;
            int i6;
            android.support.design.appbar.AppBarLayout appBarLayout = (android.support.design.appbar.AppBarLayout) view;
            int a2 = a();
            if (i3 == 0 || a2 < i3 || a2 > i4) {
                this.a = 0;
                return 0;
            }
            int a3 = defpackage.gm.a(i2, i3, i4);
            if (a2 == a3) {
                return 0;
            }
            if (appBarLayout.a) {
                int abs = java.lang.Math.abs(a3);
                int childCount = appBarLayout.getChildCount();
                int i7 = 0;
                while (true) {
                    if (i7 >= childCount) {
                        break;
                    }
                    android.view.View childAt = appBarLayout.getChildAt(i7);
                    defpackage.da daVar = (defpackage.da) childAt.getLayoutParams();
                    android.view.animation.Interpolator interpolator = daVar.b;
                    if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                        i7++;
                    } else if (interpolator != null) {
                        int i8 = daVar.a;
                        if ((i8 & 1) != 0) {
                            i6 = daVar.bottomMargin + childAt.getHeight() + daVar.topMargin + 0;
                            if ((i8 & 2) != 0) {
                                i6 -= defpackage.sn.a.f(childAt);
                            }
                        } else {
                            i6 = 0;
                        }
                        if (defpackage.sn.a.h(childAt)) {
                            i6 -= appBarLayout.f();
                        }
                        if (i6 > 0) {
                            i5 = (java.lang.Math.round(interpolator.getInterpolation(((float) (abs - childAt.getTop())) / ((float) i6)) * ((float) i6)) + childAt.getTop()) * java.lang.Integer.signum(a3);
                        }
                    }
                }
                i5 = a3;
            } else {
                i5 = a3;
            }
            boolean a_ = a_(i5);
            int i9 = a2 - a3;
            this.a = a3 - i5;
            if (!a_ && appBarLayout.a) {
                java.util.List b2 = coordinatorLayout.a.b(appBarLayout);
                if (b2 != null && !b2.isEmpty()) {
                    for (int i10 = 0; i10 < b2.size(); i10++) {
                        android.view.View view2 = (android.view.View) b2.get(i10);
                        defpackage.gx gxVar = ((defpackage.ha) view2.getLayoutParams()).a;
                        if (gxVar != null) {
                            gxVar.a(coordinatorLayout, view2, (android.view.View) appBarLayout);
                        }
                    }
                }
            }
            appBarLayout.a(c());
            a(coordinatorLayout, appBarLayout, a3, a3 < a2 ? -1 : 1, false);
            return i9;
        }

        public final /* synthetic */ boolean a(android.support.design.widget.CoordinatorLayout coordinatorLayout, android.view.View view, int i2) {
            int round;
            android.support.design.appbar.AppBarLayout appBarLayout = (android.support.design.appbar.AppBarLayout) view;
            boolean a2 = super.a(coordinatorLayout, appBarLayout, i2);
            int i3 = appBarLayout.b;
            if (this.f >= 0 && (i3 & 8) == 0) {
                android.view.View childAt = appBarLayout.getChildAt(this.f);
                int i4 = -childAt.getBottom();
                if (this.g) {
                    round = defpackage.sn.a.f(childAt) + appBarLayout.f() + i4;
                } else {
                    round = java.lang.Math.round(((float) childAt.getHeight()) * this.h) + i4;
                }
                a_(coordinatorLayout, appBarLayout, round);
            } else if (i3 != 0) {
                boolean z = (i3 & 4) != 0;
                if ((i3 & 2) != 0) {
                    int i5 = -appBarLayout.c();
                    if (z) {
                        a(coordinatorLayout, appBarLayout, i5);
                    } else {
                        a_(coordinatorLayout, appBarLayout, i5);
                    }
                } else if ((i3 & 1) != 0) {
                    if (z) {
                        a(coordinatorLayout, appBarLayout, 0);
                    } else {
                        a_(coordinatorLayout, appBarLayout, 0);
                    }
                }
            }
            appBarLayout.b = 0;
            this.f = -1;
            a_(defpackage.gm.a(c(), -appBarLayout.c(), 0));
            a(coordinatorLayout, appBarLayout, c(), 0, true);
            appBarLayout.a(c());
            return a2;
        }

        public final /* synthetic */ android.os.Parcelable b(android.support.design.widget.CoordinatorLayout coordinatorLayout, android.view.View view) {
            boolean z = false;
            android.support.design.appbar.AppBarLayout appBarLayout = (android.support.design.appbar.AppBarLayout) view;
            android.os.Parcelable b2 = super.b(coordinatorLayout, appBarLayout);
            int c = c();
            int childCount = appBarLayout.getChildCount();
            int i2 = 0;
            while (i2 < childCount) {
                android.view.View childAt = appBarLayout.getChildAt(i2);
                int bottom = childAt.getBottom() + c;
                if (childAt.getTop() + c > 0 || bottom < 0) {
                    i2++;
                } else {
                    defpackage.cx cxVar = new defpackage.cx(b2);
                    cxVar.a = i2;
                    if (bottom == defpackage.sn.a.f(childAt) + appBarLayout.f()) {
                        z = true;
                    }
                    cxVar.c = z;
                    cxVar.b = ((float) bottom) / ((float) childAt.getHeight());
                    return cxVar;
                }
            }
            return b2;
        }

        public final /* synthetic */ void a(android.support.design.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.os.Parcelable parcelable) {
            android.support.design.appbar.AppBarLayout appBarLayout = (android.support.design.appbar.AppBarLayout) view;
            if (parcelable instanceof defpackage.cx) {
                defpackage.cx cxVar = (defpackage.cx) parcelable;
                super.a(coordinatorLayout, (android.view.View) appBarLayout, cxVar.e);
                this.f = cxVar.a;
                this.h = cxVar.b;
                this.g = cxVar.c;
                return;
            }
            super.a(coordinatorLayout, (android.view.View) appBarLayout, parcelable);
            this.f = -1;
        }

        public final /* synthetic */ void a(android.support.design.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2, int i2, int[] iArr, int i3) {
            int i4;
            int i5;
            android.support.design.appbar.AppBarLayout appBarLayout = (android.support.design.appbar.AppBarLayout) view;
            if (i2 != 0) {
                if (i2 < 0) {
                    i4 = -appBarLayout.c();
                    i5 = i4 + appBarLayout.d();
                } else {
                    i4 = -appBarLayout.c();
                    i5 = 0;
                }
                if (i4 != i5) {
                    iArr[1] = b(coordinatorLayout, appBarLayout, i2, i4, i5);
                    a(i2, appBarLayout, view2, i3);
                }
            }
        }

        public final /* synthetic */ void a(android.support.design.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2, int i2, int i3, int i4) {
            android.support.design.appbar.AppBarLayout appBarLayout = (android.support.design.appbar.AppBarLayout) view;
            if (i3 < 0) {
                b(coordinatorLayout, appBarLayout, i3, -appBarLayout.e(), 0);
                a(i3, appBarLayout, view2, i4);
            }
        }

        public final /* synthetic */ void a(android.support.design.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2, int i2) {
            android.support.design.appbar.AppBarLayout appBarLayout = (android.support.design.appbar.AppBarLayout) view;
            if (this.d == 0 || i2 == 1) {
                a(coordinatorLayout, appBarLayout);
            }
            this.i = new java.lang.ref.WeakReference(view2);
        }

        public final /* synthetic */ boolean a(android.support.design.widget.CoordinatorLayout coordinatorLayout, android.view.View view, int i2, int i3, int i4, int i5) {
            android.support.design.appbar.AppBarLayout appBarLayout = (android.support.design.appbar.AppBarLayout) view;
            if (((defpackage.ha) appBarLayout.getLayoutParams()).height != -2) {
                return super.a(coordinatorLayout, (android.view.View) appBarLayout, i2, i3, i4, i5);
            }
            coordinatorLayout.a((android.view.View) appBarLayout, i2, i3, android.view.View.MeasureSpec.makeMeasureSpec(0, 0), i5);
            return true;
        }
    }

    /* compiled from: PG */
    public class Behavior extends android.support.design.appbar.AppBarLayout.BaseBehavior {
        public Behavior() {
        }

        public Behavior(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* compiled from: PG */
    public class ScrollingViewBehavior extends defpackage.dg {
        public ScrollingViewBehavior() {
        }

        public ScrollingViewBehavior(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.dh.D);
            this.c = obtainStyledAttributes.getDimensionPixelSize(defpackage.dh.E, 0);
            obtainStyledAttributes.recycle();
        }

        public final boolean a_(android.view.View view) {
            return view instanceof android.support.design.appbar.AppBarLayout;
        }

        public final boolean a(android.support.design.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2) {
            defpackage.gx gxVar = ((defpackage.ha) view2.getLayoutParams()).a;
            if (gxVar instanceof android.support.design.appbar.AppBarLayout.BaseBehavior) {
                int bottom = view2.getBottom() - view.getTop();
                defpackage.sn.b(view, ((((android.support.design.appbar.AppBarLayout.BaseBehavior) gxVar).a + bottom) + this.b) - d(view2));
            }
            return false;
        }

        public final boolean a(android.support.design.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.graphics.Rect rect, boolean z) {
            boolean z2;
            android.support.design.appbar.AppBarLayout b = b(coordinatorLayout.a(view));
            if (b != null) {
                rect.offset(view.getLeft(), view.getTop());
                android.graphics.Rect rect2 = this.a;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    if (!z) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    b.a(false, z2, true);
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        public final float b(android.view.View view) {
            int i;
            if (view instanceof android.support.design.appbar.AppBarLayout) {
                android.support.design.appbar.AppBarLayout appBarLayout = (android.support.design.appbar.AppBarLayout) view;
                int c = appBarLayout.c();
                int d = appBarLayout.d();
                defpackage.gx gxVar = ((defpackage.ha) appBarLayout.getLayoutParams()).a;
                if (gxVar instanceof android.support.design.appbar.AppBarLayout.BaseBehavior) {
                    i = ((android.support.design.appbar.AppBarLayout.BaseBehavior) gxVar).a();
                } else {
                    i = 0;
                }
                if (d != 0 && c + i <= d) {
                    return 0.0f;
                }
                int i2 = c - d;
                if (i2 != 0) {
                    return (((float) i) / ((float) i2)) + 1.0f;
                }
            }
            return 0.0f;
        }

        private static android.support.design.appbar.AppBarLayout b(java.util.List list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                android.view.View view = (android.view.View) list.get(i);
                if (view instanceof android.support.design.appbar.AppBarLayout) {
                    return (android.support.design.appbar.AppBarLayout) view;
                }
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        public final int c(android.view.View view) {
            if (view instanceof android.support.design.appbar.AppBarLayout) {
                return ((android.support.design.appbar.AppBarLayout) view).c();
            }
            return super.c(view);
        }

        /* access modifiers changed from: 0000 */
        public final /* synthetic */ android.view.View a(java.util.List list) {
            return b(list);
        }

        public final /* bridge */ /* synthetic */ boolean a(android.support.design.widget.CoordinatorLayout coordinatorLayout, android.view.View view, int i, int i2, int i3, int i4) {
            return super.a(coordinatorLayout, view, i, i2, i3, i4);
        }
    }

    public AppBarLayout(android.content.Context context) {
        this(context, null);
    }

    public AppBarLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = -1;
        this.g = -1;
        this.h = -1;
        this.b = 0;
        setOrientation(1);
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            defpackage.dk.a(this);
            defpackage.dk.a((android.view.View) this, attributeSet);
        }
        android.content.res.TypedArray a2 = defpackage.fp.a(context, attributeSet, defpackage.dh.a, 0, 2132017714);
        defpackage.sn.a((android.view.View) this, a2.getDrawable(defpackage.dh.e));
        if (a2.hasValue(defpackage.dh.i)) {
            a(a2.getBoolean(defpackage.dh.i, false), false, false);
        }
        if (android.os.Build.VERSION.SDK_INT >= 21 && a2.hasValue(defpackage.dh.h)) {
            defpackage.dk.a((android.view.View) this, (float) a2.getDimensionPixelSize(defpackage.dh.h, 0));
        }
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            if (a2.hasValue(defpackage.dh.f)) {
                setKeyboardNavigationCluster(a2.getBoolean(defpackage.dh.f, false));
            }
            if (a2.hasValue(defpackage.dh.g)) {
                setTouchscreenBlocksFocus(a2.getBoolean(defpackage.dh.g, false));
            }
        }
        a2.recycle();
        defpackage.sn.a((android.view.View) this, (defpackage.sl) new defpackage.es(this));
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        a();
    }

    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        boolean z2;
        boolean z3;
        super.onLayout(z, i2, i3, i4, i5);
        a();
        this.a = false;
        int childCount = getChildCount();
        int i6 = 0;
        while (true) {
            if (i6 >= childCount) {
                break;
            } else if (((defpackage.da) getChildAt(i6).getLayoutParams()).b != null) {
                this.a = true;
                break;
            } else {
                i6++;
            }
        }
        int childCount2 = getChildCount();
        int i7 = 0;
        while (true) {
            if (i7 >= childCount2) {
                z2 = false;
                break;
            }
            defpackage.da daVar = (defpackage.da) getChildAt(i7).getLayoutParams();
            if ((daVar.a & 1) != 1 || (daVar.a & 10) == 0) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (z3) {
                z2 = true;
                break;
            }
            i7++;
        }
        if (this.i != z2) {
            this.i = z2;
            refreshDrawableState();
        }
    }

    public final void a() {
        this.f = -1;
        this.g = -1;
        this.h = -1;
    }

    public void setOrientation(int i2) {
        if (i2 != 1) {
            throw new java.lang.IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i2);
    }

    public final void a(boolean z, boolean z2, boolean z3) {
        int i2;
        int i3 = 0;
        int i4 = z ? 1 : 2;
        if (z2) {
            i2 = 4;
        } else {
            i2 = 0;
        }
        int i5 = i2 | i4;
        if (z3) {
            i3 = 8;
        }
        this.b = i3 | i5;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof defpackage.da;
    }

    /* renamed from: b */
    public defpackage.da generateDefaultLayoutParams() {
        return new defpackage.da();
    }

    /* renamed from: a */
    public defpackage.da generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new defpackage.da(getContext(), attributeSet);
    }

    /* renamed from: a */
    public defpackage.da generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        if (android.os.Build.VERSION.SDK_INT >= 19 && (layoutParams instanceof android.widget.LinearLayout.LayoutParams)) {
            return new defpackage.da((android.widget.LinearLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
            return new defpackage.da((android.view.ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new defpackage.da(layoutParams);
    }

    public final int c() {
        int i2;
        if (this.f != -1) {
            return this.f;
        }
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= childCount) {
                break;
            }
            android.view.View childAt = getChildAt(i3);
            defpackage.da daVar = (defpackage.da) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i5 = daVar.a;
            if ((i5 & 1) == 0) {
                break;
            }
            i4 += daVar.bottomMargin + measuredHeight + daVar.topMargin;
            if ((i5 & 2) != 0) {
                i2 = i4 - defpackage.sn.a.f(childAt);
                break;
            }
            i3++;
        }
        i2 = i4;
        int max = java.lang.Math.max(0, i2 - f());
        this.f = max;
        return max;
    }

    /* access modifiers changed from: 0000 */
    public final int d() {
        int i2;
        if (this.g != -1) {
            return this.g;
        }
        int childCount = getChildCount() - 1;
        int i3 = 0;
        while (childCount >= 0) {
            android.view.View childAt = getChildAt(childCount);
            defpackage.da daVar = (defpackage.da) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = daVar.a;
            if ((i4 & 5) != 5) {
                if (i3 > 0) {
                    break;
                }
                i2 = i3;
            } else {
                int i5 = daVar.bottomMargin + daVar.topMargin + i3;
                if ((i4 & 8) != 0) {
                    i2 = i5 + defpackage.sn.a.f(childAt);
                } else if ((i4 & 2) != 0) {
                    i2 = i5 + (measuredHeight - defpackage.sn.a.f(childAt));
                } else {
                    i2 = i5 + (measuredHeight - f());
                }
            }
            childCount--;
            i3 = i2;
        }
        int max = java.lang.Math.max(0, i3);
        this.g = max;
        return max;
    }

    /* access modifiers changed from: 0000 */
    public final int e() {
        int i2;
        if (this.h != -1) {
            return this.h;
        }
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= childCount) {
                break;
            }
            android.view.View childAt = getChildAt(i3);
            defpackage.da daVar = (defpackage.da) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + daVar.topMargin + daVar.bottomMargin;
            int i5 = daVar.a;
            if ((i5 & 1) == 0) {
                break;
            }
            i4 += measuredHeight;
            if ((i5 & 2) != 0) {
                i2 = i4 - (defpackage.sn.a.f(childAt) + f());
                break;
            }
            i3++;
        }
        i2 = i4;
        int max = java.lang.Math.max(0, i2);
        this.h = max;
        return max;
    }

    /* access modifiers changed from: 0000 */
    public final void a(int i2) {
        if (this.d != null) {
            int size = this.d.size();
            for (int i3 = 0; i3 < size; i3++) {
                defpackage.cz czVar = (defpackage.cz) this.d.get(i3);
                if (czVar != null) {
                    czVar.a.e = i2;
                    int i4 = czVar.a.f != null ? czVar.a.f.b() : 0;
                    int childCount = czVar.a.getChildCount();
                    for (int i5 = 0; i5 < childCount; i5++) {
                        android.view.View childAt = czVar.a.getChildAt(i5);
                        defpackage.dd ddVar = (defpackage.dd) childAt.getLayoutParams();
                        defpackage.dj a2 = defpackage.db.a(childAt);
                        switch (ddVar.a) {
                            case 1:
                                a2.a(defpackage.gm.a(-i2, 0, czVar.a.b(childAt)));
                                break;
                            case 2:
                                a2.a(java.lang.Math.round(ddVar.b * ((float) (-i2))));
                                break;
                        }
                    }
                    czVar.a.b();
                    if (czVar.a.d != null && i4 > 0) {
                        defpackage.sn.a.c(czVar.a);
                    }
                    int height = (czVar.a.getHeight() - defpackage.sn.a.f(czVar.a)) - i4;
                    defpackage.ew ewVar = czVar.a.c;
                    float abs = ((float) java.lang.Math.abs(i2)) / ((float) height);
                    if (abs < 0.0f) {
                        abs = 0.0f;
                    } else if (abs > 1.0f) {
                        abs = 1.0f;
                    }
                    if (abs != ewVar.b) {
                        ewVar.b = abs;
                        ewVar.b();
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i2) {
        if (this.j == null) {
            this.j = new int[2];
        }
        int[] iArr = this.j;
        int[] onCreateDrawableState = super.onCreateDrawableState(iArr.length + i2);
        iArr[0] = this.i ? 2130772113 : -2130772113;
        iArr[1] = (!this.i || !this.e) ? -2130772112 : 2130772112;
        return mergeDrawableStates(onCreateDrawableState, iArr);
    }

    public final int f() {
        if (this.c != null) {
            return this.c.b();
        }
        return 0;
    }
}
