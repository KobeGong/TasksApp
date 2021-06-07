package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

/* renamed from: axk  reason: default package */
/* compiled from: PG */
public final class axk implements awv {
    private static final Charset a = Charset.forName("UTF-8");
    private static final bpa b;
    private static Map d = null;
    private static Boolean e = null;
    private static Long f = null;
    private final Context c;

    public axk(Context context) {
        Context applicationContext;
        this.c = context;
        if (d == null) {
            d = new HashMap();
        }
        if (this.c != null) {
            Context context2 = this.c;
            if (boz.b == null) {
                synchronized (boz.a) {
                    if ((Build.VERSION.SDK_INT < 24 || !context2.isDeviceProtectedStorage()) && (applicationContext = context2.getApplicationContext()) != null) {
                        context2 = applicationContext;
                    }
                    if (boz.b != context2) {
                        boz.c = null;
                    }
                    boz.b = context2;
                }
            }
        }
    }

    private static boolean a(Context context) {
        if (e == null) {
            e = Boolean.valueOf(bjg.a.a(context).a.checkCallingOrSelfPermission("com.google.android.providers.gsf.permission.READ_GSERVICES") == 0);
        }
        return e.booleanValue();
    }

    private static axl a(String str) {
        int i = 0;
        if (str == null) {
            return null;
        }
        String str2 = "";
        int indexOf = str.indexOf(44);
        if (indexOf >= 0) {
            str2 = str.substring(0, indexOf);
            i = indexOf + 1;
        }
        int indexOf2 = str.indexOf(47, i);
        if (indexOf2 <= 0) {
            String valueOf = String.valueOf(str);
            Log.e("LogSamplerImpl", valueOf.length() != 0 ? "Failed to parse the rule: ".concat(valueOf) : new String("Failed to parse the rule: "));
            return null;
        }
        try {
            long parseLong = Long.parseLong(str.substring(i, indexOf2));
            long parseLong2 = Long.parseLong(str.substring(indexOf2 + 1));
            if (parseLong >= 0 && parseLong2 >= 0) {
                return new axl(str2, parseLong, parseLong2);
            }
            Log.e("LogSamplerImpl", new StringBuilder(72).append("negative values not supported: ").append(parseLong).append("/").append(parseLong2).toString());
            return null;
        } catch (NumberFormatException e2) {
            String valueOf2 = String.valueOf(str);
            Log.e("LogSamplerImpl", valueOf2.length() != 0 ? "parseLong() failed while parsing: ".concat(valueOf2) : new String("parseLong() failed while parsing: "), e2);
            return null;
        }
    }

    @Override // defpackage.awv
    public final boolean a(String str, int i) {
        String str2;
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        Object obj;
        if (str == null || str.isEmpty()) {
            if (i >= 0) {
                str = String.valueOf(i);
            } else {
                str = null;
            }
        }
        if (str == null) {
            return true;
        }
        if (this.c == null || !a(this.c)) {
            str2 = null;
        } else {
            boz boz = (boz) d.get(str);
            if (boz == null) {
                boz = boz.a(b, str);
                d.put(str, boz);
            }
            if (boz.b == null) {
                throw new IllegalStateException("Must call PhenotypeFlag.init() first");
            }
            if (boz.d.f) {
                Object b2 = boz.b();
                if (b2 != null) {
                    obj = b2;
                } else {
                    Object a2 = boz.a();
                    if (a2 != null) {
                        obj = a2;
                    }
                    obj = boz.g;
                }
            } else {
                Object a3 = boz.a();
                if (a3 != null) {
                    obj = a3;
                } else {
                    Object b3 = boz.b();
                    if (b3 != null) {
                        obj = b3;
                    }
                    obj = boz.g;
                }
            }
            str2 = (String) obj;
        }
        axl a4 = a(str2);
        if (a4 == null) {
            return true;
        }
        String str3 = a4.a;
        Context context = this.c;
        if (f == null) {
            if (context == null) {
                j = 0;
                if (str3 != null || str3.isEmpty()) {
                    j2 = azb.a(ByteBuffer.allocate(8).putLong(j).array());
                } else {
                    byte[] bytes = str3.getBytes(a);
                    ByteBuffer allocate = ByteBuffer.allocate(bytes.length + 8);
                    allocate.put(bytes);
                    allocate.putLong(j);
                    j2 = azb.a(allocate.array());
                }
                j3 = a4.b;
                j4 = a4.c;
                if (j3 >= 0 || j4 < 0) {
                    throw new IllegalArgumentException(new StringBuilder(72).append("negative values not supported: ").append(j3).append("/").append(j4).toString());
                }
                if (j4 > 0) {
                    if (j2 >= 0) {
                        j5 = j2 % j4;
                    } else {
                        j5 = (((j2 & Long.MAX_VALUE) % j4) + ((Long.MAX_VALUE % j4) + 1)) % j4;
                    }
                    if (j5 < j3) {
                        return true;
                    }
                }
                return false;
            } else if (a(context)) {
                f = Long.valueOf(bks.b(context.getContentResolver(), "android_id"));
            } else {
                f = 0L;
            }
        }
        j = f.longValue();
        if (str3 != null) {
        }
        j2 = azb.a(ByteBuffer.allocate(8).putLong(j).array());
        j3 = a4.b;
        j4 = a4.c;
        if (j3 >= 0) {
        }
        throw new IllegalArgumentException(new StringBuilder(72).append("negative values not supported: ").append(j3).append("/").append(j4).toString());
    }

    static {
        bpa bpa = new bpa(boy.a("com.google.android.gms.clearcut.public"));
        if (bpa.e) {
            throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
        }
        bpa bpa2 = new bpa(bpa.a, bpa.b, "gms:playlog:service:sampling_", bpa.d, bpa.e, bpa.f);
        b = new bpa(bpa2.a, bpa2.b, bpa2.c, "LogSampling__", bpa2.e, bpa2.f);
    }
}
