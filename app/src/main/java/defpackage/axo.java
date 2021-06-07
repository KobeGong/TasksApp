package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: axo  reason: default package */
/* compiled from: PG */
public final class axo implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new awz[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        long j = 0;
        int a = bjr.a(parcel);
        boolean z = false;
        long j2 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    z = bjr.c(parcel, readInt);
                    break;
                case 2:
                    j = bjr.f(parcel, readInt);
                    break;
                case 3:
                    j2 = bjr.f(parcel, readInt);
                    break;
                default:
                    bjr.b(parcel, readInt);
                    break;
            }
        }
        bjr.p(parcel, a);
        return new awz(z, j2, j);
    }
}
