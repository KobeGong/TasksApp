package defpackage;

/* renamed from: att reason: default package */
/* compiled from: PG */
public final class att extends defpackage.afc {
    public final java.util.List a;
    public final android.graphics.Rect b = new android.graphics.Rect();
    private final int c;
    private final int d;
    private final android.util.LruCache e = new android.util.LruCache(2);
    private final android.graphics.Paint f = new android.graphics.Paint();
    private final long g;

    att(int i, int i2, long j) {
        this.c = i;
        this.d = i2;
        this.a = new java.util.ArrayList();
        this.g = 200 + j;
    }

    public final void a(android.graphics.Canvas canvas, android.support.v7.widget.RecyclerView recyclerView) {
        this.f.setColor(this.c);
        int width = recyclerView.getWidth();
        long a2 = defpackage.auz.a();
        java.util.Iterator it = this.a.iterator();
        while (it.hasNext()) {
            defpackage.atu atu = (defpackage.atu) it.next();
            long j = a2 - atu.b;
            if (j >= this.g) {
                it.remove();
            } else {
                this.f.setAlpha((int) (255.0f * (1.0f - (((float) j) / ((float) this.g)))));
                for (android.util.Pair pair : atu.a) {
                    this.b.top = ((java.lang.Integer) pair.first).intValue();
                    this.b.bottom = ((java.lang.Integer) pair.second).intValue();
                    this.b.left = 0;
                    this.b.right = width;
                    canvas.drawRect(this.b, this.f);
                }
            }
        }
        int width2 = recyclerView.getWidth();
        this.f.setAlpha(255);
        int childCount = recyclerView.getChildCount();
        defpackage.ali ali = (defpackage.ali) defpackage.crk.a.c();
        android.content.Context context = recyclerView.getContext();
        boolean z = ViewCompat.a.j(recyclerView) == 0;
        android.graphics.Bitmap bitmap = null;
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = recyclerView.getChildAt(i);
            if (childAt.getTranslationX() != 0.0f) {
                android.support.v7.widget.RecyclerView.a(childAt, this.b);
                int translationX = (int) childAt.getTranslationX();
                if (translationX < 0) {
                    translationX = -translationX;
                    this.b.left = width2 - translationX;
                }
                this.b.right = this.b.left + translationX;
                boolean z2 = z ? childAt.getTranslationX() < 0.0f : childAt.getTranslationX() >= 0.0f;
                this.f.setColor(z2 ? this.d : this.c);
                canvas.drawRect(this.b, this.f);
                if (z2) {
                    if (ali != null) {
                        canvas.save();
                        canvas.clipRect(this.b);
                        android.graphics.Bitmap a3 = a(context, ali.a());
                        canvas.drawBitmap(a3, a(a3, childAt, !z), (float) (this.b.top + (((this.b.bottom - this.b.top) - a3.getHeight()) / 2)), this.f);
                        canvas.restore();
                    }
                } else if (bitmap == null && translationX < width2 && ali != null) {
                    canvas.save();
                    canvas.clipRect(this.b);
                    bitmap = a(context, 2130837693);
                    canvas.drawBitmap(bitmap, a(bitmap, childAt, z), (float) (this.b.top + (((this.b.bottom - this.b.top) - bitmap.getHeight()) / 2)), this.f);
                    canvas.restore();
                }
            }
        }
    }

    private final android.graphics.Bitmap a(android.content.Context context, int i) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) this.e.get(java.lang.String.valueOf(i));
        if (bitmap != null) {
            return bitmap;
        }
        android.graphics.Bitmap decodeResource = android.graphics.BitmapFactory.decodeResource(context.getResources(), i);
        this.e.put(java.lang.String.valueOf(i), decodeResource);
        return decodeResource;
    }

    private static float a(android.graphics.Bitmap bitmap, android.view.View view, boolean z) {
        float dimension = view.getContext().getResources().getDimension(2131689870);
        if (z) {
            return dimension + ((float) view.getLeft());
        }
        return ((float) (view.getRight() - bitmap.getWidth())) - dimension;
    }
}
