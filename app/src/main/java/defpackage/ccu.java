package defpackage;

/* renamed from: ccu reason: default package */
/* compiled from: PG */
public final class ccu {
    public android.content.Context a;
    public defpackage.buc b;

    public final android.app.PendingIntent a(java.lang.String str, defpackage.bul bul, java.util.List list) {
        android.content.Intent a2 = a("com.google.android.libraries.notifications.NOTIFICATION_CLICKED", this.b.f().i(), bul, list, 13);
        return android.app.PendingIntent.getActivity(this.a, a(str, "com.google.android.libraries.notifications.NOTIFICATION_CLICKED"), a2, 134217728);
    }

    public final android.app.PendingIntent b(java.lang.String str, defpackage.bul bul, java.util.List list) {
        android.content.Intent a2 = a("com.google.android.libraries.notifications.NOTIFICATION_REMOVED", this.b.f().j(), bul, list, 12);
        return android.app.PendingIntent.getBroadcast(this.a, a(str, "com.google.android.libraries.notifications.NOTIFICATION_REMOVED"), a2, 134217728);
    }

    public final android.content.Intent a(java.lang.String str, java.lang.String str2, defpackage.bul bul, java.util.List list, int i) {
        android.content.Intent intent = new android.content.Intent("com.google.android.libraries.notifications.SYSTEM_TRAY_EVENT");
        intent.setClassName(this.a, str2);
        if (bul != null) {
            intent.putExtra("com.google.android.libraries.notifications.ACCOUNT_NAME", bul.b());
        }
        java.lang.String[] strArr = new java.lang.String[list.size()];
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 < list.size()) {
                strArr[i3] = ((defpackage.buv) list.get(i3)).a();
                i2 = i3 + 1;
            } else {
                intent.putExtra("com.google.android.libraries.notifications.ACTION_ID", str);
                intent.putExtra("com.google.android.libraries.notifications.THREAD_IDS", strArr);
                intent.putExtra("com.google.android.libraries.notifications.INTENT_EXTRA_THREAD_STATE_UPDATE_BITMASK", i);
                return intent;
            }
        }
    }

    public static int a(java.lang.String str, java.lang.String str2) {
        return new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 1 + java.lang.String.valueOf(str2).length()).append(str).append(":").append(str2).toString().hashCode();
    }
}
