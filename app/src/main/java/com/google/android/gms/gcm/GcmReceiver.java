package com.google.android.gms.gcm;

/* compiled from: PG */
public class GcmReceiver extends defpackage.ok {
    private static defpackage.bid a;
    private static defpackage.bid b;

    public void onReceive(android.content.Context context, android.content.Intent intent) {
        boolean z = false;
        intent.setComponent(null);
        intent.setPackage(context.getPackageName());
        if (android.os.Build.VERSION.SDK_INT <= 18) {
            intent.removeCategory(context.getPackageName());
        }
        java.lang.String stringExtra = intent.getStringExtra("from");
        if ("google.com/iid".equals(stringExtra) || "gcm.googleapis.com/refresh".equals(stringExtra)) {
            intent.setAction("com.google.android.gms.iid.InstanceID");
        }
        java.lang.String stringExtra2 = intent.getStringExtra("gcm.rawData64");
        if (stringExtra2 != null) {
            intent.putExtra("rawData", android.util.Base64.decode(stringExtra2, 0));
            intent.removeExtra("gcm.rawData64");
        }
        if (defpackage.azb.i() && context.getApplicationInfo().targetSdkVersion > 25) {
            z = true;
        }
        if (z) {
            if (isOrderedBroadcast()) {
                setResultCode(-1);
            }
            a(context, intent.getAction()).a(intent, goAsync());
            return;
        }
        if ("com.google.android.c2dm.intent.RECEIVE".equals(intent.getAction())) {
            b(context, intent);
        } else {
            b(context, intent);
        }
        if (isOrderedBroadcast() && getResultCode() == 0) {
            setResultCode(-1);
        }
    }

    private final synchronized defpackage.bid a(android.content.Context context, java.lang.String str) {
        defpackage.bid bid;
        if ("com.google.android.c2dm.intent.RECEIVE".equals(str)) {
            if (b == null) {
                b = new defpackage.bid(context, str);
            }
            bid = b;
        } else {
            if (a == null) {
                a = new defpackage.bid(context, str);
            }
            bid = a;
        }
        return bid;
    }

    private final void b(android.content.Context context, android.content.Intent intent) {
        android.content.ComponentName startService;
        if (isOrderedBroadcast()) {
            setResultCode(500);
        }
        android.content.pm.ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
        if (resolveService == null || resolveService.serviceInfo == null) {
            android.util.Log.e("GcmReceiver", "Failed to resolve target intent service, skipping classname enforcement");
        } else {
            android.content.pm.ServiceInfo serviceInfo = resolveService.serviceInfo;
            if (!context.getPackageName().equals(serviceInfo.packageName) || serviceInfo.name == null) {
                java.lang.String str = serviceInfo.packageName;
                java.lang.String str2 = serviceInfo.name;
                android.util.Log.e("GcmReceiver", new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 94 + java.lang.String.valueOf(str2).length()).append("Error resolving target intent service, skipping classname enforcement. Resolved service was: ").append(str).append("/").append(str2).toString());
            } else {
                java.lang.String str3 = serviceInfo.name;
                if (str3.startsWith(".")) {
                    java.lang.String valueOf = java.lang.String.valueOf(context.getPackageName());
                    java.lang.String valueOf2 = java.lang.String.valueOf(str3);
                    str3 = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new java.lang.String(valueOf);
                }
                intent.setClassName(context.getPackageName(), str3);
            }
        }
        try {
            if (context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0) {
                startService = a(context, intent);
            } else {
                startService = context.startService(intent);
            }
            if (startService == null) {
                android.util.Log.e("GcmReceiver", "Error while delivering the message: ServiceIntent not found.");
                if (isOrderedBroadcast()) {
                    setResultCode(404);
                }
            } else if (isOrderedBroadcast()) {
                setResultCode(-1);
            }
        } catch (java.lang.SecurityException e) {
            android.util.Log.e("GcmReceiver", "Error while delivering the message to the serviceIntent", e);
            if (isOrderedBroadcast()) {
                setResultCode(401);
            }
        }
    }
}
