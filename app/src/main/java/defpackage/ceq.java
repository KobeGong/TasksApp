package defpackage;

import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: ceq  reason: default package */
/* compiled from: PG */
public final class ceq extends cdm {
    private final /* synthetic */ ceo a;

    ceq(ceo ceo) {
        this.a = ceo;
    }

    @Override // defpackage.cdm
    public final void a(Object obj, Object obj2, Object obj3) {
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

    @Override // defpackage.cdm
    public final void a(List list, List list2) {
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
        int min = Math.min(size, size2);
        if (min > 0) {
            this.a.d.a(0, min);
        }
        if (size2 > size) {
            this.a.a(min, size2 - size);
        } else if (size > size2) {
            this.a.b(min, size - size2);
        }
    }
}
