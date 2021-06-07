package defpackage;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: cq  reason: default package */
/* compiled from: PG */
public final class cq {
    public final Intent a;
    public boolean b;

    public cq() {
        this((byte) 0);
    }

    private cq(byte b2) {
        this.a = new Intent("android.intent.action.VIEW");
        this.b = true;
        Bundle bundle = new Bundle();
        if (Build.VERSION.SDK_INT >= 18) {
            bundle.putBinder("android.support.customtabs.extra.SESSION", null);
        } else {
            if (!ba.b) {
                try {
                    Method method = Bundle.class.getMethod("putIBinder", String.class, IBinder.class);
                    ba.a = method;
                    method.setAccessible(true);
                } catch (NoSuchMethodException e) {
                }
                ba.b = true;
            }
            if (ba.a != null) {
                try {
                    ba.a.invoke(bundle, "android.support.customtabs.extra.SESSION", null);
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
                    ba.a = null;
                }
            }
        }
        this.a.putExtras(bundle);
    }
}
