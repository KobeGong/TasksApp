package com.google.android.libraries.onegoogle.bottomdrawer;

import defpackage.ViewCompat;

/* compiled from: PG */
public class BottomDrawerBehavior extends defpackage.gx {
    public int a;
    public int b;
    public int c = 5;
    public defpackage.vv d;
    public int e;
    public java.lang.ref.WeakReference f;
    public java.lang.ref.WeakReference g;
    public defpackage.cgc h;
    public int i;
    public boolean j;
    public boolean k;
    public boolean l;
    private boolean m;
    private int n;
    private boolean o;
    private android.view.VelocityTracker p;
    private int q;
    private boolean r;
    private final defpackage.vy s = new defpackage.cgb(this);

    /* access modifiers changed from: private */
    public final boolean a(android.support.design.widget.CoordinatorLayout coordinatorLayout, com.google.android.libraries.onegoogle.bottomdrawer.GoogleMaterialBottomDrawer googleMaterialBottomDrawer, int i2) {
        int top = googleMaterialBottomDrawer.getTop();
        coordinatorLayout.a((android.view.View) googleMaterialBottomDrawer, i2);
        this.e = coordinatorLayout.getHeight();
        this.a = java.lang.Math.max(0, this.e - googleMaterialBottomDrawer.getHeight());
        this.b = this.e / 2;
        if ((this.l || this.k) && (this.c == 3 || this.c == 6)) {
            ViewCompat.b((android.view.View) googleMaterialBottomDrawer, 0);
        } else if (this.c == 3) {
            ViewCompat.b((android.view.View) googleMaterialBottomDrawer, java.lang.Math.max(top, this.a));
        } else if (this.c == 6) {
            ViewCompat.b((android.view.View) googleMaterialBottomDrawer, java.lang.Math.max(this.b, this.a));
        } else if (this.c == 5) {
            ViewCompat.b((android.view.View) googleMaterialBottomDrawer, this.e);
        } else if (this.c == 1 || this.c == 2) {
            ViewCompat.b((android.view.View) googleMaterialBottomDrawer, top - googleMaterialBottomDrawer.getTop());
        }
        if (this.d == null) {
            this.d = defpackage.vv.a((android.view.ViewGroup) coordinatorLayout, this.s);
        }
        this.f = new java.lang.ref.WeakReference(googleMaterialBottomDrawer);
        this.g = new java.lang.ref.WeakReference(b((android.view.View) googleMaterialBottomDrawer));
        return true;
    }

    public final void b(int i2) {
        if (i2 != this.c) {
            if (this.f != null) {
                com.google.android.libraries.onegoogle.bottomdrawer.GoogleMaterialBottomDrawer googleMaterialBottomDrawer = (com.google.android.libraries.onegoogle.bottomdrawer.GoogleMaterialBottomDrawer) this.f.get();
                if (googleMaterialBottomDrawer != null) {
                    android.view.ViewParent parent = googleMaterialBottomDrawer.getParent();
                    if (parent == null || !parent.isLayoutRequested() || !ViewCompat.a.s(googleMaterialBottomDrawer)) {
                        b(googleMaterialBottomDrawer, i2);
                    } else {
                        googleMaterialBottomDrawer.post(new defpackage.cga(this, googleMaterialBottomDrawer, i2));
                    }
                }
            } else if (i2 == 3 || i2 == 6 || i2 == 5) {
                this.c = i2;
            }
        }
    }

    public final void c(int i2) {
        boolean z;
        if (this.c != i2) {
            this.c = i2;
            if (((android.view.View) this.f.get()) != null && this.h != null) {
                defpackage.cgc cgc = this.h;
                cgc.b.a(i2);
                boolean z2 = ((i2 != 3 && i2 != 6) || cgc.a == 3 || cgc.a == 6) ? false : true;
                if (i2 != 5 || cgc.a == 5) {
                    z = false;
                } else {
                    z = true;
                }
                if (z2 || z) {
                    cgc.a = i2;
                }
                if (i2 != 2) {
                    cgc.b.f = false;
                }
                if (cgc.b.d != null) {
                    java.util.ArrayList a2 = defpackage.cky.a((java.lang.Iterable) cgc.b.d);
                    for (int size = a2.size() - 1; size >= 0; size--) {
                        if (z2) {
                            ((defpackage.cgi) a2.get(size)).a();
                        } else if (z) {
                            ((defpackage.cgi) a2.get(size)).b();
                        }
                    }
                }
                cgc.b.requestLayout();
            }
        }
    }

    private final void c() {
        this.i = -1;
        if (this.p != null) {
            this.p.recycle();
            this.p = null;
        }
    }

    private final android.support.v4.widget.NestedScrollView b(android.view.View view) {
        if (ViewCompat.a.w(view) && (view instanceof android.support.v4.widget.NestedScrollView)) {
            return (android.support.v4.widget.NestedScrollView) view;
        }
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                android.support.v4.widget.NestedScrollView b2 = b(viewGroup.getChildAt(i2));
                if (b2 != null) {
                    return b2;
                }
            }
        }
        return null;
    }

    public final void b(android.view.View view, int i2) {
        int i3;
        int i4;
        android.support.v4.widget.NestedScrollView nestedScrollView = (android.support.v4.widget.NestedScrollView) this.g.get();
        if (i2 == 5) {
            i3 = this.e;
        } else if (this.l || this.k) {
            i3 = 0;
        } else {
            if (i2 == 6) {
                i4 = java.lang.Math.max(this.b, this.a);
                if (nestedScrollView != null) {
                    nestedScrollView.scrollTo(0, 0);
                    i3 = i4;
                }
            } else if (i2 == 3) {
                i4 = this.a;
                if (nestedScrollView != null) {
                    nestedScrollView.scrollTo(0, 0);
                    i3 = i4;
                }
            } else {
                throw new java.lang.IllegalArgumentException("Illegal state argument: " + i2);
            }
            i3 = i4;
        }
        if (this.d.a(view, view.getLeft(), i3)) {
            c(2);
            ViewCompat.a(view, (java.lang.Runnable) new defpackage.cgd(this, view, i2));
            return;
        }
        c(i2);
    }

    public final boolean a() {
        if (this.g.get() == null) {
            return false;
        }
        if (((android.support.v4.widget.NestedScrollView) this.g.get()).getScrollY() > 0) {
            return true;
        }
        return false;
    }

    public final void b() {
        if (1.0f - (((float) this.a) / ((float) this.e)) > 0.85f) {
            this.a = 0;
            this.l = true;
        }
    }

    public final void d(int i2) {
        android.view.View view = (android.view.View) this.f.get();
        if (view != null && this.h != null) {
            float f2 = ((float) (this.e - i2)) / ((float) (this.e - this.a));
            float c2 = c(view);
            if (c2 > 0.85f) {
                this.h.a((c2 - 0.85f) / 0.14999998f);
                this.r = true;
            } else {
                if (this.r) {
                    this.h.a(0.0f);
                }
                this.r = false;
            }
            defpackage.cgc cgc = this.h;
            cgc.b.e.setAlpha(java.lang.Math.max(java.lang.Math.min(c(view) * 2.0f, 1.0f), f2));
        }
    }

    private static float c(android.view.View view) {
        return 1.0f - (((float) view.getTop()) / ((float) ((android.view.View) view.getParent()).getHeight()));
    }

    public final /* synthetic */ boolean a(android.support.design.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2, float f2, float f3) {
        boolean z = view2 == this.g.get() && (this.c != 3 || super.a(coordinatorLayout, (com.google.android.libraries.onegoogle.bottomdrawer.GoogleMaterialBottomDrawer) view, view2, f2, f3));
        if (!(view2 instanceof android.support.v4.widget.NestedScrollView) || this.c != 3) {
            return z;
        }
        ((android.support.v4.widget.NestedScrollView) view2).c((int) f3);
        return true;
    }

    public final /* synthetic */ void a(android.support.design.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2, int i2, int[] iArr, int i3) {
        com.google.android.libraries.onegoogle.bottomdrawer.GoogleMaterialBottomDrawer googleMaterialBottomDrawer = (com.google.android.libraries.onegoogle.bottomdrawer.GoogleMaterialBottomDrawer) view;
        if (i3 != 1 && view2 == ((android.support.v4.widget.NestedScrollView) this.g.get())) {
            int top = googleMaterialBottomDrawer.getTop();
            int i4 = top - i2;
            if (i2 > 0) {
                if (i4 < this.a) {
                    iArr[1] = top - this.a;
                    ViewCompat.b((android.view.View) googleMaterialBottomDrawer, -iArr[1]);
                    c(3);
                } else {
                    iArr[1] = i2;
                    ViewCompat.b((android.view.View) googleMaterialBottomDrawer, -i2);
                    c(1);
                }
            } else if (i2 < 0 && !view2.canScrollVertically(-1)) {
                iArr[1] = i2;
                ViewCompat.b((android.view.View) googleMaterialBottomDrawer, -i2);
                c(1);
            }
            d(googleMaterialBottomDrawer.getTop());
            this.n = i2;
            this.o = true;
        }
    }

    public final /* synthetic */ void a(android.support.design.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2, int i2) {
        int i3;
        int i4 = 3;
        com.google.android.libraries.onegoogle.bottomdrawer.GoogleMaterialBottomDrawer googleMaterialBottomDrawer = (com.google.android.libraries.onegoogle.bottomdrawer.GoogleMaterialBottomDrawer) view;
        if (googleMaterialBottomDrawer.getTop() == this.a) {
            c(3);
        } else if (view2 == this.g.get() && this.o) {
            if (this.n > 0 || !a()) {
                if (this.n > 0) {
                    b();
                    i3 = this.a;
                } else if (!this.l || this.k) {
                    this.l = false;
                    i3 = this.e;
                    i4 = 5;
                } else {
                    this.l = false;
                    i4 = 6;
                    i3 = this.b;
                }
                if (this.d.a((android.view.View) googleMaterialBottomDrawer, googleMaterialBottomDrawer.getLeft(), i3)) {
                    c(2);
                    ViewCompat.a((android.view.View) googleMaterialBottomDrawer, (java.lang.Runnable) new defpackage.cgd(this, googleMaterialBottomDrawer, i4));
                } else {
                    c(i4);
                }
                this.o = false;
            }
        }
    }

    public final /* synthetic */ boolean a(android.support.design.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2, android.view.View view3, int i2, int i3) {
        this.n = 0;
        this.o = false;
        if ((i2 & 2) != 0) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ boolean a(android.support.design.widget.CoordinatorLayout coordinatorLayout, android.view.View view, int i2, int i3, int i4, int i5) {
        int i6;
        com.google.android.libraries.onegoogle.bottomdrawer.GoogleMaterialBottomDrawer googleMaterialBottomDrawer = (com.google.android.libraries.onegoogle.bottomdrawer.GoogleMaterialBottomDrawer) view;
        int top = this.e - googleMaterialBottomDrawer.getTop();
        coordinatorLayout.a((android.view.View) googleMaterialBottomDrawer, i2, i3, i4, i5);
        if ((this.r || this.k) && googleMaterialBottomDrawer.getMeasuredHeight() < this.e) {
            i6 = this.e;
        } else if (top > googleMaterialBottomDrawer.getMeasuredHeight()) {
            i6 = top;
        } else {
            i6 = 0;
        }
        if (i6 > 0) {
            googleMaterialBottomDrawer.setMinimumHeight(i6);
            android.view.View view2 = googleMaterialBottomDrawer.g;
            if (view2 != null) {
                view2.setMinimumHeight(i6 - (googleMaterialBottomDrawer.getPaddingTop() + googleMaterialBottomDrawer.getPaddingBottom()));
            }
            coordinatorLayout.a((android.view.View) googleMaterialBottomDrawer, i2, i3, i4, i5);
        }
        googleMaterialBottomDrawer.setMinimumHeight(0);
        googleMaterialBottomDrawer.g.setMinimumHeight(0);
        return true;
    }

    public final /* synthetic */ boolean b(android.support.design.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.MotionEvent motionEvent) {
        com.google.android.libraries.onegoogle.bottomdrawer.GoogleMaterialBottomDrawer googleMaterialBottomDrawer = (com.google.android.libraries.onegoogle.bottomdrawer.GoogleMaterialBottomDrawer) view;
        if (googleMaterialBottomDrawer.isShown()) {
            int actionMasked = motionEvent.getActionMasked();
            if (this.c == 1 && actionMasked == 0) {
                return true;
            }
            if (!(this.c == 1 && actionMasked == 2 && a())) {
                if (this.d != null) {
                    this.d.b(motionEvent);
                }
                if (actionMasked == 0) {
                    c();
                }
                if (this.p == null) {
                    this.p = android.view.VelocityTracker.obtain();
                }
                this.p.addMovement(motionEvent);
                if (actionMasked == 2 && !this.m && java.lang.Math.abs(((float) this.q) - motionEvent.getY()) > ((float) this.d.a)) {
                    this.d.a((android.view.View) googleMaterialBottomDrawer, motionEvent.getPointerId(motionEvent.getActionIndex()));
                }
                if (!this.m) {
                    return true;
                }
            }
        }
        return false;
    }

    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ boolean a(android.support.design.widget.CoordinatorLayout r9, android.view.View r10, android.view.MotionEvent r11) {
        /*
            r8 = this;
            r3 = 0
            r7 = -1
            r2 = 0
            r1 = 1
            com.google.android.libraries.onegoogle.bottomdrawer.GoogleMaterialBottomDrawer r10 = (com.google.android.libraries.onegoogle.bottomdrawer.GoogleMaterialBottomDrawer) r10
            boolean r0 = r10.isShown()
            if (r0 != 0) goto L_0x0010
            r8.m = r1
        L_0x000e:
            r1 = r2
        L_0x000f:
            return r1
        L_0x0010:
            int r4 = r11.getActionMasked()
            if (r4 != 0) goto L_0x0019
            r8.c()
        L_0x0019:
            android.view.VelocityTracker r0 = r8.p
            if (r0 != 0) goto L_0x0023
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r8.p = r0
        L_0x0023:
            android.view.VelocityTracker r0 = r8.p
            r0.addMovement(r11)
            switch(r4) {
                case 0: goto L_0x0081;
                case 1: goto L_0x0076;
                case 2: goto L_0x002b;
                case 3: goto L_0x0076;
                default: goto L_0x002b;
            }
        L_0x002b:
            boolean r0 = r8.m
            if (r0 != 0) goto L_0x0037
            vv r0 = r8.d
            boolean r0 = r0.a(r11)
            if (r0 != 0) goto L_0x000f
        L_0x0037:
            java.lang.ref.WeakReference r0 = r8.g
            if (r0 == 0) goto L_0x00c4
            java.lang.ref.WeakReference r0 = r8.g
            java.lang.Object r0 = r0.get()
            android.support.v4.widget.NestedScrollView r0 = (android.support.v4.widget.NestedScrollView) r0
        L_0x0043:
            r3 = 2
            if (r4 != r3) goto L_0x000e
            if (r0 == 0) goto L_0x000e
            boolean r3 = r8.m
            if (r3 != 0) goto L_0x000e
            int r3 = r8.c
            if (r3 == r1) goto L_0x000e
            float r3 = r11.getX()
            int r3 = (int) r3
            float r4 = r11.getY()
            int r4 = (int) r4
            boolean r0 = r9.a(r0, r3, r4)
            if (r0 != 0) goto L_0x000e
            int r0 = r8.q
            float r0 = (float) r0
            float r3 = r11.getY()
            float r0 = r0 - r3
            float r0 = java.lang.Math.abs(r0)
            vv r3 = r8.d
            int r3 = r3.a
            float r3 = (float) r3
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x000e
            goto L_0x000f
        L_0x0076:
            r8.j = r2
            r8.i = r7
            boolean r0 = r8.m
            if (r0 == 0) goto L_0x002b
            r8.m = r2
            goto L_0x000e
        L_0x0081:
            float r0 = r11.getX()
            int r5 = (int) r0
            float r0 = r11.getY()
            int r0 = (int) r0
            r8.q = r0
            java.lang.ref.WeakReference r0 = r8.g
            if (r0 == 0) goto L_0x00c0
            java.lang.ref.WeakReference r0 = r8.g
            java.lang.Object r0 = r0.get()
            android.support.v4.widget.NestedScrollView r0 = (android.support.v4.widget.NestedScrollView) r0
        L_0x0099:
            if (r0 == 0) goto L_0x00af
            int r6 = r8.q
            boolean r0 = r9.a(r0, r5, r6)
            if (r0 == 0) goto L_0x00af
            int r0 = r11.getActionIndex()
            int r0 = r11.getPointerId(r0)
            r8.i = r0
            r8.j = r1
        L_0x00af:
            int r0 = r8.i
            if (r0 != r7) goto L_0x00c2
            int r0 = r8.q
            boolean r0 = r9.a(r10, r5, r0)
            if (r0 != 0) goto L_0x00c2
            r0 = r1
        L_0x00bc:
            r8.m = r0
            goto L_0x002b
        L_0x00c0:
            r0 = r3
            goto L_0x0099
        L_0x00c2:
            r0 = r2
            goto L_0x00bc
        L_0x00c4:
            r0 = r3
            goto L_0x0043
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.onegoogle.bottomdrawer.BottomDrawerBehavior.a(android.support.design.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }
}
