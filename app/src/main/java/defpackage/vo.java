package defpackage;

import android.os.Build;
import android.widget.TextView;

/* renamed from: vo  reason: default package */
/* compiled from: PG */
public final class vo {
    public static final vs a;

    public static void a(TextView textView, int i) {
        a.a(textView, i);
    }

    static {
        if (Build.VERSION.SDK_INT >= 27) {
            a = new vr((char) 0);
        } else if (Build.VERSION.SDK_INT >= 26) {
            a = new vr((byte) 0);
        } else if (Build.VERSION.SDK_INT >= 23) {
            a = new vr();
        } else if (Build.VERSION.SDK_INT >= 18) {
            a = new vq();
        } else if (Build.VERSION.SDK_INT >= 17) {
            a = new vp();
        } else {
            a = new vs((byte) 0);
        }
    }
}
