package defpackage;

/* renamed from: awc reason: default package */
/* compiled from: PG */
public class awc extends defpackage.bkn implements android.os.IInterface {
    public awc() {
        attachInterface(this, "com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    public boolean onTransact(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) {
        if (a(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 101:
                defpackage.bko.a(parcel, com.google.android.gms.auth.api.signin.GoogleSignInAccount.CREATOR);
                defpackage.bko.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                throw new java.lang.UnsupportedOperationException();
            case 102:
                defpackage.bko.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                throw new java.lang.UnsupportedOperationException();
            case 103:
                a((com.google.android.gms.common.api.Status) defpackage.bko.a(parcel, com.google.android.gms.common.api.Status.CREATOR));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }

    public awc(byte b) {
        this();
    }

    public void a(com.google.android.gms.common.api.Status status) {
        throw new java.lang.UnsupportedOperationException();
    }
}
