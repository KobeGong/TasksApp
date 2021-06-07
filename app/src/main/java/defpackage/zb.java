package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.view.menu.ExpandedMenuView;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import com.google.android.apps.tasks.R;

/* renamed from: zb  reason: default package */
/* compiled from: PG */
public final class zb implements AdapterView.OnItemClickListener, zt {
    public LayoutInflater a;
    public ze b;
    public ExpandedMenuView c;
    public int d;
    public zu e;
    public zc f;
    private Context g;

    public zb(Context context) {
        this((int) R.layout.abc_list_menu_item_layout);
        this.g = context;
        this.a = LayoutInflater.from(this.g);
    }

    private zb(int i) {
        this.d = R.layout.abc_list_menu_item_layout;
    }

    @Override // defpackage.zt
    public final void a(Context context, ze zeVar) {
        if (this.g != null) {
            this.g = context;
            if (this.a == null) {
                this.a = LayoutInflater.from(this.g);
            }
        }
        this.b = zeVar;
        if (this.f != null) {
            this.f.notifyDataSetChanged();
        }
    }

    public final ListAdapter d() {
        if (this.f == null) {
            this.f = new zc(this);
        }
        return this.f;
    }

    @Override // defpackage.zt
    public final void a(boolean z) {
        if (this.f != null) {
            this.f.notifyDataSetChanged();
        }
    }

    @Override // defpackage.zt
    public final void a(zu zuVar) {
        this.e = zuVar;
    }

    @Override // defpackage.zt
    public final boolean a(aad aad) {
        if (!aad.hasVisibleItems()) {
            return false;
        }
        zh zhVar = new zh(aad);
        ze zeVar = zhVar.a;
        xk xkVar = new xk(zeVar.a);
        zhVar.c = new zb(xkVar.a.a);
        zhVar.c.e = zhVar;
        zhVar.a.a(zhVar.c);
        xkVar.a.n = zhVar.c.d();
        xkVar.a.o = zhVar;
        View view = zeVar.h;
        if (view != null) {
            xkVar.a.e = view;
        } else {
            xkVar.a.c = zeVar.g;
            xkVar.a.d = zeVar.f;
        }
        xkVar.a.m = zhVar;
        zhVar.b = xkVar.a();
        zhVar.b.setOnDismissListener(zhVar);
        WindowManager.LayoutParams attributes = zhVar.b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        zhVar.b.show();
        if (this.e != null) {
            this.e.a(aad);
        }
        return true;
    }

    @Override // defpackage.zt
    public final void a(ze zeVar, boolean z) {
        if (this.e != null) {
            this.e.a(zeVar, z);
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.b.a((zi) this.f.getItem(i), this, 0);
    }

    @Override // defpackage.zt
    public final boolean a() {
        return false;
    }

    @Override // defpackage.zt
    public final boolean a(zi ziVar) {
        return false;
    }

    @Override // defpackage.zt
    public final boolean b(zi ziVar) {
        return false;
    }

    @Override // defpackage.zt
    public final int b() {
        return 0;
    }

    @Override // defpackage.zt
    public final Parcelable c() {
        if (this.c == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        if (this.c != null) {
            this.c.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    @Override // defpackage.zt
    public final void a(Parcelable parcelable) {
        SparseArray<Parcelable> sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.c.restoreHierarchyState(sparseParcelableArray);
        }
    }
}
