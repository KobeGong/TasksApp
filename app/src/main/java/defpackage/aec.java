package defpackage;

/* renamed from: aec reason: default package */
/* compiled from: PG */
public class aec implements defpackage.zz {
    private static java.lang.reflect.Method a;
    private static java.lang.reflect.Method b;
    private static java.lang.reflect.Method c;
    private final defpackage.aef A;
    private final android.graphics.Rect B;
    private android.content.Context d;
    public defpackage.ade e;
    public int f;
    public int g;
    public boolean h;
    public boolean i;
    public int j;
    public int k;
    public android.view.View l;
    public android.widget.AdapterView.OnItemClickListener m;
    public final defpackage.aej n;
    public final android.os.Handler o;
    public android.graphics.Rect p;
    public boolean q;
    public android.widget.PopupWindow r;
    private android.widget.ListAdapter s;
    private int t;
    private int u;
    private int v;
    private boolean w;
    private android.database.DataSetObserver x;
    private final defpackage.aei y;
    private final defpackage.aeh z;

    public aec(android.content.Context context, android.util.AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public aec(android.content.Context context, android.util.AttributeSet attributeSet, int i2, int i3) {
        this.t = -2;
        this.f = -2;
        this.v = 1002;
        this.j = 0;
        this.k = Integer.MAX_VALUE;
        this.n = new defpackage.aej(this);
        this.y = new defpackage.aei(this);
        this.z = new defpackage.aeh(this);
        this.A = new defpackage.aef(this);
        this.B = new android.graphics.Rect();
        this.d = context;
        this.o = new android.os.Handler(context.getMainLooper());
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.xu.aV, i2, i3);
        this.g = obtainStyledAttributes.getDimensionPixelOffset(defpackage.xu.aW, 0);
        this.u = obtainStyledAttributes.getDimensionPixelOffset(defpackage.xu.aX, 0);
        if (this.u != 0) {
            this.w = true;
        }
        obtainStyledAttributes.recycle();
        this.r = new defpackage.abv(context, attributeSet, i2, i3);
        this.r.setInputMethodMode(1);
    }

    public void a(android.widget.ListAdapter listAdapter) {
        if (this.x == null) {
            this.x = new defpackage.aeg(this);
        } else if (this.s != null) {
            this.s.unregisterDataSetObserver(this.x);
        }
        this.s = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.x);
        }
        if (this.e != null) {
            this.e.setAdapter(this.s);
        }
    }

    public final void b() {
        this.q = true;
        this.r.setFocusable(true);
    }

    public final void a(android.graphics.drawable.Drawable drawable) {
        this.r.setBackgroundDrawable(drawable);
    }

    public final int c() {
        if (!this.w) {
            return 0;
        }
        return this.u;
    }

    public final void a(int i2) {
        this.u = i2;
        this.w = true;
    }

    public final void b(int i2) {
        android.graphics.drawable.Drawable background = this.r.getBackground();
        if (background != null) {
            background.getPadding(this.B);
            this.f = this.B.left + this.B.right + i2;
            return;
        }
        this.f = i2;
    }

    public void d() {
        int i2;
        boolean z2;
        int makeMeasureSpec;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = 0;
        if (this.e == null) {
            android.content.Context context = this.d;
            new defpackage.aed(this);
            this.e = a(context, !this.q);
            this.e.setAdapter(this.s);
            this.e.setOnItemClickListener(this.m);
            this.e.setFocusable(true);
            this.e.setFocusableInTouchMode(true);
            this.e.setOnItemSelectedListener(new defpackage.aee(this));
            this.e.setOnScrollListener(this.z);
            this.r.setContentView(this.e);
        } else {
            this.r.getContentView();
        }
        android.graphics.drawable.Drawable background = this.r.getBackground();
        if (background != null) {
            background.getPadding(this.B);
            int i11 = this.B.top + this.B.bottom;
            if (!this.w) {
                this.u = -this.B.top;
                i2 = i11;
            } else {
                i2 = i11;
            }
        } else {
            this.B.setEmpty();
            i2 = 0;
        }
        if (this.r.getInputMethodMode() == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        int a2 = a(this.l, this.u, z2);
        if (this.t == -1) {
            i4 = a2 + i2;
        } else {
            switch (this.f) {
                case -2:
                    makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(this.d.getResources().getDisplayMetrics().widthPixels - (this.B.left + this.B.right), Integer.MIN_VALUE);
                    break;
                case -1:
                    makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(this.d.getResources().getDisplayMetrics().widthPixels - (this.B.left + this.B.right), 1073741824);
                    break;
                default:
                    makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(this.f, 1073741824);
                    break;
            }
            int a3 = this.e.a(makeMeasureSpec, 0, -1, a2, -1);
            if (a3 > 0) {
                i3 = this.e.getPaddingTop() + this.e.getPaddingBottom() + i2 + 0;
            } else {
                i3 = 0;
            }
            i4 = i3 + a3;
        }
        boolean j2 = j();
        defpackage.vb.a(this.r, this.v);
        if (this.r.isShowing()) {
            if (defpackage.sn.a.s(this.l)) {
                if (this.f == -1) {
                    i6 = -1;
                } else if (this.f == -2) {
                    i6 = this.l.getWidth();
                } else {
                    i6 = this.f;
                }
                if (this.t == -1) {
                    if (j2) {
                        i8 = i4;
                    } else {
                        i8 = -1;
                    }
                    if (j2) {
                        android.widget.PopupWindow popupWindow = this.r;
                        if (this.f == -1) {
                            i9 = -1;
                        } else {
                            i9 = 0;
                        }
                        popupWindow.setWidth(i9);
                        this.r.setHeight(0);
                        i7 = i8;
                    } else {
                        android.widget.PopupWindow popupWindow2 = this.r;
                        if (this.f == -1) {
                            i10 = -1;
                        }
                        popupWindow2.setWidth(i10);
                        this.r.setHeight(-1);
                        i7 = i8;
                    }
                } else if (this.t == -2) {
                    i7 = i4;
                } else {
                    i7 = this.t;
                }
                this.r.setOutsideTouchable(true);
                android.widget.PopupWindow popupWindow3 = this.r;
                android.view.View view = this.l;
                int i12 = this.g;
                int i13 = this.u;
                if (i6 < 0) {
                    i6 = -1;
                }
                if (i7 < 0) {
                    i7 = -1;
                }
                popupWindow3.update(view, i12, i13, i6, i7);
                return;
            }
            return;
        }
        if (this.f == -1) {
            i5 = -1;
        } else if (this.f == -2) {
            i5 = this.l.getWidth();
        } else {
            i5 = this.f;
        }
        if (this.t == -1) {
            i4 = -1;
        } else if (this.t != -2) {
            i4 = this.t;
        }
        this.r.setWidth(i5);
        this.r.setHeight(i4);
        if (a != null) {
            try {
                a.invoke(this.r, new java.lang.Object[]{java.lang.Boolean.valueOf(true)});
            } catch (java.lang.Exception e2) {
            }
        }
        this.r.setOutsideTouchable(true);
        this.r.setTouchInterceptor(this.y);
        if (this.i) {
            defpackage.vb.a(this.r, this.h);
        }
        if (c != null) {
            try {
                c.invoke(this.r, new java.lang.Object[]{this.p});
            } catch (java.lang.Exception e3) {
                android.util.Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e3);
            }
        }
        defpackage.vb.a.a(this.r, this.l, this.g, this.u, this.j);
        this.e.setSelection(-1);
        if (!this.q || this.e.isInTouchMode()) {
            i();
        }
        if (!this.q) {
            this.o.post(this.A);
        }
    }

    public final void e() {
        this.r.dismiss();
        this.r.setContentView(null);
        this.e = null;
        this.o.removeCallbacks(this.n);
    }

    public final void a(android.widget.PopupWindow.OnDismissListener onDismissListener) {
        this.r.setOnDismissListener(onDismissListener);
    }

    public final void h() {
        this.r.setInputMethodMode(2);
    }

    public final void i() {
        defpackage.ade ade = this.e;
        if (ade != null) {
            ade.a = true;
            ade.requestLayout();
        }
    }

    public final boolean f() {
        return this.r.isShowing();
    }

    public final boolean j() {
        return this.r.getInputMethodMode() == 2;
    }

    public final android.widget.ListView g() {
        return this.e;
    }

    /* access modifiers changed from: 0000 */
    public defpackage.ade a(android.content.Context context, boolean z2) {
        return new defpackage.ade(context, z2);
    }

    private final int a(android.view.View view, int i2, boolean z2) {
        if (b != null) {
            try {
                return ((java.lang.Integer) b.invoke(this.r, new java.lang.Object[]{view, java.lang.Integer.valueOf(i2), java.lang.Boolean.valueOf(z2)})).intValue();
            } catch (java.lang.Exception e2) {
            }
        }
        return this.r.getMaxAvailableHeight(view, i2);
    }

    static {
        try {
            a = android.widget.PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", new java.lang.Class[]{java.lang.Boolean.TYPE});
        } catch (java.lang.NoSuchMethodException e2) {
        }
        try {
            b = android.widget.PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", new java.lang.Class[]{android.view.View.class, java.lang.Integer.TYPE, java.lang.Boolean.TYPE});
        } catch (java.lang.NoSuchMethodException e3) {
        }
        try {
            c = android.widget.PopupWindow.class.getDeclaredMethod("setEpicenterBounds", new java.lang.Class[]{android.graphics.Rect.class});
        } catch (java.lang.NoSuchMethodException e4) {
        }
    }
}
