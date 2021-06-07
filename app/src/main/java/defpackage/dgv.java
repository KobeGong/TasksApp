package defpackage;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* renamed from: dgv  reason: default package */
/* compiled from: PG */
public class dgv implements dio {
    static int a(byte[] bArr, int i, dgw dgw) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return a(b, bArr, i2, dgw);
        }
        dgw.a = b;
        return i2;
    }

    static int a(int i, byte[] bArr, int i2, dgw dgw) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            dgw.a = i3 | (b << 7);
            return i4;
        }
        int i5 = ((b & Byte.MAX_VALUE) << 7) | i3;
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            dgw.a = (b2 << 14) | i5;
            return i6;
        }
        int i7 = ((b2 & Byte.MAX_VALUE) << 14) | i5;
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            dgw.a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = ((b3 & Byte.MAX_VALUE) << 21) | i7;
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            dgw.a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = ((b4 & Byte.MAX_VALUE) << 28) | i9;
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                dgw.a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    static int b(byte[] bArr, int i, dgw dgw) {
        int i2 = 7;
        int i3 = i + 1;
        long j = (long) bArr[i];
        if (j >= 0) {
            dgw.b = j;
        } else {
            int i4 = i3 + 1;
            byte b = bArr[i3];
            i3 = i4;
            long j2 = (j & 127) | (((long) (b & Byte.MAX_VALUE)) << 7);
            byte b2 = b;
            while (b2 < 0) {
                int i5 = i3 + 1;
                b2 = bArr[i3];
                int i6 = i2 + 7;
                j2 |= ((long) (b2 & Byte.MAX_VALUE)) << i6;
                i2 = i6;
                i3 = i5;
            }
            dgw.b = j2;
        }
        return i3;
    }

    static int a(byte[] bArr, int i) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
    }

    static long b(byte[] bArr, int i) {
        return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    static double c(byte[] bArr, int i) {
        return Double.longBitsToDouble(b(bArr, i));
    }

    static float d(byte[] bArr, int i) {
        return Float.intBitsToFloat(a(bArr, i));
    }

    static int c(byte[] bArr, int i, dgw dgw) {
        int a = a(bArr, i, dgw);
        int i2 = dgw.a;
        if (i2 == 0) {
            dgw.c = "";
            return a;
        }
        dgw.c = new String(bArr, a, i2, dim.a);
        return a + i2;
    }

    static int d(byte[] bArr, int i, dgw dgw) {
        int a = a(bArr, i, dgw);
        int i2 = dgw.a;
        if (i2 == 0) {
            dgw.c = "";
            return a;
        } else if (!dli.a(bArr, a, a + i2)) {
            throw dir.j();
        } else {
            dgw.c = new String(bArr, a, i2, dim.a);
            return a + i2;
        }
    }

    static int e(byte[] bArr, int i, dgw dgw) {
        int a = a(bArr, i, dgw);
        int i2 = dgw.a;
        if (i2 == 0) {
            dgw.c = dha.a;
            return a;
        }
        dgw.c = dha.a(bArr, a, i2);
        return a + i2;
    }

    static int a(int i, byte[] bArr, int i2, int i3, diq diq, dgw dgw) {
        dil dil = (dil) diq;
        int a = a(bArr, i2, dgw);
        dil.d(dgw.a);
        while (a < i3) {
            int a2 = a(bArr, a, dgw);
            if (i != dgw.a) {
                break;
            }
            a = a(bArr, a2, dgw);
            dil.d(dgw.a);
        }
        return a;
    }

    static int a(byte[] bArr, int i, diq diq, dgw dgw) {
        dil dil = (dil) diq;
        int a = a(bArr, i, dgw);
        int i2 = dgw.a + a;
        while (a < i2) {
            a = a(bArr, a, dgw);
            dil.d(dgw.a);
        }
        if (a == i2) {
            return a;
        }
        throw dir.a();
    }

    static int a(int i, byte[] bArr, int i2, int i3, dky dky, dgw dgw) {
        if ((i >>> 3) == 0) {
            throw dir.d();
        }
        switch (i & 7) {
            case 0:
                int b = b(bArr, i2, dgw);
                dky.a(i, Long.valueOf(dgw.b));
                return b;
            case 1:
                dky.a(i, Long.valueOf(b(bArr, i2)));
                return i2 + 8;
            case 2:
                int a = a(bArr, i2, dgw);
                int i4 = dgw.a;
                if (i4 == 0) {
                    dky.a(i, dha.a);
                } else {
                    dky.a(i, dha.a(bArr, a, i4));
                }
                return a + i4;
            case 3:
                dky dky2 = new dky();
                int i5 = (i & -8) | 4;
                int i6 = 0;
                int i7 = i2;
                while (i7 < i3) {
                    i7 = a(bArr, i7, dgw);
                    i6 = dgw.a;
                    if (i6 != i5) {
                        i7 = a(i6, bArr, i7, i3, dky2, dgw);
                    } else if (i7 <= i3 || i6 != i5) {
                        throw dir.i();
                    } else {
                        dky.a(i, dky2);
                        return i7;
                    }
                }
                if (i7 <= i3) {
                }
                throw dir.i();
            case 4:
            default:
                throw dir.d();
            case 5:
                dky.a(i, Integer.valueOf(a(bArr, i2)));
                return i2 + 4;
        }
    }

    static int a(int i, byte[] bArr, int i2, int i3, dgw dgw) {
        if ((i >>> 3) == 0) {
            throw dir.d();
        }
        switch (i & 7) {
            case 0:
                return b(bArr, i2, dgw);
            case 1:
                return i2 + 8;
            case 2:
                return a(bArr, i2, dgw) + dgw.a;
            case 3:
                int i4 = (i & -8) | 4;
                int i5 = 0;
                int i6 = i2;
                while (i6 < i3) {
                    i6 = a(bArr, i6, dgw);
                    i5 = dgw.a;
                    if (i5 != i4) {
                        i6 = a(i5, bArr, i6, i3, dgw);
                    } else if (i6 > i3 && i5 == i4) {
                        return i6;
                    } else {
                        throw dir.i();
                    }
                }
                if (i6 > i3) {
                }
                throw dir.i();
            case 4:
            default:
                throw dir.d();
            case 5:
                return i2 + 4;
        }
    }

    @Override // defpackage.dio
    public final /* synthetic */ din a(int i) {
        return dea.a(i);
    }

    static void a(djo djo, StringBuilder sb, int i) {
        boolean booleanValue;
        boolean z;
        String str;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        Method[] declaredMethods = djo.getClass().getDeclaredMethods();
        for (Method method : declaredMethods) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str2 : treeSet) {
            String replaceFirst = str2.replaceFirst("get", "");
            if (replaceFirst.endsWith("List") && !replaceFirst.endsWith("OrBuilderList") && !replaceFirst.equals("List")) {
                String valueOf = String.valueOf(replaceFirst.substring(0, 1).toLowerCase());
                String valueOf2 = String.valueOf(replaceFirst.substring(1, replaceFirst.length() - 4));
                String concat = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                Method method2 = (Method) hashMap.get(str2);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    a(sb, i, a(concat), dih.a(method2, djo, new Object[0]));
                }
            }
            if (replaceFirst.endsWith("Map") && !replaceFirst.equals("Map")) {
                String valueOf3 = String.valueOf(replaceFirst.substring(0, 1).toLowerCase());
                String valueOf4 = String.valueOf(replaceFirst.substring(1, replaceFirst.length() - 3));
                if (valueOf4.length() != 0) {
                    str = valueOf3.concat(valueOf4);
                } else {
                    str = new String(valueOf3);
                }
                Method method3 = (Method) hashMap.get(str2);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    a(sb, i, a(str), dih.a(method3, djo, new Object[0]));
                }
            }
            String valueOf5 = String.valueOf(replaceFirst);
            if (((Method) hashMap2.get(valueOf5.length() != 0 ? "set".concat(valueOf5) : new String("set"))) != null) {
                if (replaceFirst.endsWith("Bytes")) {
                    String valueOf6 = String.valueOf(replaceFirst.substring(0, replaceFirst.length() - 5));
                    if (hashMap.containsKey(valueOf6.length() != 0 ? "get".concat(valueOf6) : new String("get"))) {
                    }
                }
                String valueOf7 = String.valueOf(replaceFirst.substring(0, 1).toLowerCase());
                String valueOf8 = String.valueOf(replaceFirst.substring(1));
                String concat2 = valueOf8.length() != 0 ? valueOf7.concat(valueOf8) : new String(valueOf7);
                String valueOf9 = String.valueOf(replaceFirst);
                Method method4 = (Method) hashMap.get(valueOf9.length() != 0 ? "get".concat(valueOf9) : new String("get"));
                String valueOf10 = String.valueOf(replaceFirst);
                Method method5 = (Method) hashMap.get(valueOf10.length() != 0 ? "has".concat(valueOf10) : new String("has"));
                if (method4 != null) {
                    Object a = dih.a(method4, djo, new Object[0]);
                    if (method5 == null) {
                        if (a instanceof Boolean) {
                            z = !((Boolean) a).booleanValue();
                        } else if (a instanceof Integer) {
                            z = ((Integer) a).intValue() == 0;
                        } else if (a instanceof Float) {
                            z = ((Float) a).floatValue() == 0.0f;
                        } else if (a instanceof Double) {
                            z = ((Double) a).doubleValue() == 0.0d;
                        } else if (a instanceof String) {
                            z = a.equals("");
                        } else if (a instanceof dha) {
                            z = a.equals(dha.a);
                        } else if (a instanceof djo) {
                            z = a == ((djo) a).i();
                        } else {
                            z = a instanceof Enum ? ((Enum) a).ordinal() == 0 : false;
                        }
                        booleanValue = !z;
                    } else {
                        booleanValue = ((Boolean) dih.a(method5, djo, new Object[0])).booleanValue();
                    }
                    if (booleanValue) {
                        a(sb, i, a(concat2), a);
                    }
                }
            }
        }
        if (djo instanceof dij) {
            Iterator b = ((dij) djo).a.b();
            if (b.hasNext()) {
                ((Map.Entry) b.next()).getKey();
                throw new NoSuchMethodError();
            }
        }
        if (((dih) djo).s != null) {
            dky dky = ((dih) djo).s;
            for (int i2 = 0; i2 < dky.b; i2++) {
                a(sb, i, String.valueOf(dky.c[i2] >>> 3), dky.d[i2]);
            }
        }
    }

    private static void a(StringBuilder sb, int i, String str, Object obj) {
        int i2 = 0;
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                a(sb, i, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                a(sb, i, str, entry);
            }
        } else {
            sb.append('\n');
            for (int i3 = 0; i3 < i; i3++) {
                sb.append(' ');
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"").append(a(dha.a((String) obj))).append('\"');
            } else if (obj instanceof dha) {
                sb.append(": \"").append(a((dha) obj)).append('\"');
            } else if (obj instanceof dih) {
                sb.append(" {");
                a((dih) obj, sb, i + 2);
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry2 = (Map.Entry) obj;
                a(sb, i + 2, "key", entry2.getKey());
                a(sb, i + 2, "value", entry2.getValue());
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else {
                sb.append(": ").append(obj.toString());
            }
        }
    }

    private static String a(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    private static String a(dha dha) {
        dkv dkv = new dkv(dha);
        StringBuilder sb = new StringBuilder(dkv.a.a());
        for (int i = 0; i < dkv.a.a(); i++) {
            byte a = dkv.a.a(i);
            switch (a) {
                case 7:
                    sb.append("\\a");
                    break;
                case 8:
                    sb.append("\\b");
                    break;
                case 9:
                    sb.append("\\t");
                    break;
                case 10:
                    sb.append("\\n");
                    break;
                case 11:
                    sb.append("\\v");
                    break;
                case 12:
                    sb.append("\\f");
                    break;
                case 13:
                    sb.append("\\r");
                    break;
                case 34:
                    sb.append("\\\"");
                    break;
                case 39:
                    sb.append("\\'");
                    break;
                case 92:
                    sb.append("\\\\");
                    break;
                default:
                    if (a < 32 || a > 126) {
                        sb.append('\\');
                        sb.append((char) (((a >>> 6) & 3) + 48));
                        sb.append((char) (((a >>> 3) & 7) + 48));
                        sb.append((char) ((a & 7) + 48));
                        break;
                    } else {
                        sb.append((char) a);
                        break;
                    }
                    break;
            }
        }
        return sb.toString();
    }

    public static String a(dmf dmf) {
        if (dmf == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        try {
            a((String) null, dmf, new StringBuffer(), stringBuffer);
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
        if (obj instanceof dmf) {
            int length = stringBuffer.length();
            if (str != null) {
                stringBuffer2.append(stringBuffer).append(b(str)).append(" <\n");
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
        stringBuffer2.append(stringBuffer).append(b(str)).append(": ");
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

    private static String b(String str) {
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

    public static LinkedHashMap b(int i) {
        int i2;
        if (i < 3) {
            i2 = i + 1;
        } else if (i < 1073741824) {
            i2 = (int) ((((float) i) / 0.75f) + 1.0f);
        } else {
            i2 = Integer.MAX_VALUE;
        }
        return new LinkedHashMap(i2);
    }

    public static Object a(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException();
    }

    public static Object a(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }
}
