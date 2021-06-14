package defpackage;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.view.MenuItem;

/* access modifiers changed from: package-private */
/* renamed from: xl  reason: default package */
/* compiled from: PG */
public final class xl implements zf {
    public xn a;
    public boolean b;
    public BroadcastReceiver c;
    public IntentFilter d;
    public final /* synthetic */ wu e;

    @Override // defpackage.zf
    public final boolean a(MenuBuilder zeVar, MenuItem menuItem) {
        return false;
    }

    @Override // defpackage.zf
    public final void a(MenuBuilder zeVar) {
    }

    xl(wu wuVar, xn xnVar) {
        this.e = wuVar;
        this.a = xnVar;
        this.b = xnVar.a();
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        if (this.c != null) {
            this.e.b.unregisterReceiver(this.c);
            this.c = null;
        }
    }
}
