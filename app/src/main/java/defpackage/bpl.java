package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bpl  reason: default package */
/* compiled from: PG */
public final class bpl implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new box[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        byte[][] bArr = null;
        int a = bjr.a(parcel);
        int[] iArr = null;
        byte[][] bArr2 = null;
        byte[][] bArr3 = null;
        byte[][] bArr4 = null;
        byte[][] bArr5 = null;
        byte[] bArr6 = null;
        String str = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    str = bjr.h(parcel, readInt);
                    break;
                case 3:
                    bArr6 = bjr.k(parcel, readInt);
                    break;
                case 4:
                    bArr5 = bjr.l(parcel, readInt);
                    break;
                case 5:
                    bArr4 = bjr.l(parcel, readInt);
                    break;
                case 6:
                    bArr3 = bjr.l(parcel, readInt);
                    break;
                case 7:
                    bArr2 = bjr.l(parcel, readInt);
                    break;
                case 8:
                    iArr = bjr.m(parcel, readInt);
                    break;
                case 9:
                    bArr = bjr.l(parcel, readInt);
                    break;
                default:
                    bjr.b(parcel, readInt);
                    break;
            }
        }
        bjr.p(parcel, a);
        return new box(str, bArr6, bArr5, bArr4, bArr3, bArr2, iArr, bArr);
    }
}
