package defpackage;

/* renamed from: bbv reason: default package */
/* compiled from: PG */
public class bbv extends defpackage.bcc {
    public final android.util.SparseArray b = new android.util.SparseArray();

    public bbv(defpackage.bax bax) {
        super(bax);
        this.a.a("AutoManageHelper", (com.google.android.gms.common.api.internal.LifecycleCallback) this);
    }

    public final void b() {
        super.b();
        boolean z = this.c;
        java.lang.String valueOf = java.lang.String.valueOf(this.b);
        new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 14).append("onStart ").append(z).append(" ").append(valueOf);
        if (this.d.get() == null) {
            for (int i = 0; i < this.b.size(); i++) {
                defpackage.bbw a = a(i);
                if (a != null) {
                    a.b.e();
                }
            }
        }
    }

    public final void d() {
        super.d();
        for (int i = 0; i < this.b.size(); i++) {
            defpackage.bbw a = a(i);
            if (a != null) {
                a.b.g();
            }
        }
    }

    public final void a(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        for (int i = 0; i < this.b.size(); i++) {
            defpackage.bbw a = a(i);
            if (a != null) {
                printWriter.append(str).append("GoogleApiClient #").print(a.a);
                printWriter.println(":");
                a.b.a(java.lang.String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void a(defpackage.axq axq, int i) {
        android.util.Log.w("AutoManageHelper", "Unresolved error while connecting client. Stopping auto-manage.");
        if (i < 0) {
            android.util.Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new java.lang.Exception());
            return;
        }
        defpackage.bbw bbw = (defpackage.bbw) this.b.get(i);
        if (bbw != null) {
            defpackage.bbw bbw2 = (defpackage.bbw) this.b.get(i);
            this.b.remove(i);
            if (bbw2 != null) {
                bbw2.b.b((defpackage.ays) bbw2);
                bbw2.b.g();
            }
            defpackage.ays ays = bbw.c;
            if (ays != null) {
                ays.a(axq);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void e() {
        for (int i = 0; i < this.b.size(); i++) {
            defpackage.bbw a = a(i);
            if (a != null) {
                a.b.e();
            }
        }
    }

    private final defpackage.bbw a(int i) {
        if (this.b.size() <= i) {
            return null;
        }
        return (defpackage.bbw) this.b.get(this.b.keyAt(i));
    }
}
