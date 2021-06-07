package defpackage;

import android.content.Context;
import android.support.v7.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: xs  reason: default package */
/* compiled from: PG */
public final class xs extends yc implements zf {
    private final Context c;
    private final ze d;
    private yd e;
    private WeakReference f;
    private final /* synthetic */ xp g;

    public xs(xp xpVar, Context context, yd ydVar) {
        this.g = xpVar;
        this.c = context;
        this.e = ydVar;
        ze zeVar = new ze(context);
        zeVar.e = 1;
        this.d = zeVar;
        this.d.a(this);
    }

    @Override // defpackage.yc
    public final MenuInflater a() {
        return new yj(this.c);
    }

    @Override // defpackage.yc
    public final Menu b() {
        return this.d;
    }

    @Override // defpackage.yc
    public final void c() {
        if (this.g.g == this) {
            if (!xp.a(this.g.k, this.g.l, false)) {
                this.g.h = this;
                this.g.i = this.e;
            } else {
                this.e.a(this);
            }
            this.e = null;
            this.g.f(false);
            ActionBarContextView actionBarContextView = this.g.e;
            if (actionBarContextView.h == null) {
                actionBarContextView.b();
            }
            this.g.d.a.sendAccessibilityEvent(32);
            this.g.b.a(this.g.n);
            this.g.g = null;
        }
    }

    @Override // defpackage.yc
    public final void d() {
        if (this.g.g == this) {
            this.d.e();
            try {
                this.e.b(this, this.d);
            } finally {
                this.d.f();
            }
        }
    }

    public final boolean e() {
        this.d.e();
        try {
            return this.e.a(this, this.d);
        } finally {
            this.d.f();
        }
    }

    @Override // defpackage.yc
    public final void a(View view) {
        this.g.e.a(view);
        this.f = new WeakReference(view);
    }

    @Override // defpackage.yc
    public final void a(CharSequence charSequence) {
        this.g.e.b(charSequence);
    }

    @Override // defpackage.yc
    public final void b(CharSequence charSequence) {
        this.g.e.a(charSequence);
    }

    @Override // defpackage.yc
    public final void a(int i) {
        b(this.g.a.getResources().getString(i));
    }

    @Override // defpackage.yc
    public final void b(int i) {
        a(this.g.a.getResources().getString(i));
    }

    @Override // defpackage.yc
    public final CharSequence f() {
        return this.g.e.f;
    }

    @Override // defpackage.yc
    public final CharSequence g() {
        return this.g.e.g;
    }

    @Override // defpackage.yc
    public final void a(boolean z) {
        super.a(z);
        this.g.e.a(z);
    }

    @Override // defpackage.yc
    public final boolean h() {
        return this.g.e.i;
    }

    @Override // defpackage.yc
    public final View i() {
        if (this.f != null) {
            return (View) this.f.get();
        }
        return null;
    }

    @Override // defpackage.zf
    public final boolean a(ze zeVar, MenuItem menuItem) {
        if (this.e != null) {
            return this.e.a(this, menuItem);
        }
        return false;
    }

    @Override // defpackage.zf
    public final void a(ze zeVar) {
        if (this.e != null) {
            d();
            this.g.e.a();
        }
    }
}
