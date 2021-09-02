package defpackage;

/* renamed from: bhm reason: default package */
/* compiled from: PG */
public final class bhm implements android.os.Parcelable.Creator {
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new defpackage.bhl[i];
    }

    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        android.content.Intent intent = null;
        int a = defpackage.bjr.a(parcel);
        int i = 0;
        java.lang.String str = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    i = defpackage.bjr.d(parcel, readInt);
                    break;
                case 3:
                    str = defpackage.bjr.h(parcel, readInt);
                    break;
                case 4:
                    intent = (android.content.Intent) defpackage.bjr.a(parcel, readInt, android.content.Intent.CREATOR);
                    break;
                default:
                    defpackage.bjr.b(parcel, readInt);
                    break;
            }
        }
        defpackage.bjr.p(parcel, a);
        return new defpackage.bhl(i, str, intent);
    }
}
