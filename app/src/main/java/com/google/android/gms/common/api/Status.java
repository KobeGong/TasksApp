package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;

/* compiled from: PG */
public final class Status extends biq implements ayw, ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new bcq();
    public static final Status a = new Status(0);
    public static final Status b = new Status(14);
    public static final Status c = new Status(8);
    public static final Status d = new Status(15);
    public static final Status e = new Status(16);
    public final int f;
    public final String g;
    public final PendingIntent h;
    private int i;

    public Status(int i2, int i3, String str, PendingIntent pendingIntent) {
        this.i = i2;
        this.f = i3;
        this.g = str;
        this.h = pendingIntent;
    }

    public Status(int i2) {
        this(i2, null);
    }

    public Status(int i2, String str) {
        this(1, i2, str, null);
    }

    public Status(int i2, String str, PendingIntent pendingIntent) {
        this(1, i2, str, pendingIntent);
    }

    public final boolean a() {
        return this.f <= 0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.i), Integer.valueOf(this.f), this.g, this.h});
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        if (this.i != status.i || this.f != status.f || !azb.a((Object) this.g, (Object) status.g) || !azb.a(this.h, status.h)) {
            return false;
        }
        return true;
    }

    public final String toString() {
        String a2;
        bea a3 = azb.a(this);
        if (this.g != null) {
            a2 = this.g;
        } else {
            a2 = azb.a(this.f);
        }
        return a3.a("statusCode", a2).a("resolution", this.h).toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int q = bjr.q(parcel, 20293);
        bjr.c(parcel, 1, this.f);
        bjr.a(parcel, 2, this.g);
        bjr.a(parcel, 3, this.h, i2);
        bjr.c(parcel, 1000, this.i);
        bjr.r(parcel, q);
    }

    @Override // defpackage.ayw
    public final Status b() {
        return this;
    }

    static {
        new Status(17);
        new Status(18);
    }
}
