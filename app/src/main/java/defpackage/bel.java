package defpackage;

/* renamed from: bel reason: default package */
/* compiled from: PG */
public abstract class bel extends defpackage.bcx implements defpackage.ayj, defpackage.ben {
    private final java.util.Set a;
    private final android.accounts.Account h;

    public bel(android.content.Context context, android.os.Looper looper, int i, defpackage.bdj bdj, defpackage.ayr ayr, defpackage.ays ays) {
        this(context, looper, defpackage.bdn.a(context), defpackage.axt.a, i, bdj, (defpackage.ayr) defpackage.azb.b((java.lang.Object) ayr), (defpackage.ays) defpackage.azb.b((java.lang.Object) ays));
    }

    private bel(android.content.Context context, android.os.Looper looper, defpackage.bdn bdn, defpackage.axt axt, int i, defpackage.bdj bdj, defpackage.ayr ayr, defpackage.ays ays) {
        defpackage.bcy bcy;
        defpackage.bcz bcz;
        if (ayr == null) {
            bcy = null;
        } else {
            bcy = new defpackage.bcy(ayr);
        }
        if (ays == null) {
            bcz = null;
        } else {
            bcz = new defpackage.bcz(ays);
        }
        super(context, looper, bdn, axt, i, bcy, bcz, bdj.f);
        this.h = bdj.a;
        java.util.Set<com.google.android.gms.common.api.Scope> set = bdj.c;
        for (com.google.android.gms.common.api.Scope contains : set) {
            if (!set.contains(contains)) {
                throw new java.lang.IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.a = set;
    }

    public final android.accounts.Account k() {
        return this.h;
    }

    /* access modifiers changed from: protected */
    public final java.util.Set p() {
        return this.a;
    }

    public final defpackage.axs[] l() {
        return new defpackage.axs[0];
    }
}
