package defpackage;

/* renamed from: dpl reason: default package */
/* compiled from: PG */
final class dpl extends defpackage.dpg {
    private final java.util.List b;

    public dpl(java.util.List list) {
        this.b = list;
    }

    public final defpackage.dpf a(java.net.URI uri, defpackage.dmv dmv) {
        b();
        for (defpackage.dpi a : this.b) {
            defpackage.dpf a2 = a.a(uri, dmv);
            if (a2 != null) {
                return a2;
            }
        }
        return null;
    }

    public final java.lang.String a() {
        b();
        return ((defpackage.dpi) this.b.get(0)).a();
    }

    private final void b() {
        defpackage.cld.b(!this.b.isEmpty(), (java.lang.Object) "No NameResolverProviders found via ServiceLoader, including for DNS. This is probably due to a broken build. If using ProGuard, check your configuration");
    }
}
