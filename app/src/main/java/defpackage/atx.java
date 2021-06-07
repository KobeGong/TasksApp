package defpackage;

import android.graphics.drawable.Drawable;
import android.support.design.chip.Chip;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.apps.tasks.R;
import com.google.android.apps.tasks.ui.components.FancyCheckboxView;
import com.google.android.apps.tasks.ui.taskslist.TaskItemFrameLayout;
import java.util.Calendar;

/* renamed from: atx  reason: default package */
/* compiled from: PG */
final class atx extends afv {
    private static Drawable D;
    public boolean A;
    public float B;
    public float C;
    private final View E;
    private final Chip F;
    private final Chip G;
    private final TextView H;
    public final FrameLayout p = ((FrameLayout) this.a);
    public final View q;
    public final TextView r;
    public final TaskItemFrameLayout s;
    public final FancyCheckboxView t;
    public final TextView u;
    public aug v;
    public String w;
    public String x;
    public daq y;
    public float z;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public atx(com.google.android.apps.tasks.ui.taskslist.TaskItemFrameLayout r5, android.view.View r6, android.widget.TextView r7) {
        /*
        // Method dump skipped, instructions count: 214
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atx.<init>(com.google.android.apps.tasks.ui.taskslist.TaskItemFrameLayout, android.view.View, android.widget.TextView):void");
    }

    public final void a(float f) {
        this.t.a(f);
    }

    /* access modifiers changed from: package-private */
    public final void t() {
        this.s.clearAnimation();
        this.s.setTranslationX(0.0f);
    }

    /* access modifiers changed from: package-private */
    public final void b(boolean z2) {
        this.A = z2;
        if (z2) {
            this.s.setPaddingRelative((int) this.s.getResources().getDimension(R.dimen.task_item_subtask_start_spacing), 0, 0, 0);
            return;
        }
        this.s.setPadding(0, 0, 0, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x01fc  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x020b  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0218  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0293  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0297  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x030e  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0312  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x031a  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x018d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.dby r11, int r12, boolean r13, boolean r14) {
        /*
        // Method dump skipped, instructions count: 800
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atx.a(dby, int, boolean, boolean):void");
    }

    /* access modifiers changed from: package-private */
    public final boolean u() {
        return (this.H.getVisibility() == 0 || this.F.getVisibility() == 0 || this.G.getVisibility() == 0) ? false : true;
    }

    public final void c(int i) {
        sn.b(this.a, this.a.getResources().getDimension(R.dimen.task_dnd_elevation));
        if (i > 0) {
            if (this.r.getParent() != null) {
                ((ViewGroup) this.r.getParent()).removeView(this.r);
            }
            this.r.setText(this.r.getContext().getResources().getQuantityString(R.plurals.task_num_dragged_subtasks, i, Integer.valueOf(i)));
            this.p.addView(this.r, new FrameLayout.LayoutParams(-2, -2, 8388661));
            this.r.setVisibility(0);
            this.r.setAlpha(0.0f);
            this.r.animate().alpha(1.0f).start();
        }
    }

    private final String a(Calendar calendar, Calendar calendar2) {
        long a = (long) ajd.a(calendar, calendar2);
        if (a < 0) {
            long j = -a;
            if (j < 7) {
                int i = (int) j;
                return this.s.getResources().getQuantityString(R.plurals.task_overdue_days, i, Integer.valueOf(i));
            }
            int i2 = (int) (j / 7);
            return this.s.getResources().getQuantityString(R.plurals.task_overdue_weeks, i2, Integer.valueOf(i2));
        } else if (a == 0) {
            return this.s.getResources().getString(R.string.task_due_today);
        } else {
            if (a == 1) {
                return this.s.getContext().getString(R.string.task_due_tomorrow);
            }
            return this.s.getContext().getString(R.string.task_due_date, Long.valueOf(calendar.getTimeInMillis()));
        }
    }

    public final void v() {
        this.a.setTranslationX(0.0f);
        this.t.a(this.z);
    }
}
