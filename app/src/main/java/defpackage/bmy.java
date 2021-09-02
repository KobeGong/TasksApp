package defpackage;

/* renamed from: bmy reason: default package */
/* compiled from: PG */
public final class bmy implements android.os.Parcelable.Creator {
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new defpackage.bml[i];
    }

    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        java.lang.String str = null;
        int a = defpackage.bjr.a(parcel);
        defpackage.bmj bmj = null;
        java.lang.String str2 = null;
        java.lang.String str3 = null;
        java.lang.String str4 = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    str4 = defpackage.bjr.h(parcel, readInt);
                    break;
                case 3:
                    str3 = defpackage.bjr.h(parcel, readInt);
                    break;
                case 4:
                    str2 = defpackage.bjr.h(parcel, readInt);
                    break;
                case 5:
                    bmj = (defpackage.bmj) defpackage.bjr.a(parcel, readInt, defpackage.bmj.CREATOR);
                    break;
                case 6:
                    str = defpackage.bjr.h(parcel, readInt);
                    break;
                default:
                    defpackage.bjr.b(parcel, readInt);
                    break;
            }
        }
        defpackage.bjr.p(parcel, a);
        return new defpackage.bml(str4, str3, str2, bmj, str);
    }
}
