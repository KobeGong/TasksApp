package defpackage;

/* renamed from: bkg reason: default package */
/* compiled from: PG */
public final class bkg extends defpackage.bkm implements defpackage.bkf {
    bkg(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void a(int i) {
        android.os.Parcel c = c();
        c.writeInt(i);
        b(7, c);
    }

    public final void a(defpackage.bdp bdp, int i, boolean z) {
        android.os.Parcel c = c();
        defpackage.bko.a(c, (android.os.IInterface) bdp);
        c.writeInt(i);
        defpackage.bko.a(c, z);
        b(9, c);
    }

    public final void a(defpackage.bki bki, defpackage.bkd bkd) {
        android.os.Parcel c = c();
        defpackage.bko.a(c, (android.os.Parcelable) bki);
        defpackage.bko.a(c, (android.os.IInterface) bkd);
        b(12, c);
    }
}
