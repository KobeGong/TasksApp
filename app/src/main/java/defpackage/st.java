package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowInsets;

/* renamed from: st  reason: default package */
/* compiled from: PG */
class st extends ss {
    private static ThreadLocal b;

    st() {
    }

    @Override // defpackage.sw
    public final void a(View view, String str) {
        view.setTransitionName(str);
    }

    @Override // defpackage.sw
    public final String t(View view) {
        return view.getTransitionName();
    }

    @Override // defpackage.sw, defpackage.sp
    public final void g(View view) {
        view.requestApplyInsets();
    }

    @Override // defpackage.sw
    public final void a(View view, float f) {
        view.setElevation(f);
    }

    @Override // defpackage.sw
    public final float u(View view) {
        return view.getElevation();
    }

    @Override // defpackage.sw
    public final void b(View view, float f) {
        view.setTranslationZ(f);
    }

    @Override // defpackage.sw
    public final float v(View view) {
        return view.getTranslationZ();
    }

    @Override // defpackage.sw
    public final void a(View view, sl slVar) {
        if (slVar == null) {
            view.setOnApplyWindowInsetsListener(null);
        } else {
            view.setOnApplyWindowInsetsListener(new su(slVar));
        }
    }

    @Override // defpackage.sw
    public final boolean w(View view) {
        return view.isNestedScrollingEnabled();
    }

    @Override // defpackage.sw
    public final void x(View view) {
        view.stopNestedScroll();
    }

    @Override // defpackage.sw
    public final ColorStateList y(View view) {
        return view.getBackgroundTintList();
    }

    @Override // defpackage.sw
    public final void a(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
        if (Build.VERSION.SDK_INT == 21) {
            Drawable background = view.getBackground();
            boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
            if (background != null && z) {
                if (background.isStateful()) {
                    background.setState(view.getDrawableState());
                }
                view.setBackground(background);
            }
        }
    }

    @Override // defpackage.sw
    public final void a(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
        if (Build.VERSION.SDK_INT == 21) {
            Drawable background = view.getBackground();
            boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
            if (background != null && z) {
                if (background.isStateful()) {
                    background.setState(view.getDrawableState());
                }
                view.setBackground(background);
            }
        }
    }

    @Override // defpackage.sw
    public final PorterDuff.Mode z(View view) {
        return view.getBackgroundTintMode();
    }

    @Override // defpackage.sw
    public final tk a(View view, tk tkVar) {
        WindowInsets windowInsets = (WindowInsets) tk.a(tkVar);
        WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(windowInsets);
        if (onApplyWindowInsets != windowInsets) {
            windowInsets = new WindowInsets(onApplyWindowInsets);
        }
        return tk.a(windowInsets);
    }

    @Override // defpackage.sw
    public final tk b(View view, tk tkVar) {
        WindowInsets windowInsets = (WindowInsets) tk.a(tkVar);
        WindowInsets dispatchApplyWindowInsets = view.dispatchApplyWindowInsets(windowInsets);
        if (dispatchApplyWindowInsets != windowInsets) {
            windowInsets = new WindowInsets(dispatchApplyWindowInsets);
        }
        return tk.a(windowInsets);
    }

    @Override // defpackage.sw
    public final float A(View view) {
        return view.getZ();
    }

    @Override // defpackage.sw
    public void b(View view, int i) {
        boolean z;
        Rect a = a();
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            a.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z = !a.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        } else {
            z = false;
        }
        super.b(view, i);
        if (z && a.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(a);
        }
    }

    @Override // defpackage.sw
    public void c(View view, int i) {
        boolean z;
        Rect a = a();
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            a.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z = !a.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        } else {
            z = false;
        }
        super.c(view, i);
        if (z && a.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(a);
        }
    }

    private static Rect a() {
        if (b == null) {
            b = new ThreadLocal();
        }
        Rect rect = (Rect) b.get();
        if (rect == null) {
            rect = new Rect();
            b.set(rect);
        }
        rect.setEmpty();
        return rect;
    }
}
