package defpackage;

/* renamed from: bkm reason: default package */
/* compiled from: PG */
public class bkm implements android.os.IInterface {
    private final android.os.IBinder a;
    private final java.lang.String b;

    public bkm(android.os.IBinder iBinder, java.lang.String str) {
        this.a = iBinder;
        this.b = str;
    }

    public android.os.IBinder asBinder() {
        return this.a;
    }

    public final android.os.Parcel c() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        obtain.writeInterfaceToken(this.b);
        return obtain;
    }

    public final android.os.Parcel a(int i, android.os.Parcel parcel) {
        parcel = android.os.Parcel.obtain();
        try {
            this.a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (java.lang.RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    public final void b(int i, android.os.Parcel parcel) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        try {
            this.a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public final void c(int i, android.os.Parcel parcel) {
        try {
            this.a.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
