package defpackage;

/* renamed from: asb reason: default package */
final /* synthetic */ class asb implements android.view.View.OnClickListener {
    private final AddTaskFragment a;

    asb(AddTaskFragment arx) {
        this.a = arx;
    }

    public final void onClick(android.view.View view) {
        float f;
        int i;
        float f2 = 1.0f;
        AddTaskFragment arx = this.a;
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
            f = ((java.lang.Float) arx.aa.getAnimatedValue()).floatValue();
            arx.aa.cancel();
        }
        arx.aa = android.animation.ValueAnimator.ofFloat(new float[]{f, f2});
        arx.aa.addUpdateListener(new defpackage.asf(arx));
        arx.aa.start();
        if (arx.ac) {
            i = 2131951619;
        } else {
            i = 2131951621;
        }
        arx.W.setContentDescription(arx.getResource().getString(i));
    }
}
