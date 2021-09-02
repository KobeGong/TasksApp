package defpackage;

/* renamed from: bdh reason: default package */
/* compiled from: PG */
public final class bdh extends defpackage.bdc {
    private android.os.IBinder c;
    private /* synthetic */ defpackage.bcx d;

    public bdh(defpackage.bcx bcx, int i, android.os.IBinder iBinder, android.os.Bundle bundle) {
        this.d = bcx;
        super(bcx, i, bundle);
        this.c = iBinder;
    }

    /* access modifiers changed from: protected */
    public final void a(defpackage.axq axq) {
        if (this.d.t != null) {
            this.d.t.a(axq);
        }
        this.d.a(axq);
    }

    /* access modifiers changed from: protected */
    public final boolean a() {
        try {
            java.lang.String interfaceDescriptor = this.c.getInterfaceDescriptor();
            if (!this.d.b().equals(interfaceDescriptor)) {
                java.lang.String b = this.d.b();
                android.util.Log.e("GmsClient", new java.lang.StringBuilder(java.lang.String.valueOf(b).length() + 34 + java.lang.String.valueOf(interfaceDescriptor).length()).append("service descriptor mismatch: ").append(b).append(" vs. ").append(interfaceDescriptor).toString());
                return false;
            }
            android.os.IInterface a = this.d.a(this.c);
            if (a == null) {
                return false;
            }
            if (!this.d.a(2, 4, a) && !this.d.a(3, 4, a)) {
                return false;
            }
            this.d.w = null;
            if (this.d.s != null) {
                this.d.s.a.a((android.os.Bundle) null);
            }
            return true;
        } catch (android.os.RemoteException e) {
            android.util.Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
