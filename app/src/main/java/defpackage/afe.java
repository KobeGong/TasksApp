package defpackage;

/* renamed from: afe reason: default package */
/* compiled from: PG */
final class afe implements defpackage.ahn {
    private final /* synthetic */ LayoutManager a;

    afe(LayoutManager afd) {
        this.a = afd;
    }

    public final android.view.View a(int i) {
        return this.a.e(i);
    }

    public final int a() {
        return this.a.l();
    }

    public final int b() {
        return this.a.l - this.a.n();
    }

    public final int a(android.view.View view) {
        return LayoutManager.b(view) - ((defpackage.afh) view.getLayoutParams()).leftMargin;
    }

    public final int b(android.view.View view) {
        defpackage.afh afh = (defpackage.afh) view.getLayoutParams();
        return afh.rightMargin + LayoutManager.d(view);
    }
}
