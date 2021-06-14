package defpackage;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ProgressBar;
import com.google.android.apps.tasks.R;

/* renamed from: axt  reason: default package */
/* compiled from: PG */
public final class axt extends axv {
    public static final axt a = new axt();
    private static final Object c = new Object();

    axt() {
    }

    public final Dialog a(Activity activity, int i) {
        return a(activity, i, 1002, (DialogInterface.OnCancelListener) null);
    }

    public static Dialog a(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        return a(activity, i, new bei(axv.a(activity, i, "d"), activity, i2), onCancelListener);
    }

    public static Dialog a(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, 16842874);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(beg.c(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog create = builder.create();
        a(activity, create, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return create;
    }

    public static bar a(Context context, bas bas) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        bar bar = new bar(bas);
        context.registerReceiver(bar, intentFilter);
        bar.a = context;
        if (axz.a(context, "com.google.android.gms")) {
            return bar;
        }
        bas.a();
        bar.a();
        return null;
    }

    private static String a() {
        synchronized (c) {
        }
        return null;
    }

    public static Dialog a(Context context, int i, beh beh, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog.Builder builder = null;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        }
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(beg.c(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String e = beg.e(context, i);
        if (e != null) {
            builder.setPositiveButton(e, beh);
        }
        String a2 = beg.a(context, i);
        if (a2 != null) {
            builder.setTitle(a2);
        }
        return builder.create();
    }

    public static void a(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        if (activity instanceof FragmentActivity) {
            ln c2 = ((FragmentActivity) activity).c();
            ayb ayb = new ayb();
            Dialog dialog2 = (Dialog) azb.b(dialog, "Cannot display null dialog");
            dialog2.setOnCancelListener(null);
            dialog2.setOnDismissListener(null);
            ayb.U = dialog2;
            if (onCancelListener != null) {
                ayb.V = onCancelListener;
            }
            ayb.a(c2, str);
            return;
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        axr axr = new axr();
        Dialog dialog3 = (Dialog) azb.b(dialog, "Cannot display null dialog");
        dialog3.setOnCancelListener(null);
        dialog3.setOnDismissListener(null);
        axr.a = dialog3;
        if (onCancelListener != null) {
            axr.b = onCancelListener;
        }
        axr.show(fragmentManager, str);
    }

    @TargetApi(20)
    public final void a(Context context, int i, PendingIntent pendingIntent) {
        Notification b;
        int i2;
        if (i == 18) {
            new axu(this, context).sendEmptyMessageDelayed(1, 120000);
        } else if (pendingIntent != null) {
            String b2 = beg.b(context, i);
            String d = beg.d(context, i);
            Resources resources = context.getResources();
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            if (azb.a(context)) {
                azb.a(azb.g());
                Notification.Builder addAction = new Notification.Builder(context).setSmallIcon(context.getApplicationInfo().icon).setPriority(2).setAutoCancel(true).setContentTitle(b2).setStyle(new Notification.BigTextStyle().bigText(d)).addAction(R.drawable.common_full_open_on_phone, resources.getString(R.string.common_open_on_phone), pendingIntent);
                if (azb.i() && azb.i()) {
                    addAction.setChannelId(a(context, notificationManager));
                }
                b = addAction.build();
            } else {
                ni a2 = new ni(context, (byte) 0).a(17301642).d(resources.getString(R.string.common_google_play_services_notification_ticker)).a(System.currentTimeMillis());
                a2.b(16);
                a2.f = pendingIntent;
                ni b3 = a2.a(b2).b(d);
                b3.m = true;
                ni a3 = b3.a(new nh().a(d));
                if (azb.i() && azb.i()) {
                    a3.s = a(context, notificationManager);
                }
                b = a3.b();
            }
            switch (i) {
                case 1:
                case 2:
                case 3:
                    i2 = 10436;
                    axz.b.set(false);
                    break;
                default:
                    i2 = 39789;
                    break;
            }
            notificationManager.notify(i2, b);
        } else if (i == 6) {
            Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
        }
    }

    @TargetApi(26)
    private static String a(Context context, NotificationManager notificationManager) {
        azb.a(azb.i());
        a();
        NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
        String a2 = beg.a(context);
        if (notificationChannel == null) {
            notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", a2, 4));
        } else if (!a2.equals(notificationChannel.getName())) {
            notificationChannel.setName(a2);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        return "com.google.android.gms.availability";
    }
}
