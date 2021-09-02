package defpackage;

/* renamed from: no reason: default package */
/* compiled from: PG */
final class no implements defpackage.ns {
    private final java.lang.String a;
    private final int b = 0;
    private final java.lang.String c;
    private final android.app.Notification d;

    no(java.lang.String str, java.lang.String str2, android.app.Notification notification) {
        this.a = str;
        this.c = str2;
        this.d = notification;
    }

    public final void a(defpackage.mz mzVar) {
        java.lang.String str = this.a;
        java.lang.String str2 = this.c;
        android.app.Notification notification = this.d;
        android.os.Parcel obtain = android.os.Parcel.obtain();
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

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("NotifyTask[");
        sb.append("packageName:").append(this.a);
        sb.append(", id:0");
        sb.append(", tag:").append(this.c);
        sb.append("]");
        return sb.toString();
    }
}
