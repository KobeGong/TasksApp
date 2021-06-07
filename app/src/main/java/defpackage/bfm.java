package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: bfm  reason: default package */
/* compiled from: PG */
public class bfm extends bkn implements bfl {
    public bfm() {
        attachInterface(this, "com.google.android.gms.dynamic.IObjectWrapper");
    }

    public static bfl a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        if (queryLocalInterface instanceof bfl) {
            return (bfl) queryLocalInterface;
        }
        return new bfn(iBinder);
    }
}
