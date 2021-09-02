package defpackage;

/* renamed from: bkj reason: default package */
/* compiled from: PG */
public final class bkj implements android.os.Parcelable.Creator {
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new defpackage.bki[i];
    }

    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int a = defpackage.bjr.a(parcel);
        int i = 0;
        defpackage.beb beb = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = defpackage.bjr.d(parcel, readInt);
                    break;
                case 2:
                    beb = (defpackage.beb) defpackage.bjr.a(parcel, readInt, defpackage.beb.CREATOR);
                    break;
                default:
                    defpackage.bjr.b(parcel, readInt);
                    break;
            }
        }
        defpackage.bjr.p(parcel, a);
        return new defpackage.bki(i, beb);
    }
}
