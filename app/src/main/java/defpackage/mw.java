package defpackage;

import android.view.View;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
/* renamed from: mw  reason: default package */
/* compiled from: PG */
public final class mw implements Runnable {
    private final /* synthetic */ int a;
    private final /* synthetic */ ArrayList b;
    private final /* synthetic */ ArrayList c;
    private final /* synthetic */ ArrayList d;
    private final /* synthetic */ ArrayList e;

    mw(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.a = i;
        this.b = arrayList;
        this.c = arrayList2;
        this.d = arrayList3;
        this.e = arrayList4;
    }

    public final void run() {
        for (int i = 0; i < this.a; i++) {
            sn.a((View) this.b.get(i), (String) this.c.get(i));
            sn.a((View) this.d.get(i), (String) this.e.get(i));
        }
    }
}
