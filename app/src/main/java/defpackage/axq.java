package defpackage;

/* renamed from: axq reason: default package */
/* compiled from: PG */
public final class axq extends defpackage.biq {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.bfa();
    public static final defpackage.axq a = new defpackage.axq(0);
    public final int b;
    public final android.app.PendingIntent c;
    public final java.lang.String d;
    private int e;

    axq(int i, int i2, android.app.PendingIntent pendingIntent, java.lang.String str) {
        this.e = i;
        this.b = i2;
        this.c = pendingIntent;
        this.d = str;
    }

    public axq(int i) {
        this(i, null, 0);
    }

    public axq(int i, android.app.PendingIntent pendingIntent) {
        this(i, pendingIntent, 0);
    }

    private axq(int i, android.app.PendingIntent pendingIntent, byte b2) {
        this(1, i, pendingIntent, null);
    }

    public final boolean a() {
        return (this.b == 0 || this.c == null) ? false : true;
    }

    public final boolean b() {
        return this.b == 0;
    }

    static java.lang.String a(int i) {
        switch (i) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            case 13:
                return "CANCELED";
            case 14:
                return "TIMEOUT";
            case 15:
                return "INTERRUPTED";
            case 16:
                return "API_UNAVAILABLE";
            case 17:
                return "SIGN_IN_FAILED";
            case 18:
                return "SERVICE_UPDATING";
            case 19:
                return "SERVICE_MISSING_PERMISSION";
            case 20:
                return "RESTRICTED_PROFILE";
            case 21:
                return "API_VERSION_UPDATE_REQUIRED";
            case 99:
                return "UNFINISHED";
            case 1500:
                return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
            default:
                return "UNKNOWN_ERROR_CODE(" + i + ")";
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.axq)) {
            return false;
        }
        defpackage.axq axq = (defpackage.axq) obj;
        if (this.b != axq.b || !defpackage.azb.a((java.lang.Object) this.c, (java.lang.Object) axq.c) || !defpackage.azb.a((java.lang.Object) this.d, (java.lang.Object) axq.d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{java.lang.Integer.valueOf(this.b), this.c, this.d});
    }

    public final java.lang.String toString() {
        return defpackage.azb.a((java.lang.Object) this).a("statusCode", a(this.b)).a("resolution", this.c).a("message", this.d).toString();
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int q = defpackage.bjr.q(parcel, 20293);
        defpackage.bjr.c(parcel, 1, this.e);
        defpackage.bjr.c(parcel, 2, this.b);
        defpackage.bjr.a(parcel, 3, (android.os.Parcelable) this.c, i);
        defpackage.bjr.a(parcel, 4, this.d);
        defpackage.bjr.r(parcel, q);
    }
}
