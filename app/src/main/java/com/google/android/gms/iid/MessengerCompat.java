package com.google.android.gms.iid;

import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* compiled from: PG */
public class MessengerCompat implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new big();
    public Messenger a;
    public bie b;

    public MessengerCompat(IBinder iBinder) {
        bie bif;
        if (Build.VERSION.SDK_INT >= 21) {
            this.a = new Messenger(iBinder);
            return;
        }
        if (iBinder == null) {
            bif = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.iid.IMessengerCompat");
            if (queryLocalInterface instanceof bie) {
                bif = (bie) queryLocalInterface;
            } else {
                bif = new bif(iBinder);
            }
        }
        this.b = bif;
    }

    private final IBinder a() {
        return this.a != null ? this.a.getBinder() : this.b.asBinder();
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return a().equals(((MessengerCompat) obj).a());
        } catch (ClassCastException e) {
            return false;
        }
    }

    public int hashCode() {
        return a().hashCode();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (this.a != null) {
            parcel.writeStrongBinder(this.a.getBinder());
        } else {
            parcel.writeStrongBinder(this.b.asBinder());
        }
    }
}
