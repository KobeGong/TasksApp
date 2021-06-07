package defpackage;

import android.accounts.Account;
import java.io.IOException;

/* renamed from: aja  reason: default package */
/* compiled from: PG */
public final class aja extends cri {
    private String a = this.b;
    private final /* synthetic */ String b;
    private final /* synthetic */ Account c;
    private final /* synthetic */ String d;
    private final /* synthetic */ aiz e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aja(aiz aiz, crg crg, String str, Account account, String str2) {
        super(crg);
        this.e = aiz;
        this.b = str;
        this.c = account;
        this.d = str2;
    }

    @Override // defpackage.crj
    public final crg a() {
        try {
            avb.a(this.e.a.getApplicationContext(), this.a);
            this.a = aiz.a(this.e.a, this.c, this.d);
            return new crg(this.a);
        } catch (ava e2) {
            throw new IOException("Unable to refresh auth token", e2);
        }
    }
}
