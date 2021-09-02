package defpackage;

/* renamed from: bmx reason: default package */
/* compiled from: PG */
public final class bmx implements android.os.Parcelable.Creator {
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new defpackage.bmk[i];
    }

    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int i = 0;
        int a = defpackage.bjr.a(parcel);
        int i2 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    i2 = defpackage.bjr.d(parcel, readInt);
                    break;
                case 3:
                    i = defpackage.bjr.d(parcel, readInt);
                    break;
                default:
                    defpackage.bjr.b(parcel, readInt);
                    break;
            }
        }
        defpackage.bjr.p(parcel, a);
        return new defpackage.bmk(i2, i);
    }
}
