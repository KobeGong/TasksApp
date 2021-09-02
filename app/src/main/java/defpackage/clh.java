package defpackage;

/* renamed from: clh reason: default package */
/* compiled from: PG */
public final class clh implements defpackage.cgx, defpackage.cls {
    private final defpackage.cha a;
    private final defpackage.clt b;
    private final defpackage.clt c;

    clh(defpackage.cha cha, defpackage.clt clt, defpackage.clt clt2) {
        this.a = cha;
        this.a.a((defpackage.cgp) this);
        this.b = clt;
        this.c = clt2;
    }

    public final void b(android.app.Activity activity) {
        java.lang.String str;
        this.a.b(this);
        defpackage.clf clf = defpackage.clf.a;
        if (clf.g > 0) {
            if (this.b.a() != null && a(clf) > 0) {
                long j = clf.g;
                boolean z = clf.b;
                long a2 = a(clf);
                a(clf, a2, 0, "Warm startup");
                long j2 = clf.h;
                if (clf.h < clf.g) {
                    str = "Warm startup interactive before onDraw";
                } else {
                    str = "Warm startup interactive";
                }
                a(clf, a2, 0, str);
                long j3 = clf.e;
                long j4 = clf.g;
                if (0 != 0) {
                    a(clf, 0, 0, "Warm startup activity onStart");
                }
            }
            if (this.c.a() != null && a(clf) > 0) {
                long a3 = a(clf);
                if (clf.g >= a3) {
                    boolean z2 = clf.b;
                    defpackage.clg clg = new defpackage.clg("Warm startup", a3);
                    defpackage.clg[] a4 = clf.a();
                    java.lang.String valueOf = java.lang.String.valueOf(a4[0].a);
                    java.lang.String valueOf2 = java.lang.String.valueOf(": onCreate");
                    clg.a(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new java.lang.String(valueOf), clf.d, a4[0].b);
                    long j5 = a4[0].b;
                    for (int i = 1; i < a4.length; i++) {
                        long j6 = a4[i].b;
                        java.lang.String valueOf3 = java.lang.String.valueOf(a4[i].a);
                        java.lang.String valueOf4 = java.lang.String.valueOf(": onCreate");
                        clg.a(valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new java.lang.String(valueOf3), 0, 0);
                    }
                    long j7 = a4[a4.length - 1].b;
                    java.lang.String str2 = a4[a4.length - 1].a;
                    java.lang.String valueOf5 = java.lang.String.valueOf(null);
                    java.lang.String valueOf6 = java.lang.String.valueOf(": onStart");
                    clg.a(valueOf6.length() != 0 ? valueOf5.concat(valueOf6) : new java.lang.String(valueOf5), 0, clf.e);
                    java.lang.String valueOf7 = java.lang.String.valueOf(null);
                    java.lang.String valueOf8 = java.lang.String.valueOf(": onResume");
                    clg.a(valueOf8.length() != 0 ? valueOf7.concat(valueOf8) : new java.lang.String(valueOf7), clf.e, clf.f);
                    java.lang.String valueOf9 = java.lang.String.valueOf(null);
                    java.lang.String valueOf10 = java.lang.String.valueOf(": onDraw");
                    clg.a(valueOf10.length() != 0 ? valueOf9.concat(valueOf10) : new java.lang.String(valueOf9), clf.f, clf.g);
                    defpackage.clx clx = (defpackage.clx) this.c.a();
                    defpackage.efi efi = new defpackage.efi();
                    efi.a = java.lang.Long.valueOf(java.util.UUID.randomUUID().getLeastSignificantBits());
                    efi.b = (defpackage.efs[]) clg.c.toArray(new defpackage.efs[clg.c.size()]);
                    java.lang.String a5 = defpackage.civ.a(clf.i);
                    defpackage.cdm.a(3, "TraceMetricService", "Recording trace %d: %s", efi.a, efi.b[0].a);
                    defpackage.efx efx = new defpackage.efx();
                    efx.q = efi;
                    if (a5 != null) {
                        efx.u = new defpackage.edd();
                        efx.u.a = a5;
                    }
                    clx.a(null, true, efx, null);
                }
            }
        }
    }

    private static long a(defpackage.clf clf) {
        boolean z = clf.b;
        return clf.d;
    }

    private final void a(defpackage.clf clf, long j, long j2, java.lang.String str) {
        if (0 >= j) {
            defpackage.clv clv = (defpackage.clv) this.b.a();
            defpackage.clu clu = new defpackage.clu(j, 0);
            java.lang.String a2 = defpackage.civ.a(clf.i);
            if (clv.b()) {
                clv.c().submit(new defpackage.clw(clv, str, defpackage.clv.a(clu, a2)));
            }
        }
    }

    public final void a() {
        this.a.b(this);
    }
}
