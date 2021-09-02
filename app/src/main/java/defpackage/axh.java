package defpackage;

/* renamed from: axh reason: default package */
/* compiled from: PG */
public class axh extends defpackage.bkn implements android.os.IInterface {
    public axh() {
        attachInterface(this, "com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
    }

    public boolean onTransact(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) {
        if (a(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                a((com.google.android.gms.common.api.Status) defpackage.bko.a(parcel, com.google.android.gms.common.api.Status.CREATOR));
                return true;
            case 2:
                defpackage.bko.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                throw new java.lang.UnsupportedOperationException();
            case 3:
                defpackage.bko.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                parcel.readLong();
                throw new java.lang.UnsupportedOperationException();
            case 4:
                defpackage.bko.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                throw new java.lang.UnsupportedOperationException();
            case 5:
                defpackage.bko.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                parcel.readLong();
                throw new java.lang.UnsupportedOperationException();
            case 6:
                defpackage.bko.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                parcel.createTypedArray(defpackage.axa.CREATOR);
                throw new java.lang.UnsupportedOperationException();
            case 7:
                defpackage.bko.a(parcel, com.google.android.gms.common.data.DataHolder.CREATOR);
                throw new java.lang.UnsupportedOperationException();
            case 8:
                defpackage.bko.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                defpackage.bko.a(parcel, defpackage.awz.CREATOR);
                throw new java.lang.UnsupportedOperationException();
            case 9:
                defpackage.bko.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                defpackage.bko.a(parcel, defpackage.awz.CREATOR);
                throw new java.lang.UnsupportedOperationException();
            default:
                return false;
        }
    }

    axh(byte b) {
        this();
    }

    public void a(com.google.android.gms.common.api.Status status) {
        throw new java.lang.UnsupportedOperationException();
    }
}
