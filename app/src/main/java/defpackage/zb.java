package defpackage;

/* renamed from: zb reason: default package */
/* compiled from: PG */
public final class zb implements android.widget.AdapterView.OnItemClickListener, defpackage.zt {
    public android.view.LayoutInflater a;
    public defpackage.ze b;
    public android.support.v7.view.menu.ExpandedMenuView c;
    public int d;
    public defpackage.zu e;
    public defpackage.zc f;
    private android.content.Context g;

    public zb(android.content.Context context) {
        this(2131034127);
        this.g = context;
        this.a = android.view.LayoutInflater.from(this.g);
    }

    private zb(int i) {
        this.d = 2131034127;
    }

    public final void a(android.content.Context context, defpackage.ze zeVar) {
        if (this.g != null) {
            this.g = context;
            if (this.a == null) {
                this.a = android.view.LayoutInflater.from(this.g);
            }
        }
        this.b = zeVar;
        if (this.f != null) {
            this.f.notifyDataSetChanged();
        }
    }

    public final android.widget.ListAdapter d() {
        if (this.f == null) {
            this.f = new defpackage.zc(this);
        }
        return this.f;
    }

    public final void a(boolean z) {
        if (this.f != null) {
            this.f.notifyDataSetChanged();
        }
    }

    public final void a(defpackage.zu zuVar) {
        this.e = zuVar;
    }

    public final boolean a(defpackage.aad aad) {
        if (!aad.hasVisibleItems()) {
            return false;
        }
        defpackage.zh zhVar = new defpackage.zh(aad);
        defpackage.ze zeVar = zhVar.a;
        defpackage.xk xkVar = new defpackage.xk(zeVar.a);
        zhVar.c = new defpackage.zb(xkVar.a.a);
        zhVar.c.e = zhVar;
        zhVar.a.a((defpackage.zt) zhVar.c);
        xkVar.a.n = zhVar.c.d();
        xkVar.a.o = zhVar;
        android.view.View view = zeVar.h;
        if (view != null) {
            xkVar.a.e = view;
        } else {
            xkVar.a.c = zeVar.g;
            xkVar.a.d = zeVar.f;
        }
        xkVar.a.m = zhVar;
        zhVar.b = xkVar.a();
        zhVar.b.setOnDismissListener(zhVar);
        android.view.WindowManager.LayoutParams attributes = zhVar.b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        zhVar.b.show();
        if (this.e != null) {
            this.e.a(aad);
        }
        return true;
    }

    public final void a(defpackage.ze zeVar, boolean z) {
        if (this.e != null) {
            this.e.a(zeVar, z);
        }
    }

    public final void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i, long j) {
        this.b.a((android.view.MenuItem) (defpackage.zi) this.f.getItem(i), (defpackage.zt) this, 0);
    }

    public final boolean a() {
        return false;
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

    public final android.os.Parcelable c() {
        if (this.c == null) {
            return null;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        android.util.SparseArray sparseArray = new android.util.SparseArray();
        if (this.c != null) {
            this.c.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    public final void a(android.os.Parcelable parcelable) {
        android.util.SparseArray sparseParcelableArray = ((android.os.Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.c.restoreHierarchyState(sparseParcelableArray);
        }
    }
}
