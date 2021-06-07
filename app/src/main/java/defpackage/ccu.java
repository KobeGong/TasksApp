package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import java.util.List;

/* renamed from: ccu  reason: default package */
/* compiled from: PG */
public final class ccu {
    public Context a;
    public buc b;

    public final PendingIntent a(String str, bul bul, List list) {
        Intent a2 = a("com.google.android.libraries.notifications.NOTIFICATION_CLICKED", this.b.f().i(), bul, list, 13);
        return PendingIntent.getActivity(this.a, a(str, "com.google.android.libraries.notifications.NOTIFICATION_CLICKED"), a2, 134217728);
    }

    public final PendingIntent b(String str, bul bul, List list) {
        Intent a2 = a("com.google.android.libraries.notifications.NOTIFICATION_REMOVED", this.b.f().j(), bul, list, 12);
        return PendingIntent.getBroadcast(this.a, a(str, "com.google.android.libraries.notifications.NOTIFICATION_REMOVED"), a2, 134217728);
    }

    public final Intent a(String str, String str2, bul bul, List list, int i) {
        Intent intent = new Intent("com.google.android.libraries.notifications.SYSTEM_TRAY_EVENT");
        intent.setClassName(this.a, str2);
        if (bul != null) {
            intent.putExtra("com.google.android.libraries.notifications.ACCOUNT_NAME", bul.b());
        }
        String[] strArr = new String[list.size()];
        for (int i2 = 0; i2 < list.size(); i2++) {
            strArr[i2] = ((buv) list.get(i2)).a();
        }
        intent.putExtra("com.google.android.libraries.notifications.ACTION_ID", str);
        intent.putExtra("com.google.android.libraries.notifications.THREAD_IDS", strArr);
        intent.putExtra("com.google.android.libraries.notifications.INTENT_EXTRA_THREAD_STATE_UPDATE_BITMASK", i);
        return intent;
    }

    public static int a(String str, String str2) {
        return new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length()).append(str).append(":").append(str2).toString().hashCode();
    }
}
