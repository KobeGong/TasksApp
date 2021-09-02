package defpackage;

/* renamed from: cef reason: default package */
/* compiled from: PG */
public final class cef implements defpackage.ecz {
    private final defpackage.cdz a;
    private final defpackage.ecz b;
    private final defpackage.ecz c;
    private final defpackage.ecz d;
    private final defpackage.ecz e;
    private final defpackage.ecz f;

    public cef(defpackage.cdz cdz, defpackage.ecz ecz, defpackage.ecz ecz2, defpackage.ecz ecz3, defpackage.ecz ecz4, defpackage.ecz ecz5) {
        this.a = cdz;
        this.b = ecz;
        this.c = ecz2;
        this.d = ecz3;
        this.e = ecz4;
        this.f = ecz5;
    }

    public final /* synthetic */ java.lang.Object a() {
        defpackage.cdz cdz = this.a;
        android.content.Context context = (android.content.Context) this.b.a();
        defpackage.bqw bqw = (defpackage.bqw) this.c.a();
        defpackage.bsa bsa = (defpackage.bsa) this.d.a();
        this.e.a();
        this.f.a();
        defpackage.cdf cdf = new defpackage.cdf();
        defpackage.cql a2 = defpackage.bsh.a(bqw);
        defpackage.cdv cdv = new defpackage.cdv(cdf);
        defpackage.cdk cdk = new defpackage.cdk(0);
        cdk.e = new defpackage.cqq(new defpackage.cqu(new defpackage.cqs(new defpackage.cqv(context, defpackage.cub.a(java.util.concurrent.Executors.newSingleThreadExecutor()))), new defpackage.cqt()));
        defpackage.cdi cdi = new defpackage.cdi(0);
        cdi.e = new defpackage.cea(cdv);
        cdi.d = new defpackage.ceb(cdv);
        cdv.getClass();
        cdi.a = new defpackage.cec(cdv);
        cdv.getClass();
        cdi.b = new defpackage.ced(cdv);
        cdv.getClass();
        cdi.c = new defpackage.cee(cdv);
        java.lang.String str = "";
        if (cdi.a == null) {
            str = java.lang.String.valueOf(str).concat(" myAccountClickListener");
        }
        if (cdi.b == null) {
            str = java.lang.String.valueOf(str).concat(" privacyPolicyClickListener");
        }
        if (cdi.c == null) {
            str = java.lang.String.valueOf(str).concat(" termsOfServiceClickListener");
        }
        if (cdi.d == null) {
            str = java.lang.String.valueOf(str).concat(" useAnotherAccountClickListener");
        }
        if (cdi.e == null) {
            str = java.lang.String.valueOf(str).concat(" manageAccountsClickListener");
        }
        if (!str.isEmpty()) {
            java.lang.String str2 = "Missing required properties:";
            java.lang.String valueOf = java.lang.String.valueOf(str);
            throw new java.lang.IllegalStateException(valueOf.length() != 0 ? str2.concat(valueOf) : new java.lang.String(str2));
        }
        cdk.c = new defpackage.cdn(cdi.a, cdi.b, cdi.c, cdi.d, cdi.e);
        cdk.b = cdf;
        defpackage.cdl cdl = cdz.b;
        if (cdl == null) {
            throw new java.lang.NullPointerException("Null accountsModel");
        }
        cdk.a = cdl;
        cdk.d = new defpackage.cds(context, bsa, a2);
        java.lang.String str3 = "";
        if (cdk.a == null) {
            str3 = java.lang.String.valueOf(str3).concat(" accountsModel");
        }
        if (cdk.b == null) {
            str3 = java.lang.String.valueOf(str3).concat(" accountConverter");
        }
        if (cdk.c == null) {
            str3 = java.lang.String.valueOf(str3).concat(" clickListeners");
        }
        if (cdk.d == null) {
            str3 = java.lang.String.valueOf(str3).concat(" avatarRetriever");
        }
        if (cdk.e == null) {
            str3 = java.lang.String.valueOf(str3).concat(" monogramRenderer");
        }
        if (str3.isEmpty()) {
            return (defpackage.cdj) defpackage.dgv.a((java.lang.Object) new defpackage.cdo(cdk.a, cdk.b, cdk.c, cdk.d, cdk.e), "Cannot return null from a non-@Nullable @Provides method");
        }
        java.lang.String str4 = "Missing required properties:";
        java.lang.String valueOf2 = java.lang.String.valueOf(str3);
        throw new java.lang.IllegalStateException(valueOf2.length() != 0 ? str4.concat(valueOf2) : new java.lang.String(str4));
    }
}
