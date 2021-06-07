package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* renamed from: jt  reason: default package */
/* compiled from: PG */
final class jt implements ju {
    private final ViewGroupOverlay a;

    jt(ViewGroup viewGroup) {
        this.a = viewGroup.getOverlay();
    }

    @Override // defpackage.ju
    public final void a(View view) {
        this.a.add(view);
    }

    @Override // defpackage.ju
    public final void b(View view) {
        this.a.remove(view);
    }
}
