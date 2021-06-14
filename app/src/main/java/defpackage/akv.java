package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.tasks.R;
import com.google.android.apps.tasks.ui.components.FancyCheckboxView;
import java.util.Calendar;

/* renamed from: akv  reason: default package */
/* compiled from: PG */
final class akv extends ViewHolder {
    public aky p;
    public final TextView q;
    public final TextView r;
    public final TextView s;
    public final TextView t;
    public final TextView u;
    public final FancyCheckboxView v;

    public akv(View view) {
        super(view);
        this.q = (TextView) view.findViewById(R.id.task_task_list);
        this.r = (TextView) view.findViewById(R.id.task_name);
        this.s = (TextView) view.findViewById(R.id.task_details);
        this.t = (TextView) view.findViewById(R.id.task_due_date);
        this.u = (TextView) view.findViewById(R.id.task_link);
        this.v = (FancyCheckboxView) view.findViewById(R.id.task_completed);
        this.v.setOnClickListener(new akw(this));
        this.a.setOnClickListener(new akx(this));
    }

    static String a(Context context, String str, String str2, int i) {
        return str.replace(str2, String.format("#%06X", Integer.valueOf(16777215 & ob.c(context, i))));
    }

    static Calendar t() {
        Calendar instance = Calendar.getInstance();
        instance.set(14, 0);
        instance.set(13, 0);
        instance.set(12, 0);
        instance.set(11, 0);
        return instance;
    }
}
