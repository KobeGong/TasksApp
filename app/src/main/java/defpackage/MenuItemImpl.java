package defpackage;

/* renamed from: zi reason: default package */
/* compiled from: PG */
public final class MenuItemImpl implements defpackage.pp {
    private android.view.View A;
    private android.view.MenuItem.OnActionExpandListener B;
    private boolean C = false;
    public final int a;
    public int b = 4096;
    public int c = 4096;
    public MenuBuilder d;
    public int e = 0;
    public defpackage.rs f;
    private final int g;
    private final int h;
    private final int i;
    private java.lang.CharSequence j;
    private java.lang.CharSequence k;
    private android.content.Intent l;
    private char m;
    private char n;
    private android.graphics.drawable.Drawable o;
    private int p = 0;
    private SubMenuBuilder q;
    private android.view.MenuItem.OnMenuItemClickListener r;
    private java.lang.CharSequence s;
    private java.lang.CharSequence t;
    private android.content.res.ColorStateList u = null;
    private android.graphics.PorterDuff.Mode v = null;
    private boolean w = false;
    private boolean x = false;
    private boolean y = false;
    private int z = 16;

    MenuItemImpl(MenuBuilder zeVar, int i2, int i3, int i4, int i5, java.lang.CharSequence charSequence, int i6) {
        this.d = zeVar;
        this.g = i3;
        this.h = i2;
        this.i = i4;
        this.a = i5;
        this.j = charSequence;
        this.e = i6;
    }

    public final boolean b() {
        if ((this.r != null && this.r.onMenuItemClick(this)) || this.d.a(this.d, (android.view.MenuItem) this)) {
            return true;
        }
        if (this.l != null) {
            try {
                this.d.a.startActivity(this.l);
                return true;
            } catch (android.content.ActivityNotFoundException e2) {
                android.util.Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e2);
            }
        }
        if (this.f == null || !this.f.d()) {
            return false;
        }
        return true;
    }

    public final boolean isEnabled() {
        return (this.z & 16) != 0;
    }

    public final android.view.MenuItem setEnabled(boolean z2) {
        if (z2) {
            this.z |= 16;
        } else {
            this.z &= -17;
        }
        this.d.a(false);
        return this;
    }

    public final int getGroupId() {
        return this.h;
    }

    @android.view.ViewDebug.CapturedViewProperty
    public final int getItemId() {
        return this.g;
    }

    public final int getOrder() {
        return this.i;
    }

    public final android.content.Intent getIntent() {
        return this.l;
    }

    public final android.view.MenuItem setIntent(android.content.Intent intent) {
        this.l = intent;
        return this;
    }

    public final char getAlphabeticShortcut() {
        return this.n;
    }

    public final android.view.MenuItem setAlphabeticShortcut(char c2) {
        if (this.n != c2) {
            this.n = java.lang.Character.toLowerCase(c2);
            this.d.a(false);
        }
        return this;
    }

    public final android.view.MenuItem setAlphabeticShortcut(char c2, int i2) {
        if (!(this.n == c2 && this.c == i2)) {
            this.n = java.lang.Character.toLowerCase(c2);
            this.c = android.view.KeyEvent.normalizeMetaState(i2);
            this.d.a(false);
        }
        return this;
    }

    public final int getAlphabeticModifiers() {
        return this.c;
    }

    public final char getNumericShortcut() {
        return this.m;
    }

    public final int getNumericModifiers() {
        return this.b;
    }

    public final android.view.MenuItem setNumericShortcut(char c2) {
        if (this.m != c2) {
            this.m = c2;
            this.d.a(false);
        }
        return this;
    }

    public final android.view.MenuItem setNumericShortcut(char c2, int i2) {
        if (!(this.m == c2 && this.b == i2)) {
            this.m = c2;
            this.b = android.view.KeyEvent.normalizeMetaState(i2);
            this.d.a(false);
        }
        return this;
    }

    public final android.view.MenuItem setShortcut(char c2, char c3) {
        this.m = c2;
        this.n = java.lang.Character.toLowerCase(c3);
        this.d.a(false);
        return this;
    }

    public final android.view.MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.m = c2;
        this.b = android.view.KeyEvent.normalizeMetaState(i2);
        this.n = java.lang.Character.toLowerCase(c3);
        this.c = android.view.KeyEvent.normalizeMetaState(i3);
        this.d.a(false);
        return this;
    }

    public final char c() {
        return this.d.c() ? this.n : this.m;
    }

    public static void a(java.lang.StringBuilder sb, int i2, int i3, java.lang.String str) {
        if ((i2 & i3) == i3) {
            sb.append(str);
        }
    }

    public final boolean d() {
        return this.d.d() && c() != 0;
    }

    public final android.view.SubMenu getSubMenu() {
        return this.q;
    }

    public final boolean hasSubMenu() {
        return this.q != null;
    }

    public final void setSubMenu(SubMenuBuilder aad) {
        this.q = aad;
        aad.setHeaderTitle(getTitle());
    }

    @android.view.ViewDebug.CapturedViewProperty
    public final java.lang.CharSequence getTitle() {
        return this.j;
    }

    public final java.lang.CharSequence a(defpackage.zw zwVar) {
        if (zwVar == null || !zwVar.c_()) {
            return getTitle();
        }
        return getTitleCondensed();
    }

    public final android.view.MenuItem setTitle(java.lang.CharSequence charSequence) {
        this.j = charSequence;
        this.d.a(false);
        if (this.q != null) {
            this.q.setHeaderTitle(charSequence);
        }
        return this;
    }

    public final android.view.MenuItem setTitle(int i2) {
        return setTitle((java.lang.CharSequence) this.d.a.getString(i2));
    }

    public final java.lang.CharSequence getTitleCondensed() {
        java.lang.CharSequence charSequence = this.k != null ? this.k : this.j;
        if (android.os.Build.VERSION.SDK_INT >= 18 || charSequence == null || (charSequence instanceof java.lang.String)) {
            return charSequence;
        }
        return charSequence.toString();
    }

    public final android.view.MenuItem setTitleCondensed(java.lang.CharSequence charSequence) {
        this.k = charSequence;
        this.d.a(false);
        return this;
    }

    public final android.graphics.drawable.Drawable getIcon() {
        if (this.o != null) {
            return a(this.o);
        }
        if (this.p == 0) {
            return null;
        }
        android.graphics.drawable.Drawable b2 = defpackage.xw.b(this.d.a, this.p);
        this.p = 0;
        this.o = b2;
        return a(b2);
    }

    public final android.view.MenuItem setIcon(android.graphics.drawable.Drawable drawable) {
        this.p = 0;
        this.o = drawable;
        this.y = true;
        this.d.a(false);
        return this;
    }

    public final android.view.MenuItem setIcon(int i2) {
        this.o = null;
        this.p = i2;
        this.y = true;
        this.d.a(false);
        return this;
    }

    public final android.view.MenuItem setIconTintList(android.content.res.ColorStateList colorStateList) {
        this.u = colorStateList;
        this.w = true;
        this.y = true;
        this.d.a(false);
        return this;
    }

    public final android.content.res.ColorStateList getIconTintList() {
        return this.u;
    }

    public final android.view.MenuItem setIconTintMode(android.graphics.PorterDuff.Mode mode) {
        this.v = mode;
        this.x = true;
        this.y = true;
        this.d.a(false);
        return this;
    }

    public final android.graphics.PorterDuff.Mode getIconTintMode() {
        return this.v;
    }

    private final android.graphics.drawable.Drawable a(android.graphics.drawable.Drawable drawable) {
        if (drawable != null && this.y && (this.w || this.x)) {
            drawable = defpackage.jd.d(drawable).mutate();
            if (this.w) {
                defpackage.jd.a(drawable, this.u);
            }
            if (this.x) {
                defpackage.jd.a(drawable, this.v);
            }
            this.y = false;
        }
        return drawable;
    }

    public final boolean isCheckable() {
        return (this.z & 1) == 1;
    }

    public final android.view.MenuItem setCheckable(boolean z2) {
        int i2;
        int i3 = this.z;
        int i4 = this.z & -2;
        if (z2) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        this.z = i2 | i4;
        if (i3 != this.z) {
            this.d.a(false);
        }
        return this;
    }

    public final void a(boolean z2) {
        this.z = (z2 ? 4 : 0) | (this.z & -5);
    }

    public final boolean e() {
        return (this.z & 4) != 0;
    }

    public final boolean isChecked() {
        return (this.z & 2) == 2;
    }

    public final android.view.MenuItem setChecked(boolean z2) {
        boolean z3;
        if ((this.z & 4) != 0) {
            MenuBuilder zeVar = this.d;
            int groupId = getGroupId();
            int size = zeVar.c.size();
            zeVar.e();
            for (int i2 = 0; i2 < size; i2++) {
                MenuItemImpl ziVar = (MenuItemImpl) zeVar.c.get(i2);
                if (ziVar.getGroupId() == groupId && ziVar.e() && ziVar.isCheckable()) {
                    if (ziVar == this) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    ziVar.e(z3);
                }
            }
            zeVar.f();
        } else {
            e(z2);
        }
        return this;
    }

    private final void e(boolean z2) {
        int i2;
        int i3 = this.z;
        int i4 = this.z & -3;
        if (z2) {
            i2 = 2;
        } else {
            i2 = 0;
        }
        this.z = i2 | i4;
        if (i3 != this.z) {
            this.d.a(false);
        }
    }

    public final boolean isVisible() {
        if (this.f == null || !this.f.b()) {
            if ((this.z & 8) != 0) {
                return false;
            }
            return true;
        } else if ((this.z & 8) != 0 || !this.f.c()) {
            return false;
        } else {
            return true;
        }
    }

    /* access modifiers changed from: 0000 */
    public final boolean b(boolean z2) {
        int i2 = this.z;
        this.z = (z2 ? 0 : 8) | (this.z & -9);
        if (i2 != this.z) {
            return true;
        }
        return false;
    }

    public final android.view.MenuItem setVisible(boolean z2) {
        if (b(z2)) {
            this.d.g();
        }
        return this;
    }

    public final android.view.MenuItem setOnMenuItemClickListener(android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.r = onMenuItemClickListener;
        return this;
    }

    public final java.lang.String toString() {
        if (this.j != null) {
            return this.j.toString();
        }
        return null;
    }

    public final android.view.ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public final boolean f() {
        return (this.z & 32) == 32;
    }

    public final boolean g() {
        return (this.e & 1) == 1;
    }

    public final boolean h() {
        return (this.e & 2) == 2;
    }

    public final void c(boolean z2) {
        if (z2) {
            this.z |= 32;
        } else {
            this.z &= -33;
        }
    }

    public final void setShowAsAction(int i2) {
        switch (i2 & 3) {
            case 0:
            case 1:
            case 2:
                this.e = i2;
                this.d.h();
                return;
            default:
                throw new java.lang.IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
    }

    public final android.view.View getActionView() {
        if (this.A != null) {
            return this.A;
        }
        if (this.f == null) {
            return null;
        }
        this.A = this.f.a((android.view.MenuItem) this);
        return this.A;
    }

    public final android.view.MenuItem setActionProvider(android.view.ActionProvider actionProvider) {
        throw new java.lang.UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public final android.view.ActionProvider getActionProvider() {
        throw new java.lang.UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public final defpackage.rs a() {
        return this.f;
    }

    public final defpackage.pp a(defpackage.rs rsVar) {
        if (this.f != null) {
            this.f.a = null;
        }
        this.A = null;
        this.f = rsVar;
        this.d.a(true);
        if (this.f != null) {
            this.f.a(new defpackage.rt(this));
        }
        return this;
    }

    public final boolean expandActionView() {
        if (!i()) {
            return false;
        }
        if (this.B == null || this.B.onMenuItemActionExpand(this)) {
            return this.d.a(this);
        }
        return false;
    }

    public final boolean collapseActionView() {
        if ((this.e & 8) == 0) {
            return false;
        }
        if (this.A == null) {
            return true;
        }
        if (this.B == null || this.B.onMenuItemActionCollapse(this)) {
            return this.d.b(this);
        }
        return false;
    }

    public final boolean i() {
        if ((this.e & 8) == 0) {
            return false;
        }
        if (this.A == null && this.f != null) {
            this.A = this.f.a((android.view.MenuItem) this);
        }
        if (this.A != null) {
            return true;
        }
        return false;
    }

    public final void d(boolean z2) {
        this.C = z2;
        this.d.a(false);
    }

    public final boolean isActionViewExpanded() {
        return this.C;
    }

    public final android.view.MenuItem setOnActionExpandListener(android.view.MenuItem.OnActionExpandListener onActionExpandListener) {
        this.B = onActionExpandListener;
        return this;
    }

    /* renamed from: a */
    public final defpackage.pp setContentDescription(java.lang.CharSequence charSequence) {
        this.s = charSequence;
        this.d.a(false);
        return this;
    }

    public final java.lang.CharSequence getContentDescription() {
        return this.s;
    }

    /* renamed from: b */
    public final defpackage.pp setTooltipText(java.lang.CharSequence charSequence) {
        this.t = charSequence;
        this.d.a(false);
        return this;
    }

    public final java.lang.CharSequence getTooltipText() {
        return this.t;
    }

    public final /* synthetic */ android.view.MenuItem setActionView(int i2) {
        android.content.Context context = this.d.a;
        setActionView(android.view.LayoutInflater.from(context).inflate(i2, new android.widget.LinearLayout(context), false));
        return this;
    }

    public final /* synthetic */ android.view.MenuItem setActionView(android.view.View view) {
        this.A = view;
        this.f = null;
        if (view != null && view.getId() == -1 && this.g > 0) {
            view.setId(this.g);
        }
        this.d.h();
        return this;
    }

    public final /* synthetic */ android.view.MenuItem setShowAsActionFlags(int i2) {
        setShowAsAction(i2);
        return this;
    }
}
