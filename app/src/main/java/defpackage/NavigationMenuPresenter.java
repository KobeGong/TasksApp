package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.design.internal.NavigationMenuView;
import android.util.SparseArray;
import android.view.LayoutInflater;

import com.google.android.apps.tasks.R;

/* renamed from: fb reason: default package */
/* compiled from: PG */
public final class NavigationMenuPresenter implements MenuPresenter {
    public NavigationMenuView menuView;
    public android.widget.LinearLayout headerLayout;
    public MenuBuilder menu;
    public int d;
    public NavigationMenuAdapter menuAdapter;
    public LayoutInflater layoutInflater;
    public int g;
    public boolean h;
    public ColorStateList i;
    public ColorStateList j;
    public Drawable k;
    public int l;
    public int m;
    public int n;
    public int paddingSeparator;
    public final android.view.View.OnClickListener p = new defpackage.fc(this);
    private MenuPresenter_Callback callback;

    public final void a(android.content.Context context, MenuBuilder zeVar) {
        this.layoutInflater = LayoutInflater.from(context);
        this.menu = zeVar;
        this.paddingSeparator = context.getResources().getDimensionPixelOffset(R.dimen.design_navigation_separator_vertical_padding);
    }

    public final void a(boolean z) {
        if (this.menuAdapter != null) {
            this.menuAdapter.b();
            this.menuAdapter.mObservable.b();
        }
    }

    public final void setCallback(MenuPresenter_Callback zuVar) {
        this.callback = zuVar;
    }

    public final boolean onSubMenuSelected(SubMenuBuilder aad) {
        return false;
    }

    public final void onCloseMenu(MenuBuilder zeVar, boolean allMenusAreClosing) {
        if (this.callback != null) {
            this.callback.onCloseMenu(zeVar, allMenusAreClosing);
        }
    }

    public final boolean flagActionItems() {
        return false;
    }

    public final boolean a(MenuItemImpl ziVar) {
        return false;
    }

    public final boolean b(MenuItemImpl ziVar) {
        return false;
    }

    public final int getId() {
        return this.d;
    }

    public final android.os.Parcelable c() {
        android.os.Bundle bundle = new android.os.Bundle();
        if (this.menuView != null) {
            android.util.SparseArray sparseArray = new android.util.SparseArray();
            this.menuView.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        if (this.menuAdapter != null) {
            java.lang.String str = "android:menu:adapter";
            NavigationMenuAdapter fdVar = this.menuAdapter;
            android.os.Bundle bundle2 = new android.os.Bundle();
            if (fdVar.b != null) {
                bundle2.putInt("android:menu:checked", fdVar.b.getItemId());
            }
            android.util.SparseArray sparseArray2 = new android.util.SparseArray();
            int size = fdVar.a.size();
            for (int i2 = 0; i2 < size; i2++) {
                defpackage.ff ffVar = (defpackage.ff) fdVar.a.get(i2);
                if (ffVar instanceof defpackage.fh) {
                    MenuItemImpl ziVar = ((defpackage.fh) ffVar).a;
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
        if (this.headerLayout != null) {
            SparseArray<Parcelable> sparseArray3 = new android.util.SparseArray<>();
            this.headerLayout.saveHierarchyState(sparseArray3);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray3);
        }
        return bundle;
    }

    public final void a(android.os.Parcelable parcelable) {
        if (parcelable instanceof android.os.Bundle) {
            android.os.Bundle bundle = (android.os.Bundle) parcelable;
            android.util.SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.menuView.restoreHierarchyState(sparseParcelableArray);
            }
            android.os.Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                NavigationMenuAdapter fdVar = this.menuAdapter;
                int i2 = bundle2.getInt("android:menu:checked", 0);
                if (i2 != 0) {
                    this.menuAdapter.c = true;
                    int size = this.menuAdapter.a.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size) {
                            break;
                        }
                        defpackage.ff ffVar = (defpackage.ff) this.menuAdapter.a.get(i3);
                        if (ffVar instanceof defpackage.fh) {
                            MenuItemImpl ziVar = ((defpackage.fh) ffVar).a;
                            if (ziVar != null && ziVar.getItemId() == i2) {
                                this.menuAdapter.a(ziVar);
                                break;
                            }
                        }
                        i3++;
                    }
                    this.menuAdapter.c = false;
                    this.menuAdapter.b();
                }
                android.util.SparseArray sparseParcelableArray2 = bundle2.getSparseParcelableArray("android:menu:action_views");
                if (sparseParcelableArray2 != null) {
                    int size2 = this.menuAdapter.a.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        defpackage.ff ffVar2 = (defpackage.ff) this.menuAdapter.a.get(i4);
                        if (ffVar2 instanceof defpackage.fh) {
                            MenuItemImpl ziVar2 = ((defpackage.fh) ffVar2).a;
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
                this.headerLayout.restoreHierarchyState(sparseParcelableArray3);
            }
        }
    }

    public final void addHeaderView(android.view.View view) {
        this.headerLayout.addView(view);
        this.menuView.setPadding(0, 0, 0, this.menuView.getPaddingBottom());
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
        if (this.menuAdapter != null) {
            this.menuAdapter.c = z;
        }
    }
}
