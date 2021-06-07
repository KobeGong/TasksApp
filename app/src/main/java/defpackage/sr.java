package defpackage;

import android.graphics.Rect;
import android.view.View;

/* renamed from: sr  reason: default package */
/* compiled from: PG */
class sr extends sq {
    sr() {
    }

    @Override // defpackage.sw
    public final void a(View view, Rect rect) {
        view.setClipBounds(rect);
    }

    @Override // defpackage.sw
    public final Rect p(View view) {
        return view.getClipBounds();
    }
}
