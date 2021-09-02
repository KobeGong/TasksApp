package defpackage;

/* renamed from: apy reason: default package */
/* compiled from: PG */
public final class apy extends android.animation.AnimatorListenerAdapter {
    private final /* synthetic */ com.google.android.apps.tasks.ui.TaskListsActivity a;

    public apy(com.google.android.apps.tasks.ui.TaskListsActivity taskListsActivity) {
        this.a = taskListsActivity;
    }

    public final void onAnimationEnd(android.animation.Animator animator) {
        this.a.fab.setVisibility(8);
    }
}
