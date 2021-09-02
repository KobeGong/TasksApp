package defpackage;

/* renamed from: axt reason: default package */
/* compiled from: PG */
public final class axt extends defpackage.axv {
    public static final defpackage.axt a = new defpackage.axt();
    private static final java.lang.Object c = new java.lang.Object();

    axt() {
    }

    public final android.app.Dialog a(android.app.Activity activity, int i) {
        return a(activity, i, 1002, (android.content.DialogInterface.OnCancelListener) null);
    }

    public static android.app.Dialog a(android.app.Activity activity, int i, int i2, android.content.DialogInterface.OnCancelListener onCancelListener) {
        return a((android.content.Context) activity, i, (defpackage.beh) new defpackage.bei(defpackage.axv.a(activity, i, "d"), activity, i2), onCancelListener);
    }

    public static android.app.Dialog a(android.app.Activity activity, android.content.DialogInterface.OnCancelListener onCancelListener) {
        android.widget.ProgressBar progressBar = new android.widget.ProgressBar(activity, null, 16842874);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(defpackage.beg.c(activity, 18));
        builder.setPositiveButton("", null);
        android.app.AlertDialog create = builder.create();
        a(activity, (android.app.Dialog) create, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return create;
    }

    public static defpackage.bar a(android.content.Context context, defpackage.bas bas) {
        android.content.IntentFilter intentFilter = new android.content.IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        defpackage.bar bar = new defpackage.bar(bas);
        context.registerReceiver(bar, intentFilter);
        bar.a = context;
        if (defpackage.axz.a(context, "com.google.android.gms")) {
            return bar;
        }
        bas.a();
        bar.a();
        return null;
    }

    private static java.lang.String a() {
        synchronized (c) {
        }
        return null;
    }

    public static android.app.Dialog a(android.content.Context context, int i, defpackage.beh beh, android.content.DialogInterface.OnCancelListener onCancelListener) {
        android.app.AlertDialog.Builder builder = null;
        if (i == 0) {
            return null;
        }
        android.util.TypedValue typedValue = new android.util.TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new android.app.AlertDialog.Builder(context, 5);
        }
        if (builder == null) {
            builder = new android.app.AlertDialog.Builder(context);
        }
        builder.setMessage(defpackage.beg.c(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        java.lang.String e = defpackage.beg.e(context, i);
        if (e != null) {
            builder.setPositiveButton(e, beh);
        }
        java.lang.String a2 = defpackage.beg.a(context, i);
        if (a2 != null) {
            builder.setTitle(a2);
        }
        return builder.create();
    }

    public static void a(android.app.Activity activity, android.app.Dialog dialog, java.lang.String str, android.content.DialogInterface.OnCancelListener onCancelListener) {
        if (activity instanceof FragmentActivity) {
            defpackage.ln c2 = ((FragmentActivity) activity).getSupportFragmentManager();
            defpackage.ayb ayb = new defpackage.ayb();
            android.app.Dialog dialog2 = (android.app.Dialog) defpackage.azb.b((java.lang.Object) dialog, (java.lang.Object) "Cannot display null dialog");
            dialog2.setOnCancelListener(null);
            dialog2.setOnDismissListener(null);
            ayb.U = dialog2;
            if (onCancelListener != null) {
                ayb.V = onCancelListener;
            }
            ayb.a(c2, str);
            return;
        }
        android.app.FragmentManager fragmentManager = activity.getFragmentManager();
        defpackage.axr axr = new defpackage.axr();
        android.app.Dialog dialog3 = (android.app.Dialog) defpackage.azb.b((java.lang.Object) dialog, (java.lang.Object) "Cannot display null dialog");
        dialog3.setOnCancelListener(null);
        dialog3.setOnDismissListener(null);
        axr.a = dialog3;
        if (onCancelListener != null) {
            axr.b = onCancelListener;
        }
        axr.show(fragmentManager, str);
    }

    @android.annotation.TargetApi(20)
    public final void a(android.content.Context context, int i, android.app.PendingIntent pendingIntent) {
        android.app.Notification b;
        int i2;
        if (i == 18) {
            new defpackage.axu(this, context).sendEmptyMessageDelayed(1, 120000);
        } else if (pendingIntent != null) {
            java.lang.String b2 = defpackage.beg.b(context, i);
            java.lang.String d = defpackage.beg.d(context, i);
            android.content.res.Resources resources = context.getResources();
            android.app.NotificationManager notificationManager = (android.app.NotificationManager) context.getSystemService("notification");
            if (defpackage.azb.a(context)) {
                defpackage.azb.a(defpackage.azb.g());
                android.app.Notification.Builder addAction = new android.app.Notification.Builder(context).setSmallIcon(context.getApplicationInfo().icon).setPriority(2).setAutoCancel(true).setContentTitle(b2).setStyle(new android.app.Notification.BigTextStyle().bigText(d)).addAction(2130837597, resources.getString(2131951710), pendingIntent);
                if (defpackage.azb.i() && defpackage.azb.i()) {
                    addAction.setChannelId(a(context, notificationManager));
                }
                b = addAction.build();
            } else {
                defpackage.ni a2 = new defpackage.ni(context, 0).a(17301642).d(resources.getString(2131951702)).a(java.lang.System.currentTimeMillis());
                a2.b(16);
                a2.f = pendingIntent;
                defpackage.ni b3 = a2.a((java.lang.CharSequence) b2).b((java.lang.CharSequence) d);
                b3.m = true;
                defpackage.ni a3 = b3.a((defpackage.nk) new defpackage.nh().a((java.lang.CharSequence) d));
                if (defpackage.azb.i() && defpackage.azb.i()) {
                    a3.s = a(context, notificationManager);
                }
                b = a3.b();
            }
            switch (i) {
                case 1:
                case 2:
                case 3:
                    i2 = 10436;
                    defpackage.axz.b.set(false);
                    break;
                default:
                    i2 = 39789;
                    break;
            }
            notificationManager.notify(i2, b);
        } else if (i == 6) {
            android.util.Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
        }
    }

    @android.annotation.TargetApi(26)
    private static java.lang.String a(android.content.Context context, android.app.NotificationManager notificationManager) {
        defpackage.azb.a(defpackage.azb.i());
        a();
        java.lang.String str = "com.google.android.gms.availability";
        android.app.NotificationChannel notificationChannel = notificationManager.getNotificationChannel(str);
        java.lang.String a2 = defpackage.beg.a(context);
        if (notificationChannel == null) {
            notificationManager.createNotificationChannel(new android.app.NotificationChannel(str, a2, 4));
        } else if (!a2.equals(notificationChannel.getName())) {
            notificationChannel.setName(a2);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        return str;
    }
}
