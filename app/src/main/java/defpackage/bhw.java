package defpackage;

/* renamed from: bhw reason: default package */
/* compiled from: PG */
public final class bhw {
    private static java.lang.String c = null;
    private static boolean d = false;
    private static int e = 0;
    private static android.content.BroadcastReceiver f = null;
    public android.os.Messenger a;
    public com.google.android.gms.iid.MessengerCompat b;
    private android.content.Context g;
    private java.util.Map h = new java.util.HashMap();
    private android.os.Messenger i;
    private android.app.PendingIntent j;
    private int k;
    private int l;
    private long m;

    public bhw(android.content.Context context) {
        this.g = context;
    }

    private static java.lang.String a(android.content.Context context) {
        boolean z;
        boolean z2;
        if (c != null) {
            return c;
        }
        android.os.Process.myUid();
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        if (!defpackage.azb.i()) {
            java.util.Iterator it = packageManager.queryIntentServices(new android.content.Intent("com.google.android.c2dm.intent.REGISTER"), 0).iterator();
            while (true) {
                if (it.hasNext()) {
                    if (a(packageManager, ((android.content.pm.ResolveInfo) it.next()).serviceInfo.packageName, "com.google.android.c2dm.intent.REGISTER")) {
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
        java.util.Iterator it2 = packageManager.queryBroadcastReceivers(new android.content.Intent("com.google.iid.TOKEN_REQUEST"), 0).iterator();
        while (true) {
            if (it2.hasNext()) {
                if (a(packageManager, ((android.content.pm.ResolveInfo) it2.next()).activityInfo.packageName, "com.google.iid.TOKEN_REQUEST")) {
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
        android.util.Log.w("InstanceID/Rpc", "Failed to resolve IID implementation package, falling back");
        if (a(packageManager, "com.google.android.gms")) {
            d = defpackage.azb.i();
            return c;
        } else if (defpackage.azb.h() || !a(packageManager, "com.google.android.gsf")) {
            android.util.Log.w("InstanceID/Rpc", "Google Play services is missing, unable to get tokens");
            return null;
        } else {
            d = false;
            return c;
        }
    }

    private static boolean a(android.content.pm.PackageManager packageManager, java.lang.String str, java.lang.String str2) {
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", str) == 0) {
            return a(packageManager, str);
        }
        android.util.Log.w("InstanceID/Rpc", new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 56 + java.lang.String.valueOf(str2).length()).append("Possible malicious package ").append(str).append(" declares ").append(str2).append(" without permission").toString());
        return false;
    }

    private static boolean a(android.content.pm.PackageManager packageManager, java.lang.String str) {
        boolean z = false;
        try {
            android.content.pm.ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 0);
            c = applicationInfo.packageName;
            int i2 = applicationInfo.uid;
            return true;
        } catch (android.content.pm.PackageManager.NameNotFoundException e2) {
            return z;
        }
    }

    private static int b(android.content.Context context) {
        try {
            return context.getPackageManager().getPackageInfo(a(context), 0).versionCode;
        } catch (android.content.pm.PackageManager.NameNotFoundException e2) {
            return -1;
        }
    }

    private static java.lang.String a(java.security.KeyPair keyPair, java.lang.String... strArr) {
        try {
            byte[] bytes = android.text.TextUtils.join("\n", strArr).getBytes("UTF-8");
            try {
                java.security.PrivateKey privateKey = keyPair.getPrivate();
                java.security.Signature instance = java.security.Signature.getInstance(privateKey instanceof java.security.interfaces.RSAPrivateKey ? "SHA256withRSA" : "SHA256withECDSA");
                instance.initSign(privateKey);
                instance.update(bytes);
                return defpackage.bhu.a(instance.sign());
            } catch (java.security.GeneralSecurityException e2) {
                android.util.Log.e("InstanceID/Rpc", "Unable to sign registration request", e2);
                return null;
            }
        } catch (java.io.UnsupportedEncodingException e3) {
            android.util.Log.e("InstanceID/Rpc", "Unable to encode string", e3);
            return null;
        }
    }

    private final synchronized void b(android.content.Intent intent) {
        if (this.j == null) {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.setPackage("com.google.example.invalidpackage");
            this.j = android.app.PendingIntent.getBroadcast(this.g, 0, intent2, 0);
        }
        intent.putExtra("app", this.j);
    }

    private final void a(java.lang.Object obj) {
        synchronized (getClass()) {
            for (java.lang.String str : this.h.keySet()) {
                java.lang.Object obj2 = this.h.get(str);
                this.h.put(str, obj);
                a(obj2, obj);
            }
        }
    }

    private final void a(java.lang.String str, java.lang.Object obj) {
        synchronized (getClass()) {
            java.lang.Object obj2 = this.h.get(str);
            this.h.put(str, obj);
            a(obj2, obj);
        }
    }

    private static void a(java.lang.Object obj, java.lang.Object obj2) {
        if (obj instanceof android.os.ConditionVariable) {
            ((android.os.ConditionVariable) obj).open();
        }
        if (obj instanceof android.os.Messenger) {
            android.os.Messenger messenger = (android.os.Messenger) obj;
            android.os.Message obtain = android.os.Message.obtain();
            obtain.obj = obj2;
            try {
                messenger.send(obtain);
            } catch (android.os.RemoteException e2) {
                java.lang.String valueOf = java.lang.String.valueOf(e2);
                android.util.Log.w("InstanceID/Rpc", new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 24).append("Failed to send response ").append(valueOf).toString());
            }
        }
    }

    public final void a(android.content.Intent intent) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        if (intent != null) {
            java.lang.String action = intent.getAction();
            if ("com.google.android.c2dm.intent.REGISTRATION".equals(action) || "com.google.android.gms.iid.InstanceID".equals(action)) {
                java.lang.String stringExtra = intent.getStringExtra("registration_id");
                if (stringExtra == null) {
                    str = intent.getStringExtra("unregistered");
                } else {
                    str = stringExtra;
                }
                if (str == null) {
                    java.lang.String stringExtra2 = intent.getStringExtra("error");
                    if (stringExtra2 == null) {
                        java.lang.String valueOf = java.lang.String.valueOf(intent.getExtras());
                        android.util.Log.w("InstanceID/Rpc", new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 49).append("Unexpected response, no error or registration id ").append(valueOf).toString());
                        return;
                    }
                    if (stringExtra2.startsWith("|")) {
                        java.lang.String[] split = stringExtra2.split("\\|");
                        if (!"ID".equals(split[1])) {
                            java.lang.String str4 = "InstanceID/Rpc";
                            java.lang.String str5 = "Unexpected structured response ";
                            java.lang.String valueOf2 = java.lang.String.valueOf(stringExtra2);
                            android.util.Log.w(str4, valueOf2.length() != 0 ? str5.concat(valueOf2) : new java.lang.String(str5));
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
                        a((java.lang.Object) str2);
                    } else {
                        a(str3, (java.lang.Object) str2);
                    }
                    long longExtra = intent.getLongExtra("Retry-After", 0);
                    if (longExtra > 0) {
                        android.os.SystemClock.elapsedRealtime();
                        this.l = ((int) longExtra) * 1000;
                        this.m = android.os.SystemClock.elapsedRealtime() + ((long) this.l);
                        android.util.Log.w("InstanceID/Rpc", "Explicit request from server to backoff: " + this.l);
                    } else if (("SERVICE_NOT_AVAILABLE".equals(str2) || "AUTHENTICATION_FAILED".equals(str2)) && "com.google.android.gsf".equals(c)) {
                        this.k++;
                        if (this.k >= 3) {
                            if (this.k == 3) {
                                this.l = new java.util.Random().nextInt(1000) + 1000;
                            }
                            this.l <<= 1;
                            this.m = android.os.SystemClock.elapsedRealtime() + ((long) this.l);
                            android.util.Log.w("InstanceID/Rpc", new java.lang.StringBuilder(java.lang.String.valueOf(str2).length() + 31).append("Backoff due to ").append(str2).append(" for ").append(this.l).toString());
                        }
                    }
                } else {
                    android.os.SystemClock.elapsedRealtime();
                    this.m = 0;
                    this.k = 0;
                    this.l = 0;
                    java.lang.String str6 = null;
                    if (str.startsWith("|")) {
                        java.lang.String[] split2 = str.split("\\|");
                        if (!"ID".equals(split2[1])) {
                            java.lang.String str7 = "InstanceID/Rpc";
                            java.lang.String str8 = "Unexpected structured response ";
                            java.lang.String valueOf3 = java.lang.String.valueOf(str);
                            android.util.Log.w(str7, valueOf3.length() != 0 ? str8.concat(valueOf3) : new java.lang.String(str8));
                        }
                        java.lang.String str9 = split2[2];
                        if (split2.length > 4) {
                            if ("SYNC".equals(split2[3])) {
                                android.content.Context context = this.g;
                                android.content.Intent intent2 = new android.content.Intent("com.google.android.gms.iid.InstanceID");
                                intent2.putExtra("CMD", "SYNC");
                                intent2.setClassName(context, "com.google.android.gms.gcm.GcmReceiver");
                                context.sendBroadcast(intent2);
                            } else if ("RST".equals(split2[3])) {
                                android.content.Context context2 = this.g;
                                defpackage.bhu.c(this.g);
                                defpackage.bhv.a(context2, defpackage.bhu.a);
                                intent.removeExtra("registration_id");
                                a(str9, (java.lang.Object) intent);
                                return;
                            }
                        }
                        java.lang.String str10 = split2[split2.length - 1];
                        if (str10.startsWith(":")) {
                            str10 = str10.substring(1);
                        }
                        intent.putExtra("registration_id", str10);
                        str6 = str9;
                    }
                    if (str6 == null) {
                        a((java.lang.Object) intent);
                    } else {
                        a(str6, (java.lang.Object) intent);
                    }
                }
            }
        }
    }

    private static synchronized java.lang.String a() {
        java.lang.String num;
        synchronized (defpackage.bhw.class) {
            int i2 = e;
            e = i2 + 1;
            num = java.lang.Integer.toString(i2);
        }
        return num;
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x018e A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.content.Intent a(android.os.Bundle r11, java.security.KeyPair r12) {
        /*
            r10 = this;
            android.os.ConditionVariable r1 = new android.os.ConditionVariable
            r1.<init>()
            java.lang.String r2 = a()
            java.lang.Class r3 = r10.getClass()
            monitor-enter(r3)
            java.util.Map r0 = r10.h     // Catch:{ all -> 0x0057 }
            r0.put(r2, r1)     // Catch:{ all -> 0x0057 }
            monitor-exit(r3)     // Catch:{ all -> 0x0057 }
            long r4 = android.os.SystemClock.elapsedRealtime()
            long r6 = r10.m
            r8 = 0
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x005a
            long r6 = r10.m
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 > 0) goto L_0x005a
            java.lang.String r0 = "InstanceID/Rpc"
            long r2 = r10.m
            long r2 = r2 - r4
            int r1 = r10.l
            r4 = 78
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            java.lang.String r4 = "Backoff mode, next request attempt: "
            java.lang.StringBuilder r4 = r5.append(r4)
            java.lang.StringBuilder r2 = r4.append(r2)
            java.lang.String r3 = " interval: "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r1 = r1.toString()
            android.util.Log.w(r0, r1)
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "RETRY_LATER"
            r0.<init>(r1)
            throw r0
        L_0x0057:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0057 }
            throw r0
        L_0x005a:
            android.os.Messenger r0 = r10.i
            if (r0 != 0) goto L_0x0073
            android.content.Context r0 = r10.g
            a(r0)
            android.os.Messenger r0 = new android.os.Messenger
            bih r3 = new bih
            android.os.Looper r4 = android.os.Looper.getMainLooper()
            r3.<init>(r10, r4)
            r0.<init>(r3)
            r10.i = r0
        L_0x0073:
            java.lang.String r0 = c
            if (r0 != 0) goto L_0x007f
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "MISSING_INSTANCEID_SERVICE"
            r0.<init>(r1)
            throw r0
        L_0x007f:
            android.os.SystemClock.elapsedRealtime()
            android.content.Intent r3 = new android.content.Intent
            boolean r0 = d
            if (r0 == 0) goto L_0x019c
            java.lang.String r0 = "com.google.iid.TOKEN_REQUEST"
        L_0x008a:
            r3.<init>(r0)
            java.lang.String r0 = c
            r3.setPackage(r0)
            android.content.Context r0 = r10.g
            int r0 = b(r0)
            java.lang.String r4 = "gmsv"
            java.lang.String r0 = java.lang.Integer.toString(r0)
            r11.putString(r4, r0)
            java.lang.String r0 = "osv"
            int r4 = android.os.Build.VERSION.SDK_INT
            java.lang.String r4 = java.lang.Integer.toString(r4)
            r11.putString(r0, r4)
            java.lang.String r0 = "app_ver"
            android.content.Context r4 = r10.g
            int r4 = defpackage.bhu.a(r4)
            java.lang.String r4 = java.lang.Integer.toString(r4)
            r11.putString(r0, r4)
            java.lang.String r0 = "app_ver_name"
            android.content.Context r4 = r10.g
            java.lang.String r4 = defpackage.bhu.b(r4)
            r11.putString(r0, r4)
            java.lang.String r0 = "cliv"
            java.lang.String r4 = "iid-11910000"
            r11.putString(r0, r4)
            java.lang.String r0 = "appid"
            java.lang.String r4 = defpackage.bhu.a(r12)
            r11.putString(r0, r4)
            java.security.PublicKey r0 = r12.getPublic()
            byte[] r0 = r0.getEncoded()
            java.lang.String r0 = defpackage.bhu.a(r0)
            java.lang.String r4 = "pub2"
            r11.putString(r4, r0)
            java.lang.String r4 = "sig"
            r5 = 2
            java.lang.String[] r5 = new java.lang.String[r5]
            r6 = 0
            android.content.Context r7 = r10.g
            java.lang.String r7 = r7.getPackageName()
            r5[r6] = r7
            r6 = 1
            r5[r6] = r0
            java.lang.String r0 = a(r12, r5)
            r11.putString(r4, r0)
            r3.putExtras(r11)
            r10.b(r3)
            android.os.SystemClock.elapsedRealtime()
            java.lang.String r0 = "kid"
            java.lang.String r4 = java.lang.String.valueOf(r2)
            int r4 = r4.length()
            int r4 = r4 + 5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            java.lang.String r4 = "|ID|"
            java.lang.StringBuilder r4 = r5.append(r4)
            java.lang.StringBuilder r4 = r4.append(r2)
            java.lang.String r5 = "|"
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.putExtra(r0, r4)
            java.lang.String r0 = "X-kid"
            java.lang.String r4 = java.lang.String.valueOf(r2)
            int r4 = r4.length()
            int r4 = r4 + 5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            java.lang.String r4 = "|ID|"
            java.lang.StringBuilder r4 = r5.append(r4)
            java.lang.StringBuilder r4 = r4.append(r2)
            java.lang.String r5 = "|"
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.putExtra(r0, r4)
            java.lang.String r0 = "com.google.android.gsf"
            java.lang.String r4 = c
            boolean r0 = r0.equals(r4)
            java.lang.String r4 = "useGsf"
            java.lang.String r4 = r3.getStringExtra(r4)
            if (r4 == 0) goto L_0x016e
            java.lang.String r0 = "1"
            boolean r0 = r0.equals(r4)
        L_0x016e:
            android.os.Messenger r4 = r10.a
            if (r4 == 0) goto L_0x01a1
            java.lang.String r4 = "google.messenger"
            android.os.Messenger r5 = r10.i
            r3.putExtra(r4, r5)
            android.os.Message r4 = android.os.Message.obtain()
            r4.obj = r3
            android.os.Messenger r5 = r10.a     // Catch:{ RemoteException -> 0x01a0 }
            r5.send(r4)     // Catch:{ RemoteException -> 0x01a0 }
        L_0x0184:
            r4 = 30000(0x7530, double:1.4822E-319)
            r1.block(r4)
            java.lang.Class r1 = r10.getClass()
            monitor-enter(r1)
            java.util.Map r0 = r10.h     // Catch:{ all -> 0x021c }
            java.lang.Object r0 = r0.remove(r2)     // Catch:{ all -> 0x021c }
            boolean r2 = r0 instanceof android.content.Intent     // Catch:{ all -> 0x021c }
            if (r2 == 0) goto L_0x0210
            android.content.Intent r0 = (android.content.Intent) r0     // Catch:{ all -> 0x021c }
            monitor-exit(r1)     // Catch:{ all -> 0x021c }
            return r0
        L_0x019c:
            java.lang.String r0 = "com.google.android.c2dm.intent.REGISTER"
            goto L_0x008a
        L_0x01a0:
            r4 = move-exception
        L_0x01a1:
            if (r0 == 0) goto L_0x01d3
            monitor-enter(r10)
            android.content.BroadcastReceiver r0 = f     // Catch:{ all -> 0x01d0 }
            if (r0 != 0) goto L_0x01c9
            bii r0 = new bii     // Catch:{ all -> 0x01d0 }
            r0.<init>(r10)     // Catch:{ all -> 0x01d0 }
            f = r0     // Catch:{ all -> 0x01d0 }
            android.content.IntentFilter r0 = new android.content.IntentFilter     // Catch:{ all -> 0x01d0 }
            java.lang.String r4 = "com.google.android.c2dm.intent.REGISTRATION"
            r0.<init>(r4)     // Catch:{ all -> 0x01d0 }
            android.content.Context r4 = r10.g     // Catch:{ all -> 0x01d0 }
            java.lang.String r4 = r4.getPackageName()     // Catch:{ all -> 0x01d0 }
            r0.addCategory(r4)     // Catch:{ all -> 0x01d0 }
            android.content.Context r4 = r10.g     // Catch:{ all -> 0x01d0 }
            android.content.BroadcastReceiver r5 = f     // Catch:{ all -> 0x01d0 }
            java.lang.String r6 = "com.google.android.c2dm.permission.SEND"
            r7 = 0
            r4.registerReceiver(r5, r0, r6, r7)     // Catch:{ all -> 0x01d0 }
        L_0x01c9:
            monitor-exit(r10)     // Catch:{ all -> 0x01d0 }
            android.content.Context r0 = r10.g
            r0.sendBroadcast(r3)
            goto L_0x0184
        L_0x01d0:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x01d0 }
            throw r0
        L_0x01d3:
            java.lang.String r0 = "google.messenger"
            android.os.Messenger r4 = r10.i
            r3.putExtra(r0, r4)
            java.lang.String r0 = "messenger2"
            java.lang.String r4 = "1"
            r3.putExtra(r0, r4)
            com.google.android.gms.iid.MessengerCompat r0 = r10.b
            if (r0 == 0) goto L_0x01f8
            android.os.Message r0 = android.os.Message.obtain()
            r0.obj = r3
            com.google.android.gms.iid.MessengerCompat r4 = r10.b     // Catch:{ RemoteException -> 0x01f7 }
            android.os.Messenger r5 = r4.a     // Catch:{ RemoteException -> 0x01f7 }
            if (r5 == 0) goto L_0x0202
            android.os.Messenger r4 = r4.a     // Catch:{ RemoteException -> 0x01f7 }
            r4.send(r0)     // Catch:{ RemoteException -> 0x01f7 }
            goto L_0x0184
        L_0x01f7:
            r0 = move-exception
        L_0x01f8:
            boolean r0 = d
            if (r0 == 0) goto L_0x0209
            android.content.Context r0 = r10.g
            r0.sendBroadcast(r3)
            goto L_0x0184
        L_0x0202:
            bie r4 = r4.b     // Catch:{ RemoteException -> 0x01f7 }
            r4.a(r0)     // Catch:{ RemoteException -> 0x01f7 }
            goto L_0x0184
        L_0x0209:
            android.content.Context r0 = r10.g
            r0.startService(r3)
            goto L_0x0184
        L_0x0210:
            boolean r2 = r0 instanceof java.lang.String     // Catch:{ all -> 0x021c }
            if (r2 == 0) goto L_0x021f
            java.io.IOException r2 = new java.io.IOException     // Catch:{ all -> 0x021c }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x021c }
            r2.<init>(r0)     // Catch:{ all -> 0x021c }
            throw r2     // Catch:{ all -> 0x021c }
        L_0x021c:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x021c }
            throw r0
        L_0x021f:
            java.lang.String r2 = "InstanceID/Rpc"
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x021c }
            java.lang.String r3 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x021c }
            int r3 = r3.length()     // Catch:{ all -> 0x021c }
            int r3 = r3 + 12
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x021c }
            r4.<init>(r3)     // Catch:{ all -> 0x021c }
            java.lang.String r3 = "No response "
            java.lang.StringBuilder r3 = r4.append(r3)     // Catch:{ all -> 0x021c }
            java.lang.StringBuilder r0 = r3.append(r0)     // Catch:{ all -> 0x021c }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x021c }
            android.util.Log.w(r2, r0)     // Catch:{ all -> 0x021c }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x021c }
            java.lang.String r2 = "TIMEOUT"
            r0.<init>(r2)     // Catch:{ all -> 0x021c }
            throw r0     // Catch:{ all -> 0x021c }
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bhw.a(android.os.Bundle, java.security.KeyPair):android.content.Intent");
    }
}
