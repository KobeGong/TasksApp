package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.google.android.apps.tasks.R;

/* renamed from: acr  reason: default package */
/* compiled from: PG */
public final class acr {
    public Toolbar a;
    public int b;
    public View c;
    public CharSequence d;
    public Window.Callback e;
    public boolean f;
    public aap g;
    private View h;
    private Drawable i;
    private Drawable j;
    private Drawable k;
    private boolean l;
    private CharSequence m;
    private CharSequence n;
    private int o;
    private Drawable p;

    public final void a(CharSequence charSequence) {
        if (!this.l) {
            c(charSequence);
        }
    }

    public final void b(CharSequence charSequence) {
        this.l = true;
        c(charSequence);
    }

    public final void a(Drawable drawable) {
        this.j = drawable;
        b();
    }

    public final void a() {
        Toolbar toolbar = this.a;
        if (toolbar.g != null) {
            toolbar.g.c();
        }
    }

    public final void a(int i2) {
        int i3 = this.b ^ i2;
        this.b = i2;
        if (i3 != 0) {
            if ((i3 & 4) != 0) {
                if ((i2 & 4) != 0) {
                    d();
                }
                c();
            }
            if ((i3 & 3) != 0) {
                b();
            }
            if ((i3 & 8) != 0) {
                if ((i2 & 8) != 0) {
                    this.a.a(this.d);
                    this.a.b(this.m);
                } else {
                    this.a.a((CharSequence) null);
                    this.a.b((CharSequence) null);
                }
            }
            if ((i3 & 16) != 0 && this.h != null) {
                if ((i2 & 16) != 0) {
                    this.a.addView(this.h);
                } else {
                    this.a.removeView(this.h);
                }
            }
        }
    }

    public final te a(int i2, long j2) {
        return sn.b(this.a).a(i2 == 0 ? 1.0f : 0.0f).a(j2).a(new ahf(this, i2));
    }

    public final void b(int i2) {
        this.a.setVisibility(i2);
    }

    public acr(Toolbar toolbar) {
        this(toolbar, (byte) 0);
    }

    private acr(Toolbar toolbar, byte b2) {
        String string;
        this.o = 0;
        this.a = toolbar;
        this.d = toolbar.x;
        this.m = toolbar.y;
        this.l = this.d != null;
        this.k = toolbar.j();
        agw a2 = agw.a(toolbar.getContext(), null, xu.a, R.attr.actionBarStyle, 0);
        this.p = a2.a(xu.n);
        CharSequence c2 = a2.c(xu.t);
        if (!TextUtils.isEmpty(c2)) {
            b(c2);
        }
        CharSequence c3 = a2.c(xu.r);
        if (!TextUtils.isEmpty(c3)) {
            this.m = c3;
            if ((this.b & 8) != 0) {
                this.a.b(c3);
            }
        }
        Drawable a3 = a2.a(xu.p);
        if (a3 != null) {
            a(a3);
        }
        Drawable a4 = a2.a(xu.o);
        if (a4 != null) {
            this.i = a4;
            b();
        }
        if (this.k == null && this.p != null) {
            this.k = this.p;
            c();
        }
        a(a2.a(xu.j, 0));
        int g2 = a2.g(xu.i, 0);
        if (g2 != 0) {
            View inflate = LayoutInflater.from(this.a.getContext()).inflate(g2, (ViewGroup) this.a, false);
            if (!(this.h == null || (this.b & 16) == 0)) {
                this.a.removeView(this.h);
            }
            this.h = inflate;
            if (!(inflate == null || (this.b & 16) == 0)) {
                this.a.addView(this.h);
            }
            a(this.b | 16);
        }
        int f2 = a2.f(xu.l, 0);
        if (f2 > 0) {
            ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
            layoutParams.height = f2;
            this.a.setLayoutParams(layoutParams);
        }
        int d2 = a2.d(xu.h, -1);
        int d3 = a2.d(xu.g, -1);
        if (d2 >= 0 || d3 >= 0) {
            Toolbar toolbar2 = this.a;
            int max = Math.max(d2, 0);
            int max2 = Math.max(d3, 0);
            toolbar2.n();
            toolbar2.w.a(max, max2);
        }
        int g3 = a2.g(xu.u, 0);
        if (g3 != 0) {
            Toolbar toolbar3 = this.a;
            Context context = this.a.getContext();
            toolbar3.p = g3;
            if (toolbar3.h != null) {
                toolbar3.h.setTextAppearance(context, g3);
            }
        }
        int g4 = a2.g(xu.s, 0);
        if (g4 != 0) {
            Toolbar toolbar4 = this.a;
            Context context2 = this.a.getContext();
            toolbar4.q = g4;
            if (toolbar4.i != null) {
                toolbar4.i.setTextAppearance(context2, g4);
            }
        }
        int g5 = a2.g(xu.q, 0);
        if (g5 != 0) {
            this.a.a(g5);
        }
        a2.b.recycle();
        if (R.string.abc_action_bar_up_description != this.o) {
            this.o = R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(this.a.i())) {
                int i2 = this.o;
                if (i2 == 0) {
                    string = null;
                } else {
                    string = this.a.getContext().getString(i2);
                }
                this.n = string;
                d();
            }
        }
        this.n = this.a.i();
        this.a.a(new ahe(this));
    }

    private final void c(CharSequence charSequence) {
        this.d = charSequence;
        if ((this.b & 8) != 0) {
            this.a.a(charSequence);
        }
    }

    private final void b() {
        Drawable drawable = null;
        if ((this.b & 2) != 0) {
            if ((this.b & 1) != 0) {
                drawable = this.j != null ? this.j : this.i;
            } else {
                drawable = this.i;
            }
        }
        this.a.a(drawable);
    }

    private final void c() {
        if ((this.b & 4) != 0) {
            this.a.b(this.k != null ? this.k : this.p);
        } else {
            this.a.b((Drawable) null);
        }
    }

    private final void d() {
        if ((this.b & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.n)) {
            this.a.b(this.o);
        } else {
            this.a.c(this.n);
        }
    }
}
