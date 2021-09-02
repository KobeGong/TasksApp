package defpackage;

/* renamed from: dgv reason: default package */
/* compiled from: PG */
public class dgv implements defpackage.dio {
    static int a(byte[] bArr, int i, defpackage.dgw dgw) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return a((int) b, bArr, i2, dgw);
        }
        dgw.a = b;
        return i2;
    }

    static int a(int i, byte[] bArr, int i2, defpackage.dgw dgw) {
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

    static int b(byte[] bArr, int i, defpackage.dgw dgw) {
        int i2 = 7;
        int i3 = i + 1;
        long j = (long) bArr[i];
        if (j >= 0) {
            dgw.b = j;
        } else {
            long j2 = j & 127;
            int i4 = i3 + 1;
            byte b = bArr[i3];
            byte b2 = b;
            i3 = i4;
            long j3 = j2 | (((long) (b & Byte.MAX_VALUE)) << 7);
            byte b3 = b2;
            while (b3 < 0) {
                int i5 = i3 + 1;
                b3 = bArr[i3];
                int i6 = i2 + 7;
                j3 |= ((long) (b3 & Byte.MAX_VALUE)) << i6;
                i2 = i6;
                i3 = i5;
            }
            dgw.b = j3;
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
        return java.lang.Double.longBitsToDouble(b(bArr, i));
    }

    static float d(byte[] bArr, int i) {
        return java.lang.Float.intBitsToFloat(a(bArr, i));
    }

    static int c(byte[] bArr, int i, defpackage.dgw dgw) {
        int a = a(bArr, i, dgw);
        int i2 = dgw.a;
        if (i2 == 0) {
            dgw.c = "";
            return a;
        }
        dgw.c = new java.lang.String(bArr, a, i2, defpackage.dim.a);
        return a + i2;
    }

    static int d(byte[] bArr, int i, defpackage.dgw dgw) {
        int a = a(bArr, i, dgw);
        int i2 = dgw.a;
        if (i2 == 0) {
            dgw.c = "";
            return a;
        } else if (!defpackage.dli.a(bArr, a, a + i2)) {
            throw defpackage.dir.j();
        } else {
            dgw.c = new java.lang.String(bArr, a, i2, defpackage.dim.a);
            return a + i2;
        }
    }

    static int e(byte[] bArr, int i, defpackage.dgw dgw) {
        int a = a(bArr, i, dgw);
        int i2 = dgw.a;
        if (i2 == 0) {
            dgw.c = defpackage.dha.a;
            return a;
        }
        dgw.c = defpackage.dha.a(bArr, a, i2);
        return a + i2;
    }

    static int a(int i, byte[] bArr, int i2, int i3, defpackage.diq diq, defpackage.dgw dgw) {
        defpackage.dil dil = (defpackage.dil) diq;
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

    static int a(byte[] bArr, int i, defpackage.diq diq, defpackage.dgw dgw) {
        defpackage.dil dil = (defpackage.dil) diq;
        int a = a(bArr, i, dgw);
        int i2 = dgw.a + a;
        while (a < i2) {
            a = a(bArr, a, dgw);
            dil.d(dgw.a);
        }
        if (a == i2) {
            return a;
        }
        throw defpackage.dir.a();
    }

    static int a(int i, byte[] bArr, int i2, int i3, defpackage.dky dky, defpackage.dgw dgw) {
        int i4;
        if ((i >>> 3) == 0) {
            throw defpackage.dir.d();
        }
        switch (i & 7) {
            case 0:
                int b = b(bArr, i2, dgw);
                dky.a(i, (java.lang.Object) java.lang.Long.valueOf(dgw.b));
                return b;
            case 1:
                dky.a(i, (java.lang.Object) java.lang.Long.valueOf(b(bArr, i2)));
                return i2 + 8;
            case 2:
                int a = a(bArr, i2, dgw);
                int i5 = dgw.a;
                if (i5 == 0) {
                    dky.a(i, (java.lang.Object) defpackage.dha.a);
                } else {
                    dky.a(i, (java.lang.Object) defpackage.dha.a(bArr, a, i5));
                }
                return a + i5;
            case 3:
                defpackage.dky dky2 = new defpackage.dky();
                int i6 = (i & -8) | 4;
                int i7 = 0;
                int i8 = i2;
                while (i8 < i3) {
                    i8 = a(bArr, i8, dgw);
                    i7 = dgw.a;
                    if (i7 != i6) {
                        i8 = a(i7, bArr, i8, i3, dky2, dgw);
                    } else {
                        int i9 = i7;
                        i4 = i8;
                        if (i4 <= i3 || i9 != i6) {
                            throw defpackage.dir.i();
                        }
                        dky.a(i, (java.lang.Object) dky2);
                        return i4;
                    }
                }
                int i92 = i7;
                i4 = i8;
                if (i4 <= i3) {
                }
                throw defpackage.dir.i();
            case 5:
                dky.a(i, (java.lang.Object) java.lang.Integer.valueOf(a(bArr, i2)));
                return i2 + 4;
            default:
                throw defpackage.dir.d();
        }
    }

    static int a(int i, byte[] bArr, int i2, int i3, defpackage.dgw dgw) {
        int i4;
        if ((i >>> 3) == 0) {
            throw defpackage.dir.d();
        }
        switch (i & 7) {
            case 0:
                return b(bArr, i2, dgw);
            case 1:
                return i2 + 8;
            case 2:
                return a(bArr, i2, dgw) + dgw.a;
            case 3:
                int i5 = (i & -8) | 4;
                int i6 = 0;
                int i7 = i2;
                while (i7 < i3) {
                    i7 = a(bArr, i7, dgw);
                    i6 = dgw.a;
                    if (i6 != i5) {
                        i7 = a(i6, bArr, i7, i3, dgw);
                    } else {
                        int i8 = i6;
                        i4 = i7;
                        int i9 = i8;
                        if (i4 > i3 && i9 == i5) {
                            return i4;
                        }
                        throw defpackage.dir.i();
                    }
                }
                int i82 = i6;
                i4 = i7;
                int i92 = i82;
                if (i4 > i3) {
                }
                throw defpackage.dir.i();
            case 5:
                return i2 + 4;
            default:
                throw defpackage.dir.d();
        }
    }

    public final /* synthetic */ defpackage.din a(int i) {
        return defpackage.dea.a(i);
    }

    static void a(defpackage.djo djo, java.lang.StringBuilder sb, int i) {
        java.lang.reflect.Method[] declaredMethods;
        boolean booleanValue;
        java.lang.String str;
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.HashMap hashMap2 = new java.util.HashMap();
        java.util.TreeSet<java.lang.String> treeSet = new java.util.TreeSet<>();
        for (java.lang.reflect.Method method : djo.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (java.lang.String str2 : treeSet) {
            java.lang.String replaceFirst = str2.replaceFirst("get", "");
            if (replaceFirst.endsWith("List") && !replaceFirst.endsWith("OrBuilderList") && !replaceFirst.equals("List")) {
                java.lang.String valueOf = java.lang.String.valueOf(replaceFirst.substring(0, 1).toLowerCase());
                java.lang.String valueOf2 = java.lang.String.valueOf(replaceFirst.substring(1, replaceFirst.length() - 4));
                java.lang.String str3 = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new java.lang.String(valueOf);
                java.lang.reflect.Method method2 = (java.lang.reflect.Method) hashMap.get(str2);
                if (method2 != null && method2.getReturnType().equals(java.util.List.class)) {
                    a(sb, i, a(str3), defpackage.dih.a(method2, (java.lang.Object) djo, new java.lang.Object[0]));
                }
            }
            if (replaceFirst.endsWith("Map") && !replaceFirst.equals("Map")) {
                java.lang.String valueOf3 = java.lang.String.valueOf(replaceFirst.substring(0, 1).toLowerCase());
                java.lang.String valueOf4 = java.lang.String.valueOf(replaceFirst.substring(1, replaceFirst.length() - 3));
                if (valueOf4.length() != 0) {
                    str = valueOf3.concat(valueOf4);
                } else {
                    str = new java.lang.String(valueOf3);
                }
                java.lang.reflect.Method method3 = (java.lang.reflect.Method) hashMap.get(str2);
                if (method3 != null && method3.getReturnType().equals(java.util.Map.class) && !method3.isAnnotationPresent(java.lang.Deprecated.class) && java.lang.reflect.Modifier.isPublic(method3.getModifiers())) {
                    a(sb, i, a(str), defpackage.dih.a(method3, (java.lang.Object) djo, new java.lang.Object[0]));
                }
            }
            java.lang.String str4 = "set";
            java.lang.String valueOf5 = java.lang.String.valueOf(replaceFirst);
            if (((java.lang.reflect.Method) hashMap2.get(valueOf5.length() != 0 ? str4.concat(valueOf5) : new java.lang.String(str4))) != null) {
                if (replaceFirst.endsWith("Bytes")) {
                    java.lang.String str5 = "get";
                    java.lang.String valueOf6 = java.lang.String.valueOf(replaceFirst.substring(0, replaceFirst.length() - 5));
                    if (hashMap.containsKey(valueOf6.length() != 0 ? str5.concat(valueOf6) : new java.lang.String(str5))) {
                    }
                }
                java.lang.String valueOf7 = java.lang.String.valueOf(replaceFirst.substring(0, 1).toLowerCase());
                java.lang.String valueOf8 = java.lang.String.valueOf(replaceFirst.substring(1));
                java.lang.String str6 = valueOf8.length() != 0 ? valueOf7.concat(valueOf8) : new java.lang.String(valueOf7);
                java.lang.String str7 = "get";
                java.lang.String valueOf9 = java.lang.String.valueOf(replaceFirst);
                java.lang.reflect.Method method4 = (java.lang.reflect.Method) hashMap.get(valueOf9.length() != 0 ? str7.concat(valueOf9) : new java.lang.String(str7));
                java.lang.String str8 = "has";
                java.lang.String valueOf10 = java.lang.String.valueOf(replaceFirst);
                java.lang.reflect.Method method5 = (java.lang.reflect.Method) hashMap.get(valueOf10.length() != 0 ? str8.concat(valueOf10) : new java.lang.String(str8));
                if (method4 != null) {
                    java.lang.Object a = defpackage.dih.a(method4, (java.lang.Object) djo, new java.lang.Object[0]);
                    if (method5 == null) {
                        boolean z = a instanceof java.lang.Boolean ? !((java.lang.Boolean) a).booleanValue() : a instanceof java.lang.Integer ? ((java.lang.Integer) a).intValue() == 0 : a instanceof java.lang.Float ? ((java.lang.Float) a).floatValue() == 0.0f : a instanceof java.lang.Double ? ((java.lang.Double) a).doubleValue() == 0.0d : a instanceof java.lang.String ? a.equals("") : a instanceof defpackage.dha ? a.equals(defpackage.dha.a) : a instanceof defpackage.djo ? a == ((defpackage.djo) a).i() : a instanceof java.lang.Enum ? ((java.lang.Enum) a).ordinal() == 0 : false;
                        if (!z) {
                            booleanValue = true;
                        } else {
                            booleanValue = false;
                        }
                    } else {
                        booleanValue = ((java.lang.Boolean) defpackage.dih.a(method5, (java.lang.Object) djo, new java.lang.Object[0])).booleanValue();
                    }
                    if (booleanValue) {
                        a(sb, i, a(str6), a);
                    }
                }
            }
        }
        if (djo instanceof defpackage.dij) {
            java.util.Iterator b = ((defpackage.dij) djo).a.b();
            if (b.hasNext()) {
                ((java.util.Map.Entry) b.next()).getKey();
                throw new java.lang.NoSuchMethodError();
            }
        }
        if (((defpackage.dih) djo).s != null) {
            defpackage.dky dky = ((defpackage.dih) djo).s;
            for (int i2 = 0; i2 < dky.b; i2++) {
                a(sb, i, java.lang.String.valueOf(dky.c[i2] >>> 3), dky.d[i2]);
            }
        }
    }

    private static void a(java.lang.StringBuilder sb, int i, java.lang.String str, java.lang.Object obj) {
        int i2 = 0;
        if (obj instanceof java.util.List) {
            for (java.lang.Object a : (java.util.List) obj) {
                a(sb, i, str, a);
            }
        } else if (obj instanceof java.util.Map) {
            for (java.util.Map.Entry a2 : ((java.util.Map) obj).entrySet()) {
                a(sb, i, str, (java.lang.Object) a2);
            }
        } else {
            sb.append(10);
            for (int i3 = 0; i3 < i; i3++) {
                sb.append(' ');
            }
            sb.append(str);
            if (obj instanceof java.lang.String) {
                sb.append(": \"").append(a(defpackage.dha.a((java.lang.String) obj))).append('\"');
            } else if (obj instanceof defpackage.dha) {
                sb.append(": \"").append(a((defpackage.dha) obj)).append('\"');
            } else if (obj instanceof defpackage.dih) {
                sb.append(" {");
                a((defpackage.djo) (defpackage.dih) obj, sb, i + 2);
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else if (obj instanceof java.util.Map.Entry) {
                sb.append(" {");
                java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                a(sb, i + 2, "key", entry.getKey());
                a(sb, i + 2, "value", entry.getValue());
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

    private static java.lang.String a(java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (java.lang.Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(java.lang.Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    private static java.lang.String a(defpackage.dha dha) {
        defpackage.dkv dkv = new defpackage.dkv(dha);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(dkv.a.a());
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
                    if (a >= 32 && a <= 126) {
                        sb.append((char) a);
                        break;
                    } else {
                        sb.append('\\');
                        sb.append((char) (((a >>> 6) & 3) + 48));
                        sb.append((char) (((a >>> 3) & 7) + 48));
                        sb.append((char) ((a & 7) + 48));
                        break;
                    }
                    break;
            }
        }
        return sb.toString();
    }

    public static java.lang.String a(defpackage.dmf dmf) {
        if (dmf == null) {
            return "";
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        try {
            a((java.lang.String) null, (java.lang.Object) dmf, new java.lang.StringBuffer(), stringBuffer);
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
        if (obj instanceof defpackage.dmf) {
            int length = stringBuffer.length();
            if (str != null) {
                stringBuffer2.append(stringBuffer).append(b(str)).append(" <\n");
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
        stringBuffer2.append(stringBuffer).append(b(str)).append(": ");
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

    private static java.lang.String b(java.lang.String str) {
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

    public static java.util.LinkedHashMap b(int i) {
        int i2;
        if (i < 3) {
            i2 = i + 1;
        } else if (i < 1073741824) {
            i2 = (int) ((((float) i) / 0.75f) + 1.0f);
        } else {
            i2 = Integer.MAX_VALUE;
        }
        return new java.util.LinkedHashMap(i2);
    }

    public static java.lang.Object a(java.lang.Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new java.lang.NullPointerException();
    }

    public static java.lang.Object a(java.lang.Object obj, java.lang.String str) {
        if (obj != null) {
            return obj;
        }
        throw new java.lang.NullPointerException(str);
    }
}
