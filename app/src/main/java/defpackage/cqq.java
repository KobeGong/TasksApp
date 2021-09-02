package defpackage;

/* renamed from: cqq reason: default package */
/* compiled from: PG */
public final class cqq implements defpackage.cqo {
    private static final defpackage.cpn a = new defpackage.cpn(defpackage.cqr.a);
    private static final android.graphics.Rect b = new android.graphics.Rect();
    private final defpackage.cqm c;
    private final int d;
    private java.lang.CharSequence e;
    private int f;

    public cqq(defpackage.cqm cqm) {
        this.c = cqm;
        this.e = cqm.a(null);
        this.f = cqm.a(null);
        this.d = cqm.a();
    }

    public final defpackage.cqo a(defpackage.cqp cqp) {
        this.e = this.c.a(cqp);
        return this;
    }

    public final defpackage.cqo a(java.lang.String str) {
        this.f = this.c.a(str);
        return this;
    }

    public final android.graphics.Bitmap a(android.graphics.Bitmap bitmap) {
        android.graphics.Canvas canvas = new android.graphics.Canvas(bitmap);
        int height = bitmap.getHeight();
        int width = bitmap.getWidth();
        float min = (float) java.lang.Math.min(height, width);
        android.graphics.Paint paint = (android.graphics.Paint) a.a();
        synchronized (a) {
            paint.setColor(this.f);
            canvas.drawCircle((float) (width / 2), (float) (height / 2), min / 2.0f, paint);
            if (this.e != null) {
                paint.setColor(this.d);
                paint.setTextSize(min * 0.47f);
                paint.getTextBounds(this.e.toString(), 0, this.e.length(), b);
                canvas.drawText(this.e, 0, this.e.length(), (float) (width / 2), ((float) (height / 2)) - b.exactCenterY(), paint);
            }
        }
        return bitmap;
    }

    static final /* synthetic */ android.graphics.Paint a() {
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setAntiAlias(true);
        paint.setTextAlign(android.graphics.Paint.Align.CENTER);
        paint.setTypeface(android.graphics.Typeface.create(android.graphics.Typeface.SANS_SERIF, 0));
        return paint;
    }
}
