package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.apps.tasks.R;

/* renamed from: cev  reason: default package */
/* compiled from: PG */
public final class cev implements View.OnAttachStateChangeListener {
    private final /* synthetic */ RecyclerView a;
    private final /* synthetic */ ceo b;

    public cev(RecyclerView recyclerView, ceo ceo) {
        this.a = recyclerView;
        this.b = ceo;
    }

    public final void onViewAttachedToWindow(View view) {
        cdm.a(this.a, this.b);
    }

    public final void onViewDetachedFromWindow(View view) {
        ceo ceo = this.b;
        ceo.a.b(ceo.f);
        this.a.setTag(R.id.tag_recycler_view_model_observer_registered, false);
    }
}
