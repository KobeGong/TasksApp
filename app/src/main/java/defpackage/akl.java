package defpackage;

import com.google.android.apps.tasks.R;

/* renamed from: akl  reason: default package */
/* compiled from: PG */
public enum akl {
    DUE(R.string.notification_channel_id_due, R.string.notification_group_id_due, R.string.notification_channel_title_due_tasks, R.plurals.notification_title_due_tasks, R.color.notification_color_due_task),
    OVERDUE(R.string.notification_channel_id_overdue, R.string.notification_group_id_overdue, R.string.notification_channel_title_overdue_tasks, R.plurals.notification_title_overdue_tasks, R.color.notification_color_overdue_task);
    
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;

    private akl(int i, int i2, int i3, int i4, int i5) {
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
    }
}
