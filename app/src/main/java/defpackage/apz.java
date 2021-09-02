package defpackage;

/* renamed from: apz reason: default package */
/* compiled from: PG */
public final class apz extends android.animation.AnimatorListenerAdapter {
    private final /* synthetic */ com.google.android.apps.tasks.ui.TaskListsActivity a;

    public apz(com.google.android.apps.tasks.ui.TaskListsActivity taskListsActivity) {
        this.a = taskListsActivity;
    }

    public final void onAnimationStart(android.animation.Animator animator) {
        this.a.fab.setVisibility(0);
    }
}
