package defpackage;

import android.content.Context;
import android.support.v7.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: yg  reason: default package */
/* compiled from: PG */
public final class yg extends yc implements zf {
    private Context c;
    private ActionBarContextView d;
    private yd e;
    private WeakReference f;
    private boolean g;
    private ze h;

    public yg(Context context, ActionBarContextView actionBarContextView, yd ydVar) {
        this.c = context;
        this.d = actionBarContextView;
        this.e = ydVar;
        ze zeVar = new ze(actionBarContextView.getContext());
        zeVar.e = 1;
        this.h = zeVar;
        this.h.a(this);
    }

    @Override // defpackage.yc
    public final void b(CharSequence charSequence) {
        this.d.a(charSequence);
    }

    @Override // defpackage.yc
    public final void a(CharSequence charSequence) {
        this.d.b(charSequence);
    }

    @Override // defpackage.yc
    public final void a(int i) {
        b(this.c.getString(i));
    }

    @Override // defpackage.yc
    public final void b(int i) {
        a(this.c.getString(i));
    }

    @Override // defpackage.yc
    public final void a(boolean z) {
        super.a(z);
        this.d.a(z);
    }

    @Override // defpackage.yc
    public final boolean h() {
        return this.d.i;
    }

    @Override // defpackage.yc
    public final void a(View view) {
        this.d.a(view);
        this.f = view != null ? new WeakReference(view) : null;
    }

    @Override // defpackage.yc
    public final void d() {
        this.e.b(this, this.h);
    }

    @Override // defpackage.yc
    public final void c() {
        if (!this.g) {
            this.g = true;
            this.d.sendAccessibilityEvent(32);
            this.e.a(this);
        }
    }

    @Override // defpackage.yc
    public final Menu b() {
        return this.h;
    }

    @Override // defpackage.yc
    public final CharSequence f() {
        return this.d.f;
    }

    @Override // defpackage.yc
    public final CharSequence g() {
        return this.d.g;
    }

    @Override // defpackage.yc
    public final View i() {
        if (this.f != null) {
            return (View) this.f.get();
        }
        return null;
    }

    @Override // defpackage.yc
    public final MenuInflater a() {
        return new yj(this.d.getContext());
    }

    @Override // defpackage.zf
    public final boolean a(ze zeVar, MenuItem menuItem) {
        return this.e.a(this, menuItem);
    }

    @Override // defpackage.zf
    public final void a(ze zeVar) {
        d();
        this.d.a();
    }
}
