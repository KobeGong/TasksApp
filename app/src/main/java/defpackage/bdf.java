package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: bdf  reason: default package */
/* compiled from: PG */
public final class bdf implements ServiceConnection {
    private final int a;
    private /* synthetic */ bcx b;

    public bdf(bcx bcx, int i) {
        this.b = bcx;
        this.a = i;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        bdt bdt;
        if (iBinder == null) {
            bcx.a(this.b);
            return;
        }
        synchronized (this.b.m) {
            bcx bcx = this.b;
            if (iBinder == null) {
                bdt = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                if (queryLocalInterface == null || !(queryLocalInterface instanceof bdt)) {
                    bdt = new bdt(iBinder);
                } else {
                    bdt = (bdt) queryLocalInterface;
                }
            }
            bcx.n = bdt;
        }
        this.b.a(0, this.a);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.b.m) {
            this.b.n = null;
        }
        this.b.e.sendMessage(this.b.e.obtainMessage(6, this.a, 1));
    }
}
