package defpackage;

/* renamed from: dmp reason: default package */
/* compiled from: PG */
public final class dmp implements defpackage.dmm {
    private final java.util.Map a;

    dmp(java.util.Map map) {
        this.a = map;
    }

    private final boolean b(java.lang.Object obj) {
        java.lang.String valueOf;
        defpackage.ecz ecz = (defpackage.ecz) this.a.get(obj.getClass());
        if (ecz == null) {
            return false;
        }
        defpackage.dmn dmn = (defpackage.dmn) ecz.a();
        try {
            defpackage.dmm a2 = dmn.a();
            java.lang.String str = "%s.create(I) should not return null.";
            java.lang.Class cls = dmn.getClass();
            if (a2 != null) {
                a2.a(obj);
                return true;
            } else if (!str.contains("%s")) {
                throw new java.lang.IllegalArgumentException("errorMessageTemplate has no format specifiers");
            } else if (str.indexOf("%s") != str.lastIndexOf("%s")) {
                throw new java.lang.IllegalArgumentException("errorMessageTemplate has more than one format specifier");
            } else {
                if (cls instanceof java.lang.Class) {
                    valueOf = cls.getCanonicalName();
                } else {
                    valueOf = java.lang.String.valueOf(cls);
                }
                throw new java.lang.NullPointerException(str.replace("%s", valueOf));
            }
        } catch (java.lang.ClassCastException e) {
            throw new defpackage.br(java.lang.String.format("%s does not implement AndroidInjector.Factory<%s>", new java.lang.Object[]{dmn.getClass().getCanonicalName(), obj.getClass().getCanonicalName()}), e);
        }
    }

    public final void a(java.lang.Object obj) {
        java.lang.String format;
        if (!b(obj)) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Class cls : this.a.keySet()) {
                if (cls.isInstance(obj)) {
                    arrayList.add(cls.getCanonicalName());
                }
            }
            java.util.Collections.sort(arrayList);
            if (arrayList.isEmpty()) {
                format = java.lang.String.format("No injector factory bound for Class<%s>", new java.lang.Object[]{obj.getClass().getCanonicalName()});
            } else {
                format = java.lang.String.format("No injector factory bound for Class<%1$s>. Injector factories were bound for supertypes of %1$s: %2$s. Did you mean to bind an injector factory for the subtype?", new java.lang.Object[]{obj.getClass().getCanonicalName(), arrayList});
            }
            throw new java.lang.IllegalArgumentException(format);
        }
    }
}
