package defpackage;

import android.graphics.Rect;

/* renamed from: asm  reason: default package */
final /* synthetic */ class asm implements Runnable {
    private final asi a;

    asm(asi asi) {
        this.a = asi;
    }

    public final void run() {
        asi asi = this.a;
        asi.a.requestRectangleOnScreen(new Rect(0, 0, asi.a.getWidth(), asi.a.getHeight()));
    }
}
