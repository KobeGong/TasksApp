package android.support.design.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Checkable;
import com.google.android.apps.tasks.R;

/* compiled from: PG */
public class CheckableImageButton extends abr implements Checkable {
    private static final int[] a = {16842912};
    private boolean b;

    public CheckableImageButton(Context context) {
        this(context, null);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.imageButtonStyle);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        sn.a(this, new ev(this));
    }

    public void setChecked(boolean z) {
        if (this.b != z) {
            this.b = z;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public boolean isChecked() {
        return this.b;
    }

    public void toggle() {
        setChecked(!this.b);
    }

    public int[] onCreateDrawableState(int i) {
        if (this.b) {
            return mergeDrawableStates(super.onCreateDrawableState(a.length + i), a);
        }
        return super.onCreateDrawableState(i);
    }
}
