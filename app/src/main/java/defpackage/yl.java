package defpackage;

/* renamed from: yl reason: default package */
/* compiled from: PG */
final class yl {
    public defpackage.rs A;
    public java.lang.CharSequence B;
    public java.lang.CharSequence C;
    public android.content.res.ColorStateList D = null;
    public android.graphics.PorterDuff.Mode E = null;
    public final /* synthetic */ defpackage.yj F;
    public android.view.Menu a;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public java.lang.CharSequence k;
    public java.lang.CharSequence l;
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
    public java.lang.String x;
    public java.lang.String y;
    public java.lang.String z;

    public yl(defpackage.yj yjVar, android.view.Menu menu) {
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

    static char a(java.lang.String str) {
        if (str == null) {
            return 0;
        }
        return str.charAt(0);
    }

    /* access modifiers changed from: 0000 */
    public final void a(android.view.MenuItem menuItem) {
        boolean z2 = true;
        menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u).setCheckable(this.r > 0).setTitleCondensed(this.l).setIcon(this.m);
        if (this.v >= 0) {
            menuItem.setShowAsAction(this.v);
        }
        if (this.z != null) {
            if (this.F.c.isRestricted()) {
                throw new java.lang.IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            defpackage.yj yjVar = this.F;
            if (yjVar.d == null) {
                android.content.Context context = yjVar.c;
                while (!(context instanceof android.app.Activity) && (context instanceof android.content.ContextWrapper)) {
                    context = ((android.content.ContextWrapper) context).getBaseContext();
                }
                yjVar.d = context;
            }
            menuItem.setOnMenuItemClickListener(new defpackage.yk(yjVar.d, this.z));
        }
        if (this.r >= 2) {
            if (menuItem instanceof defpackage.zi) {
                ((defpackage.zi) menuItem).a(true);
            } else if (menuItem instanceof defpackage.zj) {
                defpackage.zj zjVar = (defpackage.zj) menuItem;
                try {
                    if (zjVar.e == null) {
                        zjVar.e = ((defpackage.pp) zjVar.d).getClass().getDeclaredMethod("setExclusiveCheckable", new java.lang.Class[]{java.lang.Boolean.TYPE});
                    }
                    zjVar.e.invoke(zjVar.d, new java.lang.Object[]{java.lang.Boolean.valueOf(true)});
                } catch (java.lang.Exception e2) {
                    android.util.Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e2);
                }
            }
        }
        if (this.x != null) {
            menuItem.setActionView((android.view.View) a(this.x, defpackage.yj.a, this.F.b));
        } else {
            z2 = false;
        }
        if (this.w > 0) {
            if (!z2) {
                menuItem.setActionView(this.w);
            } else {
                android.util.Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            }
        }
        if (this.A != null) {
            defpackage.sc.a(menuItem, this.A);
        }
        defpackage.sc.a(menuItem, this.B);
        defpackage.sc.b(menuItem, this.C);
        defpackage.sc.b(menuItem, this.n, this.o);
        defpackage.sc.a(menuItem, this.p, this.q);
        if (this.E != null) {
            defpackage.sc.a(menuItem, this.E);
        }
        if (this.D != null) {
            defpackage.sc.a(menuItem, this.D);
        }
    }

    public final android.view.SubMenu b() {
        this.h = true;
        android.view.SubMenu addSubMenu = this.a.addSubMenu(this.b, this.i, this.j, this.k);
        a(addSubMenu.getItem());
        return addSubMenu;
    }

    /* access modifiers changed from: 0000 */
    public final java.lang.Object a(java.lang.String str, java.lang.Class[] clsArr, java.lang.Object[] objArr) {
        try {
            java.lang.reflect.Constructor constructor = this.F.c.getClassLoader().loadClass(str).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (java.lang.Exception e2) {
            android.util.Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e2);
            return null;
        }
    }
}
