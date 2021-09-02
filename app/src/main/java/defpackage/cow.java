package defpackage;

/* renamed from: cow reason: default package */
/* compiled from: PG */
final class cow implements defpackage.coo {
    private final defpackage.ecz a;
    private java.util.Set b;

    cow(defpackage.ecz ecz) {
        this.a = ecz;
    }

    private final synchronized java.util.Set a() {
        if (this.b == null) {
            this.b = (java.util.Set) this.a.a();
        }
        return this.b;
    }

    public final void a(android.content.Context context, defpackage.con con) {
        if (android.os.Build.VERSION.SDK_INT > 16) {
            android.os.SystemClock.elapsedRealtimeNanos();
        }
        con.a();
        android.os.Bundle bundle = new android.os.Bundle();
        for (defpackage.coy coy : a()) {
            bundle.putString("event handler account name", con.a(coy.a));
            if (con instanceof defpackage.cou) {
                defpackage.cou cou = (defpackage.cou) con;
                defpackage.dii dii = (defpackage.dii) defpackage.cwp.g.a(defpackage.bg.ao);
                for (defpackage.cpc cpc : cou.b.b) {
                    if ((((defpackage.cwp) dii.a).a & 1) == 1) {
                        int i = cpc.a.a;
                        dii.b();
                        defpackage.cwp cwp = (defpackage.cwp) dii.a;
                        if (!cwp.d.a()) {
                            defpackage.dip dip = cwp.d;
                            int size = dip.size();
                            cwp.d = dip.b(size == 0 ? 10 : size << 1);
                        }
                        cwp.d.d(i);
                    } else {
                        int i2 = cpc.a.a;
                        dii.b();
                        defpackage.cwp cwp2 = (defpackage.cwp) dii.a;
                        cwp2.a |= 1;
                        cwp2.b = i2;
                    }
                    if (!((((defpackage.cwp) dii.a).a & 2) == 2) && (cpc instanceof defpackage.cpb)) {
                        java.lang.Integer a2 = ((defpackage.cpb) cpc).a();
                        if (a2 != null) {
                            int intValue = a2.intValue();
                            dii.b();
                            defpackage.cwp cwp3 = (defpackage.cwp) dii.a;
                            cwp3.a |= 2;
                            cwp3.c = intValue;
                        }
                    }
                }
                int i3 = cou.a;
                if (i3 != -1) {
                    defpackage.cwr a3 = defpackage.cwr.a(i3);
                    dii.b();
                    defpackage.cwp cwp4 = (defpackage.cwp) dii.a;
                    if (a3 == null) {
                        throw new java.lang.NullPointerException();
                    }
                    cwp4.a |= 4;
                    cwp4.e = a3.b;
                }
                defpackage.dii dii2 = (defpackage.dii) defpackage.cwx.c.a(defpackage.bg.ao);
                defpackage.dii dii3 = (defpackage.dii) defpackage.cwv.d.a(defpackage.bg.ao);
                dii3.b();
                defpackage.cwv.a((defpackage.cwv) dii3.a, dii);
                defpackage.dii dii4 = (defpackage.dii) defpackage.cww.c.a(defpackage.bg.ao);
                defpackage.cwt cwt = defpackage.cwt.ANDROID;
                dii4.b();
                defpackage.cww cww = (defpackage.cww) dii4.a;
                if (cwt == null) {
                    throw new java.lang.NullPointerException();
                }
                cww.a |= 1;
                cww.b = cwt.c;
                dii3.b();
                defpackage.cwv.b((defpackage.cwv) dii3.a, dii4);
                dii2.b();
                defpackage.cwx.a((defpackage.cwx) dii2.a, dii3);
                coy.b.execute(new defpackage.ajs(coy, dii2, bundle.getString("event handler account name"), cou));
            }
        }
        if (android.os.Build.VERSION.SDK_INT > 16) {
            android.os.SystemClock.elapsedRealtimeNanos();
        }
    }
}
