package com.google.android.gms.common.api;

/* compiled from: PG */
public final class Status extends defpackage.biq implements defpackage.ayw, com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.bcq();
    public static final com.google.android.gms.common.api.Status a = new com.google.android.gms.common.api.Status(0);
    public static final com.google.android.gms.common.api.Status b = new com.google.android.gms.common.api.Status(14);
    public static final com.google.android.gms.common.api.Status c = new com.google.android.gms.common.api.Status(8);
    public static final com.google.android.gms.common.api.Status d = new com.google.android.gms.common.api.Status(15);
    public static final com.google.android.gms.common.api.Status e = new com.google.android.gms.common.api.Status(16);
    public final int f;
    public final java.lang.String g;
    public final android.app.PendingIntent h;
    private int i;

    public Status(int i2, int i3, java.lang.String str, android.app.PendingIntent pendingIntent) {
        this.i = i2;
        this.f = i3;
        this.g = str;
        this.h = pendingIntent;
    }

    public Status(int i2) {
        this(i2, null);
    }

    public Status(int i2, java.lang.String str) {
        this(1, i2, str, null);
    }

    public Status(int i2, java.lang.String str, android.app.PendingIntent pendingIntent) {
        this(1, i2, str, pendingIntent);
    }

    public final boolean a() {
        return this.f <= 0;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{java.lang.Integer.valueOf(this.i), java.lang.Integer.valueOf(this.f), this.g, this.h});
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.common.api.Status)) {
            return false;
        }
        com.google.android.gms.common.api.Status status = (com.google.android.gms.common.api.Status) obj;
        if (this.i != status.i || this.f != status.f || !defpackage.azb.a((java.lang.Object) this.g, (java.lang.Object) status.g) || !defpackage.azb.a((java.lang.Object) this.h, (java.lang.Object) status.h)) {
            return false;
        }
        return true;
    }

    public final java.lang.String toString() {
        java.lang.String a2;
        defpackage.bea a3 = defpackage.azb.a((java.lang.Object) this);
        java.lang.String str = "statusCode";
        if (this.g != null) {
            a2 = this.g;
        } else {
            a2 = defpackage.azb.a(this.f);
        }
        return a3.a(str, a2).a("resolution", this.h).toString();
    }

    public final void writeToParcel(android.os.Parcel parcel, int i2) {
        int q = defpackage.bjr.q(parcel, 20293);
        defpackage.bjr.c(parcel, 1, this.f);
        defpackage.bjr.a(parcel, 2, this.g);
        defpackage.bjr.a(parcel, 3, (android.os.Parcelable) this.h, i2);
        defpackage.bjr.c(parcel, 1000, this.i);
        defpackage.bjr.r(parcel, q);
    }

    public final com.google.android.gms.common.api.Status b() {
        return this;
    }

    static {
        new com.google.android.gms.common.api.Status(17);
        new com.google.android.gms.common.api.Status(18);
    }
}
