package defpackage;

/* renamed from: boe reason: default package */
/* compiled from: PG */
public final class boe implements android.os.Parcelable.Creator {
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.gms.people.protomodel.FetchBackUpDeviceContactInfoResponseEntity[i];
    }

    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int a = defpackage.bjr.a(parcel);
        java.util.ArrayList arrayList = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    arrayList = defpackage.bjr.c(parcel, readInt, defpackage.bnx.CREATOR);
                    break;
                default:
                    defpackage.bjr.b(parcel, readInt);
                    break;
            }
        }
        defpackage.bjr.p(parcel, a);
        return new com.google.android.gms.people.protomodel.FetchBackUpDeviceContactInfoResponseEntity(arrayList);
    }
}
