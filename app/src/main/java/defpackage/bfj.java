package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: bfj  reason: default package */
/* compiled from: PG */
public final class bfj extends biq {
    public static final Parcelable.Creator CREATOR = new bfk();
    private final String a;
    private final bfd b;
    private final boolean c;

    bfj(String str, IBinder iBinder, boolean z) {
        this.a = str;
        this.b = a(iBinder);
        this.c = z;
    }

    bfj(String str, bfd bfd, boolean z) {
        this.a = str;
        this.b = bfd;
        this.c = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder asBinder;
        int q = bjr.q(parcel, 20293);
        bjr.a(parcel, 1, this.a);
        if (this.b == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            asBinder = null;
        } else {
            asBinder = this.b.asBinder();
        }
        bjr.a(parcel, 2, asBinder);
        bjr.a(parcel, 3, this.c);
        bjr.r(parcel, q);
    }

    private static bfd a(IBinder iBinder) {
        bev bdw;
        bfe bfe;
        if (iBinder == null) {
            return null;
        }
        if (iBinder == null) {
            bdw = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
            if (queryLocalInterface instanceof bev) {
                bdw = (bev) queryLocalInterface;
            } else {
                bdw = new bdw(iBinder);
            }
        }
        try {
            bfl a2 = bdw.a();
            byte[] bArr = a2 == null ? null : (byte[]) bfo.a(a2);
            if (bArr != null) {
                bfe = new bfe(bArr);
            } else {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                bfe = null;
            }
            return bfe;
        } catch (RemoteException e) {
            Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e);
            return null;
        }
    }
}
