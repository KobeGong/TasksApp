package defpackage;

/* renamed from: ads reason: default package */
/* compiled from: PG */
final class ads implements java.util.Comparator {
    ads() {
    }

    public final /* synthetic */ int compare(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.adt adt = (defpackage.adt) obj;
        defpackage.adt adt2 = (defpackage.adt) obj2;
        if ((adt.d == null) != (adt2.d == null)) {
            if (adt.d == null) {
                return 1;
            }
            return -1;
        } else if (adt.a == adt2.a) {
            int i = adt2.b - adt.b;
            if (i != 0) {
                return i;
            }
            int i2 = adt.c - adt2.c;
            if (i2 == 0) {
                return 0;
            }
            return i2;
        } else if (adt.a) {
            return -1;
        } else {
            return 1;
        }
    }
}
