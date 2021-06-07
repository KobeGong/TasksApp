package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.shapes.OvalShape;

/* access modifiers changed from: package-private */
/* renamed from: ub  reason: default package */
/* compiled from: PG */
public final class ub extends OvalShape {
    private RadialGradient a;
    private Paint b = new Paint();
    private final /* synthetic */ ua c;

    ub(ua uaVar, int i) {
        this.c = uaVar;
        uaVar.b = i;
        a((int) rect().width());
    }

    /* access modifiers changed from: protected */
    public final void onResize(float f, float f2) {
        super.onResize(f, f2);
        a((int) f);
    }

    public final void draw(Canvas canvas, Paint paint) {
        int width = this.c.getWidth();
        int height = this.c.getHeight();
        canvas.drawCircle((float) (width / 2), (float) (height / 2), (float) (width / 2), this.b);
        canvas.drawCircle((float) (width / 2), (float) (height / 2), (float) ((width / 2) - this.c.b), paint);
    }

    private final void a(int i) {
        this.a = new RadialGradient((float) (i / 2), (float) (i / 2), (float) this.c.b, new int[]{1023410176, 0}, (float[]) null, Shader.TileMode.CLAMP);
        this.b.setShader(this.a);
    }
}
