package com.google.android.libraries.onegoogle.bottomdrawer;

import android.support.design.widget.CoordinatorLayout;
import android.support.v4.widget.NestedScrollView;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: PG */
public class BottomDrawerBehavior extends gx {
    public int a;
    public int b;
    public int c = 5;
    public vv d;
    public int e;
    public WeakReference f;
    public WeakReference g;
    public cgc h;
    public int i;
    public boolean j;
    public boolean k;
    public boolean l;
    private boolean m;
    private int n;
    private boolean o;
    private VelocityTracker p;
    private int q;
    private boolean r;
    private final vy s = new cgb(this);

    /* access modifiers changed from: private */
    public final boolean a(CoordinatorLayout coordinatorLayout, GoogleMaterialBottomDrawer googleMaterialBottomDrawer, int i2) {
        int top = googleMaterialBottomDrawer.getTop();
        coordinatorLayout.a(googleMaterialBottomDrawer, i2);
        this.e = coordinatorLayout.getHeight();
        this.a = Math.max(0, this.e - googleMaterialBottomDrawer.getHeight());
        this.b = this.e / 2;
        if ((this.l || this.k) && (this.c == 3 || this.c == 6)) {
            sn.b((View) googleMaterialBottomDrawer, 0);
        } else if (this.c == 3) {
            sn.b((View) googleMaterialBottomDrawer, Math.max(top, this.a));
        } else if (this.c == 6) {
            sn.b((View) googleMaterialBottomDrawer, Math.max(this.b, this.a));
        } else if (this.c == 5) {
            sn.b((View) googleMaterialBottomDrawer, this.e);
        } else if (this.c == 1 || this.c == 2) {
            sn.b((View) googleMaterialBottomDrawer, top - googleMaterialBottomDrawer.getTop());
        }
        if (this.d == null) {
            this.d = vv.a(coordinatorLayout, this.s);
        }
        this.f = new WeakReference(googleMaterialBottomDrawer);
        this.g = new WeakReference(b(googleMaterialBottomDrawer));
        return true;
    }

    public final void b(int i2) {
        if (i2 != this.c) {
            if (this.f != null) {
                GoogleMaterialBottomDrawer googleMaterialBottomDrawer = (GoogleMaterialBottomDrawer) this.f.get();
                if (googleMaterialBottomDrawer != null) {
                    ViewParent parent = googleMaterialBottomDrawer.getParent();
                    if (parent == null || !parent.isLayoutRequested() || !sn.a.s(googleMaterialBottomDrawer)) {
                        b(googleMaterialBottomDrawer, i2);
                    } else {
                        googleMaterialBottomDrawer.post(new cga(this, googleMaterialBottomDrawer, i2));
                    }
                }
            } else if (i2 == 3 || i2 == 6 || i2 == 5) {
                this.c = i2;
            }
        }
    }

    public final void c(int i2) {
        if (this.c != i2) {
            this.c = i2;
            if (!(((View) this.f.get()) == null || this.h == null)) {
                cgc cgc = this.h;
                cgc.b.a(i2);
                boolean z = ((i2 != 3 && i2 != 6) || cgc.a == 3 || cgc.a == 6) ? false : true;
                boolean z2 = i2 == 5 && cgc.a != 5;
                if (z || z2) {
                    cgc.a = i2;
                }
                if (i2 != 2) {
                    cgc.b.f = false;
                }
                if (cgc.b.d != null) {
                    ArrayList a2 = cky.a((Iterable) cgc.b.d);
                    for (int size = a2.size() - 1; size >= 0; size--) {
                        if (z) {
                            ((cgi) a2.get(size)).a();
                        } else if (z2) {
                            ((cgi) a2.get(size)).b();
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

    private final NestedScrollView b(View view) {
        if (sn.a.w(view) && (view instanceof NestedScrollView)) {
            return (NestedScrollView) view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                NestedScrollView b2 = b(viewGroup.getChildAt(i2));
                if (b2 != null) {
                    return b2;
                }
            }
        }
        return null;
    }

    public final void b(View view, int i2) {
        int i3;
        int i4;
        NestedScrollView nestedScrollView = (NestedScrollView) this.g.get();
        if (i2 == 5) {
            i3 = this.e;
        } else if (this.l || this.k) {
            i3 = 0;
        } else {
            if (i2 == 6) {
                i4 = Math.max(this.b, this.a);
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
                throw new IllegalArgumentException(new StringBuilder(35).append("Illegal state argument: ").append(i2).toString());
            }
            i3 = i4;
        }
        if (this.d.a(view, view.getLeft(), i3)) {
            c(2);
            sn.a(view, new cgd(this, view, i2));
            return;
        }
        c(i2);
    }

    public final boolean a() {
        if (this.g.get() == null) {
            return false;
        }
        if (((NestedScrollView) this.g.get()).getScrollY() > 0) {
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
        View view = (View) this.f.get();
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
            cgc cgc = this.h;
            cgc.b.e.setAlpha(Math.max(Math.min(c(view) * 2.0f, 1.0f), f2));
        }
    }

    private static float c(View view) {
        return 1.0f - (((float) view.getTop()) / ((float) ((View) view.getParent()).getHeight()));
    }

    @Override // defpackage.gx
    public final /* synthetic */ boolean a(CoordinatorLayout coordinatorLayout, View view, View view2, float f2, float f3) {
        boolean z = view2 == this.g.get() && (this.c != 3 || super.a(coordinatorLayout, (GoogleMaterialBottomDrawer) view, view2, f2, f3));
        if (!(view2 instanceof NestedScrollView) || this.c != 3) {
            return z;
        }
        ((NestedScrollView) view2).c((int) f3);
        return true;
    }

    @Override // defpackage.gx
    public final /* synthetic */ void a(CoordinatorLayout coordinatorLayout, View view, View view2, int i2, int[] iArr, int i3) {
        GoogleMaterialBottomDrawer googleMaterialBottomDrawer = (GoogleMaterialBottomDrawer) view;
        if (i3 != 1 && view2 == ((NestedScrollView) this.g.get())) {
            int top = googleMaterialBottomDrawer.getTop();
            int i4 = top - i2;
            if (i2 > 0) {
                if (i4 < this.a) {
                    iArr[1] = top - this.a;
                    sn.b((View) googleMaterialBottomDrawer, -iArr[1]);
                    c(3);
                } else {
                    iArr[1] = i2;
                    sn.b((View) googleMaterialBottomDrawer, -i2);
                    c(1);
                }
            } else if (i2 < 0 && !view2.canScrollVertically(-1)) {
                iArr[1] = i2;
                sn.b((View) googleMaterialBottomDrawer, -i2);
                c(1);
            }
            d(googleMaterialBottomDrawer.getTop());
            this.n = i2;
            this.o = true;
        }
    }

    @Override // defpackage.gx
    public final /* synthetic */ void a(CoordinatorLayout coordinatorLayout, View view, View view2, int i2) {
        int i3;
        int i4 = 3;
        GoogleMaterialBottomDrawer googleMaterialBottomDrawer = (GoogleMaterialBottomDrawer) view;
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
                if (this.d.a((View) googleMaterialBottomDrawer, googleMaterialBottomDrawer.getLeft(), i3)) {
                    c(2);
                    sn.a(googleMaterialBottomDrawer, new cgd(this, googleMaterialBottomDrawer, i4));
                } else {
                    c(i4);
                }
                this.o = false;
            }
        }
    }

    @Override // defpackage.gx
    public final /* synthetic */ boolean a(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i2, int i3) {
        this.n = 0;
        this.o = false;
        if ((i2 & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.gx
    public final /* synthetic */ boolean a(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4, int i5) {
        int i6;
        GoogleMaterialBottomDrawer googleMaterialBottomDrawer = (GoogleMaterialBottomDrawer) view;
        int top = this.e - googleMaterialBottomDrawer.getTop();
        coordinatorLayout.a(googleMaterialBottomDrawer, i2, i3, i4, i5);
        if ((this.r || this.k) && googleMaterialBottomDrawer.getMeasuredHeight() < this.e) {
            i6 = this.e;
        } else if (top > googleMaterialBottomDrawer.getMeasuredHeight()) {
            i6 = top;
        } else {
            i6 = 0;
        }
        if (i6 > 0) {
            googleMaterialBottomDrawer.setMinimumHeight(i6);
            View view2 = googleMaterialBottomDrawer.g;
            if (view2 != null) {
                view2.setMinimumHeight(i6 - (googleMaterialBottomDrawer.getPaddingTop() + googleMaterialBottomDrawer.getPaddingBottom()));
            }
            coordinatorLayout.a(googleMaterialBottomDrawer, i2, i3, i4, i5);
        }
        googleMaterialBottomDrawer.setMinimumHeight(0);
        googleMaterialBottomDrawer.g.setMinimumHeight(0);
        return true;
    }

    @Override // defpackage.gx
    public final /* synthetic */ boolean b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        GoogleMaterialBottomDrawer googleMaterialBottomDrawer = (GoogleMaterialBottomDrawer) view;
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
                    this.p = VelocityTracker.obtain();
                }
                this.p.addMovement(motionEvent);
                if (actionMasked == 2 && !this.m && Math.abs(((float) this.q) - motionEvent.getY()) > ((float) this.d.a)) {
                    this.d.a(googleMaterialBottomDrawer, motionEvent.getPointerId(motionEvent.getActionIndex()));
                }
                if (this.m) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00c4  */
    @Override // defpackage.gx
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ boolean a(android.support.design.widget.CoordinatorLayout r9, android.view.View r10, android.view.MotionEvent r11) {
        /*
        // Method dump skipped, instructions count: 212
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.onegoogle.bottomdrawer.BottomDrawerBehavior.a(android.support.design.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }
}
