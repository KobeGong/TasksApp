package defpackage;

/* renamed from: djr reason: default package */
/* compiled from: PG */
final class djr implements defpackage.dkh {
    private static final int[] a = new int[0];
    private static final sun.misc.Unsafe b = defpackage.dlc.a();
    private final int[] c;
    private final java.lang.Object[] d;
    private final int e;
    private final int f;
    private final defpackage.djo g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final boolean k;
    private final int[] l;
    private final int m;
    private final int n;
    private final defpackage.dja o;
    private final defpackage.dkx p;
    private final defpackage.dhy q;
    private final defpackage.djk r;

    private djr(int[] iArr, java.lang.Object[] objArr, int i2, int i3, defpackage.djo djo, boolean z, int[] iArr2, int i4, int i5, defpackage.dju dju, defpackage.dja dja, defpackage.dkx dkx, defpackage.dhy dhy, defpackage.djk djk) {
        this.c = iArr;
        this.d = objArr;
        this.e = i2;
        this.f = i3;
        this.i = djo instanceof defpackage.dih;
        this.j = z;
        this.h = dhy != null && (djo instanceof defpackage.dij);
        this.k = false;
        this.l = iArr2;
        this.m = i4;
        this.n = i5;
        this.o = dja;
        this.p = dkx;
        this.q = dhy;
        this.g = djo;
        this.r = djk;
    }

    static defpackage.djr a(defpackage.djm djm, defpackage.dju dju, defpackage.dja dja, defpackage.dkx dkx, defpackage.dhy dhy, defpackage.djk djk) {
        char c2;
        int i2;
        int i3;
        int i4;
        int i5;
        char c3;
        int i6;
        int i7;
        int[] iArr;
        int i8;
        char c4;
        int i9;
        char c5;
        char charAt;
        char charAt2;
        char charAt3;
        char charAt4;
        char charAt5;
        char charAt6;
        char charAt7;
        char charAt8;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        java.lang.reflect.Field a2;
        char charAt9;
        int i22;
        int i23;
        int i24;
        java.lang.reflect.Field a3;
        java.lang.reflect.Field a4;
        char charAt10;
        char charAt11;
        char charAt12;
        int i25;
        char charAt13;
        char charAt14;
        if (djm instanceof defpackage.dkb) {
            defpackage.dkb dkb = (defpackage.dkb) djm;
            boolean z = dkb.a() == defpackage.bg.as;
            java.lang.String str = dkb.b;
            int length = str.length();
            int i26 = 1;
            char charAt15 = str.charAt(0);
            if (charAt15 >= 55296) {
                char c6 = charAt15 & 8191;
                int i27 = 13;
                while (true) {
                    i2 = i26 + 1;
                    charAt14 = str.charAt(i26);
                    if (charAt14 < 55296) {
                        break;
                    }
                    c6 |= (charAt14 & 8191) << i27;
                    i27 += 13;
                    i26 = i2;
                }
                c2 = (charAt14 << i27) | c6;
            } else {
                c2 = charAt15;
                i2 = 1;
            }
            int i28 = i2 + 1;
            char charAt16 = str.charAt(i2);
            if (charAt16 >= 55296) {
                char c7 = charAt16 & 8191;
                int i29 = 13;
                while (true) {
                    i25 = i28 + 1;
                    charAt13 = str.charAt(i28);
                    if (charAt13 < 55296) {
                        break;
                    }
                    c7 |= (charAt13 & 8191) << i29;
                    i29 += 13;
                    i28 = i25;
                }
                charAt16 = (charAt13 << i29) | c7;
                i3 = i25;
            } else {
                i3 = i28;
            }
            if (charAt16 == 0) {
                i8 = 0;
                iArr = a;
                i6 = 0;
                c3 = 0;
                i7 = 0;
                c4 = 0;
                i9 = 0;
                c5 = 0;
            } else {
                int i30 = i4 + 1;
                char charAt17 = str.charAt(i4);
                if (charAt17 >= 55296) {
                    char c8 = charAt17 & 8191;
                    int i31 = 13;
                    while (true) {
                        i5 = i30 + 1;
                        charAt8 = str.charAt(i30);
                        if (charAt8 < 55296) {
                            break;
                        }
                        c8 |= (charAt8 & 8191) << i31;
                        i31 += 13;
                        i30 = i5;
                    }
                    charAt17 = (charAt8 << i31) | c8;
                } else {
                    i5 = i30;
                }
                int i32 = i5 + 1;
                char charAt18 = str.charAt(i5);
                if (charAt18 >= 55296) {
                    char c9 = charAt18 & 8191;
                    int i33 = 13;
                    while (true) {
                        int i34 = i32;
                        i32 = i34 + 1;
                        charAt7 = str.charAt(i34);
                        if (charAt7 < 55296) {
                            break;
                        }
                        c9 |= (charAt7 & 8191) << i33;
                        i33 += 13;
                    }
                    charAt18 = (charAt7 << i33) | c9;
                }
                int i35 = i32 + 1;
                char charAt19 = str.charAt(i32);
                if (charAt19 >= 55296) {
                    char c10 = charAt19 & 8191;
                    int i36 = 13;
                    while (true) {
                        int i37 = i35;
                        i35 = i37 + 1;
                        charAt6 = str.charAt(i37);
                        if (charAt6 < 55296) {
                            break;
                        }
                        c10 |= (charAt6 & 8191) << i36;
                        i36 += 13;
                    }
                    charAt19 = (charAt6 << i36) | c10;
                }
                int i38 = i35 + 1;
                char charAt20 = str.charAt(i35);
                if (charAt20 >= 55296) {
                    char c11 = charAt20 & 8191;
                    int i39 = 13;
                    while (true) {
                        int i40 = i38;
                        i38 = i40 + 1;
                        charAt5 = str.charAt(i40);
                        if (charAt5 < 55296) {
                            break;
                        }
                        c11 |= (charAt5 & 8191) << i39;
                        i39 += 13;
                    }
                    charAt20 = (charAt5 << i39) | c11;
                }
                int i41 = i38 + 1;
                char charAt21 = str.charAt(i38);
                if (charAt21 >= 55296) {
                    char c12 = charAt21 & 8191;
                    int i42 = 13;
                    while (true) {
                        int i43 = i41;
                        i41 = i43 + 1;
                        charAt4 = str.charAt(i43);
                        if (charAt4 < 55296) {
                            break;
                        }
                        c12 |= (charAt4 & 8191) << i42;
                        i42 += 13;
                    }
                    charAt21 = (charAt4 << i42) | c12;
                }
                int i44 = i41 + 1;
                char charAt22 = str.charAt(i41);
                if (charAt22 >= 55296) {
                    char c13 = charAt22 & 8191;
                    int i45 = 13;
                    while (true) {
                        int i46 = i44;
                        i44 = i46 + 1;
                        charAt3 = str.charAt(i46);
                        if (charAt3 < 55296) {
                            break;
                        }
                        c13 |= (charAt3 & 8191) << i45;
                        i45 += 13;
                    }
                    charAt22 = (charAt3 << i45) | c13;
                }
                int i47 = i44 + 1;
                char charAt23 = str.charAt(i44);
                if (charAt23 >= 55296) {
                    char c14 = charAt23 & 8191;
                    int i48 = 13;
                    while (true) {
                        int i49 = i47;
                        i47 = i49 + 1;
                        charAt2 = str.charAt(i49);
                        if (charAt2 < 55296) {
                            break;
                        }
                        c14 |= (charAt2 & 8191) << i48;
                        i48 += 13;
                    }
                    charAt23 = (charAt2 << i48) | c14;
                }
                i4 = i47 + 1;
                char charAt24 = str.charAt(i47);
                if (charAt24 >= 55296) {
                    char c15 = charAt24 & 8191;
                    int i50 = 13;
                    while (true) {
                        int i51 = i4;
                        i4 = i51 + 1;
                        charAt = str.charAt(i51);
                        if (charAt < 55296) {
                            break;
                        }
                        c15 |= (charAt & 8191) << i50;
                        i50 += 13;
                    }
                    charAt24 = (charAt << i50) | c15;
                }
                c3 = charAt17;
                i6 = charAt18 + (charAt17 << 1);
                int i52 = charAt24;
                i7 = charAt22;
                iArr = new int[(charAt23 + charAt24 + charAt22)];
                i8 = i52;
                char c16 = charAt20;
                c4 = charAt19;
                i9 = charAt21;
                c5 = c16;
            }
            sun.misc.Unsafe unsafe = b;
            java.lang.Object[] objArr = dkb.c;
            int i53 = 0;
            java.lang.Class cls = dkb.a.getClass();
            int[] iArr2 = new int[(i9 * 3)];
            java.lang.Object[] objArr2 = new java.lang.Object[(i9 << 1)];
            int i54 = i8 + i7;
            int i55 = 0;
            int i56 = i8;
            int i57 = i6;
            int i58 = i4;
            while (i58 < length) {
                int i59 = i58 + 1;
                int charAt25 = str.charAt(i58);
                if (charAt25 >= 55296) {
                    int i60 = charAt25 & 8191;
                    int i61 = 13;
                    while (true) {
                        i11 = i59 + 1;
                        charAt12 = str.charAt(i59);
                        if (charAt12 < 55296) {
                            break;
                        }
                        i60 |= (charAt12 & 8191) << i61;
                        i61 += 13;
                        i59 = i11;
                    }
                    i10 = (charAt12 << i61) | i60;
                } else {
                    i10 = charAt25;
                    i11 = i59;
                }
                int i62 = i11 + 1;
                char charAt26 = str.charAt(i11);
                if (charAt26 >= 55296) {
                    char c17 = charAt26 & 8191;
                    int i63 = 13;
                    while (true) {
                        int i64 = i62;
                        i62 = i64 + 1;
                        charAt11 = str.charAt(i64);
                        if (charAt11 < 55296) {
                            break;
                        }
                        c17 |= (charAt11 & 8191) << i63;
                        i63 += 13;
                    }
                    i12 = (charAt11 << i63) | c17;
                    i58 = i62;
                } else {
                    i12 = charAt26;
                    i58 = i62;
                }
                int i65 = i12 & 255;
                if ((i12 & 1024) != 0) {
                    int i66 = i53 + 1;
                    iArr[i53] = i55;
                    i13 = i66;
                } else {
                    i13 = i53;
                }
                if (i65 > defpackage.dic.MAP.k) {
                    int i67 = i58 + 1;
                    char charAt27 = str.charAt(i58);
                    if (charAt27 >= 55296) {
                        char c18 = charAt27 & 8191;
                        int i68 = 13;
                        while (true) {
                            i23 = i67 + 1;
                            charAt10 = str.charAt(i67);
                            if (charAt10 < 55296) {
                                break;
                            }
                            c18 |= (charAt10 & 8191) << i68;
                            i68 += 13;
                            i67 = i23;
                        }
                        charAt27 = (charAt10 << i68) | c18;
                    } else {
                        i23 = i67;
                    }
                    if (i65 == defpackage.dic.MESSAGE.k + 51 || i65 == defpackage.dic.GROUP.k + 51) {
                        i24 = i57 + 1;
                        objArr2[((i55 / 3) << 1) + 1] = objArr[i57];
                    } else if (i65 == defpackage.dic.ENUM.k + 51 && (c2 & 1) == 1) {
                        i24 = i57 + 1;
                        objArr2[((i55 / 3) << 1) + 1] = objArr[i57];
                    } else {
                        i24 = i57;
                    }
                    int i69 = charAt27 << 1;
                    java.lang.Object obj = objArr[i69];
                    if (obj instanceof java.lang.reflect.Field) {
                        a3 = (java.lang.reflect.Field) obj;
                    } else {
                        a3 = a(cls, (java.lang.String) obj);
                        objArr[i69] = a3;
                    }
                    i17 = (int) unsafe.objectFieldOffset(a3);
                    int i70 = i69 + 1;
                    java.lang.Object obj2 = objArr[i70];
                    if (obj2 instanceof java.lang.reflect.Field) {
                        a4 = (java.lang.reflect.Field) obj2;
                    } else {
                        a4 = a(cls, (java.lang.String) obj2);
                        objArr[i70] = a4;
                    }
                    i18 = i24;
                    i58 = i23;
                    i16 = 0;
                    i19 = (int) unsafe.objectFieldOffset(a4);
                } else {
                    int i71 = i57 + 1;
                    java.lang.reflect.Field a5 = a(cls, (java.lang.String) objArr[i57]);
                    if (i65 == defpackage.dic.MESSAGE.k || i65 == defpackage.dic.GROUP.k) {
                        objArr2[((i55 / 3) << 1) + 1] = a5.getType();
                        i14 = i71;
                        i15 = i56;
                    } else if (i65 == defpackage.dic.MESSAGE_LIST.k || i65 == defpackage.dic.GROUP_LIST.k) {
                        int i72 = i71 + 1;
                        objArr2[((i55 / 3) << 1) + 1] = objArr[i71];
                        i15 = i56;
                        i14 = i72;
                    } else {
                        if (i65 == defpackage.dic.ENUM.k || i65 == defpackage.dic.ENUM_LIST.k || i65 == defpackage.dic.ENUM_LIST_PACKED.k) {
                            if ((c2 & 1) == 1) {
                                int i73 = i71 + 1;
                                objArr2[((i55 / 3) << 1) + 1] = objArr[i71];
                                i15 = i56;
                                i14 = i73;
                            }
                        } else if (i65 == defpackage.dic.MAP.k) {
                            int i74 = i56 + 1;
                            iArr[i56] = i55;
                            i14 = i71 + 1;
                            objArr2[(i55 / 3) << 1] = objArr[i71];
                            if ((i12 & 2048) != 0) {
                                int i75 = i14 + 1;
                                objArr2[((i55 / 3) << 1) + 1] = objArr[i14];
                                i14 = i75;
                                i15 = i74;
                            } else {
                                i15 = i74;
                            }
                        }
                        i14 = i71;
                        i15 = i56;
                    }
                    int objectFieldOffset = (int) unsafe.objectFieldOffset(a5);
                    if ((c2 & 1) != 1 || i65 > defpackage.dic.GROUP.k) {
                        i16 = 0;
                        i17 = objectFieldOffset;
                        i56 = i15;
                        i18 = i14;
                        i19 = 0;
                    } else {
                        int i76 = i58 + 1;
                        char charAt28 = str.charAt(i58);
                        if (charAt28 >= 55296) {
                            int i77 = charAt28 & 8191;
                            int i78 = 13;
                            while (true) {
                                i21 = i76 + 1;
                                charAt9 = str.charAt(i76);
                                if (charAt9 < 55296) {
                                    break;
                                }
                                i77 |= (charAt9 & 8191) << i78;
                                i78 += 13;
                                i76 = i21;
                            }
                            i20 = (charAt9 << i78) | i77;
                        } else {
                            i20 = charAt28;
                            i21 = i76;
                        }
                        int i79 = (i20 / 32) + (c3 << 1);
                        java.lang.Object obj3 = objArr[i79];
                        if (obj3 instanceof java.lang.reflect.Field) {
                            a2 = (java.lang.reflect.Field) obj3;
                        } else {
                            a2 = a(cls, (java.lang.String) obj3);
                            objArr[i79] = a2;
                        }
                        i16 = i20 % 32;
                        i17 = objectFieldOffset;
                        i58 = i21;
                        i56 = i15;
                        i18 = i14;
                        i19 = (int) unsafe.objectFieldOffset(a2);
                    }
                }
                if (i65 < 18 || i65 > 49) {
                    i22 = i54;
                } else {
                    i22 = i54 + 1;
                    iArr[i54] = i17;
                }
                int i80 = i55 + 1;
                iArr2[i55] = i10;
                int i81 = i80 + 1;
                iArr2[i80] = ((i12 & 256) != 0 ? 268435456 : 0) | ((i12 & 512) != 0 ? 536870912 : 0) | (i65 << 20) | i17;
                int i82 = i81 + 1;
                iArr2[i81] = (i16 << 20) | i19;
                i55 = i82;
                i54 = i22;
                i53 = i13;
                i57 = i18;
            }
            return new defpackage.djr(iArr2, objArr2, c4, c5, dkb.a, z, iArr, i8, i7 + i8, dju, dja, dkx, dhy, djk);
        }
        throw new java.lang.NoSuchMethodError();
    }

    private static java.lang.reflect.Field a(java.lang.Class cls, java.lang.String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (java.lang.NoSuchFieldException e2) {
            java.lang.reflect.Field[] declaredFields = cls.getDeclaredFields();
            for (java.lang.reflect.Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            java.lang.String name = cls.getName();
            java.lang.String arrays = java.util.Arrays.toString(declaredFields);
            throw new java.lang.RuntimeException(new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 40 + java.lang.String.valueOf(name).length() + java.lang.String.valueOf(arrays).length()).append("Field ").append(str).append(" for ").append(name).append(" not found. Known fields are ").append(arrays).toString());
        }
    }

    public final java.lang.Object a() {
        return ((defpackage.dih) this.g).a(defpackage.bg.an);
    }

    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(java.lang.Object r12, java.lang.Object r13) {
        /*
            r11 = this;
            r2 = 1
            r10 = 1048575(0xfffff, float:1.469367E-39)
            r1 = 0
            int[] r0 = r11.c
            int r4 = r0.length
            r3 = r1
        L_0x0009:
            if (r3 >= r4) goto L_0x01d0
            int r0 = r11.d(r3)
            r5 = r0 & r10
            long r6 = (long) r5
            r5 = 267386880(0xff00000, float:2.3665827E-29)
            r0 = r0 & r5
            int r0 = r0 >>> 20
            switch(r0) {
                case 0: goto L_0x001f;
                case 1: goto L_0x0033;
                case 2: goto L_0x0045;
                case 3: goto L_0x0059;
                case 4: goto L_0x006d;
                case 5: goto L_0x007f;
                case 6: goto L_0x0093;
                case 7: goto L_0x00a6;
                case 8: goto L_0x00b9;
                case 9: goto L_0x00d0;
                case 10: goto L_0x00e7;
                case 11: goto L_0x00fe;
                case 12: goto L_0x0111;
                case 13: goto L_0x0124;
                case 14: goto L_0x0137;
                case 15: goto L_0x014c;
                case 16: goto L_0x015f;
                case 17: goto L_0x0174;
                case 18: goto L_0x018b;
                case 19: goto L_0x018b;
                case 20: goto L_0x018b;
                case 21: goto L_0x018b;
                case 22: goto L_0x018b;
                case 23: goto L_0x018b;
                case 24: goto L_0x018b;
                case 25: goto L_0x018b;
                case 26: goto L_0x018b;
                case 27: goto L_0x018b;
                case 28: goto L_0x018b;
                case 29: goto L_0x018b;
                case 30: goto L_0x018b;
                case 31: goto L_0x018b;
                case 32: goto L_0x018b;
                case 33: goto L_0x018b;
                case 34: goto L_0x018b;
                case 35: goto L_0x018b;
                case 36: goto L_0x018b;
                case 37: goto L_0x018b;
                case 38: goto L_0x018b;
                case 39: goto L_0x018b;
                case 40: goto L_0x018b;
                case 41: goto L_0x018b;
                case 42: goto L_0x018b;
                case 43: goto L_0x018b;
                case 44: goto L_0x018b;
                case 45: goto L_0x018b;
                case 46: goto L_0x018b;
                case 47: goto L_0x018b;
                case 48: goto L_0x018b;
                case 49: goto L_0x018b;
                case 50: goto L_0x0199;
                case 51: goto L_0x01a7;
                case 52: goto L_0x01a7;
                case 53: goto L_0x01a7;
                case 54: goto L_0x01a7;
                case 55: goto L_0x01a7;
                case 56: goto L_0x01a7;
                case 57: goto L_0x01a7;
                case 58: goto L_0x01a7;
                case 59: goto L_0x01a7;
                case 60: goto L_0x01a7;
                case 61: goto L_0x01a7;
                case 62: goto L_0x01a7;
                case 63: goto L_0x01a7;
                case 64: goto L_0x01a7;
                case 65: goto L_0x01a7;
                case 66: goto L_0x01a7;
                case 67: goto L_0x01a7;
                case 68: goto L_0x01a7;
                default: goto L_0x001a;
            }
        L_0x001a:
            r0 = r2
        L_0x001b:
            if (r0 != 0) goto L_0x01cb
            r0 = r1
        L_0x001e:
            return r0
        L_0x001f:
            boolean r0 = r11.c(r12, r13, r3)
            if (r0 == 0) goto L_0x0031
            long r8 = defpackage.dlc.b(r12, r6)
            long r6 = defpackage.dlc.b(r13, r6)
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x001a
        L_0x0031:
            r0 = r1
            goto L_0x001b
        L_0x0033:
            boolean r0 = r11.c(r12, r13, r3)
            if (r0 == 0) goto L_0x0043
            int r0 = defpackage.dlc.a(r12, r6)
            int r5 = defpackage.dlc.a(r13, r6)
            if (r0 == r5) goto L_0x001a
        L_0x0043:
            r0 = r1
            goto L_0x001b
        L_0x0045:
            boolean r0 = r11.c(r12, r13, r3)
            if (r0 == 0) goto L_0x0057
            long r8 = defpackage.dlc.b(r12, r6)
            long r6 = defpackage.dlc.b(r13, r6)
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x001a
        L_0x0057:
            r0 = r1
            goto L_0x001b
        L_0x0059:
            boolean r0 = r11.c(r12, r13, r3)
            if (r0 == 0) goto L_0x006b
            long r8 = defpackage.dlc.b(r12, r6)
            long r6 = defpackage.dlc.b(r13, r6)
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x001a
        L_0x006b:
            r0 = r1
            goto L_0x001b
        L_0x006d:
            boolean r0 = r11.c(r12, r13, r3)
            if (r0 == 0) goto L_0x007d
            int r0 = defpackage.dlc.a(r12, r6)
            int r5 = defpackage.dlc.a(r13, r6)
            if (r0 == r5) goto L_0x001a
        L_0x007d:
            r0 = r1
            goto L_0x001b
        L_0x007f:
            boolean r0 = r11.c(r12, r13, r3)
            if (r0 == 0) goto L_0x0091
            long r8 = defpackage.dlc.b(r12, r6)
            long r6 = defpackage.dlc.b(r13, r6)
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x001a
        L_0x0091:
            r0 = r1
            goto L_0x001b
        L_0x0093:
            boolean r0 = r11.c(r12, r13, r3)
            if (r0 == 0) goto L_0x00a3
            int r0 = defpackage.dlc.a(r12, r6)
            int r5 = defpackage.dlc.a(r13, r6)
            if (r0 == r5) goto L_0x001a
        L_0x00a3:
            r0 = r1
            goto L_0x001b
        L_0x00a6:
            boolean r0 = r11.c(r12, r13, r3)
            if (r0 == 0) goto L_0x00b6
            boolean r0 = defpackage.dlc.c(r12, r6)
            boolean r5 = defpackage.dlc.c(r13, r6)
            if (r0 == r5) goto L_0x001a
        L_0x00b6:
            r0 = r1
            goto L_0x001b
        L_0x00b9:
            boolean r0 = r11.c(r12, r13, r3)
            if (r0 == 0) goto L_0x00cd
            java.lang.Object r0 = defpackage.dlc.f(r12, r6)
            java.lang.Object r5 = defpackage.dlc.f(r13, r6)
            boolean r0 = defpackage.dkj.a(r0, r5)
            if (r0 != 0) goto L_0x001a
        L_0x00cd:
            r0 = r1
            goto L_0x001b
        L_0x00d0:
            boolean r0 = r11.c(r12, r13, r3)
            if (r0 == 0) goto L_0x00e4
            java.lang.Object r0 = defpackage.dlc.f(r12, r6)
            java.lang.Object r5 = defpackage.dlc.f(r13, r6)
            boolean r0 = defpackage.dkj.a(r0, r5)
            if (r0 != 0) goto L_0x001a
        L_0x00e4:
            r0 = r1
            goto L_0x001b
        L_0x00e7:
            boolean r0 = r11.c(r12, r13, r3)
            if (r0 == 0) goto L_0x00fb
            java.lang.Object r0 = defpackage.dlc.f(r12, r6)
            java.lang.Object r5 = defpackage.dlc.f(r13, r6)
            boolean r0 = defpackage.dkj.a(r0, r5)
            if (r0 != 0) goto L_0x001a
        L_0x00fb:
            r0 = r1
            goto L_0x001b
        L_0x00fe:
            boolean r0 = r11.c(r12, r13, r3)
            if (r0 == 0) goto L_0x010e
            int r0 = defpackage.dlc.a(r12, r6)
            int r5 = defpackage.dlc.a(r13, r6)
            if (r0 == r5) goto L_0x001a
        L_0x010e:
            r0 = r1
            goto L_0x001b
        L_0x0111:
            boolean r0 = r11.c(r12, r13, r3)
            if (r0 == 0) goto L_0x0121
            int r0 = defpackage.dlc.a(r12, r6)
            int r5 = defpackage.dlc.a(r13, r6)
            if (r0 == r5) goto L_0x001a
        L_0x0121:
            r0 = r1
            goto L_0x001b
        L_0x0124:
            boolean r0 = r11.c(r12, r13, r3)
            if (r0 == 0) goto L_0x0134
            int r0 = defpackage.dlc.a(r12, r6)
            int r5 = defpackage.dlc.a(r13, r6)
            if (r0 == r5) goto L_0x001a
        L_0x0134:
            r0 = r1
            goto L_0x001b
        L_0x0137:
            boolean r0 = r11.c(r12, r13, r3)
            if (r0 == 0) goto L_0x0149
            long r8 = defpackage.dlc.b(r12, r6)
            long r6 = defpackage.dlc.b(r13, r6)
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x001a
        L_0x0149:
            r0 = r1
            goto L_0x001b
        L_0x014c:
            boolean r0 = r11.c(r12, r13, r3)
            if (r0 == 0) goto L_0x015c
            int r0 = defpackage.dlc.a(r12, r6)
            int r5 = defpackage.dlc.a(r13, r6)
            if (r0 == r5) goto L_0x001a
        L_0x015c:
            r0 = r1
            goto L_0x001b
        L_0x015f:
            boolean r0 = r11.c(r12, r13, r3)
            if (r0 == 0) goto L_0x0171
            long r8 = defpackage.dlc.b(r12, r6)
            long r6 = defpackage.dlc.b(r13, r6)
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x001a
        L_0x0171:
            r0 = r1
            goto L_0x001b
        L_0x0174:
            boolean r0 = r11.c(r12, r13, r3)
            if (r0 == 0) goto L_0x0188
            java.lang.Object r0 = defpackage.dlc.f(r12, r6)
            java.lang.Object r5 = defpackage.dlc.f(r13, r6)
            boolean r0 = defpackage.dkj.a(r0, r5)
            if (r0 != 0) goto L_0x001a
        L_0x0188:
            r0 = r1
            goto L_0x001b
        L_0x018b:
            java.lang.Object r0 = defpackage.dlc.f(r12, r6)
            java.lang.Object r5 = defpackage.dlc.f(r13, r6)
            boolean r0 = defpackage.dkj.a(r0, r5)
            goto L_0x001b
        L_0x0199:
            java.lang.Object r0 = defpackage.dlc.f(r12, r6)
            java.lang.Object r5 = defpackage.dlc.f(r13, r6)
            boolean r0 = defpackage.dkj.a(r0, r5)
            goto L_0x001b
        L_0x01a7:
            int r0 = r11.e(r3)
            r5 = r0 & r10
            long r8 = (long) r5
            int r5 = defpackage.dlc.a(r12, r8)
            r0 = r0 & r10
            long r8 = (long) r0
            int r0 = defpackage.dlc.a(r13, r8)
            if (r5 != r0) goto L_0x01c8
            java.lang.Object r0 = defpackage.dlc.f(r12, r6)
            java.lang.Object r5 = defpackage.dlc.f(r13, r6)
            boolean r0 = defpackage.dkj.a(r0, r5)
            if (r0 != 0) goto L_0x001a
        L_0x01c8:
            r0 = r1
            goto L_0x001b
        L_0x01cb:
            int r0 = r3 + 3
            r3 = r0
            goto L_0x0009
        L_0x01d0:
            r0 = r12
            dih r0 = (defpackage.dih) r0
            dky r3 = r0.s
            r0 = r13
            dih r0 = (defpackage.dih) r0
            dky r0 = r0.s
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x01e3
            r0 = r1
            goto L_0x001e
        L_0x01e3:
            boolean r0 = r11.h
            if (r0 == 0) goto L_0x01f5
            dij r12 = (defpackage.dij) r12
            dia r0 = r12.a
            dij r13 = (defpackage.dij) r13
            dia r1 = r13.a
            boolean r0 = r0.equals(r1)
            goto L_0x001e
        L_0x01f5:
            r0 = r2
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.djr.a(java.lang.Object, java.lang.Object):boolean");
    }

    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(java.lang.Object r10) {
        /*
            r9 = this;
            r1 = 37
            r0 = 0
            int[] r2 = r9.c
            int r4 = r2.length
            r3 = r0
            r2 = r0
        L_0x0008:
            if (r3 >= r4) goto L_0x0255
            int r0 = r9.d(r3)
            int[] r5 = r9.c
            r5 = r5[r3]
            r6 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r6 & r0
            long r6 = (long) r6
            r8 = 267386880(0xff00000, float:2.3665827E-29)
            r0 = r0 & r8
            int r0 = r0 >>> 20
            switch(r0) {
                case 0: goto L_0x0025;
                case 1: goto L_0x0035;
                case 2: goto L_0x0041;
                case 3: goto L_0x004d;
                case 4: goto L_0x0059;
                case 5: goto L_0x0061;
                case 6: goto L_0x006d;
                case 7: goto L_0x0075;
                case 8: goto L_0x0081;
                case 9: goto L_0x008f;
                case 10: goto L_0x009d;
                case 11: goto L_0x00aa;
                case 12: goto L_0x00b3;
                case 13: goto L_0x00bc;
                case 14: goto L_0x00c5;
                case 15: goto L_0x00d2;
                case 16: goto L_0x00db;
                case 17: goto L_0x00e8;
                case 18: goto L_0x00f7;
                case 19: goto L_0x00f7;
                case 20: goto L_0x00f7;
                case 21: goto L_0x00f7;
                case 22: goto L_0x00f7;
                case 23: goto L_0x00f7;
                case 24: goto L_0x00f7;
                case 25: goto L_0x00f7;
                case 26: goto L_0x00f7;
                case 27: goto L_0x00f7;
                case 28: goto L_0x00f7;
                case 29: goto L_0x00f7;
                case 30: goto L_0x00f7;
                case 31: goto L_0x00f7;
                case 32: goto L_0x00f7;
                case 33: goto L_0x00f7;
                case 34: goto L_0x00f7;
                case 35: goto L_0x00f7;
                case 36: goto L_0x00f7;
                case 37: goto L_0x00f7;
                case 38: goto L_0x00f7;
                case 39: goto L_0x00f7;
                case 40: goto L_0x00f7;
                case 41: goto L_0x00f7;
                case 42: goto L_0x00f7;
                case 43: goto L_0x00f7;
                case 44: goto L_0x00f7;
                case 45: goto L_0x00f7;
                case 46: goto L_0x00f7;
                case 47: goto L_0x00f7;
                case 48: goto L_0x00f7;
                case 49: goto L_0x00f7;
                case 50: goto L_0x0104;
                case 51: goto L_0x0111;
                case 52: goto L_0x0128;
                case 53: goto L_0x013b;
                case 54: goto L_0x014e;
                case 55: goto L_0x0161;
                case 56: goto L_0x0170;
                case 57: goto L_0x0183;
                case 58: goto L_0x0192;
                case 59: goto L_0x01a5;
                case 60: goto L_0x01ba;
                case 61: goto L_0x01cd;
                case 62: goto L_0x01e0;
                case 63: goto L_0x01ef;
                case 64: goto L_0x01fe;
                case 65: goto L_0x020d;
                case 66: goto L_0x0220;
                case 67: goto L_0x022f;
                case 68: goto L_0x0242;
                default: goto L_0x001f;
            }
        L_0x001f:
            r0 = r2
        L_0x0020:
            int r2 = r3 + 3
            r3 = r2
            r2 = r0
            goto L_0x0008
        L_0x0025:
            int r0 = r2 * 53
            double r6 = defpackage.dlc.e(r10, r6)
            long r6 = java.lang.Double.doubleToLongBits(r6)
            int r2 = defpackage.dim.a(r6)
            int r0 = r0 + r2
            goto L_0x0020
        L_0x0035:
            int r0 = r2 * 53
            float r2 = defpackage.dlc.d(r10, r6)
            int r2 = java.lang.Float.floatToIntBits(r2)
            int r0 = r0 + r2
            goto L_0x0020
        L_0x0041:
            int r0 = r2 * 53
            long r6 = defpackage.dlc.b(r10, r6)
            int r2 = defpackage.dim.a(r6)
            int r0 = r0 + r2
            goto L_0x0020
        L_0x004d:
            int r0 = r2 * 53
            long r6 = defpackage.dlc.b(r10, r6)
            int r2 = defpackage.dim.a(r6)
            int r0 = r0 + r2
            goto L_0x0020
        L_0x0059:
            int r0 = r2 * 53
            int r2 = defpackage.dlc.a(r10, r6)
            int r0 = r0 + r2
            goto L_0x0020
        L_0x0061:
            int r0 = r2 * 53
            long r6 = defpackage.dlc.b(r10, r6)
            int r2 = defpackage.dim.a(r6)
            int r0 = r0 + r2
            goto L_0x0020
        L_0x006d:
            int r0 = r2 * 53
            int r2 = defpackage.dlc.a(r10, r6)
            int r0 = r0 + r2
            goto L_0x0020
        L_0x0075:
            int r0 = r2 * 53
            boolean r2 = defpackage.dlc.c(r10, r6)
            int r2 = defpackage.dim.a(r2)
            int r0 = r0 + r2
            goto L_0x0020
        L_0x0081:
            int r2 = r2 * 53
            java.lang.Object r0 = defpackage.dlc.f(r10, r6)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            goto L_0x0020
        L_0x008f:
            java.lang.Object r0 = defpackage.dlc.f(r10, r6)
            if (r0 == 0) goto L_0x0274
            int r0 = r0.hashCode()
        L_0x0099:
            int r2 = r2 * 53
            int r0 = r0 + r2
            goto L_0x0020
        L_0x009d:
            int r0 = r2 * 53
            java.lang.Object r2 = defpackage.dlc.f(r10, r6)
            int r2 = r2.hashCode()
            int r0 = r0 + r2
            goto L_0x0020
        L_0x00aa:
            int r0 = r2 * 53
            int r2 = defpackage.dlc.a(r10, r6)
            int r0 = r0 + r2
            goto L_0x0020
        L_0x00b3:
            int r0 = r2 * 53
            int r2 = defpackage.dlc.a(r10, r6)
            int r0 = r0 + r2
            goto L_0x0020
        L_0x00bc:
            int r0 = r2 * 53
            int r2 = defpackage.dlc.a(r10, r6)
            int r0 = r0 + r2
            goto L_0x0020
        L_0x00c5:
            int r0 = r2 * 53
            long r6 = defpackage.dlc.b(r10, r6)
            int r2 = defpackage.dim.a(r6)
            int r0 = r0 + r2
            goto L_0x0020
        L_0x00d2:
            int r0 = r2 * 53
            int r2 = defpackage.dlc.a(r10, r6)
            int r0 = r0 + r2
            goto L_0x0020
        L_0x00db:
            int r0 = r2 * 53
            long r6 = defpackage.dlc.b(r10, r6)
            int r2 = defpackage.dim.a(r6)
            int r0 = r0 + r2
            goto L_0x0020
        L_0x00e8:
            java.lang.Object r0 = defpackage.dlc.f(r10, r6)
            if (r0 == 0) goto L_0x0271
            int r0 = r0.hashCode()
        L_0x00f2:
            int r2 = r2 * 53
            int r0 = r0 + r2
            goto L_0x0020
        L_0x00f7:
            int r0 = r2 * 53
            java.lang.Object r2 = defpackage.dlc.f(r10, r6)
            int r2 = r2.hashCode()
            int r0 = r0 + r2
            goto L_0x0020
        L_0x0104:
            int r0 = r2 * 53
            java.lang.Object r2 = defpackage.dlc.f(r10, r6)
            int r2 = r2.hashCode()
            int r0 = r0 + r2
            goto L_0x0020
        L_0x0111:
            boolean r0 = r9.a(r10, r5, r3)
            if (r0 == 0) goto L_0x001f
            int r0 = r2 * 53
            double r6 = b(r10, r6)
            long r6 = java.lang.Double.doubleToLongBits(r6)
            int r2 = defpackage.dim.a(r6)
            int r0 = r0 + r2
            goto L_0x0020
        L_0x0128:
            boolean r0 = r9.a(r10, r5, r3)
            if (r0 == 0) goto L_0x001f
            int r0 = r2 * 53
            float r2 = c(r10, r6)
            int r2 = java.lang.Float.floatToIntBits(r2)
            int r0 = r0 + r2
            goto L_0x0020
        L_0x013b:
            boolean r0 = r9.a(r10, r5, r3)
            if (r0 == 0) goto L_0x001f
            int r0 = r2 * 53
            long r6 = e(r10, r6)
            int r2 = defpackage.dim.a(r6)
            int r0 = r0 + r2
            goto L_0x0020
        L_0x014e:
            boolean r0 = r9.a(r10, r5, r3)
            if (r0 == 0) goto L_0x001f
            int r0 = r2 * 53
            long r6 = e(r10, r6)
            int r2 = defpackage.dim.a(r6)
            int r0 = r0 + r2
            goto L_0x0020
        L_0x0161:
            boolean r0 = r9.a(r10, r5, r3)
            if (r0 == 0) goto L_0x001f
            int r0 = r2 * 53
            int r2 = d(r10, r6)
            int r0 = r0 + r2
            goto L_0x0020
        L_0x0170:
            boolean r0 = r9.a(r10, r5, r3)
            if (r0 == 0) goto L_0x001f
            int r0 = r2 * 53
            long r6 = e(r10, r6)
            int r2 = defpackage.dim.a(r6)
            int r0 = r0 + r2
            goto L_0x0020
        L_0x0183:
            boolean r0 = r9.a(r10, r5, r3)
            if (r0 == 0) goto L_0x001f
            int r0 = r2 * 53
            int r2 = d(r10, r6)
            int r0 = r0 + r2
            goto L_0x0020
        L_0x0192:
            boolean r0 = r9.a(r10, r5, r3)
            if (r0 == 0) goto L_0x001f
            int r0 = r2 * 53
            boolean r2 = f(r10, r6)
            int r2 = defpackage.dim.a(r2)
            int r0 = r0 + r2
            goto L_0x0020
        L_0x01a5:
            boolean r0 = r9.a(r10, r5, r3)
            if (r0 == 0) goto L_0x001f
            int r2 = r2 * 53
            java.lang.Object r0 = defpackage.dlc.f(r10, r6)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            goto L_0x0020
        L_0x01ba:
            boolean r0 = r9.a(r10, r5, r3)
            if (r0 == 0) goto L_0x001f
            java.lang.Object r0 = defpackage.dlc.f(r10, r6)
            int r2 = r2 * 53
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            goto L_0x0020
        L_0x01cd:
            boolean r0 = r9.a(r10, r5, r3)
            if (r0 == 0) goto L_0x001f
            int r0 = r2 * 53
            java.lang.Object r2 = defpackage.dlc.f(r10, r6)
            int r2 = r2.hashCode()
            int r0 = r0 + r2
            goto L_0x0020
        L_0x01e0:
            boolean r0 = r9.a(r10, r5, r3)
            if (r0 == 0) goto L_0x001f
            int r0 = r2 * 53
            int r2 = d(r10, r6)
            int r0 = r0 + r2
            goto L_0x0020
        L_0x01ef:
            boolean r0 = r9.a(r10, r5, r3)
            if (r0 == 0) goto L_0x001f
            int r0 = r2 * 53
            int r2 = d(r10, r6)
            int r0 = r0 + r2
            goto L_0x0020
        L_0x01fe:
            boolean r0 = r9.a(r10, r5, r3)
            if (r0 == 0) goto L_0x001f
            int r0 = r2 * 53
            int r2 = d(r10, r6)
            int r0 = r0 + r2
            goto L_0x0020
        L_0x020d:
            boolean r0 = r9.a(r10, r5, r3)
            if (r0 == 0) goto L_0x001f
            int r0 = r2 * 53
            long r6 = e(r10, r6)
            int r2 = defpackage.dim.a(r6)
            int r0 = r0 + r2
            goto L_0x0020
        L_0x0220:
            boolean r0 = r9.a(r10, r5, r3)
            if (r0 == 0) goto L_0x001f
            int r0 = r2 * 53
            int r2 = d(r10, r6)
            int r0 = r0 + r2
            goto L_0x0020
        L_0x022f:
            boolean r0 = r9.a(r10, r5, r3)
            if (r0 == 0) goto L_0x001f
            int r0 = r2 * 53
            long r6 = e(r10, r6)
            int r2 = defpackage.dim.a(r6)
            int r0 = r0 + r2
            goto L_0x0020
        L_0x0242:
            boolean r0 = r9.a(r10, r5, r3)
            if (r0 == 0) goto L_0x001f
            java.lang.Object r0 = defpackage.dlc.f(r10, r6)
            int r2 = r2 * 53
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            goto L_0x0020
        L_0x0255:
            int r1 = r2 * 53
            r0 = r10
            dih r0 = (defpackage.dih) r0
            dky r0 = r0.s
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            boolean r1 = r9.h
            if (r1 == 0) goto L_0x0270
            int r0 = r0 * 53
            dij r10 = (defpackage.dij) r10
            dia r1 = r10.a
            int r1 = r1.hashCode()
            int r0 = r0 + r1
        L_0x0270:
            return r0
        L_0x0271:
            r0 = r1
            goto L_0x00f2
        L_0x0274:
            r0 = r1
            goto L_0x0099
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.djr.a(java.lang.Object):int");
    }

    public final void b(java.lang.Object obj, java.lang.Object obj2) {
        if (obj2 == null) {
            throw new java.lang.NullPointerException();
        }
        for (int i2 = 0; i2 < this.c.length; i2 += 3) {
            int d2 = d(i2);
            long j2 = (long) (1048575 & d2);
            int i3 = this.c[i2];
            switch ((d2 & 267386880) >>> 20) {
                case 0:
                    if (!a(obj2, i2)) {
                        break;
                    } else {
                        defpackage.dlc.a(obj, j2, defpackage.dlc.e(obj2, j2));
                        b(obj, i2);
                        break;
                    }
                case 1:
                    if (!a(obj2, i2)) {
                        break;
                    } else {
                        defpackage.dlc.a(obj, j2, defpackage.dlc.d(obj2, j2));
                        b(obj, i2);
                        break;
                    }
                case 2:
                    if (!a(obj2, i2)) {
                        break;
                    } else {
                        defpackage.dlc.a(obj, j2, defpackage.dlc.b(obj2, j2));
                        b(obj, i2);
                        break;
                    }
                case 3:
                    if (!a(obj2, i2)) {
                        break;
                    } else {
                        defpackage.dlc.a(obj, j2, defpackage.dlc.b(obj2, j2));
                        b(obj, i2);
                        break;
                    }
                case 4:
                    if (!a(obj2, i2)) {
                        break;
                    } else {
                        defpackage.dlc.a(obj, j2, defpackage.dlc.a(obj2, j2));
                        b(obj, i2);
                        break;
                    }
                case 5:
                    if (!a(obj2, i2)) {
                        break;
                    } else {
                        defpackage.dlc.a(obj, j2, defpackage.dlc.b(obj2, j2));
                        b(obj, i2);
                        break;
                    }
                case 6:
                    if (!a(obj2, i2)) {
                        break;
                    } else {
                        defpackage.dlc.a(obj, j2, defpackage.dlc.a(obj2, j2));
                        b(obj, i2);
                        break;
                    }
                case 7:
                    if (!a(obj2, i2)) {
                        break;
                    } else {
                        defpackage.dlc.a(obj, j2, defpackage.dlc.c(obj2, j2));
                        b(obj, i2);
                        break;
                    }
                case 8:
                    if (!a(obj2, i2)) {
                        break;
                    } else {
                        defpackage.dlc.a(obj, j2, defpackage.dlc.f(obj2, j2));
                        b(obj, i2);
                        break;
                    }
                case 9:
                    a(obj, obj2, i2);
                    break;
                case 10:
                    if (!a(obj2, i2)) {
                        break;
                    } else {
                        defpackage.dlc.a(obj, j2, defpackage.dlc.f(obj2, j2));
                        b(obj, i2);
                        break;
                    }
                case 11:
                    if (!a(obj2, i2)) {
                        break;
                    } else {
                        defpackage.dlc.a(obj, j2, defpackage.dlc.a(obj2, j2));
                        b(obj, i2);
                        break;
                    }
                case 12:
                    if (!a(obj2, i2)) {
                        break;
                    } else {
                        defpackage.dlc.a(obj, j2, defpackage.dlc.a(obj2, j2));
                        b(obj, i2);
                        break;
                    }
                case 13:
                    if (!a(obj2, i2)) {
                        break;
                    } else {
                        defpackage.dlc.a(obj, j2, defpackage.dlc.a(obj2, j2));
                        b(obj, i2);
                        break;
                    }
                case 14:
                    if (!a(obj2, i2)) {
                        break;
                    } else {
                        defpackage.dlc.a(obj, j2, defpackage.dlc.b(obj2, j2));
                        b(obj, i2);
                        break;
                    }
                case 15:
                    if (!a(obj2, i2)) {
                        break;
                    } else {
                        defpackage.dlc.a(obj, j2, defpackage.dlc.a(obj2, j2));
                        b(obj, i2);
                        break;
                    }
                case 16:
                    if (!a(obj2, i2)) {
                        break;
                    } else {
                        defpackage.dlc.a(obj, j2, defpackage.dlc.b(obj2, j2));
                        b(obj, i2);
                        break;
                    }
                case 17:
                    a(obj, obj2, i2);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.o.a(obj, obj2, j2);
                    break;
                case 50:
                    defpackage.dkj.a(obj, obj2, j2);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (!a(obj2, i3, i2)) {
                        break;
                    } else {
                        defpackage.dlc.a(obj, j2, defpackage.dlc.f(obj2, j2));
                        b(obj, i3, i2);
                        break;
                    }
                case 60:
                    b(obj, obj2, i2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!a(obj2, i3, i2)) {
                        break;
                    } else {
                        defpackage.dlc.a(obj, j2, defpackage.dlc.f(obj2, j2));
                        b(obj, i3, i2);
                        break;
                    }
                case 68:
                    b(obj, obj2, i2);
                    break;
            }
        }
        if (!this.j) {
            defpackage.dkj.a(this.p, obj, obj2);
            if (this.h) {
                defpackage.dkj.a(this.q, obj, obj2);
            }
        }
    }

    private final void a(java.lang.Object obj, java.lang.Object obj2, int i2) {
        long d2 = (long) (d(i2) & 1048575);
        if (a(obj2, i2)) {
            java.lang.Object f2 = defpackage.dlc.f(obj, d2);
            java.lang.Object f3 = defpackage.dlc.f(obj2, d2);
            if (f2 != null && f3 != null) {
                defpackage.dlc.a(obj, d2, defpackage.dim.a(f2, f3));
                b(obj, i2);
            } else if (f3 != null) {
                defpackage.dlc.a(obj, d2, f3);
                b(obj, i2);
            }
        }
    }

    private final void b(java.lang.Object obj, java.lang.Object obj2, int i2) {
        int d2 = d(i2);
        int i3 = this.c[i2];
        long j2 = (long) (d2 & 1048575);
        if (a(obj2, i3, i2)) {
            java.lang.Object f2 = defpackage.dlc.f(obj, j2);
            java.lang.Object f3 = defpackage.dlc.f(obj2, j2);
            if (f2 != null && f3 != null) {
                defpackage.dlc.a(obj, j2, defpackage.dim.a(f2, f3));
                b(obj, i3, i2);
            } else if (f3 != null) {
                defpackage.dlc.a(obj, j2, f3);
                b(obj, i3, i2);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:197:0x0517  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0520  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0529  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0536  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x0543  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x0550  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x0559  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x0562  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x056b  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x0586  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x0598  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x05a8  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x05b6  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x05c4  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x05ce  */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x05d8  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x05e6  */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x05f4  */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x0608  */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x0615  */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x0622  */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x062f  */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x063c  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x0649  */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x0656  */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x0663  */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x0670  */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x067d  */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x068e  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x069b  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x06a8  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x06b5  */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x06c2  */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x06cf  */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x06dc  */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x06e9  */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x0702  */
    /* JADX WARNING: Removed duplicated region for block: B:277:0x071b  */
    /* JADX WARNING: Removed duplicated region for block: B:280:0x0734  */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x074d  */
    /* JADX WARNING: Removed duplicated region for block: B:286:0x0766  */
    /* JADX WARNING: Removed duplicated region for block: B:289:0x077f  */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x0798  */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x07b1  */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x07ca  */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x07e3  */
    /* JADX WARNING: Removed duplicated region for block: B:304:0x07fc  */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x0815  */
    /* JADX WARNING: Removed duplicated region for block: B:310:0x082e  */
    /* JADX WARNING: Removed duplicated region for block: B:313:0x0847  */
    /* JADX WARNING: Removed duplicated region for block: B:314:0x0858  */
    /* JADX WARNING: Removed duplicated region for block: B:315:0x0867  */
    /* JADX WARNING: Removed duplicated region for block: B:318:0x0874  */
    /* JADX WARNING: Removed duplicated region for block: B:321:0x0881  */
    /* JADX WARNING: Removed duplicated region for block: B:324:0x0892  */
    /* JADX WARNING: Removed duplicated region for block: B:327:0x08a3  */
    /* JADX WARNING: Removed duplicated region for block: B:330:0x08b4  */
    /* JADX WARNING: Removed duplicated region for block: B:333:0x08c1  */
    /* JADX WARNING: Removed duplicated region for block: B:336:0x08ce  */
    /* JADX WARNING: Removed duplicated region for block: B:339:0x08db  */
    /* JADX WARNING: Removed duplicated region for block: B:345:0x08fb  */
    /* JADX WARNING: Removed duplicated region for block: B:348:0x0910  */
    /* JADX WARNING: Removed duplicated region for block: B:351:0x0923  */
    /* JADX WARNING: Removed duplicated region for block: B:354:0x0934  */
    /* JADX WARNING: Removed duplicated region for block: B:357:0x0945  */
    /* JADX WARNING: Removed duplicated region for block: B:360:0x0952  */
    /* JADX WARNING: Removed duplicated region for block: B:363:0x095f  */
    /* JADX WARNING: Removed duplicated region for block: B:366:0x0970  */
    /* JADX WARNING: Removed duplicated region for block: B:369:0x0981  */
    /* JADX WARNING: Removed duplicated region for block: B:509:0x0511 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int b(java.lang.Object r14) {
        /*
            r13 = this;
            boolean r0 = r13.j
            if (r0 == 0) goto L_0x04cf
            sun.misc.Unsafe r3 = b
            r1 = 0
            r0 = 0
            r2 = r1
            r1 = r0
        L_0x000a:
            int[] r0 = r13.c
            int r0 = r0.length
            if (r1 >= r0) goto L_0x04c7
            int r0 = r13.d(r1)
            r4 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = r4 & r0
            int r4 = r4 >>> 20
            int[] r5 = r13.c
            r5 = r5[r1]
            r6 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r6
            long r6 = (long) r0
            dic r0 = defpackage.dic.DOUBLE_LIST_PACKED
            int r0 = r0.k
            if (r4 < r0) goto L_0x002b
            dic r0 = defpackage.dic.SINT64_LIST_PACKED
            int r0 = r0.k
        L_0x002b:
            switch(r4) {
                case 0: goto L_0x0032;
                case 1: goto L_0x003e;
                case 2: goto L_0x004a;
                case 3: goto L_0x005a;
                case 4: goto L_0x006a;
                case 5: goto L_0x007a;
                case 6: goto L_0x0086;
                case 7: goto L_0x0092;
                case 8: goto L_0x009e;
                case 9: goto L_0x00be;
                case 10: goto L_0x00d3;
                case 11: goto L_0x00e6;
                case 12: goto L_0x00f7;
                case 13: goto L_0x0108;
                case 14: goto L_0x0115;
                case 15: goto L_0x0122;
                case 16: goto L_0x0133;
                case 17: goto L_0x0144;
                case 18: goto L_0x015b;
                case 19: goto L_0x0166;
                case 20: goto L_0x0171;
                case 21: goto L_0x017c;
                case 22: goto L_0x0187;
                case 23: goto L_0x0192;
                case 24: goto L_0x019d;
                case 25: goto L_0x01a8;
                case 26: goto L_0x01b3;
                case 27: goto L_0x01be;
                case 28: goto L_0x01cd;
                case 29: goto L_0x01d8;
                case 30: goto L_0x01e3;
                case 31: goto L_0x01ee;
                case 32: goto L_0x01f9;
                case 33: goto L_0x0204;
                case 34: goto L_0x020f;
                case 35: goto L_0x021a;
                case 36: goto L_0x0233;
                case 37: goto L_0x024c;
                case 38: goto L_0x0265;
                case 39: goto L_0x027e;
                case 40: goto L_0x0297;
                case 41: goto L_0x02b0;
                case 42: goto L_0x02c9;
                case 43: goto L_0x02e2;
                case 44: goto L_0x02fb;
                case 45: goto L_0x0314;
                case 46: goto L_0x032d;
                case 47: goto L_0x0346;
                case 48: goto L_0x035f;
                case 49: goto L_0x0378;
                case 50: goto L_0x0387;
                case 51: goto L_0x0396;
                case 52: goto L_0x03a3;
                case 53: goto L_0x03b0;
                case 54: goto L_0x03c1;
                case 55: goto L_0x03d2;
                case 56: goto L_0x03e3;
                case 57: goto L_0x03f0;
                case 58: goto L_0x03fd;
                case 59: goto L_0x040a;
                case 60: goto L_0x042a;
                case 61: goto L_0x043f;
                case 62: goto L_0x0452;
                case 63: goto L_0x0463;
                case 64: goto L_0x0474;
                case 65: goto L_0x0481;
                case 66: goto L_0x048e;
                case 67: goto L_0x049f;
                case 68: goto L_0x04b0;
                default: goto L_0x002e;
            }
        L_0x002e:
            int r0 = r1 + 3
            r1 = r0
            goto L_0x000a
        L_0x0032:
            boolean r0 = r13.a(r14, r1)
            if (r0 == 0) goto L_0x002e
            int r0 = defpackage.dhn.k(r5)
            int r2 = r2 + r0
            goto L_0x002e
        L_0x003e:
            boolean r0 = r13.a(r14, r1)
            if (r0 == 0) goto L_0x002e
            int r0 = defpackage.dhn.j(r5)
            int r2 = r2 + r0
            goto L_0x002e
        L_0x004a:
            boolean r0 = r13.a(r14, r1)
            if (r0 == 0) goto L_0x002e
            long r6 = defpackage.dlc.b(r14, r6)
            int r0 = defpackage.dhn.d(r5, r6)
            int r2 = r2 + r0
            goto L_0x002e
        L_0x005a:
            boolean r0 = r13.a(r14, r1)
            if (r0 == 0) goto L_0x002e
            long r6 = defpackage.dlc.b(r14, r6)
            int r0 = defpackage.dhn.e(r5, r6)
            int r2 = r2 + r0
            goto L_0x002e
        L_0x006a:
            boolean r0 = r13.a(r14, r1)
            if (r0 == 0) goto L_0x002e
            int r0 = defpackage.dlc.a(r14, r6)
            int r0 = defpackage.dhn.f(r5, r0)
            int r2 = r2 + r0
            goto L_0x002e
        L_0x007a:
            boolean r0 = r13.a(r14, r1)
            if (r0 == 0) goto L_0x002e
            int r0 = defpackage.dhn.h(r5)
            int r2 = r2 + r0
            goto L_0x002e
        L_0x0086:
            boolean r0 = r13.a(r14, r1)
            if (r0 == 0) goto L_0x002e
            int r0 = defpackage.dhn.f(r5)
            int r2 = r2 + r0
            goto L_0x002e
        L_0x0092:
            boolean r0 = r13.a(r14, r1)
            if (r0 == 0) goto L_0x002e
            int r0 = defpackage.dhn.l(r5)
            int r2 = r2 + r0
            goto L_0x002e
        L_0x009e:
            boolean r0 = r13.a(r14, r1)
            if (r0 == 0) goto L_0x002e
            java.lang.Object r0 = defpackage.dlc.f(r14, r6)
            boolean r4 = r0 instanceof defpackage.dha
            if (r4 == 0) goto L_0x00b5
            dha r0 = (defpackage.dha) r0
            int r0 = defpackage.dhn.c(r5, r0)
            int r2 = r2 + r0
            goto L_0x002e
        L_0x00b5:
            java.lang.String r0 = (java.lang.String) r0
            int r0 = defpackage.dhn.b(r5, r0)
            int r2 = r2 + r0
            goto L_0x002e
        L_0x00be:
            boolean r0 = r13.a(r14, r1)
            if (r0 == 0) goto L_0x002e
            java.lang.Object r0 = defpackage.dlc.f(r14, r6)
            dkh r4 = r13.a(r1)
            int r0 = defpackage.dkj.a(r5, r0, r4)
            int r2 = r2 + r0
            goto L_0x002e
        L_0x00d3:
            boolean r0 = r13.a(r14, r1)
            if (r0 == 0) goto L_0x002e
            java.lang.Object r0 = defpackage.dlc.f(r14, r6)
            dha r0 = (defpackage.dha) r0
            int r0 = defpackage.dhn.c(r5, r0)
            int r2 = r2 + r0
            goto L_0x002e
        L_0x00e6:
            boolean r0 = r13.a(r14, r1)
            if (r0 == 0) goto L_0x002e
            int r0 = defpackage.dlc.a(r14, r6)
            int r0 = defpackage.dhn.g(r5, r0)
            int r2 = r2 + r0
            goto L_0x002e
        L_0x00f7:
            boolean r0 = r13.a(r14, r1)
            if (r0 == 0) goto L_0x002e
            int r0 = defpackage.dlc.a(r14, r6)
            int r0 = defpackage.dhn.i(r5, r0)
            int r2 = r2 + r0
            goto L_0x002e
        L_0x0108:
            boolean r0 = r13.a(r14, r1)
            if (r0 == 0) goto L_0x002e
            int r0 = defpackage.dhn.g(r5)
            int r2 = r2 + r0
            goto L_0x002e
        L_0x0115:
            boolean r0 = r13.a(r14, r1)
            if (r0 == 0) goto L_0x002e
            int r0 = defpackage.dhn.i(r5)
            int r2 = r2 + r0
            goto L_0x002e
        L_0x0122:
            boolean r0 = r13.a(r14, r1)
            if (r0 == 0) goto L_0x002e
            int r0 = defpackage.dlc.a(r14, r6)
            int r0 = defpackage.dhn.h(r5, r0)
            int r2 = r2 + r0
            goto L_0x002e
        L_0x0133:
            boolean r0 = r13.a(r14, r1)
            if (r0 == 0) goto L_0x002e
            long r6 = defpackage.dlc.b(r14, r6)
            int r0 = defpackage.dhn.f(r5, r6)
            int r2 = r2 + r0
            goto L_0x002e
        L_0x0144:
            boolean r0 = r13.a(r14, r1)
            if (r0 == 0) goto L_0x002e
            java.lang.Object r0 = defpackage.dlc.f(r14, r6)
            djo r0 = (defpackage.djo) r0
            dkh r4 = r13.a(r1)
            int r0 = defpackage.dhn.c(r5, r0, r4)
            int r2 = r2 + r0
            goto L_0x002e
        L_0x015b:
            java.util.List r0 = a(r14, r6)
            int r0 = defpackage.dkj.i(r5, r0)
            int r2 = r2 + r0
            goto L_0x002e
        L_0x0166:
            java.util.List r0 = a(r14, r6)
            int r0 = defpackage.dkj.h(r5, r0)
            int r2 = r2 + r0
            goto L_0x002e
        L_0x0171:
            java.util.List r0 = a(r14, r6)
            int r0 = defpackage.dkj.a(r5, r0)
            int r2 = r2 + r0
            goto L_0x002e
        L_0x017c:
            java.util.List r0 = a(r14, r6)
            int r0 = defpackage.dkj.b(r5, r0)
            int r2 = r2 + r0
            goto L_0x002e
        L_0x0187:
            java.util.List r0 = a(r14, r6)
            int r0 = defpackage.dkj.e(r5, r0)
            int r2 = r2 + r0
            goto L_0x002e
        L_0x0192:
            java.util.List r0 = a(r14, r6)
            int r0 = defpackage.dkj.i(r5, r0)
            int r2 = r2 + r0
            goto L_0x002e
        L_0x019d:
            java.util.List r0 = a(r14, r6)
            int r0 = defpackage.dkj.h(r5, r0)
            int r2 = r2 + r0
            goto L_0x002e
        L_0x01a8:
            java.util.List r0 = a(r14, r6)
            int r0 = defpackage.dkj.j(r5, r0)
            int r2 = r2 + r0
            goto L_0x002e
        L_0x01b3:
            java.util.List r0 = a(r14, r6)
            int r0 = defpackage.dkj.k(r5, r0)
            int r2 = r2 + r0
            goto L_0x002e
        L_0x01be:
            java.util.List r0 = a(r14, r6)
            dkh r4 = r13.a(r1)
            int r0 = defpackage.dkj.a(r5, r0, r4)
            int r2 = r2 + r0
            goto L_0x002e
        L_0x01cd:
            java.util.List r0 = a(r14, r6)
            int r0 = defpackage.dkj.l(r5, r0)
            int r2 = r2 + r0
            goto L_0x002e
        L_0x01d8:
            java.util.List r0 = a(r14, r6)
            int r0 = defpackage.dkj.f(r5, r0)
            int r2 = r2 + r0
            goto L_0x002e
        L_0x01e3:
            java.util.List r0 = a(r14, r6)
            int r0 = defpackage.dkj.d(r5, r0)
            int r2 = r2 + r0
            goto L_0x002e
        L_0x01ee:
            java.util.List r0 = a(r14, r6)
            int r0 = defpackage.dkj.h(r5, r0)
            int r2 = r2 + r0
            goto L_0x002e
        L_0x01f9:
            java.util.List r0 = a(r14, r6)
            int r0 = defpackage.dkj.i(r5, r0)
            int r2 = r2 + r0
            goto L_0x002e
        L_0x0204:
            java.util.List r0 = a(r14, r6)
            int r0 = defpackage.dkj.g(r5, r0)
            int r2 = r2 + r0
            goto L_0x002e
        L_0x020f:
            java.util.List r0 = a(r14, r6)
            int r0 = defpackage.dkj.c(r5, r0)
            int r2 = r2 + r0
            goto L_0x002e
        L_0x021a:
            java.lang.Object r0 = r3.getObject(r14, r6)
            java.util.List r0 = (java.util.List) r0
            int r0 = defpackage.dkj.i(r0)
            if (r0 <= 0) goto L_0x002e
            int r4 = defpackage.dhn.m(r5)
            int r5 = defpackage.dhn.o(r0)
            int r4 = r4 + r5
            int r0 = r0 + r4
            int r2 = r2 + r0
            goto L_0x002e
        L_0x0233:
            java.lang.Object r0 = r3.getObject(r14, r6)
            java.util.List r0 = (java.util.List) r0
            int r0 = defpackage.dkj.h(r0)
            if (r0 <= 0) goto L_0x002e
            int r4 = defpackage.dhn.m(r5)
            int r5 = defpackage.dhn.o(r0)
            int r4 = r4 + r5
            int r0 = r0 + r4
            int r2 = r2 + r0
            goto L_0x002e
        L_0x024c:
            java.lang.Object r0 = r3.getObject(r14, r6)
            java.util.List r0 = (java.util.List) r0
            int r0 = defpackage.dkj.a(r0)
            if (r0 <= 0) goto L_0x002e
            int r4 = defpackage.dhn.m(r5)
            int r5 = defpackage.dhn.o(r0)
            int r4 = r4 + r5
            int r0 = r0 + r4
            int r2 = r2 + r0
            goto L_0x002e
        L_0x0265:
            java.lang.Object r0 = r3.getObject(r14, r6)
            java.util.List r0 = (java.util.List) r0
            int r0 = defpackage.dkj.b(r0)
            if (r0 <= 0) goto L_0x002e
            int r4 = defpackage.dhn.m(r5)
            int r5 = defpackage.dhn.o(r0)
            int r4 = r4 + r5
            int r0 = r0 + r4
            int r2 = r2 + r0
            goto L_0x002e
        L_0x027e:
            java.lang.Object r0 = r3.getObject(r14, r6)
            java.util.List r0 = (java.util.List) r0
            int r0 = defpackage.dkj.e(r0)
            if (r0 <= 0) goto L_0x002e
            int r4 = defpackage.dhn.m(r5)
            int r5 = defpackage.dhn.o(r0)
            int r4 = r4 + r5
            int r0 = r0 + r4
            int r2 = r2 + r0
            goto L_0x002e
        L_0x0297:
            java.lang.Object r0 = r3.getObject(r14, r6)
            java.util.List r0 = (java.util.List) r0
            int r0 = defpackage.dkj.i(r0)
            if (r0 <= 0) goto L_0x002e
            int r4 = defpackage.dhn.m(r5)
            int r5 = defpackage.dhn.o(r0)
            int r4 = r4 + r5
            int r0 = r0 + r4
            int r2 = r2 + r0
            goto L_0x002e
        L_0x02b0:
            java.lang.Object r0 = r3.getObject(r14, r6)
            java.util.List r0 = (java.util.List) r0
            int r0 = defpackage.dkj.h(r0)
            if (r0 <= 0) goto L_0x002e
            int r4 = defpackage.dhn.m(r5)
            int r5 = defpackage.dhn.o(r0)
            int r4 = r4 + r5
            int r0 = r0 + r4
            int r2 = r2 + r0
            goto L_0x002e
        L_0x02c9:
            java.lang.Object r0 = r3.getObject(r14, r6)
            java.util.List r0 = (java.util.List) r0
            int r0 = defpackage.dkj.j(r0)
            if (r0 <= 0) goto L_0x002e
            int r4 = defpackage.dhn.m(r5)
            int r5 = defpackage.dhn.o(r0)
            int r4 = r4 + r5
            int r0 = r0 + r4
            int r2 = r2 + r0
            goto L_0x002e
        L_0x02e2:
            java.lang.Object r0 = r3.getObject(r14, r6)
            java.util.List r0 = (java.util.List) r0
            int r0 = defpackage.dkj.f(r0)
            if (r0 <= 0) goto L_0x002e
            int r4 = defpackage.dhn.m(r5)
            int r5 = defpackage.dhn.o(r0)
            int r4 = r4 + r5
            int r0 = r0 + r4
            int r2 = r2 + r0
            goto L_0x002e
        L_0x02fb:
            java.lang.Object r0 = r3.getObject(r14, r6)
            java.util.List r0 = (java.util.List) r0
            int r0 = defpackage.dkj.d(r0)
            if (r0 <= 0) goto L_0x002e
            int r4 = defpackage.dhn.m(r5)
            int r5 = defpackage.dhn.o(r0)
            int r4 = r4 + r5
            int r0 = r0 + r4
            int r2 = r2 + r0
            goto L_0x002e
        L_0x0314:
            java.lang.Object r0 = r3.getObject(r14, r6)
            java.util.List r0 = (java.util.List) r0
            int r0 = defpackage.dkj.h(r0)
            if (r0 <= 0) goto L_0x002e
            int r4 = defpackage.dhn.m(r5)
            int r5 = defpackage.dhn.o(r0)
            int r4 = r4 + r5
            int r0 = r0 + r4
            int r2 = r2 + r0
            goto L_0x002e
        L_0x032d:
            java.lang.Object r0 = r3.getObject(r14, r6)
            java.util.List r0 = (java.util.List) r0
            int r0 = defpackage.dkj.i(r0)
            if (r0 <= 0) goto L_0x002e
            int r4 = defpackage.dhn.m(r5)
            int r5 = defpackage.dhn.o(r0)
            int r4 = r4 + r5
            int r0 = r0 + r4
            int r2 = r2 + r0
            goto L_0x002e
        L_0x0346:
            java.lang.Object r0 = r3.getObject(r14, r6)
            java.util.List r0 = (java.util.List) r0
            int r0 = defpackage.dkj.g(r0)
            if (r0 <= 0) goto L_0x002e
            int r4 = defpackage.dhn.m(r5)
            int r5 = defpackage.dhn.o(r0)
            int r4 = r4 + r5
            int r0 = r0 + r4
            int r2 = r2 + r0
            goto L_0x002e
        L_0x035f:
            java.lang.Object r0 = r3.getObject(r14, r6)
            java.util.List r0 = (java.util.List) r0
            int r0 = defpackage.dkj.c(r0)
            if (r0 <= 0) goto L_0x002e
            int r4 = defpackage.dhn.m(r5)
            int r5 = defpackage.dhn.o(r0)
            int r4 = r4 + r5
            int r0 = r0 + r4
            int r2 = r2 + r0
            goto L_0x002e
        L_0x0378:
            java.util.List r0 = a(r14, r6)
            dkh r4 = r13.a(r1)
            int r0 = defpackage.dkj.b(r5, r0, r4)
            int r2 = r2 + r0
            goto L_0x002e
        L_0x0387:
            java.lang.Object r0 = defpackage.dlc.f(r14, r6)
            java.lang.Object r4 = r13.b(r1)
            int r0 = defpackage.djk.a(r5, r0, r4)
            int r2 = r2 + r0
            goto L_0x002e
        L_0x0396:
            boolean r0 = r13.a(r14, r5, r1)
            if (r0 == 0) goto L_0x002e
            int r0 = defpackage.dhn.k(r5)
            int r2 = r2 + r0
            goto L_0x002e
        L_0x03a3:
            boolean r0 = r13.a(r14, r5, r1)
            if (r0 == 0) goto L_0x002e
            int r0 = defpackage.dhn.j(r5)
            int r2 = r2 + r0
            goto L_0x002e
        L_0x03b0:
            boolean r0 = r13.a(r14, r5, r1)
            if (r0 == 0) goto L_0x002e
            long r6 = e(r14, r6)
            int r0 = defpackage.dhn.d(r5, r6)
            int r2 = r2 + r0
            goto L_0x002e
        L_0x03c1:
            boolean r0 = r13.a(r14, r5, r1)
            if (r0 == 0) goto L_0x002e
            long r6 = e(r14, r6)
            int r0 = defpackage.dhn.e(r5, r6)
            int r2 = r2 + r0
            goto L_0x002e
        L_0x03d2:
            boolean r0 = r13.a(r14, r5, r1)
            if (r0 == 0) goto L_0x002e
            int r0 = d(r14, r6)
            int r0 = defpackage.dhn.f(r5, r0)
            int r2 = r2 + r0
            goto L_0x002e
        L_0x03e3:
            boolean r0 = r13.a(r14, r5, r1)
            if (r0 == 0) goto L_0x002e
            int r0 = defpackage.dhn.h(r5)
            int r2 = r2 + r0
            goto L_0x002e
        L_0x03f0:
            boolean r0 = r13.a(r14, r5, r1)
            if (r0 == 0) goto L_0x002e
            int r0 = defpackage.dhn.f(r5)
            int r2 = r2 + r0
            goto L_0x002e
        L_0x03fd:
            boolean r0 = r13.a(r14, r5, r1)
            if (r0 == 0) goto L_0x002e
            int r0 = defpackage.dhn.l(r5)
            int r2 = r2 + r0
            goto L_0x002e
        L_0x040a:
            boolean r0 = r13.a(r14, r5, r1)
            if (r0 == 0) goto L_0x002e
            java.lang.Object r0 = defpackage.dlc.f(r14, r6)
            boolean r4 = r0 instanceof defpackage.dha
            if (r4 == 0) goto L_0x0421
            dha r0 = (defpackage.dha) r0
            int r0 = defpackage.dhn.c(r5, r0)
            int r2 = r2 + r0
            goto L_0x002e
        L_0x0421:
            java.lang.String r0 = (java.lang.String) r0
            int r0 = defpackage.dhn.b(r5, r0)
            int r2 = r2 + r0
            goto L_0x002e
        L_0x042a:
            boolean r0 = r13.a(r14, r5, r1)
            if (r0 == 0) goto L_0x002e
            java.lang.Object r0 = defpackage.dlc.f(r14, r6)
            dkh r4 = r13.a(r1)
            int r0 = defpackage.dkj.a(r5, r0, r4)
            int r2 = r2 + r0
            goto L_0x002e
        L_0x043f:
            boolean r0 = r13.a(r14, r5, r1)
            if (r0 == 0) goto L_0x002e
            java.lang.Object r0 = defpackage.dlc.f(r14, r6)
            dha r0 = (defpackage.dha) r0
            int r0 = defpackage.dhn.c(r5, r0)
            int r2 = r2 + r0
            goto L_0x002e
        L_0x0452:
            boolean r0 = r13.a(r14, r5, r1)
            if (r0 == 0) goto L_0x002e
            int r0 = d(r14, r6)
            int r0 = defpackage.dhn.g(r5, r0)
            int r2 = r2 + r0
            goto L_0x002e
        L_0x0463:
            boolean r0 = r13.a(r14, r5, r1)
            if (r0 == 0) goto L_0x002e
            int r0 = d(r14, r6)
            int r0 = defpackage.dhn.i(r5, r0)
            int r2 = r2 + r0
            goto L_0x002e
        L_0x0474:
            boolean r0 = r13.a(r14, r5, r1)
            if (r0 == 0) goto L_0x002e
            int r0 = defpackage.dhn.g(r5)
            int r2 = r2 + r0
            goto L_0x002e
        L_0x0481:
            boolean r0 = r13.a(r14, r5, r1)
            if (r0 == 0) goto L_0x002e
            int r0 = defpackage.dhn.i(r5)
            int r2 = r2 + r0
            goto L_0x002e
        L_0x048e:
            boolean r0 = r13.a(r14, r5, r1)
            if (r0 == 0) goto L_0x002e
            int r0 = d(r14, r6)
            int r0 = defpackage.dhn.h(r5, r0)
            int r2 = r2 + r0
            goto L_0x002e
        L_0x049f:
            boolean r0 = r13.a(r14, r5, r1)
            if (r0 == 0) goto L_0x002e
            long r6 = e(r14, r6)
            int r0 = defpackage.dhn.f(r5, r6)
            int r2 = r2 + r0
            goto L_0x002e
        L_0x04b0:
            boolean r0 = r13.a(r14, r5, r1)
            if (r0 == 0) goto L_0x002e
            java.lang.Object r0 = defpackage.dlc.f(r14, r6)
            djo r0 = (defpackage.djo) r0
            dkh r4 = r13.a(r1)
            int r0 = defpackage.dhn.c(r5, r0, r4)
            int r2 = r2 + r0
            goto L_0x002e
        L_0x04c7:
            dkx r0 = r13.p
            int r0 = a(r0, r14)
            int r0 = r0 + r2
        L_0x04ce:
            return r0
        L_0x04cf:
            r3 = 0
            sun.misc.Unsafe r6 = b
            r2 = -1
            r1 = 0
            r0 = 0
            r4 = r3
            r12 = r1
            r1 = r0
            r0 = r12
        L_0x04d9:
            int[] r3 = r13.c
            int r3 = r3.length
            if (r1 >= r3) goto L_0x0998
            int r7 = r13.d(r1)
            int[] r3 = r13.c
            r8 = r3[r1]
            r3 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = r3 & r7
            int r9 = r3 >>> 20
            r3 = 0
            r5 = 17
            if (r9 > r5) goto L_0x09fa
            int[] r3 = r13.c
            int r5 = r1 + 2
            r3 = r3[r5]
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r3
            r10 = 1
            int r3 = r3 >>> 20
            int r3 = r10 << r3
            if (r5 == r2) goto L_0x09fa
            long r10 = (long) r5
            int r0 = r6.getInt(r14, r10)
            r2 = r0
            r0 = r3
            r3 = r5
        L_0x0509:
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r7
            long r10 = (long) r5
            switch(r9) {
                case 0: goto L_0x0517;
                case 1: goto L_0x0520;
                case 2: goto L_0x0529;
                case 3: goto L_0x0536;
                case 4: goto L_0x0543;
                case 5: goto L_0x0550;
                case 6: goto L_0x0559;
                case 7: goto L_0x0562;
                case 8: goto L_0x056b;
                case 9: goto L_0x0586;
                case 10: goto L_0x0598;
                case 11: goto L_0x05a8;
                case 12: goto L_0x05b6;
                case 13: goto L_0x05c4;
                case 14: goto L_0x05ce;
                case 15: goto L_0x05d8;
                case 16: goto L_0x05e6;
                case 17: goto L_0x05f4;
                case 18: goto L_0x0608;
                case 19: goto L_0x0615;
                case 20: goto L_0x0622;
                case 21: goto L_0x062f;
                case 22: goto L_0x063c;
                case 23: goto L_0x0649;
                case 24: goto L_0x0656;
                case 25: goto L_0x0663;
                case 26: goto L_0x0670;
                case 27: goto L_0x067d;
                case 28: goto L_0x068e;
                case 29: goto L_0x069b;
                case 30: goto L_0x06a8;
                case 31: goto L_0x06b5;
                case 32: goto L_0x06c2;
                case 33: goto L_0x06cf;
                case 34: goto L_0x06dc;
                case 35: goto L_0x06e9;
                case 36: goto L_0x0702;
                case 37: goto L_0x071b;
                case 38: goto L_0x0734;
                case 39: goto L_0x074d;
                case 40: goto L_0x0766;
                case 41: goto L_0x077f;
                case 42: goto L_0x0798;
                case 43: goto L_0x07b1;
                case 44: goto L_0x07ca;
                case 45: goto L_0x07e3;
                case 46: goto L_0x07fc;
                case 47: goto L_0x0815;
                case 48: goto L_0x082e;
                case 49: goto L_0x0847;
                case 50: goto L_0x0858;
                case 51: goto L_0x0867;
                case 52: goto L_0x0874;
                case 53: goto L_0x0881;
                case 54: goto L_0x0892;
                case 55: goto L_0x08a3;
                case 56: goto L_0x08b4;
                case 57: goto L_0x08c1;
                case 58: goto L_0x08ce;
                case 59: goto L_0x08db;
                case 60: goto L_0x08fb;
                case 61: goto L_0x0910;
                case 62: goto L_0x0923;
                case 63: goto L_0x0934;
                case 64: goto L_0x0945;
                case 65: goto L_0x0952;
                case 66: goto L_0x095f;
                case 67: goto L_0x0970;
                case 68: goto L_0x0981;
                default: goto L_0x0511;
            }
        L_0x0511:
            int r0 = r1 + 3
            r1 = r0
            r0 = r2
            r2 = r3
            goto L_0x04d9
        L_0x0517:
            r0 = r0 & r2
            if (r0 == 0) goto L_0x0511
            int r0 = defpackage.dhn.k(r8)
            int r4 = r4 + r0
            goto L_0x0511
        L_0x0520:
            r0 = r0 & r2
            if (r0 == 0) goto L_0x0511
            int r0 = defpackage.dhn.j(r8)
            int r4 = r4 + r0
            goto L_0x0511
        L_0x0529:
            r0 = r0 & r2
            if (r0 == 0) goto L_0x0511
            long r10 = r6.getLong(r14, r10)
            int r0 = defpackage.dhn.d(r8, r10)
            int r4 = r4 + r0
            goto L_0x0511
        L_0x0536:
            r0 = r0 & r2
            if (r0 == 0) goto L_0x0511
            long r10 = r6.getLong(r14, r10)
            int r0 = defpackage.dhn.e(r8, r10)
            int r4 = r4 + r0
            goto L_0x0511
        L_0x0543:
            r0 = r0 & r2
            if (r0 == 0) goto L_0x0511
            int r0 = r6.getInt(r14, r10)
            int r0 = defpackage.dhn.f(r8, r0)
            int r4 = r4 + r0
            goto L_0x0511
        L_0x0550:
            r0 = r0 & r2
            if (r0 == 0) goto L_0x0511
            int r0 = defpackage.dhn.h(r8)
            int r4 = r4 + r0
            goto L_0x0511
        L_0x0559:
            r0 = r0 & r2
            if (r0 == 0) goto L_0x0511
            int r0 = defpackage.dhn.f(r8)
            int r4 = r4 + r0
            goto L_0x0511
        L_0x0562:
            r0 = r0 & r2
            if (r0 == 0) goto L_0x0511
            int r0 = defpackage.dhn.l(r8)
            int r4 = r4 + r0
            goto L_0x0511
        L_0x056b:
            r0 = r0 & r2
            if (r0 == 0) goto L_0x0511
            java.lang.Object r0 = r6.getObject(r14, r10)
            boolean r5 = r0 instanceof defpackage.dha
            if (r5 == 0) goto L_0x057e
            dha r0 = (defpackage.dha) r0
            int r0 = defpackage.dhn.c(r8, r0)
            int r4 = r4 + r0
            goto L_0x0511
        L_0x057e:
            java.lang.String r0 = (java.lang.String) r0
            int r0 = defpackage.dhn.b(r8, r0)
            int r4 = r4 + r0
            goto L_0x0511
        L_0x0586:
            r0 = r0 & r2
            if (r0 == 0) goto L_0x0511
            java.lang.Object r0 = r6.getObject(r14, r10)
            dkh r5 = r13.a(r1)
            int r0 = defpackage.dkj.a(r8, r0, r5)
            int r4 = r4 + r0
            goto L_0x0511
        L_0x0598:
            r0 = r0 & r2
            if (r0 == 0) goto L_0x0511
            java.lang.Object r0 = r6.getObject(r14, r10)
            dha r0 = (defpackage.dha) r0
            int r0 = defpackage.dhn.c(r8, r0)
            int r4 = r4 + r0
            goto L_0x0511
        L_0x05a8:
            r0 = r0 & r2
            if (r0 == 0) goto L_0x0511
            int r0 = r6.getInt(r14, r10)
            int r0 = defpackage.dhn.g(r8, r0)
            int r4 = r4 + r0
            goto L_0x0511
        L_0x05b6:
            r0 = r0 & r2
            if (r0 == 0) goto L_0x0511
            int r0 = r6.getInt(r14, r10)
            int r0 = defpackage.dhn.i(r8, r0)
            int r4 = r4 + r0
            goto L_0x0511
        L_0x05c4:
            r0 = r0 & r2
            if (r0 == 0) goto L_0x0511
            int r0 = defpackage.dhn.g(r8)
            int r4 = r4 + r0
            goto L_0x0511
        L_0x05ce:
            r0 = r0 & r2
            if (r0 == 0) goto L_0x0511
            int r0 = defpackage.dhn.i(r8)
            int r4 = r4 + r0
            goto L_0x0511
        L_0x05d8:
            r0 = r0 & r2
            if (r0 == 0) goto L_0x0511
            int r0 = r6.getInt(r14, r10)
            int r0 = defpackage.dhn.h(r8, r0)
            int r4 = r4 + r0
            goto L_0x0511
        L_0x05e6:
            r0 = r0 & r2
            if (r0 == 0) goto L_0x0511
            long r10 = r6.getLong(r14, r10)
            int r0 = defpackage.dhn.f(r8, r10)
            int r4 = r4 + r0
            goto L_0x0511
        L_0x05f4:
            r0 = r0 & r2
            if (r0 == 0) goto L_0x0511
            java.lang.Object r0 = r6.getObject(r14, r10)
            djo r0 = (defpackage.djo) r0
            dkh r5 = r13.a(r1)
            int r0 = defpackage.dhn.c(r8, r0, r5)
            int r4 = r4 + r0
            goto L_0x0511
        L_0x0608:
            java.lang.Object r0 = r6.getObject(r14, r10)
            java.util.List r0 = (java.util.List) r0
            int r0 = defpackage.dkj.i(r8, r0)
            int r4 = r4 + r0
            goto L_0x0511
        L_0x0615:
            java.lang.Object r0 = r6.getObject(r14, r10)
            java.util.List r0 = (java.util.List) r0
            int r0 = defpackage.dkj.h(r8, r0)
            int r4 = r4 + r0
            goto L_0x0511
        L_0x0622:
            java.lang.Object r0 = r6.getObject(r14, r10)
            java.util.List r0 = (java.util.List) r0
            int r0 = defpackage.dkj.a(r8, r0)
            int r4 = r4 + r0
            goto L_0x0511
        L_0x062f:
            java.lang.Object r0 = r6.getObject(r14, r10)
            java.util.List r0 = (java.util.List) r0
            int r0 = defpackage.dkj.b(r8, r0)
            int r4 = r4 + r0
            goto L_0x0511
        L_0x063c:
            java.lang.Object r0 = r6.getObject(r14, r10)
            java.util.List r0 = (java.util.List) r0
            int r0 = defpackage.dkj.e(r8, r0)
            int r4 = r4 + r0
            goto L_0x0511
        L_0x0649:
            java.lang.Object r0 = r6.getObject(r14, r10)
            java.util.List r0 = (java.util.List) r0
            int r0 = defpackage.dkj.i(r8, r0)
            int r4 = r4 + r0
            goto L_0x0511
        L_0x0656:
            java.lang.Object r0 = r6.getObject(r14, r10)
            java.util.List r0 = (java.util.List) r0
            int r0 = defpackage.dkj.h(r8, r0)
            int r4 = r4 + r0
            goto L_0x0511
        L_0x0663:
            java.lang.Object r0 = r6.getObject(r14, r10)
            java.util.List r0 = (java.util.List) r0
            int r0 = defpackage.dkj.j(r8, r0)
            int r4 = r4 + r0
            goto L_0x0511
        L_0x0670:
            java.lang.Object r0 = r6.getObject(r14, r10)
            java.util.List r0 = (java.util.List) r0
            int r0 = defpackage.dkj.k(r8, r0)
            int r4 = r4 + r0
            goto L_0x0511
        L_0x067d:
            java.lang.Object r0 = r6.getObject(r14, r10)
            java.util.List r0 = (java.util.List) r0
            dkh r5 = r13.a(r1)
            int r0 = defpackage.dkj.a(r8, r0, r5)
            int r4 = r4 + r0
            goto L_0x0511
        L_0x068e:
            java.lang.Object r0 = r6.getObject(r14, r10)
            java.util.List r0 = (java.util.List) r0
            int r0 = defpackage.dkj.l(r8, r0)
            int r4 = r4 + r0
            goto L_0x0511
        L_0x069b:
            java.lang.Object r0 = r6.getObject(r14, r10)
            java.util.List r0 = (java.util.List) r0
            int r0 = defpackage.dkj.f(r8, r0)
            int r4 = r4 + r0
            goto L_0x0511
        L_0x06a8:
            java.lang.Object r0 = r6.getObject(r14, r10)
            java.util.List r0 = (java.util.List) r0
            int r0 = defpackage.dkj.d(r8, r0)
            int r4 = r4 + r0
            goto L_0x0511
        L_0x06b5:
            java.lang.Object r0 = r6.getObject(r14, r10)
            java.util.List r0 = (java.util.List) r0
            int r0 = defpackage.dkj.h(r8, r0)
            int r4 = r4 + r0
            goto L_0x0511
        L_0x06c2:
            java.lang.Object r0 = r6.getObject(r14, r10)
            java.util.List r0 = (java.util.List) r0
            int r0 = defpackage.dkj.i(r8, r0)
            int r4 = r4 + r0
            goto L_0x0511
        L_0x06cf:
            java.lang.Object r0 = r6.getObject(r14, r10)
            java.util.List r0 = (java.util.List) r0
            int r0 = defpackage.dkj.g(r8, r0)
            int r4 = r4 + r0
            goto L_0x0511
        L_0x06dc:
            java.lang.Object r0 = r6.getObject(r14, r10)
            java.util.List r0 = (java.util.List) r0
            int r0 = defpackage.dkj.c(r8, r0)
            int r4 = r4 + r0
            goto L_0x0511
        L_0x06e9:
            java.lang.Object r0 = r6.getObject(r14, r10)
            java.util.List r0 = (java.util.List) r0
            int r0 = defpackage.dkj.i(r0)
            if (r0 <= 0) goto L_0x0511
            int r5 = defpackage.dhn.m(r8)
            int r7 = defpackage.dhn.o(r0)
            int r5 = r5 + r7
            int r0 = r0 + r5
            int r4 = r4 + r0
            goto L_0x0511
        L_0x0702:
            java.lang.Object r0 = r6.getObject(r14, r10)
            java.util.List r0 = (java.util.List) r0
            int r0 = defpackage.dkj.h(r0)
            if (r0 <= 0) goto L_0x0511
            int r5 = defpackage.dhn.m(r8)
            int r7 = defpackage.dhn.o(r0)
            int r5 = r5 + r7
            int r0 = r0 + r5
            int r4 = r4 + r0
            goto L_0x0511
        L_0x071b:
            java.lang.Object r0 = r6.getObject(r14, r10)
            java.util.List r0 = (java.util.List) r0
            int r0 = defpackage.dkj.a(r0)
            if (r0 <= 0) goto L_0x0511
            int r5 = defpackage.dhn.m(r8)
            int r7 = defpackage.dhn.o(r0)
            int r5 = r5 + r7
            int r0 = r0 + r5
            int r4 = r4 + r0
            goto L_0x0511
        L_0x0734:
            java.lang.Object r0 = r6.getObject(r14, r10)
            java.util.List r0 = (java.util.List) r0
            int r0 = defpackage.dkj.b(r0)
            if (r0 <= 0) goto L_0x0511
            int r5 = defpackage.dhn.m(r8)
            int r7 = defpackage.dhn.o(r0)
            int r5 = r5 + r7
            int r0 = r0 + r5
            int r4 = r4 + r0
            goto L_0x0511
        L_0x074d:
            java.lang.Object r0 = r6.getObject(r14, r10)
            java.util.List r0 = (java.util.List) r0
            int r0 = defpackage.dkj.e(r0)
            if (r0 <= 0) goto L_0x0511
            int r5 = defpackage.dhn.m(r8)
            int r7 = defpackage.dhn.o(r0)
            int r5 = r5 + r7
            int r0 = r0 + r5
            int r4 = r4 + r0
            goto L_0x0511
        L_0x0766:
            java.lang.Object r0 = r6.getObject(r14, r10)
            java.util.List r0 = (java.util.List) r0
            int r0 = defpackage.dkj.i(r0)
            if (r0 <= 0) goto L_0x0511
            int r5 = defpackage.dhn.m(r8)
            int r7 = defpackage.dhn.o(r0)
            int r5 = r5 + r7
            int r0 = r0 + r5
            int r4 = r4 + r0
            goto L_0x0511
        L_0x077f:
            java.lang.Object r0 = r6.getObject(r14, r10)
            java.util.List r0 = (java.util.List) r0
            int r0 = defpackage.dkj.h(r0)
            if (r0 <= 0) goto L_0x0511
            int r5 = defpackage.dhn.m(r8)
            int r7 = defpackage.dhn.o(r0)
            int r5 = r5 + r7
            int r0 = r0 + r5
            int r4 = r4 + r0
            goto L_0x0511
        L_0x0798:
            java.lang.Object r0 = r6.getObject(r14, r10)
            java.util.List r0 = (java.util.List) r0
            int r0 = defpackage.dkj.j(r0)
            if (r0 <= 0) goto L_0x0511
            int r5 = defpackage.dhn.m(r8)
            int r7 = defpackage.dhn.o(r0)
            int r5 = r5 + r7
            int r0 = r0 + r5
            int r4 = r4 + r0
            goto L_0x0511
        L_0x07b1:
            java.lang.Object r0 = r6.getObject(r14, r10)
            java.util.List r0 = (java.util.List) r0
            int r0 = defpackage.dkj.f(r0)
            if (r0 <= 0) goto L_0x0511
            int r5 = defpackage.dhn.m(r8)
            int r7 = defpackage.dhn.o(r0)
            int r5 = r5 + r7
            int r0 = r0 + r5
            int r4 = r4 + r0
            goto L_0x0511
        L_0x07ca:
            java.lang.Object r0 = r6.getObject(r14, r10)
            java.util.List r0 = (java.util.List) r0
            int r0 = defpackage.dkj.d(r0)
            if (r0 <= 0) goto L_0x0511
            int r5 = defpackage.dhn.m(r8)
            int r7 = defpackage.dhn.o(r0)
            int r5 = r5 + r7
            int r0 = r0 + r5
            int r4 = r4 + r0
            goto L_0x0511
        L_0x07e3:
            java.lang.Object r0 = r6.getObject(r14, r10)
            java.util.List r0 = (java.util.List) r0
            int r0 = defpackage.dkj.h(r0)
            if (r0 <= 0) goto L_0x0511
            int r5 = defpackage.dhn.m(r8)
            int r7 = defpackage.dhn.o(r0)
            int r5 = r5 + r7
            int r0 = r0 + r5
            int r4 = r4 + r0
            goto L_0x0511
        L_0x07fc:
            java.lang.Object r0 = r6.getObject(r14, r10)
            java.util.List r0 = (java.util.List) r0
            int r0 = defpackage.dkj.i(r0)
            if (r0 <= 0) goto L_0x0511
            int r5 = defpackage.dhn.m(r8)
            int r7 = defpackage.dhn.o(r0)
            int r5 = r5 + r7
            int r0 = r0 + r5
            int r4 = r4 + r0
            goto L_0x0511
        L_0x0815:
            java.lang.Object r0 = r6.getObject(r14, r10)
            java.util.List r0 = (java.util.List) r0
            int r0 = defpackage.dkj.g(r0)
            if (r0 <= 0) goto L_0x0511
            int r5 = defpackage.dhn.m(r8)
            int r7 = defpackage.dhn.o(r0)
            int r5 = r5 + r7
            int r0 = r0 + r5
            int r4 = r4 + r0
            goto L_0x0511
        L_0x082e:
            java.lang.Object r0 = r6.getObject(r14, r10)
            java.util.List r0 = (java.util.List) r0
            int r0 = defpackage.dkj.c(r0)
            if (r0 <= 0) goto L_0x0511
            int r5 = defpackage.dhn.m(r8)
            int r7 = defpackage.dhn.o(r0)
            int r5 = r5 + r7
            int r0 = r0 + r5
            int r4 = r4 + r0
            goto L_0x0511
        L_0x0847:
            java.lang.Object r0 = r6.getObject(r14, r10)
            java.util.List r0 = (java.util.List) r0
            dkh r5 = r13.a(r1)
            int r0 = defpackage.dkj.b(r8, r0, r5)
            int r4 = r4 + r0
            goto L_0x0511
        L_0x0858:
            java.lang.Object r0 = r6.getObject(r14, r10)
            java.lang.Object r5 = r13.b(r1)
            int r0 = defpackage.djk.a(r8, r0, r5)
            int r4 = r4 + r0
            goto L_0x0511
        L_0x0867:
            boolean r0 = r13.a(r14, r8, r1)
            if (r0 == 0) goto L_0x0511
            int r0 = defpackage.dhn.k(r8)
            int r4 = r4 + r0
            goto L_0x0511
        L_0x0874:
            boolean r0 = r13.a(r14, r8, r1)
            if (r0 == 0) goto L_0x0511
            int r0 = defpackage.dhn.j(r8)
            int r4 = r4 + r0
            goto L_0x0511
        L_0x0881:
            boolean r0 = r13.a(r14, r8, r1)
            if (r0 == 0) goto L_0x0511
            long r10 = e(r14, r10)
            int r0 = defpackage.dhn.d(r8, r10)
            int r4 = r4 + r0
            goto L_0x0511
        L_0x0892:
            boolean r0 = r13.a(r14, r8, r1)
            if (r0 == 0) goto L_0x0511
            long r10 = e(r14, r10)
            int r0 = defpackage.dhn.e(r8, r10)
            int r4 = r4 + r0
            goto L_0x0511
        L_0x08a3:
            boolean r0 = r13.a(r14, r8, r1)
            if (r0 == 0) goto L_0x0511
            int r0 = d(r14, r10)
            int r0 = defpackage.dhn.f(r8, r0)
            int r4 = r4 + r0
            goto L_0x0511
        L_0x08b4:
            boolean r0 = r13.a(r14, r8, r1)
            if (r0 == 0) goto L_0x0511
            int r0 = defpackage.dhn.h(r8)
            int r4 = r4 + r0
            goto L_0x0511
        L_0x08c1:
            boolean r0 = r13.a(r14, r8, r1)
            if (r0 == 0) goto L_0x0511
            int r0 = defpackage.dhn.f(r8)
            int r4 = r4 + r0
            goto L_0x0511
        L_0x08ce:
            boolean r0 = r13.a(r14, r8, r1)
            if (r0 == 0) goto L_0x0511
            int r0 = defpackage.dhn.l(r8)
            int r4 = r4 + r0
            goto L_0x0511
        L_0x08db:
            boolean r0 = r13.a(r14, r8, r1)
            if (r0 == 0) goto L_0x0511
            java.lang.Object r0 = r6.getObject(r14, r10)
            boolean r5 = r0 instanceof defpackage.dha
            if (r5 == 0) goto L_0x08f2
            dha r0 = (defpackage.dha) r0
            int r0 = defpackage.dhn.c(r8, r0)
            int r4 = r4 + r0
            goto L_0x0511
        L_0x08f2:
            java.lang.String r0 = (java.lang.String) r0
            int r0 = defpackage.dhn.b(r8, r0)
            int r4 = r4 + r0
            goto L_0x0511
        L_0x08fb:
            boolean r0 = r13.a(r14, r8, r1)
            if (r0 == 0) goto L_0x0511
            java.lang.Object r0 = r6.getObject(r14, r10)
            dkh r5 = r13.a(r1)
            int r0 = defpackage.dkj.a(r8, r0, r5)
            int r4 = r4 + r0
            goto L_0x0511
        L_0x0910:
            boolean r0 = r13.a(r14, r8, r1)
            if (r0 == 0) goto L_0x0511
            java.lang.Object r0 = r6.getObject(r14, r10)
            dha r0 = (defpackage.dha) r0
            int r0 = defpackage.dhn.c(r8, r0)
            int r4 = r4 + r0
            goto L_0x0511
        L_0x0923:
            boolean r0 = r13.a(r14, r8, r1)
            if (r0 == 0) goto L_0x0511
            int r0 = d(r14, r10)
            int r0 = defpackage.dhn.g(r8, r0)
            int r4 = r4 + r0
            goto L_0x0511
        L_0x0934:
            boolean r0 = r13.a(r14, r8, r1)
            if (r0 == 0) goto L_0x0511
            int r0 = d(r14, r10)
            int r0 = defpackage.dhn.i(r8, r0)
            int r4 = r4 + r0
            goto L_0x0511
        L_0x0945:
            boolean r0 = r13.a(r14, r8, r1)
            if (r0 == 0) goto L_0x0511
            int r0 = defpackage.dhn.g(r8)
            int r4 = r4 + r0
            goto L_0x0511
        L_0x0952:
            boolean r0 = r13.a(r14, r8, r1)
            if (r0 == 0) goto L_0x0511
            int r0 = defpackage.dhn.i(r8)
            int r4 = r4 + r0
            goto L_0x0511
        L_0x095f:
            boolean r0 = r13.a(r14, r8, r1)
            if (r0 == 0) goto L_0x0511
            int r0 = d(r14, r10)
            int r0 = defpackage.dhn.h(r8, r0)
            int r4 = r4 + r0
            goto L_0x0511
        L_0x0970:
            boolean r0 = r13.a(r14, r8, r1)
            if (r0 == 0) goto L_0x0511
            long r10 = e(r14, r10)
            int r0 = defpackage.dhn.f(r8, r10)
            int r4 = r4 + r0
            goto L_0x0511
        L_0x0981:
            boolean r0 = r13.a(r14, r8, r1)
            if (r0 == 0) goto L_0x0511
            java.lang.Object r0 = r6.getObject(r14, r10)
            djo r0 = (defpackage.djo) r0
            dkh r5 = r13.a(r1)
            int r0 = defpackage.dhn.c(r8, r0, r5)
            int r4 = r4 + r0
            goto L_0x0511
        L_0x0998:
            dkx r0 = r13.p
            int r0 = a(r0, r14)
            int r3 = r4 + r0
            boolean r0 = r13.h
            if (r0 == 0) goto L_0x09f7
            dij r14 = (defpackage.dij) r14
            dia r4 = r14.a
            r1 = 0
            r0 = 0
            r2 = r1
            r1 = r0
        L_0x09ac:
            dkk r0 = r4.a
            int r0 = r0.b()
            if (r1 >= r0) goto L_0x09cd
            dkk r0 = r4.a
            java.util.Map$Entry r5 = r0.b(r1)
            java.lang.Object r0 = r5.getKey()
            dib r0 = (defpackage.dib) r0
            java.lang.Object r5 = r5.getValue()
            int r0 = defpackage.dia.a(r0, r5)
            int r2 = r2 + r0
            int r0 = r1 + 1
            r1 = r0
            goto L_0x09ac
        L_0x09cd:
            dkk r0 = r4.a
            java.lang.Iterable r0 = r0.c()
            java.util.Iterator r4 = r0.iterator()
        L_0x09d7:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x09f3
            java.lang.Object r0 = r4.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            dib r1 = (defpackage.dib) r1
            java.lang.Object r0 = r0.getValue()
            int r0 = defpackage.dia.a(r1, r0)
            int r2 = r2 + r0
            goto L_0x09d7
        L_0x09f3:
            int r0 = r3 + r2
            goto L_0x04ce
        L_0x09f7:
            r0 = r3
            goto L_0x04ce
        L_0x09fa:
            r12 = r3
            r3 = r2
            r2 = r0
            r0 = r12
            goto L_0x0509
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.djr.b(java.lang.Object):int");
    }

    private static int a(defpackage.dkx dkx, java.lang.Object obj) {
        return ((defpackage.dih) obj).s.a();
    }

    private static java.util.List a(java.lang.Object obj, long j2) {
        return (java.util.List) defpackage.dlc.f(obj, j2);
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 553 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0610  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0648  */
    /* JADX WARNING: Removed duplicated region for block: B:335:0x0c0c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.Object r11, defpackage.dlt r12) {
        /*
            r10 = this;
            int r0 = defpackage.bg.at
            int r1 = defpackage.bg.au
            if (r0 != r1) goto L_0x0620
            dkx r0 = r10.p
            a(r0, r11, r12)
            r2 = 0
            r1 = 0
            boolean r0 = r10.h
            if (r0 == 0) goto L_0x0c2a
            r0 = r11
            dij r0 = (defpackage.dij) r0
            dia r3 = r0.a
            dkk r0 = r3.a
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0c2a
            boolean r0 = r3.c
            if (r0 == 0) goto L_0x0062
            diw r0 = new diw
            dkk r1 = r3.a
            java.util.Set r1 = r1.d()
            java.util.Iterator r1 = r1.iterator()
            r0.<init>(r1)
            r1 = r0
        L_0x0032:
            java.lang.Object r0 = r1.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
        L_0x0038:
            int[] r2 = r10.c
            int r2 = r2.length
            int r2 = r2 + -3
            r3 = r2
        L_0x003e:
            if (r3 < 0) goto L_0x060e
            int r4 = r10.d(r3)
            int[] r2 = r10.c
            r5 = r2[r3]
            r2 = r0
        L_0x0049:
            if (r2 == 0) goto L_0x0070
            int r0 = defpackage.dhy.a(r2)
            if (r0 <= r5) goto L_0x0070
            defpackage.dhy.b(r2)
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x006e
            java.lang.Object r0 = r1.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
        L_0x0060:
            r2 = r0
            goto L_0x0049
        L_0x0062:
            dkk r0 = r3.a
            java.util.Set r0 = r0.d()
            java.util.Iterator r0 = r0.iterator()
            r1 = r0
            goto L_0x0032
        L_0x006e:
            r0 = 0
            goto L_0x0060
        L_0x0070:
            r0 = 267386880(0xff00000, float:2.3665827E-29)
            r0 = r0 & r4
            int r0 = r0 >>> 20
            switch(r0) {
                case 0: goto L_0x007d;
                case 1: goto L_0x0090;
                case 2: goto L_0x00a3;
                case 3: goto L_0x00b6;
                case 4: goto L_0x00c9;
                case 5: goto L_0x00dc;
                case 6: goto L_0x00ef;
                case 7: goto L_0x0103;
                case 8: goto L_0x0117;
                case 9: goto L_0x012b;
                case 10: goto L_0x0143;
                case 11: goto L_0x0159;
                case 12: goto L_0x016d;
                case 13: goto L_0x0181;
                case 14: goto L_0x0195;
                case 15: goto L_0x01a9;
                case 16: goto L_0x01bd;
                case 17: goto L_0x01d1;
                case 18: goto L_0x01e9;
                case 19: goto L_0x01fe;
                case 20: goto L_0x0213;
                case 21: goto L_0x0228;
                case 22: goto L_0x023d;
                case 23: goto L_0x0252;
                case 24: goto L_0x0267;
                case 25: goto L_0x027c;
                case 26: goto L_0x0291;
                case 27: goto L_0x02a5;
                case 28: goto L_0x02bd;
                case 29: goto L_0x02d1;
                case 30: goto L_0x02e6;
                case 31: goto L_0x02fb;
                case 32: goto L_0x0310;
                case 33: goto L_0x0325;
                case 34: goto L_0x033a;
                case 35: goto L_0x034f;
                case 36: goto L_0x0364;
                case 37: goto L_0x0379;
                case 38: goto L_0x038e;
                case 39: goto L_0x03a3;
                case 40: goto L_0x03b8;
                case 41: goto L_0x03cd;
                case 42: goto L_0x03e2;
                case 43: goto L_0x03f7;
                case 44: goto L_0x040c;
                case 45: goto L_0x0421;
                case 46: goto L_0x0436;
                case 47: goto L_0x044b;
                case 48: goto L_0x0460;
                case 49: goto L_0x0475;
                case 50: goto L_0x048d;
                case 51: goto L_0x049b;
                case 52: goto L_0x04af;
                case 53: goto L_0x04c3;
                case 54: goto L_0x04d7;
                case 55: goto L_0x04eb;
                case 56: goto L_0x04ff;
                case 57: goto L_0x0513;
                case 58: goto L_0x0527;
                case 59: goto L_0x053b;
                case 60: goto L_0x054f;
                case 61: goto L_0x0567;
                case 62: goto L_0x057d;
                case 63: goto L_0x0591;
                case 64: goto L_0x05a5;
                case 65: goto L_0x05b9;
                case 66: goto L_0x05cd;
                case 67: goto L_0x05e1;
                case 68: goto L_0x05f5;
                default: goto L_0x0078;
            }
        L_0x0078:
            int r0 = r3 + -3
            r3 = r0
            r0 = r2
            goto L_0x003e
        L_0x007d:
            boolean r0 = r10.a(r11, r3)
            if (r0 == 0) goto L_0x0078
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            double r6 = defpackage.dlc.e(r11, r6)
            r12.a(r5, r6)
            goto L_0x0078
        L_0x0090:
            boolean r0 = r10.a(r11, r3)
            if (r0 == 0) goto L_0x0078
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            float r0 = defpackage.dlc.d(r11, r6)
            r12.a(r5, r0)
            goto L_0x0078
        L_0x00a3:
            boolean r0 = r10.a(r11, r3)
            if (r0 == 0) goto L_0x0078
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            long r6 = defpackage.dlc.b(r11, r6)
            r12.a(r5, r6)
            goto L_0x0078
        L_0x00b6:
            boolean r0 = r10.a(r11, r3)
            if (r0 == 0) goto L_0x0078
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            long r6 = defpackage.dlc.b(r11, r6)
            r12.c(r5, r6)
            goto L_0x0078
        L_0x00c9:
            boolean r0 = r10.a(r11, r3)
            if (r0 == 0) goto L_0x0078
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            int r0 = defpackage.dlc.a(r11, r6)
            r12.c(r5, r0)
            goto L_0x0078
        L_0x00dc:
            boolean r0 = r10.a(r11, r3)
            if (r0 == 0) goto L_0x0078
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            long r6 = defpackage.dlc.b(r11, r6)
            r12.d(r5, r6)
            goto L_0x0078
        L_0x00ef:
            boolean r0 = r10.a(r11, r3)
            if (r0 == 0) goto L_0x0078
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            int r0 = defpackage.dlc.a(r11, r6)
            r12.d(r5, r0)
            goto L_0x0078
        L_0x0103:
            boolean r0 = r10.a(r11, r3)
            if (r0 == 0) goto L_0x0078
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            boolean r0 = defpackage.dlc.c(r11, r6)
            r12.a(r5, r0)
            goto L_0x0078
        L_0x0117:
            boolean r0 = r10.a(r11, r3)
            if (r0 == 0) goto L_0x0078
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            java.lang.Object r0 = defpackage.dlc.f(r11, r6)
            a(r5, r0, r12)
            goto L_0x0078
        L_0x012b:
            boolean r0 = r10.a(r11, r3)
            if (r0 == 0) goto L_0x0078
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            java.lang.Object r0 = defpackage.dlc.f(r11, r6)
            dkh r4 = r10.a(r3)
            r12.a(r5, r0, r4)
            goto L_0x0078
        L_0x0143:
            boolean r0 = r10.a(r11, r3)
            if (r0 == 0) goto L_0x0078
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            java.lang.Object r0 = defpackage.dlc.f(r11, r6)
            dha r0 = (defpackage.dha) r0
            r12.a(r5, r0)
            goto L_0x0078
        L_0x0159:
            boolean r0 = r10.a(r11, r3)
            if (r0 == 0) goto L_0x0078
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            int r0 = defpackage.dlc.a(r11, r6)
            r12.e(r5, r0)
            goto L_0x0078
        L_0x016d:
            boolean r0 = r10.a(r11, r3)
            if (r0 == 0) goto L_0x0078
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            int r0 = defpackage.dlc.a(r11, r6)
            r12.b(r5, r0)
            goto L_0x0078
        L_0x0181:
            boolean r0 = r10.a(r11, r3)
            if (r0 == 0) goto L_0x0078
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            int r0 = defpackage.dlc.a(r11, r6)
            r12.a(r5, r0)
            goto L_0x0078
        L_0x0195:
            boolean r0 = r10.a(r11, r3)
            if (r0 == 0) goto L_0x0078
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            long r6 = defpackage.dlc.b(r11, r6)
            r12.b(r5, r6)
            goto L_0x0078
        L_0x01a9:
            boolean r0 = r10.a(r11, r3)
            if (r0 == 0) goto L_0x0078
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            int r0 = defpackage.dlc.a(r11, r6)
            r12.f(r5, r0)
            goto L_0x0078
        L_0x01bd:
            boolean r0 = r10.a(r11, r3)
            if (r0 == 0) goto L_0x0078
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            long r6 = defpackage.dlc.b(r11, r6)
            r12.e(r5, r6)
            goto L_0x0078
        L_0x01d1:
            boolean r0 = r10.a(r11, r3)
            if (r0 == 0) goto L_0x0078
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            java.lang.Object r0 = defpackage.dlc.f(r11, r6)
            dkh r4 = r10.a(r3)
            r12.b(r5, r0, r4)
            goto L_0x0078
        L_0x01e9:
            int[] r0 = r10.c
            r5 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            java.lang.Object r0 = defpackage.dlc.f(r11, r6)
            java.util.List r0 = (java.util.List) r0
            r4 = 0
            defpackage.dkj.a(r5, r0, r12, r4)
            goto L_0x0078
        L_0x01fe:
            int[] r0 = r10.c
            r5 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            java.lang.Object r0 = defpackage.dlc.f(r11, r6)
            java.util.List r0 = (java.util.List) r0
            r4 = 0
            defpackage.dkj.b(r5, r0, r12, r4)
            goto L_0x0078
        L_0x0213:
            int[] r0 = r10.c
            r5 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            java.lang.Object r0 = defpackage.dlc.f(r11, r6)
            java.util.List r0 = (java.util.List) r0
            r4 = 0
            defpackage.dkj.c(r5, r0, r12, r4)
            goto L_0x0078
        L_0x0228:
            int[] r0 = r10.c
            r5 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            java.lang.Object r0 = defpackage.dlc.f(r11, r6)
            java.util.List r0 = (java.util.List) r0
            r4 = 0
            defpackage.dkj.d(r5, r0, r12, r4)
            goto L_0x0078
        L_0x023d:
            int[] r0 = r10.c
            r5 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            java.lang.Object r0 = defpackage.dlc.f(r11, r6)
            java.util.List r0 = (java.util.List) r0
            r4 = 0
            defpackage.dkj.h(r5, r0, r12, r4)
            goto L_0x0078
        L_0x0252:
            int[] r0 = r10.c
            r5 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            java.lang.Object r0 = defpackage.dlc.f(r11, r6)
            java.util.List r0 = (java.util.List) r0
            r4 = 0
            defpackage.dkj.f(r5, r0, r12, r4)
            goto L_0x0078
        L_0x0267:
            int[] r0 = r10.c
            r5 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            java.lang.Object r0 = defpackage.dlc.f(r11, r6)
            java.util.List r0 = (java.util.List) r0
            r4 = 0
            defpackage.dkj.k(r5, r0, r12, r4)
            goto L_0x0078
        L_0x027c:
            int[] r0 = r10.c
            r5 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            java.lang.Object r0 = defpackage.dlc.f(r11, r6)
            java.util.List r0 = (java.util.List) r0
            r4 = 0
            defpackage.dkj.n(r5, r0, r12, r4)
            goto L_0x0078
        L_0x0291:
            int[] r0 = r10.c
            r5 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            java.lang.Object r0 = defpackage.dlc.f(r11, r6)
            java.util.List r0 = (java.util.List) r0
            defpackage.dkj.a(r5, r0, r12)
            goto L_0x0078
        L_0x02a5:
            int[] r0 = r10.c
            r5 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            java.lang.Object r0 = defpackage.dlc.f(r11, r6)
            java.util.List r0 = (java.util.List) r0
            dkh r4 = r10.a(r3)
            defpackage.dkj.a(r5, r0, r12, r4)
            goto L_0x0078
        L_0x02bd:
            int[] r0 = r10.c
            r5 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            java.lang.Object r0 = defpackage.dlc.f(r11, r6)
            java.util.List r0 = (java.util.List) r0
            defpackage.dkj.b(r5, r0, r12)
            goto L_0x0078
        L_0x02d1:
            int[] r0 = r10.c
            r5 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            java.lang.Object r0 = defpackage.dlc.f(r11, r6)
            java.util.List r0 = (java.util.List) r0
            r4 = 0
            defpackage.dkj.i(r5, r0, r12, r4)
            goto L_0x0078
        L_0x02e6:
            int[] r0 = r10.c
            r5 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            java.lang.Object r0 = defpackage.dlc.f(r11, r6)
            java.util.List r0 = (java.util.List) r0
            r4 = 0
            defpackage.dkj.m(r5, r0, r12, r4)
            goto L_0x0078
        L_0x02fb:
            int[] r0 = r10.c
            r5 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            java.lang.Object r0 = defpackage.dlc.f(r11, r6)
            java.util.List r0 = (java.util.List) r0
            r4 = 0
            defpackage.dkj.l(r5, r0, r12, r4)
            goto L_0x0078
        L_0x0310:
            int[] r0 = r10.c
            r5 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            java.lang.Object r0 = defpackage.dlc.f(r11, r6)
            java.util.List r0 = (java.util.List) r0
            r4 = 0
            defpackage.dkj.g(r5, r0, r12, r4)
            goto L_0x0078
        L_0x0325:
            int[] r0 = r10.c
            r5 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            java.lang.Object r0 = defpackage.dlc.f(r11, r6)
            java.util.List r0 = (java.util.List) r0
            r4 = 0
            defpackage.dkj.j(r5, r0, r12, r4)
            goto L_0x0078
        L_0x033a:
            int[] r0 = r10.c
            r5 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            java.lang.Object r0 = defpackage.dlc.f(r11, r6)
            java.util.List r0 = (java.util.List) r0
            r4 = 0
            defpackage.dkj.e(r5, r0, r12, r4)
            goto L_0x0078
        L_0x034f:
            int[] r0 = r10.c
            r5 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            java.lang.Object r0 = defpackage.dlc.f(r11, r6)
            java.util.List r0 = (java.util.List) r0
            r4 = 1
            defpackage.dkj.a(r5, r0, r12, r4)
            goto L_0x0078
        L_0x0364:
            int[] r0 = r10.c
            r5 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            java.lang.Object r0 = defpackage.dlc.f(r11, r6)
            java.util.List r0 = (java.util.List) r0
            r4 = 1
            defpackage.dkj.b(r5, r0, r12, r4)
            goto L_0x0078
        L_0x0379:
            int[] r0 = r10.c
            r5 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            java.lang.Object r0 = defpackage.dlc.f(r11, r6)
            java.util.List r0 = (java.util.List) r0
            r4 = 1
            defpackage.dkj.c(r5, r0, r12, r4)
            goto L_0x0078
        L_0x038e:
            int[] r0 = r10.c
            r5 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            java.lang.Object r0 = defpackage.dlc.f(r11, r6)
            java.util.List r0 = (java.util.List) r0
            r4 = 1
            defpackage.dkj.d(r5, r0, r12, r4)
            goto L_0x0078
        L_0x03a3:
            int[] r0 = r10.c
            r5 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            java.lang.Object r0 = defpackage.dlc.f(r11, r6)
            java.util.List r0 = (java.util.List) r0
            r4 = 1
            defpackage.dkj.h(r5, r0, r12, r4)
            goto L_0x0078
        L_0x03b8:
            int[] r0 = r10.c
            r5 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            java.lang.Object r0 = defpackage.dlc.f(r11, r6)
            java.util.List r0 = (java.util.List) r0
            r4 = 1
            defpackage.dkj.f(r5, r0, r12, r4)
            goto L_0x0078
        L_0x03cd:
            int[] r0 = r10.c
            r5 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            java.lang.Object r0 = defpackage.dlc.f(r11, r6)
            java.util.List r0 = (java.util.List) r0
            r4 = 1
            defpackage.dkj.k(r5, r0, r12, r4)
            goto L_0x0078
        L_0x03e2:
            int[] r0 = r10.c
            r5 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            java.lang.Object r0 = defpackage.dlc.f(r11, r6)
            java.util.List r0 = (java.util.List) r0
            r4 = 1
            defpackage.dkj.n(r5, r0, r12, r4)
            goto L_0x0078
        L_0x03f7:
            int[] r0 = r10.c
            r5 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            java.lang.Object r0 = defpackage.dlc.f(r11, r6)
            java.util.List r0 = (java.util.List) r0
            r4 = 1
            defpackage.dkj.i(r5, r0, r12, r4)
            goto L_0x0078
        L_0x040c:
            int[] r0 = r10.c
            r5 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            java.lang.Object r0 = defpackage.dlc.f(r11, r6)
            java.util.List r0 = (java.util.List) r0
            r4 = 1
            defpackage.dkj.m(r5, r0, r12, r4)
            goto L_0x0078
        L_0x0421:
            int[] r0 = r10.c
            r5 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            java.lang.Object r0 = defpackage.dlc.f(r11, r6)
            java.util.List r0 = (java.util.List) r0
            r4 = 1
            defpackage.dkj.l(r5, r0, r12, r4)
            goto L_0x0078
        L_0x0436:
            int[] r0 = r10.c
            r5 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            java.lang.Object r0 = defpackage.dlc.f(r11, r6)
            java.util.List r0 = (java.util.List) r0
            r4 = 1
            defpackage.dkj.g(r5, r0, r12, r4)
            goto L_0x0078
        L_0x044b:
            int[] r0 = r10.c
            r5 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            java.lang.Object r0 = defpackage.dlc.f(r11, r6)
            java.util.List r0 = (java.util.List) r0
            r4 = 1
            defpackage.dkj.j(r5, r0, r12, r4)
            goto L_0x0078
        L_0x0460:
            int[] r0 = r10.c
            r5 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            java.lang.Object r0 = defpackage.dlc.f(r11, r6)
            java.util.List r0 = (java.util.List) r0
            r4 = 1
            defpackage.dkj.e(r5, r0, r12, r4)
            goto L_0x0078
        L_0x0475:
            int[] r0 = r10.c
            r5 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            java.lang.Object r0 = defpackage.dlc.f(r11, r6)
            java.util.List r0 = (java.util.List) r0
            dkh r4 = r10.a(r3)
            defpackage.dkj.b(r5, r0, r12, r4)
            goto L_0x0078
        L_0x048d:
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            java.lang.Object r0 = defpackage.dlc.f(r11, r6)
            r10.a(r12, r5, r0, r3)
            goto L_0x0078
        L_0x049b:
            boolean r0 = r10.a(r11, r5, r3)
            if (r0 == 0) goto L_0x0078
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            double r6 = b(r11, r6)
            r12.a(r5, r6)
            goto L_0x0078
        L_0x04af:
            boolean r0 = r10.a(r11, r5, r3)
            if (r0 == 0) goto L_0x0078
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            float r0 = c(r11, r6)
            r12.a(r5, r0)
            goto L_0x0078
        L_0x04c3:
            boolean r0 = r10.a(r11, r5, r3)
            if (r0 == 0) goto L_0x0078
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            long r6 = e(r11, r6)
            r12.a(r5, r6)
            goto L_0x0078
        L_0x04d7:
            boolean r0 = r10.a(r11, r5, r3)
            if (r0 == 0) goto L_0x0078
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            long r6 = e(r11, r6)
            r12.c(r5, r6)
            goto L_0x0078
        L_0x04eb:
            boolean r0 = r10.a(r11, r5, r3)
            if (r0 == 0) goto L_0x0078
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            int r0 = d(r11, r6)
            r12.c(r5, r0)
            goto L_0x0078
        L_0x04ff:
            boolean r0 = r10.a(r11, r5, r3)
            if (r0 == 0) goto L_0x0078
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            long r6 = e(r11, r6)
            r12.d(r5, r6)
            goto L_0x0078
        L_0x0513:
            boolean r0 = r10.a(r11, r5, r3)
            if (r0 == 0) goto L_0x0078
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            int r0 = d(r11, r6)
            r12.d(r5, r0)
            goto L_0x0078
        L_0x0527:
            boolean r0 = r10.a(r11, r5, r3)
            if (r0 == 0) goto L_0x0078
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            boolean r0 = f(r11, r6)
            r12.a(r5, r0)
            goto L_0x0078
        L_0x053b:
            boolean r0 = r10.a(r11, r5, r3)
            if (r0 == 0) goto L_0x0078
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            java.lang.Object r0 = defpackage.dlc.f(r11, r6)
            a(r5, r0, r12)
            goto L_0x0078
        L_0x054f:
            boolean r0 = r10.a(r11, r5, r3)
            if (r0 == 0) goto L_0x0078
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            java.lang.Object r0 = defpackage.dlc.f(r11, r6)
            dkh r4 = r10.a(r3)
            r12.a(r5, r0, r4)
            goto L_0x0078
        L_0x0567:
            boolean r0 = r10.a(r11, r5, r3)
            if (r0 == 0) goto L_0x0078
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            java.lang.Object r0 = defpackage.dlc.f(r11, r6)
            dha r0 = (defpackage.dha) r0
            r12.a(r5, r0)
            goto L_0x0078
        L_0x057d:
            boolean r0 = r10.a(r11, r5, r3)
            if (r0 == 0) goto L_0x0078
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            int r0 = d(r11, r6)
            r12.e(r5, r0)
            goto L_0x0078
        L_0x0591:
            boolean r0 = r10.a(r11, r5, r3)
            if (r0 == 0) goto L_0x0078
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            int r0 = d(r11, r6)
            r12.b(r5, r0)
            goto L_0x0078
        L_0x05a5:
            boolean r0 = r10.a(r11, r5, r3)
            if (r0 == 0) goto L_0x0078
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            int r0 = d(r11, r6)
            r12.a(r5, r0)
            goto L_0x0078
        L_0x05b9:
            boolean r0 = r10.a(r11, r5, r3)
            if (r0 == 0) goto L_0x0078
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            long r6 = e(r11, r6)
            r12.b(r5, r6)
            goto L_0x0078
        L_0x05cd:
            boolean r0 = r10.a(r11, r5, r3)
            if (r0 == 0) goto L_0x0078
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            int r0 = d(r11, r6)
            r12.f(r5, r0)
            goto L_0x0078
        L_0x05e1:
            boolean r0 = r10.a(r11, r5, r3)
            if (r0 == 0) goto L_0x0078
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            long r6 = e(r11, r6)
            r12.e(r5, r6)
            goto L_0x0078
        L_0x05f5:
            boolean r0 = r10.a(r11, r5, r3)
            if (r0 == 0) goto L_0x0078
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r6 = (long) r0
            java.lang.Object r0 = defpackage.dlc.f(r11, r6)
            dkh r4 = r10.a(r3)
            r12.b(r5, r0, r4)
            goto L_0x0078
        L_0x060d:
            r0 = 0
        L_0x060e:
            if (r0 == 0) goto L_0x0c21
            defpackage.dhy.b(r0)
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x060d
            java.lang.Object r0 = r1.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            goto L_0x060e
        L_0x0620:
            boolean r0 = r10.j
            if (r0 == 0) goto L_0x0c22
            r2 = 0
            r1 = 0
            boolean r0 = r10.h
            if (r0 == 0) goto L_0x0c26
            r0 = r11
            dij r0 = (defpackage.dij) r0
            dia r0 = r0.a
            dkk r3 = r0.a
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x0c26
            java.util.Iterator r1 = r0.b()
            java.lang.Object r0 = r1.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
        L_0x0641:
            int[] r2 = r10.c
            int r4 = r2.length
            r2 = 0
            r3 = r2
        L_0x0646:
            if (r3 >= r4) goto L_0x0c0a
            int r5 = r10.d(r3)
            int[] r2 = r10.c
            r6 = r2[r3]
            r2 = r0
        L_0x0651:
            if (r2 == 0) goto L_0x066c
            int r0 = defpackage.dhy.a(r2)
            if (r0 > r6) goto L_0x066c
            defpackage.dhy.b(r2)
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x066a
            java.lang.Object r0 = r1.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
        L_0x0668:
            r2 = r0
            goto L_0x0651
        L_0x066a:
            r0 = 0
            goto L_0x0668
        L_0x066c:
            r0 = 267386880(0xff00000, float:2.3665827E-29)
            r0 = r0 & r5
            int r0 = r0 >>> 20
            switch(r0) {
                case 0: goto L_0x0679;
                case 1: goto L_0x068c;
                case 2: goto L_0x069f;
                case 3: goto L_0x06b2;
                case 4: goto L_0x06c5;
                case 5: goto L_0x06d8;
                case 6: goto L_0x06eb;
                case 7: goto L_0x06ff;
                case 8: goto L_0x0713;
                case 9: goto L_0x0727;
                case 10: goto L_0x073f;
                case 11: goto L_0x0755;
                case 12: goto L_0x0769;
                case 13: goto L_0x077d;
                case 14: goto L_0x0791;
                case 15: goto L_0x07a5;
                case 16: goto L_0x07b9;
                case 17: goto L_0x07cd;
                case 18: goto L_0x07e5;
                case 19: goto L_0x07fa;
                case 20: goto L_0x080f;
                case 21: goto L_0x0824;
                case 22: goto L_0x0839;
                case 23: goto L_0x084e;
                case 24: goto L_0x0863;
                case 25: goto L_0x0878;
                case 26: goto L_0x088d;
                case 27: goto L_0x08a1;
                case 28: goto L_0x08b9;
                case 29: goto L_0x08cd;
                case 30: goto L_0x08e2;
                case 31: goto L_0x08f7;
                case 32: goto L_0x090c;
                case 33: goto L_0x0921;
                case 34: goto L_0x0936;
                case 35: goto L_0x094b;
                case 36: goto L_0x0960;
                case 37: goto L_0x0975;
                case 38: goto L_0x098a;
                case 39: goto L_0x099f;
                case 40: goto L_0x09b4;
                case 41: goto L_0x09c9;
                case 42: goto L_0x09de;
                case 43: goto L_0x09f3;
                case 44: goto L_0x0a08;
                case 45: goto L_0x0a1d;
                case 46: goto L_0x0a32;
                case 47: goto L_0x0a47;
                case 48: goto L_0x0a5c;
                case 49: goto L_0x0a71;
                case 50: goto L_0x0a89;
                case 51: goto L_0x0a97;
                case 52: goto L_0x0aab;
                case 53: goto L_0x0abf;
                case 54: goto L_0x0ad3;
                case 55: goto L_0x0ae7;
                case 56: goto L_0x0afb;
                case 57: goto L_0x0b0f;
                case 58: goto L_0x0b23;
                case 59: goto L_0x0b37;
                case 60: goto L_0x0b4b;
                case 61: goto L_0x0b63;
                case 62: goto L_0x0b79;
                case 63: goto L_0x0b8d;
                case 64: goto L_0x0ba1;
                case 65: goto L_0x0bb5;
                case 66: goto L_0x0bc9;
                case 67: goto L_0x0bdd;
                case 68: goto L_0x0bf1;
                default: goto L_0x0674;
            }
        L_0x0674:
            int r0 = r3 + 3
            r3 = r0
            r0 = r2
            goto L_0x0646
        L_0x0679:
            boolean r0 = r10.a(r11, r3)
            if (r0 == 0) goto L_0x0674
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            double r8 = defpackage.dlc.e(r11, r8)
            r12.a(r6, r8)
            goto L_0x0674
        L_0x068c:
            boolean r0 = r10.a(r11, r3)
            if (r0 == 0) goto L_0x0674
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            float r0 = defpackage.dlc.d(r11, r8)
            r12.a(r6, r0)
            goto L_0x0674
        L_0x069f:
            boolean r0 = r10.a(r11, r3)
            if (r0 == 0) goto L_0x0674
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            long r8 = defpackage.dlc.b(r11, r8)
            r12.a(r6, r8)
            goto L_0x0674
        L_0x06b2:
            boolean r0 = r10.a(r11, r3)
            if (r0 == 0) goto L_0x0674
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            long r8 = defpackage.dlc.b(r11, r8)
            r12.c(r6, r8)
            goto L_0x0674
        L_0x06c5:
            boolean r0 = r10.a(r11, r3)
            if (r0 == 0) goto L_0x0674
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            int r0 = defpackage.dlc.a(r11, r8)
            r12.c(r6, r0)
            goto L_0x0674
        L_0x06d8:
            boolean r0 = r10.a(r11, r3)
            if (r0 == 0) goto L_0x0674
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            long r8 = defpackage.dlc.b(r11, r8)
            r12.d(r6, r8)
            goto L_0x0674
        L_0x06eb:
            boolean r0 = r10.a(r11, r3)
            if (r0 == 0) goto L_0x0674
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            int r0 = defpackage.dlc.a(r11, r8)
            r12.d(r6, r0)
            goto L_0x0674
        L_0x06ff:
            boolean r0 = r10.a(r11, r3)
            if (r0 == 0) goto L_0x0674
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            boolean r0 = defpackage.dlc.c(r11, r8)
            r12.a(r6, r0)
            goto L_0x0674
        L_0x0713:
            boolean r0 = r10.a(r11, r3)
            if (r0 == 0) goto L_0x0674
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            java.lang.Object r0 = defpackage.dlc.f(r11, r8)
            a(r6, r0, r12)
            goto L_0x0674
        L_0x0727:
            boolean r0 = r10.a(r11, r3)
            if (r0 == 0) goto L_0x0674
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            java.lang.Object r0 = defpackage.dlc.f(r11, r8)
            dkh r5 = r10.a(r3)
            r12.a(r6, r0, r5)
            goto L_0x0674
        L_0x073f:
            boolean r0 = r10.a(r11, r3)
            if (r0 == 0) goto L_0x0674
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            java.lang.Object r0 = defpackage.dlc.f(r11, r8)
            dha r0 = (defpackage.dha) r0
            r12.a(r6, r0)
            goto L_0x0674
        L_0x0755:
            boolean r0 = r10.a(r11, r3)
            if (r0 == 0) goto L_0x0674
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            int r0 = defpackage.dlc.a(r11, r8)
            r12.e(r6, r0)
            goto L_0x0674
        L_0x0769:
            boolean r0 = r10.a(r11, r3)
            if (r0 == 0) goto L_0x0674
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            int r0 = defpackage.dlc.a(r11, r8)
            r12.b(r6, r0)
            goto L_0x0674
        L_0x077d:
            boolean r0 = r10.a(r11, r3)
            if (r0 == 0) goto L_0x0674
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            int r0 = defpackage.dlc.a(r11, r8)
            r12.a(r6, r0)
            goto L_0x0674
        L_0x0791:
            boolean r0 = r10.a(r11, r3)
            if (r0 == 0) goto L_0x0674
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            long r8 = defpackage.dlc.b(r11, r8)
            r12.b(r6, r8)
            goto L_0x0674
        L_0x07a5:
            boolean r0 = r10.a(r11, r3)
            if (r0 == 0) goto L_0x0674
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            int r0 = defpackage.dlc.a(r11, r8)
            r12.f(r6, r0)
            goto L_0x0674
        L_0x07b9:
            boolean r0 = r10.a(r11, r3)
            if (r0 == 0) goto L_0x0674
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            long r8 = defpackage.dlc.b(r11, r8)
            r12.e(r6, r8)
            goto L_0x0674
        L_0x07cd:
            boolean r0 = r10.a(r11, r3)
            if (r0 == 0) goto L_0x0674
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            java.lang.Object r0 = defpackage.dlc.f(r11, r8)
            dkh r5 = r10.a(r3)
            r12.b(r6, r0, r5)
            goto L_0x0674
        L_0x07e5:
            int[] r0 = r10.c
            r6 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            java.lang.Object r0 = defpackage.dlc.f(r11, r8)
            java.util.List r0 = (java.util.List) r0
            r5 = 0
            defpackage.dkj.a(r6, r0, r12, r5)
            goto L_0x0674
        L_0x07fa:
            int[] r0 = r10.c
            r6 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            java.lang.Object r0 = defpackage.dlc.f(r11, r8)
            java.util.List r0 = (java.util.List) r0
            r5 = 0
            defpackage.dkj.b(r6, r0, r12, r5)
            goto L_0x0674
        L_0x080f:
            int[] r0 = r10.c
            r6 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            java.lang.Object r0 = defpackage.dlc.f(r11, r8)
            java.util.List r0 = (java.util.List) r0
            r5 = 0
            defpackage.dkj.c(r6, r0, r12, r5)
            goto L_0x0674
        L_0x0824:
            int[] r0 = r10.c
            r6 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            java.lang.Object r0 = defpackage.dlc.f(r11, r8)
            java.util.List r0 = (java.util.List) r0
            r5 = 0
            defpackage.dkj.d(r6, r0, r12, r5)
            goto L_0x0674
        L_0x0839:
            int[] r0 = r10.c
            r6 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            java.lang.Object r0 = defpackage.dlc.f(r11, r8)
            java.util.List r0 = (java.util.List) r0
            r5 = 0
            defpackage.dkj.h(r6, r0, r12, r5)
            goto L_0x0674
        L_0x084e:
            int[] r0 = r10.c
            r6 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            java.lang.Object r0 = defpackage.dlc.f(r11, r8)
            java.util.List r0 = (java.util.List) r0
            r5 = 0
            defpackage.dkj.f(r6, r0, r12, r5)
            goto L_0x0674
        L_0x0863:
            int[] r0 = r10.c
            r6 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            java.lang.Object r0 = defpackage.dlc.f(r11, r8)
            java.util.List r0 = (java.util.List) r0
            r5 = 0
            defpackage.dkj.k(r6, r0, r12, r5)
            goto L_0x0674
        L_0x0878:
            int[] r0 = r10.c
            r6 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            java.lang.Object r0 = defpackage.dlc.f(r11, r8)
            java.util.List r0 = (java.util.List) r0
            r5 = 0
            defpackage.dkj.n(r6, r0, r12, r5)
            goto L_0x0674
        L_0x088d:
            int[] r0 = r10.c
            r6 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            java.lang.Object r0 = defpackage.dlc.f(r11, r8)
            java.util.List r0 = (java.util.List) r0
            defpackage.dkj.a(r6, r0, r12)
            goto L_0x0674
        L_0x08a1:
            int[] r0 = r10.c
            r6 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            java.lang.Object r0 = defpackage.dlc.f(r11, r8)
            java.util.List r0 = (java.util.List) r0
            dkh r5 = r10.a(r3)
            defpackage.dkj.a(r6, r0, r12, r5)
            goto L_0x0674
        L_0x08b9:
            int[] r0 = r10.c
            r6 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            java.lang.Object r0 = defpackage.dlc.f(r11, r8)
            java.util.List r0 = (java.util.List) r0
            defpackage.dkj.b(r6, r0, r12)
            goto L_0x0674
        L_0x08cd:
            int[] r0 = r10.c
            r6 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            java.lang.Object r0 = defpackage.dlc.f(r11, r8)
            java.util.List r0 = (java.util.List) r0
            r5 = 0
            defpackage.dkj.i(r6, r0, r12, r5)
            goto L_0x0674
        L_0x08e2:
            int[] r0 = r10.c
            r6 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            java.lang.Object r0 = defpackage.dlc.f(r11, r8)
            java.util.List r0 = (java.util.List) r0
            r5 = 0
            defpackage.dkj.m(r6, r0, r12, r5)
            goto L_0x0674
        L_0x08f7:
            int[] r0 = r10.c
            r6 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            java.lang.Object r0 = defpackage.dlc.f(r11, r8)
            java.util.List r0 = (java.util.List) r0
            r5 = 0
            defpackage.dkj.l(r6, r0, r12, r5)
            goto L_0x0674
        L_0x090c:
            int[] r0 = r10.c
            r6 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            java.lang.Object r0 = defpackage.dlc.f(r11, r8)
            java.util.List r0 = (java.util.List) r0
            r5 = 0
            defpackage.dkj.g(r6, r0, r12, r5)
            goto L_0x0674
        L_0x0921:
            int[] r0 = r10.c
            r6 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            java.lang.Object r0 = defpackage.dlc.f(r11, r8)
            java.util.List r0 = (java.util.List) r0
            r5 = 0
            defpackage.dkj.j(r6, r0, r12, r5)
            goto L_0x0674
        L_0x0936:
            int[] r0 = r10.c
            r6 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            java.lang.Object r0 = defpackage.dlc.f(r11, r8)
            java.util.List r0 = (java.util.List) r0
            r5 = 0
            defpackage.dkj.e(r6, r0, r12, r5)
            goto L_0x0674
        L_0x094b:
            int[] r0 = r10.c
            r6 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            java.lang.Object r0 = defpackage.dlc.f(r11, r8)
            java.util.List r0 = (java.util.List) r0
            r5 = 1
            defpackage.dkj.a(r6, r0, r12, r5)
            goto L_0x0674
        L_0x0960:
            int[] r0 = r10.c
            r6 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            java.lang.Object r0 = defpackage.dlc.f(r11, r8)
            java.util.List r0 = (java.util.List) r0
            r5 = 1
            defpackage.dkj.b(r6, r0, r12, r5)
            goto L_0x0674
        L_0x0975:
            int[] r0 = r10.c
            r6 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            java.lang.Object r0 = defpackage.dlc.f(r11, r8)
            java.util.List r0 = (java.util.List) r0
            r5 = 1
            defpackage.dkj.c(r6, r0, r12, r5)
            goto L_0x0674
        L_0x098a:
            int[] r0 = r10.c
            r6 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            java.lang.Object r0 = defpackage.dlc.f(r11, r8)
            java.util.List r0 = (java.util.List) r0
            r5 = 1
            defpackage.dkj.d(r6, r0, r12, r5)
            goto L_0x0674
        L_0x099f:
            int[] r0 = r10.c
            r6 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            java.lang.Object r0 = defpackage.dlc.f(r11, r8)
            java.util.List r0 = (java.util.List) r0
            r5 = 1
            defpackage.dkj.h(r6, r0, r12, r5)
            goto L_0x0674
        L_0x09b4:
            int[] r0 = r10.c
            r6 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            java.lang.Object r0 = defpackage.dlc.f(r11, r8)
            java.util.List r0 = (java.util.List) r0
            r5 = 1
            defpackage.dkj.f(r6, r0, r12, r5)
            goto L_0x0674
        L_0x09c9:
            int[] r0 = r10.c
            r6 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            java.lang.Object r0 = defpackage.dlc.f(r11, r8)
            java.util.List r0 = (java.util.List) r0
            r5 = 1
            defpackage.dkj.k(r6, r0, r12, r5)
            goto L_0x0674
        L_0x09de:
            int[] r0 = r10.c
            r6 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            java.lang.Object r0 = defpackage.dlc.f(r11, r8)
            java.util.List r0 = (java.util.List) r0
            r5 = 1
            defpackage.dkj.n(r6, r0, r12, r5)
            goto L_0x0674
        L_0x09f3:
            int[] r0 = r10.c
            r6 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            java.lang.Object r0 = defpackage.dlc.f(r11, r8)
            java.util.List r0 = (java.util.List) r0
            r5 = 1
            defpackage.dkj.i(r6, r0, r12, r5)
            goto L_0x0674
        L_0x0a08:
            int[] r0 = r10.c
            r6 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            java.lang.Object r0 = defpackage.dlc.f(r11, r8)
            java.util.List r0 = (java.util.List) r0
            r5 = 1
            defpackage.dkj.m(r6, r0, r12, r5)
            goto L_0x0674
        L_0x0a1d:
            int[] r0 = r10.c
            r6 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            java.lang.Object r0 = defpackage.dlc.f(r11, r8)
            java.util.List r0 = (java.util.List) r0
            r5 = 1
            defpackage.dkj.l(r6, r0, r12, r5)
            goto L_0x0674
        L_0x0a32:
            int[] r0 = r10.c
            r6 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            java.lang.Object r0 = defpackage.dlc.f(r11, r8)
            java.util.List r0 = (java.util.List) r0
            r5 = 1
            defpackage.dkj.g(r6, r0, r12, r5)
            goto L_0x0674
        L_0x0a47:
            int[] r0 = r10.c
            r6 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            java.lang.Object r0 = defpackage.dlc.f(r11, r8)
            java.util.List r0 = (java.util.List) r0
            r5 = 1
            defpackage.dkj.j(r6, r0, r12, r5)
            goto L_0x0674
        L_0x0a5c:
            int[] r0 = r10.c
            r6 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            java.lang.Object r0 = defpackage.dlc.f(r11, r8)
            java.util.List r0 = (java.util.List) r0
            r5 = 1
            defpackage.dkj.e(r6, r0, r12, r5)
            goto L_0x0674
        L_0x0a71:
            int[] r0 = r10.c
            r6 = r0[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            java.lang.Object r0 = defpackage.dlc.f(r11, r8)
            java.util.List r0 = (java.util.List) r0
            dkh r5 = r10.a(r3)
            defpackage.dkj.b(r6, r0, r12, r5)
            goto L_0x0674
        L_0x0a89:
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            java.lang.Object r0 = defpackage.dlc.f(r11, r8)
            r10.a(r12, r6, r0, r3)
            goto L_0x0674
        L_0x0a97:
            boolean r0 = r10.a(r11, r6, r3)
            if (r0 == 0) goto L_0x0674
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            double r8 = b(r11, r8)
            r12.a(r6, r8)
            goto L_0x0674
        L_0x0aab:
            boolean r0 = r10.a(r11, r6, r3)
            if (r0 == 0) goto L_0x0674
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            float r0 = c(r11, r8)
            r12.a(r6, r0)
            goto L_0x0674
        L_0x0abf:
            boolean r0 = r10.a(r11, r6, r3)
            if (r0 == 0) goto L_0x0674
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            long r8 = e(r11, r8)
            r12.a(r6, r8)
            goto L_0x0674
        L_0x0ad3:
            boolean r0 = r10.a(r11, r6, r3)
            if (r0 == 0) goto L_0x0674
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            long r8 = e(r11, r8)
            r12.c(r6, r8)
            goto L_0x0674
        L_0x0ae7:
            boolean r0 = r10.a(r11, r6, r3)
            if (r0 == 0) goto L_0x0674
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            int r0 = d(r11, r8)
            r12.c(r6, r0)
            goto L_0x0674
        L_0x0afb:
            boolean r0 = r10.a(r11, r6, r3)
            if (r0 == 0) goto L_0x0674
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            long r8 = e(r11, r8)
            r12.d(r6, r8)
            goto L_0x0674
        L_0x0b0f:
            boolean r0 = r10.a(r11, r6, r3)
            if (r0 == 0) goto L_0x0674
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            int r0 = d(r11, r8)
            r12.d(r6, r0)
            goto L_0x0674
        L_0x0b23:
            boolean r0 = r10.a(r11, r6, r3)
            if (r0 == 0) goto L_0x0674
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            boolean r0 = f(r11, r8)
            r12.a(r6, r0)
            goto L_0x0674
        L_0x0b37:
            boolean r0 = r10.a(r11, r6, r3)
            if (r0 == 0) goto L_0x0674
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            java.lang.Object r0 = defpackage.dlc.f(r11, r8)
            a(r6, r0, r12)
            goto L_0x0674
        L_0x0b4b:
            boolean r0 = r10.a(r11, r6, r3)
            if (r0 == 0) goto L_0x0674
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            java.lang.Object r0 = defpackage.dlc.f(r11, r8)
            dkh r5 = r10.a(r3)
            r12.a(r6, r0, r5)
            goto L_0x0674
        L_0x0b63:
            boolean r0 = r10.a(r11, r6, r3)
            if (r0 == 0) goto L_0x0674
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            java.lang.Object r0 = defpackage.dlc.f(r11, r8)
            dha r0 = (defpackage.dha) r0
            r12.a(r6, r0)
            goto L_0x0674
        L_0x0b79:
            boolean r0 = r10.a(r11, r6, r3)
            if (r0 == 0) goto L_0x0674
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            int r0 = d(r11, r8)
            r12.e(r6, r0)
            goto L_0x0674
        L_0x0b8d:
            boolean r0 = r10.a(r11, r6, r3)
            if (r0 == 0) goto L_0x0674
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            int r0 = d(r11, r8)
            r12.b(r6, r0)
            goto L_0x0674
        L_0x0ba1:
            boolean r0 = r10.a(r11, r6, r3)
            if (r0 == 0) goto L_0x0674
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            int r0 = d(r11, r8)
            r12.a(r6, r0)
            goto L_0x0674
        L_0x0bb5:
            boolean r0 = r10.a(r11, r6, r3)
            if (r0 == 0) goto L_0x0674
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            long r8 = e(r11, r8)
            r12.b(r6, r8)
            goto L_0x0674
        L_0x0bc9:
            boolean r0 = r10.a(r11, r6, r3)
            if (r0 == 0) goto L_0x0674
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            int r0 = d(r11, r8)
            r12.f(r6, r0)
            goto L_0x0674
        L_0x0bdd:
            boolean r0 = r10.a(r11, r6, r3)
            if (r0 == 0) goto L_0x0674
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            long r8 = e(r11, r8)
            r12.e(r6, r8)
            goto L_0x0674
        L_0x0bf1:
            boolean r0 = r10.a(r11, r6, r3)
            if (r0 == 0) goto L_0x0674
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r8 = (long) r0
            java.lang.Object r0 = defpackage.dlc.f(r11, r8)
            dkh r5 = r10.a(r3)
            r12.b(r6, r0, r5)
            goto L_0x0674
        L_0x0c09:
            r0 = 0
        L_0x0c0a:
            if (r0 == 0) goto L_0x0c1c
            defpackage.dhy.b(r0)
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0c09
            java.lang.Object r0 = r1.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            goto L_0x0c0a
        L_0x0c1c:
            dkx r0 = r10.p
            a(r0, r11, r12)
        L_0x0c21:
            return
        L_0x0c22:
            r10.b(r11, r12)
            goto L_0x0c21
        L_0x0c26:
            r0 = r1
            r1 = r2
            goto L_0x0641
        L_0x0c2a:
            r0 = r1
            r1 = r2
            goto L_0x0038
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.djr.a(java.lang.Object, dlt):void");
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 388 */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0655  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0033  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void b(java.lang.Object r18, defpackage.dlt r19) {
        /*
            r17 = this;
            r4 = 0
            r3 = 0
            r0 = r17
            boolean r2 = r0.h
            if (r2 == 0) goto L_0x067b
            r2 = r18
            dij r2 = (defpackage.dij) r2
            dia r2 = r2.a
            dkk r5 = r2.a
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x067b
            java.util.Iterator r3 = r2.b()
            java.lang.Object r2 = r3.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
        L_0x0020:
            r6 = -1
            r5 = 0
            r0 = r17
            int[] r4 = r0.c
            int r9 = r4.length
            sun.misc.Unsafe r10 = b
            r4 = 0
            r8 = r4
            r16 = r5
            r5 = r6
            r6 = r2
            r2 = r16
        L_0x0031:
            if (r8 >= r9) goto L_0x0679
            r0 = r17
            int r11 = r0.d(r8)
            r0 = r17
            int[] r4 = r0.c
            r12 = r4[r8]
            r4 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = r4 & r11
            int r13 = r4 >>> 20
            r4 = 0
            r0 = r17
            boolean r7 = r0.j
            if (r7 != 0) goto L_0x0674
            r7 = 17
            if (r13 > r7) goto L_0x0674
            r0 = r17
            int[] r4 = r0.c
            int r7 = r8 + 2
            r7 = r4[r7]
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r7
            if (r4 == r5) goto L_0x0671
            long r14 = (long) r4
            r0 = r18
            int r2 = r10.getInt(r0, r14)
        L_0x0064:
            r5 = 1
            int r7 = r7 >>> 20
            int r5 = r5 << r7
            r7 = r6
            r6 = r4
            r4 = r5
            r5 = r2
        L_0x006c:
            if (r7 == 0) goto L_0x0087
            int r2 = defpackage.dhy.a(r7)
            if (r2 > r12) goto L_0x0087
            defpackage.dhy.b(r7)
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L_0x0085
            java.lang.Object r2 = r3.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
        L_0x0083:
            r7 = r2
            goto L_0x006c
        L_0x0085:
            r2 = 0
            goto L_0x0083
        L_0x0087:
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r2 & r11
            long r14 = (long) r2
            switch(r13) {
                case 0: goto L_0x0096;
                case 1: goto L_0x00a6;
                case 2: goto L_0x00b6;
                case 3: goto L_0x00c6;
                case 4: goto L_0x00d6;
                case 5: goto L_0x00e6;
                case 6: goto L_0x00f6;
                case 7: goto L_0x0106;
                case 8: goto L_0x0117;
                case 9: goto L_0x0128;
                case 10: goto L_0x013f;
                case 11: goto L_0x0152;
                case 12: goto L_0x0163;
                case 13: goto L_0x0174;
                case 14: goto L_0x0185;
                case 15: goto L_0x0196;
                case 16: goto L_0x01a7;
                case 17: goto L_0x01b8;
                case 18: goto L_0x01cf;
                case 19: goto L_0x01e5;
                case 20: goto L_0x01fb;
                case 21: goto L_0x0211;
                case 22: goto L_0x0227;
                case 23: goto L_0x023d;
                case 24: goto L_0x0253;
                case 25: goto L_0x0269;
                case 26: goto L_0x027f;
                case 27: goto L_0x0294;
                case 28: goto L_0x02af;
                case 29: goto L_0x02c4;
                case 30: goto L_0x02da;
                case 31: goto L_0x02f0;
                case 32: goto L_0x0306;
                case 33: goto L_0x031c;
                case 34: goto L_0x0332;
                case 35: goto L_0x0348;
                case 36: goto L_0x035e;
                case 37: goto L_0x0374;
                case 38: goto L_0x038a;
                case 39: goto L_0x03a0;
                case 40: goto L_0x03b6;
                case 41: goto L_0x03cc;
                case 42: goto L_0x03e2;
                case 43: goto L_0x03f8;
                case 44: goto L_0x040e;
                case 45: goto L_0x0424;
                case 46: goto L_0x043a;
                case 47: goto L_0x0450;
                case 48: goto L_0x0466;
                case 49: goto L_0x047c;
                case 50: goto L_0x0497;
                case 51: goto L_0x04a6;
                case 52: goto L_0x04bd;
                case 53: goto L_0x04d4;
                case 54: goto L_0x04eb;
                case 55: goto L_0x0502;
                case 56: goto L_0x0519;
                case 57: goto L_0x0530;
                case 58: goto L_0x0547;
                case 59: goto L_0x055e;
                case 60: goto L_0x0575;
                case 61: goto L_0x0592;
                case 62: goto L_0x05ab;
                case 63: goto L_0x05c2;
                case 64: goto L_0x05d9;
                case 65: goto L_0x05f0;
                case 66: goto L_0x0607;
                case 67: goto L_0x061e;
                case 68: goto L_0x0635;
                default: goto L_0x008f;
            }
        L_0x008f:
            int r2 = r8 + 3
            r8 = r2
            r2 = r5
            r5 = r6
            r6 = r7
            goto L_0x0031
        L_0x0096:
            r2 = r5 & r4
            if (r2 == 0) goto L_0x008f
            r0 = r18
            double r14 = defpackage.dlc.e(r0, r14)
            r0 = r19
            r0.a(r12, r14)
            goto L_0x008f
        L_0x00a6:
            r2 = r5 & r4
            if (r2 == 0) goto L_0x008f
            r0 = r18
            float r2 = defpackage.dlc.d(r0, r14)
            r0 = r19
            r0.a(r12, r2)
            goto L_0x008f
        L_0x00b6:
            r2 = r5 & r4
            if (r2 == 0) goto L_0x008f
            r0 = r18
            long r14 = r10.getLong(r0, r14)
            r0 = r19
            r0.a(r12, r14)
            goto L_0x008f
        L_0x00c6:
            r2 = r5 & r4
            if (r2 == 0) goto L_0x008f
            r0 = r18
            long r14 = r10.getLong(r0, r14)
            r0 = r19
            r0.c(r12, r14)
            goto L_0x008f
        L_0x00d6:
            r2 = r5 & r4
            if (r2 == 0) goto L_0x008f
            r0 = r18
            int r2 = r10.getInt(r0, r14)
            r0 = r19
            r0.c(r12, r2)
            goto L_0x008f
        L_0x00e6:
            r2 = r5 & r4
            if (r2 == 0) goto L_0x008f
            r0 = r18
            long r14 = r10.getLong(r0, r14)
            r0 = r19
            r0.d(r12, r14)
            goto L_0x008f
        L_0x00f6:
            r2 = r5 & r4
            if (r2 == 0) goto L_0x008f
            r0 = r18
            int r2 = r10.getInt(r0, r14)
            r0 = r19
            r0.d(r12, r2)
            goto L_0x008f
        L_0x0106:
            r2 = r5 & r4
            if (r2 == 0) goto L_0x008f
            r0 = r18
            boolean r2 = defpackage.dlc.c(r0, r14)
            r0 = r19
            r0.a(r12, r2)
            goto L_0x008f
        L_0x0117:
            r2 = r5 & r4
            if (r2 == 0) goto L_0x008f
            r0 = r18
            java.lang.Object r2 = r10.getObject(r0, r14)
            r0 = r19
            a(r12, r2, r0)
            goto L_0x008f
        L_0x0128:
            r2 = r5 & r4
            if (r2 == 0) goto L_0x008f
            r0 = r18
            java.lang.Object r2 = r10.getObject(r0, r14)
            r0 = r17
            dkh r4 = r0.a(r8)
            r0 = r19
            r0.a(r12, r2, r4)
            goto L_0x008f
        L_0x013f:
            r2 = r5 & r4
            if (r2 == 0) goto L_0x008f
            r0 = r18
            java.lang.Object r2 = r10.getObject(r0, r14)
            dha r2 = (defpackage.dha) r2
            r0 = r19
            r0.a(r12, r2)
            goto L_0x008f
        L_0x0152:
            r2 = r5 & r4
            if (r2 == 0) goto L_0x008f
            r0 = r18
            int r2 = r10.getInt(r0, r14)
            r0 = r19
            r0.e(r12, r2)
            goto L_0x008f
        L_0x0163:
            r2 = r5 & r4
            if (r2 == 0) goto L_0x008f
            r0 = r18
            int r2 = r10.getInt(r0, r14)
            r0 = r19
            r0.b(r12, r2)
            goto L_0x008f
        L_0x0174:
            r2 = r5 & r4
            if (r2 == 0) goto L_0x008f
            r0 = r18
            int r2 = r10.getInt(r0, r14)
            r0 = r19
            r0.a(r12, r2)
            goto L_0x008f
        L_0x0185:
            r2 = r5 & r4
            if (r2 == 0) goto L_0x008f
            r0 = r18
            long r14 = r10.getLong(r0, r14)
            r0 = r19
            r0.b(r12, r14)
            goto L_0x008f
        L_0x0196:
            r2 = r5 & r4
            if (r2 == 0) goto L_0x008f
            r0 = r18
            int r2 = r10.getInt(r0, r14)
            r0 = r19
            r0.f(r12, r2)
            goto L_0x008f
        L_0x01a7:
            r2 = r5 & r4
            if (r2 == 0) goto L_0x008f
            r0 = r18
            long r14 = r10.getLong(r0, r14)
            r0 = r19
            r0.e(r12, r14)
            goto L_0x008f
        L_0x01b8:
            r2 = r5 & r4
            if (r2 == 0) goto L_0x008f
            r0 = r18
            java.lang.Object r2 = r10.getObject(r0, r14)
            r0 = r17
            dkh r4 = r0.a(r8)
            r0 = r19
            r0.b(r12, r2, r4)
            goto L_0x008f
        L_0x01cf:
            r0 = r17
            int[] r2 = r0.c
            r4 = r2[r8]
            r0 = r18
            java.lang.Object r2 = r10.getObject(r0, r14)
            java.util.List r2 = (java.util.List) r2
            r11 = 0
            r0 = r19
            defpackage.dkj.a(r4, r2, r0, r11)
            goto L_0x008f
        L_0x01e5:
            r0 = r17
            int[] r2 = r0.c
            r4 = r2[r8]
            r0 = r18
            java.lang.Object r2 = r10.getObject(r0, r14)
            java.util.List r2 = (java.util.List) r2
            r11 = 0
            r0 = r19
            defpackage.dkj.b(r4, r2, r0, r11)
            goto L_0x008f
        L_0x01fb:
            r0 = r17
            int[] r2 = r0.c
            r4 = r2[r8]
            r0 = r18
            java.lang.Object r2 = r10.getObject(r0, r14)
            java.util.List r2 = (java.util.List) r2
            r11 = 0
            r0 = r19
            defpackage.dkj.c(r4, r2, r0, r11)
            goto L_0x008f
        L_0x0211:
            r0 = r17
            int[] r2 = r0.c
            r4 = r2[r8]
            r0 = r18
            java.lang.Object r2 = r10.getObject(r0, r14)
            java.util.List r2 = (java.util.List) r2
            r11 = 0
            r0 = r19
            defpackage.dkj.d(r4, r2, r0, r11)
            goto L_0x008f
        L_0x0227:
            r0 = r17
            int[] r2 = r0.c
            r4 = r2[r8]
            r0 = r18
            java.lang.Object r2 = r10.getObject(r0, r14)
            java.util.List r2 = (java.util.List) r2
            r11 = 0
            r0 = r19
            defpackage.dkj.h(r4, r2, r0, r11)
            goto L_0x008f
        L_0x023d:
            r0 = r17
            int[] r2 = r0.c
            r4 = r2[r8]
            r0 = r18
            java.lang.Object r2 = r10.getObject(r0, r14)
            java.util.List r2 = (java.util.List) r2
            r11 = 0
            r0 = r19
            defpackage.dkj.f(r4, r2, r0, r11)
            goto L_0x008f
        L_0x0253:
            r0 = r17
            int[] r2 = r0.c
            r4 = r2[r8]
            r0 = r18
            java.lang.Object r2 = r10.getObject(r0, r14)
            java.util.List r2 = (java.util.List) r2
            r11 = 0
            r0 = r19
            defpackage.dkj.k(r4, r2, r0, r11)
            goto L_0x008f
        L_0x0269:
            r0 = r17
            int[] r2 = r0.c
            r4 = r2[r8]
            r0 = r18
            java.lang.Object r2 = r10.getObject(r0, r14)
            java.util.List r2 = (java.util.List) r2
            r11 = 0
            r0 = r19
            defpackage.dkj.n(r4, r2, r0, r11)
            goto L_0x008f
        L_0x027f:
            r0 = r17
            int[] r2 = r0.c
            r4 = r2[r8]
            r0 = r18
            java.lang.Object r2 = r10.getObject(r0, r14)
            java.util.List r2 = (java.util.List) r2
            r0 = r19
            defpackage.dkj.a(r4, r2, r0)
            goto L_0x008f
        L_0x0294:
            r0 = r17
            int[] r2 = r0.c
            r4 = r2[r8]
            r0 = r18
            java.lang.Object r2 = r10.getObject(r0, r14)
            java.util.List r2 = (java.util.List) r2
            r0 = r17
            dkh r11 = r0.a(r8)
            r0 = r19
            defpackage.dkj.a(r4, r2, r0, r11)
            goto L_0x008f
        L_0x02af:
            r0 = r17
            int[] r2 = r0.c
            r4 = r2[r8]
            r0 = r18
            java.lang.Object r2 = r10.getObject(r0, r14)
            java.util.List r2 = (java.util.List) r2
            r0 = r19
            defpackage.dkj.b(r4, r2, r0)
            goto L_0x008f
        L_0x02c4:
            r0 = r17
            int[] r2 = r0.c
            r4 = r2[r8]
            r0 = r18
            java.lang.Object r2 = r10.getObject(r0, r14)
            java.util.List r2 = (java.util.List) r2
            r11 = 0
            r0 = r19
            defpackage.dkj.i(r4, r2, r0, r11)
            goto L_0x008f
        L_0x02da:
            r0 = r17
            int[] r2 = r0.c
            r4 = r2[r8]
            r0 = r18
            java.lang.Object r2 = r10.getObject(r0, r14)
            java.util.List r2 = (java.util.List) r2
            r11 = 0
            r0 = r19
            defpackage.dkj.m(r4, r2, r0, r11)
            goto L_0x008f
        L_0x02f0:
            r0 = r17
            int[] r2 = r0.c
            r4 = r2[r8]
            r0 = r18
            java.lang.Object r2 = r10.getObject(r0, r14)
            java.util.List r2 = (java.util.List) r2
            r11 = 0
            r0 = r19
            defpackage.dkj.l(r4, r2, r0, r11)
            goto L_0x008f
        L_0x0306:
            r0 = r17
            int[] r2 = r0.c
            r4 = r2[r8]
            r0 = r18
            java.lang.Object r2 = r10.getObject(r0, r14)
            java.util.List r2 = (java.util.List) r2
            r11 = 0
            r0 = r19
            defpackage.dkj.g(r4, r2, r0, r11)
            goto L_0x008f
        L_0x031c:
            r0 = r17
            int[] r2 = r0.c
            r4 = r2[r8]
            r0 = r18
            java.lang.Object r2 = r10.getObject(r0, r14)
            java.util.List r2 = (java.util.List) r2
            r11 = 0
            r0 = r19
            defpackage.dkj.j(r4, r2, r0, r11)
            goto L_0x008f
        L_0x0332:
            r0 = r17
            int[] r2 = r0.c
            r4 = r2[r8]
            r0 = r18
            java.lang.Object r2 = r10.getObject(r0, r14)
            java.util.List r2 = (java.util.List) r2
            r11 = 0
            r0 = r19
            defpackage.dkj.e(r4, r2, r0, r11)
            goto L_0x008f
        L_0x0348:
            r0 = r17
            int[] r2 = r0.c
            r4 = r2[r8]
            r0 = r18
            java.lang.Object r2 = r10.getObject(r0, r14)
            java.util.List r2 = (java.util.List) r2
            r11 = 1
            r0 = r19
            defpackage.dkj.a(r4, r2, r0, r11)
            goto L_0x008f
        L_0x035e:
            r0 = r17
            int[] r2 = r0.c
            r4 = r2[r8]
            r0 = r18
            java.lang.Object r2 = r10.getObject(r0, r14)
            java.util.List r2 = (java.util.List) r2
            r11 = 1
            r0 = r19
            defpackage.dkj.b(r4, r2, r0, r11)
            goto L_0x008f
        L_0x0374:
            r0 = r17
            int[] r2 = r0.c
            r4 = r2[r8]
            r0 = r18
            java.lang.Object r2 = r10.getObject(r0, r14)
            java.util.List r2 = (java.util.List) r2
            r11 = 1
            r0 = r19
            defpackage.dkj.c(r4, r2, r0, r11)
            goto L_0x008f
        L_0x038a:
            r0 = r17
            int[] r2 = r0.c
            r4 = r2[r8]
            r0 = r18
            java.lang.Object r2 = r10.getObject(r0, r14)
            java.util.List r2 = (java.util.List) r2
            r11 = 1
            r0 = r19
            defpackage.dkj.d(r4, r2, r0, r11)
            goto L_0x008f
        L_0x03a0:
            r0 = r17
            int[] r2 = r0.c
            r4 = r2[r8]
            r0 = r18
            java.lang.Object r2 = r10.getObject(r0, r14)
            java.util.List r2 = (java.util.List) r2
            r11 = 1
            r0 = r19
            defpackage.dkj.h(r4, r2, r0, r11)
            goto L_0x008f
        L_0x03b6:
            r0 = r17
            int[] r2 = r0.c
            r4 = r2[r8]
            r0 = r18
            java.lang.Object r2 = r10.getObject(r0, r14)
            java.util.List r2 = (java.util.List) r2
            r11 = 1
            r0 = r19
            defpackage.dkj.f(r4, r2, r0, r11)
            goto L_0x008f
        L_0x03cc:
            r0 = r17
            int[] r2 = r0.c
            r4 = r2[r8]
            r0 = r18
            java.lang.Object r2 = r10.getObject(r0, r14)
            java.util.List r2 = (java.util.List) r2
            r11 = 1
            r0 = r19
            defpackage.dkj.k(r4, r2, r0, r11)
            goto L_0x008f
        L_0x03e2:
            r0 = r17
            int[] r2 = r0.c
            r4 = r2[r8]
            r0 = r18
            java.lang.Object r2 = r10.getObject(r0, r14)
            java.util.List r2 = (java.util.List) r2
            r11 = 1
            r0 = r19
            defpackage.dkj.n(r4, r2, r0, r11)
            goto L_0x008f
        L_0x03f8:
            r0 = r17
            int[] r2 = r0.c
            r4 = r2[r8]
            r0 = r18
            java.lang.Object r2 = r10.getObject(r0, r14)
            java.util.List r2 = (java.util.List) r2
            r11 = 1
            r0 = r19
            defpackage.dkj.i(r4, r2, r0, r11)
            goto L_0x008f
        L_0x040e:
            r0 = r17
            int[] r2 = r0.c
            r4 = r2[r8]
            r0 = r18
            java.lang.Object r2 = r10.getObject(r0, r14)
            java.util.List r2 = (java.util.List) r2
            r11 = 1
            r0 = r19
            defpackage.dkj.m(r4, r2, r0, r11)
            goto L_0x008f
        L_0x0424:
            r0 = r17
            int[] r2 = r0.c
            r4 = r2[r8]
            r0 = r18
            java.lang.Object r2 = r10.getObject(r0, r14)
            java.util.List r2 = (java.util.List) r2
            r11 = 1
            r0 = r19
            defpackage.dkj.l(r4, r2, r0, r11)
            goto L_0x008f
        L_0x043a:
            r0 = r17
            int[] r2 = r0.c
            r4 = r2[r8]
            r0 = r18
            java.lang.Object r2 = r10.getObject(r0, r14)
            java.util.List r2 = (java.util.List) r2
            r11 = 1
            r0 = r19
            defpackage.dkj.g(r4, r2, r0, r11)
            goto L_0x008f
        L_0x0450:
            r0 = r17
            int[] r2 = r0.c
            r4 = r2[r8]
            r0 = r18
            java.lang.Object r2 = r10.getObject(r0, r14)
            java.util.List r2 = (java.util.List) r2
            r11 = 1
            r0 = r19
            defpackage.dkj.j(r4, r2, r0, r11)
            goto L_0x008f
        L_0x0466:
            r0 = r17
            int[] r2 = r0.c
            r4 = r2[r8]
            r0 = r18
            java.lang.Object r2 = r10.getObject(r0, r14)
            java.util.List r2 = (java.util.List) r2
            r11 = 1
            r0 = r19
            defpackage.dkj.e(r4, r2, r0, r11)
            goto L_0x008f
        L_0x047c:
            r0 = r17
            int[] r2 = r0.c
            r4 = r2[r8]
            r0 = r18
            java.lang.Object r2 = r10.getObject(r0, r14)
            java.util.List r2 = (java.util.List) r2
            r0 = r17
            dkh r11 = r0.a(r8)
            r0 = r19
            defpackage.dkj.b(r4, r2, r0, r11)
            goto L_0x008f
        L_0x0497:
            r0 = r18
            java.lang.Object r2 = r10.getObject(r0, r14)
            r0 = r17
            r1 = r19
            r0.a(r1, r12, r2, r8)
            goto L_0x008f
        L_0x04a6:
            r0 = r17
            r1 = r18
            boolean r2 = r0.a(r1, r12, r8)
            if (r2 == 0) goto L_0x008f
            r0 = r18
            double r14 = b(r0, r14)
            r0 = r19
            r0.a(r12, r14)
            goto L_0x008f
        L_0x04bd:
            r0 = r17
            r1 = r18
            boolean r2 = r0.a(r1, r12, r8)
            if (r2 == 0) goto L_0x008f
            r0 = r18
            float r2 = c(r0, r14)
            r0 = r19
            r0.a(r12, r2)
            goto L_0x008f
        L_0x04d4:
            r0 = r17
            r1 = r18
            boolean r2 = r0.a(r1, r12, r8)
            if (r2 == 0) goto L_0x008f
            r0 = r18
            long r14 = e(r0, r14)
            r0 = r19
            r0.a(r12, r14)
            goto L_0x008f
        L_0x04eb:
            r0 = r17
            r1 = r18
            boolean r2 = r0.a(r1, r12, r8)
            if (r2 == 0) goto L_0x008f
            r0 = r18
            long r14 = e(r0, r14)
            r0 = r19
            r0.c(r12, r14)
            goto L_0x008f
        L_0x0502:
            r0 = r17
            r1 = r18
            boolean r2 = r0.a(r1, r12, r8)
            if (r2 == 0) goto L_0x008f
            r0 = r18
            int r2 = d(r0, r14)
            r0 = r19
            r0.c(r12, r2)
            goto L_0x008f
        L_0x0519:
            r0 = r17
            r1 = r18
            boolean r2 = r0.a(r1, r12, r8)
            if (r2 == 0) goto L_0x008f
            r0 = r18
            long r14 = e(r0, r14)
            r0 = r19
            r0.d(r12, r14)
            goto L_0x008f
        L_0x0530:
            r0 = r17
            r1 = r18
            boolean r2 = r0.a(r1, r12, r8)
            if (r2 == 0) goto L_0x008f
            r0 = r18
            int r2 = d(r0, r14)
            r0 = r19
            r0.d(r12, r2)
            goto L_0x008f
        L_0x0547:
            r0 = r17
            r1 = r18
            boolean r2 = r0.a(r1, r12, r8)
            if (r2 == 0) goto L_0x008f
            r0 = r18
            boolean r2 = f(r0, r14)
            r0 = r19
            r0.a(r12, r2)
            goto L_0x008f
        L_0x055e:
            r0 = r17
            r1 = r18
            boolean r2 = r0.a(r1, r12, r8)
            if (r2 == 0) goto L_0x008f
            r0 = r18
            java.lang.Object r2 = r10.getObject(r0, r14)
            r0 = r19
            a(r12, r2, r0)
            goto L_0x008f
        L_0x0575:
            r0 = r17
            r1 = r18
            boolean r2 = r0.a(r1, r12, r8)
            if (r2 == 0) goto L_0x008f
            r0 = r18
            java.lang.Object r2 = r10.getObject(r0, r14)
            r0 = r17
            dkh r4 = r0.a(r8)
            r0 = r19
            r0.a(r12, r2, r4)
            goto L_0x008f
        L_0x0592:
            r0 = r17
            r1 = r18
            boolean r2 = r0.a(r1, r12, r8)
            if (r2 == 0) goto L_0x008f
            r0 = r18
            java.lang.Object r2 = r10.getObject(r0, r14)
            dha r2 = (defpackage.dha) r2
            r0 = r19
            r0.a(r12, r2)
            goto L_0x008f
        L_0x05ab:
            r0 = r17
            r1 = r18
            boolean r2 = r0.a(r1, r12, r8)
            if (r2 == 0) goto L_0x008f
            r0 = r18
            int r2 = d(r0, r14)
            r0 = r19
            r0.e(r12, r2)
            goto L_0x008f
        L_0x05c2:
            r0 = r17
            r1 = r18
            boolean r2 = r0.a(r1, r12, r8)
            if (r2 == 0) goto L_0x008f
            r0 = r18
            int r2 = d(r0, r14)
            r0 = r19
            r0.b(r12, r2)
            goto L_0x008f
        L_0x05d9:
            r0 = r17
            r1 = r18
            boolean r2 = r0.a(r1, r12, r8)
            if (r2 == 0) goto L_0x008f
            r0 = r18
            int r2 = d(r0, r14)
            r0 = r19
            r0.a(r12, r2)
            goto L_0x008f
        L_0x05f0:
            r0 = r17
            r1 = r18
            boolean r2 = r0.a(r1, r12, r8)
            if (r2 == 0) goto L_0x008f
            r0 = r18
            long r14 = e(r0, r14)
            r0 = r19
            r0.b(r12, r14)
            goto L_0x008f
        L_0x0607:
            r0 = r17
            r1 = r18
            boolean r2 = r0.a(r1, r12, r8)
            if (r2 == 0) goto L_0x008f
            r0 = r18
            int r2 = d(r0, r14)
            r0 = r19
            r0.f(r12, r2)
            goto L_0x008f
        L_0x061e:
            r0 = r17
            r1 = r18
            boolean r2 = r0.a(r1, r12, r8)
            if (r2 == 0) goto L_0x008f
            r0 = r18
            long r14 = e(r0, r14)
            r0 = r19
            r0.e(r12, r14)
            goto L_0x008f
        L_0x0635:
            r0 = r17
            r1 = r18
            boolean r2 = r0.a(r1, r12, r8)
            if (r2 == 0) goto L_0x008f
            r0 = r18
            java.lang.Object r2 = r10.getObject(r0, r14)
            r0 = r17
            dkh r4 = r0.a(r8)
            r0 = r19
            r0.b(r12, r2, r4)
            goto L_0x008f
        L_0x0652:
            r2 = 0
        L_0x0653:
            if (r2 == 0) goto L_0x0665
            defpackage.dhy.b(r2)
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L_0x0652
            java.lang.Object r2 = r3.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0653
        L_0x0665:
            r0 = r17
            dkx r2 = r0.p
            r0 = r18
            r1 = r19
            a(r2, r0, r1)
            return
        L_0x0671:
            r4 = r5
            goto L_0x0064
        L_0x0674:
            r7 = r6
            r6 = r5
            r5 = r2
            goto L_0x006c
        L_0x0679:
            r2 = r6
            goto L_0x0653
        L_0x067b:
            r2 = r3
            r3 = r4
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.djr.b(java.lang.Object, dlt):void");
    }

    private final void a(defpackage.dlt dlt, int i2, java.lang.Object obj, int i3) {
        if (obj != null) {
            defpackage.dji dji = ((defpackage.djh) b(i3)).a;
            for (java.util.Map.Entry entry : ((defpackage.djj) obj).entrySet()) {
                dlt.a.a(i2, 2);
                dlt.a.c(defpackage.djh.a(dji, entry.getKey(), entry.getValue()));
                defpackage.djh.a(dlt.a, dji, entry.getKey(), entry.getValue());
            }
        }
    }

    private static void a(defpackage.dkx dkx, java.lang.Object obj, defpackage.dlt dlt) {
        ((defpackage.dih) obj).s.a(dlt);
    }

    public final void a(java.lang.Object obj, defpackage.dkc dkc, defpackage.dhw dhw) {
        defpackage.dkx dkx;
        java.lang.Throwable th;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Object obj4;
        java.lang.Object obj5;
        defpackage.dik a2;
        if (dhw == null) {
            throw new java.lang.NullPointerException();
        }
        dkx = this.p;
        java.lang.Object obj6 = null;
        while (true) {
            try {
                int a3 = dkc.a();
                int g2 = g(a3);
                if (g2 >= 0) {
                    int d2 = d(g2);
                    switch ((267386880 & d2) >>> 20) {
                        case 0:
                            defpackage.dlc.a(obj, (long) (d2 & 1048575), dkc.d());
                            b(obj, g2);
                            continue;
                        case 1:
                            defpackage.dlc.a(obj, (long) (d2 & 1048575), dkc.e());
                            b(obj, g2);
                            continue;
                        case 2:
                            defpackage.dlc.a(obj, (long) (d2 & 1048575), dkc.g());
                            b(obj, g2);
                            continue;
                        case 3:
                            defpackage.dlc.a(obj, (long) (d2 & 1048575), dkc.f());
                            b(obj, g2);
                            continue;
                        case 4:
                            defpackage.dlc.a(obj, (long) (d2 & 1048575), dkc.h());
                            b(obj, g2);
                            continue;
                        case 5:
                            defpackage.dlc.a(obj, (long) (d2 & 1048575), dkc.i());
                            b(obj, g2);
                            continue;
                        case 6:
                            defpackage.dlc.a(obj, (long) (d2 & 1048575), dkc.j());
                            b(obj, g2);
                            continue;
                        case 7:
                            defpackage.dlc.a(obj, (long) (d2 & 1048575), dkc.k());
                            b(obj, g2);
                            continue;
                        case 8:
                            a(obj, d2, dkc);
                            b(obj, g2);
                            continue;
                        case 9:
                            if (!a(obj, g2)) {
                                defpackage.dlc.a(obj, (long) (d2 & 1048575), dkc.a(a(g2), dhw));
                                b(obj, g2);
                                break;
                            } else {
                                defpackage.dlc.a(obj, (long) (d2 & 1048575), defpackage.dim.a(defpackage.dlc.f(obj, (long) (d2 & 1048575)), dkc.a(a(g2), dhw)));
                                continue;
                            }
                        case 10:
                            defpackage.dlc.a(obj, (long) (d2 & 1048575), (java.lang.Object) dkc.n());
                            b(obj, g2);
                            continue;
                        case 11:
                            defpackage.dlc.a(obj, (long) (d2 & 1048575), dkc.o());
                            b(obj, g2);
                            continue;
                        case 12:
                            int p2 = dkc.p();
                            defpackage.dio c2 = c(g2);
                            if (c2 != null && c2.a(p2) == null) {
                                obj6 = defpackage.dkj.a(a3, p2, obj6, dkx);
                                break;
                            } else {
                                defpackage.dlc.a(obj, (long) (d2 & 1048575), p2);
                                b(obj, g2);
                                continue;
                            }
                            break;
                        case 13:
                            defpackage.dlc.a(obj, (long) (d2 & 1048575), dkc.q());
                            b(obj, g2);
                            continue;
                        case 14:
                            defpackage.dlc.a(obj, (long) (d2 & 1048575), dkc.r());
                            b(obj, g2);
                            continue;
                        case 15:
                            defpackage.dlc.a(obj, (long) (d2 & 1048575), dkc.s());
                            b(obj, g2);
                            continue;
                        case 16:
                            defpackage.dlc.a(obj, (long) (d2 & 1048575), dkc.t());
                            b(obj, g2);
                            continue;
                        case 17:
                            if (!a(obj, g2)) {
                                defpackage.dlc.a(obj, (long) (d2 & 1048575), dkc.b(a(g2), dhw));
                                b(obj, g2);
                                break;
                            } else {
                                defpackage.dlc.a(obj, (long) (d2 & 1048575), defpackage.dim.a(defpackage.dlc.f(obj, (long) (d2 & 1048575)), dkc.b(a(g2), dhw)));
                                continue;
                            }
                        case 18:
                            dkc.a(this.o.a(obj, (long) (d2 & 1048575)));
                            continue;
                        case 19:
                            dkc.b(this.o.a(obj, (long) (d2 & 1048575)));
                            continue;
                        case 20:
                            dkc.d(this.o.a(obj, (long) (d2 & 1048575)));
                            continue;
                        case 21:
                            dkc.c(this.o.a(obj, (long) (d2 & 1048575)));
                            continue;
                        case 22:
                            dkc.e(this.o.a(obj, (long) (d2 & 1048575)));
                            continue;
                        case 23:
                            dkc.f(this.o.a(obj, (long) (d2 & 1048575)));
                            continue;
                        case 24:
                            dkc.g(this.o.a(obj, (long) (d2 & 1048575)));
                            continue;
                        case 25:
                            dkc.h(this.o.a(obj, (long) (d2 & 1048575)));
                            continue;
                        case 26:
                            if (!f(d2)) {
                                dkc.i(this.o.a(obj, (long) (d2 & 1048575)));
                                break;
                            } else {
                                dkc.j(this.o.a(obj, (long) (d2 & 1048575)));
                                continue;
                            }
                        case 27:
                            dkc.a(this.o.a(obj, (long) (d2 & 1048575)), a(g2), dhw);
                            continue;
                        case 28:
                            dkc.k(this.o.a(obj, (long) (d2 & 1048575)));
                            continue;
                        case 29:
                            dkc.l(this.o.a(obj, (long) (d2 & 1048575)));
                            continue;
                        case 30:
                            java.util.List a4 = this.o.a(obj, (long) (d2 & 1048575));
                            dkc.m(a4);
                            obj6 = defpackage.dkj.a(a3, a4, c(g2), obj6, dkx);
                            continue;
                        case 31:
                            dkc.n(this.o.a(obj, (long) (d2 & 1048575)));
                            continue;
                        case 32:
                            dkc.o(this.o.a(obj, (long) (d2 & 1048575)));
                            continue;
                        case 33:
                            dkc.p(this.o.a(obj, (long) (d2 & 1048575)));
                            continue;
                        case 34:
                            dkc.q(this.o.a(obj, (long) (d2 & 1048575)));
                            continue;
                        case 35:
                            dkc.a(this.o.a(obj, (long) (d2 & 1048575)));
                            continue;
                        case 36:
                            dkc.b(this.o.a(obj, (long) (d2 & 1048575)));
                            continue;
                        case 37:
                            dkc.d(this.o.a(obj, (long) (d2 & 1048575)));
                            continue;
                        case 38:
                            dkc.c(this.o.a(obj, (long) (d2 & 1048575)));
                            continue;
                        case 39:
                            dkc.e(this.o.a(obj, (long) (d2 & 1048575)));
                            continue;
                        case 40:
                            dkc.f(this.o.a(obj, (long) (d2 & 1048575)));
                            continue;
                        case 41:
                            dkc.g(this.o.a(obj, (long) (d2 & 1048575)));
                            continue;
                        case 42:
                            dkc.h(this.o.a(obj, (long) (d2 & 1048575)));
                            continue;
                        case 43:
                            dkc.l(this.o.a(obj, (long) (d2 & 1048575)));
                            continue;
                        case 44:
                            java.util.List a5 = this.o.a(obj, (long) (d2 & 1048575));
                            dkc.m(a5);
                            obj6 = defpackage.dkj.a(a3, a5, c(g2), obj6, dkx);
                            continue;
                        case 45:
                            dkc.n(this.o.a(obj, (long) (d2 & 1048575)));
                            continue;
                        case 46:
                            dkc.o(this.o.a(obj, (long) (d2 & 1048575)));
                            continue;
                        case 47:
                            dkc.p(this.o.a(obj, (long) (d2 & 1048575)));
                            continue;
                        case 48:
                            dkc.q(this.o.a(obj, (long) (d2 & 1048575)));
                            continue;
                        case 49:
                            long j2 = (long) (d2 & 1048575);
                            dkc.b(this.o.a(obj, j2), a(g2), dhw);
                            continue;
                        case 50:
                            java.lang.Object b2 = b(g2);
                            long d3 = (long) (d(g2) & 1048575);
                            java.lang.Object f2 = defpackage.dlc.f(obj, d3);
                            if (f2 == null) {
                                obj3 = defpackage.djj.b.a();
                                defpackage.dlc.a(obj, d3, obj3);
                            } else if (defpackage.djk.a(f2)) {
                                obj3 = defpackage.djj.b.a();
                                defpackage.djk.a(obj3, f2);
                                defpackage.dlc.a(obj, d3, obj3);
                            } else {
                                obj3 = f2;
                            }
                            dkc.a((java.util.Map) (defpackage.djj) obj3, ((defpackage.djh) b2).a, dhw);
                            continue;
                        case 51:
                            defpackage.dlc.a(obj, (long) (d2 & 1048575), (java.lang.Object) java.lang.Double.valueOf(dkc.d()));
                            b(obj, a3, g2);
                            continue;
                        case 52:
                            defpackage.dlc.a(obj, (long) (d2 & 1048575), (java.lang.Object) java.lang.Float.valueOf(dkc.e()));
                            b(obj, a3, g2);
                            continue;
                        case 53:
                            defpackage.dlc.a(obj, (long) (d2 & 1048575), (java.lang.Object) java.lang.Long.valueOf(dkc.g()));
                            b(obj, a3, g2);
                            continue;
                        case 54:
                            defpackage.dlc.a(obj, (long) (d2 & 1048575), (java.lang.Object) java.lang.Long.valueOf(dkc.f()));
                            b(obj, a3, g2);
                            continue;
                        case 55:
                            defpackage.dlc.a(obj, (long) (d2 & 1048575), (java.lang.Object) java.lang.Integer.valueOf(dkc.h()));
                            b(obj, a3, g2);
                            continue;
                        case 56:
                            defpackage.dlc.a(obj, (long) (d2 & 1048575), (java.lang.Object) java.lang.Long.valueOf(dkc.i()));
                            b(obj, a3, g2);
                            continue;
                        case 57:
                            defpackage.dlc.a(obj, (long) (d2 & 1048575), (java.lang.Object) java.lang.Integer.valueOf(dkc.j()));
                            b(obj, a3, g2);
                            continue;
                        case 58:
                            defpackage.dlc.a(obj, (long) (d2 & 1048575), (java.lang.Object) java.lang.Boolean.valueOf(dkc.k()));
                            b(obj, a3, g2);
                            continue;
                        case 59:
                            a(obj, d2, dkc);
                            b(obj, a3, g2);
                            continue;
                        case 60:
                            if (a(obj, a3, g2)) {
                                defpackage.dlc.a(obj, (long) (d2 & 1048575), defpackage.dim.a(defpackage.dlc.f(obj, (long) (d2 & 1048575)), dkc.a(a(g2), dhw)));
                            } else {
                                defpackage.dlc.a(obj, (long) (d2 & 1048575), dkc.a(a(g2), dhw));
                                b(obj, g2);
                            }
                            b(obj, a3, g2);
                            continue;
                        case 61:
                            defpackage.dlc.a(obj, (long) (d2 & 1048575), (java.lang.Object) dkc.n());
                            b(obj, a3, g2);
                            continue;
                        case 62:
                            defpackage.dlc.a(obj, (long) (d2 & 1048575), (java.lang.Object) java.lang.Integer.valueOf(dkc.o()));
                            b(obj, a3, g2);
                            continue;
                        case 63:
                            int p3 = dkc.p();
                            defpackage.dio c3 = c(g2);
                            if (c3 != null && c3.a(p3) == null) {
                                obj6 = defpackage.dkj.a(a3, p3, obj6, dkx);
                                break;
                            } else {
                                defpackage.dlc.a(obj, (long) (d2 & 1048575), (java.lang.Object) java.lang.Integer.valueOf(p3));
                                b(obj, a3, g2);
                                continue;
                            }
                            break;
                        case 64:
                            defpackage.dlc.a(obj, (long) (d2 & 1048575), (java.lang.Object) java.lang.Integer.valueOf(dkc.q()));
                            b(obj, a3, g2);
                            continue;
                        case 65:
                            defpackage.dlc.a(obj, (long) (d2 & 1048575), (java.lang.Object) java.lang.Long.valueOf(dkc.r()));
                            b(obj, a3, g2);
                            continue;
                        case 66:
                            defpackage.dlc.a(obj, (long) (d2 & 1048575), (java.lang.Object) java.lang.Integer.valueOf(dkc.s()));
                            b(obj, a3, g2);
                            continue;
                        case 67:
                            defpackage.dlc.a(obj, (long) (d2 & 1048575), (java.lang.Object) java.lang.Long.valueOf(dkc.t()));
                            b(obj, a3, g2);
                            continue;
                        case 68:
                            defpackage.dlc.a(obj, (long) (d2 & 1048575), dkc.b(a(g2), dhw));
                            b(obj, a3, g2);
                            continue;
                        default:
                            if (obj6 == null) {
                                try {
                                    obj5 = new defpackage.dky();
                                } catch (defpackage.dis e2) {
                                    break;
                                }
                            } else {
                                obj5 = obj6;
                            }
                            try {
                                if (!dkx.a(obj5, dkc)) {
                                    for (int i2 = this.m; i2 < this.n; i2++) {
                                        obj5 = a(obj, this.l[i2], obj5, dkx);
                                    }
                                    if (obj5 != null) {
                                        defpackage.dkx.a(obj, (defpackage.dky) obj5);
                                        return;
                                    }
                                    return;
                                }
                                obj6 = obj5;
                                continue;
                            } catch (defpackage.dis e3) {
                                obj6 = obj5;
                                break;
                            }
                    }
                    if (obj6 == null) {
                        obj4 = defpackage.dkx.a(obj);
                    } else {
                        obj4 = obj6;
                    }
                    try {
                        if (!dkx.a(obj2, dkc)) {
                            for (int i3 = this.m; i3 < this.n; i3++) {
                                obj2 = a(obj, this.l[i3], obj2, dkx);
                            }
                            if (obj2 != null) {
                                defpackage.dkx.a(obj, (defpackage.dky) obj2);
                                return;
                            }
                            return;
                        }
                        obj6 = obj2;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else if (a3 == Integer.MAX_VALUE) {
                    java.lang.Object obj7 = obj6;
                    for (int i4 = this.m; i4 < this.n; i4++) {
                        obj7 = a(obj, this.l[i4], obj7, dkx);
                    }
                    if (obj7 != null) {
                        defpackage.dkx.a(obj, (defpackage.dky) obj7);
                        return;
                    }
                    return;
                } else {
                    if (!this.h) {
                        a2 = null;
                    } else {
                        a2 = dhw.a(this.g, a3);
                    }
                    if (a2 != null) {
                        defpackage.dhy.a(obj);
                        throw new java.lang.NoSuchMethodError();
                    }
                    if (obj6 == null) {
                        obj2 = defpackage.dkx.a(obj);
                    } else {
                        obj2 = obj6;
                    }
                    if (!dkx.a(obj2, dkc)) {
                        for (int i5 = this.m; i5 < this.n; i5++) {
                            obj2 = a(obj, this.l[i5], obj2, dkx);
                        }
                        if (obj2 != null) {
                            defpackage.dkx.a(obj, (defpackage.dky) obj2);
                            return;
                        }
                        return;
                    }
                    obj6 = obj2;
                }
            } catch (Throwable th3) {
                obj2 = obj6;
                th = th3;
            }
        }
        for (int i6 = this.m; i6 < this.n; i6++) {
            obj2 = a(obj, this.l[i6], obj2, dkx);
        }
        if (obj2 != null) {
            defpackage.dkx.a(obj, (defpackage.dky) obj2);
        }
        throw th;
    }

    private static defpackage.dky e(java.lang.Object obj) {
        defpackage.dky dky = ((defpackage.dih) obj).s;
        if (dky != defpackage.dky.a) {
            return dky;
        }
        defpackage.dky dky2 = new defpackage.dky();
        ((defpackage.dih) obj).s = dky2;
        return dky2;
    }

    private static int a(defpackage.dkh dkh, byte[] bArr, int i2, int i3, defpackage.dgw dgw) {
        int i4;
        int i5 = i2 + 1;
        byte b2 = bArr[i2];
        if (b2 < 0) {
            i5 = defpackage.dgv.a((int) b2, bArr, i5, dgw);
            i4 = dgw.a;
        } else {
            i4 = b2;
        }
        if (i4 < 0 || i4 > i3 - i5) {
            throw defpackage.dir.a();
        }
        java.lang.Object a2 = dkh.a();
        dkh.a(a2, bArr, i5, i5 + i4, dgw);
        dkh.c(a2);
        dgw.c = a2;
        return i5 + i4;
    }

    private static int a(defpackage.dkh dkh, byte[] bArr, int i2, int i3, int i4, defpackage.dgw dgw) {
        defpackage.djr djr = (defpackage.djr) dkh;
        java.lang.Object a2 = djr.a();
        int a3 = djr.a(a2, bArr, i2, i3, i4, dgw);
        djr.c(a2);
        dgw.c = a2;
        return a3;
    }

    private static int a(defpackage.dkh dkh, int i2, byte[] bArr, int i3, int i4, defpackage.diq diq, defpackage.dgw dgw) {
        int a2 = a(dkh, bArr, i3, i4, dgw);
        diq.add(dgw.c);
        while (a2 < i4) {
            int a3 = defpackage.dgv.a(bArr, a2, dgw);
            if (i2 != dgw.a) {
                break;
            }
            a2 = a(dkh, bArr, a3, i4, dgw);
            diq.add(dgw.c);
        }
        return a2;
    }

    private static int a(byte[] bArr, int i2, int i3, defpackage.dln dln, java.lang.Class cls, defpackage.dgw dgw) {
        boolean z;
        switch (dln.ordinal()) {
            case 0:
                dgw.c = java.lang.Double.valueOf(defpackage.dgv.c(bArr, i2));
                return i2 + 8;
            case 1:
                dgw.c = java.lang.Float.valueOf(defpackage.dgv.d(bArr, i2));
                return i2 + 4;
            case 2:
            case 3:
                int b2 = defpackage.dgv.b(bArr, i2, dgw);
                dgw.c = java.lang.Long.valueOf(dgw.b);
                return b2;
            case 4:
            case 12:
            case 13:
                int a2 = defpackage.dgv.a(bArr, i2, dgw);
                dgw.c = java.lang.Integer.valueOf(dgw.a);
                return a2;
            case 5:
            case 15:
                dgw.c = java.lang.Long.valueOf(defpackage.dgv.b(bArr, i2));
                return i2 + 8;
            case 6:
            case 14:
                dgw.c = java.lang.Integer.valueOf(defpackage.dgv.a(bArr, i2));
                return i2 + 4;
            case 7:
                int b3 = defpackage.dgv.b(bArr, i2, dgw);
                if (dgw.b != 0) {
                    z = true;
                } else {
                    z = false;
                }
                dgw.c = java.lang.Boolean.valueOf(z);
                return b3;
            case 8:
                return defpackage.dgv.d(bArr, i2, dgw);
            case 10:
                return a(defpackage.djz.a.a(cls), bArr, i2, i3, dgw);
            case 11:
                return defpackage.dgv.e(bArr, i2, dgw);
            case 16:
                int a3 = defpackage.dgv.a(bArr, i2, dgw);
                dgw.c = java.lang.Integer.valueOf(defpackage.dhj.f(dgw.a));
                return a3;
            case 17:
                int b4 = defpackage.dgv.b(bArr, i2, dgw);
                dgw.c = java.lang.Long.valueOf(defpackage.dhj.a(dgw.b));
                return b4;
            default:
                throw new java.lang.RuntimeException("unsupported field type.");
        }
    }

    private static int a(int i2, byte[] bArr, int i3, int i4, java.lang.Object obj, defpackage.dgw dgw) {
        return defpackage.dgv.a(i2, bArr, i3, i4, e(obj), dgw);
    }

    private final int a(java.lang.Object obj, byte[] bArr, int i2, int i3, int i4, int i5, int i6, int i7, long j2, int i8, long j3, defpackage.dgw dgw) {
        defpackage.diq diq;
        int a2;
        int i9;
        int i10;
        int i11;
        boolean z;
        defpackage.diq diq2 = (defpackage.diq) b.getObject(obj, j3);
        if (!diq2.a()) {
            int size = diq2.size();
            diq = diq2.a(size == 0 ? 10 : size << 1);
            b.putObject(obj, j3, diq);
        } else {
            diq = diq2;
        }
        switch (i8) {
            case 18:
            case 35:
                if (i6 == 2) {
                    defpackage.dhu dhu = (defpackage.dhu) diq;
                    int a3 = defpackage.dgv.a(bArr, i2, dgw);
                    int i12 = dgw.a + a3;
                    while (a3 < i12) {
                        dhu.a(defpackage.dgv.c(bArr, a3));
                        a3 += 8;
                    }
                    if (a3 == i12) {
                        return a3;
                    }
                    throw defpackage.dir.a();
                } else if (i6 != 1) {
                    return i2;
                } else {
                    defpackage.dhu dhu2 = (defpackage.dhu) diq;
                    dhu2.a(defpackage.dgv.c(bArr, i2));
                    int i13 = i2 + 8;
                    while (i13 < i3) {
                        int a4 = defpackage.dgv.a(bArr, i13, dgw);
                        if (i4 != dgw.a) {
                            return i13;
                        }
                        dhu2.a(defpackage.dgv.c(bArr, a4));
                        i13 = a4 + 8;
                    }
                    return i13;
                }
            case 19:
            case 36:
                if (i6 == 2) {
                    defpackage.die die = (defpackage.die) diq;
                    int a5 = defpackage.dgv.a(bArr, i2, dgw);
                    int i14 = dgw.a + a5;
                    while (a5 < i14) {
                        die.a(defpackage.dgv.d(bArr, a5));
                        a5 += 4;
                    }
                    if (a5 == i14) {
                        return a5;
                    }
                    throw defpackage.dir.a();
                } else if (i6 != 5) {
                    return i2;
                } else {
                    defpackage.die die2 = (defpackage.die) diq;
                    die2.a(defpackage.dgv.d(bArr, i2));
                    int i15 = i2 + 4;
                    while (i15 < i3) {
                        int a6 = defpackage.dgv.a(bArr, i15, dgw);
                        if (i4 != dgw.a) {
                            return i15;
                        }
                        die2.a(defpackage.dgv.d(bArr, a6));
                        i15 = a6 + 4;
                    }
                    return i15;
                }
            case 20:
            case 21:
            case 37:
            case 38:
                if (i6 == 2) {
                    defpackage.djd djd = (defpackage.djd) diq;
                    int a7 = defpackage.dgv.a(bArr, i2, dgw);
                    int i16 = dgw.a + a7;
                    while (a7 < i16) {
                        a7 = defpackage.dgv.b(bArr, a7, dgw);
                        djd.a(dgw.b);
                    }
                    if (a7 == i16) {
                        return a7;
                    }
                    throw defpackage.dir.a();
                } else if (i6 != 0) {
                    return i2;
                } else {
                    defpackage.djd djd2 = (defpackage.djd) diq;
                    int b2 = defpackage.dgv.b(bArr, i2, dgw);
                    djd2.a(dgw.b);
                    while (b2 < i3) {
                        int a8 = defpackage.dgv.a(bArr, b2, dgw);
                        if (i4 != dgw.a) {
                            return b2;
                        }
                        b2 = defpackage.dgv.b(bArr, a8, dgw);
                        djd2.a(dgw.b);
                    }
                    return b2;
                }
            case 22:
            case 29:
            case 39:
            case 43:
                if (i6 == 2) {
                    return defpackage.dgv.a(bArr, i2, diq, dgw);
                }
                if (i6 == 0) {
                    return defpackage.dgv.a(i4, bArr, i2, i3, diq, dgw);
                }
                return i2;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i6 == 2) {
                    defpackage.djd djd3 = (defpackage.djd) diq;
                    int a9 = defpackage.dgv.a(bArr, i2, dgw);
                    int i17 = dgw.a + a9;
                    while (a9 < i17) {
                        djd3.a(defpackage.dgv.b(bArr, a9));
                        a9 += 8;
                    }
                    if (a9 == i17) {
                        return a9;
                    }
                    throw defpackage.dir.a();
                } else if (i6 != 1) {
                    return i2;
                } else {
                    defpackage.djd djd4 = (defpackage.djd) diq;
                    djd4.a(defpackage.dgv.b(bArr, i2));
                    int i18 = i2 + 8;
                    while (i18 < i3) {
                        int a10 = defpackage.dgv.a(bArr, i18, dgw);
                        if (i4 != dgw.a) {
                            return i18;
                        }
                        djd4.a(defpackage.dgv.b(bArr, a10));
                        i18 = a10 + 8;
                    }
                    return i18;
                }
            case 24:
            case 31:
            case 41:
            case 45:
                if (i6 == 2) {
                    defpackage.dil dil = (defpackage.dil) diq;
                    int a11 = defpackage.dgv.a(bArr, i2, dgw);
                    int i19 = dgw.a + a11;
                    while (a11 < i19) {
                        dil.d(defpackage.dgv.a(bArr, a11));
                        a11 += 4;
                    }
                    if (a11 == i19) {
                        return a11;
                    }
                    throw defpackage.dir.a();
                } else if (i6 != 5) {
                    return i2;
                } else {
                    defpackage.dil dil2 = (defpackage.dil) diq;
                    dil2.d(defpackage.dgv.a(bArr, i2));
                    int i20 = i2 + 4;
                    while (i20 < i3) {
                        int a12 = defpackage.dgv.a(bArr, i20, dgw);
                        if (i4 != dgw.a) {
                            return i20;
                        }
                        dil2.d(defpackage.dgv.a(bArr, a12));
                        i20 = a12 + 4;
                    }
                    return i20;
                }
            case 25:
            case 42:
                if (i6 == 2) {
                    defpackage.dgy dgy = (defpackage.dgy) diq;
                    int a13 = defpackage.dgv.a(bArr, i2, dgw);
                    int i21 = a13 + dgw.a;
                    while (a13 < i21) {
                        a13 = defpackage.dgv.b(bArr, a13, dgw);
                        dgy.a(dgw.b != 0);
                    }
                    if (a13 == i21) {
                        return a13;
                    }
                    throw defpackage.dir.a();
                } else if (i6 != 0) {
                    return i2;
                } else {
                    defpackage.dgy dgy2 = (defpackage.dgy) diq;
                    int b3 = defpackage.dgv.b(bArr, i2, dgw);
                    dgy2.a(dgw.b != 0);
                    while (b3 < i3) {
                        int a14 = defpackage.dgv.a(bArr, b3, dgw);
                        if (i4 != dgw.a) {
                            return b3;
                        }
                        b3 = defpackage.dgv.b(bArr, a14, dgw);
                        if (dgw.b != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        dgy2.a(z);
                    }
                    return b3;
                }
            case 26:
                if (i6 != 2) {
                    return i2;
                }
                if ((536870912 & j2) == 0) {
                    int a15 = defpackage.dgv.a(bArr, i2, dgw);
                    int i22 = dgw.a;
                    if (i22 == 0) {
                        diq.add("");
                    } else {
                        diq.add(new java.lang.String(bArr, a15, i22, defpackage.dim.a));
                        a15 += i22;
                    }
                    while (i11 < i3) {
                        int a16 = defpackage.dgv.a(bArr, i11, dgw);
                        if (i4 != dgw.a) {
                            return i11;
                        }
                        i11 = defpackage.dgv.a(bArr, a16, dgw);
                        int i23 = dgw.a;
                        if (i23 == 0) {
                            diq.add("");
                        } else {
                            diq.add(new java.lang.String(bArr, i11, i23, defpackage.dim.a));
                            i11 += i23;
                        }
                    }
                    return i11;
                }
                int a17 = defpackage.dgv.a(bArr, i2, dgw);
                int i24 = dgw.a;
                if (i24 == 0) {
                    diq.add("");
                } else {
                    if (!defpackage.dli.a(bArr, a17, a17 + i24)) {
                        throw defpackage.dir.j();
                    }
                    diq.add(new java.lang.String(bArr, a17, i24, defpackage.dim.a));
                    a17 += i24;
                }
                while (i10 < i3) {
                    int a18 = defpackage.dgv.a(bArr, i10, dgw);
                    if (i4 != dgw.a) {
                        return i10;
                    }
                    i10 = defpackage.dgv.a(bArr, a18, dgw);
                    int i25 = dgw.a;
                    if (i25 == 0) {
                        diq.add("");
                    } else {
                        if (!defpackage.dli.a(bArr, i10, i10 + i25)) {
                            throw defpackage.dir.j();
                        }
                        diq.add(new java.lang.String(bArr, i10, i25, defpackage.dim.a));
                        i10 += i25;
                    }
                }
                return i10;
            case 27:
                if (i6 == 2) {
                    return a(a(i7), i4, bArr, i2, i3, diq, dgw);
                }
                return i2;
            case 28:
                if (i6 != 2) {
                    return i2;
                }
                int a19 = defpackage.dgv.a(bArr, i2, dgw);
                int i26 = dgw.a;
                if (i26 == 0) {
                    diq.add(defpackage.dha.a);
                } else {
                    diq.add(defpackage.dha.a(bArr, a19, i26));
                    a19 += i26;
                }
                while (i9 < i3) {
                    int a20 = defpackage.dgv.a(bArr, i9, dgw);
                    if (i4 != dgw.a) {
                        return i9;
                    }
                    i9 = defpackage.dgv.a(bArr, a20, dgw);
                    int i27 = dgw.a;
                    if (i27 == 0) {
                        diq.add(defpackage.dha.a);
                    } else {
                        diq.add(defpackage.dha.a(bArr, i9, i27));
                        i9 += i27;
                    }
                }
                return i9;
            case 30:
            case 44:
                if (i6 == 2) {
                    a2 = defpackage.dgv.a(bArr, i2, diq, dgw);
                } else if (i6 != 0) {
                    return i2;
                } else {
                    a2 = defpackage.dgv.a(i4, bArr, i2, i3, diq, dgw);
                }
                defpackage.dky dky = ((defpackage.dih) obj).s;
                if (dky == defpackage.dky.a) {
                    dky = null;
                }
                defpackage.dky dky2 = (defpackage.dky) defpackage.dkj.a(i5, diq, c(i7), dky, this.p);
                if (dky2 == null) {
                    return a2;
                }
                ((defpackage.dih) obj).s = dky2;
                return a2;
            case 33:
            case 47:
                if (i6 == 2) {
                    defpackage.dil dil3 = (defpackage.dil) diq;
                    int a21 = defpackage.dgv.a(bArr, i2, dgw);
                    int i28 = dgw.a + a21;
                    while (a21 < i28) {
                        a21 = defpackage.dgv.a(bArr, a21, dgw);
                        dil3.d(defpackage.dhj.f(dgw.a));
                    }
                    if (a21 == i28) {
                        return a21;
                    }
                    throw defpackage.dir.a();
                } else if (i6 != 0) {
                    return i2;
                } else {
                    defpackage.dil dil4 = (defpackage.dil) diq;
                    int a22 = defpackage.dgv.a(bArr, i2, dgw);
                    dil4.d(defpackage.dhj.f(dgw.a));
                    while (a22 < i3) {
                        int a23 = defpackage.dgv.a(bArr, a22, dgw);
                        if (i4 != dgw.a) {
                            return a22;
                        }
                        a22 = defpackage.dgv.a(bArr, a23, dgw);
                        dil4.d(defpackage.dhj.f(dgw.a));
                    }
                    return a22;
                }
            case 34:
            case 48:
                if (i6 == 2) {
                    defpackage.djd djd5 = (defpackage.djd) diq;
                    int a24 = defpackage.dgv.a(bArr, i2, dgw);
                    int i29 = dgw.a + a24;
                    while (a24 < i29) {
                        a24 = defpackage.dgv.b(bArr, a24, dgw);
                        djd5.a(defpackage.dhj.a(dgw.b));
                    }
                    if (a24 == i29) {
                        return a24;
                    }
                    throw defpackage.dir.a();
                } else if (i6 != 0) {
                    return i2;
                } else {
                    defpackage.djd djd6 = (defpackage.djd) diq;
                    int b4 = defpackage.dgv.b(bArr, i2, dgw);
                    djd6.a(defpackage.dhj.a(dgw.b));
                    while (b4 < i3) {
                        int a25 = defpackage.dgv.a(bArr, b4, dgw);
                        if (i4 != dgw.a) {
                            return b4;
                        }
                        b4 = defpackage.dgv.b(bArr, a25, dgw);
                        djd6.a(defpackage.dhj.a(dgw.b));
                    }
                    return b4;
                }
            case 49:
                if (i6 != 3) {
                    return i2;
                }
                defpackage.dkh a26 = a(i7);
                int i30 = (i4 & -8) | 4;
                int a27 = a(a26, bArr, i2, i3, i30, dgw);
                diq.add(dgw.c);
                while (a27 < i3) {
                    int a28 = defpackage.dgv.a(bArr, a27, dgw);
                    if (i4 != dgw.a) {
                        return a27;
                    }
                    a27 = a(a26, bArr, a28, i3, i30, dgw);
                    diq.add(dgw.c);
                }
                return a27;
            default:
                return i2;
        }
    }

    /* JADX WARNING: type inference failed for: r3v9, types: [int] */
    /* JADX WARNING: type inference failed for: r3v20 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int a(java.lang.Object r17, byte[] r18, int r19, int r20, int r21, long r22, defpackage.dgw r24) {
        /*
            r16 = this;
            sun.misc.Unsafe r6 = b
            r0 = r16
            r1 = r21
            java.lang.Object r3 = r0.b(r1)
            r0 = r17
            r1 = r22
            java.lang.Object r5 = r6.getObject(r0, r1)
            boolean r4 = defpackage.djk.a(r5)
            if (r4 == 0) goto L_0x00bb
            djj r4 = defpackage.djj.b
            djj r4 = r4.a()
            defpackage.djk.a(r4, r5)
            r0 = r17
            r1 = r22
            r6.putObject(r0, r1, r4)
        L_0x0028:
            djh r3 = (defpackage.djh) r3
            dji r12 = r3.a
            r9 = r4
            djj r9 = (defpackage.djj) r9
            r0 = r18
            r1 = r19
            r2 = r24
            int r5 = defpackage.dgv.a(r0, r1, r2)
            r0 = r24
            int r3 = r0.a
            if (r3 < 0) goto L_0x0043
            int r4 = r20 - r5
            if (r3 <= r4) goto L_0x0048
        L_0x0043:
            dir r3 = defpackage.dir.a()
            throw r3
        L_0x0048:
            int r13 = r5 + r3
            java.lang.Object r4 = r12.b
            java.lang.Object r3 = r12.d
            r10 = r3
            r11 = r4
            r3 = r5
        L_0x0051:
            if (r3 >= r13) goto L_0x00b0
            int r4 = r3 + 1
            byte r3 = r18[r3]
            if (r3 >= 0) goto L_0x0065
            r0 = r18
            r1 = r24
            int r4 = defpackage.dgv.a(r3, r0, r4, r1)
            r0 = r24
            int r3 = r0.a
        L_0x0065:
            int r5 = r3 >>> 3
            r6 = r3 & 7
            switch(r5) {
                case 1: goto L_0x0077;
                case 2: goto L_0x0091;
                default: goto L_0x006c;
            }
        L_0x006c:
            r0 = r18
            r1 = r20
            r2 = r24
            int r3 = defpackage.dgv.a(r3, r0, r4, r1, r2)
            goto L_0x0051
        L_0x0077:
            dln r5 = r12.a
            int r5 = r5.f
            if (r6 != r5) goto L_0x006c
            dln r6 = r12.a
            r7 = 0
            r3 = r18
            r5 = r20
            r8 = r24
            int r4 = a(r3, r4, r5, r6, r7, r8)
            r0 = r24
            java.lang.Object r3 = r0.c
            r11 = r3
            r3 = r4
            goto L_0x0051
        L_0x0091:
            dln r5 = r12.c
            int r5 = r5.f
            if (r6 != r5) goto L_0x006c
            dln r6 = r12.c
            java.lang.Object r3 = r12.d
            java.lang.Class r7 = r3.getClass()
            r3 = r18
            r5 = r20
            r8 = r24
            int r4 = a(r3, r4, r5, r6, r7, r8)
            r0 = r24
            java.lang.Object r3 = r0.c
            r10 = r3
            r3 = r4
            goto L_0x0051
        L_0x00b0:
            if (r3 == r13) goto L_0x00b7
            dir r3 = defpackage.dir.i()
            throw r3
        L_0x00b7:
            r9.put(r11, r10)
            return r13
        L_0x00bb:
            r4 = r5
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.djr.a(java.lang.Object, byte[], int, int, int, long, dgw):int");
    }

    private final int a(java.lang.Object obj, byte[] bArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j2, int i9, defpackage.dgw dgw) {
        int a2;
        java.lang.Object obj2;
        java.lang.Object obj3;
        sun.misc.Unsafe unsafe = b;
        long j3 = (long) (this.c[i9 + 2] & 1048575);
        switch (i8) {
            case 51:
                if (i6 == 1) {
                    unsafe.putObject(obj, j2, java.lang.Double.valueOf(defpackage.dgv.c(bArr, i2)));
                    a2 = i2 + 8;
                    break;
                } else {
                    return i2;
                }
            case 52:
                if (i6 == 5) {
                    unsafe.putObject(obj, j2, java.lang.Float.valueOf(defpackage.dgv.d(bArr, i2)));
                    a2 = i2 + 4;
                    break;
                } else {
                    return i2;
                }
            case 53:
            case 54:
                if (i6 == 0) {
                    a2 = defpackage.dgv.b(bArr, i2, dgw);
                    unsafe.putObject(obj, j2, java.lang.Long.valueOf(dgw.b));
                    break;
                } else {
                    return i2;
                }
            case 55:
            case 62:
                if (i6 == 0) {
                    a2 = defpackage.dgv.a(bArr, i2, dgw);
                    unsafe.putObject(obj, j2, java.lang.Integer.valueOf(dgw.a));
                    break;
                } else {
                    return i2;
                }
            case 56:
            case 65:
                if (i6 == 1) {
                    unsafe.putObject(obj, j2, java.lang.Long.valueOf(defpackage.dgv.b(bArr, i2)));
                    a2 = i2 + 8;
                    break;
                } else {
                    return i2;
                }
            case 57:
            case 64:
                if (i6 == 5) {
                    unsafe.putObject(obj, j2, java.lang.Integer.valueOf(defpackage.dgv.a(bArr, i2)));
                    a2 = i2 + 4;
                    break;
                } else {
                    return i2;
                }
            case 58:
                if (i6 == 0) {
                    int b2 = defpackage.dgv.b(bArr, i2, dgw);
                    unsafe.putObject(obj, j2, java.lang.Boolean.valueOf(dgw.b != 0));
                    a2 = b2;
                    break;
                } else {
                    return i2;
                }
            case 59:
                if (i6 != 2) {
                    return i2;
                }
                int a3 = defpackage.dgv.a(bArr, i2, dgw);
                int i10 = dgw.a;
                if (i10 == 0) {
                    unsafe.putObject(obj, j2, "");
                } else if ((536870912 & i7) == 0 || defpackage.dli.a(bArr, a3, a3 + i10)) {
                    unsafe.putObject(obj, j2, new java.lang.String(bArr, a3, i10, defpackage.dim.a));
                    a3 += i10;
                } else {
                    throw defpackage.dir.j();
                }
                unsafe.putInt(obj, j3, i5);
                return a3;
            case 60:
                if (i6 != 2) {
                    return i2;
                }
                int a4 = a(a(i9), bArr, i2, i3, dgw);
                if (unsafe.getInt(obj, j3) == i5) {
                    obj3 = unsafe.getObject(obj, j2);
                } else {
                    obj3 = null;
                }
                if (obj3 == null) {
                    unsafe.putObject(obj, j2, dgw.c);
                } else {
                    unsafe.putObject(obj, j2, defpackage.dim.a(obj3, dgw.c));
                }
                unsafe.putInt(obj, j3, i5);
                return a4;
            case 61:
                if (i6 != 2) {
                    return i2;
                }
                int a5 = defpackage.dgv.a(bArr, i2, dgw);
                int i11 = dgw.a;
                if (i11 == 0) {
                    unsafe.putObject(obj, j2, defpackage.dha.a);
                } else {
                    unsafe.putObject(obj, j2, defpackage.dha.a(bArr, a5, i11));
                    a5 += i11;
                }
                unsafe.putInt(obj, j3, i5);
                return a5;
            case 63:
                if (i6 != 0) {
                    return i2;
                }
                a2 = defpackage.dgv.a(bArr, i2, dgw);
                int i12 = dgw.a;
                defpackage.dio c2 = c(i9);
                if (c2 == null || c2.a(i12) != null) {
                    unsafe.putObject(obj, j2, java.lang.Integer.valueOf(i12));
                    break;
                } else {
                    e(obj).a(i4, (java.lang.Object) java.lang.Long.valueOf((long) i12));
                    return a2;
                }
            case 66:
                if (i6 == 0) {
                    a2 = defpackage.dgv.a(bArr, i2, dgw);
                    unsafe.putObject(obj, j2, java.lang.Integer.valueOf(defpackage.dhj.f(dgw.a)));
                    break;
                } else {
                    return i2;
                }
            case 67:
                if (i6 == 0) {
                    a2 = defpackage.dgv.b(bArr, i2, dgw);
                    unsafe.putObject(obj, j2, java.lang.Long.valueOf(defpackage.dhj.a(dgw.b)));
                    break;
                } else {
                    return i2;
                }
            case 68:
                if (i6 == 3) {
                    a2 = a(a(i9), bArr, i2, i3, (i4 & -8) | 4, dgw);
                    if (unsafe.getInt(obj, j3) == i5) {
                        obj2 = unsafe.getObject(obj, j2);
                    } else {
                        obj2 = null;
                    }
                    if (obj2 != null) {
                        unsafe.putObject(obj, j2, defpackage.dim.a(obj2, dgw.c));
                        break;
                    } else {
                        unsafe.putObject(obj, j2, dgw.c);
                        break;
                    }
                } else {
                    return i2;
                }
            default:
                return i2;
        }
        unsafe.putInt(obj, j3, i5);
        return a2;
    }

    private final defpackage.dkh a(int i2) {
        int i3 = (i2 / 3) << 1;
        defpackage.dkh dkh = (defpackage.dkh) this.d[i3];
        if (dkh != null) {
            return dkh;
        }
        defpackage.dkh a2 = defpackage.djz.a.a((java.lang.Class) this.d[i3 + 1]);
        this.d[i3] = a2;
        return a2;
    }

    private final java.lang.Object b(int i2) {
        return this.d[(i2 / 3) << 1];
    }

    private final defpackage.dio c(int i2) {
        return (defpackage.dio) this.d[((i2 / 3) << 1) + 1];
    }

    /* JADX WARNING: type inference failed for: r17v4, types: [int] */
    /* JADX WARNING: type inference failed for: r29v0, types: [int] */
    /* JADX WARNING: type inference failed for: r8v4, types: [int] */
    /* JADX WARNING: type inference failed for: r0v44, types: [int] */
    /* JADX WARNING: type inference failed for: r0v85 */
    /* JADX WARNING: type inference failed for: r5v81, types: [int] */
    /* JADX WARNING: type inference failed for: r0v89, types: [int] */
    /* JADX WARNING: type inference failed for: r17v5 */
    /* JADX WARNING: type inference failed for: r17v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int a(java.lang.Object r42, byte[] r43, int r44, int r45, int r46, defpackage.dgw r47) {
        /*
            r41 = this;
            sun.misc.Unsafe r4 = b
            r39 = -1
            r38 = 0
            r17 = 0
            r18 = -1
            r20 = 0
            r5 = r18
            r7 = r44
        L_0x0010:
            r0 = r45
            if (r7 >= r0) goto L_0x03d9
            int r10 = r7 + 1
            byte r17 = r43[r7]
            if (r17 >= 0) goto L_0x002a
            r0 = r17
            r1 = r43
            r2 = r47
            int r10 = defpackage.dgv.a(r0, r1, r10, r2)
            r0 = r47
            int r0 = r0.a
            r17 = r0
        L_0x002a:
            int r18 = r17 >>> 3
            r19 = r17 & 7
            r0 = r18
            if (r0 <= r5) goto L_0x0065
            int r5 = r20 / 3
            r0 = r41
            r1 = r18
            int r20 = r0.a(r1, r5)
        L_0x003c:
            r5 = -1
            r0 = r20
            if (r0 != r5) goto L_0x006e
            r20 = 0
            r11 = r38
            r12 = r39
            r7 = r10
        L_0x0048:
            r0 = r17
            r1 = r46
            if (r0 != r1) goto L_0x0050
            if (r46 != 0) goto L_0x0377
        L_0x0050:
            r5 = r17
            r6 = r43
            r8 = r45
            r9 = r42
            r10 = r47
            int r7 = a(r5, r6, r7, r8, r9, r10)
            r5 = r18
            r38 = r11
            r39 = r12
            goto L_0x0010
        L_0x0065:
            r0 = r41
            r1 = r18
            int r20 = r0.g(r1)
            goto L_0x003c
        L_0x006e:
            r0 = r41
            int[] r5 = r0.c
            int r6 = r20 + 1
            r32 = r5[r6]
            r5 = 267386880(0xff00000, float:2.3665827E-29)
            r5 = r5 & r32
            int r23 = r5 >>> 20
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r32
            long r6 = (long) r5
            r5 = 17
            r0 = r23
            if (r0 > r5) goto L_0x02c3
            r0 = r41
            int[] r5 = r0.c
            int r8 = r20 + 2
            r5 = r5[r8]
            r8 = 1
            int r9 = r5 >>> 20
            int r14 = r8 << r9
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r8
            r0 = r39
            if (r5 == r0) goto L_0x00b5
            r8 = -1
            r0 = r39
            if (r0 == r8) goto L_0x00ac
            r0 = r39
            long r8 = (long) r0
            r0 = r42
            r1 = r38
            r4.putInt(r0, r8, r1)
        L_0x00ac:
            long r8 = (long) r5
            r0 = r42
            int r38 = r4.getInt(r0, r8)
            r39 = r5
        L_0x00b5:
            switch(r23) {
                case 0: goto L_0x00be;
                case 1: goto L_0x00d6;
                case 2: goto L_0x00ee;
                case 3: goto L_0x00ee;
                case 4: goto L_0x0109;
                case 5: goto L_0x0124;
                case 6: goto L_0x013c;
                case 7: goto L_0x0154;
                case 8: goto L_0x0178;
                case 9: goto L_0x01a4;
                case 10: goto L_0x01e4;
                case 11: goto L_0x0109;
                case 12: goto L_0x0202;
                case 13: goto L_0x013c;
                case 14: goto L_0x0124;
                case 15: goto L_0x0241;
                case 16: goto L_0x0260;
                case 17: goto L_0x027f;
                default: goto L_0x00b8;
            }
        L_0x00b8:
            r11 = r38
            r12 = r39
            r7 = r10
            goto L_0x0048
        L_0x00be:
            r5 = 1
            r0 = r19
            if (r0 != r5) goto L_0x00b8
            r0 = r43
            double r8 = defpackage.dgv.c(r0, r10)
            r0 = r42
            defpackage.dlc.a(r0, r6, r8)
            int r7 = r10 + 8
            r38 = r38 | r14
            r5 = r18
            goto L_0x0010
        L_0x00d6:
            r5 = 5
            r0 = r19
            if (r0 != r5) goto L_0x00b8
            r0 = r43
            float r5 = defpackage.dgv.d(r0, r10)
            r0 = r42
            defpackage.dlc.a(r0, r6, r5)
            int r7 = r10 + 4
            r38 = r38 | r14
            r5 = r18
            goto L_0x0010
        L_0x00ee:
            if (r19 != 0) goto L_0x00b8
            r0 = r43
            r1 = r47
            int r44 = defpackage.dgv.b(r0, r10, r1)
            r0 = r47
            long r8 = r0.b
            r5 = r42
            r4.putLong(r5, r6, r8)
            r38 = r38 | r14
            r5 = r18
            r7 = r44
            goto L_0x0010
        L_0x0109:
            if (r19 != 0) goto L_0x00b8
            r0 = r43
            r1 = r47
            int r44 = defpackage.dgv.a(r0, r10, r1)
            r0 = r47
            int r5 = r0.a
            r0 = r42
            r4.putInt(r0, r6, r5)
            r38 = r38 | r14
            r5 = r18
            r7 = r44
            goto L_0x0010
        L_0x0124:
            r5 = 1
            r0 = r19
            if (r0 != r5) goto L_0x00b8
            r0 = r43
            long r8 = defpackage.dgv.b(r0, r10)
            r5 = r42
            r4.putLong(r5, r6, r8)
            int r7 = r10 + 8
            r38 = r38 | r14
            r5 = r18
            goto L_0x0010
        L_0x013c:
            r5 = 5
            r0 = r19
            if (r0 != r5) goto L_0x00b8
            r0 = r43
            int r5 = defpackage.dgv.a(r0, r10)
            r0 = r42
            r4.putInt(r0, r6, r5)
            int r7 = r10 + 4
            r38 = r38 | r14
            r5 = r18
            goto L_0x0010
        L_0x0154:
            if (r19 != 0) goto L_0x00b8
            r0 = r43
            r1 = r47
            int r44 = defpackage.dgv.b(r0, r10, r1)
            r0 = r47
            long r8 = r0.b
            r10 = 0
            int r5 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r5 == 0) goto L_0x0176
            r5 = 1
        L_0x0169:
            r0 = r42
            defpackage.dlc.a(r0, r6, r5)
            r38 = r38 | r14
            r5 = r18
            r7 = r44
            goto L_0x0010
        L_0x0176:
            r5 = 0
            goto L_0x0169
        L_0x0178:
            r5 = 2
            r0 = r19
            if (r0 != r5) goto L_0x00b8
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            r5 = r5 & r32
            if (r5 != 0) goto L_0x019b
            r0 = r43
            r1 = r47
            int r5 = defpackage.dgv.c(r0, r10, r1)
        L_0x018b:
            r0 = r47
            java.lang.Object r8 = r0.c
            r0 = r42
            r4.putObject(r0, r6, r8)
            r38 = r38 | r14
            r7 = r5
            r5 = r18
            goto L_0x0010
        L_0x019b:
            r0 = r43
            r1 = r47
            int r5 = defpackage.dgv.d(r0, r10, r1)
            goto L_0x018b
        L_0x01a4:
            r5 = 2
            r0 = r19
            if (r0 != r5) goto L_0x00b8
            r0 = r41
            r1 = r20
            dkh r5 = r0.a(r1)
            r0 = r43
            r1 = r45
            r2 = r47
            int r44 = a(r5, r0, r10, r1, r2)
            r5 = r38 & r14
            if (r5 != 0) goto L_0x01d0
            r0 = r47
            java.lang.Object r5 = r0.c
            r0 = r42
            r4.putObject(r0, r6, r5)
        L_0x01c8:
            r38 = r38 | r14
            r5 = r18
            r7 = r44
            goto L_0x0010
        L_0x01d0:
            r0 = r42
            java.lang.Object r5 = r4.getObject(r0, r6)
            r0 = r47
            java.lang.Object r8 = r0.c
            java.lang.Object r5 = defpackage.dim.a(r5, r8)
            r0 = r42
            r4.putObject(r0, r6, r5)
            goto L_0x01c8
        L_0x01e4:
            r5 = 2
            r0 = r19
            if (r0 != r5) goto L_0x00b8
            r0 = r43
            r1 = r47
            int r44 = defpackage.dgv.e(r0, r10, r1)
            r0 = r47
            java.lang.Object r5 = r0.c
            r0 = r42
            r4.putObject(r0, r6, r5)
            r38 = r38 | r14
            r5 = r18
            r7 = r44
            goto L_0x0010
        L_0x0202:
            if (r19 != 0) goto L_0x00b8
            r0 = r43
            r1 = r47
            int r44 = defpackage.dgv.a(r0, r10, r1)
            r0 = r47
            int r5 = r0.a
            r0 = r41
            r1 = r20
            dio r8 = r0.c(r1)
            if (r8 == 0) goto L_0x0220
            din r8 = r8.a(r5)
            if (r8 == 0) goto L_0x022d
        L_0x0220:
            r0 = r42
            r4.putInt(r0, r6, r5)
            r38 = r38 | r14
            r5 = r18
            r7 = r44
            goto L_0x0010
        L_0x022d:
            dky r6 = e(r42)
            long r8 = (long) r5
            java.lang.Long r5 = java.lang.Long.valueOf(r8)
            r0 = r17
            r6.a(r0, r5)
            r5 = r18
            r7 = r44
            goto L_0x0010
        L_0x0241:
            if (r19 != 0) goto L_0x00b8
            r0 = r43
            r1 = r47
            int r44 = defpackage.dgv.a(r0, r10, r1)
            r0 = r47
            int r5 = r0.a
            int r5 = defpackage.dhj.f(r5)
            r0 = r42
            r4.putInt(r0, r6, r5)
            r38 = r38 | r14
            r5 = r18
            r7 = r44
            goto L_0x0010
        L_0x0260:
            if (r19 != 0) goto L_0x00b8
            r0 = r43
            r1 = r47
            int r44 = defpackage.dgv.b(r0, r10, r1)
            r0 = r47
            long r8 = r0.b
            long r8 = defpackage.dhj.a(r8)
            r5 = r42
            r4.putLong(r5, r6, r8)
            r38 = r38 | r14
            r5 = r18
            r7 = r44
            goto L_0x0010
        L_0x027f:
            r5 = 3
            r0 = r19
            if (r0 != r5) goto L_0x00b8
            int r5 = r18 << 3
            r12 = r5 | 4
            r0 = r41
            r1 = r20
            dkh r8 = r0.a(r1)
            r9 = r43
            r11 = r45
            r13 = r47
            int r44 = a(r8, r9, r10, r11, r12, r13)
            r5 = r38 & r14
            if (r5 != 0) goto L_0x02af
            r0 = r47
            java.lang.Object r5 = r0.c
            r0 = r42
            r4.putObject(r0, r6, r5)
        L_0x02a7:
            r38 = r38 | r14
            r5 = r18
            r7 = r44
            goto L_0x0010
        L_0x02af:
            r0 = r42
            java.lang.Object r5 = r4.getObject(r0, r6)
            r0 = r47
            java.lang.Object r8 = r0.c
            java.lang.Object r5 = defpackage.dim.a(r5, r8)
            r0 = r42
            r4.putObject(r0, r6, r5)
            goto L_0x02a7
        L_0x02c3:
            r5 = 27
            r0 = r23
            if (r0 != r5) goto L_0x0308
            r5 = 2
            r0 = r19
            if (r0 != r5) goto L_0x03cf
            r0 = r42
            java.lang.Object r5 = r4.getObject(r0, r6)
            diq r5 = (defpackage.diq) r5
            boolean r8 = r5.a()
            if (r8 != 0) goto L_0x03d6
            int r8 = r5.size()
            if (r8 != 0) goto L_0x0305
            r8 = 10
        L_0x02e4:
            diq r12 = r5.a(r8)
            r0 = r42
            r4.putObject(r0, r6, r12)
        L_0x02ed:
            r0 = r41
            r1 = r20
            dkh r7 = r0.a(r1)
            r8 = r17
            r9 = r43
            r11 = r45
            r13 = r47
            int r7 = a(r7, r8, r9, r10, r11, r12, r13)
            r5 = r18
            goto L_0x0010
        L_0x0305:
            int r8 = r8 << 1
            goto L_0x02e4
        L_0x0308:
            r5 = 49
            r0 = r23
            if (r0 > r5) goto L_0x032c
            r0 = r32
            long r0 = (long) r0
            r21 = r0
            r12 = r41
            r13 = r42
            r14 = r43
            r15 = r10
            r16 = r45
            r24 = r6
            r26 = r47
            int r7 = r12.a(r13, r14, r15, r16, r17, r18, r19, r20, r21, r23, r24, r26)
            if (r7 != r10) goto L_0x03cb
            r11 = r38
            r12 = r39
            goto L_0x0048
        L_0x032c:
            r5 = 50
            r0 = r23
            if (r0 != r5) goto L_0x0353
            r5 = 2
            r0 = r19
            if (r0 != r5) goto L_0x03cf
            r22 = r41
            r23 = r42
            r24 = r43
            r25 = r10
            r26 = r45
            r27 = r20
            r28 = r6
            r30 = r47
            int r7 = r22.a(r23, r24, r25, r26, r27, r28, r30)
            if (r7 != r10) goto L_0x03cb
            r11 = r38
            r12 = r39
            goto L_0x0048
        L_0x0353:
            r24 = r41
            r25 = r42
            r26 = r43
            r27 = r10
            r28 = r45
            r29 = r17
            r30 = r18
            r31 = r19
            r33 = r23
            r34 = r6
            r36 = r20
            r37 = r47
            int r7 = r24.a(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r36, r37)
            if (r7 != r10) goto L_0x03cb
            r11 = r38
            r12 = r39
            goto L_0x0048
        L_0x0377:
            r5 = r11
            r6 = r12
        L_0x0379:
            r8 = -1
            if (r6 == r8) goto L_0x0382
            long r8 = (long) r6
            r0 = r42
            r4.putInt(r0, r8, r5)
        L_0x0382:
            r5 = 0
            r0 = r41
            int r4 = r0.m
            r40 = r4
            r4 = r5
            r5 = r40
        L_0x038c:
            r0 = r41
            int r6 = r0.n
            if (r5 >= r6) goto L_0x03a9
            r0 = r41
            int[] r6 = r0.l
            r6 = r6[r5]
            r0 = r41
            dkx r8 = r0.p
            r0 = r41
            r1 = r42
            java.lang.Object r4 = r0.a(r1, r6, r4, r8)
            dky r4 = (defpackage.dky) r4
            int r5 = r5 + 1
            goto L_0x038c
        L_0x03a9:
            if (r4 == 0) goto L_0x03b0
            r0 = r42
            defpackage.dkx.a(r0, (defpackage.dky) r4)
        L_0x03b0:
            if (r46 != 0) goto L_0x03bb
            r0 = r45
            if (r7 == r0) goto L_0x03ca
            dir r4 = defpackage.dir.i()
            throw r4
        L_0x03bb:
            r0 = r45
            if (r7 > r0) goto L_0x03c5
            r0 = r17
            r1 = r46
            if (r0 == r1) goto L_0x03ca
        L_0x03c5:
            dir r4 = defpackage.dir.i()
            throw r4
        L_0x03ca:
            return r7
        L_0x03cb:
            r5 = r18
            goto L_0x0010
        L_0x03cf:
            r11 = r38
            r12 = r39
            r7 = r10
            goto L_0x0048
        L_0x03d6:
            r12 = r5
            goto L_0x02ed
        L_0x03d9:
            r5 = r38
            r6 = r39
            goto L_0x0379
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.djr.a(java.lang.Object, byte[], int, int, int, dgw):int");
    }

    /* JADX WARNING: type inference failed for: r13v1, types: [int] */
    /* JADX WARNING: type inference failed for: r25v0, types: [int] */
    /* JADX WARNING: type inference failed for: r6v3, types: [int] */
    /* JADX WARNING: type inference failed for: r5v65, types: [int] */
    /* JADX WARNING: type inference failed for: r13v3 */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0235, code lost:
        if (r7 != r11) goto L_0x0237;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0257, code lost:
        if (r7 == r11) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0277, code lost:
        if (r7 == r11) goto L_0x003a;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.Object r35, byte[] r36, int r37, int r38, defpackage.dgw r39) {
        /*
            r34 = this;
            r0 = r34
            boolean r4 = r0.j
            if (r4 == 0) goto L_0x0284
            sun.misc.Unsafe r4 = b
            r14 = -1
            r16 = 0
            r5 = r14
            r7 = r37
        L_0x000e:
            r0 = r38
            if (r7 >= r0) goto L_0x027b
            int r11 = r7 + 1
            byte r13 = r36[r7]
            if (r13 >= 0) goto L_0x0024
            r0 = r36
            r1 = r39
            int r11 = defpackage.dgv.a(r13, r0, r11, r1)
            r0 = r39
            int r13 = r0.a
        L_0x0024:
            int r14 = r13 >>> 3
            r15 = r13 & 7
            if (r14 <= r5) goto L_0x0049
            int r5 = r16 / 3
            r0 = r34
            int r16 = r0.a(r14, r5)
        L_0x0032:
            r5 = -1
            r0 = r16
            if (r0 != r5) goto L_0x0050
            r16 = 0
            r7 = r11
        L_0x003a:
            r5 = r13
            r6 = r36
            r8 = r38
            r9 = r35
            r10 = r39
            int r7 = a(r5, r6, r7, r8, r9, r10)
            r5 = r14
            goto L_0x000e
        L_0x0049:
            r0 = r34
            int r16 = r0.g(r14)
            goto L_0x0032
        L_0x0050:
            r0 = r34
            int[] r5 = r0.c
            int r6 = r16 + 1
            r28 = r5[r6]
            r5 = 267386880(0xff00000, float:2.3665827E-29)
            r5 = r5 & r28
            int r19 = r5 >>> 20
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r28
            long r6 = (long) r5
            r5 = 17
            r0 = r19
            if (r0 > r5) goto L_0x01d8
            switch(r19) {
                case 0: goto L_0x006f;
                case 1: goto L_0x0081;
                case 2: goto L_0x0094;
                case 3: goto L_0x0094;
                case 4: goto L_0x00ac;
                case 5: goto L_0x00c4;
                case 6: goto L_0x00d7;
                case 7: goto L_0x00ea;
                case 8: goto L_0x010b;
                case 9: goto L_0x0132;
                case 10: goto L_0x016f;
                case 11: goto L_0x00ac;
                case 12: goto L_0x0188;
                case 13: goto L_0x00d7;
                case 14: goto L_0x00c4;
                case 15: goto L_0x01a0;
                case 16: goto L_0x01bc;
                default: goto L_0x006d;
            }
        L_0x006d:
            r7 = r11
            goto L_0x003a
        L_0x006f:
            r5 = 1
            if (r15 != r5) goto L_0x0295
            r0 = r36
            double r8 = defpackage.dgv.c(r0, r11)
            r0 = r35
            defpackage.dlc.a(r0, r6, r8)
            int r7 = r11 + 8
            r5 = r14
            goto L_0x000e
        L_0x0081:
            r5 = 5
            if (r15 != r5) goto L_0x0295
            r0 = r36
            float r5 = defpackage.dgv.d(r0, r11)
            r0 = r35
            defpackage.dlc.a(r0, r6, r5)
            int r7 = r11 + 4
            r5 = r14
            goto L_0x000e
        L_0x0094:
            if (r15 != 0) goto L_0x0295
            r0 = r36
            r1 = r39
            int r37 = defpackage.dgv.b(r0, r11, r1)
            r0 = r39
            long r8 = r0.b
            r5 = r35
            r4.putLong(r5, r6, r8)
            r5 = r14
            r7 = r37
            goto L_0x000e
        L_0x00ac:
            if (r15 != 0) goto L_0x0295
            r0 = r36
            r1 = r39
            int r37 = defpackage.dgv.a(r0, r11, r1)
            r0 = r39
            int r5 = r0.a
            r0 = r35
            r4.putInt(r0, r6, r5)
            r5 = r14
            r7 = r37
            goto L_0x000e
        L_0x00c4:
            r5 = 1
            if (r15 != r5) goto L_0x0295
            r0 = r36
            long r8 = defpackage.dgv.b(r0, r11)
            r5 = r35
            r4.putLong(r5, r6, r8)
            int r7 = r11 + 8
            r5 = r14
            goto L_0x000e
        L_0x00d7:
            r5 = 5
            if (r15 != r5) goto L_0x0295
            r0 = r36
            int r5 = defpackage.dgv.a(r0, r11)
            r0 = r35
            r4.putInt(r0, r6, r5)
            int r7 = r11 + 4
            r5 = r14
            goto L_0x000e
        L_0x00ea:
            if (r15 != 0) goto L_0x0295
            r0 = r36
            r1 = r39
            int r37 = defpackage.dgv.b(r0, r11, r1)
            r0 = r39
            long r8 = r0.b
            r10 = 0
            int r5 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r5 == 0) goto L_0x0109
            r5 = 1
        L_0x00ff:
            r0 = r35
            defpackage.dlc.a(r0, r6, r5)
            r5 = r14
            r7 = r37
            goto L_0x000e
        L_0x0109:
            r5 = 0
            goto L_0x00ff
        L_0x010b:
            r5 = 2
            if (r15 != r5) goto L_0x0295
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            r5 = r5 & r28
            if (r5 != 0) goto L_0x0129
            r0 = r36
            r1 = r39
            int r5 = defpackage.dgv.c(r0, r11, r1)
        L_0x011c:
            r0 = r39
            java.lang.Object r8 = r0.c
            r0 = r35
            r4.putObject(r0, r6, r8)
            r7 = r5
            r5 = r14
            goto L_0x000e
        L_0x0129:
            r0 = r36
            r1 = r39
            int r5 = defpackage.dgv.d(r0, r11, r1)
            goto L_0x011c
        L_0x0132:
            r5 = 2
            if (r15 != r5) goto L_0x0295
            r0 = r34
            r1 = r16
            dkh r5 = r0.a(r1)
            r0 = r36
            r1 = r38
            r2 = r39
            int r37 = a(r5, r0, r11, r1, r2)
            r0 = r35
            java.lang.Object r5 = r4.getObject(r0, r6)
            if (r5 != 0) goto L_0x015d
            r0 = r39
            java.lang.Object r5 = r0.c
            r0 = r35
            r4.putObject(r0, r6, r5)
            r5 = r14
            r7 = r37
            goto L_0x000e
        L_0x015d:
            r0 = r39
            java.lang.Object r8 = r0.c
            java.lang.Object r5 = defpackage.dim.a(r5, r8)
            r0 = r35
            r4.putObject(r0, r6, r5)
            r5 = r14
            r7 = r37
            goto L_0x000e
        L_0x016f:
            r5 = 2
            if (r15 != r5) goto L_0x0295
            r0 = r36
            r1 = r39
            int r37 = defpackage.dgv.e(r0, r11, r1)
            r0 = r39
            java.lang.Object r5 = r0.c
            r0 = r35
            r4.putObject(r0, r6, r5)
            r5 = r14
            r7 = r37
            goto L_0x000e
        L_0x0188:
            if (r15 != 0) goto L_0x0295
            r0 = r36
            r1 = r39
            int r37 = defpackage.dgv.a(r0, r11, r1)
            r0 = r39
            int r5 = r0.a
            r0 = r35
            r4.putInt(r0, r6, r5)
            r5 = r14
            r7 = r37
            goto L_0x000e
        L_0x01a0:
            if (r15 != 0) goto L_0x0295
            r0 = r36
            r1 = r39
            int r37 = defpackage.dgv.a(r0, r11, r1)
            r0 = r39
            int r5 = r0.a
            int r5 = defpackage.dhj.f(r5)
            r0 = r35
            r4.putInt(r0, r6, r5)
            r5 = r14
            r7 = r37
            goto L_0x000e
        L_0x01bc:
            if (r15 != 0) goto L_0x0295
            r0 = r36
            r1 = r39
            int r37 = defpackage.dgv.b(r0, r11, r1)
            r0 = r39
            long r8 = r0.b
            long r8 = defpackage.dhj.a(r8)
            r5 = r35
            r4.putLong(r5, r6, r8)
            r5 = r14
            r7 = r37
            goto L_0x000e
        L_0x01d8:
            r5 = 27
            r0 = r19
            if (r0 != r5) goto L_0x021a
            r5 = 2
            if (r15 != r5) goto L_0x0295
            r0 = r35
            java.lang.Object r5 = r4.getObject(r0, r6)
            diq r5 = (defpackage.diq) r5
            boolean r8 = r5.a()
            if (r8 != 0) goto L_0x0298
            int r8 = r5.size()
            if (r8 != 0) goto L_0x0217
            r8 = 10
        L_0x01f7:
            diq r10 = r5.a(r8)
            r0 = r35
            r4.putObject(r0, r6, r10)
        L_0x0200:
            r0 = r34
            r1 = r16
            dkh r5 = r0.a(r1)
            r6 = r13
            r7 = r36
            r8 = r11
            r9 = r38
            r11 = r39
            int r7 = a(r5, r6, r7, r8, r9, r10, r11)
            r5 = r14
            goto L_0x000e
        L_0x0217:
            int r8 = r8 << 1
            goto L_0x01f7
        L_0x021a:
            r5 = 49
            r0 = r19
            if (r0 > r5) goto L_0x023a
            r0 = r28
            long r0 = (long) r0
            r17 = r0
            r8 = r34
            r9 = r35
            r10 = r36
            r12 = r38
            r20 = r6
            r22 = r39
            int r7 = r8.a(r9, r10, r11, r12, r13, r14, r15, r16, r17, r19, r20, r22)
            if (r7 == r11) goto L_0x003a
        L_0x0237:
            r5 = r14
            goto L_0x000e
        L_0x023a:
            r5 = 50
            r0 = r19
            if (r0 != r5) goto L_0x025b
            r5 = 2
            if (r15 != r5) goto L_0x0295
            r18 = r34
            r19 = r35
            r20 = r36
            r21 = r11
            r22 = r38
            r23 = r16
            r24 = r6
            r26 = r39
            int r7 = r18.a(r19, r20, r21, r22, r23, r24, r26)
            if (r7 != r11) goto L_0x0237
            goto L_0x003a
        L_0x025b:
            r20 = r34
            r21 = r35
            r22 = r36
            r23 = r11
            r24 = r38
            r25 = r13
            r26 = r14
            r27 = r15
            r29 = r19
            r30 = r6
            r32 = r16
            r33 = r39
            int r7 = r20.a(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r32, r33)
            if (r7 != r11) goto L_0x0237
            goto L_0x003a
        L_0x027b:
            r0 = r38
            if (r7 == r0) goto L_0x0294
            dir r4 = defpackage.dir.i()
            throw r4
        L_0x0284:
            r9 = 0
            r4 = r34
            r5 = r35
            r6 = r36
            r7 = r37
            r8 = r38
            r10 = r39
            r4.a(r5, r6, r7, r8, r9, r10)
        L_0x0294:
            return
        L_0x0295:
            r7 = r11
            goto L_0x003a
        L_0x0298:
            r10 = r5
            goto L_0x0200
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.djr.a(java.lang.Object, byte[], int, int, dgw):void");
    }

    public final void c(java.lang.Object obj) {
        int i2 = this.m;
        while (true) {
            int i3 = i2;
            if (i3 >= this.n) {
                break;
            }
            long d2 = (long) (d(this.l[i3]) & 1048575);
            java.lang.Object f2 = defpackage.dlc.f(obj, d2);
            if (f2 != null) {
                ((defpackage.djj) f2).a = false;
                defpackage.dlc.a(obj, d2, f2);
            }
            i2 = i3 + 1;
        }
        int length = this.l.length;
        for (int i4 = this.n; i4 < length; i4++) {
            this.o.b(obj, (long) this.l[i4]);
        }
        defpackage.dkx.b(obj);
        if (this.h) {
            defpackage.dhy.b(obj);
        }
    }

    private final java.lang.Object a(java.lang.Object obj, int i2, java.lang.Object obj2, defpackage.dkx dkx) {
        int i3 = this.c[i2];
        java.lang.Object f2 = defpackage.dlc.f(obj, (long) (d(i2) & 1048575));
        if (f2 == null) {
            return obj2;
        }
        defpackage.dio c2 = c(i2);
        if (c2 == null) {
            return obj2;
        }
        return a(i2, i3, (java.util.Map) (defpackage.djj) f2, c2, obj2, dkx);
    }

    private final java.lang.Object a(int i2, int i3, java.util.Map map, defpackage.dio dio, java.lang.Object obj, defpackage.dkx dkx) {
        defpackage.dji dji = ((defpackage.djh) b(i2)).a;
        java.util.Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            if (dio.a(((java.lang.Integer) entry.getValue()).intValue()) == null) {
                if (obj == null) {
                    obj = new defpackage.dky();
                }
                defpackage.dhf b2 = defpackage.dha.b(defpackage.djh.a(dji, entry.getKey(), entry.getValue()));
                try {
                    defpackage.djh.a(b2.a, dji, entry.getKey(), entry.getValue());
                    ((defpackage.dky) obj).a((i3 << 3) | 2, (java.lang.Object) b2.a());
                    it.remove();
                } catch (java.io.IOException e2) {
                    throw new java.lang.RuntimeException(e2);
                }
            }
        }
        return obj;
    }

    public final boolean d(java.lang.Object obj) {
        int i2;
        int i3;
        int i4;
        boolean z;
        boolean z2;
        int i5 = 0;
        int i6 = -1;
        int i7 = 0;
        while (i5 < this.m) {
            int i8 = this.l[i5];
            int i9 = this.c[i8];
            int d2 = d(i8);
            if (!this.j) {
                int i10 = this.c[i8 + 2];
                i3 = i10 & 1048575;
                int i11 = 1 << (i10 >>> 20);
                if (i3 != i6) {
                    i4 = i11;
                    i2 = b.getInt(obj, (long) i3);
                } else {
                    i3 = i6;
                    i4 = i11;
                    i2 = i7;
                }
            } else {
                i2 = i7;
                i3 = i6;
                i4 = 0;
            }
            if (((268435456 & d2) != 0) && !a(obj, i8, i2, i4)) {
                return false;
            }
            switch ((267386880 & d2) >>> 20) {
                case 9:
                case 17:
                    if (a(obj, i8, i2, i4) && !a(obj, d2, a(i8))) {
                        return false;
                    }
                case 27:
                case 49:
                    java.util.List list = (java.util.List) defpackage.dlc.f(obj, (long) (d2 & 1048575));
                    if (!list.isEmpty()) {
                        defpackage.dkh a2 = a(i8);
                        int i12 = 0;
                        while (true) {
                            if (i12 < list.size()) {
                                if (!a2.d(list.get(i12))) {
                                    z2 = false;
                                } else {
                                    i12++;
                                }
                            }
                        }
                    }
                    z2 = true;
                    if (z2) {
                        break;
                    } else {
                        return false;
                    }
                case 50:
                    defpackage.djj djj = (defpackage.djj) defpackage.dlc.f(obj, (long) (d2 & 1048575));
                    if (!djj.isEmpty() && ((defpackage.djh) b(i8)).a.c.e == defpackage.dls.MESSAGE) {
                        java.util.Iterator it = djj.values().iterator();
                        defpackage.dkh dkh = null;
                        while (true) {
                            if (it.hasNext()) {
                                java.lang.Object next = it.next();
                                if (dkh == null) {
                                    dkh = defpackage.djz.a.a(next.getClass());
                                }
                                if (!dkh.d(next)) {
                                    z = false;
                                }
                            }
                        }
                    }
                    z = true;
                    if (z) {
                        break;
                    } else {
                        return false;
                    }
                case 60:
                case 68:
                    if (a(obj, i9, i8) && !a(obj, d2, a(i8))) {
                        return false;
                    }
            }
            i5++;
            i6 = i3;
            i7 = i2;
        }
        if (!this.h || ((defpackage.dij) obj).a.c()) {
            return true;
        }
        return false;
    }

    private static boolean a(java.lang.Object obj, int i2, defpackage.dkh dkh) {
        return dkh.d(defpackage.dlc.f(obj, (long) (1048575 & i2)));
    }

    private static void a(int i2, java.lang.Object obj, defpackage.dlt dlt) {
        if (obj instanceof java.lang.String) {
            dlt.a.a(i2, (java.lang.String) obj);
            return;
        }
        dlt.a(i2, (defpackage.dha) obj);
    }

    private final void a(java.lang.Object obj, int i2, defpackage.dkc dkc) {
        if (f(i2)) {
            defpackage.dlc.a(obj, (long) (i2 & 1048575), (java.lang.Object) dkc.m());
        } else if (this.i) {
            defpackage.dlc.a(obj, (long) (i2 & 1048575), (java.lang.Object) dkc.l());
        } else {
            defpackage.dlc.a(obj, (long) (i2 & 1048575), (java.lang.Object) dkc.n());
        }
    }

    private final int d(int i2) {
        return this.c[i2 + 1];
    }

    private final int e(int i2) {
        return this.c[i2 + 2];
    }

    private static boolean f(int i2) {
        return (536870912 & i2) != 0;
    }

    private static double b(java.lang.Object obj, long j2) {
        return ((java.lang.Double) defpackage.dlc.f(obj, j2)).doubleValue();
    }

    private static float c(java.lang.Object obj, long j2) {
        return ((java.lang.Float) defpackage.dlc.f(obj, j2)).floatValue();
    }

    private static int d(java.lang.Object obj, long j2) {
        return ((java.lang.Integer) defpackage.dlc.f(obj, j2)).intValue();
    }

    private static long e(java.lang.Object obj, long j2) {
        return ((java.lang.Long) defpackage.dlc.f(obj, j2)).longValue();
    }

    private static boolean f(java.lang.Object obj, long j2) {
        return ((java.lang.Boolean) defpackage.dlc.f(obj, j2)).booleanValue();
    }

    private final boolean c(java.lang.Object obj, java.lang.Object obj2, int i2) {
        return a(obj, i2) == a(obj2, i2);
    }

    private final boolean a(java.lang.Object obj, int i2, int i3, int i4) {
        if (this.j) {
            return a(obj, i2);
        }
        return (i3 & i4) != 0;
    }

    private final boolean a(java.lang.Object obj, int i2) {
        if (this.j) {
            int d2 = d(i2);
            long j2 = (long) (d2 & 1048575);
            switch ((d2 & 267386880) >>> 20) {
                case 0:
                    if (defpackage.dlc.e(obj, j2) != 0.0d) {
                        return true;
                    }
                    return false;
                case 1:
                    return defpackage.dlc.d(obj, j2) != 0.0f;
                case 2:
                    return defpackage.dlc.b(obj, j2) != 0;
                case 3:
                    return defpackage.dlc.b(obj, j2) != 0;
                case 4:
                    return defpackage.dlc.a(obj, j2) != 0;
                case 5:
                    return defpackage.dlc.b(obj, j2) != 0;
                case 6:
                    return defpackage.dlc.a(obj, j2) != 0;
                case 7:
                    return defpackage.dlc.c(obj, j2);
                case 8:
                    java.lang.Object f2 = defpackage.dlc.f(obj, j2);
                    if (f2 instanceof java.lang.String) {
                        return !((java.lang.String) f2).isEmpty();
                    }
                    if (f2 instanceof defpackage.dha) {
                        return !defpackage.dha.a.equals(f2);
                    }
                    throw new java.lang.IllegalArgumentException();
                case 9:
                    return defpackage.dlc.f(obj, j2) != null;
                case 10:
                    return !defpackage.dha.a.equals(defpackage.dlc.f(obj, j2));
                case 11:
                    return defpackage.dlc.a(obj, j2) != 0;
                case 12:
                    return defpackage.dlc.a(obj, j2) != 0;
                case 13:
                    return defpackage.dlc.a(obj, j2) != 0;
                case 14:
                    return defpackage.dlc.b(obj, j2) != 0;
                case 15:
                    return defpackage.dlc.a(obj, j2) != 0;
                case 16:
                    return defpackage.dlc.b(obj, j2) != 0;
                case 17:
                    return defpackage.dlc.f(obj, j2) != null;
                default:
                    throw new java.lang.IllegalArgumentException();
            }
        } else {
            int e2 = e(i2);
            return (defpackage.dlc.a(obj, (long) (e2 & 1048575)) & (1 << (e2 >>> 20))) != 0;
        }
    }

    private final void b(java.lang.Object obj, int i2) {
        if (!this.j) {
            int e2 = e(i2);
            long j2 = (long) (e2 & 1048575);
            defpackage.dlc.a(obj, j2, defpackage.dlc.a(obj, j2) | (1 << (e2 >>> 20)));
        }
    }

    private final boolean a(java.lang.Object obj, int i2, int i3) {
        return defpackage.dlc.a(obj, (long) (e(i3) & 1048575)) == i2;
    }

    private final void b(java.lang.Object obj, int i2, int i3) {
        defpackage.dlc.a(obj, (long) (e(i3) & 1048575), i2);
    }

    private final int g(int i2) {
        if (i2 < this.e || i2 > this.f) {
            return -1;
        }
        return b(i2, 0);
    }

    private final int a(int i2, int i3) {
        if (i2 < this.e || i2 > this.f) {
            return -1;
        }
        return b(i2, i3);
    }

    private final int b(int i2, int i3) {
        int length = (this.c.length / 3) - 1;
        while (i3 <= length) {
            int i4 = (length + i3) >>> 1;
            int i5 = i4 * 3;
            int i6 = this.c[i5];
            if (i2 == i6) {
                return i5;
            }
            if (i2 < i6) {
                length = i4 - 1;
            } else {
                i3 = i4 + 1;
            }
        }
        return -1;
    }
}
