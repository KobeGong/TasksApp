package android.support.v7.widget;

/* compiled from: PG */
public class ActionBarContextView extends defpackage.aaf {
    public java.lang.CharSequence f;
    public java.lang.CharSequence g;
    public android.view.View h;
    public boolean i;
    private android.view.View j;
    private android.widget.LinearLayout k;
    private android.widget.TextView l;
    private android.widget.TextView m;
    private int n;
    private int o;
    private int p;

    public ActionBarContextView(android.content.Context context) {
        this(context, null);
    }

    public ActionBarContextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 2130772154);
    }

    public ActionBarContextView(android.content.Context context, android.util.AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        defpackage.agw a = defpackage.agw.a(context, attributeSet, defpackage.xu.x, i2, 0);
        defpackage.sn.a((android.view.View) this, a.a(defpackage.xu.y));
        this.n = a.g(defpackage.xu.C, 0);
        this.o = a.g(defpackage.xu.B, 0);
        this.d = a.f(defpackage.xu.A, 0);
        this.p = a.g(defpackage.xu.z, 2131034117);
        a.b.recycle();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.c != null) {
            this.c.f();
            this.c.h();
        }
    }

    public final void a(int i2) {
        this.d = i2;
    }

    public final void a(android.view.View view) {
        if (this.j != null) {
            removeView(this.j);
        }
        this.j = view;
        if (!(view == null || this.k == null)) {
            removeView(this.k);
            this.k = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public final void a(java.lang.CharSequence charSequence) {
        this.f = charSequence;
        c();
    }

    public final void b(java.lang.CharSequence charSequence) {
        this.g = charSequence;
        c();
    }

    private final void c() {
        int i2;
        int i3 = 8;
        boolean z = true;
        if (this.k == null) {
            android.view.LayoutInflater.from(getContext()).inflate(2131034112, this);
            this.k = (android.widget.LinearLayout) getChildAt(getChildCount() - 1);
            this.l = (android.widget.TextView) this.k.findViewById(2131755171);
            this.m = (android.widget.TextView) this.k.findViewById(2131755172);
            if (this.n != 0) {
                this.l.setTextAppearance(getContext(), this.n);
            }
            if (this.o != 0) {
                this.m.setTextAppearance(getContext(), this.o);
            }
        }
        this.l.setText(this.f);
        this.m.setText(this.g);
        boolean z2 = !android.text.TextUtils.isEmpty(this.f);
        if (android.text.TextUtils.isEmpty(this.g)) {
            z = false;
        }
        android.widget.TextView textView = this.m;
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        textView.setVisibility(i2);
        android.widget.LinearLayout linearLayout = this.k;
        if (z2 || z) {
            i3 = 0;
        }
        linearLayout.setVisibility(i3);
        if (this.k.getParent() == null) {
            addView(this.k);
        }
    }

    public final void a(defpackage.yc ycVar) {
        if (this.h == null) {
            this.h = android.view.LayoutInflater.from(getContext()).inflate(this.p, this, false);
            addView(this.h);
        } else if (this.h.getParent() == null) {
            addView(this.h);
        }
        this.h.findViewById(2131755173).setOnClickListener(new defpackage.aaj(ycVar));
        defpackage.ze zeVar = (defpackage.ze) ycVar.b();
        if (this.c != null) {
            this.c.g();
        }
        this.c = new defpackage.aap(getContext());
        this.c.d();
        android.view.ViewGroup.LayoutParams layoutParams = new android.view.ViewGroup.LayoutParams(-2, -1);
        zeVar.a((defpackage.zt) this.c, this.a);
        this.b = (android.support.v7.widget.ActionMenuView) this.c.a((android.view.ViewGroup) this);
        defpackage.sn.a((android.view.View) this.b, (android.graphics.drawable.Drawable) null);
        addView(this.b, layoutParams);
    }

    public final void b() {
        removeAllViews();
        this.j = null;
        this.b = null;
    }

    public final boolean a() {
        if (this.c != null) {
            return this.c.e();
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new android.view.ViewGroup.MarginLayoutParams(-1, -2);
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new android.view.ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        int size;
        int i4;
        int i5;
        int i6 = 1073741824;
        int i7 = 0;
        if (android.view.View.MeasureSpec.getMode(i2) != 1073741824) {
            throw new java.lang.IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        } else if (android.view.View.MeasureSpec.getMode(i3) == 0) {
            throw new java.lang.IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        } else {
            int size2 = android.view.View.MeasureSpec.getSize(i2);
            if (this.d > 0) {
                size = this.d;
            } else {
                size = android.view.View.MeasureSpec.getSize(i3);
            }
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int paddingLeft = (size2 - getPaddingLeft()) - getPaddingRight();
            int i8 = size - paddingTop;
            int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(i8, Integer.MIN_VALUE);
            if (this.h != null) {
                int a = a(this.h, paddingLeft, makeMeasureSpec);
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) this.h.getLayoutParams();
                paddingLeft = a - (marginLayoutParams.rightMargin + marginLayoutParams.leftMargin);
            }
            if (this.b != null && this.b.getParent() == this) {
                paddingLeft = a((android.view.View) this.b, paddingLeft, makeMeasureSpec);
            }
            if (this.k != null && this.j == null) {
                if (this.i) {
                    this.k.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.k.getMeasuredWidth();
                    boolean z = measuredWidth <= paddingLeft;
                    if (z) {
                        paddingLeft -= measuredWidth;
                    }
                    this.k.setVisibility(z ? 0 : 8);
                } else {
                    paddingLeft = a((android.view.View) this.k, paddingLeft, makeMeasureSpec);
                }
            }
            if (this.j != null) {
                android.view.ViewGroup.LayoutParams layoutParams = this.j.getLayoutParams();
                if (layoutParams.width != -2) {
                    i4 = 1073741824;
                } else {
                    i4 = Integer.MIN_VALUE;
                }
                if (layoutParams.width >= 0) {
                    paddingLeft = java.lang.Math.min(layoutParams.width, paddingLeft);
                }
                if (layoutParams.height == -2) {
                    i6 = Integer.MIN_VALUE;
                }
                if (layoutParams.height >= 0) {
                    i5 = java.lang.Math.min(layoutParams.height, i8);
                } else {
                    i5 = i8;
                }
                this.j.measure(android.view.View.MeasureSpec.makeMeasureSpec(paddingLeft, i4), android.view.View.MeasureSpec.makeMeasureSpec(i5, i6));
            }
            if (this.d <= 0) {
                int childCount = getChildCount();
                int i9 = 0;
                while (i7 < childCount) {
                    int measuredHeight = getChildAt(i7).getMeasuredHeight() + paddingTop;
                    if (measuredHeight <= i9) {
                        measuredHeight = i9;
                    }
                    i7++;
                    i9 = measuredHeight;
                }
                setMeasuredDimension(size2, i9);
                return;
            }
            setMeasuredDimension(size2, size);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        boolean a = defpackage.ahr.a(this);
        int paddingLeft = a ? (i4 - i2) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i5 - i3) - getPaddingTop()) - getPaddingBottom();
        if (!(this.h == null || this.h.getVisibility() == 8)) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) this.h.getLayoutParams();
            int i6 = a ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i7 = a ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int a2 = a(paddingLeft, i6, a);
            paddingLeft = a(a2 + a(this.h, a2, paddingTop, paddingTop2, a), i7, a);
        }
        if (!(this.k == null || this.j != null || this.k.getVisibility() == 8)) {
            paddingLeft += a(this.k, paddingLeft, paddingTop, paddingTop2, a);
        }
        if (this.j != null) {
            a(this.j, paddingLeft, paddingTop, paddingTop2, a);
        }
        int paddingRight = a ? getPaddingLeft() : (i4 - i2) - getPaddingRight();
        if (this.b != null) {
            a(this.b, paddingRight, paddingTop, paddingTop2, !a);
        }
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.setSource(this);
            accessibilityEvent.setClassName(getClass().getName());
            accessibilityEvent.setPackageName(getContext().getPackageName());
            accessibilityEvent.setContentDescription(this.f);
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    public final void a(boolean z) {
        if (z != this.i) {
            requestLayout();
        }
        this.i = z;
    }
}
