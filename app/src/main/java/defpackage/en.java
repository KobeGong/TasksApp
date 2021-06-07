package defpackage;

import android.annotation.TargetApi;
import android.graphics.Outline;
import android.support.design.chip.Chip;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: en  reason: default package */
/* compiled from: PG */
public final class en extends ViewOutlineProvider {
    private final /* synthetic */ Chip a;

    public en(Chip chip) {
        this.a = chip;
    }

    @TargetApi(21)
    public final void getOutline(View view, Outline outline) {
        if (this.a.b != null) {
            this.a.b.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}
