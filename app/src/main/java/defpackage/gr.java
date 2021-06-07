package defpackage;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* access modifiers changed from: package-private */
/* renamed from: gr  reason: default package */
/* compiled from: PG */
public final class gr implements Handler.Callback {
    private final /* synthetic */ gq a;

    gr(gq gqVar) {
        this.a = gqVar;
    }

    public final boolean handleMessage(Message message) {
        switch (message.what) {
            case 0:
                gq gqVar = this.a;
                gt gtVar = (gt) message.obj;
                synchronized (gqVar.a) {
                    if (gtVar == null || gtVar == null) {
                        WeakReference weakReference = null;
                        gs gsVar = (gs) weakReference.get();
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
