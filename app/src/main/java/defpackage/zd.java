package defpackage;

import android.support.v7.view.menu.ListMenuItemView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.google.android.apps.tasks.R;
import java.util.ArrayList;

/* renamed from: zd  reason: default package */
/* compiled from: PG */
public final class zd extends BaseAdapter {
    private static final int c = R.layout.abc_popup_menu_item_layout;
    public ze a;
    public boolean b;
    private int d = -1;
    private final boolean e;
    private final LayoutInflater f;

    public zd(ze zeVar, LayoutInflater layoutInflater, boolean z) {
        this.e = z;
        this.f = layoutInflater;
        this.a = zeVar;
        a();
    }

    public final int getCount() {
        ArrayList k = this.e ? this.a.k() : this.a.i();
        if (this.d < 0) {
            return k.size();
        }
        return k.size() - 1;
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2;
        boolean z;
        int i2 = 0;
        if (view == null) {
            view2 = this.f.inflate(c, viewGroup, false);
        } else {
            view2 = view;
        }
        int groupId = ((zi) getItem(i)).getGroupId();
        int groupId2 = i + -1 >= 0 ? ((zi) getItem(i - 1)).getGroupId() : groupId;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view2;
        if (!this.a.b() || groupId == groupId2) {
            z = false;
        } else {
            z = true;
        }
        if (listMenuItemView.b != null) {
            ImageView imageView = listMenuItemView.b;
            if (listMenuItemView.d || !z) {
                i2 = 8;
            }
            imageView.setVisibility(i2);
        }
        zw zwVar = (zw) view2;
        if (this.b) {
            ListMenuItemView listMenuItemView2 = (ListMenuItemView) view2;
            listMenuItemView2.e = true;
            listMenuItemView2.c = true;
        }
        zwVar.a((zi) getItem(i));
        return view2;
    }

    private final void a() {
        zi ziVar = this.a.j;
        if (ziVar != null) {
            ArrayList k = this.a.k();
            int size = k.size();
            for (int i = 0; i < size; i++) {
                if (((zi) k.get(i)) == ziVar) {
                    this.d = i;
                    return;
                }
            }
        }
        this.d = -1;
    }

    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }

    public final /* synthetic */ Object getItem(int i) {
        ArrayList k = this.e ? this.a.k() : this.a.i();
        if (this.d >= 0 && i >= this.d) {
            i++;
        }
        return (zi) k.get(i);
    }
}
