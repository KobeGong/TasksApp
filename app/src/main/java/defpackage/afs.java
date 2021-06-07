package defpackage;

import android.view.Menu;
import android.view.Window;

/* renamed from: afs  reason: default package */
/* compiled from: PG */
public final class afs implements zu {
    private final /* synthetic */ wz a;

    public afs(wz wzVar) {
        this.a = wzVar;
    }

    @Override // defpackage.zu
    public final void a(ze zeVar, boolean z) {
        ze l = zeVar.l();
        boolean z2 = l != zeVar;
        wz wzVar = this.a;
        if (z2) {
            zeVar = l;
        }
        zx a2 = wzVar.a((Menu) zeVar);
        if (a2 == null) {
            return;
        }
        if (z2) {
            this.a.a(a2.a, a2, l);
            this.a.a(a2, true);
            return;
        }
        this.a.a(a2, z);
    }

    @Override // defpackage.zu
    public final boolean a(ze zeVar) {
        Window.Callback callback;
        if (zeVar != null || !this.a.g || (callback = this.a.c.getCallback()) == null || this.a.m) {
            return true;
        }
        callback.onMenuOpened(108, zeVar);
        return true;
    }
}
