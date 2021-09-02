package defpackage;

/* renamed from: axp reason: default package */
/* compiled from: PG */
public final class axp implements android.os.Parcelable.Creator {
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new defpackage.axa[i];
    }

    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        defpackage.box[] boxArr = null;
        int a = defpackage.bjr.a(parcel);
        boolean z = true;
        byte[][] bArr = null;
        int[] iArr = null;
        java.lang.String[] strArr = null;
        int[] iArr2 = null;
        byte[] bArr2 = null;
        defpackage.axb axb = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    axb = (defpackage.axb) defpackage.bjr.a(parcel, readInt, defpackage.axb.CREATOR);
                    break;
                case 3:
                    bArr2 = defpackage.bjr.k(parcel, readInt);
                    break;
                case 4:
                    iArr2 = defpackage.bjr.m(parcel, readInt);
                    break;
                case 5:
                    strArr = defpackage.bjr.n(parcel, readInt);
                    break;
                case 6:
                    iArr = defpackage.bjr.m(parcel, readInt);
                    break;
                case 7:
                    bArr = defpackage.bjr.l(parcel, readInt);
                    break;
                case 8:
                    z = defpackage.bjr.c(parcel, readInt);
                    break;
                case 9:
                    boxArr = (defpackage.box[]) defpackage.bjr.b(parcel, readInt, defpackage.box.CREATOR);
                    break;
                default:
                    defpackage.bjr.b(parcel, readInt);
                    break;
            }
        }
        defpackage.bjr.p(parcel, a);
        return new defpackage.axa(axb, bArr2, iArr2, strArr, iArr, bArr, z, boxArr);
    }
}
