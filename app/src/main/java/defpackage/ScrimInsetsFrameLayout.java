package defpackage;

import com.google.android.apps.tasks.R;

/* renamed from: fn reason: default package */
/* compiled from: PG */
public class ScrimInsetsFrameLayout extends android.widget.FrameLayout {
    public android.graphics.drawable.Drawable insetForeground;
    public android.graphics.Rect insets;
    private final android.graphics.Rect tempRect;

    public ScrimInsetsFrameLayout(android.content.Context context) {
        this(context, null);
    }

    public ScrimInsetsFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScrimInsetsFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.tempRect = new android.graphics.Rect();
        android.content.res.TypedArray a2 = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, defpackage.fm.e, i, R.style.Widget_Design_ScrimInsetsFrameLayout);
        this.insetForeground = a2.getDrawable(defpackage.fm.f);
        a2.recycle();
        setWillNotDraw(true);
        ViewCompat.setOnApplyWindowInsetsListener(this, new fo(this));
    }

    public void draw(android.graphics.Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.insets != null && this.insetForeground != null) {
            int save = canvas.save();
            canvas.translate((float) getScrollX(), (float) getScrollY());
            this.tempRect.set(0, 0, width, this.insets.top);
            this.insetForeground.setBounds(this.tempRect);
            this.insetForeground.draw(canvas);
            this.tempRect.set(0, height - this.insets.bottom, width, height);
            this.insetForeground.setBounds(this.tempRect);
            this.insetForeground.draw(canvas);
            this.tempRect.set(0, this.insets.top, this.insets.left, height - this.insets.bottom);
            this.insetForeground.setBounds(this.tempRect);
            this.insetForeground.draw(canvas);
            this.tempRect.set(width - this.insets.right, this.insets.top, width, height - this.insets.bottom);
            this.insetForeground.setBounds(this.tempRect);
            this.insetForeground.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.insetForeground != null) {
            this.insetForeground.setCallback(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.insetForeground != null) {
            this.insetForeground.setCallback(null);
        }
    }

    public void a(WindowInsetsCompat tkVar) {
    }
}
