package defpackage;

/* renamed from: aff reason: default package */
/* compiled from: PG */
final class aff implements defpackage.ahn {
    private final /* synthetic */ defpackage.afd a;

    aff(defpackage.afd afd) {
        this.a = afd;
    }

    public final android.view.View a(int i) {
        return this.a.e(i);
    }

    public final int a() {
        return this.a.m();
    }

    public final int b() {
        return this.a.m - this.a.o();
    }

    public final int a(android.view.View view) {
        return defpackage.afd.c(view) - ((defpackage.afh) view.getLayoutParams()).topMargin;
    }

    public final int b(android.view.View view) {
        defpackage.afh afh = (defpackage.afh) view.getLayoutParams();
        return afh.bottomMargin + defpackage.afd.e(view);
    }
}
