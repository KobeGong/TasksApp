package defpackage;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.ConditionVariable;
import android.os.Message;
import android.os.Messenger;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.iid.MessengerCompat;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.interfaces.RSAPrivateKey;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

/* renamed from: bhw  reason: default package */
/* compiled from: PG */
public final class bhw {
    private static String c = null;
    private static boolean d = false;
    private static int e = 0;
    private static BroadcastReceiver f = null;
    public Messenger a;
    public MessengerCompat b;
    private Context g;
    private Map h = new HashMap();
    private Messenger i;
    private PendingIntent j;
    private int k;
    private int l;
    private long m;

    public bhw(Context context) {
        this.g = context;
    }

    private static String a(Context context) {
        boolean z;
        boolean z2;
        if (c != null) {
            return c;
        }
        Process.myUid();
        PackageManager packageManager = context.getPackageManager();
        if (!azb.i()) {
            Iterator<ResolveInfo> it = packageManager.queryIntentServices(new Intent("com.google.android.c2dm.intent.REGISTER"), 0).iterator();
            while (true) {
                if (it.hasNext()) {
                    if (a(packageManager, it.next().serviceInfo.packageName, "com.google.android.c2dm.intent.REGISTER")) {
                        d = false;
                        z2 = true;
                        break;
                    }
                } else {
                    z2 = false;
                    break;
                }
            }
            if (z2) {
                return c;
            }
        }
        Iterator<ResolveInfo> it2 = packageManager.queryBroadcastReceivers(new Intent("com.google.iid.TOKEN_REQUEST"), 0).iterator();
        while (true) {
            if (it2.hasNext()) {
                if (a(packageManager, it2.next().activityInfo.packageName, "com.google.iid.TOKEN_REQUEST")) {
                    d = true;
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (z) {
            return c;
        }
        Log.w("InstanceID/Rpc", "Failed to resolve IID implementation package, falling back");
        if (a(packageManager, "com.google.android.gms")) {
            d = azb.i();
            return c;
        } else if (azb.h() || !a(packageManager, "com.google.android.gsf")) {
            Log.w("InstanceID/Rpc", "Google Play services is missing, unable to get tokens");
            return null;
        } else {
            d = false;
            return c;
        }
    }

    private static boolean a(PackageManager packageManager, String str, String str2) {
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", str) == 0) {
            return a(packageManager, str);
        }
        Log.w("InstanceID/Rpc", new StringBuilder(String.valueOf(str).length() + 56 + String.valueOf(str2).length()).append("Possible malicious package ").append(str).append(" declares ").append(str2).append(" without permission").toString());
        return false;
    }

    private static boolean a(PackageManager packageManager, String str) {
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 0);
            c = applicationInfo.packageName;
            int i2 = applicationInfo.uid;
            return true;
        } catch (PackageManager.NameNotFoundException e2) {
            return false;
        }
    }

    private static int b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(a(context), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e2) {
            return -1;
        }
    }

    private static String a(KeyPair keyPair, String... strArr) {
        try {
            byte[] bytes = TextUtils.join("\n", strArr).getBytes("UTF-8");
            try {
                PrivateKey privateKey = keyPair.getPrivate();
                Signature instance = Signature.getInstance(privateKey instanceof RSAPrivateKey ? "SHA256withRSA" : "SHA256withECDSA");
                instance.initSign(privateKey);
                instance.update(bytes);
                return bhu.a(instance.sign());
            } catch (GeneralSecurityException e2) {
                Log.e("InstanceID/Rpc", "Unable to sign registration request", e2);
                return null;
            }
        } catch (UnsupportedEncodingException e3) {
            Log.e("InstanceID/Rpc", "Unable to encode string", e3);
            return null;
        }
    }

    private final synchronized void b(Intent intent) {
        if (this.j == null) {
            Intent intent2 = new Intent();
            intent2.setPackage("com.google.example.invalidpackage");
            this.j = PendingIntent.getBroadcast(this.g, 0, intent2, 0);
        }
        intent.putExtra("app", this.j);
    }

    private final void a(Object obj) {
        synchronized (getClass()) {
            for (String str : this.h.keySet()) {
                Object obj2 = this.h.get(str);
                this.h.put(str, obj);
                a(obj2, obj);
            }
        }
    }

    private final void a(String str, Object obj) {
        synchronized (getClass()) {
            Object obj2 = this.h.get(str);
            this.h.put(str, obj);
            a(obj2, obj);
        }
    }

    private static void a(Object obj, Object obj2) {
        if (obj instanceof ConditionVariable) {
            ((ConditionVariable) obj).open();
        }
        if (obj instanceof Messenger) {
            Messenger messenger = (Messenger) obj;
            Message obtain = Message.obtain();
            obtain.obj = obj2;
            try {
                messenger.send(obtain);
            } catch (RemoteException e2) {
                String valueOf = String.valueOf(e2);
                Log.w("InstanceID/Rpc", new StringBuilder(String.valueOf(valueOf).length() + 24).append("Failed to send response ").append(valueOf).toString());
            }
        }
    }

    public final void a(Intent intent) {
        String str;
        String str2;
        String str3;
        if (intent != null) {
            String action = intent.getAction();
            if ("com.google.android.c2dm.intent.REGISTRATION".equals(action) || "com.google.android.gms.iid.InstanceID".equals(action)) {
                String stringExtra = intent.getStringExtra("registration_id");
                if (stringExtra == null) {
                    str = intent.getStringExtra("unregistered");
                } else {
                    str = stringExtra;
                }
                if (str == null) {
                    String stringExtra2 = intent.getStringExtra("error");
                    if (stringExtra2 == null) {
                        String valueOf = String.valueOf(intent.getExtras());
                        Log.w("InstanceID/Rpc", new StringBuilder(String.valueOf(valueOf).length() + 49).append("Unexpected response, no error or registration id ").append(valueOf).toString());
                        return;
                    }
                    if (stringExtra2.startsWith("|")) {
                        String[] split = stringExtra2.split("\\|");
                        if (!"ID".equals(split[1])) {
                            String valueOf2 = String.valueOf(stringExtra2);
                            Log.w("InstanceID/Rpc", valueOf2.length() != 0 ? "Unexpected structured response ".concat(valueOf2) : new String("Unexpected structured response "));
                        }
                        if (split.length > 2) {
                            str3 = split[2];
                            str2 = split[3];
                            if (str2.startsWith(":")) {
                                str2 = str2.substring(1);
                            }
                        } else {
                            str2 = "UNKNOWN";
                            str3 = null;
                        }
                        intent.putExtra("error", str2);
                    } else {
                        str2 = stringExtra2;
                        str3 = null;
                    }
                    if (str3 == null) {
                        a(str2);
                    } else {
                        a(str3, (Object) str2);
                    }
                    long longExtra = intent.getLongExtra("Retry-After", 0);
                    if (longExtra > 0) {
                        SystemClock.elapsedRealtime();
                        this.l = ((int) longExtra) * 1000;
                        this.m = SystemClock.elapsedRealtime() + ((long) this.l);
                        Log.w("InstanceID/Rpc", new StringBuilder(52).append("Explicit request from server to backoff: ").append(this.l).toString());
                    } else if (("SERVICE_NOT_AVAILABLE".equals(str2) || "AUTHENTICATION_FAILED".equals(str2)) && "com.google.android.gsf".equals(c)) {
                        this.k++;
                        if (this.k >= 3) {
                            if (this.k == 3) {
                                this.l = new Random().nextInt(1000) + 1000;
                            }
                            this.l <<= 1;
                            this.m = SystemClock.elapsedRealtime() + ((long) this.l);
                            Log.w("InstanceID/Rpc", new StringBuilder(String.valueOf(str2).length() + 31).append("Backoff due to ").append(str2).append(" for ").append(this.l).toString());
                        }
                    }
                } else {
                    SystemClock.elapsedRealtime();
                    this.m = 0;
                    this.k = 0;
                    this.l = 0;
                    String str4 = null;
                    if (str.startsWith("|")) {
                        String[] split2 = str.split("\\|");
                        if (!"ID".equals(split2[1])) {
                            String valueOf3 = String.valueOf(str);
                            Log.w("InstanceID/Rpc", valueOf3.length() != 0 ? "Unexpected structured response ".concat(valueOf3) : new String("Unexpected structured response "));
                        }
                        String str5 = split2[2];
                        if (split2.length > 4) {
                            if ("SYNC".equals(split2[3])) {
                                Context context = this.g;
                                Intent intent2 = new Intent("com.google.android.gms.iid.InstanceID");
                                intent2.putExtra("CMD", "SYNC");
                                intent2.setClassName(context, "com.google.android.gms.gcm.GcmReceiver");
                                context.sendBroadcast(intent2);
                            } else if ("RST".equals(split2[3])) {
                                Context context2 = this.g;
                                bhu.c(this.g);
                                bhv.a(context2, bhu.a);
                                intent.removeExtra("registration_id");
                                a(str5, (Object) intent);
                                return;
                            }
                        }
                        String str6 = split2[split2.length - 1];
                        if (str6.startsWith(":")) {
                            str6 = str6.substring(1);
                        }
                        intent.putExtra("registration_id", str6);
                        str4 = str5;
                    }
                    if (str4 == null) {
                        a((Object) intent);
                    } else {
                        a(str4, (Object) intent);
                    }
                }
            }
        }
    }

    private static synchronized String a() {
        String num;
        synchronized (bhw.class) {
            int i2 = e;
            e = i2 + 1;
            num = Integer.toString(i2);
        }
        return num;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x018e A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.content.Intent a(android.os.Bundle r11, java.security.KeyPair r12) {
        /*
        // Method dump skipped, instructions count: 589
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bhw.a(android.os.Bundle, java.security.KeyPair):android.content.Intent");
    }
}
