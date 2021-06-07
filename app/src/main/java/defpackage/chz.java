package defpackage;

import android.app.Activity;
import android.app.Application;
import android.app.admin.DevicePolicyManager;
import android.os.Build;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: chz  reason: default package */
/* compiled from: PG */
public final class chz extends cgj implements cgr {
    public final Application a;
    public final clt b;
    public final cha d;
    public final cnn e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final AtomicLong i = new AtomicLong();
    public final AtomicBoolean j = new AtomicBoolean();
    public ScheduledFuture k;

    chz(Application application, boolean z, boolean z2, cha cha, clt clt, cnn cnn, coe coe) {
        super(coe, application, clt, bg.aa);
        boolean z3;
        int storageEncryptionStatus;
        boolean z4;
        this.a = (Application) cky.a((Object) application);
        this.f = z;
        this.g = z2;
        this.d = (cha) cky.a(cha);
        this.b = (clt) cky.a(clt);
        this.e = (cnn) cky.a(cnn);
        this.e.b = new cnm(this);
        if (Build.VERSION.SDK_INT >= 23) {
            DevicePolicyManager devicePolicyManager = (DevicePolicyManager) application.getSystemService("device_policy");
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
            if (z4 && Build.FINGERPRINT.contains("userdebug")) {
                z3 = true;
                this.h = z3;
            }
        }
        z3 = false;
        this.h = z3;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.cgj
    public final void d() {
        this.d.b(this);
        this.e.b();
        e();
    }

    @Override // defpackage.cgr
    public final void a(Activity activity) {
        if (!this.c) {
            this.e.a(activity, activity.getClass().getName());
        }
    }

    /* access modifiers changed from: package-private */
    public final void e() {
        if (this.k != null) {
            if (!this.k.isDone()) {
                this.k.cancel(true);
            }
            this.k = null;
        }
    }
}
