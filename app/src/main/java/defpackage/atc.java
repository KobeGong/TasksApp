package defpackage;

import android.view.View;

/* renamed from: atc reason: default package */
final /* synthetic */ class atc implements android.view.View.OnFocusChangeListener {
    private final SubTaskView taskView;

    atc(SubTaskView atb) {
        this.taskView = atb;
    }

    public final void onFocusChange(android.view.View view, boolean z) {
        this.taskView.c.setVisibility(z ? View.VISIBLE : View.GONE);
        if (this.taskView.e != null) {
            this.taskView.e.onFocusChange(view, z);
        }
    }
}
