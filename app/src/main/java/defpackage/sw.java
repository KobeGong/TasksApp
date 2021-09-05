package defpackage;

/* renamed from: sw reason: default package */
/* compiled from: PG */
public class sw {
    private static java.lang.reflect.Field b;
    private static boolean c;
    private static java.lang.reflect.Field d;
    private static boolean e;
    private static java.util.WeakHashMap f;
    private static java.lang.reflect.Field g;
    private static boolean h = false;
    public java.util.WeakHashMap a = null;

    sw() {
    }

    public static void a(android.view.View view, defpackage.rn rnVar) {
        android.view.View.AccessibilityDelegate accessibilityDelegate;
        if (rnVar == null) {
            accessibilityDelegate = null;
        } else {
            accessibilityDelegate = rnVar.a;
        }
        view.setAccessibilityDelegate(accessibilityDelegate);
    }

    public static boolean B(android.view.View view) {
        if (h) {
            return false;
        }
        if (g == null) {
            try {
                java.lang.reflect.Field declaredField = android.view.View.class.getDeclaredField("mAccessibilityDelegate");
                g = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable th) {
                h = true;
                return false;
            }
        }
        try {
            if (g.get(view) != null) {
                return true;
            }
            return false;
        } catch (Throwable th2) {
            h = true;
            return false;
        }
    }

    public static void a(android.view.View view, defpackage.tl tlVar) {
        view.onInitializeAccessibilityNodeInfo(tlVar.a);
    }

    public boolean b(android.view.View view) {
        return false;
    }

    public void a(android.view.View view, boolean z) {
    }

    public void c(android.view.View view) {
        view.postInvalidate();
    }

    public void a(android.view.View view, java.lang.Runnable runnable) {
        view.postDelayed(runnable, android.animation.ValueAnimator.getFrameDelay());
    }

    public void a(android.view.View view, java.lang.Runnable runnable, long j) {
        view.postDelayed(runnable, android.animation.ValueAnimator.getFrameDelay() + j);
    }

    public int d(android.view.View view) {
        return 0;
    }

    public void a(android.view.View view, int i) {
    }

    public boolean a(android.view.View view, int i, android.os.Bundle bundle) {
        return false;
    }

    public int j(android.view.View view) {
        return 0;
    }

    public void q(android.view.View view) {
    }

    public int k(android.view.View view) {
        return view.getPaddingLeft();
    }

    public int l(android.view.View view) {
        return view.getPaddingRight();
    }

    public void a(android.view.View view, int i, int i2, int i3, int i4) {
        view.setPadding(i, i2, i3, i4);
    }

    public boolean i(android.view.View view) {
        return true;
    }

    public int e(android.view.View view) {
        if (!c) {
            try {
                java.lang.reflect.Field declaredField = android.view.View.class.getDeclaredField("mMinWidth");
                b = declaredField;
                declaredField.setAccessible(true);
            } catch (java.lang.NoSuchFieldException e2) {
            }
            c = true;
        }
        if (b != null) {
            try {
                return ((java.lang.Integer) b.get(view)).intValue();
            } catch (java.lang.Exception e3) {
            }
        }
        return 0;
    }

    public int f(android.view.View view) {
        if (!e) {
            try {
                java.lang.reflect.Field declaredField = android.view.View.class.getDeclaredField("mMinHeight");
                d = declaredField;
                declaredField.setAccessible(true);
            } catch (java.lang.NoSuchFieldException e2) {
            }
            e = true;
        }
        if (d != null) {
            try {
                return ((java.lang.Integer) d.get(view)).intValue();
            } catch (java.lang.Exception e3) {
            }
        }
        return 0;
    }

    public void a(android.view.View view, java.lang.String str) {
        if (f == null) {
            f = new java.util.WeakHashMap();
        }
        f.put(view, str);
    }

    public java.lang.String t(android.view.View view) {
        if (f == null) {
            return null;
        }
        return (java.lang.String) f.get(view);
    }

    public int m(android.view.View view) {
        return 0;
    }

    public void g(android.view.View view) {
    }

    public void a(android.view.View view, float f2) {
    }

    public float u(android.view.View view) {
        return 0.0f;
    }

    public void b(android.view.View view, float f2) {
    }

    public float v(android.view.View view) {
        return 0.0f;
    }

    public void a(android.view.View view, android.graphics.Rect rect) {
    }

    public android.graphics.Rect p(android.view.View view) {
        return null;
    }

    public boolean h(android.view.View view) {
        return false;
    }

    public void a(android.view.View view, OnApplyWindowInsetsListener slVar) {
    }

    public WindowInsetsCompat a(android.view.View view, WindowInsetsCompat tkVar) {
        return tkVar;
    }

    public WindowInsetsCompat b(android.view.View view, WindowInsetsCompat tkVar) {
        return tkVar;
    }

    public boolean n(android.view.View view) {
        return false;
    }

    public boolean w(android.view.View view) {
        if (view instanceof defpackage.sf) {
            return ((defpackage.sf) view).isNestedScrollingEnabled();
        }
        return false;
    }

    public void a(android.view.View view, android.graphics.drawable.Drawable drawable) {
        view.setBackgroundDrawable(drawable);
    }

    public android.content.res.ColorStateList y(android.view.View view) {
        if (view instanceof defpackage.sm) {
            return ((defpackage.sm) view).d_();
        }
        return null;
    }

    public void a(android.view.View view, android.content.res.ColorStateList colorStateList) {
        if (view instanceof defpackage.sm) {
            ((defpackage.sm) view).a(colorStateList);
        }
    }

    public void a(android.view.View view, android.graphics.PorterDuff.Mode mode) {
        if (view instanceof defpackage.sm) {
            ((defpackage.sm) view).a(mode);
        }
    }

    public android.graphics.PorterDuff.Mode z(android.view.View view) {
        if (view instanceof defpackage.sm) {
            return ((defpackage.sm) view).b();
        }
        return null;
    }

    public void x(android.view.View view) {
        if (view instanceof defpackage.sf) {
            ((defpackage.sf) view).stopNestedScroll();
        }
    }

    public boolean r(android.view.View view) {
        return view.getWidth() > 0 && view.getHeight() > 0;
    }

    public float A(android.view.View view) {
        return v(view) + u(view);
    }

    public boolean s(android.view.View view) {
        return view.getWindowToken() != null;
    }

    public boolean a(android.view.View view) {
        return false;
    }

    public void d(android.view.View view, int i) {
    }

    public void b(android.view.View view, int i) {
        view.offsetLeftAndRight(i);
        if (view.getVisibility() == 0) {
            C(view);
            android.view.ViewParent parent = view.getParent();
            if (parent instanceof android.view.View) {
                C((android.view.View) parent);
            }
        }
    }

    public void c(android.view.View view, int i) {
        view.offsetTopAndBottom(i);
        if (view.getVisibility() == 0) {
            C(view);
            android.view.ViewParent parent = view.getParent();
            if (parent instanceof android.view.View) {
                C((android.view.View) parent);
            }
        }
    }

    private static void C(android.view.View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    public android.view.Display o(android.view.View view) {
        if (s(view)) {
            return ((android.view.WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay();
        }
        return null;
    }

    static {
        new java.util.concurrent.atomic.AtomicInteger(1);
    }
}
