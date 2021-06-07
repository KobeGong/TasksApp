package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import java.util.Set;

/* access modifiers changed from: package-private */
/* renamed from: cow  reason: default package */
/* compiled from: PG */
public final class cow implements coo {
    private final ecz a;
    private Set b;

    cow(ecz ecz) {
        this.a = ecz;
    }

    private final synchronized Set a() {
        if (this.b == null) {
            this.b = (Set) this.a.a();
        }
        return this.b;
    }

    @Override // defpackage.coo
    public final void a(Context context, con con) {
        Integer a2;
        if (Build.VERSION.SDK_INT > 16) {
            SystemClock.elapsedRealtimeNanos();
        }
        con.a();
        Bundle bundle = new Bundle();
        for (coy coy : a()) {
            bundle.putString("event handler account name", con.a(coy.a));
            if (con instanceof cou) {
                cou cou = (cou) con;
                dii dii = (dii) cwp.g.a(bg.ao);
                for (cpc cpc : cou.b.b) {
                    if ((((cwp) dii.a).a & 1) == 1) {
                        int i = cpc.a.a;
                        dii.b();
                        cwp cwp = (cwp) dii.a;
                        if (!cwp.d.a()) {
                            dip dip = cwp.d;
                            int size = dip.size();
                            cwp.d = dip.b(size == 0 ? 10 : size << 1);
                        }
                        cwp.d.d(i);
                    } else {
                        int i2 = cpc.a.a;
                        dii.b();
                        cwp cwp2 = (cwp) dii.a;
                        cwp2.a |= 1;
                        cwp2.b = i2;
                    }
                    if (!((((cwp) dii.a).a & 2) == 2) && (cpc instanceof cpb) && (a2 = ((cpb) cpc).a()) != null) {
                        int intValue = a2.intValue();
                        dii.b();
                        cwp cwp3 = (cwp) dii.a;
                        cwp3.a |= 2;
                        cwp3.c = intValue;
                    }
                }
                int i3 = cou.a;
                if (i3 != -1) {
                    cwr a3 = cwr.a(i3);
                    dii.b();
                    cwp cwp4 = (cwp) dii.a;
                    if (a3 == null) {
                        throw new NullPointerException();
                    }
                    cwp4.a |= 4;
                    cwp4.e = a3.b;
                }
                dii dii2 = (dii) cwx.c.a(bg.ao);
                dii dii3 = (dii) cwv.d.a(bg.ao);
                dii3.b();
                cwv.a((cwv) dii3.a, dii);
                dii dii4 = (dii) cww.c.a(bg.ao);
                cwt cwt = cwt.ANDROID;
                dii4.b();
                cww cww = (cww) dii4.a;
                if (cwt == null) {
                    throw new NullPointerException();
                }
                cww.a |= 1;
                cww.b = cwt.c;
                dii3.b();
                cwv.b((cwv) dii3.a, dii4);
                dii2.b();
                cwx.a((cwx) dii2.a, dii3);
                coy.b.execute(new ajs(coy, dii2, bundle.getString("event handler account name"), cou));
            }
        }
        if (Build.VERSION.SDK_INT > 16) {
            SystemClock.elapsedRealtimeNanos();
        }
    }
}
