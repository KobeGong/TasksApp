package defpackage;

import android.app.PendingIntent;
import android.os.Handler;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* access modifiers changed from: package-private */
/* renamed from: bdd  reason: default package */
/* compiled from: PG */
public final class bdd extends Handler {
    private /* synthetic */ bcx a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bdd(bcx bcx, Looper looper) {
        super(looper);
        this.a = bcx;
    }

    public final void handleMessage(Message message) {
        Object obj;
        axq axq;
        axq axq2;
        if (this.a.g.get() != message.arg1) {
            if (b(message)) {
                a(message);
            }
        } else if ((message.what == 1 || message.what == 7 || message.what == 4 || message.what == 5) && !this.a.g()) {
            a(message);
        } else if (message.what == 4) {
            this.a.w = new axq(message.arg2);
            if (!(this.a.s()) || (this.a.x)) {
                if (this.a.w != null) {
                    axq2 = this.a.w;
                } else {
                    axq2 = new axq(8);
                }
                this.a.f.a(axq2);
                this.a.a(axq2);
                return;
            }
            this.a.a((bcx) 3, (int) ((IInterface) null));
        } else if (message.what == 5) {
            if (this.a.w != null) {
                axq = this.a.w;
            } else {
                axq = new axq(8);
            }
            this.a.f.a(axq);
            this.a.a(axq);
        } else if (message.what == 3) {
            axq axq3 = new axq(message.arg2, message.obj instanceof PendingIntent ? (PendingIntent) message.obj : null);
            this.a.f.a(axq3);
            this.a.a(axq3);
        } else if (message.what == 6) {
            this.a.a((bcx) 5, (int) ((IInterface) null));
            if (this.a.s != null) {
                this.a.s.a.a(message.arg2);
            }
            bcx bcx = this.a;
            bcx.b = message.arg2;
            bcx.c = System.currentTimeMillis();
            boolean unused = this.a.a(5, 1, null);
        } else if (message.what == 2 && !this.a.f()) {
            a(message);
        } else if (b(message)) {
            bde bde = (bde) message.obj;
            synchronized (bde) {
                obj = bde.a;
                if (bde.b) {
                    String valueOf = String.valueOf(bde);
                    Log.w("GmsClient", new StringBuilder(String.valueOf(valueOf).length() + 47).append("Callback proxy ").append(valueOf).append(" being reused. This is not safe.").toString());
                }
            }
            if (obj != null) {
                try {
                    bde.a(obj);
                } catch (RuntimeException e) {
                    bde.b();
                    throw e;
                }
            } else {
                bde.b();
            }
            synchronized (bde) {
                bde.b = true;
            }
            bde.c();
        } else {
            Log.wtf("GmsClient", new StringBuilder(45).append("Don't know how to handle message: ").append(message.what).toString(), new Exception());
        }
    }

    private static void a(Message message) {
        bde bde = (bde) message.obj;
        bde.b();
        bde.c();
    }

    private static boolean b(Message message) {
        return message.what == 2 || message.what == 1 || message.what == 7;
    }
}
