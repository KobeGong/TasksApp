package defpackage;

/* renamed from: awe reason: default package */
/* compiled from: PG */
public final class awe extends defpackage.bkm implements defpackage.awd {
    awe(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    public final void a(defpackage.awb awb, com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions) {
        android.os.Parcel c = c();
        defpackage.bko.a(c, (android.os.IInterface) awb);
        defpackage.bko.a(c, (android.os.Parcelable) googleSignInOptions);
        b(103, c);
    }
}
