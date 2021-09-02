package defpackage;

/* renamed from: aza reason: default package */
/* compiled from: PG */
public abstract class aza {
    public abstract void a(defpackage.aze aze, boolean z);

    public abstract void a(defpackage.bak bak);

    public abstract void a(com.google.android.gms.common.api.Status status);

    static /* synthetic */ com.google.android.gms.common.api.Status a(android.os.RemoteException remoteException) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (remoteException instanceof android.os.TransactionTooLargeException) {
            sb.append("TransactionTooLargeException: ");
        }
        sb.append(remoteException.getLocalizedMessage());
        return new com.google.android.gms.common.api.Status(8, sb.toString());
    }
}
