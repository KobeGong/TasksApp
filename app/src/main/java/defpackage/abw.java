package defpackage;

/* renamed from: abw reason: default package */
/* compiled from: PG */
class abw {
    private static final int[] b = {16843067, 16843068};
    public android.graphics.Bitmap a;
    private final android.widget.ProgressBar c;

    abw(android.widget.ProgressBar progressBar) {
        this.c = progressBar;
    }

    /* access modifiers changed from: 0000 */
    public void a(android.util.AttributeSet attributeSet, int i) {
        defpackage.agw a2 = defpackage.agw.a(this.c.getContext(), attributeSet, b, i, 0);
        android.graphics.drawable.Drawable b2 = a2.b(0);
        if (b2 != 0) {
            android.widget.ProgressBar progressBar = this.c;
            if (b2 instanceof android.graphics.drawable.AnimationDrawable) {
                android.graphics.drawable.AnimationDrawable animationDrawable = (android.graphics.drawable.AnimationDrawable) b2;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                android.graphics.drawable.AnimationDrawable animationDrawable2 = new android.graphics.drawable.AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i2 = 0; i2 < numberOfFrames; i2++) {
                    android.graphics.drawable.Drawable a3 = a(animationDrawable.getFrame(i2), true);
                    a3.setLevel(10000);
                    animationDrawable2.addFrame(a3, animationDrawable.getDuration(i2));
                }
                animationDrawable2.setLevel(10000);
                b2 = animationDrawable2;
            }
            progressBar.setIndeterminateDrawable(b2);
        }
        android.graphics.drawable.Drawable b3 = a2.b(1);
        if (b3 != null) {
            this.c.setProgressDrawable(a(b3, false));
        }
        a2.b.recycle();
    }

    private final android.graphics.drawable.Drawable a(android.graphics.drawable.Drawable drawable, boolean z) {
        boolean z2;
        if (drawable instanceof defpackage.C0001pg) {
            android.graphics.drawable.Drawable a2 = ((defpackage.C0001pg) drawable).a();
            if (a2 == null) {
                return drawable;
            }
            ((defpackage.C0001pg) drawable).a(a(a2, z));
            return drawable;
        } else if (drawable instanceof android.graphics.drawable.LayerDrawable) {
            android.graphics.drawable.LayerDrawable layerDrawable = (android.graphics.drawable.LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            android.graphics.drawable.Drawable[] drawableArr = new android.graphics.drawable.Drawable[numberOfLayers];
            for (int i = 0; i < numberOfLayers; i++) {
                int id = layerDrawable.getId(i);
                android.graphics.drawable.Drawable drawable2 = layerDrawable.getDrawable(i);
                if (id == 16908301 || id == 16908303) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                drawableArr[i] = a(drawable2, z2);
            }
            android.graphics.drawable.LayerDrawable layerDrawable2 = new android.graphics.drawable.LayerDrawable(drawableArr);
            for (int i2 = 0; i2 < numberOfLayers; i2++) {
                layerDrawable2.setId(i2, layerDrawable.getId(i2));
            }
            return layerDrawable2;
        } else if (!(drawable instanceof android.graphics.drawable.BitmapDrawable)) {
            return drawable;
        } else {
            android.graphics.drawable.BitmapDrawable bitmapDrawable = (android.graphics.drawable.BitmapDrawable) drawable;
            android.graphics.Bitmap bitmap = bitmapDrawable.getBitmap();
            if (this.a == null) {
                this.a = bitmap;
            }
            android.graphics.drawable.ShapeDrawable shapeDrawable = new android.graphics.drawable.ShapeDrawable(new android.graphics.drawable.shapes.RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
            shapeDrawable.getPaint().setShader(new android.graphics.BitmapShader(bitmap, android.graphics.Shader.TileMode.REPEAT, android.graphics.Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z ? new android.graphics.drawable.ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
    }
}
