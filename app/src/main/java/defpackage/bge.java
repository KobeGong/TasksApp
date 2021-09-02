package defpackage;

/* renamed from: bge reason: default package */
/* compiled from: PG */
public final class bge extends defpackage.bkm implements defpackage.bgd {
    public bge(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final defpackage.bfl a(defpackage.bfl bfl, java.lang.String str, int i) {
        android.os.Parcel c = c();
        defpackage.bko.a(c, (android.os.IInterface) bfl);
        c.writeString(str);
        c.writeInt(i);
        android.os.Parcel a = a(2, c);
        defpackage.bfl a2 = defpackage.bfm.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final int a(defpackage.bfl bfl, java.lang.String str, boolean z) {
        android.os.Parcel c = c();
        defpackage.bko.a(c, (android.os.IInterface) bfl);
        c.writeString(str);
        defpackage.bko.a(c, z);
        android.os.Parcel a = a(3, c);
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }
}
