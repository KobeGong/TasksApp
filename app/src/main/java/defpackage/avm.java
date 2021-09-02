package defpackage;

/* renamed from: avm reason: default package */
/* compiled from: PG */
public final class avm implements android.os.Parcelable.Creator {
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.gms.auth.api.credentials.PasswordSpecification[i];
    }

    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int a = defpackage.bjr.a(parcel);
        int i = 0;
        int i2 = 0;
        java.util.ArrayList arrayList = null;
        java.util.List list = null;
        java.lang.String str = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    str = defpackage.bjr.h(parcel, readInt);
                    break;
                case 2:
                    list = defpackage.bjr.o(parcel, readInt);
                    break;
                case 3:
                    int a2 = defpackage.bjr.a(parcel, readInt);
                    int dataPosition = parcel.dataPosition();
                    if (a2 != 0) {
                        arrayList = new java.util.ArrayList();
                        int readInt2 = parcel.readInt();
                        for (int i3 = 0; i3 < readInt2; i3++) {
                            arrayList.add(java.lang.Integer.valueOf(parcel.readInt()));
                        }
                        parcel.setDataPosition(dataPosition + a2);
                        break;
                    } else {
                        arrayList = null;
                        break;
                    }
                case 4:
                    i2 = defpackage.bjr.d(parcel, readInt);
                    break;
                case 5:
                    i = defpackage.bjr.d(parcel, readInt);
                    break;
                default:
                    defpackage.bjr.b(parcel, readInt);
                    break;
            }
        }
        defpackage.bjr.p(parcel, a);
        return new com.google.android.gms.auth.api.credentials.PasswordSpecification(str, list, arrayList, i2, i);
    }
}
