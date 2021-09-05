package defpackage;

/* renamed from: ze reason: default package */
/* compiled from: PG */
public class MenuBuilder implements defpackage.po {
    private static final int[] l = {1, 4, 5, 3, 2, 0};
    public final android.content.Context a;
    public defpackage.zf b;
    public java.util.ArrayList c;
    public java.util.ArrayList d;
    public int e = 1;
    public java.lang.CharSequence f;
    public android.graphics.drawable.Drawable g;
    public android.view.View h;
    public java.util.concurrent.CopyOnWriteArrayList i = new java.util.concurrent.CopyOnWriteArrayList();
    public MenuItemImpl j;
    public boolean k;
    private final android.content.res.Resources m;
    private boolean n;
    private boolean o;
    private java.util.ArrayList p;
    private boolean q;
    private java.util.ArrayList r;
    private boolean s;
    private boolean t = false;
    private boolean u = false;
    private boolean v = false;
    private boolean w = false;
    private java.util.ArrayList x = new java.util.ArrayList();
    private boolean y = false;

    public MenuBuilder(android.content.Context context) {
        boolean z = true;
        this.a = context;
        this.m = context.getResources();
        this.c = new java.util.ArrayList();
        this.p = new java.util.ArrayList();
        this.q = true;
        this.d = new java.util.ArrayList();
        this.r = new java.util.ArrayList();
        this.s = true;
        if (this.m.getConfiguration().keyboard == 1 || !this.m.getBoolean(2131558403)) {
            z = false;
        }
        this.o = z;
    }

    public final void a(MenuPresenter ztVar) {
        addMenuPresenter(ztVar, this.a);
    }

    public final void addMenuPresenter(MenuPresenter ztVar, android.content.Context context) {
        this.i.add(new java.lang.ref.WeakReference(ztVar));
        ztVar.a(context, this);
        this.s = true;
    }

    public final void b(MenuPresenter ztVar) {
        java.util.Iterator it = this.i.iterator();
        while (it.hasNext()) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
            MenuPresenter ztVar2 = (MenuPresenter) weakReference.get();
            if (ztVar2 == null || ztVar2 == ztVar) {
                this.i.remove(weakReference);
            }
        }
    }

    public final void a(android.os.Bundle bundle) {
        int size = size();
        int i2 = 0;
        android.util.SparseArray sparseArray = null;
        while (i2 < size) {
            android.view.MenuItem item = getItem(i2);
            android.view.View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new android.util.SparseArray();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            android.util.SparseArray sparseArray2 = sparseArray;
            if (item.hasSubMenu()) {
                ((SubMenuBuilder) item.getSubMenu()).a(bundle);
            }
            i2++;
            sparseArray = sparseArray2;
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(a(), sparseArray);
        }
    }

    public final void b(android.os.Bundle bundle) {
        if (bundle != null) {
            android.util.SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(a());
            int size = size();
            for (int i2 = 0; i2 < size; i2++) {
                android.view.MenuItem item = getItem(i2);
                android.view.View actionView = item.getActionView();
                if (!(actionView == null || actionView.getId() == -1)) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((SubMenuBuilder) item.getSubMenu()).b(bundle);
                }
            }
            int i3 = bundle.getInt("android:menu:expandedactionview");
            if (i3 > 0) {
                android.view.MenuItem findItem = findItem(i3);
                if (findItem != null) {
                    findItem.expandActionView();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public java.lang.String a() {
        return "android:menu:actionviewstates";
    }

    public void a(defpackage.zf zfVar) {
        this.b = zfVar;
    }

    public final android.view.MenuItem addInternal(int i2, int i3, int i4, java.lang.CharSequence charSequence) {
        int i5;
        int i6 = i4 >> 16;
        if (i6 < 0 || i6 >= l.length) {
            throw new java.lang.IllegalArgumentException("order does not contain a valid category.");
        }
        int i7 = (l[i6] << 16) | (65535 & i4);
        MenuItemImpl ziVar = new MenuItemImpl(this, i2, i3, i4, i7, charSequence, this.e);
        java.util.ArrayList arrayList = this.c;
        java.util.ArrayList arrayList2 = this.c;
        int size = arrayList2.size() - 1;
        while (true) {
            if (size < 0) {
                i5 = 0;
                break;
            } else if (((MenuItemImpl) arrayList2.get(size)).a <= i7) {
                i5 = size + 1;
                break;
            } else {
                size--;
            }
        }
        arrayList.add(i5, ziVar);
        a(true);
        return ziVar;
    }

    public android.view.MenuItem add(java.lang.CharSequence charSequence) {
        return addInternal(0, 0, 0, charSequence);
    }

    public android.view.MenuItem add(int i2) {
        return addInternal(0, 0, 0, this.m.getString(i2));
    }

    public android.view.MenuItem add(int i2, int i3, int i4, java.lang.CharSequence charSequence) {
        return addInternal(i2, i3, i4, charSequence);
    }

    public android.view.MenuItem add(int i2, int i3, int i4, int i5) {
        return addInternal(i2, i3, i4, this.m.getString(i5));
    }

    public android.view.SubMenu addSubMenu(java.lang.CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public android.view.SubMenu addSubMenu(int i2) {
        return addSubMenu(0, 0, 0, (java.lang.CharSequence) this.m.getString(i2));
    }

    public android.view.SubMenu addSubMenu(int i2, int i3, int i4, java.lang.CharSequence charSequence) {
        MenuItemImpl ziVar = (MenuItemImpl) addInternal(i2, i3, i4, charSequence);
        SubMenuBuilder aad = new SubMenuBuilder(this.a, this, ziVar);
        ziVar.setSubMenu(aad);
        return aad;
    }

    public android.view.SubMenu addSubMenu(int i2, int i3, int i4, int i5) {
        return addSubMenu(i2, i3, i4, (java.lang.CharSequence) this.m.getString(i5));
    }

    public void setGroupDividerEnabled(boolean z) {
        this.y = z;
    }

    public boolean b() {
        return this.y;
    }

    public int addIntentOptions(int i2, int i3, int i4, android.content.ComponentName componentName, android.content.Intent[] intentArr, android.content.Intent intent, int i5, android.view.MenuItem[] menuItemArr) {
        android.content.pm.PackageManager packageManager = this.a.getPackageManager();
        java.util.List queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int i6 = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i5 & 1) == 0) {
            removeGroup(i2);
        }
        for (int i7 = 0; i7 < i6; i7++) {
            android.content.pm.ResolveInfo resolveInfo = (android.content.pm.ResolveInfo) queryIntentActivityOptions.get(i7);
            android.content.Intent intent2 = new android.content.Intent(resolveInfo.specificIndex < 0 ? intent : intentArr[resolveInfo.specificIndex]);
            intent2.setComponent(new android.content.ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name));
            android.view.MenuItem intent3 = add(i2, i3, i4, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && resolveInfo.specificIndex >= 0) {
                menuItemArr[resolveInfo.specificIndex] = intent3;
            }
        }
        return i6;
    }

    public void removeItem(int i2) {
        int i3;
        int size = size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                i3 = -1;
                break;
            } else if (((MenuItemImpl) this.c.get(i4)).getItemId() == i2) {
                i3 = i4;
                break;
            } else {
                i4++;
            }
        }
        a(i3, true);
    }

    public void removeGroup(int i2) {
        int i3;
        int size = size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                i3 = -1;
                break;
            } else if (((MenuItemImpl) this.c.get(i4)).getGroupId() == i2) {
                i3 = i4;
                break;
            } else {
                i4++;
            }
        }
        if (i3 >= 0) {
            int size2 = this.c.size() - i3;
            int i5 = 0;
            while (true) {
                int i6 = i5 + 1;
                if (i5 >= size2 || ((MenuItemImpl) this.c.get(i3)).getGroupId() != i2) {
                    a(true);
                } else {
                    a(i3, false);
                    i5 = i6;
                }
            }
            a(true);
        }
    }

    private final void a(int i2, boolean z) {
        if (i2 >= 0 && i2 < this.c.size()) {
            this.c.remove(i2);
            if (z) {
                a(true);
            }
        }
    }

    public void clear() {
        if (this.j != null) {
            b(this.j);
        }
        this.c.clear();
        a(true);
    }

    public void setGroupCheckable(int i2, boolean z, boolean z2) {
        int size = this.c.size();
        for (int i3 = 0; i3 < size; i3++) {
            MenuItemImpl ziVar = (MenuItemImpl) this.c.get(i3);
            if (ziVar.getGroupId() == i2) {
                ziVar.a(z2);
                ziVar.setCheckable(z);
            }
        }
    }

    public void setGroupVisible(int i2, boolean z) {
        boolean z2;
        int size = this.c.size();
        int i3 = 0;
        boolean z3 = false;
        while (i3 < size) {
            MenuItemImpl ziVar = (MenuItemImpl) this.c.get(i3);
            if (ziVar.getGroupId() != i2 || !ziVar.b(z)) {
                z2 = z3;
            } else {
                z2 = true;
            }
            i3++;
            z3 = z2;
        }
        if (z3) {
            a(true);
        }
    }

    public void setGroupEnabled(int i2, boolean z) {
        int size = this.c.size();
        for (int i3 = 0; i3 < size; i3++) {
            MenuItemImpl ziVar = (MenuItemImpl) this.c.get(i3);
            if (ziVar.getGroupId() == i2) {
                ziVar.setEnabled(z);
            }
        }
    }

    public boolean hasVisibleItems() {
        if (this.k) {
            return true;
        }
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((MenuItemImpl) this.c.get(i2)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public android.view.MenuItem findItem(int i2) {
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            MenuItemImpl ziVar = (MenuItemImpl) this.c.get(i3);
            if (ziVar.getItemId() == i2) {
                return ziVar;
            }
            if (ziVar.hasSubMenu()) {
                android.view.MenuItem findItem = ziVar.getSubMenu().findItem(i2);
                if (findItem != null) {
                    return findItem;
                }
            }
        }
        return null;
    }

    public int size() {
        return this.c.size();
    }

    public android.view.MenuItem getItem(int i2) {
        return (android.view.MenuItem) this.c.get(i2);
    }

    public boolean isShortcutKey(int i2, android.view.KeyEvent keyEvent) {
        return a(i2, keyEvent) != null;
    }

    public void setQwertyMode(boolean z) {
        this.n = z;
        a(false);
    }

    public boolean c() {
        return this.n;
    }

    public boolean d() {
        return this.o;
    }

    /* access modifiers changed from: 0000 */
    public boolean a(MenuBuilder zeVar, android.view.MenuItem menuItem) {
        return this.b != null && this.b.a(zeVar, menuItem);
    }

    public boolean performShortcut(int i2, android.view.KeyEvent keyEvent, int i3) {
        MenuItemImpl a2 = a(i2, keyEvent);
        boolean z = false;
        if (a2 != null) {
            z = a((android.view.MenuItem) a2, (MenuPresenter) null, i3);
        }
        if ((i3 & 2) != 0) {
            b(true);
        }
        return z;
    }

    private final void a(java.util.List list, int i2, android.view.KeyEvent keyEvent) {
        boolean c2 = c();
        int modifiers = keyEvent.getModifiers();
        android.view.KeyCharacterMap.KeyData keyData = new android.view.KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i2 == 67) {
            int size = this.c.size();
            for (int i3 = 0; i3 < size; i3++) {
                MenuItemImpl ziVar = (MenuItemImpl) this.c.get(i3);
                if (ziVar.hasSubMenu()) {
                    ((MenuBuilder) ziVar.getSubMenu()).a(list, i2, keyEvent);
                }
                char numericShortcut = c2 ? ziVar.getAlphabeticShortcut() : ziVar.getNumericShortcut();
                if ((modifiers & 69647) == ((c2 ? ziVar.getAlphabeticModifiers() : ziVar.getNumericModifiers()) & 69647) && numericShortcut != 0 && ((numericShortcut == keyData.meta[0] || numericShortcut == keyData.meta[2] || (c2 && numericShortcut == 8 && i2 == 67)) && ziVar.isEnabled())) {
                    list.add(ziVar);
                }
            }
        }
    }

    private final MenuItemImpl a(int i2, android.view.KeyEvent keyEvent) {
        char numericShortcut;
        java.util.ArrayList arrayList = this.x;
        arrayList.clear();
        a((java.util.List) arrayList, i2, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        android.view.KeyCharacterMap.KeyData keyData = new android.view.KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (MenuItemImpl) arrayList.get(0);
        }
        boolean c2 = c();
        for (int i3 = 0; i3 < size; i3++) {
            MenuItemImpl ziVar = (MenuItemImpl) arrayList.get(i3);
            if (c2) {
                numericShortcut = ziVar.getAlphabeticShortcut();
            } else {
                numericShortcut = ziVar.getNumericShortcut();
            }
            if (numericShortcut == keyData.meta[0] && (metaState & 2) == 0) {
                return ziVar;
            }
            if (numericShortcut == keyData.meta[2] && (metaState & 2) != 0) {
                return ziVar;
            }
            if (c2 && numericShortcut == 8 && i2 == 67) {
                return ziVar;
            }
        }
        return null;
    }

    public boolean performIdentifierAction(int i2, int i3) {
        return a(findItem(i2), (MenuPresenter) null, i3);
    }

    public final boolean a(android.view.MenuItem menuItem, MenuPresenter ztVar, int i2) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        MenuItemImpl ziVar = (MenuItemImpl) menuItem;
        if (ziVar == null || !ziVar.isEnabled()) {
            return false;
        }
        boolean b2 = ziVar.b();
        defpackage.rs rsVar = ziVar.f;
        if (rsVar == null || !rsVar.e()) {
            z = false;
        } else {
            z = true;
        }
        if (ziVar.i()) {
            boolean expandActionView = ziVar.expandActionView() | b2;
            if (!expandActionView) {
                return expandActionView;
            }
            b(true);
            return expandActionView;
        } else if (ziVar.hasSubMenu() || z) {
            if ((i2 & 4) == 0) {
                b(false);
            }
            if (!ziVar.hasSubMenu()) {
                ziVar.setSubMenu(new SubMenuBuilder(this.a, this, ziVar));
            }
            SubMenuBuilder aad = (SubMenuBuilder) ziVar.getSubMenu();
            if (z) {
                rsVar.a((android.view.SubMenu) aad);
            }
            if (!this.i.isEmpty()) {
                if (ztVar != null) {
                    z3 = ztVar.onSubMenuSelected(aad);
                }
                java.util.Iterator it = this.i.iterator();
                boolean z4 = z3;
                while (it.hasNext()) {
                    java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
                    MenuPresenter ztVar2 = (MenuPresenter) weakReference.get();
                    if (ztVar2 == null) {
                        this.i.remove(weakReference);
                    } else {
                        if (!z4) {
                            z2 = ztVar2.onSubMenuSelected(aad);
                        } else {
                            z2 = z4;
                        }
                        z4 = z2;
                    }
                }
                z3 = z4;
            }
            boolean z5 = b2 | z3;
            if (z5) {
                return z5;
            }
            b(true);
            return z5;
        } else {
            if ((i2 & 1) == 0) {
                b(true);
            }
            return b2;
        }
    }

    public final void b(boolean z) {
        if (!this.w) {
            this.w = true;
            java.util.Iterator it = this.i.iterator();
            while (it.hasNext()) {
                java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
                MenuPresenter ztVar = (MenuPresenter) weakReference.get();
                if (ztVar == null) {
                    this.i.remove(weakReference);
                } else {
                    ztVar.onCloseMenu(this, z);
                }
            }
            this.w = false;
        }
    }

    public void close() {
        b(true);
    }

    public void a(boolean z) {
        if (!this.t) {
            if (z) {
                this.q = true;
                this.s = true;
            }
            if (!this.i.isEmpty()) {
                e();
                java.util.Iterator it = this.i.iterator();
                while (it.hasNext()) {
                    java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
                    MenuPresenter ztVar = (MenuPresenter) weakReference.get();
                    if (ztVar == null) {
                        this.i.remove(weakReference);
                    } else {
                        ztVar.a(z);
                    }
                }
                f();
                return;
            }
            return;
        }
        this.u = true;
        if (z) {
            this.v = true;
        }
    }

    public final void e() {
        if (!this.t) {
            this.t = true;
            this.u = false;
            this.v = false;
        }
    }

    public final void f() {
        this.t = false;
        if (this.u) {
            this.u = false;
            a(this.v);
        }
    }

    public final void g() {
        this.q = true;
        a(true);
    }

    /* access modifiers changed from: 0000 */
    public final void h() {
        this.s = true;
        a(true);
    }

    public final java.util.ArrayList i() {
        if (!this.q) {
            return this.p;
        }
        this.p.clear();
        int size = this.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItemImpl ziVar = (MenuItemImpl) this.c.get(i2);
            if (ziVar.isVisible()) {
                this.p.add(ziVar);
            }
        }
        this.q = false;
        this.s = true;
        return this.p;
    }

    public final void j() {
        java.util.ArrayList i2 = i();
        if (this.s) {
            java.util.Iterator it = this.i.iterator();
            boolean z = false;
            while (it.hasNext()) {
                java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
                MenuPresenter ztVar = (MenuPresenter) weakReference.get();
                if (ztVar == null) {
                    this.i.remove(weakReference);
                } else {
                    z = ztVar.flagActionItems() | z;
                }
            }
            if (z) {
                this.d.clear();
                this.r.clear();
                int size = i2.size();
                for (int i3 = 0; i3 < size; i3++) {
                    MenuItemImpl ziVar = (MenuItemImpl) i2.get(i3);
                    if (ziVar.f()) {
                        this.d.add(ziVar);
                    } else {
                        this.r.add(ziVar);
                    }
                }
            } else {
                this.d.clear();
                this.r.clear();
                this.r.addAll(i());
            }
            this.s = false;
        }
    }

    public final java.util.ArrayList k() {
        j();
        return this.r;
    }

    public void clearHeader() {
        this.g = null;
        this.f = null;
        this.h = null;
        a(false);
    }

    /* access modifiers changed from: 0000 */
    public final void a(int i2, java.lang.CharSequence charSequence, int i3, android.graphics.drawable.Drawable drawable, android.view.View view) {
        android.content.res.Resources resources = this.m;
        if (view != null) {
            this.h = view;
            this.f = null;
            this.g = null;
        } else {
            if (i2 > 0) {
                this.f = resources.getText(i2);
            } else if (charSequence != null) {
                this.f = charSequence;
            }
            if (i3 > 0) {
                this.g = defpackage.ob.a(this.a, i3);
            } else if (drawable != null) {
                this.g = drawable;
            }
            this.h = null;
        }
        a(false);
    }

    public MenuBuilder l() {
        return this;
    }

    public boolean a(MenuItemImpl ziVar) {
        boolean z = false;
        if (!this.i.isEmpty()) {
            e();
            java.util.Iterator it = this.i.iterator();
            boolean z2 = false;
            while (true) {
                if (!it.hasNext()) {
                    z = z2;
                    break;
                }
                java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
                MenuPresenter ztVar = (MenuPresenter) weakReference.get();
                if (ztVar == null) {
                    this.i.remove(weakReference);
                } else {
                    z = ztVar.a(ziVar);
                    if (z) {
                        break;
                    }
                    z2 = z;
                }
            }
            f();
            if (z) {
                this.j = ziVar;
            }
        }
        return z;
    }

    public boolean b(MenuItemImpl ziVar) {
        boolean z = false;
        if (!this.i.isEmpty() && this.j == ziVar) {
            e();
            java.util.Iterator it = this.i.iterator();
            boolean z2 = false;
            while (true) {
                if (!it.hasNext()) {
                    z = z2;
                    break;
                }
                java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
                MenuPresenter ztVar = (MenuPresenter) weakReference.get();
                if (ztVar == null) {
                    this.i.remove(weakReference);
                } else {
                    z = ztVar.b(ziVar);
                    if (z) {
                        break;
                    }
                    z2 = z;
                }
            }
            f();
            if (z) {
                this.j = null;
            }
        }
        return z;
    }
}
