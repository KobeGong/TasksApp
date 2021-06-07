package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.StrictMode;
import com.google.android.gms.common.api.Status;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: bjr  reason: default package */
/* compiled from: PG */
public class bjr implements ayw {
    @Override // defpackage.ayw
    public final Status b() {
        return null;
    }

    public static KeyPair a() {
        try {
            KeyPairGenerator instance = KeyPairGenerator.getInstance("RSA");
            instance.initialize(2048);
            return instance.generateKeyPair();
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    public static int a(Parcel parcel, int i) {
        if ((i & -65536) != -65536) {
            return (i >> 16) & 65535;
        }
        return parcel.readInt();
    }

    public static void b(Parcel parcel, int i) {
        parcel.setDataPosition(a(parcel, i) + parcel.dataPosition());
    }

    private static void d(Parcel parcel, int i, int i2) {
        int a = a(parcel, i);
        if (a != i2) {
            String hexString = Integer.toHexString(a);
            throw new br(new StringBuilder(String.valueOf(hexString).length() + 46).append("Expected size ").append(i2).append(" got ").append(a).append(" (0x").append(hexString).append(")").toString(), parcel);
        }
    }

    public static void a(Parcel parcel, int i, int i2) {
        if (i != i2) {
            String hexString = Integer.toHexString(i);
            throw new br(new StringBuilder(String.valueOf(hexString).length() + 46).append("Expected size ").append(i2).append(" got ").append(i).append(" (0x").append(hexString).append(")").toString(), parcel);
        }
    }

    public static int a(Parcel parcel) {
        int readInt = parcel.readInt();
        int a = a(parcel, readInt);
        int dataPosition = parcel.dataPosition();
        if ((65535 & readInt) != 20293) {
            String valueOf = String.valueOf(Integer.toHexString(readInt));
            throw new br(valueOf.length() != 0 ? "Expected object header. Got 0x".concat(valueOf) : new String("Expected object header. Got 0x"), parcel);
        }
        int i = dataPosition + a;
        if (i >= dataPosition && i <= parcel.dataSize()) {
            return i;
        }
        throw new br(new StringBuilder(54).append("Size read is invalid start=").append(dataPosition).append(" end=").append(i).toString(), parcel);
    }

    public static boolean c(Parcel parcel, int i) {
        d(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static int d(Parcel parcel, int i) {
        d(parcel, i, 4);
        return parcel.readInt();
    }

    public static Integer e(Parcel parcel, int i) {
        int a = a(parcel, i);
        if (a == 0) {
            return null;
        }
        a(parcel, a, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static long f(Parcel parcel, int i) {
        d(parcel, i, 8);
        return parcel.readLong();
    }

    public static Long g(Parcel parcel, int i) {
        int a = a(parcel, i);
        if (a == 0) {
            return null;
        }
        a(parcel, a, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static String h(Parcel parcel, int i) {
        int a = a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(a + dataPosition);
        return readString;
    }

    public static IBinder i(Parcel parcel, int i) {
        int a = a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(a + dataPosition);
        return readStrongBinder;
    }

    public static Parcelable a(Parcel parcel, int i, Parcelable.Creator creator) {
        int a = a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(a + dataPosition);
        return parcelable;
    }

    public static Bundle j(Parcel parcel, int i) {
        int a = a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(a + dataPosition);
        return readBundle;
    }

    public static byte[] k(Parcel parcel, int i) {
        int a = a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(a + dataPosition);
        return createByteArray;
    }

    public static byte[][] l(Parcel parcel, int i) {
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

    public static int[] m(Parcel parcel, int i) {
        int a = a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(a + dataPosition);
        return createIntArray;
    }

    public static String[] n(Parcel parcel, int i) {
        int a = a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(a + dataPosition);
        return createStringArray;
    }

    public static ArrayList o(Parcel parcel, int i) {
        int a = a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(a + dataPosition);
        return createStringArrayList;
    }

    public static Object[] b(Parcel parcel, int i, Parcelable.Creator creator) {
        int a = a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(a + dataPosition);
        return createTypedArray;
    }

    public static ArrayList c(Parcel parcel, int i, Parcelable.Creator creator) {
        int a = a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(a + dataPosition);
        return createTypedArrayList;
    }

    public static void p(Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            throw new br(new StringBuilder(37).append("Overread allowed size end=").append(i).toString(), parcel);
        }
    }

    public static void b(Parcel parcel, int i, int i2) {
        if (i2 >= 65535) {
            parcel.writeInt(-65536 | i);
            parcel.writeInt(i2);
            return;
        }
        parcel.writeInt((i2 << 16) | i);
    }

    public static int q(Parcel parcel, int i) {
        parcel.writeInt(-65536 | i);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void r(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(dataPosition - i);
        parcel.setDataPosition(dataPosition);
    }

    public static void a(Parcel parcel, int i, boolean z) {
        b(parcel, i, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    public static void c(Parcel parcel, int i, int i2) {
        b(parcel, i, 4);
        parcel.writeInt(i2);
    }

    public static void a(Parcel parcel, Integer num) {
        if (num != null) {
            b(parcel, 3, 4);
            parcel.writeInt(num.intValue());
        }
    }

    public static void a(Parcel parcel, int i, long j) {
        b(parcel, i, 8);
        parcel.writeLong(j);
    }

    public static void a(Parcel parcel, int i, Long l) {
        if (l != null) {
            b(parcel, i, 8);
            parcel.writeLong(l.longValue());
        }
    }

    public static void a(Parcel parcel, int i, String str) {
        if (str != null) {
            int q = q(parcel, i);
            parcel.writeString(str);
            r(parcel, q);
        }
    }

    public static void a(Parcel parcel, int i, IBinder iBinder) {
        if (iBinder != null) {
            int q = q(parcel, i);
            parcel.writeStrongBinder(iBinder);
            r(parcel, q);
        }
    }

    public static void a(Parcel parcel, int i, Parcelable parcelable, int i2) {
        if (parcelable != null) {
            int q = q(parcel, i);
            parcelable.writeToParcel(parcel, i2);
            r(parcel, q);
        }
    }

    public static void a(Parcel parcel, int i, Bundle bundle) {
        if (bundle != null) {
            int q = q(parcel, i);
            parcel.writeBundle(bundle);
            r(parcel, q);
        }
    }

    public static void a(Parcel parcel, int i, byte[] bArr) {
        if (bArr != null) {
            int q = q(parcel, i);
            parcel.writeByteArray(bArr);
            r(parcel, q);
        }
    }

    public static void a(Parcel parcel, int i, byte[][] bArr) {
        if (bArr != null) {
            int q = q(parcel, i);
            int length = bArr.length;
            parcel.writeInt(length);
            for (byte[] bArr2 : bArr) {
                parcel.writeByteArray(bArr2);
            }
            r(parcel, q);
        }
    }

    public static void a(Parcel parcel, int i, int[] iArr) {
        if (iArr != null) {
            int q = q(parcel, i);
            parcel.writeIntArray(iArr);
            r(parcel, q);
        }
    }

    public static void a(Parcel parcel, int i, String[] strArr) {
        if (strArr != null) {
            int q = q(parcel, i);
            parcel.writeStringArray(strArr);
            r(parcel, q);
        }
    }

    public static void a(Parcel parcel, int i, List list) {
        if (list != null) {
            int q = q(parcel, i);
            parcel.writeStringList(list);
            r(parcel, q);
        }
    }

    public static void a(Parcel parcel, int i, Parcelable[] parcelableArr, int i2) {
        if (parcelableArr != null) {
            int q = q(parcel, i);
            int length = parcelableArr.length;
            parcel.writeInt(length);
            for (Parcelable parcelable : parcelableArr) {
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    a(parcel, parcelable, i2);
                }
            }
            r(parcel, q);
        }
    }

    public static void b(Parcel parcel, int i, List list) {
        if (list != null) {
            int q = q(parcel, i);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                Parcelable parcelable = (Parcelable) list.get(i2);
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    a(parcel, parcelable, 0);
                }
            }
            r(parcel, q);
        }
    }

    private static void a(Parcel parcel, Parcelable parcelable, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }

    /* JADX INFO: finally extract failed */
    public static Object a(Callable callable) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
            Object call = callable.call();
            StrictMode.setThreadPolicy(threadPolicy);
            return call;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicy);
            throw th;
        }
    }

    public static String a(blb blb) {
        if (blb == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        try {
            a((String) null, blb, new StringBuffer(), stringBuffer);
            return stringBuffer.toString();
        } catch (IllegalAccessException e) {
            String valueOf = String.valueOf(e.getMessage());
            return valueOf.length() != 0 ? "Error printing proto: ".concat(valueOf) : new String("Error printing proto: ");
        } catch (InvocationTargetException e2) {
            String valueOf2 = String.valueOf(e2.getMessage());
            return valueOf2.length() != 0 ? "Error printing proto: ".concat(valueOf2) : new String("Error printing proto: ");
        }
    }

    private static void a(String str, Object obj, StringBuffer stringBuffer, StringBuffer stringBuffer2) {
        if (obj == null) {
            return;
        }
        if (obj instanceof blb) {
            int length = stringBuffer.length();
            if (str != null) {
                stringBuffer2.append(stringBuffer).append(a(str)).append(" <\n");
                stringBuffer.append("  ");
            }
            Class<?> cls = obj.getClass();
            Field[] fields = cls.getFields();
            for (Field field : fields) {
                int modifiers = field.getModifiers();
                String name = field.getName();
                if (!"cachedSize".equals(name) && (modifiers & 1) == 1 && (modifiers & 8) != 8 && !name.startsWith("_") && !name.endsWith("_")) {
                    Class<?> type = field.getType();
                    Object obj2 = field.get(obj);
                    if (!type.isArray() || type.getComponentType() == Byte.TYPE) {
                        a(name, obj2, stringBuffer, stringBuffer2);
                    } else {
                        int length2 = obj2 == null ? 0 : Array.getLength(obj2);
                        for (int i = 0; i < length2; i++) {
                            a(name, Array.get(obj2, i), stringBuffer, stringBuffer2);
                        }
                    }
                }
            }
            for (Method method : cls.getMethods()) {
                String name2 = method.getName();
                if (name2.startsWith("set")) {
                    String substring = name2.substring(3);
                    try {
                        String valueOf = String.valueOf(substring);
                        if (((Boolean) cls.getMethod(valueOf.length() != 0 ? "has".concat(valueOf) : new String("has"), new Class[0]).invoke(obj, new Object[0])).booleanValue()) {
                            try {
                                String valueOf2 = String.valueOf(substring);
                                a(substring, cls.getMethod(valueOf2.length() != 0 ? "get".concat(valueOf2) : new String("get"), new Class[0]).invoke(obj, new Object[0]), stringBuffer, stringBuffer2);
                            } catch (NoSuchMethodException e) {
                            }
                        }
                    } catch (NoSuchMethodException e2) {
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
        if (obj instanceof String) {
            String str2 = (String) obj;
            if (!str2.startsWith("http") && str2.length() > 200) {
                str2 = String.valueOf(str2.substring(0, 200)).concat("[...]");
            }
            int length3 = str2.length();
            StringBuilder sb = new StringBuilder(length3);
            for (int i2 = 0; i2 < length3; i2++) {
                char charAt = str2.charAt(i2);
                if (charAt < ' ' || charAt > '~' || charAt == '\"' || charAt == '\'') {
                    sb.append(String.format("\\u%04x", Integer.valueOf(charAt)));
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
                    int i3 = b & 255;
                    if (i3 == 92 || i3 == 34) {
                        stringBuffer2.append('\\').append((char) i3);
                    } else if (i3 < 32 || i3 >= 127) {
                        stringBuffer2.append(String.format("\\%03o", Integer.valueOf(i3)));
                    } else {
                        stringBuffer2.append((char) i3);
                    }
                }
                stringBuffer2.append('\"');
            }
        } else {
            stringBuffer2.append(obj);
        }
        stringBuffer2.append("\n");
    }

    private static String a(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (i == 0) {
                stringBuffer.append(Character.toLowerCase(charAt));
            } else if (Character.isUpperCase(charAt)) {
                stringBuffer.append('_').append(Character.toLowerCase(charAt));
            } else {
                stringBuffer.append(charAt);
            }
        }
        return stringBuffer.toString();
    }

    public static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }
}
