package defpackage;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import java.util.Calendar;

/* access modifiers changed from: package-private */
/* renamed from: xn  reason: default package */
/* compiled from: PG */
public final class xn {
    public static xn a;
    private final Context b;
    private final LocationManager c;
    private final xo d = new xo();

    xn(Context context, LocationManager locationManager) {
        this.b = context;
        this.c = locationManager;
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        Location location;
        long j;
        xo xoVar = this.d;
        if (this.d.b > System.currentTimeMillis()) {
            return xoVar.a;
        }
        Location location2 = null;
        Location location3 = null;
        if (jd.a(this.b, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            location2 = a("network");
        }
        if (jd.a(this.b, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            location3 = a("gps");
        }
        if (location3 == null || location2 == null) {
            location = location3 != null ? location3 : location2;
        } else {
            location = location3.getTime() > location2.getTime() ? location3 : location2;
        }
        if (location != null) {
            xo xoVar2 = this.d;
            long currentTimeMillis = System.currentTimeMillis();
            if (xm.a == null) {
                xm.a = new xm();
            }
            xm xmVar = xm.a;
            xmVar.a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
            xmVar.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
            boolean z = xmVar.d == 1;
            long j2 = xmVar.c;
            long j3 = xmVar.b;
            xmVar.a(86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
            long j4 = xmVar.c;
            if (j2 == -1 || j3 == -1) {
                j = 43200000 + currentTimeMillis;
            } else {
                if (currentTimeMillis <= j3) {
                    if (currentTimeMillis > j2) {
                        j4 = j3;
                    } else {
                        j4 = j2;
                    }
                }
                j = j4 + 60000;
            }
            xoVar2.a = z;
            xoVar2.b = j;
            return xoVar.a;
        }
        int i = Calendar.getInstance().get(11);
        return i < 6 || i >= 22;
    }

    private final Location a(String str) {
        try {
            if (this.c.isProviderEnabled(str)) {
                return this.c.getLastKnownLocation(str);
            }
        } catch (Exception e) {
        }
        return null;
    }
}
