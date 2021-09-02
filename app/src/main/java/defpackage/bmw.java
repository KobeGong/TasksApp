package defpackage;

/* renamed from: bmw reason: default package */
/* compiled from: PG */
public final class bmw implements android.os.Parcelable.Creator {
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new defpackage.bmj[i];
    }

    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        java.lang.String str = null;
        int a = defpackage.bjr.a(parcel);
        java.util.List list = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    list = defpackage.bjr.c(parcel, readInt, defpackage.bmk.CREATOR);
                    break;
                case 3:
                    str = defpackage.bjr.h(parcel, readInt);
                    break;
                default:
                    defpackage.bjr.b(parcel, readInt);
                    break;
            }
        }
        defpackage.bjr.p(parcel, a);
        return new defpackage.bmj(list, str);
    }
}
