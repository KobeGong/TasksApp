package defpackage;

import android.accounts.Account;

/* renamed from: anz reason: default package */
final /* synthetic */ class anz implements java.util.concurrent.Callable {
    private final defpackage.any a;
    private final Account b;
    private final defpackage.cyl c;

    anz(defpackage.any any, Account account, defpackage.cyl cyl) {
        this.a = any;
        this.b = account;
        this.c = cyl;
    }

    public final java.lang.Object call() {
        defpackage.any any = this.a;
        return new defpackage.anc(this.b, any.e, this.c, any.b, any.executor, any.d);
    }
}
