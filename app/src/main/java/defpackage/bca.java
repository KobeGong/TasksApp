package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* renamed from: bca  reason: default package */
/* compiled from: PG */
public abstract class bca extends BasePendingResult implements bcb {
    public final ayh c;
    public final ayd d;

    public bca(ayd ayd, ayp ayp) {
        super((ayp) azb.b(ayp, "GoogleApiClient must not be null"));
        azb.b(ayd, "Api must not be null");
        this.c = ayd.b();
        this.d = ayd;
    }

    public abstract void a(ayg ayg);

    public final void b(ayg ayg) {
        if (ayg instanceof bef) {
            ayg = bef.q();
        }
        try {
            a(ayg);
        } catch (DeadObjectException e) {
            a((RemoteException) e);
            throw e;
        } catch (RemoteException e2) {
            a(e2);
        }
    }

    public final void c(Status status) {
        azb.b(!status.a(), "Failed result must not be success");
        a(a(status));
    }

    private final void a(RemoteException remoteException) {
        c(new Status(8, remoteException.getLocalizedMessage(), null));
    }

    @Override // defpackage.bcb
    public /* bridge */ /* synthetic */ void a(Object obj) {
        super.a((ayw) obj);
    }

    public bca(ayp ayp) {
        this(bir.b, ayp);
    }
}
