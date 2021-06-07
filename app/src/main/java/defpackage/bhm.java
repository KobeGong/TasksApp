package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bhm  reason: default package */
/* compiled from: PG */
public final class bhm implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new bhl[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Intent intent = null;
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
                case 4:
                    intent = (Intent) bjr.a(parcel, readInt, Intent.CREATOR);
                    break;
                default:
                    bjr.b(parcel, readInt);
                    break;
            }
        }
        bjr.p(parcel, a);
        return new bhl(i, str, intent);
    }
}
