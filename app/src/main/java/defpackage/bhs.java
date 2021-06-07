package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bhs  reason: default package */
/* compiled from: PG */
public final class bhs implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new bhq[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        String str = null;
        int a = bjr.a(parcel);
        String str2 = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    str2 = bjr.h(parcel, readInt);
                    break;
                case 2:
                    str = bjr.h(parcel, readInt);
                    break;
                default:
                    bjr.b(parcel, readInt);
                    break;
            }
        }
        bjr.p(parcel, a);
        return new bhq(str2, str);
    }
}
