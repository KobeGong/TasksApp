package defpackage;

/* renamed from: bhg reason: default package */
/* compiled from: PG */
public class bhg extends defpackage.bhx {
    public void a(android.os.Bundle bundle) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:115:0x02ec  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x03cf  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x03d8  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x03e1  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x03e9  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x03ee  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01e3  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x024d  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x026e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleIntent(android.content.Intent r14) {
        /*
            r13 = this;
            java.lang.String r0 = r14.getAction()
            java.lang.String r1 = "com.google.android.c2dm.intent.RECEIVE"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x002c
            java.lang.String r1 = "GcmListenerService"
            java.lang.String r2 = "Unknown intent action: "
            java.lang.String r0 = r14.getAction()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r3 = r0.length()
            if (r3 == 0) goto L_0x0026
            java.lang.String r0 = r2.concat(r0)
        L_0x0022:
            android.util.Log.w(r1, r0)
        L_0x0025:
            return
        L_0x0026:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
            goto L_0x0022
        L_0x002c:
            java.lang.String r0 = "message_type"
            java.lang.String r0 = r14.getStringExtra(r0)
            if (r0 != 0) goto L_0x0036
            java.lang.String r0 = "gcm"
        L_0x0036:
            r1 = -1
            int r2 = r0.hashCode()
            switch(r2) {
                case -2062414158: goto L_0x0061;
                case 102161: goto L_0x0057;
                case 814694033: goto L_0x0075;
                case 814800675: goto L_0x006b;
                default: goto L_0x003e;
            }
        L_0x003e:
            switch(r1) {
                case 0: goto L_0x007f;
                case 1: goto L_0x0025;
                case 2: goto L_0x046f;
                case 3: goto L_0x0476;
                default: goto L_0x0041;
            }
        L_0x0041:
            java.lang.String r1 = "GcmListenerService"
            java.lang.String r2 = "Received message with unknown type: "
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r3 = r0.length()
            if (r3 == 0) goto L_0x048a
            java.lang.String r0 = r2.concat(r0)
        L_0x0053:
            android.util.Log.w(r1, r0)
            goto L_0x0025
        L_0x0057:
            java.lang.String r2 = "gcm"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x003e
            r1 = 0
            goto L_0x003e
        L_0x0061:
            java.lang.String r2 = "deleted_messages"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x003e
            r1 = 1
            goto L_0x003e
        L_0x006b:
            java.lang.String r2 = "send_event"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x003e
            r1 = 2
            goto L_0x003e
        L_0x0075:
            java.lang.String r2 = "send_error"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x003e
            r1 = 3
            goto L_0x003e
        L_0x007f:
            android.os.Bundle r6 = r14.getExtras()
            java.lang.String r0 = "message_type"
            r6.remove(r0)
            java.lang.String r0 = "android.support.content.wakelockid"
            r6.remove(r0)
            java.lang.String r0 = "1"
            java.lang.String r1 = "gcm.n.e"
            java.lang.String r1 = defpackage.bhi.a(r6, r1)
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00a3
            java.lang.String r0 = "gcm.n.icon"
            java.lang.String r0 = defpackage.bhi.a(r6, r0)
            if (r0 == 0) goto L_0x0192
        L_0x00a3:
            r0 = 1
        L_0x00a4:
            if (r0 == 0) goto L_0x045d
            java.lang.String r0 = "keyguard"
            java.lang.Object r0 = r13.getSystemService(r0)
            android.app.KeyguardManager r0 = (android.app.KeyguardManager) r0
            boolean r0 = r0.inKeyguardRestrictedInputMode()
            if (r0 != 0) goto L_0x0198
            int r1 = android.os.Process.myPid()
            java.lang.String r0 = "activity"
            java.lang.Object r0 = r13.getSystemService(r0)
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0
            java.util.List r0 = r0.getRunningAppProcesses()
            if (r0 == 0) goto L_0x0198
            java.util.Iterator r2 = r0.iterator()
        L_0x00ca:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0198
            java.lang.Object r0 = r2.next()
            android.app.ActivityManager$RunningAppProcessInfo r0 = (android.app.ActivityManager.RunningAppProcessInfo) r0
            int r3 = r0.pid
            if (r3 != r1) goto L_0x00ca
            int r0 = r0.importance
            r1 = 100
            if (r0 != r1) goto L_0x0195
            r0 = 1
        L_0x00e1:
            if (r0 != 0) goto L_0x03f7
            bhi r7 = defpackage.bhi.a(r13)
            java.lang.String r0 = "gcm.n.title"
            java.lang.String r0 = r7.b(r6, r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L_0x0494
            android.content.Context r0 = r7.a
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()
            android.content.Context r1 = r7.a
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            java.lang.CharSequence r0 = r0.loadLabel(r1)
            r1 = r0
        L_0x0104:
            java.lang.String r0 = "gcm.n.body"
            java.lang.String r8 = r7.b(r6, r0)
            java.lang.String r0 = "gcm.n.icon"
            java.lang.String r2 = defpackage.bhi.a(r6, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x01d3
            android.content.Context r0 = r7.a
            android.content.res.Resources r3 = r0.getResources()
            java.lang.String r0 = "drawable"
            android.content.Context r4 = r7.a
            java.lang.String r4 = r4.getPackageName()
            int r0 = r3.getIdentifier(r2, r0, r4)
            if (r0 == 0) goto L_0x019b
            r2 = r0
        L_0x012b:
            java.lang.String r0 = "gcm.n.color"
            java.lang.String r9 = defpackage.bhi.a(r6, r0)
            java.lang.String r0 = "gcm.n.sound2"
            java.lang.String r0 = defpackage.bhi.a(r6, r0)
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 == 0) goto L_0x01e3
            r0 = 0
            r3 = r0
        L_0x013f:
            java.lang.String r0 = "gcm.n.click_action"
            java.lang.String r4 = defpackage.bhi.a(r6, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x024d
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r4)
            android.content.Context r4 = r7.a
            java.lang.String r4 = r4.getPackageName()
            r0.setPackage(r4)
            r4 = 268435456(0x10000000, float:2.5243549E-29)
            r0.setFlags(r4)
            r4 = r0
        L_0x015f:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>(r6)
            b(r0)
            r4.putExtras(r0)
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r5 = r0.iterator()
        L_0x0172:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x030b
            java.lang.Object r0 = r5.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r10 = "gcm.n."
            boolean r10 = r0.startsWith(r10)
            if (r10 != 0) goto L_0x018e
            java.lang.String r10 = "gcm.notification."
            boolean r10 = r0.startsWith(r10)
            if (r10 == 0) goto L_0x0172
        L_0x018e:
            r4.removeExtra(r0)
            goto L_0x0172
        L_0x0192:
            r0 = 0
            goto L_0x00a4
        L_0x0195:
            r0 = 0
            goto L_0x00e1
        L_0x0198:
            r0 = 0
            goto L_0x00e1
        L_0x019b:
            java.lang.String r0 = "mipmap"
            android.content.Context r4 = r7.a
            java.lang.String r4 = r4.getPackageName()
            int r0 = r3.getIdentifier(r2, r0, r4)
            if (r0 == 0) goto L_0x01ab
            r2 = r0
            goto L_0x012b
        L_0x01ab:
            java.lang.String r0 = "GcmNotification"
            java.lang.String r3 = java.lang.String.valueOf(r2)
            int r3 = r3.length()
            int r3 = r3 + 57
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            java.lang.String r3 = "Icon resource "
            java.lang.StringBuilder r3 = r4.append(r3)
            java.lang.StringBuilder r2 = r3.append(r2)
            java.lang.String r3 = " not found. Notification will use app icon."
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.util.Log.w(r0, r2)
        L_0x01d3:
            android.content.Context r0 = r7.a
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()
            int r0 = r0.icon
            if (r0 != 0) goto L_0x01e0
            r0 = 17301651(0x1080093, float:2.4979667E-38)
        L_0x01e0:
            r2 = r0
            goto L_0x012b
        L_0x01e3:
            java.lang.String r3 = "default"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x0245
            android.content.Context r3 = r7.a
            android.content.res.Resources r3 = r3.getResources()
            java.lang.String r4 = "raw"
            android.content.Context r5 = r7.a
            java.lang.String r5 = r5.getPackageName()
            int r3 = r3.getIdentifier(r0, r4, r5)
            if (r3 == 0) goto L_0x0245
            java.lang.String r3 = "android.resource://"
            android.content.Context r4 = r7.a
            java.lang.String r4 = r4.getPackageName()
            java.lang.String r5 = java.lang.String.valueOf(r3)
            int r5 = r5.length()
            int r5 = r5 + 5
            java.lang.String r10 = java.lang.String.valueOf(r4)
            int r10 = r10.length()
            int r5 = r5 + r10
            java.lang.String r10 = java.lang.String.valueOf(r0)
            int r10 = r10.length()
            int r5 = r5 + r10
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r5)
            java.lang.StringBuilder r3 = r10.append(r3)
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = "/raw/"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r0 = r0.toString()
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r3 = r0
            goto L_0x013f
        L_0x0245:
            r0 = 2
            android.net.Uri r0 = android.media.RingtoneManager.getDefaultUri(r0)
            r3 = r0
            goto L_0x013f
        L_0x024d:
            android.content.Context r0 = r7.a
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            android.content.Context r4 = r7.a
            java.lang.String r4 = r4.getPackageName()
            android.content.Intent r0 = r0.getLaunchIntentForPackage(r4)
            if (r0 != 0) goto L_0x0491
            java.lang.String r0 = "GcmNotification"
            java.lang.String r4 = "No activity found to launch app"
            android.util.Log.w(r0, r4)
            r0 = 0
            r4 = r0
        L_0x0268:
            boolean r0 = defpackage.azb.i()
            if (r0 == 0) goto L_0x03b8
            android.content.Context r0 = r7.a
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()
            int r0 = r0.targetSdkVersion
            r5 = 25
            if (r0 <= r5) goto L_0x03b8
            java.lang.String r0 = "gcm.n.android_channel_id"
            java.lang.String r5 = defpackage.bhi.a(r6, r0)
            boolean r0 = defpackage.azb.i()
            if (r0 != 0) goto L_0x031c
            r0 = 0
        L_0x0287:
            android.app.Notification$Builder r5 = new android.app.Notification$Builder
            android.content.Context r10 = r7.a
            r5.<init>(r10)
            r10 = 1
            android.app.Notification$Builder r5 = r5.setAutoCancel(r10)
            android.app.Notification$Builder r2 = r5.setSmallIcon(r2)
            boolean r5 = android.text.TextUtils.isEmpty(r1)
            if (r5 != 0) goto L_0x02a0
            r2.setContentTitle(r1)
        L_0x02a0:
            boolean r1 = android.text.TextUtils.isEmpty(r8)
            if (r1 != 0) goto L_0x02b5
            r2.setContentText(r8)
            android.app.Notification$BigTextStyle r1 = new android.app.Notification$BigTextStyle
            r1.<init>()
            android.app.Notification$BigTextStyle r1 = r1.bigText(r8)
            r2.setStyle(r1)
        L_0x02b5:
            boolean r1 = android.text.TextUtils.isEmpty(r9)
            if (r1 != 0) goto L_0x02c2
            int r1 = android.graphics.Color.parseColor(r9)
            r2.setColor(r1)
        L_0x02c2:
            if (r3 == 0) goto L_0x02c7
            r2.setSound(r3)
        L_0x02c7:
            if (r4 == 0) goto L_0x02cc
            r2.setContentIntent(r4)
        L_0x02cc:
            if (r0 == 0) goto L_0x02d1
            r2.setChannelId(r0)
        L_0x02d1:
            android.app.Notification r0 = r2.build()
            r1 = r0
        L_0x02d6:
            java.lang.String r0 = "gcm.n.tag"
            java.lang.String r2 = defpackage.bhi.a(r6, r0)
            android.content.Context r0 = r7.a
            java.lang.String r3 = "notification"
            java.lang.Object r0 = r0.getSystemService(r3)
            android.app.NotificationManager r0 = (android.app.NotificationManager) r0
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 == 0) goto L_0x0305
            long r2 = android.os.SystemClock.uptimeMillis()
            r4 = 37
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            java.lang.String r4 = "GCM-Notification:"
            java.lang.StringBuilder r4 = r5.append(r4)
            java.lang.StringBuilder r2 = r4.append(r2)
            java.lang.String r2 = r2.toString()
        L_0x0305:
            r3 = 0
            r0.notify(r2, r3, r1)
            goto L_0x0025
        L_0x030b:
            android.content.Context r0 = r7.a
            java.util.concurrent.atomic.AtomicInteger r5 = r7.c
            int r5 = r5.getAndIncrement()
            r10 = 1073741824(0x40000000, float:2.0)
            android.app.PendingIntent r0 = android.app.PendingIntent.getActivity(r0, r5, r4, r10)
            r4 = r0
            goto L_0x0268
        L_0x031c:
            android.content.Context r0 = r7.a
            java.lang.Class<android.app.NotificationManager> r10 = android.app.NotificationManager.class
            java.lang.Object r0 = r0.getSystemService(r10)
            android.app.NotificationManager r0 = (android.app.NotificationManager) r0
            boolean r10 = android.text.TextUtils.isEmpty(r5)
            if (r10 != 0) goto L_0x035d
            android.app.NotificationChannel r10 = r0.getNotificationChannel(r5)
            if (r10 == 0) goto L_0x0335
            r0 = r5
            goto L_0x0287
        L_0x0335:
            java.lang.String r10 = "GcmNotification"
            java.lang.String r11 = java.lang.String.valueOf(r5)
            int r11 = r11.length()
            int r11 = r11 + 122
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>(r11)
            java.lang.String r11 = "Notification Channel requested ("
            java.lang.StringBuilder r11 = r12.append(r11)
            java.lang.StringBuilder r5 = r11.append(r5)
            java.lang.String r11 = ") has not been created by the app. Manifest configuration, or default, value will be used."
            java.lang.StringBuilder r5 = r5.append(r11)
            java.lang.String r5 = r5.toString()
            android.util.Log.w(r10, r5)
        L_0x035d:
            java.lang.String r5 = r7.b
            if (r5 == 0) goto L_0x0365
            java.lang.String r0 = r7.b
            goto L_0x0287
        L_0x0365:
            android.os.Bundle r5 = r7.a()
            java.lang.String r10 = "com.google.android.gms.gcm.default_notification_channel_id"
            java.lang.String r5 = r5.getString(r10)
            r7.b = r5
            java.lang.String r5 = r7.b
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x03b0
            java.lang.String r5 = r7.b
            android.app.NotificationChannel r5 = r0.getNotificationChannel(r5)
            if (r5 == 0) goto L_0x0385
            java.lang.String r0 = r7.b
            goto L_0x0287
        L_0x0385:
            java.lang.String r5 = "GcmNotification"
            java.lang.String r10 = "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used."
            android.util.Log.w(r5, r10)
        L_0x038c:
            java.lang.String r5 = "fcm_fallback_notification_channel"
            android.app.NotificationChannel r5 = r0.getNotificationChannel(r5)
            if (r5 != 0) goto L_0x03a8
            android.app.NotificationChannel r5 = new android.app.NotificationChannel
            java.lang.String r10 = "fcm_fallback_notification_channel"
            android.content.Context r11 = r7.a
            r12 = 2131951737(0x7f130079, float:1.9539897E38)
            java.lang.String r11 = r11.getString(r12)
            r12 = 3
            r5.<init>(r10, r11, r12)
            r0.createNotificationChannel(r5)
        L_0x03a8:
            java.lang.String r0 = "fcm_fallback_notification_channel"
            r7.b = r0
            java.lang.String r0 = r7.b
            goto L_0x0287
        L_0x03b0:
            java.lang.String r5 = "GcmNotification"
            java.lang.String r10 = "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used."
            android.util.Log.w(r5, r10)
            goto L_0x038c
        L_0x03b8:
            ni r0 = new ni
            android.content.Context r5 = r7.a
            r10 = 0
            r0.<init>(r5, r10)
            r5 = 16
            r0.b(r5)
            ni r0 = r0.a(r2)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x03d2
            r0.a(r1)
        L_0x03d2:
            boolean r1 = android.text.TextUtils.isEmpty(r8)
            if (r1 != 0) goto L_0x03db
            r0.b(r8)
        L_0x03db:
            boolean r1 = android.text.TextUtils.isEmpty(r9)
            if (r1 != 0) goto L_0x03e7
            int r1 = android.graphics.Color.parseColor(r9)
            r0.p = r1
        L_0x03e7:
            if (r3 == 0) goto L_0x03ec
            r0.a(r3)
        L_0x03ec:
            if (r4 == 0) goto L_0x03f0
            r0.f = r4
        L_0x03f0:
            android.app.Notification r0 = r0.b()
            r1 = r0
            goto L_0x02d6
        L_0x03f7:
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.util.Set r0 = r6.keySet()
            java.util.Iterator r2 = r0.iterator()
        L_0x0404:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0440
            java.lang.Object r0 = r2.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r3 = r6.getString(r0)
            java.lang.String r4 = "gcm.notification."
            boolean r4 = r0.startsWith(r4)
            if (r4 == 0) goto L_0x0424
            java.lang.String r4 = "gcm.notification."
            java.lang.String r5 = "gcm.n."
            java.lang.String r0 = r0.replace(r4, r5)
        L_0x0424:
            java.lang.String r4 = "gcm.n."
            boolean r4 = r0.startsWith(r4)
            if (r4 == 0) goto L_0x0404
            java.lang.String r4 = "gcm.n.e"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x043c
            r4 = 6
            java.lang.String r0 = r0.substring(r4)
            r1.putString(r0, r3)
        L_0x043c:
            r2.remove()
            goto L_0x0404
        L_0x0440:
            java.lang.String r0 = "sound2"
            java.lang.String r0 = r1.getString(r0)
            if (r0 == 0) goto L_0x0452
            java.lang.String r2 = "sound2"
            r1.remove(r2)
            java.lang.String r2 = "sound"
            r1.putString(r2, r0)
        L_0x0452:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x045d
            java.lang.String r0 = "notification"
            r6.putBundle(r0, r1)
        L_0x045d:
            java.lang.String r0 = "from"
            r6.getString(r0)
            java.lang.String r0 = "from"
            r6.remove(r0)
            b(r6)
            r13.a(r6)
            goto L_0x0025
        L_0x046f:
            java.lang.String r0 = "google.message_id"
            r14.getStringExtra(r0)
            goto L_0x0025
        L_0x0476:
            java.lang.String r0 = "google.message_id"
            java.lang.String r0 = r14.getStringExtra(r0)
            if (r0 != 0) goto L_0x0483
            java.lang.String r0 = "message_id"
            r14.getStringExtra(r0)
        L_0x0483:
            java.lang.String r0 = "error"
            r14.getStringExtra(r0)
            goto L_0x0025
        L_0x048a:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
            goto L_0x0053
        L_0x0491:
            r4 = r0
            goto L_0x015f
        L_0x0494:
            r1 = r0
            goto L_0x0104
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bhg.handleIntent(android.content.Intent):void");
    }

    private static void b(android.os.Bundle bundle) {
        java.util.Iterator it = bundle.keySet().iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (str != null && str.startsWith("google.c.")) {
                it.remove();
            }
        }
    }
}
