package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* renamed from: awe  reason: default package */
/* compiled from: PG */
public final class awe extends bkm implements awd {
    awe(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    @Override // defpackage.awd
    public final void a(awb awb, GoogleSignInOptions googleSignInOptions) {
        Parcel c = c();
        bko.a(c, awb);
        bko.a(c, googleSignInOptions);
        b(103, c);
    }
}
