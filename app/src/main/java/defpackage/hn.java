package defpackage;

/* renamed from: hn reason: default package */
/* compiled from: PG */
public final class hn implements android.view.animation.Interpolator {
    private float[] a;
    private float[] b;

    public hn(android.content.Context context, android.util.AttributeSet attributeSet, org.xmlpull.v1.XmlPullParser xmlPullParser) {
        this(context.getResources(), context.getTheme(), attributeSet, xmlPullParser);
    }

    private hn(android.content.res.Resources resources, android.content.res.Resources.Theme theme, android.util.AttributeSet attributeSet, org.xmlpull.v1.XmlPullParser xmlPullParser) {
        android.content.res.TypedArray a2 = defpackage.jd.a(resources, theme, attributeSet, defpackage.hg.l);
        if (defpackage.jd.a(xmlPullParser, "pathData")) {
            java.lang.String b2 = defpackage.jd.b(a2, xmlPullParser, "pathData", 4);
            android.graphics.Path a3 = defpackage.jd.a(b2);
            if (a3 == null) {
                throw new android.view.InflateException("The path is null, which is created from " + b2);
            }
            a(a3);
        } else if (!defpackage.jd.a(xmlPullParser, "controlX1")) {
            throw new android.view.InflateException("pathInterpolator requires the controlX1 attribute");
        } else if (!defpackage.jd.a(xmlPullParser, "controlY1")) {
            throw new android.view.InflateException("pathInterpolator requires the controlY1 attribute");
        } else {
            float a4 = defpackage.jd.a(a2, xmlPullParser, "controlX1", 0, 0.0f);
            float a5 = defpackage.jd.a(a2, xmlPullParser, "controlY1", 1, 0.0f);
            boolean a6 = defpackage.jd.a(xmlPullParser, "controlX2");
            if (a6 != defpackage.jd.a(xmlPullParser, "controlY2")) {
                throw new android.view.InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
            } else if (!a6) {
                android.graphics.Path path = new android.graphics.Path();
                path.moveTo(0.0f, 0.0f);
                path.quadTo(a4, a5, 1.0f, 1.0f);
                a(path);
            } else {
                float a7 = defpackage.jd.a(a2, xmlPullParser, "controlX2", 2, 0.0f);
                float a8 = defpackage.jd.a(a2, xmlPullParser, "controlY2", 3, 0.0f);
                android.graphics.Path path2 = new android.graphics.Path();
                path2.moveTo(0.0f, 0.0f);
                path2.cubicTo(a4, a5, a7, a8, 1.0f, 1.0f);
                a(path2);
            }
        }
        a2.recycle();
    }

    private final void a(android.graphics.Path path) {
        int i = 0;
        android.graphics.PathMeasure pathMeasure = new android.graphics.PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int min = java.lang.Math.min(3000, ((int) (length / 0.002f)) + 1);
        if (min <= 0) {
            throw new java.lang.IllegalArgumentException("The Path has a invalid length " + length);
        }
        this.a = new float[min];
        this.b = new float[min];
        float[] fArr = new float[2];
        for (int i2 = 0; i2 < min; i2++) {
            pathMeasure.getPosTan((((float) i2) * length) / ((float) (min - 1)), fArr, null);
            this.a[i2] = fArr[0];
            this.b[i2] = fArr[1];
        }
        if (((double) java.lang.Math.abs(this.a[0])) > 1.0E-5d || ((double) java.lang.Math.abs(this.b[0])) > 1.0E-5d || ((double) java.lang.Math.abs(this.a[min - 1] - 1.0f)) > 1.0E-5d || ((double) java.lang.Math.abs(this.b[min - 1] - 1.0f)) > 1.0E-5d) {
            throw new java.lang.IllegalArgumentException("The Path must start at (0,0) and end at (1,1) start: " + this.a[0] + "," + this.b[0] + " end:" + this.a[min - 1] + "," + this.b[min - 1]);
        }
        float f = 0.0f;
        int i3 = 0;
        while (i < min) {
            int i4 = i3 + 1;
            float f2 = this.a[i3];
            if (f2 < f) {
                throw new java.lang.IllegalArgumentException("The Path cannot loop back on itself, x :" + f2);
            }
            this.a[i] = f2;
            i++;
            f = f2;
            i3 = i4;
        }
        if (pathMeasure.nextContour()) {
            throw new java.lang.IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
        }
    }

    public final float getInterpolation(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int length = this.a.length - 1;
        int i = 0;
        while (length - i > 1) {
            int i2 = (i + length) / 2;
            if (f < this.a[i2]) {
                length = i2;
            } else {
                i = i2;
            }
        }
        float f2 = this.a[length] - this.a[i];
        if (f2 == 0.0f) {
            return this.b[i];
        }
        float f3 = (f - this.a[i]) / f2;
        float f4 = this.b[i];
        return (f3 * (this.b[length] - f4)) + f4;
    }
}
