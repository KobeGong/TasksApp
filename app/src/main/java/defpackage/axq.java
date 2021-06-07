package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: axq  reason: default package */
/* compiled from: PG */
public final class axq extends biq {
    public static final Parcelable.Creator CREATOR = new bfa();
    public static final axq a = new axq(0);
    public final int b;
    public final PendingIntent c;
    public final String d;
    private int e;

    axq(int i, int i2, PendingIntent pendingIntent, String str) {
        this.e = i;
        this.b = i2;
        this.c = pendingIntent;
        this.d = str;
    }

    public axq(int i) {
        this(i, null, (byte) 0);
    }

    public axq(int i, PendingIntent pendingIntent) {
        this(i, pendingIntent, (byte) 0);
    }

    private axq(int i, PendingIntent pendingIntent, byte b2) {
        this(1, i, pendingIntent, null);
    }

    public final boolean a() {
        return (this.b == 0 || this.c == null) ? false : true;
    }

    public final boolean b() {
        return this.b == 0;
    }

    static String a(int i) {
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
                return new StringBuilder(31).append("UNKNOWN_ERROR_CODE(").append(i).append(")").toString();
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof axq)) {
            return false;
        }
        axq axq = (axq) obj;
        return this.b == axq.b && azb.a(this.c, axq.c) && azb.a(this.d, axq.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), this.c, this.d});
    }

    public final String toString() {
        return azb.a(this).a("statusCode", a(this.b)).a("resolution", this.c).a("message", this.d).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int q = bjr.q(parcel, 20293);
        bjr.c(parcel, 1, this.e);
        bjr.c(parcel, 2, this.b);
        bjr.a(parcel, 3, this.c, i);
        bjr.a(parcel, 4, this.d);
        bjr.r(parcel, q);
    }
}
