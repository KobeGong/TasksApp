package defpackage;

/* renamed from: ms reason: default package */
/* compiled from: PG */
final class ms implements android.transition.Transition.TransitionListener {
    private final /* synthetic */ android.view.View a;
    private final /* synthetic */ java.util.ArrayList b;

    ms(android.view.View view, java.util.ArrayList arrayList) {
        this.a = view;
        this.b = arrayList;
    }

    public final void onTransitionStart(android.transition.Transition transition) {
    }

    public final void onTransitionEnd(android.transition.Transition transition) {
        transition.removeListener(this);
        this.a.setVisibility(8);
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            ((android.view.View) this.b.get(i)).setVisibility(0);
        }
    }

    public final void onTransitionCancel(android.transition.Transition transition) {
    }

    public final void onTransitionPause(android.transition.Transition transition) {
    }

    public final void onTransitionResume(android.transition.Transition transition) {
    }
}
