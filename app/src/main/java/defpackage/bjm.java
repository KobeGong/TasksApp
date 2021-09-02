package defpackage;

/* renamed from: bjm reason: default package */
/* compiled from: PG */
public final class bjm extends defpackage.bkm implements defpackage.bjk {
    bjm(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.flags.IFlagProvider");
    }

    public final void init(defpackage.bfl bfl) {
        android.os.Parcel c = c();
        defpackage.bko.a(c, (android.os.IInterface) bfl);
        b(1, c);
    }

    public final boolean getBooleanFlagValue(java.lang.String str, boolean z, int i) {
        android.os.Parcel c = c();
        c.writeString(str);
        defpackage.bko.a(c, z);
        c.writeInt(i);
        android.os.Parcel a = a(2, c);
        boolean a2 = defpackage.bko.a(a);
        a.recycle();
        return a2;
    }

    public final int getIntFlagValue(java.lang.String str, int i, int i2) {
        android.os.Parcel c = c();
        c.writeString(str);
        c.writeInt(i);
        c.writeInt(i2);
        android.os.Parcel a = a(3, c);
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    public final long getLongFlagValue(java.lang.String str, long j, int i) {
        android.os.Parcel c = c();
        c.writeString(str);
        c.writeLong(j);
        c.writeInt(i);
        android.os.Parcel a = a(4, c);
        long readLong = a.readLong();
        a.recycle();
        return readLong;
    }

    public final java.lang.String getStringFlagValue(java.lang.String str, java.lang.String str2, int i) {
        android.os.Parcel c = c();
        c.writeString(str);
        c.writeString(str2);
        c.writeInt(i);
        android.os.Parcel a = a(5, c);
        java.lang.String readString = a.readString();
        a.recycle();
        return readString;
    }
}
