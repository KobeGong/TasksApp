package com.google.android.gms.iid;

/* compiled from: PG */
public class MessengerCompat implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.big();
    public android.os.Messenger a;
    public defpackage.bie b;

    public MessengerCompat(android.os.IBinder iBinder) {
        defpackage.bie bif;
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            this.a = new android.os.Messenger(iBinder);
            return;
        }
        if (iBinder == null) {
            bif = null;
        } else {
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.iid.IMessengerCompat");
            if (queryLocalInterface instanceof defpackage.bie) {
                bif = (defpackage.bie) queryLocalInterface;
            } else {
                bif = new defpackage.bif(iBinder);
            }
        }
        this.b = bif;
    }

    private final android.os.IBinder a() {
        return this.a != null ? this.a.getBinder() : this.b.asBinder();
    }

    public boolean equals(java.lang.Object obj) {
        boolean z = false;
        if (obj == null) {
            return z;
        }
        try {
            return a().equals(((com.google.android.gms.iid.MessengerCompat) obj).a());
        } catch (java.lang.ClassCastException e) {
            return z;
        }
    }

    public int hashCode() {
        return a().hashCode();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(android.os.Parcel parcel, int i) {
        if (this.a != null) {
            parcel.writeStrongBinder(this.a.getBinder());
        } else {
            parcel.writeStrongBinder(this.b.asBinder());
        }
    }
}
