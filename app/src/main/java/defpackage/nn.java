package defpackage;

import android.os.Parcel;

/* access modifiers changed from: package-private */
/* renamed from: nn  reason: default package */
/* compiled from: PG */
public final class nn implements ns {
    private final String a;
    private final int b = 0;
    private final String c;

    nn(String str, String str2) {
        this.a = str;
        this.c = str2;
    }

    @Override // defpackage.ns
    public final void a(mz mzVar) {
        String str = this.a;
        String str2 = this.c;
        Parcel obtain = Parcel.obtain();
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

    public final String toString() {
        StringBuilder sb = new StringBuilder("CancelTask[");
        sb.append("packageName:").append(this.a);
        sb.append(", id:0");
        sb.append(", tag:").append(this.c);
        sb.append(", all:false");
        sb.append("]");
        return sb.toString();
    }
}
