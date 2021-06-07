package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: azw  reason: default package */
/* compiled from: PG */
abstract class azw extends aza {
    public final bpw a;

    public azw(bpw bpw) {
        this.a = bpw;
    }

    /* access modifiers changed from: protected */
    public abstract void b(bak bak);

    @Override // defpackage.aza
    public void a(Status status) {
        this.a.b(new ayl(status));
    }

    @Override // defpackage.aza
    public void a(aze aze, boolean z) {
    }

    @Override // defpackage.aza
    public final void a(bak bak) {
        try {
            b(bak);
        } catch (DeadObjectException e) {
            a(aza.a(e));
            throw e;
        } catch (RemoteException e2) {
            a(aza.a(e2));
        }
    }
}
