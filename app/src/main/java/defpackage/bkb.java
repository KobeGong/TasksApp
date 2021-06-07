package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* renamed from: bkb  reason: default package */
/* compiled from: PG */
public final class bkb extends biq implements ayw {
    public static final Parcelable.Creator CREATOR = new bkc();
    private int a;
    private int b;
    private Intent c;

    bkb(int i, int i2, Intent intent) {
        this.a = i;
        this.b = i2;
        this.c = intent;
    }

    public bkb() {
        this((byte) 0);
    }

    private bkb(byte b2) {
        this(2, 0, null);
    }

    @Override // defpackage.ayw
    public final Status b() {
        if (this.b == 0) {
            return Status.a;
        }
        return Status.e;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int q = bjr.q(parcel, 20293);
        bjr.c(parcel, 1, this.a);
        bjr.c(parcel, 2, this.b);
        bjr.a(parcel, 3, this.c, i);
        bjr.r(parcel, q);
    }
}
