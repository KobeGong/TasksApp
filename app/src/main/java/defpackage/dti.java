package defpackage;

import java.util.ArrayList;

/* access modifiers changed from: package-private */
/* renamed from: dti  reason: default package */
/* compiled from: PG */
public final class dti {
    private ArrayList a = new ArrayList();
    private volatile dnq b = dnq.IDLE;

    dti() {
    }

    /* access modifiers changed from: package-private */
    public final void a(dnq dnq) {
        cld.a(dnq, "newState");
        if (this.b != dnq && this.b != dnq.SHUTDOWN) {
            this.b = dnq;
            if (!this.a.isEmpty()) {
                ArrayList arrayList = this.a;
                this.a = new ArrayList();
                ArrayList arrayList2 = arrayList;
                if (arrayList2.size() > 0) {
                    arrayList2.get(0);
                    throw new NoSuchMethodError();
                }
            }
        }
    }
}
