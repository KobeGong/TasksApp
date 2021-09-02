package defpackage;

/* renamed from: bfj reason: default package */
/* compiled from: PG */
public final class bfj extends defpackage.biq {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.bfk();
    private final java.lang.String a;
    private final defpackage.bfd b;
    private final boolean c;

    bfj(java.lang.String str, android.os.IBinder iBinder, boolean z) {
        this.a = str;
        this.b = a(iBinder);
        this.c = z;
    }

    bfj(java.lang.String str, defpackage.bfd bfd, boolean z) {
        this.a = str;
        this.b = bfd;
        this.c = z;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        android.os.IBinder asBinder;
        int q = defpackage.bjr.q(parcel, 20293);
        defpackage.bjr.a(parcel, 1, this.a);
        if (this.b == null) {
            android.util.Log.w("GoogleCertificatesQuery", "certificate binder is null");
            asBinder = null;
        } else {
            asBinder = this.b.asBinder();
        }
        defpackage.bjr.a(parcel, 2, asBinder);
        defpackage.bjr.a(parcel, 3, this.c);
        defpackage.bjr.r(parcel, q);
    }

    private static defpackage.bfd a(android.os.IBinder iBinder) {
        defpackage.bev bdw;
        defpackage.bfe bfe;
        if (iBinder == null) {
            return null;
        }
        if (iBinder == null) {
            bdw = null;
        } else {
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
            if (queryLocalInterface instanceof defpackage.bev) {
                bdw = (defpackage.bev) queryLocalInterface;
            } else {
                bdw = new defpackage.bdw(iBinder);
            }
        }
        try {
            defpackage.bfl a2 = bdw.a();
            byte[] bArr = a2 == null ? null : (byte[]) defpackage.bfo.a(a2);
            if (bArr != null) {
                bfe = new defpackage.bfe(bArr);
            } else {
                android.util.Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                bfe = null;
            }
            return bfe;
        } catch (android.os.RemoteException e) {
            android.util.Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e);
            return null;
        }
    }
}
