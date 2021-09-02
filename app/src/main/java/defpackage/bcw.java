package defpackage;

/* renamed from: bcw reason: default package */
/* compiled from: PG */
public final class bcw implements android.os.Parcelable.Creator {
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.gms.common.data.DataHolder[i];
    }

    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        android.os.Bundle bundle = null;
        int a = defpackage.bjr.a(parcel);
        int i = 0;
        android.database.CursorWindow[] cursorWindowArr = null;
        java.lang.String[] strArr = null;
        int i2 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    strArr = defpackage.bjr.n(parcel, readInt);
                    break;
                case 2:
                    cursorWindowArr = (android.database.CursorWindow[]) defpackage.bjr.b(parcel, readInt, android.database.CursorWindow.CREATOR);
                    break;
                case 3:
                    i = defpackage.bjr.d(parcel, readInt);
                    break;
                case 4:
                    bundle = defpackage.bjr.j(parcel, readInt);
                    break;
                case 1000:
                    i2 = defpackage.bjr.d(parcel, readInt);
                    break;
                default:
                    defpackage.bjr.b(parcel, readInt);
                    break;
            }
        }
        defpackage.bjr.p(parcel, a);
        com.google.android.gms.common.data.DataHolder dataHolder = new com.google.android.gms.common.data.DataHolder(i2, strArr, cursorWindowArr, i, bundle);
        dataHolder.b = new android.os.Bundle();
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
