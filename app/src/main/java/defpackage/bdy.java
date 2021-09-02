package defpackage;

/* renamed from: bdy reason: default package */
/* compiled from: PG */
public final class bdy extends defpackage.bkm implements defpackage.bdx {
    public bdy(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    public final boolean a(defpackage.bfj bfj, defpackage.bfl bfl) {
        android.os.Parcel c = c();
        defpackage.bko.a(c, (android.os.Parcelable) bfj);
        defpackage.bko.a(c, (android.os.IInterface) bfl);
        android.os.Parcel a = a(5, c);
        boolean a2 = defpackage.bko.a(a);
        a.recycle();
        return a2;
    }
}
