package defpackage;

/* renamed from: aaa reason: default package */
/* compiled from: PG */
final class aaa extends defpackage.zq implements android.view.View.OnKeyListener, android.widget.AdapterView.OnItemClickListener, android.widget.PopupWindow.OnDismissListener, defpackage.zt {
    public final defpackage.ael a;
    public final android.view.ViewTreeObserver.OnGlobalLayoutListener b = new defpackage.aab(this);
    public android.view.View c;
    public android.view.ViewTreeObserver d;
    private final android.content.Context e;
    private final defpackage.ze f;
    private final defpackage.zd h;
    private final boolean i;
    private final int j;
    private final int k;
    private final int l;
    private final android.view.View.OnAttachStateChangeListener m = new defpackage.aac(this);
    private android.widget.PopupWindow.OnDismissListener n;
    private android.view.View o;
    private defpackage.zu p;
    private boolean q;
    private boolean r;
    private int s;
    private int t = 0;
    private boolean u;

    public aaa(android.content.Context context, defpackage.ze zeVar, android.view.View view, int i2, int i3, boolean z) {
        this.e = context;
        this.f = zeVar;
        this.i = z;
        this.h = new defpackage.zd(zeVar, android.view.LayoutInflater.from(context), this.i);
        this.k = i2;
        this.l = i3;
        android.content.res.Resources resources = context.getResources();
        this.j = java.lang.Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(2131689495));
        this.o = view;
        this.a = new defpackage.ael(this.e, this.k, this.l);
        zeVar.a((defpackage.zt) this, context);
    }

    public final void b(boolean z) {
        this.h.b = z;
    }

    public final void a(int i2) {
        this.t = i2;
    }

    public final void d() {
        boolean z = true;
        if (!f()) {
            if (this.q || this.o == null) {
                z = false;
            } else {
                this.c = this.o;
                this.a.a((android.widget.PopupWindow.OnDismissListener) this);
                this.a.m = this;
                this.a.b();
                android.view.View view = this.c;
                boolean z2 = this.d == null;
                this.d = view.getViewTreeObserver();
                if (z2) {
                    this.d.addOnGlobalLayoutListener(this.b);
                }
                view.addOnAttachStateChangeListener(this.m);
                this.a.l = view;
                this.a.j = this.t;
                if (!this.r) {
                    this.s = a(this.h, null, this.e, this.j);
                    this.r = true;
                }
                this.a.b(this.s);
                this.a.h();
                this.a.p = this.g;
                this.a.d();
                defpackage.ade ade = this.a.e;
                ade.setOnKeyListener(this);
                if (this.u && this.f.f != null) {
                    android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) android.view.LayoutInflater.from(this.e).inflate(2131034129, ade, false);
                    android.widget.TextView textView = (android.widget.TextView) frameLayout.findViewById(16908310);
                    if (textView != null) {
                        textView.setText(this.f.f);
                    }
                    frameLayout.setEnabled(false);
                    ade.addHeaderView(frameLayout, null, false);
                }
                this.a.a((android.widget.ListAdapter) this.h);
                this.a.d();
            }
        }
        if (!z) {
            throw new java.lang.IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    public final void e() {
        if (f()) {
            this.a.e();
        }
    }

    public final void a(defpackage.ze zeVar) {
    }

    public final boolean f() {
        return !this.q && this.a.r.isShowing();
    }

    public final void onDismiss() {
        this.q = true;
        this.f.close();
        if (this.d != null) {
            if (!this.d.isAlive()) {
                this.d = this.c.getViewTreeObserver();
            }
            this.d.removeGlobalOnLayoutListener(this.b);
            this.d = null;
        }
        this.c.removeOnAttachStateChangeListener(this.m);
        if (this.n != null) {
            this.n.onDismiss();
        }
    }

    public final void a(boolean z) {
        this.r = false;
        if (this.h != null) {
            this.h.notifyDataSetChanged();
        }
    }

    public final void a(defpackage.zu zuVar) {
        this.p = zuVar;
    }

    public final boolean a(defpackage.aad aad) {
        boolean z;
        if (aad.hasVisibleItems()) {
            defpackage.zr zrVar = new defpackage.zr(this.e, aad, this.c, this.i, this.k, this.l);
            zrVar.a(this.p);
            zrVar.a(defpackage.zq.b((defpackage.ze) aad));
            zrVar.c = this.n;
            this.n = null;
            this.f.b(false);
            int i2 = this.a.g;
            int c2 = this.a.c();
            if ((android.view.Gravity.getAbsoluteGravity(this.t, defpackage.sn.a.j(this.o)) & 7) == 5) {
                i2 += this.o.getWidth();
            }
            if (zrVar.e()) {
                z = true;
            } else if (zrVar.a == null) {
                z = false;
            } else {
                zrVar.a(i2, c2, true, true);
                z = true;
            }
            if (z) {
                if (this.p != null) {
                    this.p.a(aad);
                }
                return true;
            }
        }
        return false;
    }

    public final void a(defpackage.ze zeVar, boolean z) {
        if (zeVar == this.f) {
            e();
            if (this.p != null) {
                this.p.a(zeVar, z);
            }
        }
    }

    public final boolean a() {
        return false;
    }

    public final android.os.Parcelable c() {
        return null;
    }

    public final void a(android.os.Parcelable parcelable) {
    }

    public final void a(android.view.View view) {
        this.o = view;
    }

    public final boolean onKey(android.view.View view, int i2, android.view.KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i2 != 82) {
            return false;
        }
        e();
        return true;
    }

    public final void a(android.widget.PopupWindow.OnDismissListener onDismissListener) {
        this.n = onDismissListener;
    }

    public final android.widget.ListView g() {
        return this.a.e;
    }

    public final void b(int i2) {
        this.a.g = i2;
    }

    public final void c(int i2) {
        this.a.a(i2);
    }

    public final void c(boolean z) {
        this.u = z;
    }
}
