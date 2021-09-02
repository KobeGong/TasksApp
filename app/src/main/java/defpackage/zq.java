package defpackage;

/* renamed from: zq reason: default package */
/* compiled from: PG */
abstract class zq implements android.widget.AdapterView.OnItemClickListener, defpackage.zt, defpackage.zz {
    public android.graphics.Rect g;

    zq() {
    }

    public abstract void a(int i);

    public abstract void a(android.view.View view);

    public abstract void a(android.widget.PopupWindow.OnDismissListener onDismissListener);

    public abstract void a(defpackage.ze zeVar);

    public abstract void b(int i);

    public abstract void b(boolean z);

    public abstract void c(int i);

    public abstract void c(boolean z);

    public final void a(android.content.Context context, defpackage.ze zeVar) {
    }

    public final boolean a(defpackage.zi ziVar) {
        return false;
    }

    public final boolean b(defpackage.zi ziVar) {
        return false;
    }

    public final int b() {
        return 0;
    }

    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i, long j) {
        android.widget.ListAdapter listAdapter = (android.widget.ListAdapter) adapterView.getAdapter();
        a(listAdapter).a.a((android.view.MenuItem) listAdapter.getItem(i), (defpackage.zt) this, h() ? 0 : 4);
    }

    protected static int a(android.widget.ListAdapter listAdapter, android.view.ViewGroup viewGroup, android.content.Context context, int i) {
        android.view.ViewGroup viewGroup2;
        int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i2 = 0;
        int i3 = 0;
        android.view.View view = null;
        int i4 = 0;
        android.view.ViewGroup viewGroup3 = viewGroup;
        while (i2 < count) {
            int itemViewType = listAdapter.getItemViewType(i2);
            if (itemViewType != i3) {
                i3 = itemViewType;
                view = null;
            }
            if (viewGroup3 == null) {
                viewGroup2 = new android.widget.FrameLayout(context);
            } else {
                viewGroup2 = viewGroup3;
            }
            view = listAdapter.getView(i2, view, viewGroup2);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth <= i4) {
                measuredWidth = i4;
            }
            i2++;
            i4 = measuredWidth;
            viewGroup3 = viewGroup2;
        }
        return i4;
    }

    protected static defpackage.zd a(android.widget.ListAdapter listAdapter) {
        if (listAdapter instanceof android.widget.HeaderViewListAdapter) {
            return (defpackage.zd) ((android.widget.HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        }
        return (defpackage.zd) listAdapter;
    }

    protected static boolean b(defpackage.ze zeVar) {
        int size = zeVar.size();
        for (int i = 0; i < size; i++) {
            android.view.MenuItem item = zeVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean h() {
        return true;
    }
}
