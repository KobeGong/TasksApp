package defpackage;

/* renamed from: px reason: default package */
/* compiled from: PG */
final class px implements java.util.Comparator {
    px() {
    }

    public final /* synthetic */ int compare(java.lang.Object obj, java.lang.Object obj2) {
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = (byte[]) obj2;
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i = 0; i < bArr.length; i++) {
            if (bArr[i] != bArr2[i]) {
                return bArr[i] - bArr2[i];
            }
        }
        return 0;
    }
}
