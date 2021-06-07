package defpackage;

import android.view.View;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
/* renamed from: mm  reason: default package */
/* compiled from: PG */
public final class mm implements Runnable {
    private final /* synthetic */ Object a;
    private final /* synthetic */ mv b;
    private final /* synthetic */ View c;
    private final /* synthetic */ lc d;
    private final /* synthetic */ ArrayList e;
    private final /* synthetic */ ArrayList f;
    private final /* synthetic */ ArrayList g;
    private final /* synthetic */ Object h;

    mm(Object obj, mv mvVar, View view, lc lcVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
        this.a = obj;
        this.b = mvVar;
        this.c = view;
        this.d = lcVar;
        this.e = arrayList;
        this.f = arrayList2;
        this.g = arrayList3;
        this.h = obj2;
    }

    public final void run() {
        if (this.a != null) {
            this.b.c(this.a, this.c);
            this.f.addAll(mk.a(this.b, this.a, this.d, this.e, this.c));
        }
        if (this.g != null) {
            if (this.h != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.c);
                this.b.b(this.h, this.g, arrayList);
            }
            this.g.clear();
            this.g.add(this.c);
        }
    }
}
