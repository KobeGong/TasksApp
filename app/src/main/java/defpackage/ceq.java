package defpackage;

/* renamed from: ceq reason: default package */
/* compiled from: PG */
final class ceq extends defpackage.cdm {
    private final /* synthetic */ defpackage.ceo a;

    ceq(defpackage.ceo ceo) {
        this.a = ceo;
    }

    public final void a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int i = this.a.c;
        this.a.b();
        if (this.a.c != i) {
            if (i >= 0) {
                this.a.d(i);
            }
            if (this.a.c >= 0) {
                this.a.e(this.a.c);
            }
        }
    }

    public final void a(java.util.List list, java.util.List list2) {
        int size = list.size();
        int size2 = list2.size();
        int i = this.a.c;
        this.a.b();
        if (i >= 0 && i < size) {
            size--;
        }
        if (this.a.c >= 0 && this.a.c < size2) {
            size2--;
        }
        int min = java.lang.Math.min(size, size2);
        if (min > 0) {
            this.a.mObservable.a(0, min);
        }
        if (size2 > size) {
            this.a.a(min, size2 - size);
        } else if (size > size2) {
            this.a.b(min, size - size2);
        }
    }
}
