package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.design.internal.NavigationMenuView;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.apps.tasks.R;

/* renamed from: fb  reason: default package */
/* compiled from: PG */
public final class fb implements zt {
    public NavigationMenuView a;
    public LinearLayout b;
    public ze c;
    public int d;
    public fd e;
    public LayoutInflater f;
    public int g;
    public boolean h;
    public ColorStateList i;
    public ColorStateList j;
    public Drawable k;
    public int l;
    public int m;
    public int n;
    public int o;
    public final View.OnClickListener p = new fc(this);
    private zu q;

    @Override // defpackage.zt
    public final void a(Context context, ze zeVar) {
        this.f = LayoutInflater.from(context);
        this.c = zeVar;
        this.o = context.getResources().getDimensionPixelOffset(R.dimen.design_navigation_separator_vertical_padding);
    }

    @Override // defpackage.zt
    public final void a(boolean z) {
        if (this.e != null) {
            fd fdVar = this.e;
            fdVar.b();
            fdVar.mObservable.b();
        }
    }

    @Override // defpackage.zt
    public final void a(zu zuVar) {
        this.q = zuVar;
    }

    @Override // defpackage.zt
    public final boolean a(aad aad) {
        return false;
    }

    @Override // defpackage.zt
    public final void a(ze zeVar, boolean z) {
        if (this.q != null) {
            this.q.a(zeVar, z);
        }
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
        return this.d;
    }

    @Override // defpackage.zt
    public final Parcelable c() {
        Bundle bundle = new Bundle();
        if (this.a != null) {
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            this.a.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        if (this.e != null) {
            fd fdVar = this.e;
            Bundle bundle2 = new Bundle();
            if (fdVar.b != null) {
                bundle2.putInt("android:menu:checked", fdVar.b.getItemId());
            }
            SparseArray<? extends Parcelable> sparseArray2 = new SparseArray<>();
            int size = fdVar.a.size();
            for (int i2 = 0; i2 < size; i2++) {
                ff ffVar = (ff) fdVar.a.get(i2);
                if (ffVar instanceof fh) {
                    zi ziVar = ((fh) ffVar).a;
                    View actionView = ziVar != null ? ziVar.getActionView() : null;
                    if (actionView != null) {
                        fk fkVar = new fk();
                        actionView.saveHierarchyState(fkVar);
                        sparseArray2.put(ziVar.getItemId(), fkVar);
                    }
                }
            }
            bundle2.putSparseParcelableArray("android:menu:action_views", sparseArray2);
            bundle.putBundle("android:menu:adapter", bundle2);
        }
        if (this.b != null) {
            SparseArray<? extends Parcelable> sparseArray3 = new SparseArray<>();
            this.b.saveHierarchyState(sparseArray3);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray3);
        }
        return bundle;
    }

    @Override // defpackage.zt
    public final void a(Parcelable parcelable) {
        zi ziVar;
        View actionView;
        fk fkVar;
        zi ziVar2;
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.a.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                fd fdVar = this.e;
                int i2 = bundle2.getInt("android:menu:checked", 0);
                if (i2 != 0) {
                    fdVar.c = true;
                    int size = fdVar.a.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size) {
                            break;
                        }
                        ff ffVar = (ff) fdVar.a.get(i3);
                        if ((ffVar instanceof fh) && (ziVar2 = ((fh) ffVar).a) != null && ziVar2.getItemId() == i2) {
                            fdVar.a(ziVar2);
                            break;
                        }
                        i3++;
                    }
                    fdVar.c = false;
                    fdVar.b();
                }
                SparseArray sparseParcelableArray2 = bundle2.getSparseParcelableArray("android:menu:action_views");
                if (sparseParcelableArray2 != null) {
                    int size2 = fdVar.a.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        ff ffVar2 = (ff) fdVar.a.get(i4);
                        if (!(!(ffVar2 instanceof fh) || (ziVar = ((fh) ffVar2).a) == null || (actionView = ziVar.getActionView()) == null || (fkVar = (fk) sparseParcelableArray2.get(ziVar.getItemId())) == null)) {
                            actionView.restoreHierarchyState(fkVar);
                        }
                    }
                }
            }
            SparseArray sparseParcelableArray3 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray3 != null) {
                this.b.restoreHierarchyState(sparseParcelableArray3);
            }
        }
    }

    public final void a(View view) {
        this.b.addView(view);
        this.a.setPadding(0, 0, 0, this.a.getPaddingBottom());
    }

    public final void a(ColorStateList colorStateList) {
        this.j = colorStateList;
        a(false);
    }

    public final void b(ColorStateList colorStateList) {
        this.i = colorStateList;
        a(false);
    }

    public final void a(int i2) {
        this.g = i2;
        this.h = true;
        a(false);
    }

    public final void a(Drawable drawable) {
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
