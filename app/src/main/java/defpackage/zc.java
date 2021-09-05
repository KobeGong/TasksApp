package defpackage;

/* renamed from: zc reason: default package */
/* compiled from: PG */
public final class zc extends android.widget.BaseAdapter {
    private int a = -1;
    private final /* synthetic */ defpackage.zb b;

    public zc(defpackage.zb zbVar) {
        this.b = zbVar;
        a();
    }

    public final int getCount() {
        int size = this.b.b.k().size();
        return this.a < 0 ? size : size - 1;
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final android.view.View getView(int i, android.view.View view, android.view.ViewGroup viewGroup) {
        android.view.View view2;
        if (view == null) {
            view2 = this.b.a.inflate(this.b.d, viewGroup, false);
        } else {
            view2 = view;
        }
        ((defpackage.zw) view2).a((MenuItemImpl) getItem(i));
        return view2;
    }

    private final void a() {
        MenuItemImpl ziVar = this.b.b.j;
        if (ziVar != null) {
            java.util.ArrayList k = this.b.b.k();
            int size = k.size();
            for (int i = 0; i < size; i++) {
                if (((MenuItemImpl) k.get(i)) == ziVar) {
                    this.a = i;
                    return;
                }
            }
        }
        this.a = -1;
    }

    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }

    public final /* synthetic */ java.lang.Object getItem(int i) {
        java.util.ArrayList k = this.b.b.k();
        if (this.a >= 0 && i >= this.a) {
            i++;
        }
        return (MenuItemImpl) k.get(i);
    }
}
