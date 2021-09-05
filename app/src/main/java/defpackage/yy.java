package defpackage;

/* renamed from: yy reason: default package */
/* compiled from: PG */
final class yy implements defpackage.aek {
    public final /* synthetic */ defpackage.yv a;

    yy(defpackage.yv yvVar) {
        this.a = yvVar;
    }

    public final void a(MenuBuilder zeVar, android.view.MenuItem menuItem) {
        this.a.a.removeCallbacksAndMessages(zeVar);
    }

    public final void b(MenuBuilder zeVar, android.view.MenuItem menuItem) {
        int i;
        defpackage.za zaVar;
        this.a.a.removeCallbacksAndMessages(null);
        int i2 = 0;
        int size = this.a.b.size();
        while (true) {
            if (i2 >= size) {
                i = -1;
                break;
            } else if (zeVar == ((defpackage.za) this.a.b.get(i2)).b) {
                i = i2;
                break;
            } else {
                i2++;
            }
        }
        if (i != -1) {
            int i3 = i + 1;
            if (i3 < this.a.b.size()) {
                zaVar = (defpackage.za) this.a.b.get(i3);
            } else {
                zaVar = null;
            }
            this.a.a.postAtTime(new defpackage.yz(this, zaVar, menuItem, zeVar), zeVar, android.os.SystemClock.uptimeMillis() + 200);
        }
    }
}
