package defpackage;

/* renamed from: eiw reason: default package */
/* compiled from: PG */
public final class eiw extends android.content.BroadcastReceiver {
    public final /* synthetic */ org.chromium.net.ProxyChangeListener a;

    public eiw(org.chromium.net.ProxyChangeListener proxyChangeListener) {
        this.a = proxyChangeListener;
    }

    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        if (intent.getAction().equals("android.intent.action.PROXY_CHANGE")) {
            org.chromium.net.ProxyChangeListener proxyChangeListener = this.a;
            defpackage.eix eix = new defpackage.eix(this, intent);
            if (proxyChangeListener.a == android.os.Looper.myLooper()) {
                eix.run();
            } else {
                proxyChangeListener.b.post(eix);
            }
        }
    }

    static defpackage.eiv a(android.content.Intent intent) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String[] strArr;
        try {
            if (android.os.Build.VERSION.SDK_INT < 21) {
                str = "android.net.ProxyProperties";
                str2 = "proxy";
            } else {
                str = "android.net.ProxyInfo";
                str2 = "android.intent.extra.PROXY_INFO";
            }
            java.lang.Object obj = intent.getExtras().get(str2);
            if (obj == null) {
                return null;
            }
            java.lang.Class cls = java.lang.Class.forName(str);
            java.lang.reflect.Method declaredMethod = cls.getDeclaredMethod("getHost", new java.lang.Class[0]);
            java.lang.reflect.Method declaredMethod2 = cls.getDeclaredMethod("getPort", new java.lang.Class[0]);
            java.lang.reflect.Method declaredMethod3 = cls.getDeclaredMethod("getExclusionList", new java.lang.Class[0]);
            java.lang.String str3 = (java.lang.String) declaredMethod.invoke(obj, new java.lang.Object[0]);
            int intValue = ((java.lang.Integer) declaredMethod2.invoke(obj, new java.lang.Object[0])).intValue();
            if (android.os.Build.VERSION.SDK_INT < 21) {
                strArr = ((java.lang.String) declaredMethod3.invoke(obj, new java.lang.Object[0])).split(",");
            } else {
                strArr = (java.lang.String[]) declaredMethod3.invoke(obj, new java.lang.Object[0]);
            }
            if (android.os.Build.VERSION.SDK_INT >= 19 && android.os.Build.VERSION.SDK_INT < 21) {
                java.lang.String str4 = (java.lang.String) cls.getDeclaredMethod("getPacFileUrl", new java.lang.Class[0]).invoke(obj, new java.lang.Object[0]);
                if (!android.text.TextUtils.isEmpty(str4)) {
                    return new defpackage.eiv(str3, intValue, str4, strArr);
                }
            } else if (android.os.Build.VERSION.SDK_INT >= 21) {
                android.net.Uri uri = (android.net.Uri) cls.getDeclaredMethod("getPacFileUrl", new java.lang.Class[0]).invoke(obj, new java.lang.Object[0]);
                if (!android.net.Uri.EMPTY.equals(uri)) {
                    return new defpackage.eiv(str3, intValue, uri.toString(), strArr);
                }
            }
            return new defpackage.eiv(str3, intValue, null, strArr);
        } catch (java.lang.ClassNotFoundException e) {
            android.util.Log.e("ProxyChangeListener", "Using no proxy configuration due to exception:" + e);
            return null;
        } catch (java.lang.NoSuchMethodException e2) {
            android.util.Log.e("ProxyChangeListener", "Using no proxy configuration due to exception:" + e2);
            return null;
        } catch (java.lang.IllegalAccessException e3) {
            android.util.Log.e("ProxyChangeListener", "Using no proxy configuration due to exception:" + e3);
            return null;
        } catch (java.lang.reflect.InvocationTargetException e4) {
            android.util.Log.e("ProxyChangeListener", "Using no proxy configuration due to exception:" + e4);
            return null;
        } catch (java.lang.NullPointerException e5) {
            android.util.Log.e("ProxyChangeListener", "Using no proxy configuration due to exception:" + e5);
            return null;
        }
    }
}
