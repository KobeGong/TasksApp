package defpackage;

/* renamed from: fr reason: default package */
/* compiled from: PG */
public class BaseNavigationView extends ScrimInsetsFrameLayout {
    private static final int[] f = {16842912};
    private static final int[] g = {-16842910};
    public final NavigationMenu menu;
    public final NavigationMenuPresenter presenter;
    public defpackage.ft e;
    private final int h;
    private android.view.MenuInflater menuInflater;

    public BaseNavigationView(android.content.Context context) {
        this(context, null);
    }

    public BaseNavigationView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 2130772053);
    }

    public BaseNavigationView(android.content.Context context, android.util.AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        android.content.res.ColorStateList b;
        int i3;
        boolean z;
        this.presenter = new NavigationMenuPresenter();
        this.menu = new NavigationMenu(context);
        defpackage.agw a = ThemeEnforcement.a(context, attributeSet, defpackage.fw.a, i2);
        ViewCompat.a((android.view.View) this, a.a(defpackage.fw.b));
        if (a.f(defpackage.fw.e)) {
            ViewCompat.setElevation((android.view.View) this, (float) a.e(defpackage.fw.e, 0));
        }
        ViewCompat.b((android.view.View) this, a.a(defpackage.fw.c, false));
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
            this.presenter.b(a.e(defpackage.fw.h, 0));
        }
        int e2 = a.e(defpackage.fw.i, 0);
        this.menu.a((defpackage.zf) new defpackage.fs(this));
        this.presenter.d = 1;
        this.presenter.a(context, (MenuBuilder) this.menu);
        this.presenter.a(b);
        if (z) {
            this.presenter.a(i3);
        }
        this.presenter.b(colorStateList);
        this.presenter.a(a2);
        this.presenter.c(e2);
        this.menu.a((MenuPresenter) this.presenter);
        NavigationMenuPresenter fbVar = this.presenter;
        if (fbVar.menuView == null) {
            fbVar.menuView = (android.support.design.internal.NavigationMenuView) fbVar.layoutInflater.inflate(2131034168, this, false);
            if (fbVar.menuAdapter == null) {
                fbVar.menuAdapter = new NavigationMenuAdapter(fbVar);
            }
            fbVar.headerLayout = (android.widget.LinearLayout) fbVar.layoutInflater.inflate(2131034165, fbVar.menuView, false);
            fbVar.menuView.setAdapter((RecyclerViewAdapter) fbVar.menuAdapter);
        }
        addView(fbVar.menuView);
        if (a.f(defpackage.fw.m)) {
            int g2 = a.g(defpackage.fw.m, 0);
            this.presenter.b(true);
            if (this.menuInflater == null) {
                this.menuInflater = new SupportMenuInflater(getContext());
            }
            this.menuInflater.inflate(g2, this.menu);
            this.presenter.b(false);
            this.presenter.a(false);
        }
        if (a.f(defpackage.fw.f)) {
            int g3 = a.g(defpackage.fw.f, 0);
            NavigationMenuPresenter fbVar2 = this.presenter;
            fbVar2.addHeaderView(fbVar2.layoutInflater.inflate(g3, fbVar2.headerLayout, false));
        }
        a.b.recycle();
    }

    /* access modifiers changed from: protected */
    public android.os.Parcelable onSaveInstanceState() {
        defpackage.fu fuVar = new defpackage.fu(super.onSaveInstanceState());
        fuVar.a = new android.os.Bundle();
        NavigationMenu ezVar = this.menu;
        android.os.Bundle bundle = fuVar.a;
        if (!ezVar.i.isEmpty()) {
            android.util.SparseArray sparseArray = new android.util.SparseArray();
            java.util.Iterator it = ezVar.i.iterator();
            while (it.hasNext()) {
                java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
                MenuPresenter ztVar = (MenuPresenter) weakReference.get();
                if (ztVar == null) {
                    ezVar.i.remove(weakReference);
                } else {
                    int b = ztVar.getId();
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
        NavigationMenu ezVar = this.menu;
        android.util.SparseArray sparseParcelableArray = fuVar.a.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null && !ezVar.i.isEmpty()) {
            java.util.Iterator it = ezVar.i.iterator();
            while (it.hasNext()) {
                java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
                MenuPresenter ztVar = (MenuPresenter) weakReference.get();
                if (ztVar == null) {
                    ezVar.i.remove(weakReference);
                } else {
                    int b = ztVar.getId();
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
    public final void a(WindowInsetsCompat tkVar) {
        NavigationMenuPresenter fbVar = this.presenter;
        int b = tkVar.b();
        if (fbVar.n != b) {
            fbVar.n = b;
            if (fbVar.headerLayout.getChildCount() == 0) {
                fbVar.menuView.setPadding(0, fbVar.n, 0, fbVar.menuView.getPaddingBottom());
            }
        }
        ViewCompat.a.b((android.view.View) fbVar.headerLayout, tkVar);
    }

    public final void a(int i2) {
        android.view.MenuItem findItem = this.menu.findItem(i2);
        if (findItem != null) {
            this.presenter.menuAdapter.a((MenuItemImpl) findItem);
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
