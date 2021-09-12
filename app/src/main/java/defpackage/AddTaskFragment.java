package defpackage;

import android.widget.DatePicker;

/* renamed from: arx reason: default package */
/* compiled from: PG */
public final class AddTaskFragment extends defpackage.gu implements android.app.DatePickerDialog.OnDateSetListener {
    public android.widget.EditText taskTitleView;
    public android.widget.EditText taskDetailView;
    public android.widget.ImageButton W;
    public android.view.View X;
    public android.view.View Y;
    public int Z;
    public android.animation.ValueAnimator aa;
    public defpackage.dmk ab;
    public boolean ac;
    private android.support.design.chip.Chip ad;

    public final android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        android.view.View inflate = layoutInflater.inflate(com.google.android.apps.tasks.R.layout.add_task_fragment, viewGroup, false);
        this.taskTitleView = inflate.findViewById(com.google.android.apps.tasks.R.id.add_task_title);
        this.taskDetailView = inflate.findViewById(com.google.android.apps.tasks.R.id.add_task_details);
        android.widget.Button addTaskDoneView = inflate.findViewById(com.google.android.apps.tasks.R.id.add_task_done);
        this.W = inflate.findViewById(com.google.android.apps.tasks.R.id.add_task_more);
        this.ad = inflate.findViewById(com.google.android.apps.tasks.R.id.add_task_due_date_chip);
        this.Z = defpackage.jd.b(getResource(), com.google.android.apps.tasks.R.color.blueText);
        this.X = inflate.findViewById(com.google.android.apps.tasks.R.id.add_task_change_details);
        this.X.setOnClickListener(new defpackage.ary(this));
        this.Y = inflate.findViewById(com.google.android.apps.tasks.R.id.add_task_pick_due_date);
        this.Y.setOnClickListener(new defpackage.arz(this));
        addTaskDoneView.setOnClickListener(new defpackage.asa(this));
        this.W.setOnClickListener(new defpackage.asb(this));
        this.ad.setOnClickListener(new defpackage.asc(this));
        this.ad.c = new defpackage.asd(this);
        return inflate;
    }

    public final android.app.Dialog c() {
        return new defpackage.asg(getContext(), this.a);
    }

    public final void onDateSet(DatePicker datePicker, int year, int month, int dayOfMonth) {
        defpackage.dih dih;
        defpackage.dii g = ((defpackage.dii) defpackage.dmk.d.a(defpackage.bg.ao)).e(year).f(month + 1).g(dayOfMonth);
        if (g.b) {
            dih = g.a;
        } else {
            defpackage.dih dih2 = g.a;
            defpackage.djz.a.a(dih2).c(dih2);
            g.b = true;
            dih = g.a;
        }
        defpackage.dih dih3 = dih;
        if (!defpackage.dih.a(dih3, java.lang.Boolean.TRUE.booleanValue())) {
            throw new defpackage.dkw();
        }
        this.ab = (defpackage.dmk) dih3;
        N();
        if (this.taskTitleView.hasFocus()) {
            defpackage.bdk.a(this.taskTitleView, true);
        } else if (this.taskDetailView.hasFocus()) {
            defpackage.bdk.a(this.taskDetailView, true);
        }
    }

    /* access modifiers changed from: 0000 */
    public final void N() {
        if (this.ab == null) {
            this.ad.setVisibility(8);
            return;
        }
        this.ad.a(a(2131951831, ajd.b(this.ab).getTime()));
        this.ad.setVisibility(0);
    }

    /* access modifiers changed from: 0000 */
    public final void b(android.view.View view) {
        view.setVisibility(0);
        int left = view.getLeft() - this.W.getLeft();
        view.setTranslationX((-(1.0f - (this.W.getRotation() / 45.0f))) * ((float) left));
        if (this.ac) {
            view.animate().translationX(0.0f).setInterpolator(new android.view.animation.DecelerateInterpolator(1.2f)).alpha(1.0f).start();
        } else {
            view.animate().setInterpolator(new android.view.animation.DecelerateInterpolator(1.2f)).translationX((float) (-left)).alpha(0.0f).withEndAction(new defpackage.ase(view)).start();
        }
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void O() {
        defpackage.aqj.a(this.ab).a(this.fragmentManager, "datePicker_add");
        defpackage.bdk.a(this.mView, false);
    }
}
