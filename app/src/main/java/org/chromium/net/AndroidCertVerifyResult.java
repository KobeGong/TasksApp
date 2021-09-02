package org.chromium.net;

/* compiled from: PG */
public class AndroidCertVerifyResult {
    private final int a;
    private final boolean b;
    private final java.util.List c;

    public AndroidCertVerifyResult(boolean z, java.util.List list) {
        this.a = 0;
        this.b = z;
        this.c = new java.util.ArrayList(list);
    }

    public AndroidCertVerifyResult(int i) {
        this.a = i;
        this.b = false;
        this.c = java.util.Collections.emptyList();
    }

    @org.chromium.base.annotations.CalledByNative
    public int getStatus() {
        return this.a;
    }

    @org.chromium.base.annotations.CalledByNative
    public boolean isIssuedByKnownRoot() {
        return this.b;
    }

    @org.chromium.base.annotations.CalledByNative
    public byte[][] getCertificateChainEncoded() {
        byte[][] bArr = new byte[this.c.size()][];
        int i = 0;
        while (i < this.c.size()) {
            try {
                bArr[i] = ((java.security.cert.X509Certificate) this.c.get(i)).getEncoded();
                i++;
            } catch (java.security.cert.CertificateEncodingException e) {
                return new byte[0][];
            }
        }
        return bArr;
    }
}
