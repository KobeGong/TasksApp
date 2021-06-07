package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: bjm  reason: default package */
/* compiled from: PG */
public final class bjm extends bkm implements bjk {
    bjm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.flags.IFlagProvider");
    }

    @Override // defpackage.bjk
    public final void init(bfl bfl) {
        Parcel c = c();
        bko.a(c, bfl);
        b(1, c);
    }

    @Override // defpackage.bjk
    public final boolean getBooleanFlagValue(String str, boolean z, int i) {
        Parcel c = c();
        c.writeString(str);
        bko.a(c, z);
        c.writeInt(i);
        Parcel a = a(2, c);
        boolean a2 = bko.a(a);
        a.recycle();
        return a2;
    }

    @Override // defpackage.bjk
    public final int getIntFlagValue(String str, int i, int i2) {
        Parcel c = c();
        c.writeString(str);
        c.writeInt(i);
        c.writeInt(i2);
        Parcel a = a(3, c);
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    @Override // defpackage.bjk
    public final long getLongFlagValue(String str, long j, int i) {
        Parcel c = c();
        c.writeString(str);
        c.writeLong(j);
        c.writeInt(i);
        Parcel a = a(4, c);
        long readLong = a.readLong();
        a.recycle();
        return readLong;
    }

    @Override // defpackage.bjk
    public final String getStringFlagValue(String str, String str2, int i) {
        Parcel c = c();
        c.writeString(str);
        c.writeString(str2);
        c.writeInt(i);
        Parcel a = a(5, c);
        String readString = a.readString();
        a.recycle();
        return readString;
    }
}
