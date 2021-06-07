package defpackage;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: zl  reason: default package */
/* compiled from: PG */
final class zl extends FrameLayout implements ye {
    public final CollapsibleActionView a;

    zl(View view) {
        super(view.getContext());
        this.a = (CollapsibleActionView) view;
        addView(view);
    }

    @Override // defpackage.ye
    public final void a() {
        this.a.onActionViewExpanded();
    }

    @Override // defpackage.ye
    public final void b() {
        this.a.onActionViewCollapsed();
    }
}
