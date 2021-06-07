package defpackage;

import android.view.ActionMode;
import android.view.Window;

/* access modifiers changed from: package-private */
/* renamed from: wv  reason: default package */
/* compiled from: PG */
public class wv extends wr {
    private final /* synthetic */ wu a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    wv(wu wuVar, Window.Callback callback) {
        super(wuVar, callback);
        this.a = wuVar;
    }

    @Override // defpackage.yo
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        if (this.a.n()) {
            return a(callback);
        }
        return super.onWindowStartingActionMode(callback);
    }

    /* access modifiers changed from: package-private */
    public final ActionMode a(ActionMode.Callback callback) {
        yi yiVar = new yi(this.a.b, callback);
        wu wuVar = this.a;
        if (wuVar.o != null) {
            wuVar.o.c();
        }
        xz xzVar = new xz(wuVar, yiVar);
        wa a2 = wuVar.a();
        if (a2 != null) {
            wuVar.o = a2.a(xzVar);
            if (!(wuVar.o == null || ((wz) wuVar).e == null)) {
                ((wz) wuVar).e.d();
            }
        }
        if (wuVar.o == null) {
            wuVar.o = wuVar.a(xzVar);
        }
        yc ycVar = wuVar.o;
        if (ycVar != null) {
            return yiVar.b(ycVar);
        }
        return null;
    }
}
