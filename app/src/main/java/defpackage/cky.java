package defpackage;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.health.HealthStats;
import android.os.health.TimerStat;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import android.view.View;
import com.google.android.apps.tasks.R;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.regex.Pattern;

@TargetApi(26)
/* renamed from: cky  reason: default package */
/* compiled from: PG */
public class cky {
    private static volatile Thread a;
    private static volatile Handler b;

    cky() {
    }

    private static boolean a(Number number) {
        return number == null || number.longValue() <= 0;
    }

    public static boolean a(edu edu) {
        return a(edu.a);
    }

    private static boolean a(egb egb) {
        return (egb.a == null || egb.a.intValue() == 0) && (egb.b == null || egb.b.longValue() == 0);
    }

    public static boolean a(efk efk) {
        return a(efk.a) && a(efk.b) && a(efk.e) && a(efk.d) && a(efk.c) && a(efk.f);
    }

    public static boolean a(eeu eeu) {
        return eeu.b == null;
    }

    public static boolean a(efo efo) {
        return a(efo.a) && a(efo.b);
    }

    public static Long a(Long l, Long l2) {
        if (l == null || l2 == null) {
            return l;
        }
        long longValue = l.longValue() - l2.longValue();
        if (longValue == 0) {
            return null;
        }
        return Long.valueOf(longValue);
    }

    public static Integer a(Integer num, Integer num2) {
        if (num == null || num2 == null) {
            return num;
        }
        int intValue = num.intValue() - num2.intValue();
        if (intValue == 0) {
            return null;
        }
        return Integer.valueOf(intValue);
    }

    public static eed a(String str) {
        if (str == null) {
            return null;
        }
        eed eed = new eed();
        eed.b = str;
        return eed;
    }

    public static egb a(String str, TimerStat timerStat) {
        egb egb = new egb();
        egb.a = Integer.valueOf(timerStat.getCount());
        if (egb.a.intValue() < 0) {
            egb.a = 0;
        }
        egb.b = Long.valueOf(timerStat.getTime());
        egb.c = a(str);
        if (a(egb)) {
            return null;
        }
        return egb;
    }

    public static egb a(egb egb, egb egb2) {
        if (egb == null || egb2 == null) {
            return egb;
        }
        egb egb3 = new egb();
        egb3.c = egb.c;
        egb3.a = Integer.valueOf(egb.a.intValue() - egb2.a.intValue());
        egb3.b = Long.valueOf(egb.b.longValue() - egb2.b.longValue());
        if (a(egb3)) {
            return null;
        }
        return egb3;
    }

    public static Integer a(Long l) {
        if (l == null) {
            return null;
        }
        return Integer.valueOf(l.intValue());
    }

    public static egb[] a(egb[] egbArr, egb[] egbArr2) {
        return (egb[]) cmj.a.a(egbArr, egbArr2);
    }

    public static Long a(HealthStats healthStats, int i) {
        Long l;
        if (healthStats == null || !healthStats.hasMeasurement(i)) {
            l = null;
        } else {
            l = Long.valueOf(healthStats.getMeasurement(i));
        }
        if (a((Number) l)) {
            return null;
        }
        return l;
    }

    public static egb b(HealthStats healthStats, int i) {
        if (healthStats == null || !healthStats.hasTimer(i)) {
            return null;
        }
        return a((String) null, healthStats.getTimer(i));
    }

    public static egb[] c(HealthStats healthStats, int i) {
        if (healthStats == null || !healthStats.hasTimers(i)) {
            return null;
        }
        return (egb[]) cmj.a.a(healthStats.getTimers(i));
    }

    public static Map d(HealthStats healthStats, int i) {
        if (healthStats == null || !healthStats.hasStats(i)) {
            return null;
        }
        return healthStats.getStats(i);
    }

    public static cki a(Context context, cki cki) {
        cmn cmn = new cmn();
        String packageName = context.getPackageName();
        boolean a2 = cmn.a(context, new StringBuilder(String.valueOf(packageName).length() + 32).append("primes:").append(packageName).append(":enable_leak_detection_v2").toString(), cki.b);
        boolean a3 = cmn.a(context, new StringBuilder(String.valueOf(packageName).length() + 29).append("primes:").append(packageName).append(":enable_leak_detection").toString(), cki.a);
        boolean a4 = cmn.a(context, "primes:disable_memory_summary_metrics", cki.c);
        boolean a5 = cmn.a(context, new StringBuilder(String.valueOf(packageName).length() + 33).append("primes:").append(packageName).append(":enable_battery_experiment").toString(), cki.d);
        boolean a6 = cmn.a(context, new StringBuilder(String.valueOf(packageName).length() + 28).append("primes:").append(packageName).append(":enable_magic_eye_log").toString(), cki.e);
        boolean a7 = cmn.a(context, new StringBuilder(String.valueOf(packageName).length() + 34).append("primes:").append(packageName).append(":enable_persist_crash_stats").toString(), cki.f);
        boolean a8 = cmn.a(context, new StringBuilder(String.valueOf(packageName).length() + 28).append("primes:").append(packageName).append(":enable_startup_trace").toString(), cki.g);
        boolean a9 = cmn.a(context, new StringBuilder(String.valueOf(packageName).length() + 36).append("primes:").append(packageName).append(":enable_url_auto_sanitization").toString(), cki.h);
        boolean a10 = cmn.a(context, new StringBuilder(String.valueOf(packageName).length() + 32).append("primes:").append(packageName).append(":enable_primes_for_primes").toString(), cki.i);
        boolean a11 = cmn.a(context, new StringBuilder(String.valueOf(packageName).length() + 27).append("primes:").append(packageName).append(":enable_primes_trace").toString(), cki.j);
        ckj ckj = new ckj();
        ckj.a = a3;
        ckj.b = a2;
        ckj.c = a4;
        ckj.d = a5;
        ckj.e = a6;
        ckj.f = a7;
        ckj.g = a8;
        ckj.h = a9;
        ckj.i = a10;
        ckj.j = a11;
        return ckj.a();
    }

    public static boolean a(cmx cmx) {
        return (cmx instanceof cmw) && (((cmw) cmx).a.j & 2) != 0;
    }

    public static long a(File[] fileArr) {
        long j = 0;
        try {
            long j2 = 0;
            for (File file : fileArr) {
                try {
                    if (!a(file)) {
                        if (file.isFile()) {
                            j2 += file.length();
                        } else if (file.isDirectory()) {
                            j2 += a(file.listFiles());
                        } else {
                            cdm.a(5, "DirStatsCapture", "not a link / dir / regular file: %s", file);
                        }
                    }
                } catch (IOException e) {
                    j = j2;
                    e = e;
                    cdm.b("DirStatsCapture", "failure computing subtree size", e, new Object[0]);
                    return j;
                } catch (SecurityException e2) {
                    j = j2;
                    e = e2;
                    cdm.b("DirStatsCapture", "failure computing subtree size", e, new Object[0]);
                    return j;
                }
            }
            return j2;
        } catch (IOException | SecurityException e3) {
            e = e3;
            cdm.b("DirStatsCapture", "failure computing subtree size", e, new Object[0]);
            return j;
        }
    }

    public static boolean a(File file) {
        if (Build.VERSION.SDK_INT >= 26) {
            return Files.isSymbolicLink(file.toPath());
        }
        try {
            File file2 = new File(file.getParentFile().getCanonicalFile(), file.getName());
            return !file2.getCanonicalFile().equals(file2.getAbsoluteFile());
        } catch (IOException e) {
            cdm.a(5, "DirStatsCapture", "Could not check symlink for file: %s, assuming symlink.", file);
            return true;
        }
    }

    public static eew[] a(Context context, int i, Pattern... patternArr) {
        File file;
        c();
        ArrayList arrayList = new ArrayList();
        try {
            file = new File(context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).dataDir);
        } catch (PackageManager.NameNotFoundException e) {
            cdm.a(5, "DirStatsCapture", "Failed to use package manager getting data directory from context instead.", new Object[0]);
            File filesDir = context.getFilesDir();
            if (filesDir != null) {
                file = filesDir.getParentFile();
            } else {
                file = null;
            }
        }
        if (file == null) {
            return null;
        }
        try {
            cnr cnr = new cnr(file, arrayList, i, patternArr);
            cnr.a(new cns(cnr));
            if (arrayList.isEmpty()) {
                return null;
            }
            return (eew[]) arrayList.toArray(new eew[0]);
        } catch (Exception e2) {
            String valueOf = String.valueOf(e2);
            cdm.a(5, "DirStatsCapture", new StringBuilder(String.valueOf(valueOf).length() + 29).append("Failed to retrieve DirStats: ").append(valueOf).toString(), new Object[0]);
            return null;
        }
    }

    public static int a(Context context) {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (!(connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null)) {
                return activeNetworkInfo.getType();
            }
        } catch (SecurityException e) {
            cdm.a(5, "NetworkCapture", "Failed to get network type, Please add: android.permission.ACCESS_NETWORK_STATE to AndroidManifest.xml", new Object[0]);
        }
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0082, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0083, code lost:
        defpackage.cdm.c("PackageStatsO", "queryStatsForPackage() call failed", r0, new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00c1, code lost:
        r0 = e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00c1 A[ExcHandler: Error (e java.lang.Error), Splitter:B:4:0x001c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.pm.PackageStats b(android.content.Context r15) {
        /*
        // Method dump skipped, instructions count: 197
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cky.b(android.content.Context):android.content.pm.PackageStats");
    }

    private static UUID a(StorageVolume storageVolume) {
        String uuid = storageVolume.getUuid();
        try {
            cdm.a(3, "PackageStatsO", "UUID for %s", uuid);
            return uuid == null ? StorageManager.UUID_DEFAULT : UUID.fromString(uuid);
        } catch (IllegalArgumentException e) {
            cdm.a("PackageStatsO", "Invalid UUID format: '%s'", uuid);
            return null;
        }
    }

    public static edf a(String str, Context context) {
        edf edf = new edf();
        edf.a = Long.valueOf(Process.getElapsedCpuTime());
        edf.b = Boolean.valueOf(cnx.b(context));
        edf.c = Integer.valueOf(Thread.activeCount());
        if (str != null) {
            edf.d = str;
        }
        return edf;
    }

    public static Long c(Context context) {
        Object obj;
        try {
            try {
                return Long.valueOf(Long.parseLong(context.getResources().getString(R.string.primes_version)));
            } catch (NumberFormatException e) {
                String valueOf = String.valueOf(obj);
                cdm.a(5, "PrimesVersion", valueOf.length() != 0 ? "Couldn't parse Primes version number from ".concat(valueOf) : new String("Couldn't parse Primes version number from "), new Object[0]);
            }
        } catch (Resources.NotFoundException e2) {
            cdm.a(5, "PrimesVersion", "Primes version number string not found", new Object[0]);
            return null;
        }
    }

    public static cpc a(View view, cpc cpc) {
        if (view instanceof cpf) {
            throw new IllegalArgumentException(String.valueOf(view.getClass().getName()).concat(" implements VisualElementProvider; this metadata should be added to the result of VisualElementProvider.getVisualElement()."));
        }
        view.setTag(R.id.analytics_visual_element_view_tag, cpc);
        return cpc;
    }

    public static cpc a(View view) {
        if (view instanceof cpf) {
            return ((cpf) view).a();
        }
        return (cpc) view.getTag(R.id.analytics_visual_element_view_tag);
    }

    public static boolean b(View view) {
        return a(view) != null;
    }

    public static void a(Activity activity, cpg cpg) {
        a(activity.findViewById(16908290), new cpc(cpg));
    }

    public static ArrayList a(String str, String str2) {
        String[] split = str.split("\n");
        ArrayList arrayList = new ArrayList(split.length);
        for (String str3 : split) {
            int indexOf = str3.indexOf(32);
            String[] split2 = str3.substring(0, indexOf).split(":");
            boolean z = split2.length == 2 && indexOf > 0;
            String valueOf = String.valueOf(str3);
            b(z, valueOf.length() != 0 ? "Invalid license meta-data line:\n".concat(valueOf) : new String("Invalid license meta-data line:\n"));
            arrayList.add(new cpq(str3.substring(indexOf + 1), Long.parseLong(split2[0]), Integer.parseInt(split2[1]), str2));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static String a(Context context, String str, long j, int i) {
        Resources resources = context.getApplicationContext().getResources();
        return a(resources.openRawResource(resources.getIdentifier(str, "raw", resources.getResourcePackageName(R.id.dummy_placeholder))), j, i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x002d A[SYNTHETIC, Splitter:B:20:0x002d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(java.lang.String r6, java.lang.String r7, long r8, int r10) {
        /*
            r0 = 0
            java.util.jar.JarFile r1 = new java.util.jar.JarFile     // Catch:{ IOException -> 0x001e, all -> 0x0035 }
            r1.<init>(r7)     // Catch:{ IOException -> 0x001e, all -> 0x0035 }
            java.util.jar.JarEntry r2 = r1.getJarEntry(r6)     // Catch:{ IOException -> 0x003a }
            if (r2 != 0) goto L_0x0010
            r1.close()     // Catch:{ IOException -> 0x0031 }
        L_0x000f:
            return r0
        L_0x0010:
            java.io.InputStream r0 = r1.getInputStream(r2)
            java.lang.String r0 = a(r0, r8, r10)
            r1.close()     // Catch:{ IOException -> 0x001c }
            goto L_0x000f
        L_0x001c:
            r1 = move-exception
            goto L_0x000f
        L_0x001e:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
        L_0x0022:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ all -> 0x002a }
            java.lang.String r3 = "Failed to read license text."
            r2.<init>(r3, r0)     // Catch:{ all -> 0x002a }
            throw r2     // Catch:{ all -> 0x002a }
        L_0x002a:
            r0 = move-exception
        L_0x002b:
            if (r1 == 0) goto L_0x0030
            r1.close()     // Catch:{ IOException -> 0x0033 }
        L_0x0030:
            throw r0
        L_0x0031:
            r1 = move-exception
            goto L_0x000f
        L_0x0033:
            r1 = move-exception
            goto L_0x0030
        L_0x0035:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
            goto L_0x002b
        L_0x003a:
            r0 = move-exception
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cky.a(java.lang.String, java.lang.String, long, int):java.lang.String");
    }

    private static String a(InputStream inputStream, long j, int i) {
        byte[] bArr = new byte[1024];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            inputStream.skip(j);
            if (i <= 0) {
                i = Integer.MAX_VALUE;
            }
            while (i > 0) {
                int read = inputStream.read(bArr, 0, Math.min(i, 1024));
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
                i -= read;
            }
            inputStream.close();
            try {
                return byteArrayOutputStream.toString("UTF-8");
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException("Unsupported encoding UTF8. This should always be supported.", e);
            }
        } catch (IOException e2) {
            throw new RuntimeException("Failed to read license or metadata text.", e2);
        }
    }

    public static void a(ByteBuffer byteBuffer, String str) {
        FileChannel channel = new RandomAccessFile(str, "rw").getChannel();
        try {
            channel.write(byteBuffer);
            byteBuffer.position(0);
        } finally {
            channel.close();
        }
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static int a(Object obj, int i) {
        return (obj == null ? 0 : obj.hashCode()) + (i * 31);
    }

    public static void a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void b(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static Object a(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException();
    }

    public static Object b(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }

    public static int a(int i, int i2) {
        String a2;
        if (i >= 0 && i < i2) {
            return i;
        }
        if (i < 0) {
            a2 = a("%s (%s) must not be negative", "index", Integer.valueOf(i));
        } else if (i2 < 0) {
            throw new IllegalArgumentException(new StringBuilder(26).append("negative size: ").append(i2).toString());
        } else {
            a2 = a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IndexOutOfBoundsException(a2);
    }

    public static String a(String str, Object... objArr) {
        int indexOf;
        int i = 0;
        String valueOf = String.valueOf(str);
        StringBuilder sb = new StringBuilder(valueOf.length() + (objArr.length * 16));
        int i2 = 0;
        while (i < objArr.length && (indexOf = valueOf.indexOf("%s", i2)) != -1) {
            sb.append(valueOf.substring(i2, indexOf));
            sb.append(objArr[i]);
            i2 = indexOf + 2;
            i++;
        }
        sb.append(valueOf.substring(i2));
        if (i < objArr.length) {
            sb.append(" [");
            int i3 = i + 1;
            sb.append(objArr[i]);
            while (i3 < objArr.length) {
                sb.append(", ");
                i3++;
                sb.append(objArr[i3]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static boolean a() {
        if (a == null) {
            a = Looper.getMainLooper().getThread();
        }
        return Thread.currentThread() == a;
    }

    public static void b() {
        if (!a()) {
            throw new RuntimeException("Must be called on the UI thread");
        }
    }

    public static void c() {
        if (a()) {
            throw new RuntimeException("Must be called on a background thread");
        }
    }

    public static Handler d() {
        if (b == null) {
            b = new Handler(Looper.getMainLooper());
        }
        return b;
    }

    public static void a(Runnable runnable) {
        d().post(runnable);
    }

    public static String b(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (a(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (a(c)) {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static boolean a(char c) {
        return c >= 'A' && c <= 'Z';
    }

    public static crs b(Object obj) {
        return new crs(obj.getClass().getSimpleName());
    }

    public static void a(boolean z, String str, Object obj) {
        if (!z) {
            throw new csg(cld.a(str, obj));
        }
    }

    public static void c(Object obj, Object obj2) {
        if (obj == null) {
            String valueOf = String.valueOf(obj2);
            throw new NullPointerException(new StringBuilder(String.valueOf(valueOf).length() + 24).append("null key in entry: null=").append(valueOf).toString());
        } else if (obj2 == null) {
            String valueOf2 = String.valueOf(obj);
            throw new NullPointerException(new StringBuilder(String.valueOf(valueOf2).length() + 26).append("null value in entry: ").append(valueOf2).append("=null").toString());
        }
    }

    public static int a(int i, String str) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException(new StringBuilder(String.valueOf(str).length() + 40).append(str).append(" cannot be negative but was: ").append(i).toString());
    }

    public static int a(int i) {
        return (int) (461845907 * ((long) Integer.rotateLeft((int) (((long) i) * -862048943), 15)));
    }

    public static boolean a(Collection collection, Iterator it) {
        cld.a(collection);
        cld.a(it);
        boolean z = false;
        while (it.hasNext()) {
            z |= collection.add(it.next());
        }
        return z;
    }

    public static ArrayList a(Iterable iterable) {
        cld.a(iterable);
        if (iterable instanceof Collection) {
            return new ArrayList((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        ArrayList arrayList = new ArrayList();
        a((Collection) arrayList, it);
        return arrayList;
    }

    public static ArrayList b(int i) {
        a(i, "arraySize");
        return new ArrayList(cub.a(5 + ((long) i) + ((long) (i / 10))));
    }

    public static Object[] a(Object... objArr) {
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            b(objArr[i], i);
        }
        return objArr;
    }

    public static Object b(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(new StringBuilder(20).append("at index ").append(i).toString());
    }

    public static int a(Set set) {
        int i = 0;
        for (Object obj : set) {
            i = ((i + (obj != null ? obj.hashCode() : 0)) ^ -1) ^ -1;
        }
        return i;
    }

    public static boolean a(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            return set.size() == set2.size() && set.containsAll(set2);
        } catch (ClassCastException | NullPointerException e) {
            return false;
        }
    }
}
