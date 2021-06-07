package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: bdh  reason: default package */
/* compiled from: PG */
public final class bdh extends bdc {
    private IBinder c;
    private /* synthetic */ bcx d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bdh(bcx bcx, int i, IBinder iBinder, Bundle bundle) {
        super(bcx, i, bundle);
        this.d = bcx;
        this.c = iBinder;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.bdc
    public final void a(axq axq) {
        if (this.d.t != null) {
            this.d.t.a(axq);
        }
        this.d.a(axq);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.bdc
    public final boolean a() {
        try {
            String interfaceDescriptor = this.c.getInterfaceDescriptor();
            if (!this.d.b().equals(interfaceDescriptor)) {
                String b = this.d.b();
                Log.e("GmsClient", new StringBuilder(String.valueOf(b).length() + 34 + String.valueOf(interfaceDescriptor).length()).append("service descriptor mismatch: ").append(b).append(" vs. ").append(interfaceDescriptor).toString());
                return false;
            }
            IInterface a = this.d.a(this.c);
            if (a == null) {
                return false;
            }
            if (!(this.d.a(2, 4, a)) && !(this.d.a(3, 4, a))) {
                return false;
            }
            this.d.w = null;
            if (this.d.s != null) {
                this.d.s.a.a((Bundle) null);
            }
            return true;
        } catch (RemoteException e) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
