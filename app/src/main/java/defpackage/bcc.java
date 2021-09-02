package defpackage;

/* renamed from: bcc reason: default package */
/* compiled from: PG */
public abstract class bcc extends com.google.android.gms.common.api.internal.LifecycleCallback implements android.content.DialogInterface.OnCancelListener {
    public volatile boolean c;
    public final java.util.concurrent.atomic.AtomicReference d;
    public final android.os.Handler e;

    /* access modifiers changed from: protected */
    public abstract void a(defpackage.axq axq, int i);

    /* access modifiers changed from: protected */
    public abstract void e();

    protected bcc(defpackage.bax bax) {
        this(bax, defpackage.axt.a);
    }

    private bcc(defpackage.bax bax, defpackage.axt axt) {
        super(bax);
        this.d = new java.util.concurrent.atomic.AtomicReference(null);
        this.e = new android.os.Handler(android.os.Looper.getMainLooper());
    }

    public void onCancel(android.content.DialogInterface dialogInterface) {
        a(new defpackage.axq(13, null), a((defpackage.bcd) this.d.get()));
        f();
    }

    public final void a(android.os.Bundle bundle) {
        defpackage.bcd bcd;
        super.a(bundle);
        if (bundle != null) {
            java.util.concurrent.atomic.AtomicReference atomicReference = this.d;
            if (bundle.getBoolean("resolving_error", false)) {
                bcd = new defpackage.bcd(new defpackage.axq(bundle.getInt("failed_status"), (android.app.PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1));
            } else {
                bcd = null;
            }
            atomicReference.set(bcd);
        }
    }

    public final void b(android.os.Bundle bundle) {
        super.b(bundle);
        defpackage.bcd bcd = (defpackage.bcd) this.d.get();
        if (bcd != null) {
            bundle.putBoolean("resolving_error", true);
            bundle.putInt("failed_client_id", bcd.a);
            bundle.putInt("failed_status", bcd.b.b);
            bundle.putParcelable("failed_resolution", bcd.b.c);
        }
    }

    public void b() {
        super.b();
        this.c = true;
    }

    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r7, int r8, android.content.Intent r9) {
        /*
            r6 = this;
            r5 = 18
            r1 = 13
            r2 = 1
            r3 = 0
            java.util.concurrent.atomic.AtomicReference r0 = r6.d
            java.lang.Object r0 = r0.get()
            bcd r0 = (defpackage.bcd) r0
            switch(r7) {
                case 1: goto L_0x002e;
                case 2: goto L_0x0018;
                default: goto L_0x0011;
            }
        L_0x0011:
            r1 = r3
        L_0x0012:
            if (r1 == 0) goto L_0x0054
            r6.f()
        L_0x0017:
            return
        L_0x0018:
            android.app.Activity r1 = r6.a()
            int r4 = defpackage.axv.a(r1)
            if (r4 != 0) goto L_0x005e
            r1 = r2
        L_0x0023:
            if (r0 == 0) goto L_0x0017
            axq r2 = r0.b
            int r2 = r2.b
            if (r2 != r5) goto L_0x0012
            if (r4 != r5) goto L_0x0012
            goto L_0x0017
        L_0x002e:
            r4 = -1
            if (r8 != r4) goto L_0x0033
            r1 = r2
            goto L_0x0012
        L_0x0033:
            if (r8 != 0) goto L_0x0011
            if (r9 == 0) goto L_0x003d
            java.lang.String r2 = "<<ResolutionFailureErrorDetail>>"
            int r1 = r9.getIntExtra(r2, r1)
        L_0x003d:
            bcd r2 = new bcd
            axq r4 = new axq
            r5 = 0
            r4.<init>(r1, r5)
            int r0 = a(r0)
            r2.<init>(r4, r0)
            java.util.concurrent.atomic.AtomicReference r0 = r6.d
            r0.set(r2)
            r0 = r2
            r1 = r3
            goto L_0x0012
        L_0x0054:
            if (r0 == 0) goto L_0x0017
            axq r1 = r0.b
            int r0 = r0.a
            r6.a(r1, r0)
            goto L_0x0017
        L_0x005e:
            r1 = r3
            goto L_0x0023
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bcc.a(int, int, android.content.Intent):void");
    }

    public void d() {
        super.d();
        this.c = false;
    }

    /* access modifiers changed from: protected */
    public final void f() {
        this.d.set(null);
        e();
    }

    private static int a(defpackage.bcd bcd) {
        if (bcd == null) {
            return -1;
        }
        return bcd.a;
    }
}
