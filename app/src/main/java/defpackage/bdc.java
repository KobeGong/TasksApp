package defpackage;

/* renamed from: bdc reason: default package */
/* compiled from: PG */
abstract class bdc extends defpackage.bde {
    private int c;
    private android.os.Bundle d;
    private /* synthetic */ defpackage.bcx e;

    protected bdc(defpackage.bcx bcx, int i, android.os.Bundle bundle) {
        this.e = bcx;
        super(bcx, java.lang.Boolean.valueOf(true));
        this.c = i;
        this.d = bundle;
    }

    /* access modifiers changed from: protected */
    public abstract void a(defpackage.axq axq);

    /* access modifiers changed from: protected */
    public abstract boolean a();

    /* access modifiers changed from: protected */
    public final void b() {
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void a(java.lang.Object obj) {
        android.app.PendingIntent pendingIntent = null;
        if (((java.lang.Boolean) obj) == null) {
            this.e.a(1, (android.os.IInterface) null);
            return;
        }
        switch (this.c) {
            case 0:
                if (!a()) {
                    this.e.a(1, (android.os.IInterface) null);
                    a(new defpackage.axq(8, null));
                    return;
                }
                return;
            case 10:
                this.e.a(1, (android.os.IInterface) null);
                throw new java.lang.IllegalStateException("A fatal developer error has occurred. Check the logs for further information.");
            default:
                this.e.a(1, (android.os.IInterface) null);
                if (this.d != null) {
                    pendingIntent = (android.app.PendingIntent) this.d.getParcelable("pendingIntent");
                }
                a(new defpackage.axq(this.c, pendingIntent));
                return;
        }
    }
}
