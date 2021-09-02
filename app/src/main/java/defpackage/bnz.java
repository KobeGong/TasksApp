package defpackage;

/* renamed from: bnz reason: default package */
/* compiled from: PG */
public final class bnz implements android.os.Parcelable.Creator {
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new defpackage.boa[i];
    }

    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int a = defpackage.bjr.a(parcel);
        java.lang.Long l = null;
        defpackage.bol bol = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    bol = (defpackage.bol) defpackage.bjr.a(parcel, readInt, defpackage.bol.CREATOR);
                    break;
                case 3:
                    l = defpackage.bjr.g(parcel, readInt);
                    break;
                default:
                    defpackage.bjr.b(parcel, readInt);
                    break;
            }
        }
        defpackage.bjr.p(parcel, a);
        return new defpackage.boa(bol, l);
    }
}
