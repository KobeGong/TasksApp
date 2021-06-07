package defpackage;

import android.os.Build;
import android.view.WindowInsets;

/* renamed from: tk  reason: default package */
/* compiled from: PG */
public final class tk {
    public final Object a;

    public tk(Object obj) {
        this.a = obj;
    }

    public final int a() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.a).getSystemWindowInsetLeft();
        }
        return 0;
    }

    public final int b() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.a).getSystemWindowInsetTop();
        }
        return 0;
    }

    public final int c() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.a).getSystemWindowInsetRight();
        }
        return 0;
    }

    public final int d() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.a).getSystemWindowInsetBottom();
        }
        return 0;
    }

    public final boolean e() {
        if (Build.VERSION.SDK_INT >= 21) {
            return ((WindowInsets) this.a).isConsumed();
        }
        return false;
    }

    public final tk f() {
        if (Build.VERSION.SDK_INT >= 20) {
            return new tk(((WindowInsets) this.a).consumeSystemWindowInsets());
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        tk tkVar = (tk) obj;
        if (this.a == null) {
            return tkVar.a == null;
        }
        return this.a.equals(tkVar.a);
    }

    public final int hashCode() {
        if (this.a == null) {
            return 0;
        }
        return this.a.hashCode();
    }

    static tk a(Object obj) {
        if (obj == null) {
            return null;
        }
        return new tk(obj);
    }

    static Object a(tk tkVar) {
        if (tkVar == null) {
            return null;
        }
        return tkVar.a;
    }
}
