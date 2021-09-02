package defpackage;

/* renamed from: bka reason: default package */
/* compiled from: PG */
public final class bka extends defpackage.bel {
    public bka(android.content.Context context, android.os.Looper looper, defpackage.bdj bdj, defpackage.ayr ayr, defpackage.ays ays) {
        super(context, looper, 51, bdj, ayr, ays);
    }

    /* access modifiers changed from: protected */
    public final java.lang.String f_() {
        return "com.google.android.gms.phenotype.service.START";
    }

    /* access modifiers changed from: protected */
    public final java.lang.String b() {
        return "com.google.android.gms.phenotype.internal.IPhenotypeService";
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ android.os.IInterface a(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.phenotype.internal.IPhenotypeService");
        if (queryLocalInterface instanceof defpackage.bjx) {
            return (defpackage.bjx) queryLocalInterface;
        }
        return new defpackage.bjy(iBinder);
    }
}
