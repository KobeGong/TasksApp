package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* renamed from: ajb  reason: default package */
/* compiled from: PG */
public final class ajb {
    private static final String a = "tasks-pa.googleapis.com";
    private static ajb e;
    private final Context b;
    private eht c;
    private dnc d;

    private ajb(Context context) {
        this.b = context;
    }

    public static synchronized ajb a(Context context) {
        ajb ajb;
        synchronized (ajb.class) {
            if (e == null) {
                e = new ajb(context.getApplicationContext());
            }
            ajb = e;
        }
        return ajb;
    }

    public final synchronized dnc a() {
        dnc dnc;
        boolean z = true;
        synchronized (this) {
            if (this.d == null) {
                dqh a2 = dqh.a(a, b());
                TimeUnit timeUnit = TimeUnit.SECONDS;
                if (60 <= 0) {
                    z = false;
                }
                cld.a(z, "idle timeout is %s, but must be positive", 60);
                if (timeUnit.toDays(60) >= 30) {
                    a2.k = -1;
                } else {
                    a2.k = Math.max(timeUnit.toMillis(60), dqv.a);
                }
                dqh dqh = a2;
                dtc a3 = dqh.a();
                dro dro = new dro();
                dzn a4 = dzn.a(dvc.l);
                csd csd = dvc.n;
                ArrayList arrayList = new ArrayList(dqh.c);
                if (dqh.t) {
                    dqh.p = true;
                    arrayList.add(0, new dsd(new drz(dvc.n), dqh.u, dqh.v));
                }
                if (dqh.w) {
                    dqh.p = true;
                    ecn a5 = ecp.a.a();
                    ecp.a.b();
                    arrayList.add(0, new dsg(a5, ecx.a()).e);
                }
                if (dqh.s != null) {
                    arrayList.add(0, drp.e);
                }
                this.d = new dwz(new dwf(dqh, a3, dro, a4, csd, arrayList, drw.b));
            }
            dnc = this.d;
        }
        return dnc;
    }

    private final synchronized eht b() {
        if (this.c == null) {
            this.c = new ehu(this.b).a();
            cjz.a(this.c);
        }
        return this.c;
    }

    static {
        alj.a().b();
        new Object[1][0] = "tasks-pa.googleapis.com";
    }
}
