package defpackage;

import android.content.Context;
import java.util.concurrent.Executors;

/* renamed from: cef  reason: default package */
/* compiled from: PG */
public final class cef implements ecz {
    private final cdz a;
    private final ecz b;
    private final ecz c;
    private final ecz d;
    private final ecz e;
    private final ecz f;

    public cef(cdz cdz, ecz ecz, ecz ecz2, ecz ecz3, ecz ecz4, ecz ecz5) {
        this.a = cdz;
        this.b = ecz;
        this.c = ecz2;
        this.d = ecz3;
        this.e = ecz4;
        this.f = ecz5;
    }

    @Override // defpackage.ecz
    public final /* synthetic */ Object a() {
        cdz cdz = this.a;
        Context context = (Context) this.b.a();
        bsa bsa = (bsa) this.d.a();
        this.e.a();
        this.f.a();
        cdf cdf = new cdf();
        cql a2 = bsh.a((bqw) this.c.a());
        cdv cdv = new cdv(cdf);
        cdk cdk = new cdk((byte) 0);
        cdk.e = new cqq(new cqu(new cqs(new cqv(context, cub.a(Executors.newSingleThreadExecutor()))), new cqt()));
        cdi cdi = new cdi((byte) 0);
        cdi.e = new cea(cdv);
        cdi.d = new ceb(cdv);
        cdv.getClass();
        cdi.a = new cec(cdv);
        cdv.getClass();
        cdi.b = new ced(cdv);
        cdv.getClass();
        cdi.c = new cee(cdv);
        String str = "";
        if (cdi.a == null) {
            str = String.valueOf(str).concat(" myAccountClickListener");
        }
        if (cdi.b == null) {
            str = String.valueOf(str).concat(" privacyPolicyClickListener");
        }
        if (cdi.c == null) {
            str = String.valueOf(str).concat(" termsOfServiceClickListener");
        }
        if (cdi.d == null) {
            str = String.valueOf(str).concat(" useAnotherAccountClickListener");
        }
        if (cdi.e == null) {
            str = String.valueOf(str).concat(" manageAccountsClickListener");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        cdk.c = new cdn(cdi.a, cdi.b, cdi.c, cdi.d, cdi.e);
        cdk.b = cdf;
        cdl cdl = cdz.b;
        if (cdl == null) {
            throw new NullPointerException("Null accountsModel");
        }
        cdk.a = cdl;
        cdk.d = new cds(context, bsa, a2);
        String str2 = "";
        if (cdk.a == null) {
            str2 = String.valueOf(str2).concat(" accountsModel");
        }
        if (cdk.b == null) {
            str2 = String.valueOf(str2).concat(" accountConverter");
        }
        if (cdk.c == null) {
            str2 = String.valueOf(str2).concat(" clickListeners");
        }
        if (cdk.d == null) {
            str2 = String.valueOf(str2).concat(" avatarRetriever");
        }
        if (cdk.e == null) {
            str2 = String.valueOf(str2).concat(" monogramRenderer");
        }
        if (str2.isEmpty()) {
            return (cdj) dgv.a(new cdo(cdk.a, cdk.b, cdk.c, cdk.d, cdk.e), "Cannot return null from a non-@Nullable @Provides method");
        }
        String valueOf2 = String.valueOf(str2);
        throw new IllegalStateException(valueOf2.length() != 0 ? "Missing required properties:".concat(valueOf2) : new String("Missing required properties:"));
    }
}
