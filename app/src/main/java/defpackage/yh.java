package defpackage;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

/* renamed from: yh  reason: default package */
/* compiled from: PG */
public final class yh extends ActionMode {
    public final yc a;
    private final Context b;

    public yh(Context context, yc ycVar) {
        this.b = context;
        this.a = ycVar;
    }

    public final Object getTag() {
        return this.a.a;
    }

    public final void setTag(Object obj) {
        this.a.a = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.a.b(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.a.a(charSequence);
    }

    public final void invalidate() {
        this.a.d();
    }

    public final void finish() {
        this.a.c();
    }

    public final Menu getMenu() {
        return zx.a(this.b, (po) this.a.b());
    }

    public final CharSequence getTitle() {
        return this.a.f();
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.a.a(i);
    }

    public final CharSequence getSubtitle() {
        return this.a.g();
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.a.b(i);
    }

    public final View getCustomView() {
        return this.a.i();
    }

    public final void setCustomView(View view) {
        this.a.a(view);
    }

    public final MenuInflater getMenuInflater() {
        return this.a.a();
    }

    public final boolean getTitleOptionalHint() {
        return this.a.b;
    }

    public final void setTitleOptionalHint(boolean z) {
        this.a.a(z);
    }

    public final boolean isTitleOptional() {
        return this.a.h();
    }
}
