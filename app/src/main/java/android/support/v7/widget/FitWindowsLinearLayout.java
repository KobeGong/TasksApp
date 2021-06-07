package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* compiled from: PG */
public class FitWindowsLinearLayout extends LinearLayout implements adm {
    private adn a;

    public FitWindowsLinearLayout(Context context) {
        super(context);
    }

    public FitWindowsLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // defpackage.adm
    public final void a(adn adn) {
        this.a = adn;
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        if (this.a != null) {
            this.a.a(rect);
        }
        return super.fitSystemWindows(rect);
    }
}
