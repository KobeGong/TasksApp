package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.TokenData;
import java.util.ArrayList;

/* renamed from: aws  reason: default package */
/* compiled from: PG */
public final class aws implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new TokenData[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        ArrayList arrayList = null;
        boolean z = false;
        int a = bjr.a(parcel);
        boolean z2 = false;
        Long l = null;
        String str = null;
        int i = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = bjr.d(parcel, readInt);
                    break;
                case 2:
                    str = bjr.h(parcel, readInt);
                    break;
                case 3:
                    l = bjr.g(parcel, readInt);
                    break;
                case 4:
                    z2 = bjr.c(parcel, readInt);
                    break;
                case 5:
                    z = bjr.c(parcel, readInt);
                    break;
                case 6:
                    arrayList = bjr.o(parcel, readInt);
                    break;
                default:
                    bjr.b(parcel, readInt);
                    break;
            }
        }
        bjr.p(parcel, a);
        return new TokenData(i, str, l, z2, z, arrayList);
    }
}
