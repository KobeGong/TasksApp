package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.chromium.net.ProxyChangeListener;

/* renamed from: eiw  reason: default package */
/* compiled from: PG */
public final class eiw extends BroadcastReceiver {
    public final /* synthetic */ ProxyChangeListener a;

    public eiw(ProxyChangeListener proxyChangeListener) {
        this.a = proxyChangeListener;
    }

    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.PROXY_CHANGE")) {
            ProxyChangeListener proxyChangeListener = this.a;
            eix eix = new eix(this, intent);
            if (proxyChangeListener.a == Looper.myLooper()) {
                eix.run();
            } else {
                proxyChangeListener.b.post(eix);
            }
        }
    }

    static eiv a(Intent intent) {
        String str;
        String str2;
        String[] strArr;
        try {
            if (Build.VERSION.SDK_INT < 21) {
                str = "android.net.ProxyProperties";
                str2 = "proxy";
            } else {
                str = "android.net.ProxyInfo";
                str2 = "android.intent.extra.PROXY_INFO";
            }
            Object obj = intent.getExtras().get(str2);
            if (obj == null) {
                return null;
            }
            Class<?> cls = Class.forName(str);
            Method declaredMethod = cls.getDeclaredMethod("getHost", new Class[0]);
            Method declaredMethod2 = cls.getDeclaredMethod("getPort", new Class[0]);
            Method declaredMethod3 = cls.getDeclaredMethod("getExclusionList", new Class[0]);
            String str3 = (String) declaredMethod.invoke(obj, new Object[0]);
            int intValue = ((Integer) declaredMethod2.invoke(obj, new Object[0])).intValue();
            if (Build.VERSION.SDK_INT < 21) {
                strArr = ((String) declaredMethod3.invoke(obj, new Object[0])).split(",");
            } else {
                strArr = (String[]) declaredMethod3.invoke(obj, new Object[0]);
            }
            if (Build.VERSION.SDK_INT >= 19 && Build.VERSION.SDK_INT < 21) {
                String str4 = (String) cls.getDeclaredMethod("getPacFileUrl", new Class[0]).invoke(obj, new Object[0]);
                if (!TextUtils.isEmpty(str4)) {
                    return new eiv(str3, intValue, str4, strArr);
                }
            } else if (Build.VERSION.SDK_INT >= 21) {
                Uri uri = (Uri) cls.getDeclaredMethod("getPacFileUrl", new Class[0]).invoke(obj, new Object[0]);
                if (!Uri.EMPTY.equals(uri)) {
                    return new eiv(str3, intValue, uri.toString(), strArr);
                }
            }
            return new eiv(str3, intValue, null, strArr);
        } catch (ClassNotFoundException e) {
            Log.e("ProxyChangeListener", "Using no proxy configuration due to exception:" + e);
            return null;
        } catch (NoSuchMethodException e2) {
            Log.e("ProxyChangeListener", "Using no proxy configuration due to exception:" + e2);
            return null;
        } catch (IllegalAccessException e3) {
            Log.e("ProxyChangeListener", "Using no proxy configuration due to exception:" + e3);
            return null;
        } catch (InvocationTargetException e4) {
            Log.e("ProxyChangeListener", "Using no proxy configuration due to exception:" + e4);
            return null;
        } catch (NullPointerException e5) {
            Log.e("ProxyChangeListener", "Using no proxy configuration due to exception:" + e5);
            return null;
        }
    }
}
