package defpackage;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* renamed from: cpi  reason: default package */
/* compiled from: PG */
public final class cpi {
    private final Context a;
    private final String b;
    private final long c;
    private final long d;
    private final float e;
    private final float f;
    private final cpl g;
    private File h;
    private String i;
    private long j;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public cpi(android.content.Context r3, java.lang.String r4) {
        /*
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 18
            if (r0 >= r1) goto L_0x000f
            cpm r0 = new cpm
            r0.<init>()
        L_0x000b:
            r2.<init>(r3, r4, r0)
            return
        L_0x000f:
            cpk r0 = new cpk
            r0.<init>()
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cpi.<init>(android.content.Context, java.lang.String):void");
    }

    private cpi(Context context, String str, cpl cpl) {
        this.a = context;
        this.b = str;
        this.c = 0;
        this.d = 5242880;
        this.e = 0.1f;
        this.f = 0.05f;
        this.g = cpl;
    }

    public final File a() {
        if (this.h == null) {
            this.h = new File(this.a.getCacheDir(), this.b);
        }
        return this.h;
    }

    private final String c() {
        if (this.i == null) {
            this.i = a().getPath();
        }
        return this.i;
    }

    public final void a(String str, byte[] bArr) {
        String str2;
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        String a2 = a(str);
        try {
            cky.a(wrap, a2);
        } catch (FileNotFoundException e2) {
            File parentFile = new File(a2).getParentFile();
            if (!parentFile.exists()) {
                try {
                    parentFile.mkdirs();
                } catch (Exception e3) {
                    String valueOf = String.valueOf(parentFile);
                    Log.e("FileCache", new StringBuilder(String.valueOf(valueOf).length() + 31).append("Cannot create cache directory: ").append(valueOf).toString(), e3);
                    throw new RuntimeException("Cannot create cache directory", e3);
                }
            } else {
                String valueOf2 = String.valueOf(a2);
                Log.e("FileCache", valueOf2.length() != 0 ? "Cannot write file to cache: ".concat(valueOf2) : new String("Cannot write file to cache: "), e2);
            }
            try {
                cky.a(wrap, a2);
            } catch (IOException e4) {
                String valueOf3 = String.valueOf(a2);
                if (valueOf3.length() != 0) {
                    str2 = "Cannot write file to cache: ".concat(valueOf3);
                } else {
                    str2 = new String("Cannot write file to cache: ");
                }
                Log.e("FileCache", str2, e2);
            }
        } catch (IOException e5) {
            String valueOf4 = String.valueOf(a2);
            Log.e("FileCache", valueOf4.length() != 0 ? "Cannot write file to cache: ".concat(valueOf4) : new String("Cannot write file to cache: "), e5);
        }
    }

    public final String a(String str) {
        StringBuilder sb = new StringBuilder(c().length() + str.length() + 3);
        sb.append(c());
        sb.append(File.separatorChar);
        sb.append(str.charAt(0));
        sb.append(File.separatorChar);
        sb.append(str);
        return sb.toString();
    }

    public final void a(File file, ArrayList arrayList) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
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

    private final long a(File file) {
        long j2 = 0;
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                j2 += file2.isDirectory() ? a(file2) : file2.length();
            }
        }
        return j2;
    }
}
