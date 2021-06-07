package defpackage;

import android.os.Handler;
import android.os.Message;
import android.view.ViewGroup;

/* renamed from: arg  reason: default package */
/* compiled from: PG */
final class arg implements Handler.Callback {
    arg() {
    }

    public final boolean handleMessage(Message message) {
        switch (message.what) {
            case 0:
                ard ard = (ard) message.obj;
                if (ard.d.getParent() == null) {
                    ViewGroup.LayoutParams layoutParams = ard.d.getLayoutParams();
                    if (layoutParams instanceof ha) {
                        ha haVar = (ha) layoutParams;
                        arm arm = new arm(ard);
                        arm.a();
                        arm.b();
                        arm.c = 0;
                        arm.b = new ari(ard);
                        haVar.a(arm);
                        haVar.g = 80;
                    }
                    ard.b.addView(ard.d);
                }
                ard.d.b = new arn(ard);
                if (!sn.a.r(ard.d)) {
                    ard.d.a = new aro(ard);
                } else if (ard.e()) {
                    ard.c();
                } else {
                    ard.d();
                }
                return true;
            case 1:
                ard ard2 = (ard) message.obj;
                int i = message.arg1;
                if (!ard2.e() || ard2.d.getVisibility() != 0) {
                    ard2.b(i);
                } else {
                    ard2.d.animate().alpha(0.0f).setDuration(75).setStartDelay(150).withEndAction(new arf(ard2, i)).start();
                }
                return true;
            default:
                return false;
        }
    }
}
