package defpackage;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: bcw  reason: default package */
/* compiled from: PG */
public final class bcw implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new DataHolder[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Bundle bundle = null;
        int a = bjr.a(parcel);
        int i = 0;
        CursorWindow[] cursorWindowArr = null;
        String[] strArr = null;
        int i2 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    strArr = bjr.n(parcel, readInt);
                    break;
                case 2:
                    cursorWindowArr = (CursorWindow[]) bjr.b(parcel, readInt, CursorWindow.CREATOR);
                    break;
                case 3:
                    i = bjr.d(parcel, readInt);
                    break;
                case 4:
                    bundle = bjr.j(parcel, readInt);
                    break;
                case 1000:
                    i2 = bjr.d(parcel, readInt);
                    break;
                default:
                    bjr.b(parcel, readInt);
                    break;
            }
        }
        bjr.p(parcel, a);
        DataHolder dataHolder = new DataHolder(i2, strArr, cursorWindowArr, i, bundle);
        dataHolder.b = new Bundle();
        for (int i3 = 0; i3 < dataHolder.a.length; i3++) {
            dataHolder.b.putInt(dataHolder.a[i3], i3);
        }
        dataHolder.d = new int[dataHolder.c.length];
        int i4 = 0;
        for (int i5 = 0; i5 < dataHolder.c.length; i5++) {
            dataHolder.d[i5] = i4;
            i4 += dataHolder.c[i5].getNumRows() - (i4 - dataHolder.c[i5].getStartPosition());
        }
        dataHolder.e = i4;
        return dataHolder;
    }
}
