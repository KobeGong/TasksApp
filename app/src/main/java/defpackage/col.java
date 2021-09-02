package defpackage;

/* renamed from: col reason: default package */
/* compiled from: PG */
public abstract class col implements defpackage.coe {
    /* access modifiers changed from: protected */
    public abstract void b(defpackage.efx efx);

    public final void a(defpackage.efx efx) {
        defpackage.eer[] eerArr;
        defpackage.eew[] eewArr;
        java.lang.Long l;
        efx.b = android.text.TextUtils.isEmpty(efx.r) ? defpackage.chs.a(efx.c) : null;
        efx.c = null;
        if (!(efx.l == null || efx.l.a == null)) {
            defpackage.edl edl = efx.l.a;
            if (android.text.TextUtils.isEmpty(edl.d)) {
                l = defpackage.chs.a(edl.c);
            } else {
                l = null;
            }
            edl.b = l;
            edl.c = null;
        }
        if (!(efx.i == null || efx.i.i == null)) {
            for (defpackage.eew eew : efx.i.i) {
                if (!android.text.TextUtils.isEmpty(eew.a)) {
                    eew.b = a(eew.a);
                }
                eew.a = null;
            }
        }
        if (!(efx.f == null || efx.f.a == null)) {
            for (defpackage.eer eer : efx.f.a) {
                if (!android.text.TextUtils.isEmpty(eer.s)) {
                    try {
                        eer.t = a(eer.s);
                    } catch (java.lang.RuntimeException e) {
                        defpackage.cdm.a(5, "HashedNamesTransmitter", "Exception while converting network url.", new java.lang.Object[0]);
                    }
                }
                eer.s = null;
            }
        }
        b(efx);
    }

    private static long[] a(java.lang.String str) {
        java.lang.String[] split = str.replaceFirst("^/+", "").split("/+");
        long[] jArr = new long[split.length];
        for (int i = 0; i < jArr.length; i++) {
            jArr[i] = defpackage.chs.a(split[i]).longValue();
        }
        return jArr;
    }
}
