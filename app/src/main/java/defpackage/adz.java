package defpackage;

/* renamed from: adz reason: default package */
/* compiled from: PG */
final class adz {
    public boolean a = true;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h = 0;
    public int i;
    public java.util.List j = null;
    public boolean k;

    adz() {
    }

    public final void a(android.view.View view) {
        android.view.View view2;
        int i2;
        android.view.View view3;
        int size = this.j.size();
        android.view.View view4 = null;
        int i3 = Integer.MAX_VALUE;
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                view2 = view4;
                break;
            }
            view2 = ((RecyclerViewHolder) this.j.get(i4)).itemView;
            defpackage.afh afh = (defpackage.afh) view2.getLayoutParams();
            if (view2 != view && !afh.a.isRemoved()) {
                i2 = (afh.a.c() - this.d) * this.e;
                if (i2 >= 0 && i2 < i3) {
                    if (i2 == 0) {
                        break;
                    }
                    view3 = view2;
                    i4++;
                    view4 = view3;
                    i3 = i2;
                }
            }
            i2 = i3;
            view3 = view4;
            i4++;
            view4 = view3;
            i3 = i2;
        }
        if (view2 == null) {
            this.d = -1;
        } else {
            this.d = ((defpackage.afh) view2.getLayoutParams()).a.c();
        }
    }
}
