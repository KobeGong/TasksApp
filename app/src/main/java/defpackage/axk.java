package defpackage;

/* renamed from: axk reason: default package */
/* compiled from: PG */
public final class axk implements defpackage.awv {
    private static final java.nio.charset.Charset a = java.nio.charset.Charset.forName("UTF-8");
    private static final defpackage.bpa b;
    private static java.util.Map d = null;
    private static java.lang.Boolean e = null;
    private static java.lang.Long f = null;
    private final android.content.Context c;

    public axk(android.content.Context context) {
        this.c = context;
        if (d == null) {
            d = new java.util.HashMap();
        }
        if (this.c != null) {
            android.content.Context context2 = this.c;
            if (defpackage.boz.b == null) {
                synchronized (defpackage.boz.a) {
                    if (android.os.Build.VERSION.SDK_INT < 24 || !context2.isDeviceProtectedStorage()) {
                        android.content.Context applicationContext = context2.getApplicationContext();
                        if (applicationContext != null) {
                            context2 = applicationContext;
                        }
                    }
                    if (defpackage.boz.b != context2) {
                        defpackage.boz.c = null;
                    }
                    defpackage.boz.b = context2;
                }
            }
        }
    }

    private static boolean a(android.content.Context context) {
        if (e == null) {
            e = java.lang.Boolean.valueOf(defpackage.bjg.a.a(context).a.checkCallingOrSelfPermission("com.google.android.providers.gsf.permission.READ_GSERVICES") == 0);
        }
        return e.booleanValue();
    }

    private static defpackage.axl a(java.lang.String str) {
        int i = 0;
        if (str == null) {
            return null;
        }
        java.lang.String str2 = "";
        int indexOf = str.indexOf(44);
        if (indexOf >= 0) {
            str2 = str.substring(0, indexOf);
            i = indexOf + 1;
        }
        int indexOf2 = str.indexOf(47, i);
        if (indexOf2 <= 0) {
            java.lang.String str3 = "LogSamplerImpl";
            java.lang.String str4 = "Failed to parse the rule: ";
            java.lang.String valueOf = java.lang.String.valueOf(str);
            android.util.Log.e(str3, valueOf.length() != 0 ? str4.concat(valueOf) : new java.lang.String(str4));
            return null;
        }
        try {
            long parseLong = java.lang.Long.parseLong(str.substring(i, indexOf2));
            long parseLong2 = java.lang.Long.parseLong(str.substring(indexOf2 + 1));
            if (parseLong >= 0 && parseLong2 >= 0) {
                return new defpackage.axl(str2, parseLong, parseLong2);
            }
            android.util.Log.e("LogSamplerImpl", "negative values not supported: " + parseLong + "/" + parseLong2);
            return null;
        } catch (java.lang.NumberFormatException e2) {
            java.lang.NumberFormatException numberFormatException = e2;
            java.lang.String str5 = "LogSamplerImpl";
            java.lang.String str6 = "parseLong() failed while parsing: ";
            java.lang.String valueOf2 = java.lang.String.valueOf(str);
            android.util.Log.e(str5, valueOf2.length() != 0 ? str6.concat(valueOf2) : new java.lang.String(str6), numberFormatException);
            return null;
        }
    }

    public final boolean a(java.lang.String str, int i) {
        java.lang.String str2;
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        java.lang.Object obj;
        if (str == null || str.isEmpty()) {
            if (i >= 0) {
                str = java.lang.String.valueOf(i);
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
            defpackage.boz boz = (defpackage.boz) d.get(str);
            if (boz == null) {
                boz = defpackage.boz.a(b, str);
                d.put(str, boz);
            }
            if (defpackage.boz.b == null) {
                throw new java.lang.IllegalStateException("Must call PhenotypeFlag.init() first");
            }
            if (boz.d.f) {
                java.lang.Object b2 = boz.b();
                if (b2 != null) {
                    obj = b2;
                } else {
                    java.lang.Object a2 = boz.a();
                    if (a2 != null) {
                        obj = a2;
                    }
                    obj = boz.g;
                }
            } else {
                java.lang.Object a3 = boz.a();
                if (a3 != null) {
                    obj = a3;
                } else {
                    java.lang.Object b3 = boz.b();
                    if (b3 != null) {
                        obj = b3;
                    }
                    obj = boz.g;
                }
            }
            str2 = (java.lang.String) obj;
        }
        defpackage.axl a4 = a(str2);
        if (a4 == null) {
            return true;
        }
        java.lang.String str3 = a4.a;
        android.content.Context context = this.c;
        if (f == null) {
            if (context == null) {
                j = 0;
                if (str3 != null || str3.isEmpty()) {
                    j2 = defpackage.azb.a(java.nio.ByteBuffer.allocate(8).putLong(j).array());
                } else {
                    byte[] bytes = str3.getBytes(a);
                    java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(bytes.length + 8);
                    allocate.put(bytes);
                    allocate.putLong(j);
                    j2 = defpackage.azb.a(allocate.array());
                }
                j3 = a4.b;
                j4 = a4.c;
                if (j3 >= 0 || j4 < 0) {
                    throw new java.lang.IllegalArgumentException("negative values not supported: " + j3 + "/" + j4);
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
                f = java.lang.Long.valueOf(defpackage.bks.b(context.getContentResolver(), "android_id"));
            } else {
                f = java.lang.Long.valueOf(0);
            }
        }
        j = f.longValue();
        if (str3 != null) {
        }
        j2 = defpackage.azb.a(java.nio.ByteBuffer.allocate(8).putLong(j).array());
        j3 = a4.b;
        j4 = a4.c;
        if (j3 >= 0) {
        }
        throw new java.lang.IllegalArgumentException("negative values not supported: " + j3 + "/" + j4);
    }

    static {
        defpackage.bpa bpa = new defpackage.bpa(defpackage.boy.a("com.google.android.gms.clearcut.public"));
        java.lang.String str = "gms:playlog:service:sampling_";
        if (bpa.e) {
            throw new java.lang.IllegalStateException("Cannot set GServices prefix and skip GServices");
        }
        defpackage.bpa bpa2 = new defpackage.bpa(bpa.a, bpa.b, str, bpa.d, bpa.e, bpa.f);
        defpackage.bpa bpa3 = new defpackage.bpa(bpa2.a, bpa2.b, bpa2.c, "LogSampling__", bpa2.e, bpa2.f);
        b = bpa3;
    }
}
