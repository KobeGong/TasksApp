package defpackage;

import android.transition.Transition;
import android.view.View;
import java.util.ArrayList;

/* renamed from: ms  reason: default package */
/* compiled from: PG */
final class ms implements Transition.TransitionListener {
    private final /* synthetic */ View a;
    private final /* synthetic */ ArrayList b;

    ms(View view, ArrayList arrayList) {
        this.a = view;
        this.b = arrayList;
    }

    public final void onTransitionStart(Transition transition) {
    }

    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
        this.a.setVisibility(8);
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            ((View) this.b.get(i)).setVisibility(0);
        }
    }

    public final void onTransitionCancel(Transition transition) {
    }

    public final void onTransitionPause(Transition transition) {
    }

    public final void onTransitionResume(Transition transition) {
    }
}
