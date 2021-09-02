package defpackage;

/* renamed from: azw reason: default package */
/* compiled from: PG */
abstract class azw extends defpackage.aza {
    public final defpackage.bpw a;

    public azw(defpackage.bpw bpw) {
        this.a = bpw;
    }

    /* access modifiers changed from: protected */
    public abstract void b(defpackage.bak bak);

    public void a(com.google.android.gms.common.api.Status status) {
        this.a.b(new defpackage.ayl(status));
    }

    public void a(defpackage.aze aze, boolean z) {
    }

    public final void a(defpackage.bak bak) {
        try {
            b(bak);
        } catch (android.os.DeadObjectException e) {
            a(defpackage.aza.a((android.os.RemoteException) e));
            throw e;
        } catch (android.os.RemoteException e2) {
            a(defpackage.aza.a(e2));
        }
    }
}
