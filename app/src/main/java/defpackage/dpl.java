package defpackage;

import java.net.URI;
import java.util.List;

/* renamed from: dpl  reason: default package */
/* compiled from: PG */
final class dpl extends dpg {
    private final List b;

    public dpl(List list) {
        this.b = list;
    }

    @Override // defpackage.dpg
    public final dpf a(URI uri, dmv dmv) {
        b();
        for (dpi dpi : this.b) {
            dpf a = dpi.a(uri, dmv);
            if (a != null) {
                return a;
            }
        }
        return null;
    }

    @Override // defpackage.dpg
    public final String a() {
        b();
        return ((dpi) this.b.get(0)).a();
    }

    private final void b() {
        cld.b(!this.b.isEmpty(), "No NameResolverProviders found via ServiceLoader, including for DNS. This is probably due to a broken build. If using ProGuard, check your configuration");
    }
}
