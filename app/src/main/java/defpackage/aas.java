package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.google.android.apps.tasks.R;

/* access modifiers changed from: package-private */
/* renamed from: aas  reason: default package */
/* compiled from: PG */
public final class aas extends abt implements aay {
    public final /* synthetic */ aap a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aas(aap aap, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.a = aap;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        aaz.a(this, getContentDescription());
        setOnTouchListener(new aat(this, this));
    }

    public final boolean performClick() {
        if (!super.performClick()) {
            playSoundEffect(0);
            this.a.e();
        }
        return true;
    }

    @Override // defpackage.aay
    public final boolean e_() {
        return false;
    }

    @Override // defpackage.aay
    public final boolean e() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (!(drawable == null || background == null)) {
            int width = getWidth();
            int height = getHeight();
            int max = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            jd.a(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
        }
        return frame;
    }
}
