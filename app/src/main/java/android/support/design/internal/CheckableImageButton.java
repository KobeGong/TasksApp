package android.support.design.internal;

/* compiled from: PG */
public class CheckableImageButton extends defpackage.abr implements android.widget.Checkable {
    private static final int[] a = {16842912};
    private boolean b;

    public CheckableImageButton(android.content.Context context) {
        this(context, null);
    }

    public CheckableImageButton(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 2130772193);
    }

    public CheckableImageButton(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        defpackage.sn.a((android.view.View) this, (defpackage.rn) new defpackage.ev(this));
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
