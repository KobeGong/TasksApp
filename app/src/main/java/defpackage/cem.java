package defpackage;

import android.graphics.Bitmap;

/* access modifiers changed from: package-private */
/* renamed from: cem  reason: default package */
public final /* synthetic */ class cem implements Runnable {
    private final cel a;
    private final Bitmap b;

    cem(cel cel, Bitmap bitmap) {
        this.a = cel;
        this.b = bitmap;
    }

    public final void run() {
        this.a.b(this.b);
    }
}
