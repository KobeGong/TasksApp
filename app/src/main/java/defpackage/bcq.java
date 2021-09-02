package defpackage;

/* renamed from: bcq reason: default package */
/* compiled from: PG */
public final class bcq implements android.os.Parcelable.Creator {
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.gms.common.api.Status[i];
    }

    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        android.app.PendingIntent pendingIntent = null;
        int a = defpackage.bjr.a(parcel);
        int i = 0;
        int i2 = 0;
        java.lang.String str = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = defpackage.bjr.d(parcel, readInt);
                    break;
                case 2:
                    str = defpackage.bjr.h(parcel, readInt);
                    break;
                case 3:
                    pendingIntent = (android.app.PendingIntent) defpackage.bjr.a(parcel, readInt, android.app.PendingIntent.CREATOR);
                    break;
                case 1000:
                    i2 = defpackage.bjr.d(parcel, readInt);
                    break;
                default:
                    defpackage.bjr.b(parcel, readInt);
                    break;
            }
        }
        defpackage.bjr.p(parcel, a);
        return new com.google.android.gms.common.api.Status(i2, i, str, pendingIntent);
    }
}
