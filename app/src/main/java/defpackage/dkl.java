package defpackage;

import java.util.Iterator;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: dkl  reason: default package */
/* compiled from: PG */
public final class dkl extends dkk {
    dkl(int i) {
        super(i, (byte) 0);
    }

    @Override // defpackage.dkk
    public final void a() {
        if (!this.c) {
            if (0 < b()) {
                b(0).getKey();
                throw new NoSuchMethodError();
            }
            Iterator it = c().iterator();
            if (it.hasNext()) {
                ((Map.Entry) it.next()).getKey();
                throw new NoSuchMethodError();
            }
        }
        super.a();
    }
}
