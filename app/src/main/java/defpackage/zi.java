package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/* renamed from: zi  reason: default package */
/* compiled from: PG */
public final class zi implements pp {
    private View A;
    private MenuItem.OnActionExpandListener B;
    private boolean C = false;
    public final int a;
    public int b = 4096;
    public int c = 4096;
    public ze d;
    public int e = 0;
    public rs f;
    private final int g;
    private final int h;
    private final int i;
    private CharSequence j;
    private CharSequence k;
    private Intent l;
    private char m;
    private char n;
    private Drawable o;
    private int p = 0;
    private aad q;
    private MenuItem.OnMenuItemClickListener r;
    private CharSequence s;
    private CharSequence t;
    private ColorStateList u = null;
    private PorterDuff.Mode v = null;
    private boolean w = false;
    private boolean x = false;
    private boolean y = false;
    private int z = 16;

    zi(ze zeVar, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6) {
        this.d = zeVar;
        this.g = i3;
        this.h = i2;
        this.i = i4;
        this.a = i5;
        this.j = charSequence;
        this.e = i6;
    }

    public final boolean b() {
        if ((this.r != null && this.r.onMenuItemClick(this)) || this.d.a(this.d, this)) {
            return true;
        }
        if (this.l != null) {
            try {
                this.d.a.startActivity(this.l);
                return true;
            } catch (ActivityNotFoundException e2) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e2);
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

    public final MenuItem setEnabled(boolean z2) {
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

    @ViewDebug.CapturedViewProperty
    public final int getItemId() {
        return this.g;
    }

    public final int getOrder() {
        return this.i;
    }

    public final Intent getIntent() {
        return this.l;
    }

    public final MenuItem setIntent(Intent intent) {
        this.l = intent;
        return this;
    }

    public final char getAlphabeticShortcut() {
        return this.n;
    }

    public final MenuItem setAlphabeticShortcut(char c2) {
        if (this.n != c2) {
            this.n = Character.toLowerCase(c2);
            this.d.a(false);
        }
        return this;
    }

    @Override // defpackage.pp
    public final MenuItem setAlphabeticShortcut(char c2, int i2) {
        if (!(this.n == c2 && this.c == i2)) {
            this.n = Character.toLowerCase(c2);
            this.c = KeyEvent.normalizeMetaState(i2);
            this.d.a(false);
        }
        return this;
    }

    @Override // defpackage.pp
    public final int getAlphabeticModifiers() {
        return this.c;
    }

    public final char getNumericShortcut() {
        return this.m;
    }

    @Override // defpackage.pp
    public final int getNumericModifiers() {
        return this.b;
    }

    public final MenuItem setNumericShortcut(char c2) {
        if (this.m != c2) {
            this.m = c2;
            this.d.a(false);
        }
        return this;
    }

    @Override // defpackage.pp
    public final MenuItem setNumericShortcut(char c2, int i2) {
        if (!(this.m == c2 && this.b == i2)) {
            this.m = c2;
            this.b = KeyEvent.normalizeMetaState(i2);
            this.d.a(false);
        }
        return this;
    }

    public final MenuItem setShortcut(char c2, char c3) {
        this.m = c2;
        this.n = Character.toLowerCase(c3);
        this.d.a(false);
        return this;
    }

    @Override // defpackage.pp
    public final MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.m = c2;
        this.b = KeyEvent.normalizeMetaState(i2);
        this.n = Character.toLowerCase(c3);
        this.c = KeyEvent.normalizeMetaState(i3);
        this.d.a(false);
        return this;
    }

    public final char c() {
        return this.d.c() ? this.n : this.m;
    }

    public static void a(StringBuilder sb, int i2, int i3, String str) {
        if ((i2 & i3) == i3) {
            sb.append(str);
        }
    }

    public final boolean d() {
        return this.d.d() && c() != 0;
    }

    public final SubMenu getSubMenu() {
        return this.q;
    }

    public final boolean hasSubMenu() {
        return this.q != null;
    }

    public final void a(aad aad) {
        this.q = aad;
        aad.setHeaderTitle(getTitle());
    }

    @ViewDebug.CapturedViewProperty
    public final CharSequence getTitle() {
        return this.j;
    }

    public final CharSequence a(zw zwVar) {
        if (zwVar == null || !zwVar.c_()) {
            return getTitle();
        }
        return getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.j = charSequence;
        this.d.a(false);
        if (this.q != null) {
            this.q.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i2) {
        return setTitle(this.d.a.getString(i2));
    }

    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.k != null ? this.k : this.j;
        if (Build.VERSION.SDK_INT >= 18 || charSequence == null || (charSequence instanceof String)) {
            return charSequence;
        }
        return charSequence.toString();
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.k = charSequence;
        this.d.a(false);
        return this;
    }

    public final Drawable getIcon() {
        if (this.o != null) {
            return a(this.o);
        }
        if (this.p == 0) {
            return null;
        }
        Drawable b2 = xw.b(this.d.a, this.p);
        this.p = 0;
        this.o = b2;
        return a(b2);
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.p = 0;
        this.o = drawable;
        this.y = true;
        this.d.a(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i2) {
        this.o = null;
        this.p = i2;
        this.y = true;
        this.d.a(false);
        return this;
    }

    @Override // defpackage.pp
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.u = colorStateList;
        this.w = true;
        this.y = true;
        this.d.a(false);
        return this;
    }

    @Override // defpackage.pp
    public final ColorStateList getIconTintList() {
        return this.u;
    }

    @Override // defpackage.pp
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.v = mode;
        this.x = true;
        this.y = true;
        this.d.a(false);
        return this;
    }

    @Override // defpackage.pp
    public final PorterDuff.Mode getIconTintMode() {
        return this.v;
    }

    private final Drawable a(Drawable drawable) {
        if (drawable != null && this.y && (this.w || this.x)) {
            drawable = jd.d(drawable).mutate();
            if (this.w) {
                jd.a(drawable, this.u);
            }
            if (this.x) {
                jd.a(drawable, this.v);
            }
            this.y = false;
        }
        return drawable;
    }

    public final boolean isCheckable() {
        return (this.z & 1) == 1;
    }

    public final MenuItem setCheckable(boolean z2) {
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

    public final MenuItem setChecked(boolean z2) {
        if ((this.z & 4) != 0) {
            ze zeVar = this.d;
            int groupId = getGroupId();
            int size = zeVar.c.size();
            zeVar.e();
            for (int i2 = 0; i2 < size; i2++) {
                zi ziVar = (zi) zeVar.c.get(i2);
                if (ziVar.getGroupId() == groupId && ziVar.e() && ziVar.isCheckable()) {
                    ziVar.e(ziVar == this);
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
        return (this.f == null || !this.f.b()) ? (this.z & 8) == 0 : (this.z & 8) == 0 && this.f.c();
    }

    /* access modifiers changed from: package-private */
    public final boolean b(boolean z2) {
        int i2 = this.z;
        this.z = (z2 ? 0 : 8) | (this.z & -9);
        if (i2 != this.z) {
            return true;
        }
        return false;
    }

    public final MenuItem setVisible(boolean z2) {
        if (b(z2)) {
            this.d.g();
        }
        return this;
    }

    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.r = onMenuItemClickListener;
        return this;
    }

    public final String toString() {
        if (this.j != null) {
            return this.j.toString();
        }
        return null;
    }

    public final ContextMenu.ContextMenuInfo getMenuInfo() {
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

    @Override // defpackage.pp
    public final void setShowAsAction(int i2) {
        switch (i2 & 3) {
            case 0:
            case 1:
            case 2:
                this.e = i2;
                this.d.h();
                return;
            default:
                throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
    }

    @Override // defpackage.pp
    public final View getActionView() {
        if (this.A != null) {
            return this.A;
        }
        if (this.f == null) {
            return null;
        }
        this.A = this.f.a(this);
        return this.A;
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // defpackage.pp
    public final rs a() {
        return this.f;
    }

    @Override // defpackage.pp
    public final pp a(rs rsVar) {
        if (this.f != null) {
            this.f.a = null;
        }
        this.A = null;
        this.f = rsVar;
        this.d.a(true);
        if (this.f != null) {
            this.f.a(new rt(this));
        }
        return this;
    }

    @Override // defpackage.pp
    public final boolean expandActionView() {
        if (!i()) {
            return false;
        }
        if (this.B == null || this.B.onMenuItemActionExpand(this)) {
            return this.d.a(this);
        }
        return false;
    }

    @Override // defpackage.pp
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
            this.A = this.f.a(this);
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

    @Override // defpackage.pp
    public final boolean isActionViewExpanded() {
        return this.C;
    }

    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.B = onActionExpandListener;
        return this;
    }

    @Override // defpackage.pp
    /* renamed from: a */
    public final pp setContentDescription(CharSequence charSequence) {
        this.s = charSequence;
        this.d.a(false);
        return this;
    }

    @Override // defpackage.pp
    public final CharSequence getContentDescription() {
        return this.s;
    }

    @Override // defpackage.pp
    /* renamed from: b */
    public final pp setTooltipText(CharSequence charSequence) {
        this.t = charSequence;
        this.d.a(false);
        return this;
    }

    @Override // defpackage.pp
    public final CharSequence getTooltipText() {
        return this.t;
    }

    @Override // defpackage.pp, android.view.MenuItem
    public final /* synthetic */ MenuItem setActionView(int i2) {
        Context context = this.d.a;
        setActionView(LayoutInflater.from(context).inflate(i2, (ViewGroup) new LinearLayout(context), false));
        return this;
    }

    @Override // defpackage.pp, android.view.MenuItem
    public final /* synthetic */ MenuItem setActionView(View view) {
        this.A = view;
        this.f = null;
        if (view != null && view.getId() == -1 && this.g > 0) {
            view.setId(this.g);
        }
        this.d.h();
        return this;
    }

    @Override // defpackage.pp
    public final /* synthetic */ MenuItem setShowAsActionFlags(int i2) {
        setShowAsAction(i2);
        return this;
    }
}
