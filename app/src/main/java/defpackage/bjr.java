package defpackage;

/* renamed from: bjr reason: default package */
/* compiled from: PG */
public class bjr implements defpackage.ayw {
    public final com.google.android.gms.common.api.Status b() {
        return null;
    }

    public static java.security.KeyPair a() {
        try {
            java.security.KeyPairGenerator instance = java.security.KeyPairGenerator.getInstance("RSA");
            instance.initialize(2048);
            return instance.generateKeyPair();
        } catch (java.security.NoSuchAlgorithmException e) {
            throw new java.lang.AssertionError(e);
        }
    }

    public static int a(android.os.Parcel parcel, int i) {
        if ((i & -65536) != -65536) {
            return (i >> 16) & 65535;
        }
        return parcel.readInt();
    }

    public static void b(android.os.Parcel parcel, int i) {
        parcel.setDataPosition(a(parcel, i) + parcel.dataPosition());
    }

    private static void d(android.os.Parcel parcel, int i, int i2) {
        int a = a(parcel, i);
        if (a != i2) {
            java.lang.String hexString = java.lang.Integer.toHexString(a);
            throw new defpackage.br(new java.lang.StringBuilder(java.lang.String.valueOf(hexString).length() + 46).append("Expected size ").append(i2).append(" got ").append(a).append(" (0x").append(hexString).append(")").toString(), parcel);
        }
    }

    public static void a(android.os.Parcel parcel, int i, int i2) {
        if (i != i2) {
            java.lang.String hexString = java.lang.Integer.toHexString(i);
            throw new defpackage.br(new java.lang.StringBuilder(java.lang.String.valueOf(hexString).length() + 46).append("Expected size ").append(i2).append(" got ").append(i).append(" (0x").append(hexString).append(")").toString(), parcel);
        }
    }

    public static int a(android.os.Parcel parcel) {
        int readInt = parcel.readInt();
        int a = a(parcel, readInt);
        int dataPosition = parcel.dataPosition();
        if ((65535 & readInt) != 20293) {
            java.lang.String str = "Expected object header. Got 0x";
            java.lang.String valueOf = java.lang.String.valueOf(java.lang.Integer.toHexString(readInt));
            throw new defpackage.br(valueOf.length() != 0 ? str.concat(valueOf) : new java.lang.String(str), parcel);
        }
        int i = dataPosition + a;
        if (i >= dataPosition && i <= parcel.dataSize()) {
            return i;
        }
        throw new defpackage.br("Size read is invalid start=" + dataPosition + " end=" + i, parcel);
    }

    public static boolean c(android.os.Parcel parcel, int i) {
        d(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static int d(android.os.Parcel parcel, int i) {
        d(parcel, i, 4);
        return parcel.readInt();
    }

    public static java.lang.Integer e(android.os.Parcel parcel, int i) {
        int a = a(parcel, i);
        if (a == 0) {
            return null;
        }
        a(parcel, a, 4);
        return java.lang.Integer.valueOf(parcel.readInt());
    }

    public static long f(android.os.Parcel parcel, int i) {
        d(parcel, i, 8);
        return parcel.readLong();
    }

    public static java.lang.Long g(android.os.Parcel parcel, int i) {
        int a = a(parcel, i);
        if (a == 0) {
            return null;
        }
        a(parcel, a, 8);
        return java.lang.Long.valueOf(parcel.readLong());
    }

    public static java.lang.String h(android.os.Parcel parcel, int i) {
        int a = a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        java.lang.String readString = parcel.readString();
        parcel.setDataPosition(a + dataPosition);
        return readString;
    }

    public static android.os.IBinder i(android.os.Parcel parcel, int i) {
        int a = a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        android.os.IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(a + dataPosition);
        return readStrongBinder;
    }

    public static android.os.Parcelable a(android.os.Parcel parcel, int i, android.os.Parcelable.Creator creator) {
        int a = a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        android.os.Parcelable parcelable = (android.os.Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(a + dataPosition);
        return parcelable;
    }

    public static android.os.Bundle j(android.os.Parcel parcel, int i) {
        int a = a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        android.os.Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(a + dataPosition);
        return readBundle;
    }

    public static byte[] k(android.os.Parcel parcel, int i) {
        int a = a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(a + dataPosition);
        return createByteArray;
    }

    public static byte[][] l(android.os.Parcel parcel, int i) {
        int a = a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        byte[][] bArr = new byte[readInt][];
        for (int i2 = 0; i2 < readInt; i2++) {
            bArr[i2] = parcel.createByteArray();
        }
        parcel.setDataPosition(dataPosition + a);
        return bArr;
    }

    public static int[] m(android.os.Parcel parcel, int i) {
        int a = a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(a + dataPosition);
        return createIntArray;
    }

    public static java.lang.String[] n(android.os.Parcel parcel, int i) {
        int a = a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        java.lang.String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(a + dataPosition);
        return createStringArray;
    }

    public static java.util.ArrayList o(android.os.Parcel parcel, int i) {
        int a = a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        java.util.ArrayList createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(a + dataPosition);
        return createStringArrayList;
    }

    public static java.lang.Object[] b(android.os.Parcel parcel, int i, android.os.Parcelable.Creator creator) {
        int a = a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        java.lang.Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(a + dataPosition);
        return createTypedArray;
    }

    public static java.util.ArrayList c(android.os.Parcel parcel, int i, android.os.Parcelable.Creator creator) {
        int a = a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        java.util.ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(a + dataPosition);
        return createTypedArrayList;
    }

    public static void p(android.os.Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            throw new defpackage.br("Overread allowed size end=" + i, parcel);
        }
    }

    public static void b(android.os.Parcel parcel, int i, int i2) {
        if (i2 >= 65535) {
            parcel.writeInt(-65536 | i);
            parcel.writeInt(i2);
            return;
        }
        parcel.writeInt((i2 << 16) | i);
    }

    public static int q(android.os.Parcel parcel, int i) {
        parcel.writeInt(-65536 | i);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void r(android.os.Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        int i2 = dataPosition - i;
        parcel.setDataPosition(i - 4);
        parcel.writeInt(i2);
        parcel.setDataPosition(dataPosition);
    }

    public static void a(android.os.Parcel parcel, int i, boolean z) {
        b(parcel, i, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    public static void c(android.os.Parcel parcel, int i, int i2) {
        b(parcel, i, 4);
        parcel.writeInt(i2);
    }

    public static void a(android.os.Parcel parcel, java.lang.Integer num) {
        if (num != null) {
            b(parcel, 3, 4);
            parcel.writeInt(num.intValue());
        }
    }

    public static void a(android.os.Parcel parcel, int i, long j) {
        b(parcel, i, 8);
        parcel.writeLong(j);
    }

    public static void a(android.os.Parcel parcel, int i, java.lang.Long l) {
        if (l != null) {
            b(parcel, i, 8);
            parcel.writeLong(l.longValue());
        }
    }

    public static void a(android.os.Parcel parcel, int i, java.lang.String str) {
        if (str != null) {
            int q = q(parcel, i);
            parcel.writeString(str);
            r(parcel, q);
        }
    }

    public static void a(android.os.Parcel parcel, int i, android.os.IBinder iBinder) {
        if (iBinder != null) {
            int q = q(parcel, i);
            parcel.writeStrongBinder(iBinder);
            r(parcel, q);
        }
    }

    public static void a(android.os.Parcel parcel, int i, android.os.Parcelable parcelable, int i2) {
        if (parcelable != null) {
            int q = q(parcel, i);
            parcelable.writeToParcel(parcel, i2);
            r(parcel, q);
        }
    }

    public static void a(android.os.Parcel parcel, int i, android.os.Bundle bundle) {
        if (bundle != null) {
            int q = q(parcel, i);
            parcel.writeBundle(bundle);
            r(parcel, q);
        }
    }

    public static void a(android.os.Parcel parcel, int i, byte[] bArr) {
        if (bArr != null) {
            int q = q(parcel, i);
            parcel.writeByteArray(bArr);
            r(parcel, q);
        }
    }

    public static void a(android.os.Parcel parcel, int i, byte[][] bArr) {
        if (bArr != null) {
            int q = q(parcel, i);
            parcel.writeInt(r2);
            for (byte[] writeByteArray : bArr) {
                parcel.writeByteArray(writeByteArray);
            }
            r(parcel, q);
        }
    }

    public static void a(android.os.Parcel parcel, int i, int[] iArr) {
        if (iArr != null) {
            int q = q(parcel, i);
            parcel.writeIntArray(iArr);
            r(parcel, q);
        }
    }

    public static void a(android.os.Parcel parcel, int i, java.lang.String[] strArr) {
        if (strArr != null) {
            int q = q(parcel, i);
            parcel.writeStringArray(strArr);
            r(parcel, q);
        }
    }

    public static void a(android.os.Parcel parcel, int i, java.util.List list) {
        if (list != null) {
            int q = q(parcel, i);
            parcel.writeStringList(list);
            r(parcel, q);
        }
    }

    public static void a(android.os.Parcel parcel, int i, android.os.Parcelable[] parcelableArr, int i2) {
        if (parcelableArr != null) {
            int q = q(parcel, i);
            parcel.writeInt(r3);
            for (android.os.Parcelable parcelable : parcelableArr) {
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    a(parcel, parcelable, i2);
                }
            }
            r(parcel, q);
        }
    }

    public static void b(android.os.Parcel parcel, int i, java.util.List list) {
        if (list != null) {
            int q = q(parcel, i);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                android.os.Parcelable parcelable = (android.os.Parcelable) list.get(i2);
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    a(parcel, parcelable, 0);
                }
            }
            r(parcel, q);
        }
    }

    private static void a(android.os.Parcel parcel, android.os.Parcelable parcelable, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }

    public static java.lang.Object a(java.util.concurrent.Callable callable) {
        android.os.StrictMode.ThreadPolicy threadPolicy = android.os.StrictMode.getThreadPolicy();
        try {
            android.os.StrictMode.setThreadPolicy(android.os.StrictMode.ThreadPolicy.LAX);
            return callable.call();
        } finally {
            android.os.StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static java.lang.String a(defpackage.blb blb) {
        if (blb == null) {
            return "";
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        try {
            a((java.lang.String) null, (java.lang.Object) blb, new java.lang.StringBuffer(), stringBuffer);
            return stringBuffer.toString();
        } catch (java.lang.IllegalAccessException e) {
            java.lang.String str = "Error printing proto: ";
            java.lang.String valueOf = java.lang.String.valueOf(e.getMessage());
            return valueOf.length() != 0 ? str.concat(valueOf) : new java.lang.String(str);
        } catch (java.lang.reflect.InvocationTargetException e2) {
            java.lang.String str2 = "Error printing proto: ";
            java.lang.String valueOf2 = java.lang.String.valueOf(e2.getMessage());
            return valueOf2.length() != 0 ? str2.concat(valueOf2) : new java.lang.String(str2);
        }
    }

    private static void a(java.lang.String str, java.lang.Object obj, java.lang.StringBuffer stringBuffer, java.lang.StringBuffer stringBuffer2) {
        java.lang.reflect.Field[] fields;
        if (obj == null) {
            return;
        }
        if (obj instanceof defpackage.blb) {
            int length = stringBuffer.length();
            if (str != null) {
                stringBuffer2.append(stringBuffer).append(a(str)).append(" <\n");
                stringBuffer.append("  ");
            }
            java.lang.Class cls = obj.getClass();
            for (java.lang.reflect.Field field : cls.getFields()) {
                int modifiers = field.getModifiers();
                java.lang.String name = field.getName();
                if (!"cachedSize".equals(name) && (modifiers & 1) == 1 && (modifiers & 8) != 8 && !name.startsWith("_") && !name.endsWith("_")) {
                    java.lang.Class type = field.getType();
                    java.lang.Object obj2 = field.get(obj);
                    if (!type.isArray() || type.getComponentType() == java.lang.Byte.TYPE) {
                        a(name, obj2, stringBuffer, stringBuffer2);
                    } else {
                        int length2 = obj2 == null ? 0 : java.lang.reflect.Array.getLength(obj2);
                        for (int i = 0; i < length2; i++) {
                            a(name, java.lang.reflect.Array.get(obj2, i), stringBuffer, stringBuffer2);
                        }
                    }
                }
            }
            for (java.lang.reflect.Method name2 : cls.getMethods()) {
                java.lang.String name3 = name2.getName();
                if (name3.startsWith("set")) {
                    java.lang.String substring = name3.substring(3);
                    java.lang.String str2 = "has";
                    try {
                        java.lang.String valueOf = java.lang.String.valueOf(substring);
                        if (((java.lang.Boolean) cls.getMethod(valueOf.length() != 0 ? str2.concat(valueOf) : new java.lang.String(str2), new java.lang.Class[0]).invoke(obj, new java.lang.Object[0])).booleanValue()) {
                            java.lang.String str3 = "get";
                            try {
                                java.lang.String valueOf2 = java.lang.String.valueOf(substring);
                                a(substring, cls.getMethod(valueOf2.length() != 0 ? str3.concat(valueOf2) : new java.lang.String(str3), new java.lang.Class[0]).invoke(obj, new java.lang.Object[0]), stringBuffer, stringBuffer2);
                            } catch (java.lang.NoSuchMethodException e) {
                            }
                        }
                    } catch (java.lang.NoSuchMethodException e2) {
                    }
                }
            }
            if (str != null) {
                stringBuffer.setLength(length);
                stringBuffer2.append(stringBuffer).append(">\n");
                return;
            }
            return;
        }
        stringBuffer2.append(stringBuffer).append(a(str)).append(": ");
        if (obj instanceof java.lang.String) {
            java.lang.String str4 = (java.lang.String) obj;
            if (!str4.startsWith("http") && str4.length() > 200) {
                str4 = java.lang.String.valueOf(str4.substring(0, 200)).concat("[...]");
            }
            int length3 = str4.length();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(length3);
            for (int i2 = 0; i2 < length3; i2++) {
                char charAt = str4.charAt(i2);
                if (charAt < ' ' || charAt > '~' || charAt == '\"' || charAt == '\'') {
                    sb.append(java.lang.String.format("\\u%04x", new java.lang.Object[]{java.lang.Integer.valueOf(charAt)}));
                } else {
                    sb.append(charAt);
                }
            }
            stringBuffer2.append("\"").append(sb.toString()).append("\"");
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (bArr == null) {
                stringBuffer2.append("\"\"");
            } else {
                stringBuffer2.append('\"');
                for (byte b : bArr) {
                    byte b2 = b & 255;
                    if (b2 == 92 || b2 == 34) {
                        stringBuffer2.append('\\').append((char) b2);
                    } else if (b2 < 32 || b2 >= Byte.MAX_VALUE) {
                        stringBuffer2.append(java.lang.String.format("\\%03o", new java.lang.Object[]{java.lang.Integer.valueOf(b2)}));
                    } else {
                        stringBuffer2.append((char) b2);
                    }
                }
                stringBuffer2.append('\"');
            }
        } else {
            stringBuffer2.append(obj);
        }
        stringBuffer2.append("\n");
    }

    private static java.lang.String a(java.lang.String str) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (i == 0) {
                stringBuffer.append(java.lang.Character.toLowerCase(charAt));
            } else if (java.lang.Character.isUpperCase(charAt)) {
                stringBuffer.append('_').append(java.lang.Character.toLowerCase(charAt));
            } else {
                stringBuffer.append(charAt);
            }
        }
        return stringBuffer.toString();
    }

    public static boolean a(java.lang.Object obj, java.lang.Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }
}
