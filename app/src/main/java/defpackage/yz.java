package defpackage;

/* renamed from: yz reason: default package */
/* compiled from: PG */
final class yz implements java.lang.Runnable {
    private final /* synthetic */ defpackage.za a;
    private final /* synthetic */ android.view.MenuItem b;
    private final /* synthetic */ MenuBuilder c;
    private final /* synthetic */ defpackage.yy d;

    yz(defpackage.yy yyVar, defpackage.za zaVar, android.view.MenuItem menuItem, MenuBuilder zeVar) {
        this.d = yyVar;
        this.a = zaVar;
        this.b = menuItem;
        this.c = zeVar;
    }

    public final void run() {
        if (this.a != null) {
            this.d.a.f = true;
            this.a.b.b(false);
            this.d.a.f = false;
        }
        if (this.b.isEnabled() && this.b.hasSubMenu()) {
            this.c.a(this.b, (MenuPresenter) null, 4);
        }
    }
}
