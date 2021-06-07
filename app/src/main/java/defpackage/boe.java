package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.protomodel.FetchBackUpDeviceContactInfoResponseEntity;
import java.util.ArrayList;

/* renamed from: boe  reason: default package */
/* compiled from: PG */
public final class boe implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new FetchBackUpDeviceContactInfoResponseEntity[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = bjr.a(parcel);
        ArrayList arrayList = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    arrayList = bjr.c(parcel, readInt, bnx.CREATOR);
                    break;
                default:
                    bjr.b(parcel, readInt);
                    break;
            }
        }
        bjr.p(parcel, a);
        return new FetchBackUpDeviceContactInfoResponseEntity(arrayList);
    }
}
