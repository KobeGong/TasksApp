package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bkc  reason: default package */
/* compiled from: PG */
public final class bkc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new bkb[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = 0;
        int a = bjr.a(parcel);
        Intent intent = null;
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
                    intent = (Intent) bjr.a(parcel, readInt, Intent.CREATOR);
                    break;
                default:
                    bjr.b(parcel, readInt);
                    break;
            }
        }
        bjr.p(parcel, a);
        return new bkb(i2, i, intent);
    }
}
