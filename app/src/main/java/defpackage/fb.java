package defpackage;

/* renamed from: fb reason: default package */
/* compiled from: PG */
public final class fb implements defpackage.zt {
    public android.support.design.internal.NavigationMenuView a;
    public android.widget.LinearLayout b;
    public defpackage.ze c;
    public int d;
    public defpackage.fd e;
    public android.view.LayoutInflater f;
    public int g;
    public boolean h;
    public android.content.res.ColorStateList i;
    public android.content.res.ColorStateList j;
    public android.graphics.drawable.Drawable k;
    public int l;
    public int m;
    public int n;
    public int o;
    public final android.view.View.OnClickListener p = new defpackage.fc(this);
    private defpackage.zu q;

    public final void a(android.content.Context context, defpackage.ze zeVar) {
        this.f = android.view.LayoutInflater.from(context);
        this.c = zeVar;
        this.o = context.getResources().getDimensionPixelOffset(2131689644);
    }

    public final void a(boolean z) {
        if (this.e != null) {
            defpackage.fd fdVar = this.e;
            fdVar.b();
            fdVar.d.b();
        }
    }

    public final void a(defpackage.zu zuVar) {
        this.q = zuVar;
    }

    public final boolean a(defpackage.aad aad) {
        return false;
    }

    public final void a(defpackage.ze zeVar, boolean z) {
        if (this.q != null) {
            this.q.a(zeVar, z);
        }
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
        return this.d;
    }

    public final android.os.Parcelable c() {
        android.os.Bundle bundle = new android.os.Bundle();
        if (this.a != null) {
            android.util.SparseArray sparseArray = new android.util.SparseArray();
            this.a.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        if (this.e != null) {
            java.lang.String str = "android:menu:adapter";
            defpackage.fd fdVar = this.e;
            android.os.Bundle bundle2 = new android.os.Bundle();
            if (fdVar.b != null) {
                bundle2.putInt("android:menu:checked", fdVar.b.getItemId());
            }
            android.util.SparseArray sparseArray2 = new android.util.SparseArray();
            int size = fdVar.a.size();
            for (int i2 = 0; i2 < size; i2++) {
                defpackage.ff ffVar = (defpackage.ff) fdVar.a.get(i2);
                if (ffVar instanceof defpackage.fh) {
                    defpackage.zi ziVar = ((defpackage.fh) ffVar).a;
                    android.view.View view = ziVar != null ? ziVar.getActionView() : null;
                    if (view != null) {
                        defpackage.fk fkVar = new defpackage.fk();
                        view.saveHierarchyState(fkVar);
                        sparseArray2.put(ziVar.getItemId(), fkVar);
                    }
                }
            }
            bundle2.putSparseParcelableArray("android:menu:action_views", sparseArray2);
            bundle.putBundle(str, bundle2);
        }
        if (this.b != null) {
            android.util.SparseArray sparseArray3 = new android.util.SparseArray();
            this.b.saveHierarchyState(sparseArray3);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray3);
        }
        return bundle;
    }

    public final void a(android.os.Parcelable parcelable) {
        if (parcelable instanceof android.os.Bundle) {
            android.os.Bundle bundle = (android.os.Bundle) parcelable;
            android.util.SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.a.restoreHierarchyState(sparseParcelableArray);
            }
            android.os.Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                defpackage.fd fdVar = this.e;
                int i2 = bundle2.getInt("android:menu:checked", 0);
                if (i2 != 0) {
                    fdVar.c = true;
                    int size = fdVar.a.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size) {
                            break;
                        }
                        defpackage.ff ffVar = (defpackage.ff) fdVar.a.get(i3);
                        if (ffVar instanceof defpackage.fh) {
                            defpackage.zi ziVar = ((defpackage.fh) ffVar).a;
                            if (ziVar != null && ziVar.getItemId() == i2) {
                                fdVar.a(ziVar);
                                break;
                            }
                        }
                        i3++;
                    }
                    fdVar.c = false;
                    fdVar.b();
                }
                android.util.SparseArray sparseParcelableArray2 = bundle2.getSparseParcelableArray("android:menu:action_views");
                if (sparseParcelableArray2 != null) {
                    int size2 = fdVar.a.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        defpackage.ff ffVar2 = (defpackage.ff) fdVar.a.get(i4);
                        if (ffVar2 instanceof defpackage.fh) {
                            defpackage.zi ziVar2 = ((defpackage.fh) ffVar2).a;
                            if (ziVar2 != null) {
                                android.view.View actionView = ziVar2.getActionView();
                                if (actionView != null) {
                                    defpackage.fk fkVar = (defpackage.fk) sparseParcelableArray2.get(ziVar2.getItemId());
                                    if (fkVar != null) {
                                        actionView.restoreHierarchyState(fkVar);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            android.util.SparseArray sparseParcelableArray3 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray3 != null) {
                this.b.restoreHierarchyState(sparseParcelableArray3);
            }
        }
    }

    public final void a(android.view.View view) {
        this.b.addView(view);
        this.a.setPadding(0, 0, 0, this.a.getPaddingBottom());
    }

    public final void a(android.content.res.ColorStateList colorStateList) {
        this.j = colorStateList;
        a(false);
    }

    public final void b(android.content.res.ColorStateList colorStateList) {
        this.i = colorStateList;
        a(false);
    }

    public final void a(int i2) {
        this.g = i2;
        this.h = true;
        a(false);
    }

    public final void a(android.graphics.drawable.Drawable drawable) {
        this.k = drawable;
        a(false);
    }

    public final void b(int i2) {
        this.l = i2;
        a(false);
    }

    public final void c(int i2) {
        this.m = i2;
        a(false);
    }

    public final void b(boolean z) {
        if (this.e != null) {
            this.e.c = z;
        }
    }
}
