package defpackage;

import android.content.Context;
import android.os.Binder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* renamed from: awa  reason: default package */
/* compiled from: PG */
public final class awa extends bkn implements IInterface {
    private final Context a;

    public awa() {
        attachInterface(this, "com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (a(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                a();
                awg a2 = awg.a(this.a);
                GoogleSignInAccount a3 = a2.a();
                GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.d;
                if (a3 != null) {
                    googleSignInOptions = a2.b();
                }
                ayp a4 = new ayq(this.a).a(avg.a, googleSignInOptions).a();
                try {
                    if (a4.f().b()) {
                        if (a3 != null) {
                            Context b = a4.b();
                            avt.a.a("Revoking access", new Object[0]);
                            avt.a(b);
                            a4.b(new avv(a4, (byte) 0));
                        } else {
                            a4.i();
                        }
                    }
                    break;
                } finally {
                    a4.g();
                }
            case 2:
                a();
                avy.a(this.a).a();
                break;
            default:
                return false;
        }
        return true;
    }

    public awa(Context context) {
        this();
        this.a = context;
    }

    private final void a() {
        if (!axy.a(this.a, Binder.getCallingUid())) {
            throw new SecurityException(new StringBuilder(52).append("Calling UID ").append(Binder.getCallingUid()).append(" is not Google Play services.").toString());
        }
    }
}
