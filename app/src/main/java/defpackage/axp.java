package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: axp  reason: default package */
/* compiled from: PG */
public final class axp implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new axa[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        box[] boxArr = null;
        int a = bjr.a(parcel);
        boolean z = true;
        byte[][] bArr = null;
        int[] iArr = null;
        String[] strArr = null;
        int[] iArr2 = null;
        byte[] bArr2 = null;
        axb axb = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    axb = (axb) bjr.a(parcel, readInt, axb.CREATOR);
                    break;
                case 3:
                    bArr2 = bjr.k(parcel, readInt);
                    break;
                case 4:
                    iArr2 = bjr.m(parcel, readInt);
                    break;
                case 5:
                    strArr = bjr.n(parcel, readInt);
                    break;
                case 6:
                    iArr = bjr.m(parcel, readInt);
                    break;
                case 7:
                    bArr = bjr.l(parcel, readInt);
                    break;
                case 8:
                    z = bjr.c(parcel, readInt);
                    break;
                case 9:
                    boxArr = (box[]) bjr.b(parcel, readInt, box.CREATOR);
                    break;
                default:
                    bjr.b(parcel, readInt);
                    break;
            }
        }
        bjr.p(parcel, a);
        return new axa(axb, bArr2, iArr2, strArr, iArr, bArr, z, boxArr);
    }
}
