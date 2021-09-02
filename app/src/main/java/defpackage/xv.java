package defpackage;

/* renamed from: xv reason: default package */
/* compiled from: PG */
public final class xv implements defpackage.zu {
    private final /* synthetic */ defpackage.wz a;

    public xv(defpackage.wz wzVar) {
        this.a = wzVar;
    }

    public final boolean a(defpackage.ze zeVar) {
        android.view.Window.Callback callback = this.a.c.getCallback();
        if (callback != null) {
            callback.onMenuOpened(108, zeVar);
        }
        return true;
    }

    public final void a(defpackage.ze zeVar, boolean z) {
        this.a.b(zeVar);
    }
}
