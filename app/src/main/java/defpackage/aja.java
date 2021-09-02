package defpackage;

/* renamed from: aja reason: default package */
/* compiled from: PG */
public final class aja extends defpackage.cri {
    private java.lang.String a = this.b;
    private final /* synthetic */ java.lang.String b;
    private final /* synthetic */ android.accounts.Account c;
    private final /* synthetic */ java.lang.String d;
    private final /* synthetic */ defpackage.aiz e;

    public aja(defpackage.aiz aiz, defpackage.crg crg, java.lang.String str, android.accounts.Account account, java.lang.String str2) {
        this.e = aiz;
        this.b = str;
        this.c = account;
        this.d = str2;
        super(crg);
    }

    public final defpackage.crg a() {
        try {
            defpackage.avb.a(this.e.a.getApplicationContext(), this.a);
            this.a = defpackage.aiz.a(this.e.a, this.c, this.d);
            return new defpackage.crg(this.a);
        } catch (defpackage.ava e2) {
            throw new java.io.IOException("Unable to refresh auth token", e2);
        }
    }
}
