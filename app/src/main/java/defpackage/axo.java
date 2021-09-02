package defpackage;

/* renamed from: axo reason: default package */
/* compiled from: PG */
public final class axo implements android.os.Parcelable.Creator {
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new defpackage.awz[i];
    }

    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        long j = 0;
        int a = defpackage.bjr.a(parcel);
        boolean z = false;
        long j2 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    z = defpackage.bjr.c(parcel, readInt);
                    break;
                case 2:
                    j = defpackage.bjr.f(parcel, readInt);
                    break;
                case 3:
                    j2 = defpackage.bjr.f(parcel, readInt);
                    break;
                default:
                    defpackage.bjr.b(parcel, readInt);
                    break;
            }
        }
        defpackage.bjr.p(parcel, a);
        return new defpackage.awz(z, j2, j);
    }
}
