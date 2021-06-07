package defpackage;

import android.view.View;
import java.util.ArrayList;

/* renamed from: iu  reason: default package */
/* compiled from: PG */
final class iu implements ji {
    private final /* synthetic */ View a;
    private final /* synthetic */ ArrayList b;

    iu(View view, ArrayList arrayList) {
        this.a = view;
        this.b = arrayList;
    }

    @Override // defpackage.ji
    public final void c() {
    }

    @Override // defpackage.ji
    public final void a(je jeVar) {
        jeVar.b(this);
        this.a.setVisibility(8);
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            ((View) this.b.get(i)).setVisibility(0);
        }
    }

    @Override // defpackage.ji
    public final void a() {
    }

    @Override // defpackage.ji
    public final void b() {
    }
}
