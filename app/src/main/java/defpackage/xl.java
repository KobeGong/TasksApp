package defpackage;

/* renamed from: xl reason: default package */
/* compiled from: PG */
final class xl implements defpackage.zf {
    public defpackage.xn a;
    public boolean b;
    public android.content.BroadcastReceiver c;
    public android.content.IntentFilter d;
    public final /* synthetic */ defpackage.wu e;

    public final boolean a(MenuBuilder zeVar, android.view.MenuItem menuItem) {
        return false;
    }

    public final void a(MenuBuilder zeVar) {
    }

    xl(defpackage.wu wuVar, defpackage.xn xnVar) {
        this.e = wuVar;
        this.a = xnVar;
        this.b = xnVar.a();
    }

    /* access modifiers changed from: 0000 */
    public final void a() {
        if (this.c != null) {
            this.e.b.unregisterReceiver(this.c);
            this.c = null;
        }
    }
}
