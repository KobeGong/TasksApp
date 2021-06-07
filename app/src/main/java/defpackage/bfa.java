package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bfa  reason: default package */
/* compiled from: PG */
public final class bfa implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new axq[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = bjr.a(parcel);
        PendingIntent pendingIntent = null;
        int i = 0;
        int i2 = 0;
        String str = null;
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
                    pendingIntent = (PendingIntent) bjr.a(parcel, readInt, PendingIntent.CREATOR);
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
        return new axq(i2, i, pendingIntent, str);
    }
}
