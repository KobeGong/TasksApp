package defpackage;

/* renamed from: wv reason: default package */
/* compiled from: PG */
class wv extends defpackage.wr {
    private final /* synthetic */ defpackage.wu a;

    wv(defpackage.wu wuVar, android.view.Window.Callback callback) {
        this.a = wuVar;
        super(wuVar, callback);
    }

    public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback) {
        if (this.a.n()) {
            return a(callback);
        }
        return super.onWindowStartingActionMode(callback);
    }

    /* access modifiers changed from: 0000 */
    public final android.view.ActionMode a(android.view.ActionMode.Callback callback) {
        defpackage.yi yiVar = new defpackage.yi(this.a.b, callback);
        defpackage.wu wuVar = this.a;
        if (wuVar.o != null) {
            wuVar.o.c();
        }
        defpackage.xz xzVar = new defpackage.xz(wuVar, yiVar);
        defpackage.wa a2 = wuVar.a();
        if (a2 != null) {
            wuVar.o = a2.a((defpackage.yd) xzVar);
            if (!(wuVar.o == null || wuVar.e == null)) {
                wuVar.e.d();
            }
        }
        if (wuVar.o == null) {
            wuVar.o = wuVar.a((defpackage.yd) xzVar);
        }
        defpackage.yc ycVar = wuVar.o;
        if (ycVar != null) {
            return yiVar.b(ycVar);
        }
        return null;
    }
}
