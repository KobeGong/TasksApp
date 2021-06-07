package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatViewInflater;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ContentFrameLayout;
import android.support.v7.widget.ViewStubCompat;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.google.android.apps.tasks.R;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: wz  reason: default package */
/* compiled from: PG */
public class wz extends wp implements LayoutInflater.Factory2, zf {
    private static final boolean v = (Build.VERSION.SDK_INT < 21);
    private TextView A;
    private View B;
    private boolean C;
    private boolean D;
    private boolean E;
    private zx[] F;
    private zx G;
    private boolean H;
    private final Runnable I = new xa(this);
    private boolean J;
    private Rect K;
    private Rect L;
    private AppCompatViewInflater M;
    public acq n;
    public yc o;
    public ActionBarContextView p;
    public PopupWindow q;
    public Runnable r;
    public te s = null;
    public boolean t;
    public int u;
    private xv w;
    private afs x;
    private boolean y;
    private ViewGroup z;

    wz(Context context, Window window, wn wnVar) {
        super(context, window, wnVar);
    }

    @Override // defpackage.wo
    public void a(Bundle bundle) {
        if ((this.d instanceof Activity) && jd.b((Activity) this.d) != null) {
            wa waVar = this.f;
            if (waVar == null) {
                this.J = true;
            } else {
                waVar.b(true);
            }
        }
    }

    @Override // defpackage.wo
    public final void c() {
        q();
    }

    @Override // defpackage.wp
    public final void l() {
        q();
        if (this.g && this.f == null) {
            if (this.d instanceof Activity) {
                this.f = new xp((Activity) this.d, this.h);
            } else if (this.d instanceof Dialog) {
                this.f = new xp((Dialog) this.d);
            }
            if (this.f != null) {
                this.f.b(this.J);
            }
        }
    }

    @Override // defpackage.wo
    public final View a(int i) {
        q();
        return this.c.findViewById(i);
    }

    @Override // defpackage.wo
    public final void d() {
        wa a;
        if (this.g && this.y && (a = a()) != null) {
            a.f();
        }
        abl a2 = abl.a();
        Context context = this.b;
        synchronized (a2.a) {
            qx qxVar = (qx) a2.b.get(context);
            if (qxVar != null) {
                qxVar.c();
            }
        }
        k();
    }

    @Override // defpackage.wo, defpackage.wp
    public void f() {
        wa a = a();
        if (a != null) {
            a.c(false);
        }
    }

    @Override // defpackage.wo
    public final void g() {
        wa a = a();
        if (a != null) {
            a.c(true);
        }
    }

    @Override // defpackage.wo
    public final void a(View view) {
        q();
        ViewGroup viewGroup = (ViewGroup) this.z.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.d.onContentChanged();
    }

    @Override // defpackage.wo
    public final void b(int i) {
        q();
        ViewGroup viewGroup = (ViewGroup) this.z.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.b).inflate(i, viewGroup);
        this.d.onContentChanged();
    }

    @Override // defpackage.wo
    public final void a(View view, ViewGroup.LayoutParams layoutParams) {
        q();
        ViewGroup viewGroup = (ViewGroup) this.z.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.d.onContentChanged();
    }

    @Override // defpackage.wo
    public final void b(View view, ViewGroup.LayoutParams layoutParams) {
        q();
        ((ViewGroup) this.z.findViewById(16908290)).addView(view, layoutParams);
        this.d.onContentChanged();
    }

    @Override // defpackage.wo, defpackage.wp
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
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        CharSequence charSequence;
        Context context;
        if (!this.y) {
            TypedArray obtainStyledAttributes = this.b.obtainStyledAttributes(xu.aj);
            if (!obtainStyledAttributes.hasValue(xu.ao)) {
                obtainStyledAttributes.recycle();
                throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
            }
            if (obtainStyledAttributes.getBoolean(xu.ax, false)) {
                c(1);
            } else if (obtainStyledAttributes.getBoolean(xu.ao, false)) {
                c(108);
            }
            if (obtainStyledAttributes.getBoolean(xu.ap, false)) {
                c(109);
            }
            if (obtainStyledAttributes.getBoolean(xu.aq, false)) {
                c(10);
            }
            this.j = obtainStyledAttributes.getBoolean(xu.al, false);
            obtainStyledAttributes.recycle();
            this.c.getDecorView();
            LayoutInflater from = LayoutInflater.from(this.b);
            if (this.k) {
                if (this.i) {
                    viewGroup = (ViewGroup) from.inflate(R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null);
                } else {
                    viewGroup = (ViewGroup) from.inflate(R.layout.abc_screen_simple, (ViewGroup) null);
                }
                if (Build.VERSION.SDK_INT >= 21) {
                    sn.a(viewGroup, new xt(this));
                    viewGroup2 = viewGroup;
                } else {
                    ((adm) viewGroup).a(new adn(this));
                    viewGroup2 = viewGroup;
                }
            } else if (this.j) {
                this.h = false;
                this.g = false;
                viewGroup2 = (ViewGroup) from.inflate(R.layout.abc_dialog_title_material, (ViewGroup) null);
            } else if (this.g) {
                TypedValue typedValue = new TypedValue();
                this.b.getTheme().resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                if (typedValue.resourceId != 0) {
                    context = new yf(this.b, typedValue.resourceId);
                } else {
                    context = this.b;
                }
                ViewGroup viewGroup3 = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.abc_screen_toolbar, (ViewGroup) null);
                this.n = (acq) viewGroup3.findViewById(R.id.decor_content_parent);
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
                viewGroup2 = viewGroup3;
            } else {
                viewGroup2 = null;
            }
            if (viewGroup2 == null) {
                throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.g + ", windowActionBarOverlay: " + this.h + ", android:windowIsFloating: " + this.j + ", windowActionModeOverlay: " + this.i + ", windowNoTitle: " + this.k + " }");
            }
            if (this.n == null) {
                this.A = (TextView) viewGroup2.findViewById(R.id.title);
            }
            ahr.b(viewGroup2);
            ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup2.findViewById(R.id.action_bar_activity_content);
            ViewGroup viewGroup4 = (ViewGroup) this.c.findViewById(16908290);
            if (viewGroup4 != null) {
                while (viewGroup4.getChildCount() > 0) {
                    View childAt = viewGroup4.getChildAt(0);
                    viewGroup4.removeViewAt(0);
                    contentFrameLayout.addView(childAt);
                }
                viewGroup4.setId(-1);
                contentFrameLayout.setId(16908290);
                if (viewGroup4 instanceof FrameLayout) {
                    ((FrameLayout) viewGroup4).setForeground(null);
                }
            }
            this.c.setContentView(viewGroup2);
            contentFrameLayout.h = new acp(this);
            this.z = viewGroup2;
            if (this.d instanceof Activity) {
                charSequence = ((Activity) this.d).getTitle();
            } else {
                charSequence = this.l;
            }
            if (!TextUtils.isEmpty(charSequence)) {
                b(charSequence);
            }
            ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.z.findViewById(16908290);
            View decorView = this.c.getDecorView();
            contentFrameLayout2.g.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
            if (sn.a.r(contentFrameLayout2)) {
                contentFrameLayout2.requestLayout();
            }
            TypedArray obtainStyledAttributes2 = this.b.obtainStyledAttributes(xu.aj);
            int i = xu.av;
            if (contentFrameLayout2.a == null) {
                contentFrameLayout2.a = new TypedValue();
            }
            obtainStyledAttributes2.getValue(i, contentFrameLayout2.a);
            int i2 = xu.aw;
            if (contentFrameLayout2.b == null) {
                contentFrameLayout2.b = new TypedValue();
            }
            obtainStyledAttributes2.getValue(i2, contentFrameLayout2.b);
            if (obtainStyledAttributes2.hasValue(xu.at)) {
                int i3 = xu.at;
                if (contentFrameLayout2.c == null) {
                    contentFrameLayout2.c = new TypedValue();
                }
                obtainStyledAttributes2.getValue(i3, contentFrameLayout2.c);
            }
            if (obtainStyledAttributes2.hasValue(xu.au)) {
                int i4 = xu.au;
                if (contentFrameLayout2.d == null) {
                    contentFrameLayout2.d = new TypedValue();
                }
                obtainStyledAttributes2.getValue(i4, contentFrameLayout2.d);
            }
            if (obtainStyledAttributes2.hasValue(xu.ar)) {
                int i5 = xu.ar;
                if (contentFrameLayout2.e == null) {
                    contentFrameLayout2.e = new TypedValue();
                }
                obtainStyledAttributes2.getValue(i5, contentFrameLayout2.e);
            }
            if (obtainStyledAttributes2.hasValue(xu.as)) {
                int i6 = xu.as;
                if (contentFrameLayout2.f == null) {
                    contentFrameLayout2.f = new TypedValue();
                }
                obtainStyledAttributes2.getValue(i6, contentFrameLayout2.f);
            }
            obtainStyledAttributes2.recycle();
            contentFrameLayout2.requestLayout();
            this.y = true;
            zx g = g(0);
            if (this.m) {
                return;
            }
            if (g == null || g.h == null) {
                f(108);
            }
        }
    }

    @Override // defpackage.wo
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

    /* access modifiers changed from: package-private */
    @Override // defpackage.wp
    public final void b(CharSequence charSequence) {
        if (this.n != null) {
            this.n.a(charSequence);
        } else if (this.f != null) {
            this.f.b(charSequence);
        } else if (this.A != null) {
            this.A.setText(charSequence);
        }
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.wp
    public final void d(int i) {
        if (i == 108) {
            wa a = a();
            if (a != null) {
                a.d(false);
            }
        } else if (i == 0) {
            zx g = g(i);
            if (g.m) {
                a(g, false);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.wp
    public final boolean e(int i) {
        if (i != 108) {
            return false;
        }
        wa a = a();
        if (a == null) {
            return true;
        }
        a.d(true);
        return true;
    }

    @Override // defpackage.zf
    public final boolean a(ze zeVar, MenuItem menuItem) {
        zx a;
        Window.Callback callback = this.c.getCallback();
        if (callback == null || this.m || (a = a((Menu) zeVar.l())) == null) {
            return false;
        }
        return callback.onMenuItemSelected(a.a, menuItem);
    }

    @Override // defpackage.zf
    public final void a(ze zeVar) {
        if (this.n == null || !this.n.c() || (ViewConfiguration.get(this.b).hasPermanentMenuKey() && !this.n.e())) {
            zx g = g(0);
            g.o = true;
            a(g, false);
            a(g, (KeyEvent) null);
            return;
        }
        Window.Callback callback = this.c.getCallback();
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
            zx g2 = g(0);
            if (g2.h != null && !g2.p && callback.onPreparePanel(0, g2.g, g2.h)) {
                callback.onMenuOpened(108, g2.h);
                this.n.f();
            }
        }
    }

    @Override // defpackage.wo
    public final void h() {
        wa a = a();
        if (a != null) {
            a.i();
        }
        f(0);
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.wp
    public final yc a(yd ydVar) {
        Context context;
        p();
        if (this.o != null) {
            this.o.c();
        }
        if (this.e != null && !this.m) {
            try {
                this.e.f();
            } catch (AbstractMethodError e) {
            }
        }
        if (this.p == null) {
            if (this.j) {
                TypedValue typedValue = new TypedValue();
                Resources.Theme theme = this.b.getTheme();
                theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                if (typedValue.resourceId != 0) {
                    Resources.Theme newTheme = this.b.getResources().newTheme();
                    newTheme.setTo(theme);
                    newTheme.applyStyle(typedValue.resourceId, true);
                    context = new yf(this.b, 0);
                    context.getTheme().setTo(newTheme);
                } else {
                    context = this.b;
                }
                this.p = new ActionBarContextView(context);
                this.q = new PopupWindow(context, (AttributeSet) null, (int) R.attr.actionModePopupWindowStyle);
                vb.a(this.q, 2);
                this.q.setContentView(this.p);
                this.q.setWidth(-1);
                context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                this.p.d = TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
                this.q.setHeight(-2);
                this.r = new xb(this);
            } else {
                ViewStubCompat viewStubCompat = (ViewStubCompat) this.z.findViewById(R.id.action_mode_bar_stub);
                if (viewStubCompat != null) {
                    viewStubCompat.a = LayoutInflater.from(m());
                    this.p = (ActionBarContextView) viewStubCompat.a();
                }
            }
        }
        if (this.p != null) {
            p();
            this.p.b();
            yg ygVar = new yg(this.p.getContext(), this.p, ydVar);
            if (ydVar.a(ygVar, ygVar.b())) {
                ygVar.d();
                this.p.a(ygVar);
                this.o = ygVar;
                if (o()) {
                    this.p.setAlpha(0.0f);
                    this.s = sn.b(this.p).a(1.0f);
                    this.s.a(new xd(this));
                } else {
                    this.p.setAlpha(1.0f);
                    this.p.setVisibility(0);
                    this.p.sendAccessibilityEvent(32);
                    if (this.p.getParent() instanceof View) {
                        sn.a.g((View) this.p.getParent());
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

    /* access modifiers changed from: package-private */
    public final boolean o() {
        if (this.y && this.z != null) {
            if (sn.a.r(this.z)) {
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

    /* access modifiers changed from: package-private */
    @Override // defpackage.wp
    public final boolean a(int i, KeyEvent keyEvent) {
        wa a = a();
        if (a != null && a.a(i, keyEvent)) {
            return true;
        }
        if (this.G == null || !a(this.G, keyEvent.getKeyCode(), keyEvent)) {
            if (this.G == null) {
                zx g = g(0);
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

    /* access modifiers changed from: package-private */
    @Override // defpackage.wp
    public final boolean a(KeyEvent keyEvent) {
        boolean z2;
        boolean z3;
        boolean z4;
        if (keyEvent.getKeyCode() == 82 && this.d.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() == 0) {
            switch (keyCode) {
                case 82:
                    if (keyEvent.getRepeatCount() != 0) {
                        return true;
                    }
                    zx g = g(0);
                    if (g.m) {
                        return true;
                    }
                    b(g, keyEvent);
                    return true;
                case 4:
                    this.H = (keyEvent.getFlags() & 128) != 0;
                    break;
            }
            return false;
        }
        switch (keyCode) {
            case 82:
                if (this.o != null) {
                    return true;
                }
                zx g2 = g(0);
                if (this.n == null || !this.n.c() || ViewConfiguration.get(this.b).hasPermanentMenuKey()) {
                    if (g2.m || g2.l) {
                        z3 = g2.m;
                        a(g2, true);
                    } else {
                        if (g2.k) {
                            if (g2.p) {
                                g2.k = false;
                                z4 = b(g2, keyEvent);
                            } else {
                                z4 = true;
                            }
                            if (z4) {
                                a(g2, keyEvent);
                                z3 = true;
                            }
                        }
                        z3 = false;
                    }
                } else if (!this.n.d()) {
                    if (!this.m && b(g2, keyEvent)) {
                        z3 = this.n.f();
                    }
                    z3 = false;
                } else {
                    z3 = this.n.g();
                }
                if (!z3) {
                    return true;
                }
                AudioManager audioManager = (AudioManager) this.b.getSystemService("audio");
                if (audioManager != null) {
                    audioManager.playSoundEffect(0);
                    return true;
                }
                Log.w("AppCompatDelegate", "Couldn't get audio manager");
                return true;
            case 4:
                boolean z5 = this.H;
                this.H = false;
                zx g3 = g(0);
                if (g3 == null || !g3.m) {
                    if (this.o != null) {
                        this.o.c();
                        z2 = true;
                    } else {
                        wa a = a();
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
                    a(g3, true);
                    return true;
                }
                break;
        }
        return false;
    }

    private final View a(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z2;
        boolean z3;
        if (this.M == null) {
            String string = this.b.obtainStyledAttributes(xu.aj).getString(xu.an);
            if (string == null || AppCompatViewInflater.class.getName().equals(string)) {
                this.M = new AppCompatViewInflater();
            } else {
                try {
                    this.M = (AppCompatViewInflater) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    new StringBuilder("Failed to instantiate custom view inflater ").append(string).append(". Falling back to default.");
                    this.M = new AppCompatViewInflater();
                }
            }
        }
        if (v) {
            if (!(attributeSet instanceof XmlPullParser)) {
                ViewParent viewParent = (ViewParent) view;
                if (viewParent == null) {
                    z3 = false;
                } else {
                    View decorView = this.c.getDecorView();
                    ViewParent viewParent2 = viewParent;
                    while (true) {
                        if (viewParent2 != null) {
                            if (viewParent2 == decorView || !(viewParent2 instanceof View)) {
                                break;
                            }
                            if (sn.a.s((View) viewParent2)) {
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
            } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
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

    @Override // defpackage.wo
    public final void j() {
        LayoutInflater from = LayoutInflater.from(this.b);
        if (from.getFactory() == null) {
            rz.b(from, this);
        } else {
            from.getFactory2();
        }
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View a = a(str, context, attributeSet);
        return a != null ? a : a(view, str, context, attributeSet);
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    /* access modifiers changed from: package-private */
    public View a(String str, Context context, AttributeSet attributeSet) {
        View onCreateView;
        if (!(this.d instanceof LayoutInflater.Factory) || (onCreateView = ((LayoutInflater.Factory) this.d).onCreateView(str, context, attributeSet)) == null) {
            return null;
        }
        return onCreateView;
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00db  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(defpackage.zx r11, android.view.KeyEvent r12) {
        /*
        // Method dump skipped, instructions count: 484
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wz.a(zx, android.view.KeyEvent):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean b(defpackage.zx r12, android.view.KeyEvent r13) {
        /*
        // Method dump skipped, instructions count: 360
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wz.b(zx, android.view.KeyEvent):boolean");
    }

    public final void b(ze zeVar) {
        if (!this.E) {
            this.E = true;
            this.n.i();
            Window.Callback callback = this.c.getCallback();
            if (callback != null && !this.m) {
                callback.onPanelClosed(108, zeVar);
            }
            this.E = false;
        }
    }

    public final void a(zx zxVar, boolean z2) {
        if (!z2 || zxVar.a != 0 || this.n == null || !this.n.d()) {
            WindowManager windowManager = (WindowManager) this.b.getSystemService("window");
            if (!(windowManager == null || !zxVar.m || zxVar.e == null)) {
                windowManager.removeView(zxVar.e);
                if (z2) {
                    a(zxVar.a, zxVar, (Menu) null);
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

    public final void a(int i, zx zxVar, Menu menu) {
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

    public final zx a(Menu menu) {
        zx[] zxVarArr = this.F;
        int length = zxVarArr != null ? zxVarArr.length : 0;
        for (int i = 0; i < length; i++) {
            zx zxVar = zxVarArr[i];
            if (zxVar != null && zxVar.h == menu) {
                return zxVar;
            }
        }
        return null;
    }

    public final zx g(int i) {
        zx[] zxVarArr = this.F;
        if (zxVarArr == null || zxVarArr.length <= i) {
            zx[] zxVarArr2 = new zx[(i + 1)];
            if (zxVarArr != null) {
                System.arraycopy(zxVarArr, 0, zxVarArr2, 0, zxVarArr.length);
            }
            this.F = zxVarArr2;
            zxVarArr = zxVarArr2;
        }
        zx zxVar = zxVarArr[i];
        if (zxVar != null) {
            return zxVar;
        }
        zx zxVar2 = new zx(i);
        zxVarArr[i] = zxVar2;
        return zxVar2;
    }

    private final boolean a(zx zxVar, int i, KeyEvent keyEvent) {
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
            sn.a(this.c.getDecorView(), this.I);
            this.t = true;
        }
    }

    /* access modifiers changed from: package-private */
    public final void h(int i) {
        zx g;
        zx g2 = g(i);
        if (g2.h != null) {
            Bundle bundle = new Bundle();
            g2.h.a(bundle);
            if (bundle.size() > 0) {
                g2.q = bundle;
            }
            g2.h.e();
            g2.h.clear();
        }
        g2.p = true;
        g2.o = true;
        if ((i == 108 || i == 0) && this.n != null && (g = g(0)) != null) {
            g.k = false;
            b(g, (KeyEvent) null);
        }
    }

    public final int i(int i) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = true;
        int i2 = 0;
        if (this.p == null || !(this.p.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z2 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.p.getLayoutParams();
            if (this.p.isShown()) {
                if (this.K == null) {
                    this.K = new Rect();
                    this.L = new Rect();
                }
                Rect rect = this.K;
                Rect rect2 = this.L;
                rect.set(0, i, 0, 0);
                ahr.a(this.z, rect, rect2);
                if (marginLayoutParams.topMargin != (rect2.top == 0 ? i : 0)) {
                    marginLayoutParams.topMargin = i;
                    if (this.B == null) {
                        this.B = new View(this.b);
                        this.B.setBackgroundColor(this.b.getResources().getColor(R.color.abc_input_method_navigation_guard));
                        this.z.addView(this.B, -1, new ViewGroup.LayoutParams(-1, i));
                        z4 = true;
                    } else {
                        ViewGroup.LayoutParams layoutParams = this.B.getLayoutParams();
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
                z3 = z5;
                z5 = z4;
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
            View view = this.B;
            if (!z2) {
                i2 = 8;
            }
            view.setVisibility(i2);
        }
        return i;
    }

    private final void r() {
        if (this.y) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }
}
