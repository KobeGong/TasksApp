package defpackage;

/* renamed from: cpi reason: default package */
/* compiled from: PG */
public final class cpi {
    private final android.content.Context a;
    private final java.lang.String b;
    private final long c;
    private final long d;
    private final float e;
    private final float f;
    private final defpackage.cpl g;
    private java.io.File h;
    private java.lang.String i;
    private long j;

    public cpi(android.content.Context context, java.lang.String str) {
        defpackage.cpl cpk;
        if (android.os.Build.VERSION.SDK_INT < 18) {
            cpk = new defpackage.cpm();
        } else {
            cpk = new defpackage.cpk();
        }
        this(context, str, cpk);
    }

    private cpi(android.content.Context context, java.lang.String str, defpackage.cpl cpl) {
        this.a = context;
        this.b = str;
        this.c = 0;
        this.d = 5242880;
        this.e = 0.1f;
        this.f = 0.05f;
        this.g = cpl;
    }

    public final java.io.File a() {
        if (this.h == null) {
            this.h = new java.io.File(this.a.getCacheDir(), this.b);
        }
        return this.h;
    }

    private final java.lang.String c() {
        if (this.i == null) {
            this.i = a().getPath();
        }
        return this.i;
    }

    public final void a(java.lang.String str, byte[] bArr) {
        java.lang.String str2;
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(bArr);
        java.lang.String a2 = a(str);
        try {
            defpackage.cky.a(wrap, a2);
        } catch (java.io.FileNotFoundException e2) {
            java.io.File parentFile = new java.io.File(a2).getParentFile();
            if (!parentFile.exists()) {
                try {
                    parentFile.mkdirs();
                } catch (java.lang.Exception e3) {
                    java.lang.String valueOf = java.lang.String.valueOf(parentFile);
                    android.util.Log.e("FileCache", new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 31).append("Cannot create cache directory: ").append(valueOf).toString(), e3);
                    throw new java.lang.RuntimeException("Cannot create cache directory", e3);
                }
            } else {
                java.lang.String str3 = "FileCache";
                java.lang.String str4 = "Cannot write file to cache: ";
                java.lang.String valueOf2 = java.lang.String.valueOf(a2);
                android.util.Log.e(str3, valueOf2.length() != 0 ? str4.concat(valueOf2) : new java.lang.String(str4), e2);
            }
            try {
                defpackage.cky.a(wrap, a2);
            } catch (java.io.IOException e4) {
                java.lang.String str5 = "FileCache";
                java.lang.String str6 = "Cannot write file to cache: ";
                java.lang.String valueOf3 = java.lang.String.valueOf(a2);
                if (valueOf3.length() != 0) {
                    str2 = str6.concat(valueOf3);
                } else {
                    str2 = new java.lang.String(str6);
                }
                android.util.Log.e(str5, str2, e2);
            }
        } catch (java.io.IOException e5) {
            java.lang.String str7 = "FileCache";
            java.lang.String str8 = "Cannot write file to cache: ";
            java.lang.String valueOf4 = java.lang.String.valueOf(a2);
            android.util.Log.e(str7, valueOf4.length() != 0 ? str8.concat(valueOf4) : new java.lang.String(str8), e5);
        }
    }

    public final java.lang.String a(java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(c().length() + str.length() + 3);
        sb.append(c());
        sb.append(java.io.File.separatorChar);
        sb.append(str.charAt(0));
        sb.append(java.io.File.separatorChar);
        sb.append(str);
        return sb.toString();
    }

    public final void a(java.io.File file, java.util.ArrayList arrayList) {
        java.io.File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (java.io.File file2 : listFiles) {
                if (file2.isDirectory()) {
                    a(file2, arrayList);
                } else {
                    arrayList.add(file2);
                }
            }
        }
    }

    public final synchronized long b() {
        long j2;
        if (this.j == 0) {
            long j3 = this.d;
            long a2 = this.g.a();
            if (((float) j3) > ((float) a2) * this.e) {
                j3 = (long) (((float) a2) * this.e);
            }
            if (j3 < 0) {
                j3 = 0;
            }
            long b2 = this.g.b();
            if (((float) j3) >= ((float) b2) * this.f) {
                if (a().exists()) {
                    j2 = a(a());
                } else {
                    j2 = 0;
                }
                j3 = (long) (((float) (j2 + b2)) * this.f);
            }
            this.j = j3;
        }
        return this.j;
    }

    private final long a(java.io.File file) {
        long j2 = 0;
        java.io.File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (int i2 = 0; i2 < listFiles.length; i2++) {
                java.io.File file2 = listFiles[i2];
                j2 += file2.isDirectory() ? a(file2) : file2.length();
            }
        }
        return j2;
    }
}
