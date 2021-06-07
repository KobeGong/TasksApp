package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: boq  reason: default package */
/* compiled from: PG */
public final class boq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new bor[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = bjr.a(parcel);
        String str = null;
        bol bol = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    bol = (bol) bjr.a(parcel, readInt, bol.CREATOR);
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
        return new bor(bol, str);
    }
}
