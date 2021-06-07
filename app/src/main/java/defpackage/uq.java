package defpackage;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: uq  reason: default package */
/* compiled from: PG */
final class uq extends tp {
    private final /* synthetic */ up b;

    uq(up upVar) {
        this.b = upVar;
    }

    @Override // defpackage.tp
    public final tl a(int i) {
        return tl.a(AccessibilityNodeInfo.obtain(this.b.b(i).a));
    }

    @Override // defpackage.tp
    public final boolean a(int i, int i2, Bundle bundle) {
        up upVar = this.b;
        switch (i) {
            case -1:
                return sn.a.a(upVar.c, i2, bundle);
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

    @Override // defpackage.tp
    public final tl b(int i) {
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
