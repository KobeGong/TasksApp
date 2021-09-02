package com.google.android.libraries.onegoogle.bottomdrawer;

@defpackage.gy(a = com.google.android.libraries.onegoogle.bottomdrawer.BottomDrawerBehavior.class)
/* compiled from: PG */
public class GoogleMaterialBottomDrawer extends android.widget.FrameLayout {
    private static final java.lang.String i = java.lang.String.valueOf(com.google.android.libraries.onegoogle.bottomdrawer.GoogleMaterialBottomDrawer.class.getName()).concat(".BottomDrawerState");
    private static final java.lang.String j = java.lang.String.valueOf(com.google.android.libraries.onegoogle.bottomdrawer.GoogleMaterialBottomDrawer.class.getName()).concat(".superState");
    public final float a;
    public final int b;
    public com.google.android.libraries.onegoogle.bottomdrawer.BottomDrawerBehavior c;
    public java.util.ArrayList d;
    public android.view.View e;
    public boolean f;
    public android.view.View g;
    public final defpackage.cgc h;
    private final int k;
    private final float[] l;
    private final android.graphics.drawable.GradientDrawable m;
    private int n;

    public GoogleMaterialBottomDrawer(android.content.Context context) {
        this(context, null);
    }

    public GoogleMaterialBottomDrawer(android.content.Context context, android.util.AttributeSet attributeSet) {
        int i2;
        super(context, attributeSet);
        this.l = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        this.h = new defpackage.cgc(this);
        setFitsSystemWindows(true);
        android.content.res.Resources resources = context.getResources();
        this.n = resources.getColor(2131623951);
        defpackage.sn.a((android.view.View) this, resources.getDimension(2131689842));
        setClickable(true);
        setPadding(0, 0, 0, 0);
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier != 0) {
            i2 = context.getResources().getDimensionPixelSize(identifier);
        } else {
            i2 = 0;
        }
        this.b = i2;
        this.a = resources.getDimension(2131689843);
        this.k = resources.getColor(2131623950);
        this.m = new android.graphics.drawable.GradientDrawable();
        this.m.setShape(0);
        this.m.setColor(this.k);
        a(this.a, 250);
    }

    public void onViewAdded(android.view.View view) {
        super.onViewAdded(view);
        this.g = view;
    }

    /* access modifiers changed from: protected */
    public android.os.Parcelable onSaveInstanceState() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable(j, super.onSaveInstanceState());
        bundle.putBoolean(i, b() || this.f);
        return bundle;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (parcelable instanceof android.os.Bundle) {
            android.os.Bundle bundle = (android.os.Bundle) parcelable;
            android.os.Parcelable parcelable2 = bundle.getParcelable(j);
            if (bundle.getBoolean(i)) {
                a();
            }
            parcelable = parcelable2;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) getParent();
        if (this.e == null) {
            this.e = new android.view.View(getContext());
            this.e.setContentDescription(null);
            defpackage.sn.a(this.e, 2);
            this.e.setBackgroundColor(this.n);
            this.e.setFitsSystemWindows(true);
            defpackage.sn.a(this.e, defpackage.sn.a.u(this));
            viewGroup.addView(this.e, ((android.view.ViewGroup) getParent()).indexOfChild(this), new defpackage.ha(-1, -1));
        }
        a(5);
    }

    public final void a(int i2) {
        if (i2 == 5) {
            this.e.setVisibility(8);
            this.e.setAlpha(0.0f);
            return;
        }
        this.e.setVisibility(0);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.c != null) {
            this.c.h = null;
        }
    }

    public final void a() {
        if (!this.f && !b()) {
            this.f = true;
            a((java.lang.Runnable) new defpackage.cge(this));
        }
    }

    private final void a(java.lang.Runnable runnable) {
        if (this.c == null) {
            post(new defpackage.cgf(this, runnable));
            requestLayout();
            return;
        }
        runnable.run();
    }

    public final boolean b() {
        return (this.c == null || this.c.c == 5) ? false : true;
    }

    public final void c() {
        a((java.lang.Runnable) new defpackage.cgg(this));
    }

    public final void a(defpackage.cgi cgi) {
        if (this.d == null) {
            this.d = new java.util.ArrayList();
        }
        this.d.add(cgi);
    }

    public final void b(defpackage.cgi cgi) {
        if (this.d != null) {
            this.d.remove(cgi);
        }
    }

    public final void a(float f2, int i2) {
        float[] fArr = this.l;
        float[] fArr2 = this.l;
        float[] fArr3 = this.l;
        this.l[3] = f2;
        fArr3[2] = f2;
        fArr2[1] = f2;
        fArr[0] = f2;
        this.m.setCornerRadii(this.l);
        this.m.setColor(android.graphics.Color.argb(i2, android.graphics.Color.red(this.k), android.graphics.Color.green(this.k), android.graphics.Color.blue(this.k)));
        defpackage.sn.a((android.view.View) this, (android.graphics.drawable.Drawable) this.m);
    }
}
