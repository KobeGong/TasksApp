package defpackage;

/* renamed from: gr reason: default package */
/* compiled from: PG */
final class gr implements android.os.Handler.Callback {
    private final /* synthetic */ defpackage.gq a;

    gr(defpackage.gq gqVar) {
        this.a = gqVar;
    }

    public final boolean handleMessage(android.os.Message message) {
        switch (message.what) {
            case 0:
                defpackage.gq gqVar = this.a;
                ViewModelStore gtVar = (ViewModelStore) message.obj;
                synchronized (gqVar.a) {
                    if (gtVar == null || gtVar == null) {
                        java.lang.ref.WeakReference weakReference = null;
                        defpackage.gs gsVar = (defpackage.gs) weakReference.get();
                        if (gsVar != null) {
                            gqVar.b.removeCallbacksAndMessages(gtVar);
                            gsVar.a();
                        }
                    }
                }
                return true;
            default:
                return false;
        }
    }
}
