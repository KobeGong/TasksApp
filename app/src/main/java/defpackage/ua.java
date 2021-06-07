package defpackage;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.view.animation.Animation;
import android.widget.ImageView;

/* renamed from: ua  reason: default package */
/* compiled from: PG */
public final class ua extends ImageView {
    public Animation.AnimationListener a;
    public int b;

    public ua(Context context) {
        super(context);
        ShapeDrawable shapeDrawable;
        float f = getContext().getResources().getDisplayMetrics().density;
        int i = (int) (1.75f * f);
        int i2 = (int) (0.0f * f);
        this.b = (int) (3.5f * f);
        if (a()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            sn.a(this, f * 4.0f);
        } else {
            shapeDrawable = new ShapeDrawable(new ub(this, this.b));
            setLayerType(1, shapeDrawable.getPaint());
            shapeDrawable.getPaint().setShadowLayer((float) this.b, (float) i2, (float) i, 503316480);
            int i3 = this.b;
            setPadding(i3, i3, i3, i3);
        }
        shapeDrawable.getPaint().setColor(-328966);
        sn.a(this, shapeDrawable);
    }

    private static boolean a() {
        return Build.VERSION.SDK_INT >= 21;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!a()) {
            setMeasuredDimension(getMeasuredWidth() + (this.b << 1), getMeasuredHeight() + (this.b << 1));
        }
    }

    public final void onAnimationStart() {
        super.onAnimationStart();
        if (this.a != null) {
            this.a.onAnimationStart(getAnimation());
        }
    }

    public final void onAnimationEnd() {
        super.onAnimationEnd();
        if (this.a != null) {
            this.a.onAnimationEnd(getAnimation());
        }
    }

    public final void setBackgroundColor(int i) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i);
        }
    }
}
