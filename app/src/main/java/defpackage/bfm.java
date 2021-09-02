package defpackage;

/* renamed from: bfm reason: default package */
/* compiled from: PG */
public class bfm extends defpackage.bkn implements defpackage.bfl {
    public bfm() {
        attachInterface(this, "com.google.android.gms.dynamic.IObjectWrapper");
    }

    public static defpackage.bfl a(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        if (queryLocalInterface instanceof defpackage.bfl) {
            return (defpackage.bfl) queryLocalInterface;
        }
        return new defpackage.bfn(iBinder);
    }
}
