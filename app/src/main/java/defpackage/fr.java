package defpackage;

/* renamed from: fr reason: default package */
/* compiled from: PG */
public class fr extends defpackage.fn {
    private static final int[] f = {16842912};
    private static final int[] g = {-16842910};
    public final defpackage.ez c;
    public final defpackage.fb d;
    public defpackage.ft e;
    private final int h;
    private android.view.MenuInflater i;

    public fr(android.content.Context context) {
        this(context, null);
    }

    public fr(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 2130772053);
    }

    public fr(android.content.Context context, android.util.AttributeSet attributeSet, int i2) {
        android.content.res.ColorStateList b;
        int i3;
        boolean z;
        super(context, attributeSet, i2);
        this.d = new defpackage.fb();
        this.c = new defpackage.ez(context);
        defpackage.agw a = defpackage.fp.a(context, attributeSet, defpackage.fw.a, i2);
        defpackage.sn.a((android.view.View) this, a.a(defpackage.fw.b));
        if (a.f(defpackage.fw.e)) {
            defpackage.sn.a((android.view.View) this, (float) a.e(defpackage.fw.e, 0));
        }
        defpackage.sn.b((android.view.View) this, a.a(defpackage.fw.c, false));
        this.h = a.e(defpackage.fw.d, 0);
        if (a.f(defpackage.fw.j)) {
            b = a.e(defpackage.fw.j);
        } else {
            b = b(16842808);
        }
        if (a.f(defpackage.fw.k)) {
            i3 = a.g(defpackage.fw.k, 0);
            z = true;
        } else {
            i3 = 0;
            z = false;
        }
        android.content.res.ColorStateList colorStateList = null;
        if (a.f(defpackage.fw.l)) {
            colorStateList = a.e(defpackage.fw.l);
        }
        if (!z && colorStateList == null) {
            colorStateList = b(16842806);
        }
        android.graphics.drawable.Drawable a2 = a.a(defpackage.fw.g);
        if (a.f(defpackage.fw.h)) {
            this.d.b(a.e(defpackage.fw.h, 0));
        }
        int e2 = a.e(defpackage.fw.i, 0);
        this.c.a((defpackage.zf) new defpackage.fs(this));
        this.d.d = 1;
        this.d.a(context, (defpackage.ze) this.c);
        this.d.a(b);
        if (z) {
            this.d.a(i3);
        }
        this.d.b(colorStateList);
        this.d.a(a2);
        this.d.c(e2);
        this.c.a((defpackage.zt) this.d);
        defpackage.fb fbVar = this.d;
        if (fbVar.a == null) {
            fbVar.a = (android.support.design.internal.NavigationMenuView) fbVar.f.inflate(2131034168, this, false);
            if (fbVar.e == null) {
                fbVar.e = new defpackage.fd(fbVar);
            }
            fbVar.b = (android.widget.LinearLayout) fbVar.f.inflate(2131034165, fbVar.a, false);
            fbVar.a.a((defpackage.aet) fbVar.e);
        }
        addView(fbVar.a);
        if (a.f(defpackage.fw.m)) {
            int g2 = a.g(defpackage.fw.m, 0);
            this.d.b(true);
            if (this.i == null) {
                this.i = new defpackage.yj(getContext());
            }
            this.i.inflate(g2, this.c);
            this.d.b(false);
            this.d.a(false);
        }
        if (a.f(defpackage.fw.f)) {
            int g3 = a.g(defpackage.fw.f, 0);
            defpackage.fb fbVar2 = this.d;
            fbVar2.a(fbVar2.f.inflate(g3, fbVar2.b, false));
        }
        a.b.recycle();
    }

    /* access modifiers changed from: protected */
    public android.os.Parcelable onSaveInstanceState() {
        defpackage.fu fuVar = new defpackage.fu(super.onSaveInstanceState());
        fuVar.a = new android.os.Bundle();
        defpackage.ez ezVar = this.c;
        android.os.Bundle bundle = fuVar.a;
        if (!ezVar.i.isEmpty()) {
            android.util.SparseArray sparseArray = new android.util.SparseArray();
            java.util.Iterator it = ezVar.i.iterator();
            while (it.hasNext()) {
                java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
                defpackage.zt ztVar = (defpackage.zt) weakReference.get();
                if (ztVar == null) {
                    ezVar.i.remove(weakReference);
                } else {
                    int b = ztVar.b();
                    if (b > 0) {
                        android.os.Parcelable c2 = ztVar.c();
                        if (c2 != null) {
                            sparseArray.put(b, c2);
                        }
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        }
        return fuVar;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (!(parcelable instanceof defpackage.fu)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        defpackage.fu fuVar = (defpackage.fu) parcelable;
        super.onRestoreInstanceState(fuVar.e);
        defpackage.ez ezVar = this.c;
        android.util.SparseArray sparseParcelableArray = fuVar.a.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null && !ezVar.i.isEmpty()) {
            java.util.Iterator it = ezVar.i.iterator();
            while (it.hasNext()) {
                java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
                defpackage.zt ztVar = (defpackage.zt) weakReference.get();
                if (ztVar == null) {
                    ezVar.i.remove(weakReference);
                } else {
                    int b = ztVar.b();
                    if (b > 0) {
                        android.os.Parcelable parcelable2 = (android.os.Parcelable) sparseParcelableArray.get(b);
                        if (parcelable2 != null) {
                            ztVar.a(parcelable2);
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        switch (android.view.View.MeasureSpec.getMode(i2)) {
            case Integer.MIN_VALUE:
                i2 = android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.min(android.view.View.MeasureSpec.getSize(i2), this.h), 1073741824);
                break;
            case 0:
                i2 = android.view.View.MeasureSpec.makeMeasureSpec(this.h, 1073741824);
                break;
        }
        super.onMeasure(i2, i3);
    }

    /* access modifiers changed from: protected */
    public final void a(defpackage.tk tkVar) {
        defpackage.fb fbVar = this.d;
        int b = tkVar.b();
        if (fbVar.n != b) {
            fbVar.n = b;
            if (fbVar.b.getChildCount() == 0) {
                fbVar.a.setPadding(0, fbVar.n, 0, fbVar.a.getPaddingBottom());
            }
        }
        defpackage.sn.a.b((android.view.View) fbVar.b, tkVar);
    }

    public final void a(int i2) {
        android.view.MenuItem findItem = this.c.findItem(i2);
        if (findItem != null) {
            this.d.e.a((defpackage.zi) findItem);
        }
    }

    private final android.content.res.ColorStateList b(int i2) {
        android.util.TypedValue typedValue = new android.util.TypedValue();
        if (!getContext().getTheme().resolveAttribute(i2, typedValue, true)) {
            return null;
        }
        android.content.res.ColorStateList a = defpackage.xw.a(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(2130772212, typedValue, true)) {
            return null;
        }
        int i3 = typedValue.data;
        int defaultColor = a.getDefaultColor();
        return new android.content.res.ColorStateList(new int[][]{g, f, EMPTY_STATE_SET}, new int[]{a.getColorForState(g, defaultColor), i3, defaultColor});
    }
}
