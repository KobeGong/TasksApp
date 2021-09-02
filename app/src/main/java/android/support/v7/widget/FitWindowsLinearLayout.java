package android.support.v7.widget;

/* compiled from: PG */
public class FitWindowsLinearLayout extends android.widget.LinearLayout implements defpackage.adm {
    private defpackage.adn a;

    public FitWindowsLinearLayout(android.content.Context context) {
        super(context);
    }

    public FitWindowsLinearLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void a(defpackage.adn adn) {
        this.a = adn;
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(android.graphics.Rect rect) {
        if (this.a != null) {
            this.a.a(rect);
        }
        return super.fitSystemWindows(rect);
    }
}
