package defpackage;

import android.graphics.Outline;
import android.support.v7.widget.ActionBarContainer;

/* renamed from: aai  reason: default package */
/* compiled from: PG */
public final class aai extends aah {
    public aai(ActionBarContainer actionBarContainer) {
        super(actionBarContainer);
    }

    public final void getOutline(Outline outline) {
        if (this.a.e) {
            if (this.a.d != null) {
                this.a.d.getOutline(outline);
            }
        } else if (this.a.b != null) {
            this.a.b.getOutline(outline);
        }
    }
}
