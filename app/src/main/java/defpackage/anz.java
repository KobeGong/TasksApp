package defpackage;

import android.accounts.Account;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: anz  reason: default package */
public final /* synthetic */ class anz implements Callable {
    private final any a;
    private final Account b;
    private final cyl c;

    anz(any any, Account account, cyl cyl) {
        this.a = any;
        this.b = account;
        this.c = cyl;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        any any = this.a;
        return new anc(this.b, any.appContext, this.c, any.b, any.executor, any.d);
    }
}
