package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;

/* renamed from: alq  reason: default package */
/* compiled from: PG */
public final class alq {
    private static alq d;
    public List a = new ArrayList();
    public Handler b = new Handler(Looper.getMainLooper());
    public String c;

    private alq() {
    }

    public final void a(alu alu) {
        this.a.add(alu);
    }

    public final void b(alu alu) {
        this.a.remove(alu);
    }

    public final void a(String str) {
        this.b.post(new als(this, str));
    }

    public final void a(String str, String str2) {
        this.b.post(new alt(this, str, str2));
    }

    public static synchronized alq a() {
        alq alq;
        synchronized (alq.class) {
            if (d == null) {
                d = new alq();
            }
            alq = d;
        }
        return alq;
    }
}
