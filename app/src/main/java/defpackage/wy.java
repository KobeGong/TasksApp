package defpackage;

import android.view.ActionMode;
import android.view.Window;

/* access modifiers changed from: package-private */
/* renamed from: wy  reason: default package */
/* compiled from: PG */
public class wy extends wv {
    private final /* synthetic */ wx a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    wy(wx wxVar, Window.Callback callback) {
        super(wxVar, callback);
        this.a = wxVar;
    }

    @Override // defpackage.yo
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        if (this.a.n()) {
            switch (i) {
                case 0:
                    return a(callback);
            }
        }
        return super.onWindowStartingActionMode(callback, i);
    }

    @Override // defpackage.yo, defpackage.wv
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
