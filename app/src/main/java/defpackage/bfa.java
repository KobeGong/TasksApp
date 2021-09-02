package defpackage;

/* renamed from: bfa reason: default package */
/* compiled from: PG */
public final class bfa implements android.os.Parcelable.Creator {
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new defpackage.axq[i];
    }

    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int a = defpackage.bjr.a(parcel);
        android.app.PendingIntent pendingIntent = null;
        int i = 0;
        int i2 = 0;
        java.lang.String str = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i2 = defpackage.bjr.d(parcel, readInt);
                    break;
                case 2:
                    i = defpackage.bjr.d(parcel, readInt);
                    break;
                case 3:
                    pendingIntent = (android.app.PendingIntent) defpackage.bjr.a(parcel, readInt, android.app.PendingIntent.CREATOR);
                    break;
                case 4:
                    str = defpackage.bjr.h(parcel, readInt);
                    break;
                default:
                    defpackage.bjr.b(parcel, readInt);
                    break;
            }
        }
        defpackage.bjr.p(parcel, a);
        return new defpackage.axq(i2, i, pendingIntent, str);
    }
}
