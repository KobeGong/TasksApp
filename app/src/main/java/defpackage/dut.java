package defpackage;

import java.net.URI;

/* renamed from: dut  reason: default package */
/* compiled from: PG */
public final class dut extends dpi {
    @Override // defpackage.dpg
    public final String a() {
        return "dns";
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.dpi
    public final boolean b() {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.dpi
    public final int c() {
        return 5;
    }

    @Override // defpackage.dpg
    public final /* synthetic */ dpf a(URI uri, dmv dmv) {
        dxq dxq;
        if (!"dns".equals(uri.getScheme())) {
            return null;
        }
        String str = (String) cld.a(uri.getPath(), "targetPath");
        cld.a(str.startsWith("/"), "the path component (%s) of the target (%s) must start with '/'", str, uri);
        String substring = str.substring(1);
        uri.getAuthority();
        dzl dzl = dvc.l;
        if (dvc.a) {
            dxq = dvc.k;
        } else {
            dxq = dvc.j;
        }
        return new dum(substring, dmv, dzl, dxq);
    }
}
