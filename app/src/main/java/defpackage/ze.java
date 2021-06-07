package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import com.google.android.apps.tasks.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: ze  reason: default package */
/* compiled from: PG */
public class ze implements po {
    private static final int[] l = {1, 4, 5, 3, 2, 0};
    public final Context a;
    public zf b;
    public ArrayList c;
    public ArrayList d;
    public int e = 0;
    public CharSequence f;
    public Drawable g;
    public View h;
    public CopyOnWriteArrayList i = new CopyOnWriteArrayList();
    public zi j;
    public boolean k;
    private final Resources m;
    private boolean n;
    private boolean o;
    private ArrayList p;
    private boolean q;
    private ArrayList r;
    private boolean s;
    private boolean t = false;
    private boolean u = false;
    private boolean v = false;
    private boolean w = false;
    private ArrayList x = new ArrayList();
    private boolean y = false;

    public ze(Context context) {
        boolean z = true;
        this.a = context;
        this.m = context.getResources();
        this.c = new ArrayList();
        this.p = new ArrayList();
        this.q = true;
        this.d = new ArrayList();
        this.r = new ArrayList();
        this.s = true;
        this.o = (this.m.getConfiguration().keyboard == 1 || !this.m.getBoolean(R.bool.abc_config_showMenuShortcutsWhenKeyboardPresent)) ? false : z;
    }

    public final void a(zt ztVar) {
        a(ztVar, this.a);
    }

    public final void a(zt ztVar, Context context) {
        this.i.add(new WeakReference(ztVar));
        ztVar.a(context, this);
        this.s = true;
    }

    public final void b(zt ztVar) {
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            zt ztVar2 = (zt) weakReference.get();
            if (ztVar2 == null || ztVar2 == ztVar) {
                this.i.remove(weakReference);
            }
        }
    }

    public final void a(Bundle bundle) {
        int size = size();
        int i2 = 0;
        SparseArray<? extends Parcelable> sparseArray = null;
        while (i2 < size) {
            MenuItem item = getItem(i2);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((aad) item.getSubMenu()).a(bundle);
            }
            i2++;
            sparseArray = sparseArray;
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(a(), sparseArray);
        }
    }

    public final void b(Bundle bundle) {
        MenuItem findItem;
        if (bundle != null) {
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(a());
            int size = size();
            for (int i2 = 0; i2 < size; i2++) {
                MenuItem item = getItem(i2);
                View actionView = item.getActionView();
                if (!(actionView == null || actionView.getId() == -1)) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((aad) item.getSubMenu()).b(bundle);
                }
            }
            int i3 = bundle.getInt("android:menu:expandedactionview");
            if (i3 > 0 && (findItem = findItem(i3)) != null) {
                findItem.expandActionView();
            }
        }
    }

    /* access modifiers changed from: protected */
    public String a() {
        return "android:menu:actionviewstates";
    }

    public void a(zf zfVar) {
        this.b = zfVar;
    }

    public final MenuItem a(int i2, int i3, int i4, CharSequence charSequence) {
        int i5;
        int i6 = i4 >> 16;
        if (i6 < 0 || i6 >= l.length) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i7 = (l[i6] << 16) | (65535 & i4);
        zi ziVar = new zi(this, i2, i3, i4, i7, charSequence, this.e);
        ArrayList arrayList = this.c;
        ArrayList arrayList2 = this.c;
        int size = arrayList2.size() - 1;
        while (true) {
            if (size < 0) {
                i5 = 0;
                break;
            } else if (((zi) arrayList2.get(size)).a <= i7) {
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

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public MenuItem add(int i2) {
        return a(0, 0, 0, this.m.getString(i2));
    }

    @Override // android.view.Menu
    public MenuItem add(int i2, int i3, int i4, CharSequence charSequence) {
        return a(i2, i3, i4, charSequence);
    }

    @Override // android.view.Menu
    public MenuItem add(int i2, int i3, int i4, int i5) {
        return a(i2, i3, i4, this.m.getString(i5));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i2) {
        return addSubMenu(0, 0, 0, this.m.getString(i2));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i2, int i3, int i4, CharSequence charSequence) {
        zi ziVar = (zi) a(i2, i3, i4, charSequence);
        aad aad = new aad(this.a, this, ziVar);
        ziVar.a(aad);
        return aad;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i2, int i3, int i4, int i5) {
        return addSubMenu(i2, i3, i4, this.m.getString(i5));
    }

    public void setGroupDividerEnabled(boolean z) {
        this.y = z;
    }

    public boolean b() {
        return this.y;
    }

    public int addIntentOptions(int i2, int i3, int i4, ComponentName componentName, Intent[] intentArr, Intent intent, int i5, MenuItem[] menuItemArr) {
        PackageManager packageManager = this.a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i5 & 1) == 0) {
            removeGroup(i2);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i6);
            Intent intent2 = new Intent(resolveInfo.specificIndex < 0 ? intent : intentArr[resolveInfo.specificIndex]);
            intent2.setComponent(new ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name));
            MenuItem intent3 = add(i2, i3, i4, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && resolveInfo.specificIndex >= 0) {
                menuItemArr[resolveInfo.specificIndex] = intent3;
            }
        }
        return size;
    }

    public void removeItem(int i2) {
        int i3;
        int size = size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                i3 = -1;
                break;
            } else if (((zi) this.c.get(i4)).getItemId() == i2) {
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
            } else if (((zi) this.c.get(i4)).getGroupId() == i2) {
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
                if (i5 >= size2 || ((zi) this.c.get(i3)).getGroupId() != i2) {
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
            zi ziVar = (zi) this.c.get(i3);
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
            zi ziVar = (zi) this.c.get(i3);
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
            zi ziVar = (zi) this.c.get(i3);
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
            if (((zi) this.c.get(i2)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public MenuItem findItem(int i2) {
        MenuItem findItem;
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            zi ziVar = (zi) this.c.get(i3);
            if (ziVar.getItemId() == i2) {
                return ziVar;
            }
            if (ziVar.hasSubMenu() && (findItem = ziVar.getSubMenu().findItem(i2)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public int size() {
        return this.c.size();
    }

    public MenuItem getItem(int i2) {
        return (MenuItem) this.c.get(i2);
    }

    public boolean isShortcutKey(int i2, KeyEvent keyEvent) {
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

    /* access modifiers changed from: package-private */
    public boolean a(ze zeVar, MenuItem menuItem) {
        return this.b != null && this.b.a(zeVar, menuItem);
    }

    public boolean performShortcut(int i2, KeyEvent keyEvent, int i3) {
        zi a2 = a(i2, keyEvent);
        boolean z = false;
        if (a2 != null) {
            z = a(a2, (zt) null, i3);
        }
        if ((i3 & 2) != 0) {
            b(true);
        }
        return z;
    }

    private final void a(List list, int i2, KeyEvent keyEvent) {
        boolean c2 = c();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i2 == 67) {
            int size = this.c.size();
            for (int i3 = 0; i3 < size; i3++) {
                zi ziVar = (zi) this.c.get(i3);
                if (ziVar.hasSubMenu()) {
                    ((ze) ziVar.getSubMenu()).a(list, i2, keyEvent);
                }
                char alphabeticShortcut = c2 ? ziVar.getAlphabeticShortcut() : ziVar.getNumericShortcut();
                if ((modifiers & 69647) == ((c2 ? ziVar.getAlphabeticModifiers() : ziVar.getNumericModifiers()) & 69647) && alphabeticShortcut != 0 && ((alphabeticShortcut == keyData.meta[0] || alphabeticShortcut == keyData.meta[2] || (c2 && alphabeticShortcut == '\b' && i2 == 67)) && ziVar.isEnabled())) {
                    list.add(ziVar);
                }
            }
        }
    }

    private final zi a(int i2, KeyEvent keyEvent) {
        char numericShortcut;
        ArrayList arrayList = this.x;
        arrayList.clear();
        a(arrayList, i2, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (zi) arrayList.get(0);
        }
        boolean c2 = c();
        for (int i3 = 0; i3 < size; i3++) {
            zi ziVar = (zi) arrayList.get(i3);
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
            if (c2 && numericShortcut == '\b' && i2 == 67) {
                return ziVar;
            }
        }
        return null;
    }

    public boolean performIdentifierAction(int i2, int i3) {
        return a(findItem(i2), (zt) null, i3);
    }

    public final boolean a(MenuItem menuItem, zt ztVar, int i2) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        zi ziVar = (zi) menuItem;
        if (ziVar == null || !ziVar.isEnabled()) {
            return false;
        }
        boolean b2 = ziVar.b();
        rs rsVar = ziVar.f;
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
                ziVar.a(new aad(this.a, this, ziVar));
            }
            aad aad = (aad) ziVar.getSubMenu();
            if (z) {
                rsVar.a(aad);
            }
            if (!this.i.isEmpty()) {
                if (ztVar != null) {
                    z3 = ztVar.a(aad);
                }
                Iterator it = this.i.iterator();
                boolean z4 = z3;
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    zt ztVar2 = (zt) weakReference.get();
                    if (ztVar2 == null) {
                        this.i.remove(weakReference);
                    } else {
                        if (!z4) {
                            z2 = ztVar2.a(aad);
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
            Iterator it = this.i.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                zt ztVar = (zt) weakReference.get();
                if (ztVar == null) {
                    this.i.remove(weakReference);
                } else {
                    ztVar.a(this, z);
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
                Iterator it = this.i.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    zt ztVar = (zt) weakReference.get();
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

    /* access modifiers changed from: package-private */
    public final void h() {
        this.s = true;
        a(true);
    }

    public final ArrayList i() {
        if (!this.q) {
            return this.p;
        }
        this.p.clear();
        int size = this.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            zi ziVar = (zi) this.c.get(i2);
            if (ziVar.isVisible()) {
                this.p.add(ziVar);
            }
        }
        this.q = false;
        this.s = true;
        return this.p;
    }

    public final void j() {
        ArrayList i2 = i();
        if (this.s) {
            Iterator it = this.i.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                zt ztVar = (zt) weakReference.get();
                if (ztVar == null) {
                    this.i.remove(weakReference);
                } else {
                    z = ztVar.a() | z;
                }
            }
            if (z) {
                this.d.clear();
                this.r.clear();
                int size = i2.size();
                for (int i3 = 0; i3 < size; i3++) {
                    zi ziVar = (zi) i2.get(i3);
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

    public final ArrayList k() {
        j();
        return this.r;
    }

    public void clearHeader() {
        this.g = null;
        this.f = null;
        this.h = null;
        a(false);
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, CharSequence charSequence, int i3, Drawable drawable, View view) {
        Resources resources = this.m;
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
                this.g = ob.a(this.a, i3);
            } else if (drawable != null) {
                this.g = drawable;
            }
            this.h = null;
        }
        a(false);
    }

    public ze l() {
        return this;
    }

    public boolean a(zi ziVar) {
        boolean z = false;
        if (!this.i.isEmpty()) {
            e();
            Iterator it = this.i.iterator();
            boolean z2 = false;
            while (true) {
                if (!it.hasNext()) {
                    z = z2;
                    break;
                }
                WeakReference weakReference = (WeakReference) it.next();
                zt ztVar = (zt) weakReference.get();
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

    public boolean b(zi ziVar) {
        boolean z = false;
        if (!this.i.isEmpty() && this.j == ziVar) {
            e();
            Iterator it = this.i.iterator();
            boolean z2 = false;
            while (true) {
                if (!it.hasNext()) {
                    z = z2;
                    break;
                }
                WeakReference weakReference = (WeakReference) it.next();
                zt ztVar = (zt) weakReference.get();
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
