package defpackage;

/* renamed from: bfk reason: default package */
/* compiled from: PG */
public final class bfk implements android.os.Parcelable.Creator {
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new defpackage.bfj[i];
    }

    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        android.os.IBinder iBinder = null;
        int a = defpackage.bjr.a(parcel);
        boolean z = false;
        java.lang.String str = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    str = defpackage.bjr.h(parcel, readInt);
                    break;
                case 2:
                    iBinder = defpackage.bjr.i(parcel, readInt);
                    break;
                case 3:
                    z = defpackage.bjr.c(parcel, readInt);
                    break;
                default:
                    defpackage.bjr.b(parcel, readInt);
                    break;
            }
        }
        defpackage.bjr.p(parcel, a);
        return new defpackage.bfj(str, iBinder, z);
    }
}
