package defpackage;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;

/* access modifiers changed from: package-private */
/* renamed from: cen  reason: default package */
/* compiled from: PG */
public final class cen implements View.OnAttachStateChangeListener {
    private final /* synthetic */ ImageView a;
    private final /* synthetic */ Bitmap b;
    private final /* synthetic */ cel c;

    cen(cel cel, ImageView imageView, Bitmap bitmap) {
        this.c = cel;
        this.a = imageView;
        this.b = bitmap;
    }

    public final void onViewAttachedToWindow(View view) {
        this.a.removeOnAttachStateChangeListener(this);
        this.c.b(this.b);
    }

    public final void onViewDetachedFromWindow(View view) {
    }
}
