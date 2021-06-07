package defpackage;

import android.app.Notification;
import android.os.Parcel;

/* access modifiers changed from: package-private */
/* renamed from: no  reason: default package */
/* compiled from: PG */
public final class no implements ns {
    private final String a;
    private final int b = 0;
    private final String c;
    private final Notification d;

    no(String str, String str2, Notification notification) {
        this.a = str;
        this.c = str2;
        this.d = notification;
    }

    @Override // defpackage.ns
    public final void a(mz mzVar) {
        String str = this.a;
        String str2 = this.c;
        Notification notification = this.d;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
            obtain.writeString(str);
            obtain.writeInt(0);
            obtain.writeString(str2);
            if (notification != null) {
                obtain.writeInt(1);
                notification.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            mzVar.a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotifyTask[");
        sb.append("packageName:").append(this.a);
        sb.append(", id:0");
        sb.append(", tag:").append(this.c);
        sb.append("]");
        return sb.toString();
    }
}
