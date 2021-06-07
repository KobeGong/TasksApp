package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.ActionBarContainer;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ActionBarOverlayLayout;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import com.google.android.apps.tasks.R;
import java.util.ArrayList;

/* renamed from: xp  reason: default package */
/* compiled from: PG */
public final class xp extends wa implements aan {
    private static final Interpolator o = new AccelerateInterpolator();
    private static final Interpolator p = new DecelerateInterpolator();
    private final th A = new xr(this);
    private final tj B = new tj(this);
    public Context a;
    public ActionBarOverlayLayout b;
    public ActionBarContainer c;
    public acr d;
    public ActionBarContextView e;
    public View f;
    public xs g;
    public yc h;
    public yd i;
    public boolean j = true;
    public boolean k;
    public boolean l;
    public ym m;
    public boolean n;
    private Context q;
    private boolean r;
    private boolean s;
    private ArrayList t = new ArrayList();
    private boolean u;
    private int v = 0;
    private boolean w;
    private boolean x = true;
    private boolean y;
    private final th z = new xq(this);

    public xp(Activity activity, boolean z2) {
        new ArrayList();
        View decorView = activity.getWindow().getDecorView();
        a(decorView);
        if (!z2) {
            this.f = decorView.findViewById(16908290);
        }
    }

    public xp(Dialog dialog) {
        new ArrayList();
        a(dialog.getWindow().getDecorView());
    }

    private final void a(View view) {
        acr m2;
        this.b = (ActionBarOverlayLayout) view.findViewById(R.id.decor_content_parent);
        if (this.b != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = this.b;
            actionBarOverlayLayout.g = this;
            if (actionBarOverlayLayout.getWindowToken() != null) {
                actionBarOverlayLayout.g.a(actionBarOverlayLayout.a);
                if (actionBarOverlayLayout.f != 0) {
                    actionBarOverlayLayout.onWindowSystemUiVisibilityChanged(actionBarOverlayLayout.f);
                    sn.a.g(actionBarOverlayLayout);
                }
            }
        }
        View findViewById = view.findViewById(R.id.action_bar);
        if (findViewById instanceof acr) {
            m2 = (acr) findViewById;
        } else if (findViewById instanceof Toolbar) {
            m2 = ((Toolbar) findViewById).m();
        } else {
            throw new IllegalStateException("Can't make a decor toolbar out of " + (findViewById != null ? findViewById.getClass().getSimpleName() : "null"));
        }
        this.d = m2;
        this.e = (ActionBarContextView) view.findViewById(R.id.action_context_bar);
        this.c = (ActionBarContainer) view.findViewById(R.id.action_bar_container);
        if (this.d == null || this.e == null || this.c == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.a = this.d.a.getContext();
        if ((this.d.b & 4) != 0) {
            this.r = true;
        }
        yb a2 = yb.a(this.a);
        int i2 = a2.a.getApplicationInfo().targetSdkVersion;
        g(a2.b());
        TypedArray obtainStyledAttributes = this.a.obtainStyledAttributes(null, xu.a, R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(xu.m, false)) {
            e();
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(xu.k, 0);
        if (dimensionPixelSize != 0) {
            a((float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    @Override // defpackage.wa
    public final void a(float f2) {
        sn.a(this.c, f2);
    }

    @Override // defpackage.wa
    public final void f() {
        g(yb.a(this.a).b());
    }

    private final void g(boolean z2) {
        this.u = z2;
        if (!this.u) {
            this.d.c = null;
            this.c.a = null;
        } else {
            this.c.a = null;
            this.d.c = null;
        }
        Toolbar toolbar = this.d.a;
        toolbar.D = false;
        toolbar.requestLayout();
        this.b.d = false;
    }

    @Override // defpackage.aan
    public final void a(int i2) {
        this.v = i2;
    }

    @Override // defpackage.wa
    public final void c(boolean z2) {
        this.y = z2;
        if (!z2 && this.m != null) {
            this.m.b();
        }
    }

    @Override // defpackage.wa
    public final void d(boolean z2) {
        if (z2 != this.s) {
            this.s = z2;
            int size = this.t.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((wc) this.t.get(i2)).a();
            }
        }
    }

    @Override // defpackage.wa
    public final void b() {
        a(2, 2);
    }

    @Override // defpackage.wa
    public final void a(boolean z2) {
        a(z2 ? 4 : 0, 4);
    }

    @Override // defpackage.wa
    public final void a(CharSequence charSequence) {
        this.d.b(charSequence);
    }

    @Override // defpackage.wa
    public final void b(CharSequence charSequence) {
        this.d.a(charSequence);
    }

    private final void a(int i2, int i3) {
        int i4 = this.d.b;
        if ((i3 & 4) != 0) {
            this.r = true;
        }
        this.d.a((i4 & (i3 ^ -1)) | (i2 & i3));
    }

    @Override // defpackage.wa
    public final int c() {
        return this.d.b;
    }

    @Override // defpackage.wa
    public final yc a(yd ydVar) {
        if (this.g != null) {
            this.g.c();
        }
        this.b.a(false);
        this.e.b();
        xs xsVar = new xs(this, this.e.getContext(), ydVar);
        if (!xsVar.e()) {
            return null;
        }
        this.g = xsVar;
        xsVar.d();
        this.e.a(xsVar);
        f(true);
        this.e.sendAccessibilityEvent(32);
        return xsVar;
    }

    @Override // defpackage.aan
    public final void e(boolean z2) {
        this.j = z2;
    }

    @Override // defpackage.aan
    public final void m() {
        if (this.l) {
            this.l = false;
            h(true);
        }
    }

    @Override // defpackage.aan
    public final void n() {
        if (!this.l) {
            this.l = true;
            h(true);
        }
    }

    @Override // defpackage.wa
    public final void e() {
        if (!this.b.c) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.n = true;
        this.b.a(true);
    }

    static boolean a(boolean z2, boolean z3, boolean z4) {
        if (z4) {
            return true;
        }
        if (z2 || z3) {
            return false;
        }
        return true;
    }

    private final void h(boolean z2) {
        if (a(false, this.l, this.w)) {
            if (!this.x) {
                this.x = true;
                if (this.m != null) {
                    this.m.b();
                }
                this.c.setVisibility(0);
                if (this.v != 0 || (!this.y && !z2)) {
                    this.c.setAlpha(1.0f);
                    this.c.setTranslationY(0.0f);
                    if (this.j && this.f != null) {
                        this.f.setTranslationY(0.0f);
                    }
                    this.A.b();
                } else {
                    this.c.setTranslationY(0.0f);
                    float f2 = (float) (-this.c.getHeight());
                    if (z2) {
                        int[] iArr = {0, 0};
                        this.c.getLocationInWindow(iArr);
                        f2 -= (float) iArr[1];
                    }
                    this.c.setTranslationY(f2);
                    ym ymVar = new ym();
                    te b2 = sn.b(this.c).b(0.0f);
                    b2.a(this.B);
                    ymVar.a(b2);
                    if (this.j && this.f != null) {
                        this.f.setTranslationY(f2);
                        ymVar.a(sn.b(this.f).b(0.0f));
                    }
                    ymVar.a(p);
                    ymVar.c();
                    ymVar.a(this.A);
                    this.m = ymVar;
                    ymVar.a();
                }
                if (this.b != null) {
                    sn.a.g(this.b);
                }
            }
        } else if (this.x) {
            this.x = false;
            if (this.m != null) {
                this.m.b();
            }
            if (this.v != 0 || (!this.y && !z2)) {
                this.z.b();
                return;
            }
            this.c.setAlpha(1.0f);
            this.c.a(true);
            ym ymVar2 = new ym();
            float f3 = (float) (-this.c.getHeight());
            if (z2) {
                int[] iArr2 = {0, 0};
                this.c.getLocationInWindow(iArr2);
                f3 -= (float) iArr2[1];
            }
            te b3 = sn.b(this.c).b(f3);
            b3.a(this.B);
            ymVar2.a(b3);
            if (this.j && this.f != null) {
                ymVar2.a(sn.b(this.f).b(f3));
            }
            ymVar2.a(o);
            ymVar2.c();
            ymVar2.a(this.z);
            this.m = ymVar2;
            ymVar2.a();
        }
    }

    public final void f(boolean z2) {
        te a2;
        te a3;
        long j2;
        if (z2) {
            if (!this.w) {
                this.w = true;
                if (this.b != null) {
                    ActionBarOverlayLayout.a();
                }
                h(false);
            }
        } else if (this.w) {
            this.w = false;
            if (this.b != null) {
                ActionBarOverlayLayout.a();
            }
            h(false);
        }
        if (sn.a.r(this.c)) {
            if (z2) {
                a3 = this.d.a(4, 100);
                a2 = this.e.a(0, 200);
            } else {
                a2 = this.d.a(0, 200);
                a3 = this.e.a(8, 100);
            }
            ym ymVar = new ym();
            ymVar.a.add(a3);
            View view = (View) a3.a.get();
            if (view != null) {
                j2 = view.animate().getDuration();
            } else {
                j2 = 0;
            }
            View view2 = (View) a2.a.get();
            if (view2 != null) {
                view2.animate().setStartDelay(j2);
            }
            ymVar.a.add(a2);
            ymVar.a();
        } else if (z2) {
            this.d.b(4);
            this.e.setVisibility(0);
        } else {
            this.d.b(0);
            this.e.setVisibility(8);
        }
    }

    @Override // defpackage.wa
    public final Context d() {
        if (this.q == null) {
            TypedValue typedValue = new TypedValue();
            this.a.getTheme().resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                this.q = new ContextThemeWrapper(this.a, i2);
            } else {
                this.q = this.a;
            }
        }
        return this.q;
    }

    @Override // defpackage.aan
    public final void o() {
        if (this.m != null) {
            this.m.b();
            this.m = null;
        }
    }

    @Override // defpackage.wa
    public final boolean k() {
        if (this.d != null) {
            Toolbar toolbar = this.d.a;
            if ((toolbar.C == null || toolbar.C.a == null) ? false : true) {
                this.d.a.h();
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.wa
    public final void a() {
        this.d.a((Drawable) null);
    }

    @Override // defpackage.wa
    public final void b(boolean z2) {
        if (!this.r) {
            a(z2);
        }
    }

    @Override // defpackage.wa
    public final boolean a(int i2, KeyEvent keyEvent) {
        Menu b2;
        boolean z2;
        if (this.g == null || (b2 = this.g.b()) == null) {
            return false;
        }
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        b2.setQwertyMode(z2);
        return b2.performShortcut(i2, keyEvent, 0);
    }
}
