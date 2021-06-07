package defpackage;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* renamed from: bke  reason: default package */
/* compiled from: PG */
public class bke extends bkn implements bkd {
    public bke() {
        attachInterface(this, "com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (a(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 3:
                bko.a(parcel, axq.CREATOR);
                bko.a(parcel, bkb.CREATOR);
                break;
            case 4:
                bko.a(parcel, Status.CREATOR);
                break;
            case 5:
            default:
                return false;
            case 6:
                bko.a(parcel, Status.CREATOR);
                break;
            case 7:
                bko.a(parcel, Status.CREATOR);
                bko.a(parcel, GoogleSignInAccount.CREATOR);
                break;
            case 8:
                a((bkk) bko.a(parcel, bkk.CREATOR));
                break;
        }
        parcel2.writeNoException();
        return true;
    }

    public bke(byte b) {
        this();
    }

    @Override // defpackage.bkd
    public void a(bkk bkk) {
    }
}
