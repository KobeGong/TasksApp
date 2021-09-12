package defpackage;

/* renamed from: abd reason: default package */
/* compiled from: PG */
public final class abd {
    public final /* synthetic */ android.support.v7.widget.RecyclerView a;

    public final RecyclerViewHolder a(int i) {
        RecyclerViewHolder afv;
        android.support.v7.widget.RecyclerView recyclerView = this.a;
        int childCount = recyclerView.g.a.a.getChildCount();
        int i2 = 0;
        RecyclerViewHolder afv2 = null;
        while (true) {
            if (i2 >= childCount) {
                afv = afv2;
                break;
            }
            afv = android.support.v7.widget.RecyclerView.getChildViewHolderInt(recyclerView.g.c(i2));
            if (afv != null && !afv.isRemoved() && afv.position == i) {
                if (!recyclerView.g.d(afv.itemView)) {
                    break;
                }
            } else {
                afv = afv2;
            }
            i2++;
            afv2 = afv;
        }
        if (afv == null) {
            return null;
        }
        if (this.a.g.d(afv.itemView)) {
            return null;
        }
        return afv;
    }

    public final void a(int i, int i2) {
        this.a.a(i, i2, true);
        this.a.F = true;
        this.a.D.c += i2;
    }

    public final void a(int i, int i2, java.lang.Object obj) {
        android.support.v7.widget.RecyclerView recyclerView = this.a;
        int childCount = recyclerView.g.a.a.getChildCount();
        int i3 = i + i2;
        for (int i4 = 0; i4 < childCount; i4++) {
            android.view.View c = recyclerView.g.c(i4);
            RecyclerViewHolder c2 = android.support.v7.widget.RecyclerView.getChildViewHolderInt(c);
            if (c2 != null && !c2.shouldIgnore() && c2.position >= i && c2.position < i3) {
                c2.b(2);
                c2.a(obj);
                ((defpackage.afh) c.getLayoutParams()).c = true;
            }
        }
        defpackage.afn afn = recyclerView.e;
        int i5 = i + i2;
        for (int size = afn.c.size() - 1; size >= 0; size--) {
            RecyclerViewHolder afv = (RecyclerViewHolder) afn.c.get(size);
            if (afv != null) {
                int i6 = afv.position;
                if (i6 >= i && i6 < i5) {
                    afv.b(2);
                    afn.a(size);
                }
            }
        }
        this.a.G = true;
    }

    public final void b(int i, int i2) {
        android.support.v7.widget.RecyclerView recyclerView = this.a;
        int childCount = recyclerView.g.a.a.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            RecyclerViewHolder c = android.support.v7.widget.RecyclerView.getChildViewHolderInt(recyclerView.g.c(i3));
            if (c != null && !c.shouldIgnore() && c.position >= i) {
                c.a(i2, false);
                recyclerView.D.f = true;
            }
        }
        defpackage.afn afn = recyclerView.e;
        int size = afn.c.size();
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerViewHolder afv = (RecyclerViewHolder) afn.c.get(i4);
            if (afv != null && afv.position >= i) {
                afv.a(i2, true);
            }
        }
        recyclerView.requestLayout();
        this.a.F = true;
    }

    public final void c(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = -1;
        android.support.v7.widget.RecyclerView recyclerView = this.a;
        int childCount = recyclerView.g.a.a.getChildCount();
        if (i < i2) {
            i3 = -1;
            i4 = i2;
            i5 = i;
        } else {
            i3 = 1;
            i4 = i;
            i5 = i2;
        }
        for (int i9 = 0; i9 < childCount; i9++) {
            RecyclerViewHolder c = android.support.v7.widget.RecyclerView.getChildViewHolderInt(recyclerView.g.c(i9));
            if (c != null && c.position >= i5 && c.position <= i4) {
                if (c.position == i) {
                    c.a(i2 - i, false);
                } else {
                    c.a(i3, false);
                }
                recyclerView.D.f = true;
            }
        }
        defpackage.afn afn = recyclerView.e;
        if (i < i2) {
            i6 = i2;
            i7 = i;
        } else {
            i8 = 1;
            i6 = i;
            i7 = i2;
        }
        int size = afn.c.size();
        for (int i10 = 0; i10 < size; i10++) {
            RecyclerViewHolder afv = (RecyclerViewHolder) afn.c.get(i10);
            if (afv != null && afv.position >= i7 && afv.position <= i6) {
                if (afv.position == i) {
                    afv.a(i2 - i, false);
                } else {
                    afv.a(i8, false);
                }
            }
        }
        recyclerView.requestLayout();
        this.a.F = true;
    }

    public abd(android.support.v7.widget.RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    /* access modifiers changed from: 0000 */
    public final void a(defpackage.abe abe) {
        switch (abe.a) {
            case 1:
                this.a.mLayout.r();
                return;
            case 2:
                this.a.mLayout.s();
                return;
            case 4:
                this.a.mLayout.u();
                return;
            case 8:
                this.a.mLayout.v();
                return;
            default:
                return;
        }
    }
}
