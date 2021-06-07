package defpackage;

import android.app.Activity;
import java.util.UUID;

/* renamed from: clh  reason: default package */
/* compiled from: PG */
public final class clh implements cgx, cls {
    private final cha a;
    private final clt b;
    private final clt c;

    clh(cha cha, clt clt, clt clt2) {
        this.a = cha;
        this.a.a(this);
        this.b = clt;
        this.c = clt2;
    }

    @Override // defpackage.cgx
    public final void b(Activity activity) {
        String str;
        this.a.b(this);
        clf clf = clf.a;
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
                    clg clg = new clg("Warm startup", a3);
                    clg[] a4 = clf.a();
                    String valueOf = String.valueOf(a4[0].a);
                    String valueOf2 = String.valueOf(": onCreate");
                    clg.a(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), clf.d, a4[0].b);
                    long j5 = a4[0].b;
                    for (int i = 1; i < a4.length; i++) {
                        long j6 = a4[i].b;
                        String valueOf3 = String.valueOf(a4[i].a);
                        String valueOf4 = String.valueOf(": onCreate");
                        clg.a(valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3), 0, 0);
                    }
                    long j7 = a4[a4.length - 1].b;
                    String str2 = a4[a4.length - 1].a;
                    String valueOf5 = String.valueOf((Object) null);
                    String valueOf6 = String.valueOf(": onStart");
                    clg.a(valueOf6.length() != 0 ? valueOf5.concat(valueOf6) : new String(valueOf5), 0, clf.e);
                    String valueOf7 = String.valueOf((Object) null);
                    String valueOf8 = String.valueOf(": onResume");
                    clg.a(valueOf8.length() != 0 ? valueOf7.concat(valueOf8) : new String(valueOf7), clf.e, clf.f);
                    String valueOf9 = String.valueOf((Object) null);
                    String valueOf10 = String.valueOf(": onDraw");
                    clg.a(valueOf10.length() != 0 ? valueOf9.concat(valueOf10) : new String(valueOf9), clf.f, clf.g);
                    clx clx = (clx) this.c.a();
                    efi efi = new efi();
                    efi.a = Long.valueOf(UUID.randomUUID().getLeastSignificantBits());
                    efi.b = (efs[]) clg.c.toArray(new efs[clg.c.size()]);
                    String a5 = civ.a(clf.i);
                    cdm.a(3, "TraceMetricService", "Recording trace %d: %s", efi.a, efi.b[0].a);
                    efx efx = new efx();
                    efx.q = efi;
                    if (a5 != null) {
                        efx.u = new edd();
                        efx.u.a = a5;
                    }
                    clx.a((String) null, true, efx, (eeo) null);
                }
            }
        }
    }

    private static long a(clf clf) {
        boolean z = clf.b;
        return clf.d;
    }

    private final void a(clf clf, long j, long j2, String str) {
        if (0 >= j) {
            clv clv = (clv) this.b.a();
            clu clu = new clu(j, 0);
            String a2 = civ.a(clf.i);
            if (clv.b()) {
                clv.c().submit(new clw(clv, str, clv.a(clu, a2)));
            }
        }
    }

    @Override // defpackage.cls
    public final void a() {
        this.a.b(this);
    }
}
