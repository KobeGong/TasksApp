package defpackage;

/* renamed from: bgg reason: default package */
/* compiled from: PG */
public final class bgg extends defpackage.bkm implements defpackage.bgf {
    public bgg(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final defpackage.bfl a(defpackage.bfl bfl, java.lang.String str, int i, defpackage.bfl bfl2) {
        android.os.Parcel c = c();
        defpackage.bko.a(c, (android.os.IInterface) bfl);
        c.writeString(str);
        c.writeInt(i);
        defpackage.bko.a(c, (android.os.IInterface) bfl2);
        android.os.Parcel a = a(2, c);
        defpackage.bfl a2 = defpackage.bfm.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }
}
