package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* renamed from: azb  reason: default package */
/* compiled from: PG */
public class azb implements bau {
    public static Boolean e;
    private static Boolean g;
    private static Boolean h;
    public boolean a;
    public Map b;
    public Map c;
    public axq d;
    private azd f;

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Map, java.util.Queue, azx] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // defpackage.bau
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.bca a(defpackage.bca r3) {
        /*
            r2 = this;
            r1 = 0
            boolean r0 = r2.d()
            if (r0 != 0) goto L_0x000b
            r1.add(r3)
        L_0x000a:
            return r3
        L_0x000b:
            bbr r0 = r1.g
            r0.a(r3)
            ayh r0 = r3.c
            java.lang.Object r0 = r1.get(r0)
            bcn r0 = (defpackage.bcn) r0
            r1 = 0
            bca r3 = r0.a(r1, r3)
            goto L_0x000a
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azb.a(bca):bca");
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.Map, azx] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // defpackage.bau
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.bca b(defpackage.bca r4) {
        /*
            r3 = this;
            r2 = 0
            ayh r0 = r4.c
            bbr r1 = r2.g
            r1.a(r4)
            java.lang.Object r0 = r2.get(r0)
            bcn r0 = (defpackage.bcn) r0
            r1 = 1
            bca r0 = r0.a(r1, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azb.b(bca):bca");
    }

    @Override // defpackage.bau
    public final void a() {
        Lock lock = null;
        lock.lock();
        try {
            if (!this.a) {
                this.a = true;
                this.b = null;
                this.c = null;
                this.f = null;
                this.d = null;
                baj baj = null;
                baj.a();
                baj baj2 = null;
                Map map = null;
                baj2.a(map.values()).a(new bjc(null), new azc(this));
                lock.unlock();
            }
        } finally {
            lock.unlock();
        }
    }

    @Override // defpackage.bau
    public final axq b() {
        a();
        while (e()) {
            Condition condition = null;
            try {
                condition.await();
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                return new axq(15, null);
            }
        }
        if (d()) {
            return axq.a;
        }
        if (this.d != null) {
            return this.d;
        }
        return new axq(13, null);
    }

    @Override // defpackage.bau
    public final void c() {
        Lock lock = null;
        lock.lock();
        try {
            this.a = false;
            this.b = null;
            this.c = null;
            if (this.f != null) {
                this.f.a();
                this.f = null;
            }
            this.d = null;
            while (true) {
                Queue queue = null;
                if (!queue.isEmpty()) {
                    Queue queue2 = null;
                    bca bca = (bca) queue2.remove();
                    bca.a((bbs) null);
                    bca.a();
                } else {
                    Condition condition = null;
                    condition.signalAll();
                    return;
                }
            }
        } finally {
            lock.unlock();
        }
    }

    @Override // defpackage.bau
    public final boolean d() {
        Lock lock = null;
        lock.lock();
        try {
            return this.b != null && this.d == null;
        } finally {
            lock.unlock();
        }
    }

    @Override // defpackage.bau
    public final boolean e() {
        Lock lock = null;
        lock.lock();
        try {
            return this.b == null && this.a;
        } finally {
            lock.unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    @Override // defpackage.bau
    public final boolean a(bbh bbh) {
        Lock lock = null;
        lock.lock();
        try {
            if (this.a) {
                Lock lock2 = null;
                lock2.lock();
                Lock lock3 = null;
                lock3.unlock();
                baj baj = null;
                baj.a();
                this.f = new azd(this, bbh);
                baj baj2 = null;
                Map map = null;
                baj2.a(map.values()).a(new bjc(null), this.f);
                lock.unlock();
                return true;
            }
            lock.unlock();
            return false;
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    @Override // defpackage.bau
    public final void f() {
        Lock lock = null;
        lock.lock();
        baj baj = null;
        try {
            baj.f.incrementAndGet();
            baj baj2 = null;
            baj baj3 = null;
            baj2.g.sendMessage(baj3.g.obtainMessage(10));
            if (this.f != null) {
                this.f.a();
                this.f = null;
            }
            if (this.c == null) {
                Map map = null;
                this.c = new qr(map.size());
            }
            axq axq = new axq(4);
            Map map2 = null;
            for (bcn bcn : map2.values()) {
                this.c.put(bcn.c, axq);
            }
            if (this.b != null) {
                this.b.putAll(this.c);
            }
        } finally {
            lock.unlock();
        }
    }

    @Override // defpackage.bau
    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    static /* synthetic */ axq a(azb azb) {
        axq axq;
        char c2;
        Map map = null;
        char c3 = 0;
        axq axq2 = null;
        for (bcn bcn : map.values()) {
            ayd ayd = bcn.b;
            axq axq3 = (axq) azb.b.get(bcn.c);
            if (!axq3.b() && (!((Boolean) map.get(ayd)).booleanValue() || axq3.a() || axv.a(axq3.b))) {
                int i = axq3.b;
                if (axq2 == null || c3 > 65535) {
                    axq = axq3;
                    c2 = 65535;
                } else {
                    c2 = c3;
                    axq = axq2;
                }
                c3 = c2;
                axq2 = axq;
            }
        }
        return axq2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Queue, azx] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void b(defpackage.azb r2) {
        /*
            r1 = 0
        L_0x0001:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0011
            java.lang.Object r0 = r1.remove()
            bca r0 = (defpackage.bca) r0
            r2.b(r0)
            goto L_0x0001
        L_0x0011:
            r1.a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azb.b(azb):void");
    }

    public static void a(String str, Throwable th, String... strArr) {
        Log.e("Tasks", c(str, strArr), th);
    }

    public static void a(String str, Object... objArr) {
        Log.e("Tasks", c(str, objArr));
    }

    public static void a(String str, Throwable th, Object... objArr) {
        if (Log.isLoggable("Tasks", 5)) {
            Log.w("Tasks", c(str, objArr), th);
        }
    }

    public static void b(String str, Object... objArr) {
        if (Log.isLoggable("Tasks", 5)) {
            Log.w("Tasks", c(str, objArr));
        }
    }

    private static String c(String str, Object[] objArr) {
        if (objArr.length > 0) {
            return String.format(Locale.ENGLISH, str, objArr);
        }
        return str;
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return String.valueOf(str.hashCode());
    }

    public static long a(byte[] bArr) {
        int length = bArr.length;
        if (length < 0 || length > bArr.length) {
            throw new IndexOutOfBoundsException(new StringBuilder(67).append("Out of bound index with offput: 0 and length: ").append(length).toString());
        } else if (length <= 32) {
            if (length > 16) {
                long j = -7286425919675154353L + ((long) (length << 1));
                long b2 = -5435081209227447693L * b(bArr, 0);
                long b3 = b(bArr, 8);
                long b4 = b(bArr, length - 8) * j;
                return a((b(bArr, length - 16) * -7286425919675154353L) + Long.rotateRight(b2 + b3, 43) + Long.rotateRight(b4, 30), b2 + Long.rotateRight(b3 - 7286425919675154353L, 18) + b4, j);
            } else if (length >= 8) {
                long j2 = -7286425919675154353L + ((long) (length << 1));
                long b5 = -7286425919675154353L + b(bArr, 0);
                long b6 = b(bArr, length - 8);
                return a((Long.rotateRight(b6, 37) * j2) + b5, (Long.rotateRight(b5, 25) + b6) * j2, j2);
            } else if (length >= 4) {
                return a(((((long) a(bArr, 0)) & 4294967295L) << 3) + ((long) length), ((long) a(bArr, length - 4)) & 4294967295L, -7286425919675154353L + ((long) (length << 1)));
            } else if (length <= 0) {
                return -7286425919675154353L;
            } else {
                long j3 = (((long) (((bArr[(length - 1) + 0] & 255) << 2) + length)) * -4348849565147123417L) ^ (((long) ((bArr[0] & 255) + ((bArr[(length >> 1) + 0] & 255) << 8))) * -7286425919675154353L);
                return (j3 ^ (j3 >>> 47)) * -7286425919675154353L;
            }
        } else if (length <= 64) {
            long j4 = -7286425919675154353L + ((long) (length << 1));
            long b7 = b(bArr, 0) * -7286425919675154353L;
            long b8 = b(bArr, 8);
            long b9 = b(bArr, length - 8) * j4;
            long b10 = (b(bArr, length - 16) * -7286425919675154353L) + Long.rotateRight(b7 + b8, 43) + Long.rotateRight(b9, 30);
            long a2 = a(b10, Long.rotateRight(b8 - 7286425919675154353L, 18) + b7 + b9, j4);
            long b11 = b(bArr, 16) * j4;
            long b12 = b(bArr, 24);
            long b13 = (b10 + b(bArr, length - 32)) * j4;
            return a(((b(bArr, length - 24) + a2) * j4) + Long.rotateRight(b11 + b12, 43) + Long.rotateRight(b13, 30), Long.rotateRight(b12 + b7, 18) + b11 + b13, j4);
        } else {
            long[] jArr = new long[2];
            long[] jArr2 = new long[2];
            int i = (((length - 1) / 64) << 6) + 0;
            int i2 = (((length - 1) & 63) + i) - 63;
            long b14 = 95310865018149119L + b(bArr, 0);
            long j5 = 2480279821605975764L;
            long j6 = 1390051526045402406L;
            int i3 = 0;
            while (true) {
                long rotateRight = (Long.rotateRight(((b14 + j5) + jArr[0]) + b(bArr, i3 + 8), 37) * -5435081209227447693L) ^ jArr2[1];
                long rotateRight2 = (Long.rotateRight(j5 + jArr[1] + b(bArr, i3 + 48), 42) * -5435081209227447693L) + jArr[0] + b(bArr, i3 + 40);
                long rotateRight3 = Long.rotateRight(j6 + jArr2[0], 33) * -5435081209227447693L;
                a(bArr, i3, jArr[1] * -5435081209227447693L, jArr2[0] + rotateRight, jArr);
                a(bArr, i3 + 32, rotateRight3 + jArr2[1], rotateRight2 + b(bArr, i3 + 16), jArr2);
                i3 += 64;
                if (i3 == i) {
                    long j7 = -5435081209227447693L + ((255 & rotateRight) << 1);
                    jArr2[0] = jArr2[0] + ((long) ((length - 1) & 63));
                    jArr[0] = jArr[0] + jArr2[0];
                    jArr2[0] = jArr2[0] + jArr[0];
                    long rotateRight4 = (Long.rotateRight(((rotateRight3 + rotateRight2) + jArr[0]) + b(bArr, i2 + 8), 37) * j7) ^ (jArr2[1] * 9);
                    long rotateRight5 = (Long.rotateRight(jArr[1] + rotateRight2 + b(bArr, i2 + 48), 42) * j7) + (jArr[0] * 9) + b(bArr, i2 + 40);
                    long rotateRight6 = Long.rotateRight(jArr2[0] + rotateRight, 33) * j7;
                    a(bArr, i2, jArr[1] * j7, rotateRight4 + jArr2[0], jArr);
                    a(bArr, i2 + 32, rotateRight6 + jArr2[1], rotateRight5 + b(bArr, i2 + 16), jArr2);
                    return a(a(jArr[0], jArr2[0], j7) + (((rotateRight5 >>> 47) ^ rotateRight5) * -4348849565147123417L) + rotateRight4, a(jArr[1], jArr2[1], j7) + rotateRight6, j7);
                }
                j6 = rotateRight;
                j5 = rotateRight2;
                b14 = rotateRight3;
            }
        }
    }

    private static long a(long j, long j2, long j3) {
        long j4 = (j ^ j2) * j3;
        long j5 = ((j4 ^ (j4 >>> 47)) ^ j2) * j3;
        return (j5 ^ (j5 >>> 47)) * j3;
    }

    private static void a(byte[] bArr, int i, long j, long j2, long[] jArr) {
        long b2 = b(bArr, i);
        long b3 = b(bArr, i + 8);
        long b4 = b(bArr, i + 16);
        long b5 = b(bArr, i + 24);
        long j3 = b2 + j;
        long rotateRight = Long.rotateRight(j2 + j3 + b5, 21);
        long j4 = b3 + j3 + b4;
        jArr[0] = j4 + b5;
        jArr[1] = j3 + Long.rotateRight(j4, 44) + rotateRight;
    }

    private static int a(byte[] bArr, int i) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
    }

    private static long b(byte[] bArr, int i) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr, i, 8);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        return wrap.getLong();
    }

    public static String a(int i) {
        switch (i) {
            case -1:
                return "SUCCESS_CACHE";
            case 0:
                return "SUCCESS";
            case 1:
            case 9:
            case 11:
            case 12:
            default:
                return new StringBuilder(32).append("unknown status code: ").append(i).toString();
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
            case 10:
                return "DEVELOPER_ERROR";
            case 13:
                return "ERROR";
            case 14:
                return "INTERRUPTED";
            case 15:
                return "TIMEOUT";
            case 16:
                return "CANCELED";
            case 17:
                return "API_NOT_CONNECTED";
            case 18:
                return "DEAD_CLIENT";
        }
    }

    public static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static bea a(Object obj) {
        return new bea(obj);
    }

    public static Object b(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("null reference");
    }

    public static String b(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException("Given String is empty or null");
    }

    public static String a(String str, Object obj) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    public static Object b(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }

    public static void a(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void a(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }

    public static void b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void b(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void c(String str) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IllegalStateException(str);
        }
    }

    public static void a(Handler handler) {
        if (Looper.myLooper() != handler.getLooper()) {
            throw new IllegalStateException("Must be called on the handler thread");
        }
    }

    public static boolean a(Context context, String str) {
        "com.google.android.gms".equals(str);
        try {
            if ((bjg.a.a(context).a(str, 0).flags & 2097152) != 0) {
                return true;
            }
            return false;
        } catch (PackageManager.NameNotFoundException e2) {
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002b, code lost:
        if (defpackage.azb.h.booleanValue() != false) goto L_0x002d;
     */
    @android.annotation.TargetApi(24)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(android.content.Context r4) {
        /*
            r1 = 1
            r2 = 0
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 24
            if (r0 < r3) goto L_0x002d
            java.lang.Boolean r0 = defpackage.azb.h
            if (r0 != 0) goto L_0x0025
            boolean r0 = h()
            if (r0 == 0) goto L_0x0053
            android.content.pm.PackageManager r0 = r4.getPackageManager()
            java.lang.String r3 = "cn.google"
            boolean r0 = r0.hasSystemFeature(r3)
            if (r0 == 0) goto L_0x0053
            r0 = r1
        L_0x001f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            defpackage.azb.h = r0
        L_0x0025:
            java.lang.Boolean r0 = defpackage.azb.h
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0057
        L_0x002d:
            java.lang.Boolean r0 = defpackage.azb.g
            if (r0 != 0) goto L_0x004a
            boolean r0 = g()
            if (r0 == 0) goto L_0x0055
            android.content.pm.PackageManager r0 = r4.getPackageManager()
            java.lang.String r3 = "android.hardware.type.watch"
            boolean r0 = r0.hasSystemFeature(r3)
            if (r0 == 0) goto L_0x0055
            r0 = r1
        L_0x0044:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            defpackage.azb.g = r0
        L_0x004a:
            java.lang.Boolean r0 = defpackage.azb.g
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0057
        L_0x0052:
            return r1
        L_0x0053:
            r0 = r2
            goto L_0x001f
        L_0x0055:
            r0 = r2
            goto L_0x0044
        L_0x0057:
            r1 = r2
            goto L_0x0052
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azb.a(android.content.Context):boolean");
    }

    public static boolean g() {
        return Build.VERSION.SDK_INT >= 20;
    }

    public static boolean h() {
        return Build.VERSION.SDK_INT >= 21;
    }

    public static boolean i() {
        return Build.VERSION.SDK_INT >= 26 || "O".equals(Build.VERSION.CODENAME) || Build.VERSION.CODENAME.startsWith("OMR") || Build.VERSION.CODENAME.startsWith("ODR");
    }

    public static synchronized File a(File file) {
        synchronized (azb.class) {
            if (!file.exists() && !file.mkdirs() && !file.exists()) {
                String valueOf = String.valueOf(file.getPath());
                Log.w("SupportV4Utils", valueOf.length() != 0 ? "Unable to create no-backup dir ".concat(valueOf) : new String("Unable to create no-backup dir "));
                file = null;
            }
        }
        return file;
    }

    public static boolean a(Context context, int i) {
        if (!bjg.a.a(context).a(i, "com.google.android.gms")) {
            return false;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
            aya a2 = aya.a(context);
            if (packageInfo == null) {
                return false;
            }
            if (aya.a(packageInfo, false)) {
                return true;
            }
            if (!aya.a(packageInfo, true)) {
                return false;
            }
            if (axz.d(a2.a)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
            return false;
        } catch (PackageManager.NameNotFoundException e2) {
            return false;
        }
    }
}
