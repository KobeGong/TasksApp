package defpackage;

/* renamed from: zy reason: default package */
/* compiled from: PG */
class zy extends defpackage.yt implements android.view.Menu {
    zy(android.content.Context context, defpackage.po poVar) {
        super(context, poVar);
    }

    public android.view.MenuItem add(java.lang.CharSequence charSequence) {
        return a(((defpackage.po) this.d).add(charSequence));
    }

    public android.view.MenuItem add(int i) {
        return a(((defpackage.po) this.d).add(i));
    }

    public android.view.MenuItem add(int i, int i2, int i3, java.lang.CharSequence charSequence) {
        return a(((defpackage.po) this.d).add(i, i2, i3, charSequence));
    }

    public android.view.MenuItem add(int i, int i2, int i3, int i4) {
        return a(((defpackage.po) this.d).add(i, i2, i3, i4));
    }

    public android.view.SubMenu addSubMenu(java.lang.CharSequence charSequence) {
        return a(((defpackage.po) this.d).addSubMenu(charSequence));
    }

    public android.view.SubMenu addSubMenu(int i) {
        return a(((defpackage.po) this.d).addSubMenu(i));
    }

    public android.view.SubMenu addSubMenu(int i, int i2, int i3, java.lang.CharSequence charSequence) {
        return a(((defpackage.po) this.d).addSubMenu(i, i2, i3, charSequence));
    }

    public android.view.SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return a(((defpackage.po) this.d).addSubMenu(i, i2, i3, i4));
    }

    public int addIntentOptions(int i, int i2, int i3, android.content.ComponentName componentName, android.content.Intent[] intentArr, android.content.Intent intent, int i4, android.view.MenuItem[] menuItemArr) {
        android.view.MenuItem[] menuItemArr2 = null;
        if (menuItemArr != null) {
            menuItemArr2 = new android.view.MenuItem[menuItemArr.length];
        }
        int addIntentOptions = ((defpackage.po) this.d).addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = a(menuItemArr2[i5]);
            }
        }
        return addIntentOptions;
    }

    public void removeItem(int i) {
        if (this.b != null) {
            java.util.Iterator it = this.b.keySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    if (i == ((android.view.MenuItem) it.next()).getItemId()) {
                        it.remove();
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        ((defpackage.po) this.d).removeItem(i);
    }

    public void removeGroup(int i) {
        if (this.b != null) {
            java.util.Iterator it = this.b.keySet().iterator();
            while (it.hasNext()) {
                if (i == ((android.view.MenuItem) it.next()).getGroupId()) {
                    it.remove();
                }
            }
        }
        ((defpackage.po) this.d).removeGroup(i);
    }

    public void clear() {
        if (this.b != null) {
            this.b.clear();
        }
        if (this.c != null) {
            this.c.clear();
        }
        ((defpackage.po) this.d).clear();
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        ((defpackage.po) this.d).setGroupCheckable(i, z, z2);
    }

    public void setGroupVisible(int i, boolean z) {
        ((defpackage.po) this.d).setGroupVisible(i, z);
    }

    public void setGroupEnabled(int i, boolean z) {
        ((defpackage.po) this.d).setGroupEnabled(i, z);
    }

    public boolean hasVisibleItems() {
        return ((defpackage.po) this.d).hasVisibleItems();
    }

    public android.view.MenuItem findItem(int i) {
        return a(((defpackage.po) this.d).findItem(i));
    }

    public int size() {
        return ((defpackage.po) this.d).size();
    }

    public android.view.MenuItem getItem(int i) {
        return a(((defpackage.po) this.d).getItem(i));
    }

    public void close() {
        ((defpackage.po) this.d).close();
    }

    public boolean performShortcut(int i, android.view.KeyEvent keyEvent, int i2) {
        return ((defpackage.po) this.d).performShortcut(i, keyEvent, i2);
    }

    public boolean isShortcutKey(int i, android.view.KeyEvent keyEvent) {
        return ((defpackage.po) this.d).isShortcutKey(i, keyEvent);
    }

    public boolean performIdentifierAction(int i, int i2) {
        return ((defpackage.po) this.d).performIdentifierAction(i, i2);
    }

    public void setQwertyMode(boolean z) {
        ((defpackage.po) this.d).setQwertyMode(z);
    }
}
