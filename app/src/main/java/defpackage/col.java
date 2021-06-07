package defpackage;

import android.text.TextUtils;

/* renamed from: col  reason: default package */
/* compiled from: PG */
public abstract class col implements coe {
    /* access modifiers changed from: protected */
    public abstract void b(efx efx);

    @Override // defpackage.coe
    public final void a(efx efx) {
        efx.b = TextUtils.isEmpty(efx.r) ? chs.a(efx.c) : null;
        efx.c = null;
        if (!(efx.l == null || efx.l.a == null)) {
            edl edl = efx.l.a;
            edl.b = TextUtils.isEmpty(edl.d) ? chs.a(edl.c) : null;
            edl.c = null;
        }
        if (!(efx.i == null || efx.i.i == null)) {
            eew[] eewArr = efx.i.i;
            for (eew eew : eewArr) {
                if (!TextUtils.isEmpty(eew.a)) {
                    eew.b = a(eew.a);
                }
                eew.a = null;
            }
        }
        if (!(efx.f == null || efx.f.a == null)) {
            eer[] eerArr = efx.f.a;
            for (eer eer : eerArr) {
                if (!TextUtils.isEmpty(eer.s)) {
                    try {
                        eer.t = a(eer.s);
                    } catch (RuntimeException e) {
                        cdm.a(5, "HashedNamesTransmitter", "Exception while converting network url.", new Object[0]);
                    }
                }
                eer.s = null;
            }
        }
        b(efx);
    }

    private static long[] a(String str) {
        String[] split = str.replaceFirst("^/+", "").split("/+");
        long[] jArr = new long[split.length];
        for (int i = 0; i < jArr.length; i++) {
            jArr[i] = chs.a(split[i]).longValue();
        }
        return jArr;
    }
}
