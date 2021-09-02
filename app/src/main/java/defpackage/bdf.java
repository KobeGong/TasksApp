package defpackage;

/* renamed from: bdf reason: default package */
/* compiled from: PG */
public final class bdf implements android.content.ServiceConnection {
    private final int a;
    private /* synthetic */ defpackage.bcx b;

    public bdf(defpackage.bcx bcx, int i) {
        this.b = bcx;
        this.a = i;
    }

    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        defpackage.bdt bdt;
        if (iBinder == null) {
            defpackage.bcx.a(this.b);
            return;
        }
        synchronized (this.b.m) {
            defpackage.bcx bcx = this.b;
            if (iBinder == null) {
                bdt = null;
            } else {
                android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                if (queryLocalInterface == null || !(queryLocalInterface instanceof defpackage.bdt)) {
                    bdt = new defpackage.bdt(iBinder);
                } else {
                    bdt = (defpackage.bdt) queryLocalInterface;
                }
            }
            bcx.n = bdt;
        }
        this.b.a(0, this.a);
    }

    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        synchronized (this.b.m) {
            this.b.n = null;
        }
        this.b.e.sendMessage(this.b.e.obtainMessage(6, this.a, 1));
    }
}
