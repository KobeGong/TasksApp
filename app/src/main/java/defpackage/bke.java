package defpackage;

/* renamed from: bke reason: default package */
/* compiled from: PG */
public class bke extends defpackage.bkn implements defpackage.bkd {
    public bke() {
        attachInterface(this, "com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    public boolean onTransact(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) {
        if (a(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 3:
                defpackage.bko.a(parcel, defpackage.axq.CREATOR);
                defpackage.bko.a(parcel, defpackage.bkb.CREATOR);
                break;
            case 4:
                defpackage.bko.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                break;
            case 6:
                defpackage.bko.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                break;
            case 7:
                defpackage.bko.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                defpackage.bko.a(parcel, com.google.android.gms.auth.api.signin.GoogleSignInAccount.CREATOR);
                break;
            case 8:
                a((defpackage.bkk) defpackage.bko.a(parcel, defpackage.bkk.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }

    public bke(byte b) {
        this();
    }

    public void a(defpackage.bkk bkk) {
    }
}
