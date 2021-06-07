package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.zip.GZIPInputStream;

/* renamed from: bxc  reason: default package */
/* compiled from: PG */
public final class bxc {
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.bxf a(defpackage.bxd r8) {
        /*
        // Method dump skipped, instructions count: 258
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bxc.a(bxd):bxf");
    }

    private static byte[] a(HttpURLConnection httpURLConnection, boolean z) {
        InputStream inputStream;
        if (z) {
            try {
                inputStream = new GZIPInputStream(httpURLConnection.getInputStream());
            } catch (IOException e) {
                bty.b("ChimeHttpApiImpl-URL", e, "Failed to get input stream", new Object[0]);
                inputStream = httpURLConnection.getErrorStream();
            }
        } else {
            inputStream = httpURLConnection.getInputStream();
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read >= 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } finally {
            inputStream.close();
            byteArrayOutputStream.close();
        }
    }
}
