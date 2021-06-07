package defpackage;

import android.graphics.Bitmap;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* access modifiers changed from: package-private */
/* renamed from: cel  reason: default package */
/* compiled from: PG */
public final class cel {
    public final Object a;
    public final int b;
    public boolean c;
    private final WeakReference d;
    private final long e;
    private final /* synthetic */ cei f;

    cel(cei cei, ImageView imageView, Object obj, int i, long j) {
        this.f = cei;
        this.d = new WeakReference((ImageView) cky.a((Object) imageView));
        this.a = obj;
        this.b = i;
        this.e = j;
    }

    /* access modifiers changed from: package-private */
    public final void a(Bitmap bitmap) {
        ImageView imageView = (ImageView) this.d.get();
        cen cen = new cen(this, imageView, bitmap);
        imageView.addOnAttachStateChangeListener(cen);
        if (sn.a.s(imageView)) {
            imageView.removeOnAttachStateChangeListener(cen);
            imageView.post(new cem(this, bitmap));
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(Bitmap bitmap) {
        ImageView imageView;
        cei.a("setImageAndResetRequest");
        if (!a() && (imageView = (ImageView) this.d.get()) != null) {
            imageView.setImageBitmap(bitmap);
            cei.a(imageView, null);
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        return this.c || this.e <= this.f.d;
    }
}
