package defpackage;

/* renamed from: uq reason: default package */
/* compiled from: PG */
final class uq extends defpackage.tp {
    private final /* synthetic */ defpackage.up b;

    uq(defpackage.up upVar) {
        this.b = upVar;
    }

    public final defpackage.tl a(int i) {
        return defpackage.tl.a(android.view.accessibility.AccessibilityNodeInfo.obtain(this.b.b(i).a));
    }

    public final boolean a(int i, int i2, android.os.Bundle bundle) {
        defpackage.up upVar = this.b;
        switch (i) {
            case -1:
                return ViewCompat.a.a(upVar.c, i2, bundle);
            default:
                switch (i2) {
                    case 1:
                        if (!upVar.c.isFocused() && !upVar.c.requestFocus()) {
                            return false;
                        }
                        if (upVar.e == i) {
                            return false;
                        }
                        if (upVar.e != Integer.MIN_VALUE) {
                            upVar.d(upVar.e);
                        }
                        upVar.e = i;
                        upVar.b(i, 8);
                        return true;
                    case 2:
                        return upVar.d(i);
                    case 64:
                        if (!upVar.b.isEnabled() || !upVar.b.isTouchExplorationEnabled()) {
                            return false;
                        }
                        if (upVar.d == i) {
                            return false;
                        }
                        if (upVar.d != Integer.MIN_VALUE) {
                            upVar.c(upVar.d);
                        }
                        upVar.d = i;
                        upVar.c.invalidate();
                        upVar.b(i, 32768);
                        return true;
                    case 128:
                        return upVar.c(i);
                    default:
                        return upVar.a(i, i2);
                }
        }
    }

    public final defpackage.tl b(int i) {
        int i2;
        if (i == 2) {
            i2 = this.b.d;
        } else {
            i2 = this.b.e;
        }
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return a(i2);
    }
}
