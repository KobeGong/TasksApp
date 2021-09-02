package defpackage;

/* renamed from: bdd reason: default package */
/* compiled from: PG */
final class bdd extends android.os.Handler {
    private /* synthetic */ defpackage.bcx a;

    public bdd(defpackage.bcx bcx, android.os.Looper looper) {
        this.a = bcx;
        super(looper);
    }

    public final void handleMessage(android.os.Message message) {
        java.lang.Object obj;
        defpackage.axq axq;
        defpackage.axq axq2;
        if (this.a.g.get() != message.arg1) {
            if (b(message)) {
                a(message);
            }
        } else if ((message.what == 1 || message.what == 7 || message.what == 4 || message.what == 5) && !this.a.g()) {
            a(message);
        } else if (message.what == 4) {
            this.a.w = new defpackage.axq(message.arg2);
            if (!this.a.s() || this.a.x) {
                if (this.a.w != null) {
                    axq2 = this.a.w;
                } else {
                    axq2 = new defpackage.axq(8);
                }
                this.a.f.a(axq2);
                this.a.a(axq2);
                return;
            }
            this.a.a(3, (android.os.IInterface) null);
        } else if (message.what == 5) {
            if (this.a.w != null) {
                axq = this.a.w;
            } else {
                axq = new defpackage.axq(8);
            }
            this.a.f.a(axq);
            this.a.a(axq);
        } else if (message.what == 3) {
            defpackage.axq axq3 = new defpackage.axq(message.arg2, message.obj instanceof android.app.PendingIntent ? (android.app.PendingIntent) message.obj : null);
            this.a.f.a(axq3);
            this.a.a(axq3);
        } else if (message.what == 6) {
            this.a.a(5, (android.os.IInterface) null);
            if (this.a.s != null) {
                this.a.s.a.a(message.arg2);
            }
            defpackage.bcx bcx = this.a;
            bcx.b = message.arg2;
            bcx.c = java.lang.System.currentTimeMillis();
            this.a.a(5, 1, null);
        } else if (message.what == 2 && !this.a.f()) {
            a(message);
        } else if (b(message)) {
            defpackage.bde bde = (defpackage.bde) message.obj;
            synchronized (bde) {
                obj = bde.a;
                if (bde.b) {
                    java.lang.String valueOf = java.lang.String.valueOf(bde);
                    android.util.Log.w("GmsClient", new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 47).append("Callback proxy ").append(valueOf).append(" being reused. This is not safe.").toString());
                }
            }
            if (obj != null) {
                try {
                    bde.a(obj);
                } catch (java.lang.RuntimeException e) {
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
            android.util.Log.wtf("GmsClient", "Don't know how to handle message: " + message.what, new java.lang.Exception());
        }
    }

    private static void a(android.os.Message message) {
        defpackage.bde bde = (defpackage.bde) message.obj;
        bde.b();
        bde.c();
    }

    private static boolean b(android.os.Message message) {
        return message.what == 2 || message.what == 1 || message.what == 7;
    }
}
