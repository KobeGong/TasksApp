package defpackage;

/* renamed from: bee reason: default package */
/* compiled from: PG */
public final class bee implements android.os.Parcelable.Creator {
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new defpackage.bed[i];
    }

    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        defpackage.axq axq = null;
        boolean z = false;
        int a = defpackage.bjr.a(parcel);
        boolean z2 = false;
        android.os.IBinder iBinder = null;
        int i = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = defpackage.bjr.d(parcel, readInt);
                    break;
                case 2:
                    iBinder = defpackage.bjr.i(parcel, readInt);
                    break;
                case 3:
                    axq = (defpackage.axq) defpackage.bjr.a(parcel, readInt, defpackage.axq.CREATOR);
                    break;
                case 4:
                    z2 = defpackage.bjr.c(parcel, readInt);
                    break;
                case 5:
                    z = defpackage.bjr.c(parcel, readInt);
                    break;
                default:
                    defpackage.bjr.b(parcel, readInt);
                    break;
            }
        }
        defpackage.bjr.p(parcel, a);
        return new defpackage.bed(i, iBinder, axq, z2, z);
    }
}
