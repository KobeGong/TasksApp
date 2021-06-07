package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bmq  reason: default package */
/* compiled from: PG */
public final class bmq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new bmp[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        String str = null;
        int a = bjr.a(parcel);
        long j = 0;
        byte[] bArr = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    bArr = bjr.k(parcel, readInt);
                    break;
                case 3:
                    j = bjr.f(parcel, readInt);
                    break;
                case 4:
                    str = bjr.h(parcel, readInt);
                    break;
                default:
                    bjr.b(parcel, readInt);
                    break;
            }
        }
        bjr.p(parcel, a);
        return new bmp(bArr, j, str);
    }
}
