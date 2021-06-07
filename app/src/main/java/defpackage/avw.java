package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: avw  reason: default package */
/* compiled from: PG */
public final class avw implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new avx[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = 0;
        int a = bjr.a(parcel);
        Bundle bundle = null;
        int i2 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i2 = bjr.d(parcel, readInt);
                    break;
                case 2:
                    i = bjr.d(parcel, readInt);
                    break;
                case 3:
                    bundle = bjr.j(parcel, readInt);
                    break;
                default:
                    bjr.b(parcel, readInt);
                    break;
            }
        }
        bjr.p(parcel, a);
        return new avx(i2, i, bundle);
    }
}
