package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* renamed from: awc  reason: default package */
/* compiled from: PG */
public class awc extends bkn implements IInterface {
    public awc() {
        attachInterface(this, "com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (a(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 101:
                bko.a(parcel, GoogleSignInAccount.CREATOR);
                bko.a(parcel, Status.CREATOR);
                throw new UnsupportedOperationException();
            case 102:
                bko.a(parcel, Status.CREATOR);
                throw new UnsupportedOperationException();
            case 103:
                a((Status) bko.a(parcel, Status.CREATOR));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }

    public awc(byte b) {
        this();
    }

    public void a(Status status) {
        throw new UnsupportedOperationException();
    }
}
