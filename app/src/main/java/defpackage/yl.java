package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Constructor;

/* access modifiers changed from: package-private */
/* renamed from: yl  reason: default package */
/* compiled from: PG */
public final class yl {
    public rs A;
    public CharSequence B;
    public CharSequence C;
    public ColorStateList D = null;
    public PorterDuff.Mode E = null;
    public final /* synthetic */ yj F;
    public Menu a;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public CharSequence k;
    public CharSequence l;
    public int m;
    public char n;
    public int o;
    public char p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public boolean u;
    public int v;
    public int w;
    public String x;
    public String y;
    public String z;

    public yl(yj yjVar, Menu menu) {
        this.F = yjVar;
        this.a = menu;
        a();
    }

    public final void a() {
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = true;
        this.g = true;
    }

    static char a(String str) {
        if (str == null) {
            return 0;
        }
        return str.charAt(0);
    }

    /* access modifiers changed from: package-private */
    public final void a(MenuItem menuItem) {
        boolean z2 = true;
        menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u).setCheckable(this.r > 0).setTitleCondensed(this.l).setIcon(this.m);
        if (this.v >= 0) {
            menuItem.setShowAsAction(this.v);
        }
        if (this.z != null) {
            if (this.F.c.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            yj yjVar = this.F;
            if (yjVar.d == null) {
                Context context = yjVar.c;
                while (!(context instanceof Activity) && (context instanceof ContextWrapper)) {
                    context = ((ContextWrapper) context).getBaseContext();
                }
                yjVar.d = context;
            }
            menuItem.setOnMenuItemClickListener(new yk(yjVar.d, this.z));
        }
        if (this.r >= 2) {
            if (menuItem instanceof MenuItemImpl) {
                ((MenuItemImpl) menuItem).a(true);
            } else if (menuItem instanceof zj) {
                zj zjVar = (zj) menuItem;
                try {
                    if (zjVar.e == null) {
                        zjVar.e = ((pp) zjVar.d).getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    zjVar.e.invoke(zjVar.d, true);
                } catch (Exception e2) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e2);
                }
            }
        }
        if (this.x != null) {
            menuItem.setActionView((View) a(this.x, yj.a, this.F.b));
        } else {
            z2 = false;
        }
        if (this.w > 0) {
            if (!z2) {
                menuItem.setActionView(this.w);
            } else {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            }
        }
        if (this.A != null) {
            sc.a(menuItem, this.A);
        }
        sc.a(menuItem, this.B);
        sc.b(menuItem, this.C);
        sc.b(menuItem, this.n, this.o);
        sc.a(menuItem, this.p, this.q);
        if (this.E != null) {
            sc.a(menuItem, this.E);
        }
        if (this.D != null) {
            sc.a(menuItem, this.D);
        }
    }

    public final SubMenu b() {
        this.h = true;
        SubMenu addSubMenu = this.a.addSubMenu(this.b, this.i, this.j, this.k);
        a(addSubMenu.getItem());
        return addSubMenu;
    }

    /* access modifiers changed from: package-private */
    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = this.F.c.getClassLoader().loadClass(str).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e2) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e2);
            return null;
        }
    }
}
