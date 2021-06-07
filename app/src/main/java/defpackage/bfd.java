package defpackage;

import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* access modifiers changed from: package-private */
/* renamed from: bfd  reason: default package */
/* compiled from: PG */
public abstract class bfd extends bdv {
    private int a;

    protected bfd(byte[] bArr) {
        String str;
        boolean z = false;
        if (bArr.length != 25) {
            int length = bArr.length;
            int length2 = bArr.length;
            if (bArr == null || bArr.length == 0 || length2 <= 0 || length2 > bArr.length) {
                str = null;
            } else {
                StringBuilder sb = new StringBuilder((((length2 + 16) - 1) / 16) * 57);
                int i = 0;
                int i2 = length2;
                int i3 = 0;
                while (i2 > 0) {
                    if (i3 == 0) {
                        if (length2 < 65536) {
                            sb.append(String.format("%04X:", Integer.valueOf(i)));
                        } else {
                            sb.append(String.format("%08X:", Integer.valueOf(i)));
                        }
                    } else if (i3 == 8) {
                        sb.append(" -");
                    }
                    sb.append(String.format(" %02X", Integer.valueOf(bArr[i] & 255)));
                    int i4 = i2 - 1;
                    int i5 = i3 + 1;
                    if (i5 == 16 || i4 == 0) {
                        sb.append('\n');
                        i5 = 0;
                    }
                    i++;
                    i3 = i5;
                    i2 = i4;
                }
                str = sb.toString();
            }
            Log.wtf("GoogleCertificates", new StringBuilder(String.valueOf(str).length() + 51).append("Cert hash data has incorrect length (").append(length).append("):\n").append(str).toString(), new Exception());
            bArr = Arrays.copyOfRange(bArr, 0, 25);
            azb.b(bArr.length == 25 ? true : z, new StringBuilder(55).append("cert hash data has incorrect length. length=").append(bArr.length).toString());
        }
        this.a = Arrays.hashCode(bArr);
    }

    /* access modifiers changed from: package-private */
    public abstract byte[] c();

    public int hashCode() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof bev)) {
            return false;
        }
        try {
            bev bev = (bev) obj;
            if (bev.b() != hashCode()) {
                return false;
            }
            bfl a2 = bev.a();
            if (a2 == null) {
                return false;
            }
            return Arrays.equals(c(), (byte[]) bfo.a(a2));
        } catch (RemoteException e) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            return false;
        }
    }

    @Override // defpackage.bev
    public final bfl a() {
        return bfo.a(c());
    }

    @Override // defpackage.bev
    public final int b() {
        return hashCode();
    }

    protected static byte[] a(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }
}
