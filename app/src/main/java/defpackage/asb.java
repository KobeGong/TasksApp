package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import com.google.android.apps.tasks.R;

/* renamed from: asb  reason: default package */
final /* synthetic */ class asb implements View.OnClickListener {
    private final arx a;

    asb(arx arx) {
        this.a = arx;
    }

    public final void onClick(View view) {
        float f;
        int i;
        float f2 = 1.0f;
        arx arx = this.a;
        arx.ac = !arx.ac;
        arx.b(arx.X);
        arx.b(arx.Y);
        if (arx.ac) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        if (!arx.ac) {
            f2 = 0.0f;
        }
        if (arx.aa != null && arx.aa.isRunning()) {
            f = ((Float) arx.aa.getAnimatedValue()).floatValue();
            arx.aa.cancel();
        }
        arx.aa = ValueAnimator.ofFloat(f, f2);
        arx.aa.addUpdateListener(new asf(arx));
        arx.aa.start();
        if (arx.ac) {
            i = R.string.a11y_add_task_hide_more_options;
        } else {
            i = R.string.a11y_add_task_show_more_options;
        }
        arx.W.setContentDescription(arx.k().getString(i));
    }
}
