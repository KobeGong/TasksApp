package com.google.android.gms.gcm;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.util.Base64;
import android.util.Log;

import defpackage.ok;

/* compiled from: PG */
public class GcmReceiver extends ok {
    private static bid a;
    private static bid b;

    public void onReceive(Context context, Intent intent) {
        boolean z = false;
        intent.setComponent(null);
        intent.setPackage(context.getPackageName());
        if (Build.VERSION.SDK_INT <= 18) {
            intent.removeCategory(context.getPackageName());
        }
        String stringExtra = intent.getStringExtra("from");
        if ("google.com/iid".equals(stringExtra) || "gcm.googleapis.com/refresh".equals(stringExtra)) {
            intent.setAction("com.google.android.gms.iid.InstanceID");
        }
        String stringExtra2 = intent.getStringExtra("gcm.rawData64");
        if (stringExtra2 != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra2, 0));
            intent.removeExtra("gcm.rawData64");
        }
        if (azb.i() && context.getApplicationInfo().targetSdkVersion > 25) {
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

    private final synchronized bid a(Context context, String str) {
        bid bid;
        if ("com.google.android.c2dm.intent.RECEIVE".equals(str)) {
            if (b == null) {
                b = new bid(context, str);
            }
            bid = b;
        } else {
            if (a == null) {
                a = new bid(context, str);
            }
            bid = a;
        }
        return bid;
    }

    private final void b(Context context, Intent intent) {
        ComponentName startService;
        if (isOrderedBroadcast()) {
            setResultCode(500);
        }
        ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
        if (resolveService == null || resolveService.serviceInfo == null) {
            Log.e("GcmReceiver", "Failed to resolve target intent service, skipping classname enforcement");
        } else {
            ServiceInfo serviceInfo = resolveService.serviceInfo;
            if (!context.getPackageName().equals(serviceInfo.packageName) || serviceInfo.name == null) {
                String str = serviceInfo.packageName;
                String str2 = serviceInfo.name;
                Log.e("GcmReceiver", new StringBuilder(String.valueOf(str).length() + 94 + String.valueOf(str2).length()).append("Error resolving target intent service, skipping classname enforcement. Resolved service was: ").append(str).append("/").append(str2).toString());
            } else {
                String str3 = serviceInfo.name;
                if (str3.startsWith(".")) {
                    String valueOf = String.valueOf(context.getPackageName());
                    String valueOf2 = String.valueOf(str3);
                    str3 = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
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
                Log.e("GcmReceiver", "Error while delivering the message: ServiceIntent not found.");
                if (isOrderedBroadcast()) {
                    setResultCode(404);
                }
            } else if (isOrderedBroadcast()) {
                setResultCode(-1);
            }
        } catch (SecurityException e) {
            Log.e("GcmReceiver", "Error while delivering the message to the serviceIntent", e);
            if (isOrderedBroadcast()) {
                setResultCode(401);
            }
        }
    }
}
