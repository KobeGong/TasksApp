package defpackage;

/* renamed from: st reason: default package */
/* compiled from: PG */
class st extends defpackage.ss {
    private static java.lang.ThreadLocal b;

    st() {
    }

    public final void a(android.view.View view, java.lang.String str) {
        view.setTransitionName(str);
    }

    public final java.lang.String t(android.view.View view) {
        return view.getTransitionName();
    }

    public final void g(android.view.View view) {
        view.requestApplyInsets();
    }

    public final void a(android.view.View view, float f) {
        view.setElevation(f);
    }

    public final float u(android.view.View view) {
        return view.getElevation();
    }

    public final void b(android.view.View view, float f) {
        view.setTranslationZ(f);
    }

    public final float v(android.view.View view) {
        return view.getTranslationZ();
    }

    public final void a(android.view.View view, defpackage.sl slVar) {
        if (slVar == null) {
            view.setOnApplyWindowInsetsListener(null);
        } else {
            view.setOnApplyWindowInsetsListener(new defpackage.su(slVar));
        }
    }

    public final boolean w(android.view.View view) {
        return view.isNestedScrollingEnabled();
    }

    public final void x(android.view.View view) {
        view.stopNestedScroll();
    }

    public final android.content.res.ColorStateList y(android.view.View view) {
        return view.getBackgroundTintList();
    }

    public final void a(android.view.View view, android.content.res.ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
        if (android.os.Build.VERSION.SDK_INT == 21) {
            android.graphics.drawable.Drawable background = view.getBackground();
            boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
            if (background != null && z) {
                if (background.isStateful()) {
                    background.setState(view.getDrawableState());
                }
                view.setBackground(background);
            }
        }
    }

    public final void a(android.view.View view, android.graphics.PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
        if (android.os.Build.VERSION.SDK_INT == 21) {
            android.graphics.drawable.Drawable background = view.getBackground();
            boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
            if (background != null && z) {
                if (background.isStateful()) {
                    background.setState(view.getDrawableState());
                }
                view.setBackground(background);
            }
        }
    }

    public final android.graphics.PorterDuff.Mode z(android.view.View view) {
        return view.getBackgroundTintMode();
    }

    public final defpackage.tk a(android.view.View view, defpackage.tk tkVar) {
        android.view.WindowInsets windowInsets = (android.view.WindowInsets) defpackage.tk.a(tkVar);
        android.view.WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(windowInsets);
        if (onApplyWindowInsets != windowInsets) {
            windowInsets = new android.view.WindowInsets(onApplyWindowInsets);
        }
        return defpackage.tk.a((java.lang.Object) windowInsets);
    }

    public final defpackage.tk b(android.view.View view, defpackage.tk tkVar) {
        android.view.WindowInsets windowInsets = (android.view.WindowInsets) defpackage.tk.a(tkVar);
        android.view.WindowInsets dispatchApplyWindowInsets = view.dispatchApplyWindowInsets(windowInsets);
        if (dispatchApplyWindowInsets != windowInsets) {
            windowInsets = new android.view.WindowInsets(dispatchApplyWindowInsets);
        }
        return defpackage.tk.a((java.lang.Object) windowInsets);
    }

    public final float A(android.view.View view) {
        return view.getZ();
    }

    public void b(android.view.View view, int i) {
        boolean z;
        android.graphics.Rect a = a();
        android.view.ViewParent parent = view.getParent();
        if (parent instanceof android.view.View) {
            android.view.View view2 = (android.view.View) parent;
            a.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z = !a.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        } else {
            z = false;
        }
        super.b(view, i);
        if (z && a.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((android.view.View) parent).invalidate(a);
        }
    }

    public void c(android.view.View view, int i) {
        boolean z;
        android.graphics.Rect a = a();
        android.view.ViewParent parent = view.getParent();
        if (parent instanceof android.view.View) {
            android.view.View view2 = (android.view.View) parent;
            a.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z = !a.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        } else {
            z = false;
        }
        super.c(view, i);
        if (z && a.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((android.view.View) parent).invalidate(a);
        }
    }

    private static android.graphics.Rect a() {
        if (b == null) {
            b = new java.lang.ThreadLocal();
        }
        android.graphics.Rect rect = (android.graphics.Rect) b.get();
        if (rect == null) {
            rect = new android.graphics.Rect();
            b.set(rect);
        }
        rect.setEmpty();
        return rect;
    }
}
