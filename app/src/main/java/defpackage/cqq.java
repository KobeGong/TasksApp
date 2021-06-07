package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;

/* renamed from: cqq  reason: default package */
/* compiled from: PG */
public final class cqq implements cqo {
    private static final cpn a = new cpn(cqr.a);
    private static final Rect b = new Rect();
    private final cqm c;
    private final int d;
    private CharSequence e;
    private int f;

    public cqq(cqm cqm) {
        this.c = cqm;
        this.e = cqm.a((cqp) null);
        this.f = cqm.a((String) null);
        this.d = cqm.a();
    }

    @Override // defpackage.cqo
    public final cqo a(cqp cqp) {
        this.e = this.c.a(cqp);
        return this;
    }

    @Override // defpackage.cqo
    public final cqo a(String str) {
        this.f = this.c.a(str);
        return this;
    }

    @Override // defpackage.cqo
    public final Bitmap a(Bitmap bitmap) {
        Canvas canvas = new Canvas(bitmap);
        int height = bitmap.getHeight();
        int width = bitmap.getWidth();
        float min = (float) Math.min(height, width);
        Paint paint = (Paint) a.a();
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

    static final /* synthetic */ Paint a() {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setTypeface(Typeface.create(Typeface.SANS_SERIF, 0));
        return paint;
    }
}
