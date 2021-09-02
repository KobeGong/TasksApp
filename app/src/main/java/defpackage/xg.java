package defpackage;

/* renamed from: xg reason: default package */
/* compiled from: PG */
public class xg extends android.app.Dialog implements defpackage.wn {
    private defpackage.wo a;

    public xg(android.content.Context context, int i) {
        if (i == 0) {
            android.util.TypedValue typedValue = new android.util.TypedValue();
            context.getTheme().resolveAttribute(2130772170, typedValue, true);
            i = typedValue.resourceId;
        }
        super(context, i);
        b().a((android.os.Bundle) null);
        b().k();
    }

    public void onCreate(android.os.Bundle bundle) {
        b().j();
        super.onCreate(bundle);
        b().a(bundle);
    }

    public void setContentView(int i) {
        b().b(i);
    }

    public void setContentView(android.view.View view) {
        b().a(view);
    }

    public void setContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        b().a(view, layoutParams);
    }

    public android.view.View findViewById(int i) {
        return b().a(i);
    }

    public void setTitle(java.lang.CharSequence charSequence) {
        super.setTitle(charSequence);
        b().a(charSequence);
    }

    public void setTitle(int i) {
        super.setTitle(i);
        b().a((java.lang.CharSequence) getContext().getString(i));
    }

    public void addContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        b().b(view, layoutParams);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        b().f();
    }

    public final boolean a() {
        return b().c(1);
    }

    public void invalidateOptionsMenu() {
        b().h();
    }

    private final defpackage.wo b() {
        if (this.a == null) {
            this.a = defpackage.wo.a(getContext(), getWindow(), this);
        }
        return this.a;
    }

    public final void d() {
    }

    public final void e() {
    }

    public final defpackage.yc f() {
        return null;
    }
}
