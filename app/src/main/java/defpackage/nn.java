package defpackage;

/* renamed from: nn reason: default package */
/* compiled from: PG */
final class nn implements defpackage.ns {
    private final java.lang.String a;
    private final int b = 0;
    private final java.lang.String c;

    nn(java.lang.String str, java.lang.String str2) {
        this.a = str;
        this.c = str2;
    }

    public final void a(defpackage.mz mzVar) {
        java.lang.String str = this.a;
        java.lang.String str2 = this.c;
        android.os.Parcel obtain = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
            obtain.writeString(str);
            obtain.writeInt(0);
            obtain.writeString(str2);
            mzVar.a.transact(2, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CancelTask[");
        sb.append("packageName:").append(this.a);
        sb.append(", id:0");
        sb.append(", tag:").append(this.c);
        sb.append(", all:false");
        sb.append("]");
        return sb.toString();
    }
}
