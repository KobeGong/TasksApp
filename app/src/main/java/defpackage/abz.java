package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.google.android.apps.tasks.R;

/* renamed from: abz  reason: default package */
/* compiled from: PG */
public final class abz extends SeekBar {
    private final aca a;

    public abz(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private abz(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, R.attr.seekBarStyle);
        this.a = new aca(this);
        this.a.a(attributeSet, R.attr.seekBarStyle);
    }

    /* access modifiers changed from: protected */
    public final synchronized void onDraw(Canvas canvas) {
        int max;
        int i = 1;
        synchronized (this) {
            super.onDraw(canvas);
            aca aca = this.a;
            if (aca.c != null && (max = aca.b.getMax()) > 1) {
                int intrinsicWidth = aca.c.getIntrinsicWidth();
                int intrinsicHeight = aca.c.getIntrinsicHeight();
                int i2 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                if (intrinsicHeight >= 0) {
                    i = intrinsicHeight / 2;
                }
                aca.c.setBounds(-i2, -i, i2, i);
                float width = ((float) ((aca.b.getWidth() - aca.b.getPaddingLeft()) - aca.b.getPaddingRight())) / ((float) max);
                int save = canvas.save();
                canvas.translate((float) aca.b.getPaddingLeft(), (float) (aca.b.getHeight() / 2));
                for (int i3 = 0; i3 <= max; i3++) {
                    aca.c.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        aca aca = this.a;
        Drawable drawable = aca.c;
        if (drawable != null && drawable.isStateful() && drawable.setState(aca.b.getDrawableState())) {
            aca.b.invalidateDrawable(drawable);
        }
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        aca aca = this.a;
        if (aca.c != null) {
            aca.c.jumpToCurrentState();
        }
    }
}
