package defpackage;

import android.app.Application;
import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* access modifiers changed from: package-private */
/* renamed from: chn  reason: default package */
/* compiled from: PG */
public final class chn extends cgj implements cle {
    public final AtomicBoolean d = new AtomicBoolean();
    public volatile civ e;
    public final chm f;
    public final cog g;
    public final boolean h;
    public final AtomicBoolean i;
    public volatile edw j;
    public final boolean k;
    private final boolean l;
    private final int m;
    private final cha n;
    private volatile chq o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    chn(coe coe, chm chm, cog cog, boolean z, clt clt, Application application, float f2, boolean z2, boolean z3) {
        super(coe, application, clt, bg.Z);
        boolean z4 = false;
        cky.a(cog);
        cky.a(f2 > 0.0f && f2 <= 100.0f, "StartupSamplePercentage should be a floating number > 0 and <= 100.");
        this.n = cha.a(application);
        coa coa = new coa(f2 / 100.0f);
        this.l = (coa.a == 1.0f || coa.b.nextFloat() <= coa.a) ? true : z4;
        this.m = (int) (100.0f / f2);
        this.f = chm;
        this.g = cog;
        this.h = z;
        this.i = new AtomicBoolean(z2);
        this.k = z3;
    }

    /* access modifiers changed from: package-private */
    public final Thread.UncaughtExceptionHandler a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        return new chr(this, uncaughtExceptionHandler);
    }

    /* access modifiers changed from: package-private */
    public final edw a(String str, Throwable th) {
        int i2;
        int i3 = 1;
        edw edw = new edw();
        edw.c = civ.a(this.e);
        edw.a = true;
        edw.d = str;
        Class<?> cls = th.getClass();
        if (cls == OutOfMemoryError.class) {
            i2 = 2;
        } else if (NullPointerException.class.isAssignableFrom(cls)) {
            i2 = 1;
        } else if (RuntimeException.class.isAssignableFrom(cls)) {
            i2 = 3;
        } else {
            i2 = Error.class.isAssignableFrom(cls) ? 4 : 0;
        }
        edw.e = i2;
        edw.g = th.getClass().getName();
        try {
            StringWriter stringWriter = new StringWriter();
            cza.a(th, new PrintWriter(stringWriter));
            String stringWriter2 = stringWriter.toString();
            StringBuilder sb = new StringBuilder();
            Matcher matcher = Pattern.compile("([^:^\n]+).*((?:\n\\s*at [^:~\n]*:?~?[0-9]*[^\n]*)+)(?:(\nCaused by: )([^:^\n]+).*((?:\n\\s*at [^:~\n]*:?~?[0-9]*[^\n]*)+))?(?:(\nCaused by: )([^:^\n]+).*((?:\n\\s*at [^:~\n]*:?~?[0-9]*[^\n]*)+))?").matcher(stringWriter2);
            if (matcher.find()) {
                while (i3 <= matcher.groupCount() && matcher.group(i3) != null) {
                    sb.append(matcher.group(i3));
                    i3++;
                }
            }
            edw.f = chs.a(sb.toString());
        } catch (Exception e2) {
            String valueOf = String.valueOf(e2);
            cdm.a(5, "CrashMetricService", new StringBuilder(String.valueOf(valueOf).length() + 38).append("Failed to generate hashed stack trace.").append(valueOf).toString(), new Object[0]);
        }
        try {
            edw.b = new efl();
            edw.b.a = cky.a((String) null, (Context) this.a);
        } catch (Exception e3) {
            cdm.b("CrashMetricService", "Failed to get process stats.", e3, new Object[0]);
        }
        return edw;
    }

    private final edw g() {
        cky.c();
        File file = new File(this.a.getFilesDir(), "primes_crash");
        try {
            if (file.exists()) {
                cdm.a(3, "CrashMetricService", "found persisted crash", new Object[0]);
                edw edw = new edw();
                if (a(file, edw)) {
                    return edw;
                }
                cdm.a(5, "CrashMetricService", "could not delete crash file", new Object[0]);
            }
        } catch (IOException e2) {
            cdm.a("CrashMetricService", "IO failure", e2, new Object[0]);
        } catch (SecurityException e3) {
            cdm.a("CrashMetricService", "Unexpected SecurityException", e3, new Object[0]);
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0040  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean a(java.io.File r8, defpackage.edw r9) {
        /*
            r0 = 0
            r2 = 0
            long r4 = r8.length()     // Catch:{ all -> 0x003c }
            r6 = 0
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 <= 0) goto L_0x0033
            r6 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 >= 0) goto L_0x0033
            int r3 = (int) r4     // Catch:{ all -> 0x003c }
            byte[] r4 = new byte[r3]     // Catch:{ all -> 0x003c }
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ all -> 0x003c }
            r1.<init>(r8)     // Catch:{ all -> 0x003c }
        L_0x001b:
            if (r0 >= r3) goto L_0x0025
            int r2 = r3 - r0
            int r2 = r1.read(r4, r0, r2)     // Catch:{ all -> 0x0044 }
            int r0 = r0 + r2
            goto L_0x001b
        L_0x0025:
            r0 = 0
            defpackage.dmf.a(r9, r4, r0, r3)     // Catch:{ all -> 0x0044 }
        L_0x0029:
            boolean r0 = r8.delete()     // Catch:{ all -> 0x0044 }
            if (r1 == 0) goto L_0x0032
            r1.close()
        L_0x0032:
            return r0
        L_0x0033:
            r0 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r9.a = r0
            r1 = r2
            goto L_0x0029
        L_0x003c:
            r0 = move-exception
            r1 = r2
        L_0x003e:
            if (r1 == 0) goto L_0x0043
            r1.close()
        L_0x0043:
            throw r0
        L_0x0044:
            r0 = move-exception
            goto L_0x003e
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chn.a(java.io.File, edw):boolean");
    }

    @Override // defpackage.cle
    public final void e() {
        cdm.a(3, "CrashMetricService", "onPrimesInitialize", new Object[0]);
        edw edw = null;
        if (this.k) {
            cdm.a(3, "CrashMetricService", "persistent crash enabled.", new Object[0]);
            try {
                edw = g();
            } catch (RuntimeException e2) {
                cdm.b("CrashMetricService", "Unexpected failure: ", e2, new Object[0]);
            }
        }
        if (this.i.get()) {
            this.j = edw;
        } else if (!b() || (edw == null && !this.l)) {
            cdm.a(4, "CrashMetricService", "Startup metric for 'PRIMES_CRASH_MONITORING_INITIALIZED' dropped.", new Object[0]);
        } else {
            a(2, edw);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(civ civ) {
        String valueOf = String.valueOf(civ.a(civ));
        cdm.a(3, "CrashMetricService", valueOf.length() != 0 ? "activeComponentName: ".concat(valueOf) : new String("activeComponentName: "), new Object[0]);
        this.e = civ;
    }

    @Override // defpackage.cle
    public final void f() {
        cdm.a(3, "CrashMetricService", "onFirstActivityCreated", new Object[0]);
        if (!this.i.get()) {
            if (!b() || !this.l) {
                cdm.a(4, "CrashMetricService", "Startup metric for 'PRIMES_FIRST_ACTIVITY_LAUNCHED' dropped.", new Object[0]);
            } else {
                c().submit(new chp(this));
            }
        }
        this.o = new chq(this);
        this.n.a(this.o);
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, edw edw) {
        efx efx = new efx();
        efx.h = new efg();
        efx.h.b = Integer.valueOf(this.m);
        efx.h.a = i2;
        if (edw != null) {
            efx.h.c = new efh();
            efx.h.c.a = edw;
        }
        a(efx);
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.cgj
    public final void d() {
        if (this.o != null) {
            this.n.b(this.o);
            this.o = null;
        }
        if (this.d.get() && (Thread.getDefaultUncaughtExceptionHandler() instanceof chr)) {
            Thread.setDefaultUncaughtExceptionHandler(((chr) Thread.getDefaultUncaughtExceptionHandler()).a);
        }
    }
}
