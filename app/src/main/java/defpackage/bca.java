package defpackage;

/* renamed from: bca reason: default package */
/* compiled from: PG */
public abstract class bca extends com.google.android.gms.common.api.internal.BasePendingResult implements defpackage.bcb {
    public final defpackage.ayh c;
    public final defpackage.ayd d;

    public bca(defpackage.ayd ayd, defpackage.ayp ayp) {
        super((defpackage.ayp) defpackage.azb.b((java.lang.Object) ayp, (java.lang.Object) "GoogleApiClient must not be null"));
        defpackage.azb.b((java.lang.Object) ayd, (java.lang.Object) "Api must not be null");
        this.c = ayd.b();
        this.d = ayd;
    }

    public abstract void a(defpackage.ayg ayg);

    public final void b(defpackage.ayg ayg) {
        if (ayg instanceof defpackage.bef) {
            ayg = defpackage.bef.q();
        }
        try {
            a(ayg);
        } catch (android.os.DeadObjectException e) {
            a((android.os.RemoteException) e);
            throw e;
        } catch (android.os.RemoteException e2) {
            a(e2);
        }
    }

    public final void c(com.google.android.gms.common.api.Status status) {
        defpackage.azb.b(!status.a(), (java.lang.Object) "Failed result must not be success");
        a(a(status));
    }

    private final void a(android.os.RemoteException remoteException) {
        c(new com.google.android.gms.common.api.Status(8, remoteException.getLocalizedMessage(), null));
    }

    public /* bridge */ /* synthetic */ void a(java.lang.Object obj) {
        super.a((defpackage.ayw) obj);
    }

    public bca(defpackage.ayp ayp) {
        this(defpackage.bir.b, ayp);
    }
}
