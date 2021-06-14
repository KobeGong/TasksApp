package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/* renamed from: abd  reason: default package */
/* compiled from: PG */
public final class abd {
    public final /* synthetic */ RecyclerView a;

    public final ViewHolder a(int i) {
        ViewHolder afv;
        RecyclerView recyclerView = this.a;
        int childCount = recyclerView.g.a.a.getChildCount();
        int i2 = 0;
        ViewHolder afv2 = null;
        while (true) {
            if (i2 >= childCount) {
                afv = afv2;
                break;
            }
            afv = RecyclerView.c(recyclerView.g.c(i2));
            if (afv != null && !afv.m() && afv.c == i) {
                if (!recyclerView.g.d(afv.a)) {
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
        if (this.a.g.d(afv.a)) {
            return null;
        }
        return afv;
    }

    public final void a(int i, int i2) {
        this.a.a(i, i2, true);
        this.a.F = true;
        this.a.D.c += i2;
    }

    public final void a(int i, int i2, Object obj) {
        int i3;
        RecyclerView recyclerView = this.a;
        int childCount = recyclerView.g.a.a.getChildCount();
        int i4 = i + i2;
        for (int i5 = 0; i5 < childCount; i5++) {
            View c = recyclerView.g.c(i5);
            ViewHolder c2 = RecyclerView.c(c);
            if (c2 != null && !c2.b() && c2.c >= i && c2.c < i4) {
                c2.b(2);
                c2.a(obj);
                ((afh) c.getLayoutParams()).c = true;
            }
        }
        afn afn = recyclerView.e;
        int i6 = i + i2;
        for (int size = afn.c.size() - 1; size >= 0; size--) {
            ViewHolder afv = (ViewHolder) afn.c.get(size);
            if (afv != null && (i3 = afv.c) >= i && i3 < i6) {
                afv.b(2);
                afn.a(size);
            }
        }
        this.a.G = true;
    }

    public final void b(int i, int i2) {
        RecyclerView recyclerView = this.a;
        int childCount = recyclerView.g.a.a.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            ViewHolder c = RecyclerView.c(recyclerView.g.c(i3));
            if (c != null && !c.b() && c.c >= i) {
                c.a(i2, false);
                recyclerView.D.f = true;
            }
        }
        afn afn = recyclerView.e;
        int size = afn.c.size();
        for (int i4 = 0; i4 < size; i4++) {
            ViewHolder afv = (ViewHolder) afn.c.get(i4);
            if (afv != null && afv.c >= i) {
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
        RecyclerView recyclerView = this.a;
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
            ViewHolder c = RecyclerView.c(recyclerView.g.c(i9));
            if (c != null && c.c >= i5 && c.c <= i4) {
                if (c.c == i) {
                    c.a(i2 - i, false);
                } else {
                    c.a(i3, false);
                }
                recyclerView.D.f = true;
            }
        }
        afn afn = recyclerView.e;
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
            ViewHolder afv = (ViewHolder) afn.c.get(i10);
            if (afv != null && afv.c >= i7 && afv.c <= i6) {
                if (afv.c == i) {
                    afv.a(i2 - i, false);
                } else {
                    afv.a(i8, false);
                }
            }
        }
        recyclerView.requestLayout();
        this.a.F = true;
    }

    public abd(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    /* access modifiers changed from: package-private */
    public final void a(abe abe) {
        switch (abe.a) {
            case 1:
                this.a.layoutManager.r();
                return;
            case 2:
                this.a.layoutManager.s();
                return;
            case 3:
            case 5:
            case 6:
            case 7:
            default:
                return;
            case 4:
                this.a.layoutManager.u();
                return;
            case 8:
                this.a.layoutManager.v();
                return;
        }
    }
}
