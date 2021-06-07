package defpackage;

import android.os.Handler;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: qd  reason: default package */
/* compiled from: PG */
public final class qd implements Runnable {
    public final /* synthetic */ qg a;
    private final /* synthetic */ Callable b;
    private final /* synthetic */ Handler c;

    qd(Callable callable, Handler handler, qg qgVar) {
        this.b = callable;
        this.c = handler;
        this.a = qgVar;
    }

    public final void run() {
        Object obj;
        try {
            obj = this.b.call();
        } catch (Exception e) {
            obj = null;
        }
        this.c.post(new qe(this, obj));
    }
}
