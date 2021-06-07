package defpackage;

import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
/* renamed from: mo  reason: default package */
/* compiled from: PG */
public final class mo implements Runnable {
    private final /* synthetic */ mv a;
    private final /* synthetic */ qr b;
    private final /* synthetic */ Object c;
    private final /* synthetic */ mp d;
    private final /* synthetic */ ArrayList e;
    private final /* synthetic */ View f;
    private final /* synthetic */ lc g;
    private final /* synthetic */ lc h;
    private final /* synthetic */ boolean i;
    private final /* synthetic */ ArrayList j;
    private final /* synthetic */ Object k;
    private final /* synthetic */ Rect l;

    mo(mv mvVar, qr qrVar, Object obj, mp mpVar, ArrayList arrayList, View view, lc lcVar, lc lcVar2, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
        this.a = mvVar;
        this.b = qrVar;
        this.c = obj;
        this.d = mpVar;
        this.e = arrayList;
        this.f = view;
        this.g = lcVar;
        this.h = lcVar2;
        this.i = z;
        this.j = arrayList2;
        this.k = obj2;
        this.l = rect;
    }

    public final void run() {
        qr a2 = mk.a(this.a, this.b, this.c, this.d);
        if (a2 != null) {
            this.e.addAll(a2.values());
            this.e.add(this.f);
        }
        mk.a(this.g, this.h, this.i);
        if (this.c != null) {
            this.a.a(this.c, this.j, this.e);
            View a3 = mk.a(a2, this.d, this.k, this.i);
            if (a3 != null) {
                mv.a(a3, this.l);
            }
        }
    }
}
