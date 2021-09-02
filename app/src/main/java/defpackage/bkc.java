package defpackage;

/* renamed from: bkc reason: default package */
/* compiled from: PG */
public final class bkc implements android.os.Parcelable.Creator {
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new defpackage.bkb[i];
    }

    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int i = 0;
        int a = defpackage.bjr.a(parcel);
        android.content.Intent intent = null;
        int i2 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i2 = defpackage.bjr.d(parcel, readInt);
                    break;
                case 2:
                    i = defpackage.bjr.d(parcel, readInt);
                    break;
                case 3:
                    intent = (android.content.Intent) defpackage.bjr.a(parcel, readInt, android.content.Intent.CREATOR);
                    break;
                default:
                    defpackage.bjr.b(parcel, readInt);
                    break;
            }
        }
        defpackage.bjr.p(parcel, a);
        return new defpackage.bkb(i2, i, intent);
    }
}
