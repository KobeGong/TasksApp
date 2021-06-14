package defpackage;

import android.view.Window;

/* renamed from: xv  reason: default package */
/* compiled from: PG */
public final class xv implements zu {
    private final /* synthetic */ wz a;

    public xv(wz wzVar) {
        this.a = wzVar;
    }

    @Override // defpackage.zu
    public final boolean a(MenuBuilder zeVar) {
        Window.Callback callback = this.a.c.getCallback();
        if (callback == null) {
            return true;
        }
        callback.onMenuOpened(108, zeVar);
        return true;
    }

    @Override // defpackage.zu
    public final void a(MenuBuilder zeVar, boolean z) {
        this.a.b(zeVar);
    }
}
