package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import java.util.Set;

/* renamed from: bbi  reason: default package */
/* compiled from: PG */
public final class bbi extends bke implements ayr, ays {
    private static ayf h = bpp.a;
    public final Context a;
    public final Handler b;
    public final ayf c;
    public Set d;
    public bdj e;
    public bps f;
    public bbl g;

    public bbi(Context context, Handler handler, bdj bdj) {
        this(context, handler, bdj, h);
    }

    private bbi(Context context, Handler handler, bdj bdj, ayf ayf) {
        super((byte) 0);
        this.a = context;
        this.b = handler;
        this.e = (bdj) azb.b(bdj, "ClientSettings must not be null");
        this.d = bdj.b;
        this.c = ayf;
    }

    @Override // defpackage.ayr
    public final void a(Bundle bundle) {
        this.f.a(this);
    }

    @Override // defpackage.ayr
    public final void a(int i) {
        this.f.e();
    }

    @Override // defpackage.ays
    public final void a(axq axq) {
        this.g.b(axq);
    }

    @Override // defpackage.bkd, defpackage.bke
    public final void a(bkk bkk) {
        this.b.post(new bbk(this, bkk));
    }

    static /* synthetic */ void a(bbi bbi, bkk bkk) {
        axq axq = bkk.a;
        if (axq.b()) {
            bed bed = bkk.b;
            axq axq2 = bed.a;
            if (!axq2.b()) {
                String valueOf = String.valueOf(axq2);
                Log.wtf("SignInCoordinator", new StringBuilder(String.valueOf(valueOf).length() + 48).append("Sign-in succeeded with resolve account failure: ").append(valueOf).toString(), new Exception());
                bbi.g.b(axq2);
            } else {
                bbl bbl = bbi.g;
                bdp a2 = bed.a();
                Set set = bbi.d;
                if (a2 == null || set == null) {
                    Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                    bbl.b(new axq(4));
                } else {
                    bbl.c = a2;
                    bbl.d = set;
                    bbl.a();
                }
            }
        } else {
            bbi.g.b(axq);
        }
        bbi.f.e();
    }
}
