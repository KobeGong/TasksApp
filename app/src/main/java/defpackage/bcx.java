package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: bcx  reason: default package */
/* compiled from: PG */
public abstract class bcx {
    private long a;
    public int b;
    public long c;
    public final Context d;
    public final Handler e;
    public bda f;
    public AtomicInteger g = new AtomicInteger(0);
    private int h;
    private long i;
    private ber j;
    private final bdn k;
    private final Object l = new Object();
    private final Object m = new Object();
    private bdt n;
    private IInterface o;
    private final ArrayList p = new ArrayList();
    private bdf q;
    private int r = 1;
    private final bcy s;
    private final bcz t;
    private final int u;
    private final String v;
    private axq w = null;
    private boolean x = false;

    protected bcx(Context context, Looper looper, bdn bdn, axv axv, int i2, bcy bcy, bcz bcz, String str) {
        this.d = (Context) azb.b(context, "Context must not be null");
        azb.b(looper, "Looper must not be null");
        this.k = (bdn) azb.b(bdn, "Supervisor must not be null");
        azb.b(axv, "API availability must not be null");
        this.e = new bdd(this, looper);
        this.u = i2;
        this.s = bcy;
        this.t = bcz;
        this.v = str;
    }

    public abstract IInterface a(IBinder iBinder);

    public abstract String b();

    public abstract String f_();

    private final String q() {
        return this.v == null ? this.d.getClass().getName() : this.v;
    }

    /* access modifiers changed from: protected */
    public final void a(axq axq) {
        this.h = axq.b;
        this.i = System.currentTimeMillis();
    }

    /* access modifiers changed from: private */
    public final void a(int i2, IInterface iInterface) {
        boolean z = true;
        if ((i2 == 4) != (iInterface != null)) {
            z = false;
        }
        azb.b(z);
        synchronized (this.l) {
            this.r = i2;
            this.o = iInterface;
            switch (i2) {
                case 1:
                    if (this.q != null) {
                        bdn bdn = this.k;
                        String f_ = f_();
                        bdf bdf = this.q;
                        q();
                        bdn.a(f_, "com.google.android.gms", 129, bdf);
                        this.q = null;
                        break;
                    }
                    break;
                case 2:
                case 3:
                    if (!(this.q == null || this.j == null)) {
                        String str = this.j.a;
                        String str2 = this.j.b;
                        Log.e("GmsClient", new StringBuilder(String.valueOf(str).length() + 70 + String.valueOf(str2).length()).append("Calling connect() while still connected, missing disconnect() for ").append(str).append(" on ").append(str2).toString());
                        bdn bdn2 = this.k;
                        String str3 = this.j.a;
                        String str4 = this.j.b;
                        bdf bdf2 = this.q;
                        q();
                        bdn2.a(str3, str4, 129, bdf2);
                        this.g.incrementAndGet();
                    }
                    this.q = new bdf(this, this.g.get());
                    this.j = new ber("com.google.android.gms", f_());
                    bdn bdn3 = this.k;
                    String str5 = this.j.a;
                    String str6 = this.j.b;
                    bdf bdf3 = this.q;
                    q();
                    if (!bdn3.a(new bdo(str5, str6, 129), bdf3)) {
                        String str7 = this.j.a;
                        String str8 = this.j.b;
                        Log.e("GmsClient", new StringBuilder(String.valueOf(str7).length() + 34 + String.valueOf(str8).length()).append("unable to connect to service: ").append(str7).append(" on ").append(str8).toString());
                        a(16, this.g.get());
                        break;
                    }
                    break;
                case 4:
                    this.a = System.currentTimeMillis();
                    break;
            }
        }
    }

    /* access modifiers changed from: private */
    public final boolean a(int i2, int i3, IInterface iInterface) {
        boolean z;
        synchronized (this.l) {
            if (this.r != i2) {
                z = false;
            } else {
                a(i3, iInterface);
                z = true;
            }
        }
        return z;
    }

    public final void a(bda bda) {
        this.f = (bda) azb.b(bda, "Connection progress callbacks cannot be null.");
        a(2, (IInterface) null);
    }

    public final boolean f() {
        boolean z;
        synchronized (this.l) {
            z = this.r == 4;
        }
        return z;
    }

    public final boolean g() {
        boolean z;
        synchronized (this.l) {
            z = this.r == 2 || this.r == 3;
        }
        return z;
    }

    private final boolean r() {
        boolean z;
        synchronized (this.l) {
            z = this.r == 3;
        }
        return z;
    }

    public void e() {
        this.g.incrementAndGet();
        synchronized (this.p) {
            int size = this.p.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((bde) this.p.get(i2)).d();
            }
            this.p.clear();
        }
        synchronized (this.m) {
            this.n = null;
        }
        a(1, (IInterface) null);
    }

    public Account k() {
        return null;
    }

    public axs[] l() {
        return new axs[0];
    }

    public Bundle m() {
        return new Bundle();
    }

    public void a(int i2, IBinder iBinder, Bundle bundle, int i3) {
        this.e.sendMessage(this.e.obtainMessage(1, i3, -1, new bdh(this, i2, iBinder, bundle)));
    }

    /* access modifiers changed from: protected */
    public final void a(int i2, int i3) {
        this.e.sendMessage(this.e.obtainMessage(7, i3, -1, new bdi(this, i2)));
    }

    public final void n() {
        if (!f()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public final Bundle a() {
        return null;
    }

    public final IInterface o() {
        IInterface iInterface;
        synchronized (this.l) {
            if (this.r == 5) {
                throw new DeadObjectException();
            }
            n();
            azb.a(this.o != null, "Client is connected but service is null");
            iInterface = this.o;
        }
        return iInterface;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [bds, bdr] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.bdp r10, java.util.Set r11) {
        /*
        // Method dump skipped, instructions count: 218
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bcx.a(bdp, java.util.Set):void");
    }

    public boolean h() {
        return false;
    }

    public final void a(bdb bdb) {
        baj.a(bdb.a.g).post(new bao(bdb));
    }

    public final boolean i() {
        return true;
    }

    public boolean c() {
        return false;
    }

    public Intent d() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    /* access modifiers changed from: protected */
    public Set p() {
        return Collections.EMPTY_SET;
    }

    public final void a(String str, PrintWriter printWriter) {
        int i2;
        IInterface iInterface;
        bdt bdt;
        synchronized (this.l) {
            i2 = this.r;
            iInterface = this.o;
        }
        synchronized (this.m) {
            bdt = this.n;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        switch (i2) {
            case 1:
                printWriter.print("DISCONNECTED");
                break;
            case 2:
                printWriter.print("REMOTE_CONNECTING");
                break;
            case 3:
                printWriter.print("LOCAL_CONNECTING");
                break;
            case 4:
                printWriter.print("CONNECTED");
                break;
            case 5:
                printWriter.print("DISCONNECTING");
                break;
            default:
                printWriter.print("UNKNOWN");
                break;
        }
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append("null");
        } else {
            printWriter.append((CharSequence) b()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (bdt == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(bdt.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.a > 0) {
            PrintWriter append = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j2 = this.a;
            String format = simpleDateFormat.format(new Date(this.a));
            append.println(new StringBuilder(String.valueOf(format).length() + 21).append(j2).append(" ").append(format).toString());
        }
        if (this.c > 0) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            switch (this.b) {
                case 1:
                    printWriter.append("CAUSE_SERVICE_DISCONNECTED");
                    break;
                case 2:
                    printWriter.append("CAUSE_NETWORK_LOST");
                    break;
                default:
                    printWriter.append((CharSequence) String.valueOf(this.b));
                    break;
            }
            PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
            long j3 = this.c;
            String format2 = simpleDateFormat.format(new Date(this.c));
            append2.println(new StringBuilder(String.valueOf(format2).length() + 21).append(j3).append(" ").append(format2).toString());
        }
        if (this.i > 0) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) azb.a(this.h));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j4 = this.i;
            String format3 = simpleDateFormat.format(new Date(this.i));
            append3.println(new StringBuilder(String.valueOf(format3).length() + 21).append(j4).append(" ").append(format3).toString());
        }
    }

    /* access modifiers changed from: private */
    public final boolean s() {
        if (this.x || TextUtils.isEmpty(b()) || TextUtils.isEmpty(null)) {
            return false;
        }
        try {
            Class.forName(b());
            return true;
        } catch (ClassNotFoundException e2) {
            return false;
        }
    }

    public final String j() {
        if (f() && this.j != null) {
            return this.j.b;
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    static /* synthetic */ void a(bcx bcx) {
        int i2;
        if (bcx.r()) {
            i2 = 5;
            bcx.x = true;
        } else {
            i2 = 4;
        }
        bcx.e.sendMessage(bcx.e.obtainMessage(i2, bcx.g.get(), 16));
    }

    static {
        String[] strArr = {"service_esmobile", "service_googleme"};
    }
}
