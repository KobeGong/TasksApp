package org.chromium.net;

import android.annotation.TargetApi;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.TrafficStats;
import android.net.wifi.WifiInfo;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.security.NetworkSecurityPolicy;
import android.telephony.TelephonyManager;
import java.io.FileDescriptor;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.net.InetAddress;
import java.net.URLConnection;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.List;
import org.chromium.base.annotations.CalledByNative;
import org.chromium.base.annotations.CalledByNativeUnchecked;

/* compiled from: PG */
public class AndroidNetworkLibrary {
    AndroidNetworkLibrary() {
    }

    @CalledByNative
    public static String getMimeTypeFromExtension(String str) {
        return URLConnection.guessContentTypeFromName("foo." + str);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 121
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:72)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:46)
        */
    @org.chromium.base.annotations.CalledByNative
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

    @CalledByNative
    public static AndroidCertVerifyResult verifyServerCertificates(byte[][] bArr, String str, String str2) {
        try {
            return X509Util.a(bArr, str, str2);
        } catch (KeyStoreException e) {
            return new AndroidCertVerifyResult(-1);
        } catch (NoSuchAlgorithmException e2) {
            return new AndroidCertVerifyResult(-1);
        } catch (IllegalArgumentException e3) {
            return new AndroidCertVerifyResult(-1);
        }
    }

    @CalledByNativeUnchecked
    public static void addTestRootCertificate(byte[] bArr) {
        X509Util.a();
        X509Certificate a = X509Util.a(bArr);
        synchronized (X509Util.b) {
            X509Util.a.setCertificateEntry("root_cert_" + Integer.toString(X509Util.a.size()), a);
            X509Util.b();
        }
    }

    @CalledByNativeUnchecked
    public static void clearTestRootCertificates() {
        X509Util.a();
        synchronized (X509Util.b) {
            try {
                X509Util.a.load(null);
                X509Util.b();
            } catch (IOException e) {
            }
        }
    }

    @CalledByNative
    private static String getNetworkCountryIso() {
        TelephonyManager telephonyManager = (TelephonyManager) ehw.a.getSystemService("phone");
        if (telephonyManager == null) {
            return "";
        }
        return telephonyManager.getNetworkCountryIso();
    }

    @CalledByNative
    private static String getNetworkOperator() {
        TelephonyManager telephonyManager = (TelephonyManager) ehw.a.getSystemService("phone");
        if (telephonyManager == null) {
            return "";
        }
        return telephonyManager.getNetworkOperator();
    }

    @CalledByNative
    private static String getSimOperator() {
        TelephonyManager telephonyManager = (TelephonyManager) ehw.a.getSystemService("phone");
        if (telephonyManager == null) {
            return "";
        }
        return telephonyManager.getSimOperator();
    }

    @CalledByNative
    private static boolean getIsRoaming() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) ehw.a.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return false;
        }
        return activeNetworkInfo.isRoaming();
    }

    @TargetApi(23)
    @CalledByNative
    private static boolean getIsCaptivePortal() {
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) ehw.a.getSystemService("connectivity");
        if (connectivityManager == null) {
            return false;
        }
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null) {
            return false;
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
        if (networkCapabilities == null || !networkCapabilities.hasCapability(17)) {
            return false;
        }
        return true;
    }

    @CalledByNative
    public static String getWifiSSID() {
        WifiInfo wifiInfo;
        String ssid;
        Intent registerReceiver = ehw.a.registerReceiver(null, new IntentFilter("android.net.wifi.STATE_CHANGE"));
        return (registerReceiver == null || (wifiInfo = (WifiInfo) registerReceiver.getParcelableExtra("wifiInfo")) == null || (ssid = wifiInfo.getSSID()) == null) ? "" : ssid;
    }

    @CalledByNative
    private static boolean isCleartextPermitted(String str) {
        try {
            if (Build.VERSION.SDK_INT < 24) {
                return ehl.a();
            }
            return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
        } catch (IllegalArgumentException e) {
            return ehl.a();
        }
    }

    @TargetApi(23)
    @CalledByNative
    private static byte[][] getDnsServers() {
        ConnectivityManager connectivityManager = (ConnectivityManager) ehw.a.getSystemService("connectivity");
        if (connectivityManager == null) {
            return (byte[][]) Array.newInstance(Byte.TYPE, 0, 0);
        }
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null) {
            return (byte[][]) Array.newInstance(Byte.TYPE, 0, 0);
        }
        LinkProperties linkProperties = connectivityManager.getLinkProperties(activeNetwork);
        if (linkProperties == null) {
            return (byte[][]) Array.newInstance(Byte.TYPE, 0, 0);
        }
        List<InetAddress> dnsServers = linkProperties.getDnsServers();
        byte[][] bArr = new byte[dnsServers.size()][];
        for (int i = 0; i < dnsServers.size(); i++) {
            bArr[i] = dnsServers.get(i).getAddress();
        }
        return bArr;
    }

    @CalledByNative
    private static void tagSocket(int i, int i2, int i3) {
        FileDescriptor fileDescriptor;
        ParcelFileDescriptor parcelFileDescriptor = null;
        int threadStatsTag = TrafficStats.getThreadStatsTag();
        if (i3 != threadStatsTag) {
            TrafficStats.setThreadStatsTag(i3);
        }
        if (i2 != -1) {
            try {
                eje.a.invoke(null, Integer.valueOf(i2));
            } catch (IllegalAccessException e) {
                throw new RuntimeException("TrafficStats.setThreadStatsUid failed", e);
            } catch (InvocationTargetException e2) {
                throw new RuntimeException("TrafficStats.setThreadStatsUid failed", e2);
            }
        }
        if (Build.VERSION.SDK_INT < 23) {
            fileDescriptor = ehm.a(i);
        } else {
            parcelFileDescriptor = ParcelFileDescriptor.adoptFd(i);
            fileDescriptor = parcelFileDescriptor.getFileDescriptor();
        }
        ehn ehn = new ehn(fileDescriptor);
        TrafficStats.tagSocket(ehn);
        ehn.close();
        if (parcelFileDescriptor != null) {
            parcelFileDescriptor.detachFd();
        }
        if (i3 != threadStatsTag) {
            TrafficStats.setThreadStatsTag(threadStatsTag);
        }
        if (i2 != -1) {
            try {
                eje.b.invoke(null, new Object[0]);
            } catch (IllegalAccessException e3) {
                throw new RuntimeException("TrafficStats.clearThreadStatsUid failed", e3);
            } catch (InvocationTargetException e4) {
                throw new RuntimeException("TrafficStats.clearThreadStatsUid failed", e4);
            }
        }
    }
}
