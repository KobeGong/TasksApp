package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* renamed from: zc  reason: default package */
/* compiled from: PG */
public final class zc extends BaseAdapter {
    private int a = -1;
    private final /* synthetic */ zb b;

    public zc(zb zbVar) {
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

    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2;
        if (view == null) {
            view2 = this.b.a.inflate(this.b.d, viewGroup, false);
        } else {
            view2 = view;
        }
        ((zw) view2).a((MenuItemImpl) getItem(i));
        return view2;
    }

    private final void a() {
        MenuItemImpl ziVar = this.b.b.j;
        if (ziVar != null) {
            ArrayList k = this.b.b.k();
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

    public final /* synthetic */ Object getItem(int i) {
        ArrayList k = this.b.b.k();
        if (this.a >= 0 && i >= this.a) {
            i++;
        }
        return (MenuItemImpl) k.get(i);
    }
}
