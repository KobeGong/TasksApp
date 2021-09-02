package defpackage;

/* renamed from: xn reason: default package */
/* compiled from: PG */
final class xn {
    public static defpackage.xn a;
    private final android.content.Context b;
    private final android.location.LocationManager c;
    private final defpackage.xo d = new defpackage.xo();

    xn(android.content.Context context, android.location.LocationManager locationManager) {
        this.b = context;
        this.c = locationManager;
    }

    /* access modifiers changed from: 0000 */
    public final boolean a() {
        long j;
        defpackage.xo xoVar = this.d;
        if (this.d.b > java.lang.System.currentTimeMillis()) {
            return xoVar.a;
        }
        android.location.Location location = null;
        android.location.Location location2 = null;
        if (defpackage.jd.a(this.b, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            location = a("network");
        }
        if (defpackage.jd.a(this.b, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            location2 = a("gps");
        }
        android.location.Location location3 = (location2 == null || location == null) ? location2 != null ? location2 : location : location2.getTime() > location.getTime() ? location2 : location;
        if (location3 != null) {
            defpackage.xo xoVar2 = this.d;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (defpackage.xm.a == null) {
                defpackage.xm.a = new defpackage.xm();
            }
            defpackage.xm xmVar = defpackage.xm.a;
            xmVar.a(currentTimeMillis - 86400000, location3.getLatitude(), location3.getLongitude());
            xmVar.a(currentTimeMillis, location3.getLatitude(), location3.getLongitude());
            boolean z = xmVar.d == 1;
            long j2 = xmVar.c;
            long j3 = xmVar.b;
            xmVar.a(86400000 + currentTimeMillis, location3.getLatitude(), location3.getLongitude());
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
        int i = java.util.Calendar.getInstance().get(11);
        return i < 6 || i >= 22;
    }

    private final android.location.Location a(java.lang.String str) {
        try {
            if (this.c.isProviderEnabled(str)) {
                return this.c.getLastKnownLocation(str);
            }
        } catch (java.lang.Exception e) {
        }
        return null;
    }
}
