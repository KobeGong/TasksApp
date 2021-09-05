package defpackage;

/* renamed from: tk reason: default package */
/* compiled from: PG */
public final class WindowInsetsCompat {
    public final java.lang.Object a;

    public WindowInsetsCompat(java.lang.Object obj) {
        this.a = obj;
    }

    public final int a() {
        if (android.os.Build.VERSION.SDK_INT >= 20) {
            return ((android.view.WindowInsets) this.a).getSystemWindowInsetLeft();
        }
        return 0;
    }

    public final int b() {
        if (android.os.Build.VERSION.SDK_INT >= 20) {
            return ((android.view.WindowInsets) this.a).getSystemWindowInsetTop();
        }
        return 0;
    }

    public final int c() {
        if (android.os.Build.VERSION.SDK_INT >= 20) {
            return ((android.view.WindowInsets) this.a).getSystemWindowInsetRight();
        }
        return 0;
    }

    public final int d() {
        if (android.os.Build.VERSION.SDK_INT >= 20) {
            return ((android.view.WindowInsets) this.a).getSystemWindowInsetBottom();
        }
        return 0;
    }

    public final boolean e() {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            return ((android.view.WindowInsets) this.a).isConsumed();
        }
        return false;
    }

    public final WindowInsetsCompat f() {
        if (android.os.Build.VERSION.SDK_INT >= 20) {
            return new WindowInsetsCompat(((android.view.WindowInsets) this.a).consumeSystemWindowInsets());
        }
        return null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WindowInsetsCompat tkVar = (WindowInsetsCompat) obj;
        if (this.a != null) {
            return this.a.equals(tkVar.a);
        }
        if (tkVar.a != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (this.a == null) {
            return 0;
        }
        return this.a.hashCode();
    }

    static WindowInsetsCompat a(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        return new WindowInsetsCompat(obj);
    }

    static java.lang.Object a(WindowInsetsCompat tkVar) {
        if (tkVar == null) {
            return null;
        }
        return tkVar.a;
    }
}
