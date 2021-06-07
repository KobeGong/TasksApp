package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IInterface;

/* access modifiers changed from: package-private */
/* renamed from: bdc  reason: default package */
/* compiled from: PG */
public abstract class bdc extends bde {
    private int c;
    private Bundle d;
    private /* synthetic */ bcx e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected bdc(bcx bcx, int i, Bundle bundle) {
        super(bcx, true);
        this.e = bcx;
        this.c = i;
        this.d = bundle;
    }

    /* access modifiers changed from: protected */
    public abstract void a(axq axq);

    /* access modifiers changed from: protected */
    public abstract boolean a();

    /* access modifiers changed from: protected */
    @Override // defpackage.bde
    public final void b() {
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.bde
    public final /* synthetic */ void a(Object obj) {
        PendingIntent pendingIntent = null;
        if (((Boolean) obj) == null) {
            this.e.a((bcx) 1, (int) ((IInterface) null));
            return;
        }
        switch (this.c) {
            case 0:
                if (!a()) {
                    this.e.a((bcx) 1, (int) ((IInterface) null));
                    a(new axq(8, null));
                    return;
                }
                return;
            case 10:
                this.e.a((bcx) 1, (int) ((IInterface) null));
                throw new IllegalStateException("A fatal developer error has occurred. Check the logs for further information.");
            default:
                this.e.a((bcx) 1, (int) ((IInterface) null));
                if (this.d != null) {
                    pendingIntent = (PendingIntent) this.d.getParcelable("pendingIntent");
                }
                a(new axq(this.c, pendingIntent));
                return;
        }
    }
}
