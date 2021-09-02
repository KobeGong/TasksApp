package defpackage;

/* renamed from: dpz reason: default package */
/* compiled from: PG */
final class dpz implements defpackage.dpa {
    private static final byte[] a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};

    dpz() {
    }

    private static boolean a(byte b) {
        return b < 32 || b >= 126 || b == 37;
    }

    private static java.lang.String b(byte[] bArr) {
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(bArr.length);
        int i = 0;
        while (i < bArr.length) {
            if (bArr[i] == 37 && i + 2 < bArr.length) {
                try {
                    allocate.put((byte) java.lang.Integer.parseInt(new java.lang.String(bArr, i + 1, 2, defpackage.crp.a), 16));
                    i += 3;
                } catch (java.lang.NumberFormatException e) {
                }
            }
            allocate.put(bArr[i]);
            i++;
        }
        return new java.lang.String(allocate.array(), 0, allocate.position(), defpackage.crp.b);
    }

    public final /* synthetic */ java.lang.Object a(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            if (b < 32 || b >= 126 || (b == 37 && i + 2 < bArr.length)) {
                return b(bArr);
            }
        }
        return new java.lang.String(bArr, 0);
    }

    public final /* synthetic */ byte[] a(java.lang.Object obj) {
        int i;
        byte[] bytes = ((java.lang.String) obj).getBytes(defpackage.crp.b);
        int i2 = 0;
        while (i < bytes.length) {
            if (a(bytes[i])) {
                byte[] bArr = new byte[(((bytes.length - i) * 3) + i)];
                if (i != 0) {
                    java.lang.System.arraycopy(bytes, 0, bArr, 0, i);
                }
                for (int i3 = i; i3 < bytes.length; i3++) {
                    byte b = bytes[i3];
                    if (a(b)) {
                        bArr[i] = 37;
                        bArr[i + 1] = a[(b >> 4) & 15];
                        bArr[i + 2] = a[b & 15];
                        i += 3;
                    } else {
                        int i4 = i + 1;
                        bArr[i] = b;
                        i = i4;
                    }
                }
                byte[] bArr2 = new byte[i];
                java.lang.System.arraycopy(bArr, 0, bArr2, 0, i);
                return bArr2;
            }
            i2 = i + 1;
        }
        return bytes;
    }
}
