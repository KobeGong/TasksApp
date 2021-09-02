package androidx.browser.browseractions;

/* compiled from: PG */
public class BrowserActionsFallbackMenuView extends android.widget.LinearLayout {
    private final int a = getResources().getDimensionPixelOffset(2131689594);
    private final int b = getResources().getDimensionPixelOffset(2131689593);

    public BrowserActionsFallbackMenuView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.min(getResources().getDisplayMetrics().widthPixels - (this.a * 2), this.b), 1073741824), i2);
    }
}
