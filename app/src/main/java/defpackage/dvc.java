package defpackage;

/* renamed from: dvc reason: default package */
/* compiled from: PG */
public final class dvc {
    public static final boolean a = (java.lang.System.getProperty("com.google.appengine.runtime.environment") != null && "1.7".equals(java.lang.System.getProperty("java.specification.version")));
    public static final defpackage.doy b = defpackage.doy.a("grpc-timeout", (defpackage.dov) new defpackage.dvj());
    public static final defpackage.doy c = defpackage.doy.a("grpc-encoding", defpackage.dor.b);
    public static final defpackage.doy d = defpackage.doh.a("grpc-accept-encoding", new defpackage.dvi());
    public static final defpackage.doy e = defpackage.doy.a("content-encoding", defpackage.dor.b);
    public static final defpackage.doy f = defpackage.doh.a("accept-encoding", new defpackage.dvi());
    public static final defpackage.doy g = defpackage.doy.a("content-type", defpackage.dor.b);
    public static final defpackage.doy h = defpackage.doy.a("te", defpackage.dor.b);
    public static final defpackage.doy i = defpackage.doy.a("user-agent", defpackage.dor.b);
    public static final defpackage.dxq j = new defpackage.dxr();
    public static final defpackage.dxq k = new defpackage.dvd();
    public static final defpackage.dzl l = new defpackage.dve();
    public static final defpackage.dzl m = new defpackage.dvf();
    public static final defpackage.csd n = new defpackage.dvg();
    private static final java.util.logging.Logger o = java.util.logging.Logger.getLogger(defpackage.dvc.class.getName());

    public static defpackage.dpw a(int i2) {
        defpackage.dpx dpx;
        if (i2 < 100 || i2 >= 200) {
            switch (i2) {
                case 400:
                case 431:
                    dpx = defpackage.dpx.INTERNAL;
                    break;
                case 401:
                    dpx = defpackage.dpx.UNAUTHENTICATED;
                    break;
                case 403:
                    dpx = defpackage.dpx.PERMISSION_DENIED;
                    break;
                case 404:
                    dpx = defpackage.dpx.UNIMPLEMENTED;
                    break;
                case 429:
                case 502:
                case 503:
                case 504:
                    dpx = defpackage.dpx.UNAVAILABLE;
                    break;
                default:
                    dpx = defpackage.dpx.UNKNOWN;
                    break;
            }
        } else {
            dpx = defpackage.dpx.INTERNAL;
        }
        return dpx.a().a("HTTP status code " + i2);
    }

    public static boolean a(java.lang.String str) {
        if (str == null || 16 > str.length()) {
            return false;
        }
        java.lang.String lowerCase = str.toLowerCase();
        if (!lowerCase.startsWith("application/grpc")) {
            return false;
        }
        if (lowerCase.length() == 16) {
            return true;
        }
        char charAt = lowerCase.charAt(16);
        if (charAt == '+' || charAt == ';') {
            return true;
        }
        return false;
    }

    public static java.lang.String a(java.lang.String str, java.lang.String str2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (str2 != null) {
            sb.append(str2);
            sb.append(' ');
        }
        sb.append("grpc-java-");
        sb.append(str);
        sb.append('/');
        sb.append("1.12.0-SNAPSHOT");
        return sb.toString();
    }

    public static java.lang.String a(java.lang.String str, int i2) {
        try {
            return new java.net.URI(null, null, str, 443, null, null, null).getAuthority();
        } catch (java.net.URISyntaxException e2) {
            throw new java.lang.IllegalArgumentException(new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 34).append("Invalid host or port: ").append(str).append(" 443").toString(), e2);
        }
    }

    public static java.util.concurrent.ThreadFactory b(java.lang.String str) {
        if (a) {
            return defpackage.cub.b();
        }
        defpackage.cyv a2 = new defpackage.cyv().a(true).a(str);
        java.lang.String str2 = a2.a;
        return new defpackage.cyw(java.util.concurrent.Executors.defaultThreadFactory(), str2, str2 != null ? new java.util.concurrent.atomic.AtomicLong(0) : null, a2.b);
    }

    public static java.lang.String a(java.net.InetSocketAddress inetSocketAddress) {
        try {
            return (java.lang.String) java.net.InetSocketAddress.class.getMethod("getHostString", new java.lang.Class[0]).invoke(inetSocketAddress, new java.lang.Object[0]);
        } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException e2) {
            return inetSocketAddress.getHostName();
        }
    }

    static defpackage.dtb a(defpackage.don don, boolean z) {
        defpackage.dtb dtb;
        defpackage.dop dop = don.b;
        if (dop != null) {
            dtb = dop.c();
        } else {
            dtb = null;
        }
        if (dtb != null) {
            defpackage.dnm dnm = don.c;
            return dtb;
        }
        if (!don.d.a()) {
            if (don.e) {
                return new defpackage.duv(don.d, defpackage.bg.ax);
            }
            if (!z) {
                return new defpackage.duv(don.d, defpackage.bg.av);
            }
        }
        return null;
    }

    static void a(defpackage.dzr dzr) {
        while (true) {
            java.io.InputStream a2 = dzr.a();
            if (a2 != null) {
                a(a2);
            } else {
                return;
            }
        }
    }

    public static void a(java.io.InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (java.io.IOException e2) {
                o.logp(java.util.logging.Level.WARNING, "io.grpc.internal.GrpcUtil", "closeQuietly", "exception caught in closeQuietly", e2);
            }
        }
    }

    private dvc() {
    }

    static {
        java.nio.charset.Charset.forName("US-ASCII");
        defpackage.cld.a((java.lang.Object) new defpackage.crm(','));
        defpackage.crz crz = new defpackage.crz(new defpackage.csa());
        defpackage.cld.a((java.lang.Object) defpackage.cro.a);
        new defpackage.crz(crz.b, crz.a, crz.c);
        java.util.concurrent.TimeUnit.MINUTES.toNanos(1);
        java.util.concurrent.TimeUnit.SECONDS.toNanos(20);
        java.util.concurrent.TimeUnit.HOURS.toNanos(2);
        java.util.concurrent.TimeUnit.SECONDS.toNanos(20);
    }
}
