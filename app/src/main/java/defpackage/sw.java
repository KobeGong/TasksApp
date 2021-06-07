package defpackage;

import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowManager;
import java.lang.reflect.Field;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: sw  reason: default package */
/* compiled from: PG */
public class sw {
    private static Field b;
    private static boolean c;
    private static Field d;
    private static boolean e;
    private static WeakHashMap f;
    private static Field g;
    private static boolean h = false;
    public WeakHashMap a = null;

    sw() {
    }

    public static void a(View view, rn rnVar) {
        View.AccessibilityDelegate accessibilityDelegate;
        if (rnVar == null) {
            accessibilityDelegate = null;
        } else {
            accessibilityDelegate = rnVar.a;
        }
        view.setAccessibilityDelegate(accessibilityDelegate);
    }

    public static boolean B(View view) {
        if (h) {
            return false;
        }
        if (g == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                g = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable th) {
                h = true;
                return false;
            }
        }
        try {
            return g.get(view) != null;
        } catch (Throwable th2) {
            h = true;
            return false;
        }
    }

    public static void a(View view, tl tlVar) {
        view.onInitializeAccessibilityNodeInfo(tlVar.a);
    }

    public boolean b(View view) {
        return false;
    }

    public void a(View view, boolean z) {
    }

    public void c(View view) {
        view.postInvalidate();
    }

    public void a(View view, Runnable runnable) {
        view.postDelayed(runnable, ValueAnimator.getFrameDelay());
    }

    public void a(View view, Runnable runnable, long j) {
        view.postDelayed(runnable, ValueAnimator.getFrameDelay() + j);
    }

    public int d(View view) {
        return 0;
    }

    public void a(View view, int i) {
    }

    public boolean a(View view, int i, Bundle bundle) {
        return false;
    }

    public int j(View view) {
        return 0;
    }

    public void q(View view) {
    }

    public int k(View view) {
        return view.getPaddingLeft();
    }

    public int l(View view) {
        return view.getPaddingRight();
    }

    public void a(View view, int i, int i2, int i3, int i4) {
        view.setPadding(i, i2, i3, i4);
    }

    public boolean i(View view) {
        return true;
    }

    public int e(View view) {
        if (!c) {
            try {
                Field declaredField = View.class.getDeclaredField("mMinWidth");
                b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
            }
            c = true;
        }
        if (b != null) {
            try {
                return ((Integer) b.get(view)).intValue();
            } catch (Exception e3) {
            }
        }
        return 0;
    }

    public int f(View view) {
        if (!e) {
            try {
                Field declaredField = View.class.getDeclaredField("mMinHeight");
                d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
            }
            e = true;
        }
        if (d != null) {
            try {
                return ((Integer) d.get(view)).intValue();
            } catch (Exception e3) {
            }
        }
        return 0;
    }

    public void a(View view, String str) {
        if (f == null) {
            f = new WeakHashMap();
        }
        f.put(view, str);
    }

    public String t(View view) {
        if (f == null) {
            return null;
        }
        return (String) f.get(view);
    }

    public int m(View view) {
        return 0;
    }

    public void g(View view) {
    }

    public void a(View view, float f2) {
    }

    public float u(View view) {
        return 0.0f;
    }

    public void b(View view, float f2) {
    }

    public float v(View view) {
        return 0.0f;
    }

    public void a(View view, Rect rect) {
    }

    public Rect p(View view) {
        return null;
    }

    public boolean h(View view) {
        return false;
    }

    public void a(View view, sl slVar) {
    }

    public tk a(View view, tk tkVar) {
        return tkVar;
    }

    public tk b(View view, tk tkVar) {
        return tkVar;
    }

    public boolean n(View view) {
        return false;
    }

    public boolean w(View view) {
        if (view instanceof sf) {
            return ((sf) view).isNestedScrollingEnabled();
        }
        return false;
    }

    public void a(View view, Drawable drawable) {
        view.setBackgroundDrawable(drawable);
    }

    public ColorStateList y(View view) {
        if (view instanceof sm) {
            return ((sm) view).d_();
        }
        return null;
    }

    public void a(View view, ColorStateList colorStateList) {
        if (view instanceof sm) {
            ((sm) view).a(colorStateList);
        }
    }

    public void a(View view, PorterDuff.Mode mode) {
        if (view instanceof sm) {
            ((sm) view).a(mode);
        }
    }

    public PorterDuff.Mode z(View view) {
        if (view instanceof sm) {
            return ((sm) view).b();
        }
        return null;
    }

    public void x(View view) {
        if (view instanceof sf) {
            ((sf) view).stopNestedScroll();
        }
    }

    public boolean r(View view) {
        return view.getWidth() > 0 && view.getHeight() > 0;
    }

    public float A(View view) {
        return v(view) + u(view);
    }

    public boolean s(View view) {
        return view.getWindowToken() != null;
    }

    public boolean a(View view) {
        return false;
    }

    public void d(View view, int i) {
    }

    public void b(View view, int i) {
        view.offsetLeftAndRight(i);
        if (view.getVisibility() == 0) {
            C(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                C((View) parent);
            }
        }
    }

    public void c(View view, int i) {
        view.offsetTopAndBottom(i);
        if (view.getVisibility() == 0) {
            C(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                C((View) parent);
            }
        }
    }

    private static void C(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    public Display o(View view) {
        if (s(view)) {
            return ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay();
        }
        return null;
    }

    static {
        new AtomicInteger(1);
    }
}
