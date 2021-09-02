package defpackage;

/* renamed from: wy reason: default package */
/* compiled from: PG */
class wy extends defpackage.wv {
    private final /* synthetic */ defpackage.wx a;

    wy(defpackage.wx wxVar, android.view.Window.Callback callback) {
        this.a = wxVar;
        super(wxVar, callback);
    }

    public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback, int i) {
        if (this.a.n()) {
            switch (i) {
                case 0:
                    return a(callback);
            }
        }
        return super.onWindowStartingActionMode(callback, i);
    }

    public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback) {
        return null;
    }
}
