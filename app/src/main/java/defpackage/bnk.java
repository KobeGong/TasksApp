package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bnk  reason: default package */
/* compiled from: PG */
public final class bnk implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new bnd[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = bjr.a(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    i = bjr.d(parcel, readInt);
                    break;
                case 3:
                    str = bjr.h(parcel, readInt);
                    break;
                default:
                    bjr.b(parcel, readInt);
                    break;
            }
        }
        bjr.p(parcel, a);
        return new bnd(i, str);
    }
}
