package defpackage;

import android.animation.ValueAnimator;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.design.chip.Chip;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;

/* renamed from: arx  reason: default package */
/* compiled from: PG */
public final class arx extends gu implements DatePickerDialog.OnDateSetListener {
    public EditText U;
    public EditText V;
    public ImageButton W;
    public View X;
    public View Y;
    public int Z;
    public ValueAnimator aa;
    public dmk ab;
    public boolean ac;
    private Chip ad;

    @Override // defpackage.lc
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(com.google.android.apps.tasks.R.layout.add_task_fragment, viewGroup, false);
        this.U = (EditText) inflate.findViewById(com.google.android.apps.tasks.R.id.add_task_title);
        this.V = (EditText) inflate.findViewById(com.google.android.apps.tasks.R.id.add_task_details);
        this.W = (ImageButton) inflate.findViewById(com.google.android.apps.tasks.R.id.add_task_more);
        this.ad = (Chip) inflate.findViewById(com.google.android.apps.tasks.R.id.add_task_due_date_chip);
        this.Z = jd.b(k(), (int) R.color.blueText);
        this.X = inflate.findViewById(com.google.android.apps.tasks.R.id.add_task_change_details);
        this.X.setOnClickListener(new ary(this));
        this.Y = inflate.findViewById(com.google.android.apps.tasks.R.id.add_task_pick_due_date);
        this.Y.setOnClickListener(new arz(this));
        ((Button) inflate.findViewById(com.google.android.apps.tasks.R.id.add_task_done)).setOnClickListener(new asa(this));
        this.W.setOnClickListener(new asb(this));
        this.ad.setOnClickListener(new asc(this));
        this.ad.c = new asd(this);
        return inflate;
    }

    @Override // defpackage.ei, defpackage.gu, defpackage.xh, defpackage.lb
    public final Dialog c() {
        return new asg(i(), this.a);
    }

    public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        dih dih;
        dii g = ((dii) dmk.d.a(bg.ao)).e(i).f(i2 + 1).g(i3);
        if (g.b) {
            dih = g.a;
        } else {
            dih dih2 = g.a;
            djz.a.a(dih2).c(dih2);
            g.b = true;
            dih = g.a;
        }
        dih dih3 = dih;
        if (!dih.a(dih3, Boolean.TRUE.booleanValue())) {
            throw new dkw();
        }
        this.ab = (dmk) dih3;
        N();
        if (this.U.hasFocus()) {
            bdk.a((View) this.U, true);
        } else if (this.V.hasFocus()) {
            bdk.a((View) this.V, true);
        }
    }

    /* access modifiers changed from: package-private */
    public final void N() {
        if (this.ab == null) {
            this.ad.setVisibility(8);
            return;
        }
        this.ad.a(a(R.string.task_selected_due_date, ajd.b(this.ab).getTime()));
        this.ad.setVisibility(0);
    }

    /* access modifiers changed from: package-private */
    public final void b(View view) {
        view.setVisibility(0);
        int left = view.getLeft() - this.W.getLeft();
        view.setTranslationX((-(1.0f - (this.W.getRotation() / 45.0f))) * ((float) left));
        if (this.ac) {
            view.animate().translationX(0.0f).setInterpolator(new DecelerateInterpolator(1.2f)).alpha(1.0f).start();
        } else {
            view.animate().setInterpolator(new DecelerateInterpolator(1.2f)).translationX((float) (-left)).alpha(0.0f).withEndAction(new ase(view)).start();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void O() {
        aqj.a(this.ab).a(this.t, "datePicker_add");
        bdk.a(this.J, false);
    }
}
