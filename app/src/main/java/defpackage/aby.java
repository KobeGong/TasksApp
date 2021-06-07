package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import com.google.android.apps.tasks.R;

/* renamed from: aby  reason: default package */
/* compiled from: PG */
public final class aby extends RatingBar {
    private final abw a;

    public aby(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private aby(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, R.attr.ratingBarStyle);
        this.a = new abw(this);
        this.a.a(attributeSet, R.attr.ratingBarStyle);
    }

    /* access modifiers changed from: protected */
    public final synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmap = this.a.a;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}