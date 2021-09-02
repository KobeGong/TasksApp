package org.chromium.net;

/* compiled from: PG */
public class AndroidNetworkLibrary {
    AndroidNetworkLibrary() {
    }

    @org.chromium.base.annotations.CalledByNative
    public static java.lang.String getMimeTypeFromExtension(java.lang.String str) {
        return java.net.URLConnection.guessContentTypeFromName("foo." + str);
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 121 */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
        if (r0.isUp() == false) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
        if (r0.isLoopback() != false) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0039, code lost:
        r0 = false;
     */
    @org.chromium.base.annotations.CalledByNative
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean haveOnlyLoopbackAddresses() {
        /*
            r1 = 0
            java.util.Enumeration r2 = java.net.NetworkInterface.getNetworkInterfaces()     // Catch:{ Exception -> 0x0009 }
            if (r2 != 0) goto L_0x0021
            r0 = r1
        L_0x0008:
            return r0
        L_0x0009:
            r0 = move-exception
            java.lang.String r2 = "AndroidNetworkLibrary"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "could not get network interfaces: "
            r3.<init>(r4)
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r2, r0)
            r0 = r1
            goto L_0x0008
        L_0x0020:
            r0 = move-exception
        L_0x0021:
            boolean r0 = r2.hasMoreElements()
            if (r0 == 0) goto L_0x003b
            java.lang.Object r0 = r2.nextElement()
            java.net.NetworkInterface r0 = (java.net.NetworkInterface) r0
            boolean r3 = r0.isUp()     // Catch:{ SocketException -> 0x0020 }
            if (r3 == 0) goto L_0x0021
            boolean r0 = r0.isLoopback()     // Catch:{ SocketException -> 0x0020 }
            if (r0 != 0) goto L_0x0021
            r0 = r1
            goto L_0x0008
        L_0x003b:
            r0 = 1
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.AndroidNetworkLibrary.haveOnlyLoopbackAddresses():boolean");
    }

    @org.chromium.base.annotations.CalledByNative
    public static org.chromium.net.AndroidCertVerifyResult verifyServerCertificates(byte[][] bArr, java.lang.String str, java.lang.String str2) {
        try {
            return org.chromium.net.X509Util.a(bArr, str, str2);
        } catch (java.security.KeyStoreException e) {
            return new org.chromium.net.AndroidCertVerifyResult(-1);
        } catch (java.security.NoSuchAlgorithmException e2) {
            return new org.chromium.net.AndroidCertVerifyResult(-1);
        } catch (java.lang.IllegalArgumentException e3) {
            return new org.chromium.net.AndroidCertVerifyResult(-1);
        }
    }

    @org.chromium.base.annotations.CalledByNativeUnchecked
    public static void addTestRootCertificate(byte[] bArr) {
        org.chromium.net.X509Util.a();
        java.security.cert.X509Certificate a = org.chromium.net.X509Util.a(bArr);
        synchronized (org.chromium.net.X509Util.b) {
            org.chromium.net.X509Util.a.setCertificateEntry("root_cert_" + java.lang.Integer.toString(org.chromium.net.X509Util.a.size()), a);
            org.chromium.net.X509Util.b();
        }
    }

    @org.chromium.base.annotations.CalledByNativeUnchecked
    public static void clearTestRootCertificates() {
        org.chromium.net.X509Util.a();
        synchronized (org.chromium.net.X509Util.b) {
            try {
                org.chromium.net.X509Util.a.load(null);
                org.chromium.net.X509Util.b();
            } catch (java.io.IOException e) {
            }
        }
    }

    @org.chromium.base.annotations.CalledByNative
    private static java.lang.String getNetworkCountryIso() {
        android.telephony.TelephonyManager telephonyManager = (android.telephony.TelephonyManager) defpackage.ehw.a.getSystemService("phone");
        if (telephonyManager == null) {
            return "";
        }
        return telephonyManager.getNetworkCountryIso();
    }

    @org.chromium.base.annotations.CalledByNative
    private static java.lang.String getNetworkOperator() {
        android.telephony.TelephonyManager telephonyManager = (android.telephony.TelephonyManager) defpackage.ehw.a.getSystemService("phone");
        if (telephonyManager == null) {
            return "";
        }
        return telephonyManager.getNetworkOperator();
    }

    @org.chromium.base.annotations.CalledByNative
    private static java.lang.String getSimOperator() {
        android.telephony.TelephonyManager telephonyManager = (android.telephony.TelephonyManager) defpackage.ehw.a.getSystemService("phone");
        if (telephonyManager == null) {
            return "";
        }
        return telephonyManager.getSimOperator();
    }

    @org.chromium.base.annotations.CalledByNative
    private static boolean getIsRoaming() {
        android.net.NetworkInfo activeNetworkInfo = ((android.net.ConnectivityManager) defpackage.ehw.a.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return false;
        }
        return activeNetworkInfo.isRoaming();
    }

    @android.annotation.TargetApi(23)
    @org.chromium.base.annotations.CalledByNative
    private static boolean getIsCaptivePortal() {
        if (android.os.Build.VERSION.SDK_INT < 23) {
            return false;
        }
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) defpackage.ehw.a.getSystemService("connectivity");
        if (connectivityManager == null) {
            return false;
        }
        android.net.Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null) {
            return false;
        }
        android.net.NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
        return networkCapabilities != null && networkCapabilities.hasCapability(17);
    }

    @org.chromium.base.annotations.CalledByNative
    public static java.lang.String getWifiSSID() {
        android.content.Intent registerReceiver = defpackage.ehw.a.registerReceiver(null, new android.content.IntentFilter("android.net.wifi.STATE_CHANGE"));
        if (registerReceiver != null) {
            android.net.wifi.WifiInfo wifiInfo = (android.net.wifi.WifiInfo) registerReceiver.getParcelableExtra("wifiInfo");
            if (wifiInfo != null) {
                java.lang.String ssid = wifiInfo.getSSID();
                if (ssid != null) {
                    return ssid;
                }
            }
        }
        return "";
    }

    @org.chromium.base.annotations.CalledByNative
    private static boolean isCleartextPermitted(java.lang.String str) {
        try {
            if (android.os.Build.VERSION.SDK_INT < 24) {
                return defpackage.ehl.a();
            }
            return android.security.NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
        } catch (java.lang.IllegalArgumentException e) {
            return defpackage.ehl.a();
        }
    }

    @android.annotation.TargetApi(23)
    @org.chromium.base.annotations.CalledByNative
    private static byte[][] getDnsServers() {
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) defpackage.ehw.a.getSystemService("connectivity");
        if (connectivityManager == null) {
            return (byte[][]) java.lang.reflect.Array.newInstance(java.lang.Byte.TYPE, new int[]{0, 0});
        }
        android.net.Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null) {
            return (byte[][]) java.lang.reflect.Array.newInstance(java.lang.Byte.TYPE, new int[]{0, 0});
        }
        android.net.LinkProperties linkProperties = connectivityManager.getLinkProperties(activeNetwork);
        if (linkProperties == null) {
            return (byte[][]) java.lang.reflect.Array.newInstance(java.lang.Byte.TYPE, new int[]{0, 0});
        }
        java.util.List dnsServers = linkProperties.getDnsServers();
        byte[][] bArr = new byte[dnsServers.size()][];
        for (int i = 0; i < dnsServers.size(); i++) {
            bArr[i] = ((java.net.InetAddress) dnsServers.get(i)).getAddress();
        }
        return bArr;
    }

    @org.chromium.base.annotations.CalledByNative
    private static void tagSocket(int i, int i2, int i3) {
        java.io.FileDescriptor fileDescriptor;
        android.os.ParcelFileDescriptor parcelFileDescriptor = null;
        int threadStatsTag = android.net.TrafficStats.getThreadStatsTag();
        if (i3 != threadStatsTag) {
            android.net.TrafficStats.setThreadStatsTag(i3);
        }
        if (i2 != -1) {
            try {
                defpackage.eje.a.invoke(null, new java.lang.Object[]{java.lang.Integer.valueOf(i2)});
            } catch (java.lang.IllegalAccessException e) {
                throw new java.lang.RuntimeException("TrafficStats.setThreadStatsUid failed", e);
            } catch (java.lang.reflect.InvocationTargetException e2) {
                throw new java.lang.RuntimeException("TrafficStats.setThreadStatsUid failed", e2);
            }
        }
        if (android.os.Build.VERSION.SDK_INT < 23) {
            fileDescriptor = defpackage.ehm.a(i);
        } else {
            parcelFileDescriptor = android.os.ParcelFileDescriptor.adoptFd(i);
            fileDescriptor = parcelFileDescriptor.getFileDescriptor();
        }
        defpackage.ehn ehn = new defpackage.ehn(fileDescriptor);
        android.net.TrafficStats.tagSocket(ehn);
        ehn.close();
        if (parcelFileDescriptor != null) {
            parcelFileDescriptor.detachFd();
        }
        if (i3 != threadStatsTag) {
            android.net.TrafficStats.setThreadStatsTag(threadStatsTag);
        }
        if (i2 != -1) {
            try {
                defpackage.eje.b.invoke(null, new java.lang.Object[0]);
            } catch (java.lang.IllegalAccessException e3) {
                throw new java.lang.RuntimeException("TrafficStats.clearThreadStatsUid failed", e3);
            } catch (java.lang.reflect.InvocationTargetException e4) {
                throw new java.lang.RuntimeException("TrafficStats.clearThreadStatsUid failed", e4);
            }
        }
    }
}
