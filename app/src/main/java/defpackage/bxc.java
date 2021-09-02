package defpackage;

/* renamed from: bxc reason: default package */
/* compiled from: PG */
public final class bxc {
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.bxf a(defpackage.bxd r8) {
        /*
            r3 = 0
            r1 = 0
            java.net.URL r0 = new java.net.URL     // Catch:{ Exception -> 0x00ff }
            java.lang.String r2 = r8.a()     // Catch:{ Exception -> 0x00ff }
            r0.<init>(r2)     // Catch:{ Exception -> 0x00ff }
            java.net.URLConnection r0 = r0.openConnection()     // Catch:{ Exception -> 0x00ff }
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{ Exception -> 0x00ff }
            r1 = 0
            r0.setInstanceFollowRedirects(r1)     // Catch:{ Exception -> 0x0043, all -> 0x00fa }
            java.util.Map r1 = r8.d()     // Catch:{ Exception -> 0x0043, all -> 0x00fa }
            if (r1 == 0) goto L_0x0057
            java.util.Map r1 = r8.d()     // Catch:{ Exception -> 0x0043, all -> 0x00fa }
            java.util.Set r1 = r1.entrySet()     // Catch:{ Exception -> 0x0043, all -> 0x00fa }
            java.util.Iterator r4 = r1.iterator()     // Catch:{ Exception -> 0x0043, all -> 0x00fa }
        L_0x0027:
            boolean r1 = r4.hasNext()     // Catch:{ Exception -> 0x0043, all -> 0x00fa }
            if (r1 == 0) goto L_0x0057
            java.lang.Object r1 = r4.next()     // Catch:{ Exception -> 0x0043, all -> 0x00fa }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ Exception -> 0x0043, all -> 0x00fa }
            java.lang.Object r2 = r1.getKey()     // Catch:{ Exception -> 0x0043, all -> 0x00fa }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x0043, all -> 0x00fa }
            java.lang.Object r1 = r1.getValue()     // Catch:{ Exception -> 0x0043, all -> 0x00fa }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x0043, all -> 0x00fa }
            r0.setRequestProperty(r2, r1)     // Catch:{ Exception -> 0x0043, all -> 0x00fa }
            goto L_0x0027
        L_0x0043:
            r1 = move-exception
            r7 = r1
            r1 = r0
            r0 = r7
        L_0x0047:
            bxg r2 = defpackage.bxf.h()     // Catch:{ all -> 0x00f3 }
            r2.c = r0     // Catch:{ all -> 0x00f3 }
            bxf r0 = r2.a()     // Catch:{ all -> 0x00f3 }
            if (r1 == 0) goto L_0x0056
            r1.disconnect()
        L_0x0056:
            return r0
        L_0x0057:
            byte[] r1 = r8.b()     // Catch:{ Exception -> 0x0043, all -> 0x00fa }
            if (r1 == 0) goto L_0x0081
            r1 = 1
            r0.setDoOutput(r1)     // Catch:{ Exception -> 0x0043, all -> 0x00fa }
            java.lang.String r1 = "POST"
            r0.setRequestMethod(r1)     // Catch:{ Exception -> 0x0043, all -> 0x00fa }
            java.lang.String r1 = "Content-Type"
            java.lang.String r2 = r8.c()     // Catch:{ Exception -> 0x0043, all -> 0x00fa }
            r0.setRequestProperty(r1, r2)     // Catch:{ Exception -> 0x0043, all -> 0x00fa }
            java.io.OutputStream r1 = r0.getOutputStream()     // Catch:{ Exception -> 0x0043, all -> 0x00fa }
            byte[] r2 = r8.b()     // Catch:{ Exception -> 0x0043, all -> 0x00fa }
            r1.write(r2)     // Catch:{ Exception -> 0x0043, all -> 0x00fa }
            java.io.OutputStream r1 = r0.getOutputStream()     // Catch:{ Exception -> 0x0043, all -> 0x00fa }
            r1.close()     // Catch:{ Exception -> 0x0043, all -> 0x00fa }
        L_0x0081:
            java.util.HashMap r4 = new java.util.HashMap     // Catch:{ Exception -> 0x0043, all -> 0x00fa }
            r4.<init>()     // Catch:{ Exception -> 0x0043, all -> 0x00fa }
            r2 = r3
        L_0x0087:
            java.lang.String r5 = r0.getHeaderFieldKey(r2)     // Catch:{ Exception -> 0x0043, all -> 0x00fa }
            java.lang.String r6 = r0.getHeaderField(r2)     // Catch:{ Exception -> 0x0043, all -> 0x00fa }
            if (r5 != 0) goto L_0x0093
            if (r6 == 0) goto L_0x00ac
        L_0x0093:
            if (r5 == 0) goto L_0x00a8
            java.lang.Object r1 = r4.get(r5)     // Catch:{ Exception -> 0x0043, all -> 0x00fa }
            java.util.List r1 = (java.util.List) r1     // Catch:{ Exception -> 0x0043, all -> 0x00fa }
            if (r1 != 0) goto L_0x00a5
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ Exception -> 0x0043, all -> 0x00fa }
            r1.<init>()     // Catch:{ Exception -> 0x0043, all -> 0x00fa }
            r4.put(r5, r1)     // Catch:{ Exception -> 0x0043, all -> 0x00fa }
        L_0x00a5:
            r1.add(r6)     // Catch:{ Exception -> 0x0043, all -> 0x00fa }
        L_0x00a8:
            int r1 = r2 + 1
            r2 = r1
            goto L_0x0087
        L_0x00ac:
            java.lang.String r1 = "Content-Encoding"
            java.lang.Object r1 = r4.get(r1)     // Catch:{ Exception -> 0x0043, all -> 0x00fa }
            java.util.List r1 = (java.util.List) r1     // Catch:{ Exception -> 0x0043, all -> 0x00fa }
            if (r1 == 0) goto L_0x00f1
            boolean r2 = r1.isEmpty()     // Catch:{ Exception -> 0x0043, all -> 0x00fa }
            if (r2 != 0) goto L_0x00f1
            r2 = 0
            java.lang.Object r1 = r1.get(r2)     // Catch:{ Exception -> 0x0043, all -> 0x00fa }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x0043, all -> 0x00fa }
            java.lang.String r2 = "gzip"
            boolean r1 = r1.equalsIgnoreCase(r2)     // Catch:{ Exception -> 0x0043, all -> 0x00fa }
        L_0x00c9:
            byte[] r1 = a(r0, r1)     // Catch:{ Exception -> 0x0043, all -> 0x00fa }
            bxg r2 = defpackage.bxf.h()     // Catch:{ Exception -> 0x0043, all -> 0x00fa }
            int r3 = r0.getResponseCode()     // Catch:{ Exception -> 0x0043, all -> 0x00fa }
            bxg r2 = r2.a(r3)     // Catch:{ Exception -> 0x0043, all -> 0x00fa }
            java.lang.String r3 = r0.getResponseMessage()     // Catch:{ Exception -> 0x0043, all -> 0x00fa }
            r2.a = r3     // Catch:{ Exception -> 0x0043, all -> 0x00fa }
            r2.b = r1     // Catch:{ Exception -> 0x0043, all -> 0x00fa }
            bxg r1 = r2.a(r4)     // Catch:{ Exception -> 0x0043, all -> 0x00fa }
            bxf r1 = r1.a()     // Catch:{ Exception -> 0x0043, all -> 0x00fa }
            if (r0 == 0) goto L_0x00ee
            r0.disconnect()
        L_0x00ee:
            r0 = r1
            goto L_0x0056
        L_0x00f1:
            r1 = r3
            goto L_0x00c9
        L_0x00f3:
            r0 = move-exception
        L_0x00f4:
            if (r1 == 0) goto L_0x00f9
            r1.disconnect()
        L_0x00f9:
            throw r0
        L_0x00fa:
            r1 = move-exception
            r7 = r1
            r1 = r0
            r0 = r7
            goto L_0x00f4
        L_0x00ff:
            r0 = move-exception
            goto L_0x0047
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bxc.a(bxd):bxf");
    }

    private static byte[] a(java.net.HttpURLConnection httpURLConnection, boolean z) {
        java.io.InputStream errorStream;
        if (z) {
            try {
                errorStream = new java.util.zip.GZIPInputStream(httpURLConnection.getInputStream());
            } catch (java.io.IOException e) {
                defpackage.bty.b("ChimeHttpApiImpl-URL", e, "Failed to get input stream", new java.lang.Object[0]);
                errorStream = httpURLConnection.getErrorStream();
            }
        } else {
            errorStream = httpURLConnection.getInputStream();
        }
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = errorStream.read(bArr);
                if (read < 0) {
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } finally {
            errorStream.close();
            byteArrayOutputStream.close();
        }
    }
}
