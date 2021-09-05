package defpackage;

/* renamed from: arg reason: default package */
/* compiled from: PG */
final class arg implements android.os.Handler.Callback {
    arg() {
    }

    public final boolean handleMessage(android.os.Message message) {
        switch (message.what) {
            case 0:
                defpackage.ard ard = (defpackage.ard) message.obj;
                if (ard.d.getParent() == null) {
                    android.view.ViewGroup.LayoutParams layoutParams = ard.d.getLayoutParams();
                    if (layoutParams instanceof defpackage.ha) {
                        defpackage.ha haVar = (defpackage.ha) layoutParams;
                        defpackage.arm arm = new defpackage.arm(ard);
                        arm.a();
                        arm.b();
                        arm.c = 0;
                        arm.b = new defpackage.ari(ard);
                        haVar.a((defpackage.gx) arm);
                        haVar.g = 80;
                    }
                    ard.b.addView(ard.d);
                }
                ard.d.b = new defpackage.arn(ard);
                if (!ViewCompat.a.r(ard.d)) {
                    ard.d.a = new defpackage.aro(ard);
                } else if (ard.e()) {
                    ard.c();
                } else {
                    ard.d();
                }
                return true;
            case 1:
                defpackage.ard ard2 = (defpackage.ard) message.obj;
                int i = message.arg1;
                if (!ard2.e() || ard2.d.getVisibility() != 0) {
                    ard2.b(i);
                } else {
                    ard2.d.animate().alpha(0.0f).setDuration(75).setStartDelay(150).withEndAction(new defpackage.arf(ard2, i)).start();
                }
                return true;
            default:
                return false;
        }
    }
}
