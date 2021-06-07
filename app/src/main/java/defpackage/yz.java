package defpackage;

import android.view.MenuItem;

/* renamed from: yz  reason: default package */
/* compiled from: PG */
final class yz implements Runnable {
    private final /* synthetic */ za a;
    private final /* synthetic */ MenuItem b;
    private final /* synthetic */ ze c;
    private final /* synthetic */ yy d;

    yz(yy yyVar, za zaVar, MenuItem menuItem, ze zeVar) {
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
            this.c.a(this.b, (zt) null, 4);
        }
    }
}
