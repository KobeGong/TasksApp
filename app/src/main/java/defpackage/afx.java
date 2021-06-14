package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: afx  reason: default package */
/* compiled from: PG */
public final class afx extends rn {
    private final afw b;

    public afx(afw afw) {
        this.b = afw;
    }

    @Override // defpackage.rn
    public final void a(View view, tl tlVar) {
        int i;
        to toVar;
        super.a(view, tlVar);
        if (!this.b.b.n() && this.b.b.layoutManager != null) {
            LayoutManager afd = this.b.b.layoutManager;
            ViewHolder c = RecyclerView.c(view);
            if (c != null && !c.m() && !afd.a.d(c.a)) {
                afn afn = afd.b.e;
                aft aft = afd.b.D;
                int a = afd.e() ? afd.a(view) : 0;
                if (afd.d()) {
                    i = afd.a(view);
                } else {
                    i = 0;
                }
                if (Build.VERSION.SDK_INT >= 21) {
                    toVar = new to(AccessibilityNodeInfo.CollectionItemInfo.obtain(a, 1, i, 1, false, false));
                } else if (Build.VERSION.SDK_INT >= 19) {
                    toVar = new to(AccessibilityNodeInfo.CollectionItemInfo.obtain(a, 1, i, 1, false));
                } else {
                    toVar = new to(null);
                }
                if (Build.VERSION.SDK_INT >= 19) {
                    tlVar.a.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) toVar.a);
                }
            }
        }
    }

    @Override // defpackage.rn
    public final boolean a(View view, int i, Bundle bundle) {
        if (super.a(view, i, bundle)) {
            return true;
        }
        if (this.b.b.n() || this.b.b.layoutManager == null) {
            return false;
        }
        LayoutManager afd = this.b.b.layoutManager;
        afn afn = afd.b.e;
        aft aft = afd.b.D;
        return false;
    }
}
