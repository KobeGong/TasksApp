package defpackage;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bcc  reason: default package */
/* compiled from: PG */
public abstract class bcc extends LifecycleCallback implements DialogInterface.OnCancelListener {
    public volatile boolean c;
    public final AtomicReference d;
    public final Handler e;

    /* access modifiers changed from: protected */
    public abstract void a(axq axq, int i);

    /* access modifiers changed from: protected */
    public abstract void e();

    protected bcc(bax bax) {
        this(bax, axt.a);
    }

    private bcc(bax bax, axt axt) {
        super(bax);
        this.d = new AtomicReference(null);
        this.e = new Handler(Looper.getMainLooper());
    }

    public void onCancel(DialogInterface dialogInterface) {
        a(new axq(13, null), a((bcd) this.d.get()));
        f();
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void a(Bundle bundle) {
        bcd bcd;
        super.a(bundle);
        if (bundle != null) {
            AtomicReference atomicReference = this.d;
            if (bundle.getBoolean("resolving_error", false)) {
                bcd = new bcd(new axq(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1));
            } else {
                bcd = null;
            }
            atomicReference.set(bcd);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void b(Bundle bundle) {
        super.b(bundle);
        bcd bcd = (bcd) this.d.get();
        if (bcd != null) {
            bundle.putBoolean("resolving_error", true);
            bundle.putInt("failed_client_id", bcd.a);
            bundle.putInt("failed_status", bcd.b.b);
            bundle.putParcelable("failed_resolution", bcd.b.c);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void b() {
        super.b();
        this.c = true;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void a(int i, int i2, Intent intent) {
        boolean z;
        int i3 = 13;
        bcd bcd = (bcd) this.d.get();
        switch (i) {
            case 1:
                if (i2 != -1) {
                    if (i2 == 0) {
                        if (intent != null) {
                            i3 = intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13);
                        }
                        bcd bcd2 = new bcd(new axq(i3, null), a(bcd));
                        this.d.set(bcd2);
                        bcd = bcd2;
                        z = false;
                        break;
                    }
                    z = false;
                    break;
                } else {
                    z = true;
                    break;
                }
            case 2:
                int a = axv.a(a());
                if (a == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (bcd == null) {
                    return;
                }
                if (bcd.b.b == 18 && a == 18) {
                    return;
                }
            default:
                z = false;
                break;
        }
        if (z) {
            f();
        } else if (bcd != null) {
            a(bcd.b, bcd.a);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void d() {
        super.d();
        this.c = false;
    }

    /* access modifiers changed from: protected */
    public final void f() {
        this.d.set(null);
        e();
    }

    private static int a(bcd bcd) {
        if (bcd == null) {
            return -1;
        }
        return bcd.a;
    }
}
