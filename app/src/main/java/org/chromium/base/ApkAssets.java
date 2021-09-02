package org.chromium.base;

/* compiled from: PG */
public class ApkAssets {
    @org.chromium.base.annotations.CalledByNative
    public static long[] open(java.lang.String str) {
        long[] jArr;
        android.content.res.AssetFileDescriptor assetFileDescriptor = null;
        try {
            assetFileDescriptor = defpackage.ehw.a.getAssets().openNonAssetFd(str);
            jArr = new long[]{(long) assetFileDescriptor.getParcelFileDescriptor().detachFd(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength()};
            if (assetFileDescriptor != null) {
                try {
                    assetFileDescriptor.close();
                } catch (java.io.IOException e) {
                    android.util.Log.e("ApkAssets", "Unable to close AssetFileDescriptor", e);
                }
            }
        } catch (java.io.IOException e2) {
            if (!e2.getMessage().equals("") && !e2.getMessage().equals(str)) {
                android.util.Log.e("ApkAssets", "Error while loading asset " + str + ": " + e2);
            }
            jArr = new long[]{-1, -1, -1};
            // fill-array-data instruction
            jArr[0] = -1;
            jArr[1] = -1;
            jArr[2] = -1;
            if (assetFileDescriptor != null) {
                try {
                    assetFileDescriptor.close();
                } catch (java.io.IOException e3) {
                    android.util.Log.e("ApkAssets", "Unable to close AssetFileDescriptor", e3);
                }
            }
        } finally {
            if (assetFileDescriptor != null) {
                try {
                    assetFileDescriptor.close();
                } catch (java.io.IOException e4) {
                    android.util.Log.e("ApkAssets", "Unable to close AssetFileDescriptor", e4);
                }
            }
        }
        return jArr;
    }
}
