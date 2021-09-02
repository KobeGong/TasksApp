package defpackage;

/* renamed from: bmt reason: default package */
/* compiled from: PG */
public final class bmt implements android.os.Parcelable.Creator {
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new defpackage.bmg[i];
    }

    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int a = defpackage.bjr.a(parcel);
        boolean z = false;
        java.lang.String str = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    z = defpackage.bjr.c(parcel, readInt);
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
        return new defpackage.bmg(z, str);
    }
}
