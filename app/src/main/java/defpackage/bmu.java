package defpackage;

/* renamed from: bmu reason: default package */
/* compiled from: PG */
public final class bmu implements android.os.Parcelable.Creator {
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new defpackage.bmh[i];
    }

    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int a = defpackage.bjr.a(parcel);
        int i = 0;
        java.util.ArrayList arrayList = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    i = defpackage.bjr.d(parcel, readInt);
                    break;
                case 3:
                    arrayList = defpackage.bjr.c(parcel, readInt, defpackage.bmm.CREATOR);
                    break;
                default:
                    defpackage.bjr.b(parcel, readInt);
                    break;
            }
        }
        defpackage.bjr.p(parcel, a);
        return new defpackage.bmh(i, arrayList);
    }
}
