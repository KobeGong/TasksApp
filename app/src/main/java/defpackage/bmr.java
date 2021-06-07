package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bmr  reason: default package */
/* compiled from: PG */
public final class bmr implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new bme[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = bjr.a(parcel);
        bmm bmm = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    bmm = (bmm) bjr.a(parcel, readInt, bmm.CREATOR);
                    break;
                default:
                    bjr.b(parcel, readInt);
                    break;
            }
        }
        bjr.p(parcel, a);
        return new bme(bmm);
    }
}
