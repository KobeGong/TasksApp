package defpackage;

/* renamed from: bfd reason: default package */
/* compiled from: PG */
abstract class bfd extends defpackage.bdv {
    private int a;

    protected bfd(byte[] bArr) {
        java.lang.String str;
        boolean z = false;
        if (bArr.length != 25) {
            java.lang.String str2 = "GoogleCertificates";
            int length = bArr.length;
            int length2 = bArr.length;
            if (bArr == null || bArr.length == 0 || length2 <= 0 || length2 > bArr.length) {
                str = null;
            } else {
                java.lang.StringBuilder sb = new java.lang.StringBuilder((((length2 + 16) - 1) / 16) * 57);
                int i = 0;
                int i2 = length2;
                int i3 = 0;
                while (i2 > 0) {
                    if (i3 == 0) {
                        if (length2 < 65536) {
                            sb.append(java.lang.String.format("%04X:", new java.lang.Object[]{java.lang.Integer.valueOf(i)}));
                        } else {
                            sb.append(java.lang.String.format("%08X:", new java.lang.Object[]{java.lang.Integer.valueOf(i)}));
                        }
                    } else if (i3 == 8) {
                        sb.append(" -");
                    }
                    sb.append(java.lang.String.format(" %02X", new java.lang.Object[]{java.lang.Integer.valueOf(bArr[i] & 255)}));
                    int i4 = i2 - 1;
                    int i5 = i3 + 1;
                    if (i5 == 16 || i4 == 0) {
                        sb.append(10);
                        i5 = 0;
                    }
                    i++;
                    i3 = i5;
                    i2 = i4;
                }
                str = sb.toString();
            }
            android.util.Log.wtf(str2, new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 51).append("Cert hash data has incorrect length (").append(length).append("):\n").append(str).toString(), new java.lang.Exception());
            bArr = java.util.Arrays.copyOfRange(bArr, 0, 25);
            if (bArr.length == 25) {
                z = true;
            }
            defpackage.azb.b(z, (java.lang.Object) "cert hash data has incorrect length. length=" + bArr.length);
        }
        this.a = java.util.Arrays.hashCode(bArr);
    }

    /* access modifiers changed from: 0000 */
    public abstract byte[] c();

    public int hashCode() {
        return this.a;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == null || !(obj instanceof defpackage.bev)) {
            return false;
        }
        try {
            defpackage.bev bev = (defpackage.bev) obj;
            if (bev.b() != hashCode()) {
                return false;
            }
            defpackage.bfl a2 = bev.a();
            if (a2 == null) {
                return false;
            }
            return java.util.Arrays.equals(c(), (byte[]) defpackage.bfo.a(a2));
        } catch (android.os.RemoteException e) {
            android.util.Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            return false;
        }
    }

    public final defpackage.bfl a() {
        return defpackage.bfo.a((java.lang.Object) c());
    }

    public final int b() {
        return hashCode();
    }

    protected static byte[] a(java.lang.String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (java.io.UnsupportedEncodingException e) {
            throw new java.lang.AssertionError(e);
        }
    }
}
