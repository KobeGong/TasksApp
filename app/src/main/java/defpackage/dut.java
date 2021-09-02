package defpackage;

/* renamed from: dut reason: default package */
/* compiled from: PG */
public final class dut extends defpackage.dpi {
    public final java.lang.String a() {
        return "dns";
    }

    /* access modifiers changed from: protected */
    public final boolean b() {
        return true;
    }

    /* access modifiers changed from: protected */
    public final int c() {
        return 5;
    }

    public final /* synthetic */ defpackage.dpf a(java.net.URI uri, defpackage.dmv dmv) {
        defpackage.dxq dxq;
        if (!"dns".equals(uri.getScheme())) {
            return null;
        }
        java.lang.String str = (java.lang.String) defpackage.cld.a((java.lang.Object) uri.getPath(), (java.lang.Object) "targetPath");
        defpackage.cld.a(str.startsWith("/"), "the path component (%s) of the target (%s) must start with '/'", (java.lang.Object) str, (java.lang.Object) uri);
        java.lang.String substring = str.substring(1);
        uri.getAuthority();
        defpackage.dzl dzl = defpackage.dvc.l;
        if (defpackage.dvc.a) {
            dxq = defpackage.dvc.k;
        } else {
            dxq = defpackage.dvc.j;
        }
        return new defpackage.dum(substring, dmv, dzl, dxq);
    }
}
