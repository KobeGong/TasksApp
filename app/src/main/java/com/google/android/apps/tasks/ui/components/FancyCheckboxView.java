package com.google.android.apps.tasks.ui.components;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.apps.tasks.R;

/* compiled from: PG */
public class FancyCheckboxView extends View {
    private static final Path b = new Path();
    private static final Path c;
    public float a = 0.0f;
    private final Path d = new Path();
    private final Path e = new Path();
    private final Path f = new Path();
    private final PathMeasure g = new PathMeasure(this.f, false);
    private final PathMeasure h = new PathMeasure(this.d, false);
    private final Path i = new Path();
    private final Paint j = a(getResources());
    private int k = -1;
    private int l = -1;

    private static Paint a(Resources resources) {
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(resources.getDimension(R.dimen.fancy_checkbox_stroke_width));
        return paint;
    }

    public FancyCheckboxView(Context context) {
        super(context);
        b();
    }

    public FancyCheckboxView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }

    public FancyCheckboxView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        b();
    }

    public FancyCheckboxView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        b();
    }

    public final void a(float f2) {
        cld.a(f2 >= 0.0f && f2 <= 1.0f);
        this.a = f2;
        a();
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        int paddingStart = getPaddingStart();
        int paddingEnd = getPaddingEnd();
        int paddingTop = getPaddingTop();
        float min = ((float) Math.min((i2 - paddingStart) - paddingEnd, (i3 - paddingTop) - getPaddingBottom())) / 27.0f;
        Matrix matrix = new Matrix();
        matrix.setScale(min, min);
        matrix.postTranslate((float) paddingStart, (float) paddingTop);
        this.f.reset();
        this.e.reset();
        this.d.reset();
        c.transform(matrix, this.f);
        b.transform(matrix, this.d);
        this.h.setPath(this.d, false);
        this.g.setPath(this.f, false);
        float length = this.g.getLength();
        this.g.getSegment(0.1f * length, length, this.e, true);
        a();
        super.onSizeChanged(i2, i3, i4, i5);
    }

    private final void a() {
        float f2 = 0.0f;
        this.i.reset();
        if (this.a == 1.0f) {
            this.i.addPath(this.e);
            this.j.setColor(this.k);
        } else if (this.a == 0.0f) {
            this.i.addPath(this.d);
            this.j.setColor(this.l);
        } else {
            float length = this.h.getLength();
            float min = Math.min(length, this.a * length * 1.1f);
            if (min != length) {
                this.h.getSegment(min, length, this.i, true);
            }
            float length2 = this.g.getLength();
            float f3 = length2 - (0.1f * length2);
            float f4 = length2 * this.a;
            if (f4 > f3) {
                f2 = f4 - f3;
            }
            this.g.getSegment(f2, f4, this.i, true);
            this.j.setColor(((Integer) new ArgbEvaluator().evaluate(this.a, Integer.valueOf(this.l), Integer.valueOf(this.k))).intValue());
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.i, this.j);
    }

    private final void b() {
        this.k = getResources().getColor(R.color.fancy_check_checked);
        this.l = getResources().getColor(R.color.fancy_check_unchecked);
    }

    static {
        b.addArc(new RectF(3.0f, 3.0f, 23.0f, 23.0f), 198.0f, -359.99f);
        float cos = (float) ((Math.cos(3.455751895904541d) * 10.0d) + 13.0d);
        float sin = (float) ((Math.sin(3.455751895904541d) * 10.0d) + 13.0d);
        float f2 = 13.0f - cos;
        Path path = new Path();
        c = path;
        path.moveTo(cos, sin);
        c.lineTo(13.0f, sin + f2);
        c.lineTo(27.0f, (sin + f2) - 14.0f);
    }
}
