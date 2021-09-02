package defpackage;

/* renamed from: bhn reason: default package */
/* compiled from: PG */
public final class bhn implements android.os.Parcelable.Creator {
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.gms.googlehelp.internal.common.TogglingData[i];
    }

    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        java.lang.String str = null;
        int a = defpackage.bjr.a(parcel);
        java.lang.String str2 = null;
        java.lang.String str3 = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    str3 = defpackage.bjr.h(parcel, readInt);
                    break;
                case 3:
                    str2 = defpackage.bjr.h(parcel, readInt);
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
        return new com.google.android.gms.googlehelp.internal.common.TogglingData(str3, str2, str);
    }
}
