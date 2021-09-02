package defpackage;

/* renamed from: bpl reason: default package */
/* compiled from: PG */
public final class bpl implements android.os.Parcelable.Creator {
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new defpackage.box[i];
    }

    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        byte[][] bArr = null;
        int a = defpackage.bjr.a(parcel);
        int[] iArr = null;
        byte[][] bArr2 = null;
        byte[][] bArr3 = null;
        byte[][] bArr4 = null;
        byte[][] bArr5 = null;
        byte[] bArr6 = null;
        java.lang.String str = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    str = defpackage.bjr.h(parcel, readInt);
                    break;
                case 3:
                    bArr6 = defpackage.bjr.k(parcel, readInt);
                    break;
                case 4:
                    bArr5 = defpackage.bjr.l(parcel, readInt);
                    break;
                case 5:
                    bArr4 = defpackage.bjr.l(parcel, readInt);
                    break;
                case 6:
                    bArr3 = defpackage.bjr.l(parcel, readInt);
                    break;
                case 7:
                    bArr2 = defpackage.bjr.l(parcel, readInt);
                    break;
                case 8:
                    iArr = defpackage.bjr.m(parcel, readInt);
                    break;
                case 9:
                    bArr = defpackage.bjr.l(parcel, readInt);
                    break;
                default:
                    defpackage.bjr.b(parcel, readInt);
                    break;
            }
        }
        defpackage.bjr.p(parcel, a);
        return new defpackage.box(str, bArr6, bArr5, bArr4, bArr3, bArr2, iArr, bArr);
    }
}
