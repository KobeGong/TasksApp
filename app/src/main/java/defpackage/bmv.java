package defpackage;

/* renamed from: bmv reason: default package */
/* compiled from: PG */
public final class bmv implements android.os.Parcelable.Creator {
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new defpackage.bmi[i];
    }

    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        java.util.ArrayList arrayList = null;
        int a = defpackage.bjr.a(parcel);
        java.lang.String str = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    str = defpackage.bjr.h(parcel, readInt);
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
        return new defpackage.bmi(str, arrayList);
    }
}
