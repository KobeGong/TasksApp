package defpackage;

/* renamed from: ap reason: default package */
/* compiled from: PG */
public final class ap {
    private static final byte[] a = {0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 5, 5, 5, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 3, 3, 3, 3, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 3, 3, 3, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 3, 3, 3, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 3, 3, 3, 3, 3, 3, 0, 3, 0, 3, 3, 0, 3, 0, 3, 3, 0, 0, 0, 0, 3, 0, 0, 0, 0, 3, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0};
    private static final byte[] b = {2, 3, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 6, 7, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8, 9};
    private static final int[] c = {0, -1, -16384, 2147419135, 2146435070, -65536, 4194303, -1048576, -242, 65537};

    private static boolean a(int i) {
        if (i < 0) {
            return false;
        }
        if (i <= 255) {
            if (a[i] == 5) {
                return true;
            }
            return false;
        } else if (8206 > i || i > 8233) {
            return false;
        } else {
            if (i <= 8207 || 8232 <= i) {
                return true;
            }
            return false;
        }
    }

    public static int a(java.lang.CharSequence charSequence, int i) {
        while (i < charSequence.length() && a((int) charSequence.charAt(i))) {
            i++;
        }
        return i;
    }

    public static java.lang.String a(java.lang.String str) {
        int i = 0;
        if (str.length() == 0) {
            return str;
        }
        if (!a((int) str.charAt(0)) && !a((int) str.charAt(str.length() - 1))) {
            return str;
        }
        int length = str.length();
        while (i < length && a((int) str.charAt(i))) {
            i++;
        }
        if (i < length) {
            while (a((int) str.charAt(length - 1))) {
                length--;
            }
        }
        return str.substring(i, length);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x001b A[LOOP:0: B:1:0x0002->B:11:0x001b, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x005a A[EDGE_INSN: B:34:0x005a->B:32:0x005a ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int b(java.lang.CharSequence r6, int r7) {
        /*
            r1 = 1
            r2 = 0
        L_0x0002:
            int r0 = r6.length()
            if (r7 >= r0) goto L_0x005a
            char r0 = r6.charAt(r7)
            if (r0 < 0) goto L_0x0058
            r3 = 255(0xff, float:3.57E-43)
            if (r0 > r3) goto L_0x0020
            byte[] r3 = a
            byte r0 = r3[r0]
            if (r0 == 0) goto L_0x001e
            r0 = r1
        L_0x0019:
            if (r0 != 0) goto L_0x005a
            int r7 = r7 + 1
            goto L_0x0002
        L_0x001e:
            r0 = r2
            goto L_0x0019
        L_0x0020:
            r3 = 8206(0x200e, float:1.1499E-41)
            if (r0 < r3) goto L_0x0058
            r3 = 12336(0x3030, float:1.7286E-41)
            if (r0 > r3) goto L_0x0040
            int[] r3 = c
            byte[] r4 = b
            int r5 = r0 + -8192
            int r5 = r5 >> 5
            byte r4 = r4[r5]
            r3 = r3[r4]
            r0 = r0 & 31
            int r0 = r3 >> r0
            r0 = r0 & 1
            if (r0 == 0) goto L_0x003e
            r0 = r1
            goto L_0x0019
        L_0x003e:
            r0 = r2
            goto L_0x0019
        L_0x0040:
            r3 = 64830(0xfd3e, float:9.0846E-41)
            if (r3 > r0) goto L_0x0058
            r3 = 65094(0xfe46, float:9.1216E-41)
            if (r0 > r3) goto L_0x0058
            r3 = 64831(0xfd3f, float:9.0848E-41)
            if (r0 <= r3) goto L_0x0054
            r3 = 65093(0xfe45, float:9.1215E-41)
            if (r3 > r0) goto L_0x0056
        L_0x0054:
            r0 = r1
            goto L_0x0019
        L_0x0056:
            r0 = r2
            goto L_0x0019
        L_0x0058:
            r0 = r2
            goto L_0x0019
        L_0x005a:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ap.b(java.lang.CharSequence, int):int");
    }
}
