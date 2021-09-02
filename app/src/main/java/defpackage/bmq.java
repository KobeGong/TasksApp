package defpackage;

/* renamed from: bmq reason: default package */
/* compiled from: PG */
public final class bmq implements android.os.Parcelable.Creator {
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new defpackage.bmp[i];
    }

    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        java.lang.String str = null;
        int a = defpackage.bjr.a(parcel);
        long j = 0;
        byte[] bArr = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    bArr = defpackage.bjr.k(parcel, readInt);
                    break;
                case 3:
                    j = defpackage.bjr.f(parcel, readInt);
                    break;
                case 4:
                    str = defpackage.bjr.h(parcel, readInt);
                    break;
                default:
                    defpackage.bjr.b(parcel, readInt);
                    break;
            }
        }
        defpackage.bjr.p(parcel, a);
        return new defpackage.bmp(bArr, j, str);
    }
}
