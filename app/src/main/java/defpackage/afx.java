package defpackage;

/* renamed from: afx reason: default package */
/* compiled from: PG */
public final class afx extends defpackage.rn {
    private final defpackage.afw b;

    public afx(defpackage.afw afw) {
        this.b = afw;
    }

    public final void a(android.view.View view, defpackage.tl tlVar) {
        int i;
        defpackage.to toVar;
        super.a(view, tlVar);
        if (!this.b.b.n() && this.b.b.mLayout != null) {
            LayoutManager afd = this.b.b.mLayout;
            RecyclerViewHolder c = android.support.v7.widget.RecyclerView.getChildViewHolderInt(view);
            if (c != null && !c.isRemoved() && !afd.a.d(c.itemView)) {
                defpackage.afn afn = afd.b.e;
                defpackage.aft aft = afd.b.D;
                int i2 = afd.e() ? LayoutManager.a(view) : 0;
                if (afd.d()) {
                    i = LayoutManager.a(view);
                } else {
                    i = 0;
                }
                if (android.os.Build.VERSION.SDK_INT >= 21) {
                    toVar = new defpackage.to(android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.obtain(i2, 1, i, 1, false, false));
                } else if (android.os.Build.VERSION.SDK_INT >= 19) {
                    toVar = new defpackage.to(android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.obtain(i2, 1, i, 1, false));
                } else {
                    toVar = new defpackage.to(null);
                }
                if (android.os.Build.VERSION.SDK_INT >= 19) {
                    tlVar.a.setCollectionItemInfo((android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo) toVar.a);
                }
            }
        }
    }

    public final boolean a(android.view.View view, int i, android.os.Bundle bundle) {
        if (super.a(view, i, bundle)) {
            return true;
        }
        if (this.b.b.n() || this.b.b.mLayout == null) {
            return false;
        }
        LayoutManager afd = this.b.b.mLayout;
        defpackage.afn afn = afd.b.e;
        defpackage.aft aft = afd.b.D;
        return false;
    }
}
