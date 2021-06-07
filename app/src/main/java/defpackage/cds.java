package defpackage;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import java.util.concurrent.Executor;

/* renamed from: cds  reason: default package */
/* compiled from: PG */
public class cds implements cdp {
    private static final String b = cds.class.getSimpleName();
    public final Executor a;
    private final Context c;
    private final bsa d;
    private final cql e;

    cds(Context context, bsa bsa, cql cql) {
        this(context, bsa, cql, AsyncTask.THREAD_POOL_EXECUTOR);
    }

    private cds(Context context, bsa bsa, cql cql, Executor executor) {
        this.c = (Context) cky.a((Object) context);
        this.d = (bsa) cky.a(bsa);
        this.e = (cql) cky.a(cql);
        this.a = (Executor) cky.a(executor);
    }

    @Override // defpackage.cdp
    public final /* synthetic */ void a(Object obj, int i, cdq cdq) {
        int i2 = 2;
        cdu cdu = (cdu) obj;
        if (!this.e.a() && !this.e.b()) {
            Log.w(b, "Client is not connected, no image could be loaded");
            cdq.a(null);
        }
        bsa bsa = this.d;
        cql cql = this.e;
        String b2 = cdu.b();
        if (i > 0) {
            float f = ((float) i) / this.c.getResources().getDisplayMetrics().density;
            if (f > 64.0f) {
                i2 = 3;
            } else if (f <= 48.0f) {
                i2 = f > 32.0f ? 1 : 0;
            }
        }
        bsa.a(cql, b2, i2).a(new cgl(this, cdq));
    }
}
