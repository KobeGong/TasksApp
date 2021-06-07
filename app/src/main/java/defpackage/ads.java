package defpackage;

import java.util.Comparator;

/* renamed from: ads  reason: default package */
/* compiled from: PG */
final class ads implements Comparator {
    ads() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        adt adt = (adt) obj;
        adt adt2 = (adt) obj2;
        if ((adt.d == null) != (adt2.d == null)) {
            return adt.d == null ? 1 : -1;
        }
        if (adt.a != adt2.a) {
            return adt.a ? -1 : 1;
        }
        int i = adt2.b - adt.b;
        if (i != 0) {
            return i;
        }
        int i2 = adt.c - adt2.c;
        if (i2 == 0) {
            return 0;
        }
        return i2;
    }
}
