package defpackage;

/* renamed from: bnb reason: default package */
/* compiled from: PG */
public final class bnb implements android.os.Parcelable.Creator {
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new defpackage.bmo[i];
    }

    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int a = defpackage.bjr.a(parcel);
        boolean z = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    z = defpackage.bjr.c(parcel, readInt);
                    break;
                default:
                    defpackage.bjr.b(parcel, readInt);
                    break;
            }
        }
        defpackage.bjr.p(parcel, a);
        return new defpackage.bmo(z);
    }
}
