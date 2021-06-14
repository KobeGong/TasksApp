package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.tasks.ui.TaskListsActivity;

/* renamed from: apy  reason: default package */
/* compiled from: PG */
public final class apy extends AnimatorListenerAdapter {
    private final /* synthetic */ TaskListsActivity a;

    public apy(TaskListsActivity taskListsActivity) {
        this.a = taskListsActivity;
    }

    public final void onAnimationEnd(Animator animator) {
        this.a.fab.setVisibility(8);
    }
}
