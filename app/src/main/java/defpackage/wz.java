package defpackage;

/* renamed from: wz reason: default package */
/* compiled from: PG */
public class wz extends defpackage.wp implements android.view.LayoutInflater.Factory2, defpackage.zf {
    private static final boolean v = (android.os.Build.VERSION.SDK_INT < 21);
    private android.widget.TextView A;
    private android.view.View B;
    private boolean C;
    private boolean D;
    private boolean E;
    private defpackage.zx[] F;
    private defpackage.zx G;
    private boolean H;
    private final java.lang.Runnable I = new defpackage.xa(this);
    private boolean J;
    private android.graphics.Rect K;
    private android.graphics.Rect L;
    private android.support.v7.app.AppCompatViewInflater M;
    public defpackage.acq n;
    public defpackage.yc o;
    public android.support.v7.widget.ActionBarContextView p;
    public android.widget.PopupWindow q;
    public java.lang.Runnable r;
    public defpackage.te s = null;
    public boolean t;
    public int u;
    private defpackage.xv w;
    private defpackage.afs x;
    private boolean y;
    private android.view.ViewGroup z;

    wz(android.content.Context context, android.view.Window window, defpackage.wn wnVar) {
        super(context, window, wnVar);
    }

    public void a(android.os.Bundle bundle) {
        if ((this.d instanceof android.app.Activity) && defpackage.jd.b((android.app.Activity) this.d) != null) {
            defpackage.wa waVar = this.f;
            if (waVar == null) {
                this.J = true;
            } else {
                waVar.b(true);
            }
        }
    }

    public final void c() {
        q();
    }

    public final void l() {
        q();
        if (this.g && this.f == null) {
            if (this.d instanceof android.app.Activity) {
                this.f = new defpackage.xp((android.app.Activity) this.d, this.h);
            } else if (this.d instanceof android.app.Dialog) {
                this.f = new defpackage.xp((android.app.Dialog) this.d);
            }
            if (this.f != null) {
                this.f.b(this.J);
            }
        }
    }

    public final android.view.View a(int i) {
        q();
        return this.c.findViewById(i);
    }

    public final void d() {
        if (this.g && this.y) {
            defpackage.wa a = a();
            if (a != null) {
                a.f();
            }
        }
        defpackage.abl a2 = defpackage.abl.a();
        android.content.Context context = this.b;
        synchronized (a2.a) {
            defpackage.qx qxVar = (defpackage.qx) a2.b.get(context);
            if (qxVar != null) {
                qxVar.c();
            }
        }
        k();
    }

    public void f() {
        defpackage.wa a = a();
        if (a != null) {
            a.c(false);
        }
    }

    public final void g() {
        defpackage.wa a = a();
        if (a != null) {
            a.c(true);
        }
    }

    public final void a(android.view.View view) {
        q();
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.z.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.d.onContentChanged();
    }

    public final void b(int i) {
        q();
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.z.findViewById(16908290);
        viewGroup.removeAllViews();
        android.view.LayoutInflater.from(this.b).inflate(i, viewGroup);
        this.d.onContentChanged();
    }

    public final void a(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        q();
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.z.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.d.onContentChanged();
    }

    public final void b(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        q();
        ((android.view.ViewGroup) this.z.findViewById(16908290)).addView(view, layoutParams);
        this.d.onContentChanged();
    }

    public void i() {
        if (this.t) {
            this.c.getDecorView().removeCallbacks(this.I);
        }
        super.i();
        if (this.f != null) {
            this.f.l();
        }
    }

    private final void q() {
        android.view.ViewGroup viewGroup;
        android.view.ViewGroup viewGroup2;
        java.lang.CharSequence charSequence;
        android.content.Context context;
        if (!this.y) {
            android.content.res.TypedArray obtainStyledAttributes = this.b.obtainStyledAttributes(defpackage.xu.aj);
            if (!obtainStyledAttributes.hasValue(defpackage.xu.ao)) {
                obtainStyledAttributes.recycle();
                throw new java.lang.IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
            }
            if (obtainStyledAttributes.getBoolean(defpackage.xu.ax, false)) {
                c(1);
            } else if (obtainStyledAttributes.getBoolean(defpackage.xu.ao, false)) {
                c(108);
            }
            if (obtainStyledAttributes.getBoolean(defpackage.xu.ap, false)) {
                c(109);
            }
            if (obtainStyledAttributes.getBoolean(defpackage.xu.aq, false)) {
                c(10);
            }
            this.j = obtainStyledAttributes.getBoolean(defpackage.xu.al, false);
            obtainStyledAttributes.recycle();
            this.c.getDecorView();
            android.view.LayoutInflater from = android.view.LayoutInflater.from(this.b);
            if (this.k) {
                if (this.i) {
                    viewGroup = (android.view.ViewGroup) from.inflate(2131034133, null);
                } else {
                    viewGroup = (android.view.ViewGroup) from.inflate(2131034132, null);
                }
                if (android.os.Build.VERSION.SDK_INT >= 21) {
                    defpackage.sn.a((android.view.View) viewGroup, (defpackage.sl) new defpackage.xt(this));
                    viewGroup2 = viewGroup;
                } else {
                    ((defpackage.adm) viewGroup).a(new defpackage.adn(this));
                    viewGroup2 = viewGroup;
                }
            } else if (this.j) {
                android.view.ViewGroup viewGroup3 = (android.view.ViewGroup) from.inflate(2131034123, null);
                this.h = false;
                this.g = false;
                viewGroup2 = viewGroup3;
            } else if (this.g) {
                android.util.TypedValue typedValue = new android.util.TypedValue();
                this.b.getTheme().resolveAttribute(2130772147, typedValue, true);
                if (typedValue.resourceId != 0) {
                    context = new defpackage.yf(this.b, typedValue.resourceId);
                } else {
                    context = this.b;
                }
                android.view.ViewGroup viewGroup4 = (android.view.ViewGroup) android.view.LayoutInflater.from(context).inflate(2131034134, null);
                this.n = (defpackage.acq) viewGroup4.findViewById(2131755205);
                this.n.a(this.c.getCallback());
                if (this.h) {
                    this.n.a(109);
                }
                if (this.C) {
                    this.n.a(2);
                }
                if (this.D) {
                    this.n.a(5);
                }
                viewGroup2 = viewGroup4;
            } else {
                viewGroup2 = null;
            }
            if (viewGroup2 == null) {
                throw new java.lang.IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.g + ", windowActionBarOverlay: " + this.h + ", android:windowIsFloating: " + this.j + ", windowActionModeOverlay: " + this.i + ", windowNoTitle: " + this.k + " }");
            }
            if (this.n == null) {
                this.A = (android.widget.TextView) viewGroup2.findViewById(2131755042);
            }
            defpackage.ahr.b(viewGroup2);
            android.support.v7.widget.ContentFrameLayout contentFrameLayout = (android.support.v7.widget.ContentFrameLayout) viewGroup2.findViewById(2131755008);
            android.view.ViewGroup viewGroup5 = (android.view.ViewGroup) this.c.findViewById(16908290);
            if (viewGroup5 != null) {
                while (viewGroup5.getChildCount() > 0) {
                    android.view.View childAt = viewGroup5.getChildAt(0);
                    viewGroup5.removeViewAt(0);
                    contentFrameLayout.addView(childAt);
                }
                viewGroup5.setId(-1);
                contentFrameLayout.setId(16908290);
                if (viewGroup5 instanceof android.widget.FrameLayout) {
                    ((android.widget.FrameLayout) viewGroup5).setForeground(null);
                }
            }
            this.c.setContentView(viewGroup2);
            contentFrameLayout.h = new defpackage.acp(this);
            this.z = viewGroup2;
            if (this.d instanceof android.app.Activity) {
                charSequence = ((android.app.Activity) this.d).getTitle();
            } else {
                charSequence = this.l;
            }
            if (!android.text.TextUtils.isEmpty(charSequence)) {
                b(charSequence);
            }
            android.support.v7.widget.ContentFrameLayout contentFrameLayout2 = (android.support.v7.widget.ContentFrameLayout) this.z.findViewById(16908290);
            android.view.View decorView = this.c.getDecorView();
            contentFrameLayout2.g.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
            if (defpackage.sn.a.r(contentFrameLayout2)) {
                contentFrameLayout2.requestLayout();
            }
            android.content.res.TypedArray obtainStyledAttributes2 = this.b.obtainStyledAttributes(defpackage.xu.aj);
            int i = defpackage.xu.av;
            if (contentFrameLayout2.a == null) {
                contentFrameLayout2.a = new android.util.TypedValue();
            }
            obtainStyledAttributes2.getValue(i, contentFrameLayout2.a);
            int i2 = defpackage.xu.aw;
            if (contentFrameLayout2.b == null) {
                contentFrameLayout2.b = new android.util.TypedValue();
            }
            obtainStyledAttributes2.getValue(i2, contentFrameLayout2.b);
            if (obtainStyledAttributes2.hasValue(defpackage.xu.at)) {
                int i3 = defpackage.xu.at;
                if (contentFrameLayout2.c == null) {
                    contentFrameLayout2.c = new android.util.TypedValue();
                }
                obtainStyledAttributes2.getValue(i3, contentFrameLayout2.c);
            }
            if (obtainStyledAttributes2.hasValue(defpackage.xu.au)) {
                int i4 = defpackage.xu.au;
                if (contentFrameLayout2.d == null) {
                    contentFrameLayout2.d = new android.util.TypedValue();
                }
                obtainStyledAttributes2.getValue(i4, contentFrameLayout2.d);
            }
            if (obtainStyledAttributes2.hasValue(defpackage.xu.ar)) {
                int i5 = defpackage.xu.ar;
                if (contentFrameLayout2.e == null) {
                    contentFrameLayout2.e = new android.util.TypedValue();
                }
                obtainStyledAttributes2.getValue(i5, contentFrameLayout2.e);
            }
            if (obtainStyledAttributes2.hasValue(defpackage.xu.as)) {
                int i6 = defpackage.xu.as;
                if (contentFrameLayout2.f == null) {
                    contentFrameLayout2.f = new android.util.TypedValue();
                }
                obtainStyledAttributes2.getValue(i6, contentFrameLayout2.f);
            }
            obtainStyledAttributes2.recycle();
            contentFrameLayout2.requestLayout();
            this.y = true;
            defpackage.zx g = g(0);
            if (this.m) {
                return;
            }
            if (g == null || g.h == null) {
                f(108);
            }
        }
    }

    public final boolean c(int i) {
        if (i == 8) {
            i = 108;
        } else if (i == 9) {
            i = 109;
        }
        if (this.k && i == 108) {
            return false;
        }
        if (this.g && i == 1) {
            this.g = false;
        }
        switch (i) {
            case 1:
                r();
                this.k = true;
                return true;
            case 2:
                r();
                this.C = true;
                return true;
            case 5:
                r();
                this.D = true;
                return true;
            case 10:
                r();
                this.i = true;
                return true;
            case 108:
                r();
                this.g = true;
                return true;
            case 109:
                r();
                this.h = true;
                return true;
            default:
                return this.c.requestFeature(i);
        }
    }

    /* access modifiers changed from: 0000 */
    public final void b(java.lang.CharSequence charSequence) {
        if (this.n != null) {
            this.n.a(charSequence);
        } else if (this.f != null) {
            this.f.b(charSequence);
        } else if (this.A != null) {
            this.A.setText(charSequence);
        }
    }

    /* access modifiers changed from: 0000 */
    public final void d(int i) {
        if (i == 108) {
            defpackage.wa a = a();
            if (a != null) {
                a.d(false);
            }
        } else if (i == 0) {
            defpackage.zx g = g(i);
            if (g.m) {
                a(g, false);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final boolean e(int i) {
        if (i != 108) {
            return false;
        }
        defpackage.wa a = a();
        if (a == null) {
            return true;
        }
        a.d(true);
        return true;
    }

    public final boolean a(defpackage.ze zeVar, android.view.MenuItem menuItem) {
        android.view.Window.Callback callback = this.c.getCallback();
        if (callback != null && !this.m) {
            defpackage.zx a = a((android.view.Menu) zeVar.l());
            if (a != null) {
                return callback.onMenuItemSelected(a.a, menuItem);
            }
        }
        return false;
    }

    public final void a(defpackage.ze zeVar) {
        if (this.n == null || !this.n.c() || (android.view.ViewConfiguration.get(this.b).hasPermanentMenuKey() && !this.n.e())) {
            defpackage.zx g = g(0);
            g.o = true;
            a(g, false);
            a(g, (android.view.KeyEvent) null);
            return;
        }
        android.view.Window.Callback callback = this.c.getCallback();
        if (this.n.d()) {
            this.n.g();
            if (!this.m) {
                callback.onPanelClosed(108, g(0).h);
            }
        } else if (callback != null && !this.m) {
            if (this.t && (this.u & 1) != 0) {
                this.c.getDecorView().removeCallbacks(this.I);
                this.I.run();
            }
            defpackage.zx g2 = g(0);
            if (g2.h != null && !g2.p && callback.onPreparePanel(0, g2.g, g2.h)) {
                callback.onMenuOpened(108, g2.h);
                this.n.f();
            }
        }
    }

    public final void h() {
        defpackage.wa a = a();
        if (a != null) {
            a.i();
        }
        f(0);
    }

    /* access modifiers changed from: 0000 */
    public final defpackage.yc a(defpackage.yd ydVar) {
        android.content.Context context;
        p();
        if (this.o != null) {
            this.o.c();
        }
        if (this.e != null && !this.m) {
            try {
                this.e.f();
            } catch (java.lang.AbstractMethodError e) {
            }
        }
        if (this.p == null) {
            if (this.j) {
                android.util.TypedValue typedValue = new android.util.TypedValue();
                android.content.res.Resources.Theme theme = this.b.getTheme();
                theme.resolveAttribute(2130772147, typedValue, true);
                if (typedValue.resourceId != 0) {
                    android.content.res.Resources.Theme newTheme = this.b.getResources().newTheme();
                    newTheme.setTo(theme);
                    newTheme.applyStyle(typedValue.resourceId, true);
                    context = new defpackage.yf(this.b, 0);
                    context.getTheme().setTo(newTheme);
                } else {
                    context = this.b;
                }
                this.p = new android.support.v7.widget.ActionBarContextView(context);
                this.q = new android.widget.PopupWindow(context, null, 2130772166);
                defpackage.vb.a(this.q, 2);
                this.q.setContentView(this.p);
                this.q.setWidth(-1);
                context.getTheme().resolveAttribute(2130772149, typedValue, true);
                this.p.d = android.util.TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
                this.q.setHeight(-2);
                this.r = new defpackage.xb(this);
            } else {
                android.support.v7.widget.ViewStubCompat viewStubCompat = (android.support.v7.widget.ViewStubCompat) this.z.findViewById(2131755203);
                if (viewStubCompat != null) {
                    viewStubCompat.a = android.view.LayoutInflater.from(m());
                    this.p = (android.support.v7.widget.ActionBarContextView) viewStubCompat.a();
                }
            }
        }
        if (this.p != null) {
            p();
            this.p.b();
            defpackage.yg ygVar = new defpackage.yg(this.p.getContext(), this.p, ydVar);
            if (ydVar.a((defpackage.yc) ygVar, ygVar.b())) {
                ygVar.d();
                this.p.a((defpackage.yc) ygVar);
                this.o = ygVar;
                if (o()) {
                    this.p.setAlpha(0.0f);
                    this.s = defpackage.sn.b(this.p).a(1.0f);
                    this.s.a((defpackage.th) new defpackage.xd(this));
                } else {
                    this.p.setAlpha(1.0f);
                    this.p.setVisibility(0);
                    this.p.sendAccessibilityEvent(32);
                    if (this.p.getParent() instanceof android.view.View) {
                        defpackage.sn.a.g((android.view.View) this.p.getParent());
                    }
                }
                if (this.q != null) {
                    this.c.getDecorView().post(this.r);
                }
            } else {
                this.o = null;
            }
        }
        if (!(this.o == null || this.e == null)) {
            this.e.d();
        }
        return this.o;
    }

    /* access modifiers changed from: 0000 */
    public final boolean o() {
        if (this.y && this.z != null) {
            if (defpackage.sn.a.r(this.z)) {
                return true;
            }
        }
        return false;
    }

    public final void p() {
        if (this.s != null) {
            this.s.a();
        }
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(int i, android.view.KeyEvent keyEvent) {
        defpackage.wa a = a();
        if (a != null && a.a(i, keyEvent)) {
            return true;
        }
        if (this.G == null || !a(this.G, keyEvent.getKeyCode(), keyEvent)) {
            if (this.G == null) {
                defpackage.zx g = g(0);
                b(g, keyEvent);
                boolean a2 = a(g, keyEvent.getKeyCode(), keyEvent);
                g.k = false;
                if (a2) {
                    return true;
                }
            }
            return false;
        } else if (this.G == null) {
            return true;
        } else {
            this.G.l = true;
            return true;
        }
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(android.view.KeyEvent keyEvent) {
        boolean z2;
        boolean z3;
        boolean z4;
        if (keyEvent.getKeyCode() == 82 && this.d.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() == 0) {
            switch (keyCode) {
                case 4:
                    this.H = (keyEvent.getFlags() & 128) != 0;
                    break;
                case 82:
                    if (keyEvent.getRepeatCount() != 0) {
                        return true;
                    }
                    defpackage.zx g = g(0);
                    if (g.m) {
                        return true;
                    }
                    b(g, keyEvent);
                    return true;
            }
            return false;
        }
        switch (keyCode) {
            case 4:
                boolean z5 = this.H;
                this.H = false;
                defpackage.zx g2 = g(0);
                if (g2 == null || !g2.m) {
                    if (this.o != null) {
                        this.o.c();
                        z2 = true;
                    } else {
                        defpackage.wa a = a();
                        if (a == null || !a.k()) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                    }
                    if (z2) {
                        return true;
                    }
                } else if (z5) {
                    return true;
                } else {
                    a(g2, true);
                    return true;
                }
                break;
            case 82:
                if (this.o != null) {
                    return true;
                }
                defpackage.zx g3 = g(0);
                if (this.n == null || !this.n.c() || android.view.ViewConfiguration.get(this.b).hasPermanentMenuKey()) {
                    if (g3.m || g3.l) {
                        z3 = g3.m;
                        a(g3, true);
                    } else {
                        if (g3.k) {
                            if (g3.p) {
                                g3.k = false;
                                z4 = b(g3, keyEvent);
                            } else {
                                z4 = true;
                            }
                            if (z4) {
                                a(g3, keyEvent);
                                z3 = true;
                            }
                        }
                        z3 = false;
                    }
                } else if (!this.n.d()) {
                    if (!this.m && b(g3, keyEvent)) {
                        z3 = this.n.f();
                    }
                    z3 = false;
                } else {
                    z3 = this.n.g();
                }
                if (!z3) {
                    return true;
                }
                android.media.AudioManager audioManager = (android.media.AudioManager) this.b.getSystemService("audio");
                if (audioManager != null) {
                    audioManager.playSoundEffect(0);
                    return true;
                }
                android.util.Log.w("AppCompatDelegate", "Couldn't get audio manager");
                return true;
        }
        return false;
    }

    private final android.view.View a(android.view.View view, java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        boolean z2;
        boolean z3;
        if (this.M == null) {
            java.lang.String string = this.b.obtainStyledAttributes(defpackage.xu.aj).getString(defpackage.xu.an);
            if (string == null || android.support.v7.app.AppCompatViewInflater.class.getName().equals(string)) {
                this.M = new android.support.v7.app.AppCompatViewInflater();
            } else {
                try {
                    this.M = (android.support.v7.app.AppCompatViewInflater) java.lang.Class.forName(string).getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
                } catch (Throwable th) {
                    new java.lang.StringBuilder("Failed to instantiate custom view inflater ").append(string).append(". Falling back to default.");
                    this.M = new android.support.v7.app.AppCompatViewInflater();
                }
            }
        }
        if (v) {
            if (!(attributeSet instanceof org.xmlpull.v1.XmlPullParser)) {
                android.view.ViewParent viewParent = (android.view.ViewParent) view;
                if (viewParent == null) {
                    z3 = false;
                } else {
                    android.view.View decorView = this.c.getDecorView();
                    android.view.ViewParent viewParent2 = viewParent;
                    while (true) {
                        if (viewParent2 != null) {
                            if (viewParent2 == decorView || !(viewParent2 instanceof android.view.View)) {
                                break;
                            }
                            if (defpackage.sn.a.s((android.view.View) viewParent2)) {
                                break;
                            }
                            viewParent2 = viewParent2.getParent();
                        } else {
                            z3 = true;
                            break;
                        }
                    }
                    z3 = false;
                }
            } else if (((org.xmlpull.v1.XmlPullParser) attributeSet).getDepth() > 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            z2 = z3;
        } else {
            z2 = false;
        }
        return this.M.createView(view, str, context, attributeSet, z2, v, true, false);
    }

    public final void j() {
        android.view.LayoutInflater from = android.view.LayoutInflater.from(this.b);
        if (from.getFactory() == null) {
            defpackage.rz.b(from, this);
        } else {
            from.getFactory2();
        }
    }

    public final android.view.View onCreateView(android.view.View view, java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        android.view.View a = a(str, context, attributeSet);
        return a != null ? a : a(view, str, context, attributeSet);
    }

    public android.view.View onCreateView(java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    /* access modifiers changed from: 0000 */
    public android.view.View a(java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        if (this.d instanceof android.view.LayoutInflater.Factory) {
            android.view.View onCreateView = ((android.view.LayoutInflater.Factory) this.d).onCreateView(str, context, attributeSet);
            if (onCreateView != null) {
                return onCreateView;
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01dc, code lost:
        if (r0.width == -1) goto L_0x0118;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00db  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(defpackage.zx r11, android.view.KeyEvent r12) {
        /*
            r10 = this;
            r1 = -1
            r2 = -2
            r3 = 0
            r9 = 1
            boolean r0 = r11.m
            if (r0 != 0) goto L_0x000c
            boolean r0 = r10.m
            if (r0 == 0) goto L_0x000d
        L_0x000c:
            return
        L_0x000d:
            int r0 = r11.a
            if (r0 != 0) goto L_0x0022
            android.content.Context r0 = r10.b
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.screenLayout
            r0 = r0 & 15
            r4 = 4
            if (r0 == r4) goto L_0x000c
        L_0x0022:
            android.view.Window r0 = r10.c
            android.view.Window$Callback r0 = r0.getCallback()
            if (r0 == 0) goto L_0x0038
            int r4 = r11.a
            ze r5 = r11.h
            boolean r0 = r0.onMenuOpened(r4, r5)
            if (r0 != 0) goto L_0x0038
            r10.a(r11, r9)
            goto L_0x000c
        L_0x0038:
            android.content.Context r0 = r10.b
            java.lang.String r4 = "window"
            java.lang.Object r0 = r0.getSystemService(r4)
            r8 = r0
            android.view.WindowManager r8 = (android.view.WindowManager) r8
            if (r8 == 0) goto L_0x000c
            boolean r0 = r10.b(r11, r12)
            if (r0 == 0) goto L_0x000c
            android.view.ViewGroup r0 = r11.e
            if (r0 == 0) goto L_0x0053
            boolean r0 = r11.o
            if (r0 == 0) goto L_0x01ce
        L_0x0053:
            android.view.ViewGroup r0 = r11.e
            if (r0 != 0) goto L_0x013e
            android.content.Context r0 = r10.m()
            android.util.TypedValue r1 = new android.util.TypedValue
            r1.<init>()
            android.content.res.Resources r4 = r0.getResources()
            android.content.res.Resources$Theme r4 = r4.newTheme()
            android.content.res.Resources$Theme r5 = r0.getTheme()
            r4.setTo(r5)
            r5 = 2130772144(0x7f0100b0, float:1.7147398E38)
            r4.resolveAttribute(r5, r1, r9)
            int r5 = r1.resourceId
            if (r5 == 0) goto L_0x007e
            int r5 = r1.resourceId
            r4.applyStyle(r5, r9)
        L_0x007e:
            r5 = 2130772210(0x7f0100f2, float:1.7147532E38)
            r4.resolveAttribute(r5, r1, r9)
            int r5 = r1.resourceId
            if (r5 == 0) goto L_0x0136
            int r1 = r1.resourceId
            r4.applyStyle(r1, r9)
        L_0x008d:
            yf r1 = new yf
            r1.<init>(r0, r3)
            android.content.res.Resources$Theme r0 = r1.getTheme()
            r0.setTo(r4)
            r11.j = r1
            int[] r0 = defpackage.xu.aj
            android.content.res.TypedArray r0 = r1.obtainStyledAttributes(r0)
            int r1 = defpackage.xu.am
            int r1 = r0.getResourceId(r1, r3)
            r11.b = r1
            int r1 = defpackage.xu.ak
            int r1 = r0.getResourceId(r1, r3)
            r11.d = r1
            r0.recycle()
            xf r0 = new xf
            android.content.Context r1 = r11.j
            r0.<init>(r10, r1)
            r11.e = r0
            r0 = 81
            r11.c = r0
            android.view.ViewGroup r0 = r11.e
            if (r0 == 0) goto L_0x000c
        L_0x00c5:
            android.view.View r0 = r11.g
            if (r0 == 0) goto L_0x0151
            android.view.View r0 = r11.g
            r11.f = r0
            r0 = r9
        L_0x00ce:
            if (r0 == 0) goto L_0x000c
            android.view.View r0 = r11.f
            if (r0 == 0) goto L_0x01cb
            android.view.View r0 = r11.g
            if (r0 == 0) goto L_0x01bc
            r0 = r9
        L_0x00d9:
            if (r0 == 0) goto L_0x000c
            android.view.View r0 = r11.f
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            if (r0 != 0) goto L_0x01e1
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r0.<init>(r2, r2)
            r1 = r0
        L_0x00e9:
            int r0 = r11.b
            android.view.ViewGroup r4 = r11.e
            r4.setBackgroundResource(r0)
            android.view.View r0 = r11.f
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L_0x0103
            boolean r4 = r0 instanceof android.view.ViewGroup
            if (r4 == 0) goto L_0x0103
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.View r4 = r11.f
            r0.removeView(r4)
        L_0x0103:
            android.view.ViewGroup r0 = r11.e
            android.view.View r4 = r11.f
            r0.addView(r4, r1)
            android.view.View r0 = r11.f
            boolean r0 = r0.hasFocus()
            if (r0 != 0) goto L_0x0117
            android.view.View r0 = r11.f
            r0.requestFocus()
        L_0x0117:
            r1 = r2
        L_0x0118:
            r11.l = r3
            android.view.WindowManager$LayoutParams r0 = new android.view.WindowManager$LayoutParams
            r5 = 1002(0x3ea, float:1.404E-42)
            r6 = 8519680(0x820000, float:1.1938615E-38)
            r7 = -3
            r4 = r3
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            int r1 = r11.c
            r0.gravity = r1
            int r1 = r11.d
            r0.windowAnimations = r1
            android.view.ViewGroup r1 = r11.e
            r8.addView(r1, r0)
            r11.m = r9
            goto L_0x000c
        L_0x0136:
            r1 = 2132017561(0x7f140199, float:1.9673404E38)
            r4.applyStyle(r1, r9)
            goto L_0x008d
        L_0x013e:
            boolean r0 = r11.o
            if (r0 == 0) goto L_0x00c5
            android.view.ViewGroup r0 = r11.e
            int r0 = r0.getChildCount()
            if (r0 <= 0) goto L_0x00c5
            android.view.ViewGroup r0 = r11.e
            r0.removeAllViews()
            goto L_0x00c5
        L_0x0151:
            ze r0 = r11.h
            if (r0 == 0) goto L_0x01b9
            afs r0 = r10.x
            if (r0 != 0) goto L_0x0160
            afs r0 = new afs
            r0.<init>(r10)
            r10.x = r0
        L_0x0160:
            afs r0 = r10.x
            ze r1 = r11.h
            if (r1 != 0) goto L_0x0172
            r0 = 0
        L_0x0167:
            android.view.View r0 = (android.view.View) r0
            r11.f = r0
            android.view.View r0 = r11.f
            if (r0 == 0) goto L_0x01b9
            r0 = r9
            goto L_0x00ce
        L_0x0172:
            zb r1 = r11.i
            if (r1 != 0) goto L_0x018a
            zb r1 = new zb
            android.content.Context r4 = r11.j
            r1.<init>(r4)
            r11.i = r1
            zb r1 = r11.i
            r1.e = r0
            ze r0 = r11.h
            zb r1 = r11.i
            r0.a(r1)
        L_0x018a:
            zb r1 = r11.i
            android.view.ViewGroup r0 = r11.e
            android.support.v7.view.menu.ExpandedMenuView r4 = r1.c
            if (r4 != 0) goto L_0x01b6
            android.view.LayoutInflater r4 = r1.a
            r5 = 2131034124(0x7f05000c, float:1.7678757E38)
            android.view.View r0 = r4.inflate(r5, r0, r3)
            android.support.v7.view.menu.ExpandedMenuView r0 = (android.support.v7.view.menu.ExpandedMenuView) r0
            r1.c = r0
            zc r0 = r1.f
            if (r0 != 0) goto L_0x01aa
            zc r0 = new zc
            r0.<init>(r1)
            r1.f = r0
        L_0x01aa:
            android.support.v7.view.menu.ExpandedMenuView r0 = r1.c
            zc r4 = r1.f
            r0.setAdapter(r4)
            android.support.v7.view.menu.ExpandedMenuView r0 = r1.c
            r0.setOnItemClickListener(r1)
        L_0x01b6:
            android.support.v7.view.menu.ExpandedMenuView r0 = r1.c
            goto L_0x0167
        L_0x01b9:
            r0 = r3
            goto L_0x00ce
        L_0x01bc:
            zb r0 = r11.i
            android.widget.ListAdapter r0 = r0.d()
            int r0 = r0.getCount()
            if (r0 <= 0) goto L_0x01cb
            r0 = r9
            goto L_0x00d9
        L_0x01cb:
            r0 = r3
            goto L_0x00d9
        L_0x01ce:
            android.view.View r0 = r11.g
            if (r0 == 0) goto L_0x01de
            android.view.View r0 = r11.g
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            if (r0 == 0) goto L_0x01de
            int r0 = r0.width
            if (r0 == r1) goto L_0x0118
        L_0x01de:
            r1 = r2
            goto L_0x0118
        L_0x01e1:
            r1 = r0
            goto L_0x00e9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wz.a(zx, android.view.KeyEvent):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean b(defpackage.zx r12, android.view.KeyEvent r13) {
        /*
            r11 = this;
            r10 = 2130772148(0x7f0100b4, float:1.7147406E38)
            r5 = 108(0x6c, float:1.51E-43)
            r1 = 0
            r3 = 1
            r4 = 0
            boolean r0 = r11.m
            if (r0 == 0) goto L_0x000d
        L_0x000c:
            return r4
        L_0x000d:
            boolean r0 = r12.k
            if (r0 == 0) goto L_0x0013
            r4 = r3
            goto L_0x000c
        L_0x0013:
            zx r0 = r11.G
            if (r0 == 0) goto L_0x0020
            zx r0 = r11.G
            if (r0 == r12) goto L_0x0020
            zx r0 = r11.G
            r11.a(r0, r4)
        L_0x0020:
            android.view.Window r0 = r11.c
            android.view.Window$Callback r7 = r0.getCallback()
            if (r7 == 0) goto L_0x0030
            int r0 = r12.a
            android.view.View r0 = r7.onCreatePanelView(r0)
            r12.g = r0
        L_0x0030:
            int r0 = r12.a
            if (r0 == 0) goto L_0x0038
            int r0 = r12.a
            if (r0 != r5) goto L_0x00ff
        L_0x0038:
            r6 = r3
        L_0x0039:
            if (r6 == 0) goto L_0x0044
            acq r0 = r11.n
            if (r0 == 0) goto L_0x0044
            acq r0 = r11.n
            r0.h()
        L_0x0044:
            android.view.View r0 = r12.g
            if (r0 != 0) goto L_0x0158
            if (r6 == 0) goto L_0x0050
            wa r0 = r11.f
            boolean r0 = r0 instanceof defpackage.xj
            if (r0 != 0) goto L_0x0158
        L_0x0050:
            ze r0 = r12.h
            if (r0 == 0) goto L_0x0058
            boolean r0 = r12.p
            if (r0 == 0) goto L_0x0109
        L_0x0058:
            ze r0 = r12.h
            if (r0 != 0) goto L_0x00c4
            android.content.Context r2 = r11.b
            int r0 = r12.a
            if (r0 == 0) goto L_0x0066
            int r0 = r12.a
            if (r0 != r5) goto L_0x0165
        L_0x0066:
            acq r0 = r11.n
            if (r0 == 0) goto L_0x0165
            android.util.TypedValue r5 = new android.util.TypedValue
            r5.<init>()
            android.content.res.Resources$Theme r8 = r2.getTheme()
            r0 = 2130772147(0x7f0100b3, float:1.7147404E38)
            r8.resolveAttribute(r0, r5, r3)
            int r0 = r5.resourceId
            if (r0 == 0) goto L_0x0102
            android.content.res.Resources r0 = r2.getResources()
            android.content.res.Resources$Theme r0 = r0.newTheme()
            r0.setTo(r8)
            int r9 = r5.resourceId
            r0.applyStyle(r9, r3)
            r0.resolveAttribute(r10, r5, r3)
        L_0x0090:
            int r9 = r5.resourceId
            if (r9 == 0) goto L_0x00a6
            if (r0 != 0) goto L_0x00a1
            android.content.res.Resources r0 = r2.getResources()
            android.content.res.Resources$Theme r0 = r0.newTheme()
            r0.setTo(r8)
        L_0x00a1:
            int r5 = r5.resourceId
            r0.applyStyle(r5, r3)
        L_0x00a6:
            r5 = r0
            if (r5 == 0) goto L_0x0165
            yf r0 = new yf
            r0.<init>(r2, r4)
            android.content.res.Resources$Theme r2 = r0.getTheme()
            r2.setTo(r5)
        L_0x00b5:
            ze r2 = new ze
            r2.<init>(r0)
            r2.a(r11)
            r12.a(r2)
            ze r0 = r12.h
            if (r0 == 0) goto L_0x000c
        L_0x00c4:
            if (r6 == 0) goto L_0x00de
            acq r0 = r11.n
            if (r0 == 0) goto L_0x00de
            xv r0 = r11.w
            if (r0 != 0) goto L_0x00d5
            xv r0 = new xv
            r0.<init>(r11)
            r11.w = r0
        L_0x00d5:
            acq r0 = r11.n
            ze r2 = r12.h
            xv r5 = r11.w
            r0.a(r2, r5)
        L_0x00de:
            ze r0 = r12.h
            r0.e()
            int r0 = r12.a
            ze r2 = r12.h
            boolean r0 = r7.onCreatePanelMenu(r0, r2)
            if (r0 != 0) goto L_0x0107
            r12.a(r1)
            if (r6 == 0) goto L_0x000c
            acq r0 = r11.n
            if (r0 == 0) goto L_0x000c
            acq r0 = r11.n
            xv r2 = r11.w
            r0.a(r1, r2)
            goto L_0x000c
        L_0x00ff:
            r6 = r4
            goto L_0x0039
        L_0x0102:
            r8.resolveAttribute(r10, r5, r3)
            r0 = r1
            goto L_0x0090
        L_0x0107:
            r12.p = r4
        L_0x0109:
            ze r0 = r12.h
            r0.e()
            android.os.Bundle r0 = r12.q
            if (r0 == 0) goto L_0x011b
            ze r0 = r12.h
            android.os.Bundle r2 = r12.q
            r0.b(r2)
            r12.q = r1
        L_0x011b:
            android.view.View r0 = r12.g
            ze r2 = r12.h
            boolean r0 = r7.onPreparePanel(r4, r0, r2)
            if (r0 != 0) goto L_0x0139
            if (r6 == 0) goto L_0x0132
            acq r0 = r11.n
            if (r0 == 0) goto L_0x0132
            acq r0 = r11.n
            xv r2 = r11.w
            r0.a(r1, r2)
        L_0x0132:
            ze r0 = r12.h
            r0.f()
            goto L_0x000c
        L_0x0139:
            if (r13 == 0) goto L_0x0161
            int r0 = r13.getDeviceId()
        L_0x013f:
            android.view.KeyCharacterMap r0 = android.view.KeyCharacterMap.load(r0)
            int r0 = r0.getKeyboardType()
            if (r0 == r3) goto L_0x0163
            r0 = r3
        L_0x014a:
            r12.n = r0
            ze r0 = r12.h
            boolean r1 = r12.n
            r0.setQwertyMode(r1)
            ze r0 = r12.h
            r0.f()
        L_0x0158:
            r12.k = r3
            r12.l = r4
            r11.G = r12
            r4 = r3
            goto L_0x000c
        L_0x0161:
            r0 = -1
            goto L_0x013f
        L_0x0163:
            r0 = r4
            goto L_0x014a
        L_0x0165:
            r0 = r2
            goto L_0x00b5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wz.b(zx, android.view.KeyEvent):boolean");
    }

    public final void b(defpackage.ze zeVar) {
        if (!this.E) {
            this.E = true;
            this.n.i();
            android.view.Window.Callback callback = this.c.getCallback();
            if (callback != null && !this.m) {
                callback.onPanelClosed(108, zeVar);
            }
            this.E = false;
        }
    }

    public final void a(defpackage.zx zxVar, boolean z2) {
        if (!z2 || zxVar.a != 0 || this.n == null || !this.n.d()) {
            android.view.WindowManager windowManager = (android.view.WindowManager) this.b.getSystemService("window");
            if (!(windowManager == null || !zxVar.m || zxVar.e == null)) {
                windowManager.removeView(zxVar.e);
                if (z2) {
                    a(zxVar.a, zxVar, (android.view.Menu) null);
                }
            }
            zxVar.k = false;
            zxVar.l = false;
            zxVar.m = false;
            zxVar.f = null;
            zxVar.o = true;
            if (this.G == zxVar) {
                this.G = null;
                return;
            }
            return;
        }
        b(zxVar.h);
    }

    public final void a(int i, defpackage.zx zxVar, android.view.Menu menu) {
        if (menu == null) {
            if (zxVar == null && i >= 0 && i < this.F.length) {
                zxVar = this.F[i];
            }
            if (zxVar != null) {
                menu = zxVar.h;
            }
        }
        if ((zxVar == null || zxVar.m) && !this.m) {
            this.d.onPanelClosed(i, menu);
        }
    }

    public final defpackage.zx a(android.view.Menu menu) {
        defpackage.zx[] zxVarArr = this.F;
        int i = zxVarArr != null ? zxVarArr.length : 0;
        for (int i2 = 0; i2 < i; i2++) {
            defpackage.zx zxVar = zxVarArr[i2];
            if (zxVar != null && zxVar.h == menu) {
                return zxVar;
            }
        }
        return null;
    }

    public final defpackage.zx g(int i) {
        defpackage.zx[] zxVarArr = this.F;
        if (zxVarArr == null || zxVarArr.length <= i) {
            defpackage.zx[] zxVarArr2 = new defpackage.zx[(i + 1)];
            if (zxVarArr != null) {
                java.lang.System.arraycopy(zxVarArr, 0, zxVarArr2, 0, zxVarArr.length);
            }
            this.F = zxVarArr2;
            zxVarArr = zxVarArr2;
        }
        defpackage.zx zxVar = zxVarArr[i];
        if (zxVar != null) {
            return zxVar;
        }
        defpackage.zx zxVar2 = new defpackage.zx(i);
        zxVarArr[i] = zxVar2;
        return zxVar2;
    }

    private final boolean a(defpackage.zx zxVar, int i, android.view.KeyEvent keyEvent) {
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((zxVar.k || b(zxVar, keyEvent)) && zxVar.h != null) {
            return zxVar.h.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    private final void f(int i) {
        this.u |= 1 << i;
        if (!this.t) {
            defpackage.sn.a(this.c.getDecorView(), this.I);
            this.t = true;
        }
    }

    /* access modifiers changed from: 0000 */
    public final void h(int i) {
        defpackage.zx g = g(i);
        if (g.h != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            g.h.a(bundle);
            if (bundle.size() > 0) {
                g.q = bundle;
            }
            g.h.e();
            g.h.clear();
        }
        g.p = true;
        g.o = true;
        if ((i == 108 || i == 0) && this.n != null) {
            defpackage.zx g2 = g(0);
            if (g2 != null) {
                g2.k = false;
                b(g2, (android.view.KeyEvent) null);
            }
        }
    }

    public final int i(int i) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = true;
        int i2 = 0;
        if (this.p == null || !(this.p.getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams)) {
            z2 = false;
        } else {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) this.p.getLayoutParams();
            if (this.p.isShown()) {
                if (this.K == null) {
                    this.K = new android.graphics.Rect();
                    this.L = new android.graphics.Rect();
                }
                android.graphics.Rect rect = this.K;
                android.graphics.Rect rect2 = this.L;
                rect.set(0, i, 0, 0);
                defpackage.ahr.a(this.z, rect, rect2);
                if (marginLayoutParams.topMargin != (rect2.top == 0 ? i : 0)) {
                    marginLayoutParams.topMargin = i;
                    if (this.B == null) {
                        this.B = new android.view.View(this.b);
                        this.B.setBackgroundColor(this.b.getResources().getColor(2131623936));
                        this.z.addView(this.B, -1, new android.view.ViewGroup.LayoutParams(-1, i));
                        z4 = true;
                    } else {
                        android.view.ViewGroup.LayoutParams layoutParams = this.B.getLayoutParams();
                        if (layoutParams.height != i) {
                            layoutParams.height = i;
                            this.B.setLayoutParams(layoutParams);
                        }
                        z4 = true;
                    }
                } else {
                    z4 = false;
                }
                if (this.B == null) {
                    z5 = false;
                }
                if (!this.i && z5) {
                    i = 0;
                }
                boolean z6 = z4;
                z3 = z5;
                z5 = z6;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z3 = false;
            } else {
                z5 = false;
                z3 = false;
            }
            if (z5) {
                this.p.setLayoutParams(marginLayoutParams);
            }
            z2 = z3;
        }
        if (this.B != null) {
            android.view.View view = this.B;
            if (!z2) {
                i2 = 8;
            }
            view.setVisibility(i2);
        }
        return i;
    }

    private final void r() {
        if (this.y) {
            throw new android.util.AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }
}
