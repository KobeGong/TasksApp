package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: bbb  reason: default package */
/* compiled from: PG */
public final class bbb extends Handler {
    private /* synthetic */ bba a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bbb(bba bba, Looper looper) {
        super(looper);
        this.a = bba;
    }

    public final void handleMessage(Message message) {
        boolean z = true;
        if (message.what != 1) {
            z = false;
        }
        azb.b(z);
        bba bba = this.a;
        bbd bbd = (bbd) message.obj;
        Object obj = bba.b;
        if (obj != null) {
            try {
                ((bly) obj).a.a(bbd.a, bbd.b, bbd.c);
            } catch (RuntimeException e) {
                throw e;
            }
        }
    }
}
