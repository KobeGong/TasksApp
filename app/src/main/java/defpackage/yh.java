package defpackage;

/* renamed from: yh reason: default package */
/* compiled from: PG */
public final class yh extends android.view.ActionMode {
    public final defpackage.yc a;
    private final android.content.Context b;

    public yh(android.content.Context context, defpackage.yc ycVar) {
        this.b = context;
        this.a = ycVar;
    }

    public final java.lang.Object getTag() {
        return this.a.a;
    }

    public final void setTag(java.lang.Object obj) {
        this.a.a = obj;
    }

    public final void setTitle(java.lang.CharSequence charSequence) {
        this.a.b(charSequence);
    }

    public final void setSubtitle(java.lang.CharSequence charSequence) {
        this.a.a(charSequence);
    }

    public final void invalidate() {
        this.a.d();
    }

    public final void finish() {
        this.a.c();
    }

    public final android.view.Menu getMenu() {
        return defpackage.zx.a(this.b, (defpackage.po) this.a.b());
    }

    public final java.lang.CharSequence getTitle() {
        return this.a.f();
    }

    public final void setTitle(int i) {
        this.a.a(i);
    }

    public final java.lang.CharSequence getSubtitle() {
        return this.a.g();
    }

    public final void setSubtitle(int i) {
        this.a.b(i);
    }

    public final android.view.View getCustomView() {
        return this.a.i();
    }

    public final void setCustomView(android.view.View view) {
        this.a.a(view);
    }

    public final android.view.MenuInflater getMenuInflater() {
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
