package defpackage;

import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import com.google.android.gms.common.api.Status;

/* renamed from: aza  reason: default package */
/* compiled from: PG */
public abstract class aza {
    public abstract void a(aze aze, boolean z);

    public abstract void a(bak bak);

    public abstract void a(Status status);

    static /* synthetic */ Status a(RemoteException remoteException) {
        StringBuilder sb = new StringBuilder();
        if (remoteException instanceof TransactionTooLargeException) {
            sb.append("TransactionTooLargeException: ");
        }
        sb.append(remoteException.getLocalizedMessage());
        return new Status(8, sb.toString());
    }
}
