package defpackage;

/* renamed from: afs reason: default package */
/* compiled from: PG */
public final class afs implements defpackage.zu {
    private final /* synthetic */ defpackage.wz a;

    public afs(defpackage.wz wzVar) {
        this.a = wzVar;
    }

    public final void a(defpackage.ze zeVar, boolean z) {
        defpackage.ze l = zeVar.l();
        boolean z2 = l != zeVar;
        defpackage.wz wzVar = this.a;
        if (z2) {
            zeVar = l;
        }
        defpackage.zx a2 = wzVar.a((android.view.Menu) zeVar);
        if (a2 == null) {
            return;
        }
        if (z2) {
            this.a.a(a2.a, a2, (android.view.Menu) l);
            this.a.a(a2, true);
            return;
        }
        this.a.a(a2, z);
    }

    public final boolean a(defpackage.ze zeVar) {
        if (zeVar == null && this.a.g) {
            android.view.Window.Callback callback = this.a.c.getCallback();
            if (callback != null && !this.a.m) {
                callback.onMenuOpened(108, zeVar);
            }
        }
        return true;
    }
}
