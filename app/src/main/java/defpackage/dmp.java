package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* renamed from: dmp  reason: default package */
/* compiled from: PG */
public final class dmp implements dmm {
    private final Map a;

    dmp(Map map) {
        this.a = map;
    }

    private final boolean b(Object obj) {
        String valueOf;
        ecz ecz = (ecz) this.a.get(obj.getClass());
        if (ecz == null) {
            return false;
        }
        dmn dmn = (dmn) ecz.a();
        try {
            dmm a2 = dmn.a();
            Class<?> cls = dmn.getClass();
            if (a2 != null) {
                a2.a(obj);
                return true;
            } else if (!"%s.create(I) should not return null.".contains("%s")) {
                throw new IllegalArgumentException("errorMessageTemplate has no format specifiers");
            } else if ("%s.create(I) should not return null.".indexOf("%s") != "%s.create(I) should not return null.".lastIndexOf("%s")) {
                throw new IllegalArgumentException("errorMessageTemplate has more than one format specifier");
            } else {
                if (cls instanceof Class) {
                    valueOf = cls.getCanonicalName();
                } else {
                    valueOf = String.valueOf(cls);
                }
                throw new NullPointerException("%s.create(I) should not return null.".replace("%s", valueOf));
            }
        } catch (ClassCastException e) {
            throw new br(String.format("%s does not implement AndroidInjector.Factory<%s>", dmn.getClass().getCanonicalName(), obj.getClass().getCanonicalName()), e);
        }
    }

    @Override // defpackage.dmm
    public final void a(Object obj) {
        String format;
        if (!b(obj)) {
            ArrayList arrayList = new ArrayList();
            for (Class cls : this.a.keySet()) {
                if (cls.isInstance(obj)) {
                    arrayList.add(cls.getCanonicalName());
                }
            }
            Collections.sort(arrayList);
            if (arrayList.isEmpty()) {
                format = String.format("No injector factory bound for Class<%s>", obj.getClass().getCanonicalName());
            } else {
                format = String.format("No injector factory bound for Class<%1$s>. Injector factories were bound for supertypes of %1$s: %2$s. Did you mean to bind an injector factory for the subtype?", obj.getClass().getCanonicalName(), arrayList);
            }
            throw new IllegalArgumentException(format);
        }
    }
}
