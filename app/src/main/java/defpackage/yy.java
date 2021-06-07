package defpackage;

import android.os.SystemClock;
import android.view.MenuItem;

/* renamed from: yy  reason: default package */
/* compiled from: PG */
final class yy implements aek {
    public final /* synthetic */ yv a;

    yy(yv yvVar) {
        this.a = yvVar;
    }

    @Override // defpackage.aek
    public final void a(ze zeVar, MenuItem menuItem) {
        this.a.a.removeCallbacksAndMessages(zeVar);
    }

    @Override // defpackage.aek
    public final void b(ze zeVar, MenuItem menuItem) {
        int i;
        za zaVar;
        this.a.a.removeCallbacksAndMessages(null);
        int i2 = 0;
        int size = this.a.b.size();
        while (true) {
            if (i2 >= size) {
                i = -1;
                break;
            } else if (zeVar == ((za) this.a.b.get(i2)).b) {
                i = i2;
                break;
            } else {
                i2++;
            }
        }
        if (i != -1) {
            int i3 = i + 1;
            if (i3 < this.a.b.size()) {
                zaVar = (za) this.a.b.get(i3);
            } else {
                zaVar = null;
            }
            this.a.a.postAtTime(new yz(this, zaVar, menuItem, zeVar), zeVar, SystemClock.uptimeMillis() + 200);
        }
    }
}
