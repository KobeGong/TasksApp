package defpackage;

/* renamed from: bno reason: default package */
/* compiled from: PG */
public final class bno extends defpackage.bkm implements defpackage.bnn {
    bno(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.people.internal.IPeopleService");
    }

    public final void a(defpackage.bnl bnl, boolean z, int i) {
        android.os.Parcel c = c();
        defpackage.bko.a(c, (android.os.IInterface) bnl);
        defpackage.bko.a(c, false);
        defpackage.bko.a(c, z);
        c.writeString(null);
        c.writeString(null);
        c.writeInt(i);
        b(305, c);
    }

    public final android.os.Bundle a(defpackage.bnl bnl, boolean z, java.lang.String str, java.lang.String str2, int i) {
        android.os.Parcel c = c();
        defpackage.bko.a(c, (android.os.IInterface) bnl);
        defpackage.bko.a(c, z);
        c.writeString(str);
        c.writeString(str2);
        c.writeInt(i);
        android.os.Parcel a = a(11, c);
        android.os.Bundle bundle = (android.os.Bundle) defpackage.bko.a(a, android.os.Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    public final defpackage.bet a(defpackage.bnl bnl, java.lang.String str, java.lang.String str2, int i, int i2) {
        defpackage.bet beu;
        android.os.Parcel c = c();
        defpackage.bko.a(c, (android.os.IInterface) bnl);
        c.writeString(str);
        c.writeString(str2);
        c.writeInt(i);
        c.writeInt(i2);
        android.os.Parcel a = a(505, c);
        android.os.IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            beu = null;
        } else {
            android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.common.internal.ICancelToken");
            if (queryLocalInterface instanceof defpackage.bet) {
                beu = (defpackage.bet) queryLocalInterface;
            } else {
                beu = new defpackage.beu(readStrongBinder);
            }
        }
        a.recycle();
        return beu;
    }
}
