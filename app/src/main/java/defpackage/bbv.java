package defpackage;

import android.util.Log;
import android.util.SparseArray;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: bbv  reason: default package */
/* compiled from: PG */
public class bbv extends bcc {
    public final SparseArray b = new SparseArray();

    public bbv(bax bax) {
        super(bax);
        this.a.a("AutoManageHelper", this);
    }

    @Override // defpackage.bcc, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void b() {
        super.b();
        boolean z = this.c;
        String valueOf = String.valueOf(this.b);
        new StringBuilder(String.valueOf(valueOf).length() + 14).append("onStart ").append(z).append(" ").append(valueOf);
        if (this.d.get() == null) {
            for (int i = 0; i < this.b.size(); i++) {
                bbw a = a(i);
                if (a != null) {
                    a.b.e();
                }
            }
        }
    }

    @Override // defpackage.bcc, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void d() {
        super.d();
        for (int i = 0; i < this.b.size(); i++) {
            bbw a = a(i);
            if (a != null) {
                a.b.g();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        for (int i = 0; i < this.b.size(); i++) {
            bbw a = a(i);
            if (a != null) {
                printWriter.append((CharSequence) str).append("GoogleApiClient #").print(a.a);
                printWriter.println(":");
                a.b.a(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.bcc
    public final void a(axq axq, int i) {
        Log.w("AutoManageHelper", "Unresolved error while connecting client. Stopping auto-manage.");
        if (i < 0) {
            Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
            return;
        }
        bbw bbw = (bbw) this.b.get(i);
        if (bbw != null) {
            bbw bbw2 = (bbw) this.b.get(i);
            this.b.remove(i);
            if (bbw2 != null) {
                bbw2.b.b(bbw2);
                bbw2.b.g();
            }
            ays ays = bbw.c;
            if (ays != null) {
                ays.a(axq);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.bcc
    public final void e() {
        for (int i = 0; i < this.b.size(); i++) {
            bbw a = a(i);
            if (a != null) {
                a.b.e();
            }
        }
    }

    private final bbw a(int i) {
        if (this.b.size() <= i) {
            return null;
        }
        return (bbw) this.b.get(this.b.keyAt(i));
    }
}
