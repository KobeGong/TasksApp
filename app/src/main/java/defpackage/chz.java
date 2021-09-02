package defpackage;

/* renamed from: chz reason: default package */
/* compiled from: PG */
public final class chz extends defpackage.cgj implements defpackage.cgr {
    public final android.app.Application a;
    public final defpackage.clt b;
    public final defpackage.cha d;
    public final defpackage.cnn e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final java.util.concurrent.atomic.AtomicLong i = new java.util.concurrent.atomic.AtomicLong();
    public final java.util.concurrent.atomic.AtomicBoolean j = new java.util.concurrent.atomic.AtomicBoolean();
    public java.util.concurrent.ScheduledFuture k;

    chz(android.app.Application application, boolean z, boolean z2, defpackage.cha cha, defpackage.clt clt, defpackage.cnn cnn, defpackage.coe coe) {
        boolean z3;
        int storageEncryptionStatus;
        boolean z4;
        super(coe, application, clt, defpackage.bg.aa);
        this.a = (android.app.Application) defpackage.cky.a((java.lang.Object) application);
        this.f = z;
        this.g = z2;
        this.d = (defpackage.cha) defpackage.cky.a((java.lang.Object) cha);
        this.b = (defpackage.clt) defpackage.cky.a((java.lang.Object) clt);
        this.e = (defpackage.cnn) defpackage.cky.a((java.lang.Object) cnn);
        this.e.b = new defpackage.cnm(this);
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            android.app.admin.DevicePolicyManager devicePolicyManager = (android.app.admin.DevicePolicyManager) application.getSystemService("device_policy");
            if (devicePolicyManager == null) {
                storageEncryptionStatus = 0;
            } else {
                storageEncryptionStatus = devicePolicyManager.getStorageEncryptionStatus();
            }
            if (storageEncryptionStatus == 3 || storageEncryptionStatus == 4 || storageEncryptionStatus == 5) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4 && android.os.Build.FINGERPRINT.contains("userdebug")) {
                z3 = true;
                this.h = z3;
            }
        }
        z3 = false;
        this.h = z3;
    }

    /* access modifiers changed from: 0000 */
    public final void d() {
        this.d.b(this);
        this.e.b();
        e();
    }

    public final void a(android.app.Activity activity) {
        if (!this.c) {
            this.e.a(activity, activity.getClass().getName());
        }
    }

    /* access modifiers changed from: 0000 */
    public final void e() {
        if (this.k != null) {
            if (!this.k.isDone()) {
                this.k.cancel(true);
            }
            this.k = null;
        }
    }
}
