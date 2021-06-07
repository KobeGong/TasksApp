package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: dvc  reason: default package */
/* compiled from: PG */
public final class dvc {
    public static final boolean a = (System.getProperty("com.google.appengine.runtime.environment") != null && "1.7".equals(System.getProperty("java.specification.version")));
    public static final doy b = doy.a("grpc-timeout", new dvj());
    public static final doy c = doy.a("grpc-encoding", dor.b);
    public static final doy d = doh.a("grpc-accept-encoding", new dvi());
    public static final doy e = doy.a("content-encoding", dor.b);
    public static final doy f = doh.a("accept-encoding", new dvi());
    public static final doy g = doy.a("content-type", dor.b);
    public static final doy h = doy.a("te", dor.b);
    public static final doy i = doy.a("user-agent", dor.b);
    public static final dxq j = new dxr();
    public static final dxq k = new dvd();
    public static final dzl l = new dve();
    public static final dzl m = new dvf();
    public static final csd n = new dvg();
    private static final Logger o = Logger.getLogger(dvc.class.getName());

    public static dpw a(int i2) {
        dpx dpx;
        if (i2 < 100 || i2 >= 200) {
            switch (i2) {
                case 400:
                case 431:
                    dpx = dpx.INTERNAL;
                    break;
                case 401:
                    dpx = dpx.UNAUTHENTICATED;
                    break;
                case 403:
                    dpx = dpx.PERMISSION_DENIED;
                    break;
                case 404:
                    dpx = dpx.UNIMPLEMENTED;
                    break;
                case 429:
                case 502:
                case 503:
                case 504:
                    dpx = dpx.UNAVAILABLE;
                    break;
                default:
                    dpx = dpx.UNKNOWN;
                    break;
            }
        } else {
            dpx = dpx.INTERNAL;
        }
        return dpx.a().a(new StringBuilder(28).append("HTTP status code ").append(i2).toString());
    }

    public static boolean a(String str) {
        if (str == null || 16 > str.length()) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        if (!lowerCase.startsWith("application/grpc")) {
            return false;
        }
        if (lowerCase.length() == 16) {
            return true;
        }
        char charAt = lowerCase.charAt(16);
        return charAt == '+' || charAt == ';';
    }

    public static String a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
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

    public static String a(String str, int i2) {
        try {
            return new URI(null, null, str, 443, null, null, null).getAuthority();
        } catch (URISyntaxException e2) {
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(str).length() + 34).append("Invalid host or port: ").append(str).append(" 443").toString(), e2);
        }
    }

    public static ThreadFactory b(String str) {
        if (a) {
            return cub.b();
        }
        cyv a2 = new cyv().a(true).a(str);
        String str2 = a2.a;
        return new cyw(Executors.defaultThreadFactory(), str2, str2 != null ? new AtomicLong(0) : null, a2.b);
    }

    public static String a(InetSocketAddress inetSocketAddress) {
        try {
            return (String) InetSocketAddress.class.getMethod("getHostString", new Class[0]).invoke(inetSocketAddress, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
            return inetSocketAddress.getHostName();
        }
    }

    static dtb a(don don, boolean z) {
        dtb dtb;
        dop dop = don.b;
        if (dop != null) {
            dtb = dop.c();
        } else {
            dtb = null;
        }
        if (dtb != null) {
            dnm dnm = don.c;
            return dtb;
        }
        if (!don.d.a()) {
            if (don.e) {
                return new duv(don.d, bg.ax);
            }
            if (!z) {
                return new duv(don.d, bg.av);
            }
        }
        return null;
    }

    static void a(dzr dzr) {
        while (true) {
            InputStream a2 = dzr.a();
            if (a2 != null) {
                a(a2);
            } else {
                return;
            }
        }
    }

    public static void a(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e2) {
                o.logp(Level.WARNING, "io.grpc.internal.GrpcUtil", "closeQuietly", "exception caught in closeQuietly", (Throwable) e2);
            }
        }
    }

    private dvc() {
    }

    static {
        Charset.forName("US-ASCII");
        cld.a(new crm(','));
        crz crz = new crz(new csa());
        cld.a(cro.a);
        new crz(crz.b, crz.a, crz.c);
        TimeUnit.MINUTES.toNanos(1);
        TimeUnit.SECONDS.toNanos(20);
        TimeUnit.HOURS.toNanos(2);
        TimeUnit.SECONDS.toNanos(20);
    }
}
