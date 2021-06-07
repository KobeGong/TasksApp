package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.tasks.ui.TaskListsActivity;

/* renamed from: apz  reason: default package */
/* compiled from: PG */
public final class apz extends AnimatorListenerAdapter {
    private final /* synthetic */ TaskListsActivity a;

    public apz(TaskListsActivity taskListsActivity) {
        this.a = taskListsActivity;
    }

    public final void onAnimationStart(Animator animator) {
        this.a.k.setVisibility(0);
    }
}
