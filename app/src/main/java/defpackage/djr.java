package defpackage;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* renamed from: djr  reason: default package */
/* compiled from: PG */
final class djr implements dkh {
    private static final int[] a = new int[0];
    private static final Unsafe b = dlc.a();
    private final int[] c;
    private final Object[] d;
    private final int e;
    private final int f;
    private final djo g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final boolean k;
    private final int[] l;
    private final int m;
    private final int n;
    private final dja o;
    private final dkx p;
    private final dhy q;
    private final djk r;

    private djr(int[] iArr, Object[] objArr, int i2, int i3, djo djo, boolean z, int[] iArr2, int i4, int i5, dju dju, dja dja, dkx dkx, dhy dhy, djk djk) {
        this.c = iArr;
        this.d = objArr;
        this.e = i2;
        this.f = i3;
        this.i = djo instanceof dih;
        this.j = z;
        this.h = dhy != null && (djo instanceof dij);
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

    static djr a(djm djm, dju dju, dja dja, dkx dkx, dhy dhy, djk djk) {
        char c2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int[] iArr;
        int i8;
        int i9;
        int i10;
        int i11;
        char charAt;
        char charAt2;
        char charAt3;
        char charAt4;
        char charAt5;
        char charAt6;
        char charAt7;
        char charAt8;
        int i12;
        int i13;
        char c3;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        char c4;
        int i21;
        Field a2;
        char charAt9;
        int i22;
        int i23;
        int i24;
        Field a3;
        Field a4;
        char charAt10;
        char charAt11;
        char charAt12;
        int i25;
        char charAt13;
        char charAt14;
        if (djm instanceof dkb) {
            dkb dkb = (dkb) djm;
            boolean z = dkb.a() == bg.as;
            String str = dkb.b;
            int length = str.length();
            int i26 = 1;
            char charAt15 = str.charAt(0);
            if (charAt15 >= 55296) {
                int i27 = charAt15 & 8191;
                int i28 = 13;
                while (true) {
                    i2 = i26 + 1;
                    charAt14 = str.charAt(i26);
                    if (charAt14 < 55296) {
                        break;
                    }
                    i27 |= (charAt14 & 8191) << i28;
                    i28 += 13;
                    i26 = i2;
                }
                c2 = (charAt14 << i28) | i27;
            } else {
                c2 = charAt15;
                i2 = 1;
            }
            int i29 = i2 + 1;
            int charAt16 = str.charAt(i2);
            if (charAt16 >= 55296) {
                int i30 = charAt16 & 8191;
                int i31 = 13;
                while (true) {
                    i25 = i29 + 1;
                    charAt13 = str.charAt(i29);
                    if (charAt13 < 55296) {
                        break;
                    }
                    i30 |= (charAt13 & 8191) << i31;
                    i31 += 13;
                    i29 = i25;
                }
                charAt16 = (charAt13 << i31) | i30;
                i3 = i25;
            } else {
                i3 = i29;
            }
            if (charAt16 == 0) {
                i8 = 0;
                iArr = a;
                i6 = 0;
                i5 = 0;
                i7 = 0;
                i9 = 0;
                i10 = 0;
                i11 = 0;
            } else {
                int i32 = i3 + 1;
                int charAt17 = str.charAt(i3);
                if (charAt17 >= 55296) {
                    int i33 = charAt17 & 8191;
                    int i34 = 13;
                    while (true) {
                        i4 = i32 + 1;
                        charAt8 = str.charAt(i32);
                        if (charAt8 < 55296) {
                            break;
                        }
                        i33 |= (charAt8 & 8191) << i34;
                        i34 += 13;
                        i32 = i4;
                    }
                    charAt17 = (charAt8 << i34) | i33;
                } else {
                    i4 = i32;
                }
                int i35 = i4 + 1;
                int charAt18 = str.charAt(i4);
                if (charAt18 >= 55296) {
                    int i36 = charAt18 & 8191;
                    int i37 = 13;
                    while (true) {
                        i35++;
                        charAt7 = str.charAt(i35);
                        if (charAt7 < 55296) {
                            break;
                        }
                        i36 |= (charAt7 & 8191) << i37;
                        i37 += 13;
                    }
                    charAt18 = (charAt7 << i37) | i36;
                }
                int i38 = i35 + 1;
                int charAt19 = str.charAt(i35);
                if (charAt19 >= 55296) {
                    int i39 = charAt19 & 8191;
                    int i40 = 13;
                    while (true) {
                        i38++;
                        charAt6 = str.charAt(i38);
                        if (charAt6 < 55296) {
                            break;
                        }
                        i39 |= (charAt6 & 8191) << i40;
                        i40 += 13;
                    }
                    charAt19 = (charAt6 << i40) | i39;
                }
                int i41 = i38 + 1;
                int charAt20 = str.charAt(i38);
                if (charAt20 >= 55296) {
                    int i42 = charAt20 & 8191;
                    int i43 = 13;
                    while (true) {
                        i41++;
                        charAt5 = str.charAt(i41);
                        if (charAt5 < 55296) {
                            break;
                        }
                        i42 |= (charAt5 & 8191) << i43;
                        i43 += 13;
                    }
                    charAt20 = (charAt5 << i43) | i42;
                }
                int i44 = i41 + 1;
                int charAt21 = str.charAt(i41);
                if (charAt21 >= 55296) {
                    int i45 = charAt21 & 8191;
                    int i46 = 13;
                    while (true) {
                        i44++;
                        charAt4 = str.charAt(i44);
                        if (charAt4 < 55296) {
                            break;
                        }
                        i45 |= (charAt4 & 8191) << i46;
                        i46 += 13;
                    }
                    charAt21 = (charAt4 << i46) | i45;
                }
                int i47 = i44 + 1;
                int charAt22 = str.charAt(i44);
                if (charAt22 >= 55296) {
                    int i48 = charAt22 & 8191;
                    int i49 = 13;
                    while (true) {
                        i47++;
                        charAt3 = str.charAt(i47);
                        if (charAt3 < 55296) {
                            break;
                        }
                        i48 |= (charAt3 & 8191) << i49;
                        i49 += 13;
                    }
                    charAt22 = (charAt3 << i49) | i48;
                }
                int i50 = i47 + 1;
                int charAt23 = str.charAt(i47);
                if (charAt23 >= 55296) {
                    int i51 = charAt23 & 8191;
                    int i52 = 13;
                    while (true) {
                        i50++;
                        charAt2 = str.charAt(i50);
                        if (charAt2 < 55296) {
                            break;
                        }
                        i51 |= (charAt2 & 8191) << i52;
                        i52 += 13;
                    }
                    charAt23 = (charAt2 << i52) | i51;
                }
                i3 = i50 + 1;
                int charAt24 = str.charAt(i50);
                if (charAt24 >= 55296) {
                    int i53 = charAt24 & 8191;
                    int i54 = 13;
                    while (true) {
                        i3++;
                        charAt = str.charAt(i3);
                        if (charAt < 55296) {
                            break;
                        }
                        i53 |= (charAt & 8191) << i54;
                        i54 += 13;
                    }
                    charAt24 = (charAt << i54) | i53;
                }
                i5 = charAt17;
                i6 = charAt18 + (charAt17 << 1);
                i7 = charAt22;
                iArr = new int[(charAt23 + charAt24 + charAt22)];
                i8 = charAt24;
                i9 = charAt19;
                i10 = charAt21;
                i11 = charAt20;
            }
            Unsafe unsafe = b;
            Object[] objArr = dkb.c;
            int i55 = 0;
            Class<?> cls = dkb.a.getClass();
            int[] iArr2 = new int[(i10 * 3)];
            Object[] objArr2 = new Object[(i10 << 1)];
            int i56 = i8 + i7;
            int i57 = 0;
            int i58 = i8;
            int i59 = i6;
            int i60 = i3;
            while (i60 < length) {
                int i61 = i60 + 1;
                char charAt25 = str.charAt(i60);
                if (charAt25 >= 55296) {
                    int i62 = charAt25 & 8191;
                    int i63 = 13;
                    while (true) {
                        i13 = i61 + 1;
                        charAt12 = str.charAt(i61);
                        if (charAt12 < 55296) {
                            break;
                        }
                        i62 |= (charAt12 & 8191) << i63;
                        i63 += 13;
                        i61 = i13;
                    }
                    i12 = (charAt12 << i63) | i62;
                } else {
                    i12 = charAt25;
                    i13 = i61;
                }
                int i64 = i13 + 1;
                char charAt26 = str.charAt(i13);
                if (charAt26 >= 55296) {
                    int i65 = charAt26 & 8191;
                    int i66 = 13;
                    while (true) {
                        i64++;
                        charAt11 = str.charAt(i64);
                        if (charAt11 < 55296) {
                            break;
                        }
                        i65 |= (charAt11 & 8191) << i66;
                        i66 += 13;
                    }
                    c3 = (charAt11 << i66) | i65;
                    i60 = i64;
                } else {
                    c3 = charAt26;
                    i60 = i64;
                }
                int i67 = c3 & 255;
                if ((c3 & 1024) != 0) {
                    iArr[i55] = i57;
                    i14 = i55 + 1;
                } else {
                    i14 = i55;
                }
                if (i67 > dic.MAP.k) {
                    int i68 = i60 + 1;
                    int charAt27 = str.charAt(i60);
                    if (charAt27 >= 55296) {
                        int i69 = charAt27 & 8191;
                        int i70 = 13;
                        while (true) {
                            i23 = i68 + 1;
                            charAt10 = str.charAt(i68);
                            if (charAt10 < 55296) {
                                break;
                            }
                            i69 |= (charAt10 & 8191) << i70;
                            i70 += 13;
                            i68 = i23;
                        }
                        charAt27 = (charAt10 << i70) | i69;
                    } else {
                        i23 = i68;
                    }
                    if (i67 == dic.MESSAGE.k + 51 || i67 == dic.GROUP.k + 51) {
                        i24 = i59 + 1;
                        objArr2[((i57 / 3) << 1) + 1] = objArr[i59];
                    } else if (i67 == dic.ENUM.k + 51 && (c2 & 1) == 1) {
                        i24 = i59 + 1;
                        objArr2[((i57 / 3) << 1) + 1] = objArr[i59];
                    } else {
                        i24 = i59;
                    }
                    int i71 = charAt27 << 1;
                    Object obj = objArr[i71];
                    if (obj instanceof Field) {
                        a3 = (Field) obj;
                    } else {
                        a3 = a((Class) cls, (String) obj);
                        objArr[i71] = a3;
                    }
                    i18 = (int) unsafe.objectFieldOffset(a3);
                    int i72 = i71 + 1;
                    Object obj2 = objArr[i72];
                    if (obj2 instanceof Field) {
                        a4 = (Field) obj2;
                    } else {
                        a4 = a((Class) cls, (String) obj2);
                        objArr[i72] = a4;
                    }
                    i19 = i24;
                    i60 = i23;
                    i17 = 0;
                    i20 = (int) unsafe.objectFieldOffset(a4);
                } else {
                    int i73 = i59 + 1;
                    Field a5 = a((Class) cls, (String) objArr[i59]);
                    if (i67 == dic.MESSAGE.k || i67 == dic.GROUP.k) {
                        objArr2[((i57 / 3) << 1) + 1] = a5.getType();
                        i15 = i73;
                        i16 = i58;
                    } else if (i67 == dic.MESSAGE_LIST.k || i67 == dic.GROUP_LIST.k) {
                        int i74 = i73 + 1;
                        objArr2[((i57 / 3) << 1) + 1] = objArr[i73];
                        i16 = i58;
                        i15 = i74;
                    } else {
                        if (i67 == dic.ENUM.k || i67 == dic.ENUM_LIST.k || i67 == dic.ENUM_LIST_PACKED.k) {
                            if ((c2 & 1) == 1) {
                                int i75 = i73 + 1;
                                objArr2[((i57 / 3) << 1) + 1] = objArr[i73];
                                i16 = i58;
                                i15 = i75;
                            }
                        } else if (i67 == dic.MAP.k) {
                            int i76 = i58 + 1;
                            iArr[i58] = i57;
                            i15 = i73 + 1;
                            objArr2[(i57 / 3) << 1] = objArr[i73];
                            if ((c3 & 2048) != 0) {
                                objArr2[((i57 / 3) << 1) + 1] = objArr[i15];
                                i15++;
                                i16 = i76;
                            } else {
                                i16 = i76;
                            }
                        }
                        i15 = i73;
                        i16 = i58;
                    }
                    int objectFieldOffset = (int) unsafe.objectFieldOffset(a5);
                    if ((c2 & 1) != 1 || i67 > dic.GROUP.k) {
                        i17 = 0;
                        i18 = objectFieldOffset;
                        i58 = i16;
                        i19 = i15;
                        i20 = 0;
                    } else {
                        int i77 = i60 + 1;
                        char charAt28 = str.charAt(i60);
                        if (charAt28 >= 55296) {
                            int i78 = charAt28 & 8191;
                            int i79 = 13;
                            while (true) {
                                i21 = i77 + 1;
                                charAt9 = str.charAt(i77);
                                if (charAt9 < 55296) {
                                    break;
                                }
                                i78 |= (charAt9 & 8191) << i79;
                                i79 += 13;
                                i77 = i21;
                            }
                            c4 = (charAt9 << i79) | i78;
                        } else {
                            c4 = charAt28;
                            i21 = i77;
                        }
                        int i80 = (c4 / ' ') + (i5 << 1);
                        Object obj3 = objArr[i80];
                        if (obj3 instanceof Field) {
                            a2 = (Field) obj3;
                        } else {
                            a2 = a((Class) cls, (String) obj3);
                            objArr[i80] = a2;
                        }
                        i17 = c4 % ' ';
                        i18 = objectFieldOffset;
                        i60 = i21;
                        i58 = i16;
                        i19 = i15;
                        i20 = (int) unsafe.objectFieldOffset(a2);
                    }
                }
                if (i67 < 18 || i67 > 49) {
                    i22 = i56;
                } else {
                    i22 = i56 + 1;
                    iArr[i56] = i18;
                }
                int i81 = i57 + 1;
                iArr2[i57] = i12;
                int i82 = i81 + 1;
                iArr2[i81] = ((c3 & 256) != 0 ? 268435456 : 0) | ((c3 & 512) != 0 ? 536870912 : 0) | (i67 << 20) | i18;
                iArr2[i82] = (i17 << 20) | i20;
                i57 = i82 + 1;
                i56 = i22;
                i55 = i14;
                i59 = i19;
            }
            return new djr(iArr2, objArr2, i9, i11, dkb.a, z, iArr, i8, i7 + i8, dju, dja, dkx, dhy, djk);
        }
        throw new NoSuchMethodError();
    }

    private static Field a(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e2) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            throw new RuntimeException(new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(name).length() + String.valueOf(arrays).length()).append("Field ").append(str).append(" for ").append(name).append(" not found. Known fields are ").append(arrays).toString());
        }
    }

    @Override // defpackage.dkh
    public final Object a() {
        return ((dih) this.g).a(bg.an);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.dkh
    public final boolean a(Object obj, Object obj2) {
        boolean z;
        int length = this.c.length;
        for (int i2 = 0; i2 < length; i2 += 3) {
            int d2 = d(i2);
            long j2 = (long) (d2 & 1048575);
            switch ((d2 & 267386880) >>> 20) {
                case 0:
                    if (!c(obj, obj2, i2) || dlc.b(obj, j2) != dlc.b(obj2, j2)) {
                        z = false;
                        break;
                    }
                    z = true;
                    break;
                case 1:
                    if (!c(obj, obj2, i2) || dlc.a(obj, j2) != dlc.a(obj2, j2)) {
                        z = false;
                        break;
                    }
                    z = true;
                    break;
                case 2:
                    if (!c(obj, obj2, i2) || dlc.b(obj, j2) != dlc.b(obj2, j2)) {
                        z = false;
                        break;
                    }
                    z = true;
                    break;
                case 3:
                    if (!c(obj, obj2, i2) || dlc.b(obj, j2) != dlc.b(obj2, j2)) {
                        z = false;
                        break;
                    }
                    z = true;
                    break;
                case 4:
                    if (!c(obj, obj2, i2) || dlc.a(obj, j2) != dlc.a(obj2, j2)) {
                        z = false;
                        break;
                    }
                    z = true;
                    break;
                case 5:
                    if (!c(obj, obj2, i2) || dlc.b(obj, j2) != dlc.b(obj2, j2)) {
                        z = false;
                        break;
                    }
                    z = true;
                    break;
                case 6:
                    if (!c(obj, obj2, i2) || dlc.a(obj, j2) != dlc.a(obj2, j2)) {
                        z = false;
                        break;
                    }
                    z = true;
                    break;
                case 7:
                    if (!c(obj, obj2, i2) || dlc.c(obj, j2) != dlc.c(obj2, j2)) {
                        z = false;
                        break;
                    }
                    z = true;
                    break;
                case 8:
                    if (!c(obj, obj2, i2) || !dkj.a(dlc.f(obj, j2), dlc.f(obj2, j2))) {
                        z = false;
                        break;
                    }
                    z = true;
                    break;
                case 9:
                    if (!c(obj, obj2, i2) || !dkj.a(dlc.f(obj, j2), dlc.f(obj2, j2))) {
                        z = false;
                        break;
                    }
                    z = true;
                    break;
                case 10:
                    if (!c(obj, obj2, i2) || !dkj.a(dlc.f(obj, j2), dlc.f(obj2, j2))) {
                        z = false;
                        break;
                    }
                    z = true;
                    break;
                case 11:
                    if (!c(obj, obj2, i2) || dlc.a(obj, j2) != dlc.a(obj2, j2)) {
                        z = false;
                        break;
                    }
                    z = true;
                    break;
                case 12:
                    if (!c(obj, obj2, i2) || dlc.a(obj, j2) != dlc.a(obj2, j2)) {
                        z = false;
                        break;
                    }
                    z = true;
                    break;
                case 13:
                    if (!c(obj, obj2, i2) || dlc.a(obj, j2) != dlc.a(obj2, j2)) {
                        z = false;
                        break;
                    }
                    z = true;
                    break;
                case 14:
                    if (!c(obj, obj2, i2) || dlc.b(obj, j2) != dlc.b(obj2, j2)) {
                        z = false;
                        break;
                    }
                    z = true;
                    break;
                case 15:
                    if (!c(obj, obj2, i2) || dlc.a(obj, j2) != dlc.a(obj2, j2)) {
                        z = false;
                        break;
                    }
                    z = true;
                    break;
                case 16:
                    if (!c(obj, obj2, i2) || dlc.b(obj, j2) != dlc.b(obj2, j2)) {
                        z = false;
                        break;
                    }
                    z = true;
                    break;
                case 17:
                    if (!c(obj, obj2, i2) || !dkj.a(dlc.f(obj, j2), dlc.f(obj2, j2))) {
                        z = false;
                        break;
                    }
                    z = true;
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
                case by.aT:
                    z = dkj.a(dlc.f(obj, j2), dlc.f(obj2, j2));
                    break;
                case by.aU:
                    z = dkj.a(dlc.f(obj, j2), dlc.f(obj2, j2));
                    break;
                case by.aV:
                case by.aW:
                case by.aX:
                case by.aY:
                case by.aZ:
                case by.ba:
                case by.bb:
                case by.bc:
                case by.bd:
                case by.be:
                case by.bf:
                case by.bg:
                case by.bh:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    int e2 = e(i2);
                    if (dlc.a(obj, (long) (e2 & 1048575)) != dlc.a(obj2, (long) (e2 & 1048575)) || !dkj.a(dlc.f(obj, j2), dlc.f(obj2, j2))) {
                        z = false;
                        break;
                    }
                    z = true;
                    break;
                default:
                    z = true;
                    break;
            }
            if (!z) {
                return false;
            }
        }
        if (!((dih) obj).s.equals(((dih) obj2).s)) {
            return false;
        }
        if (this.h) {
            return ((dij) obj).a.equals(((dij) obj2).a);
        }
        return true;
    }

    @Override // defpackage.dkh
    public final int a(Object obj) {
        int hashCode;
        int i2;
        int i3;
        int length = this.c.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            int d2 = d(i4);
            int i6 = this.c[i4];
            long j2 = (long) (1048575 & d2);
            switch ((d2 & 267386880) >>> 20) {
                case 0:
                    hashCode = (i5 * 53) + dim.a(Double.doubleToLongBits(dlc.e(obj, j2)));
                    continue;
                    i4 += 3;
                    i5 = hashCode;
                case 1:
                    hashCode = (i5 * 53) + Float.floatToIntBits(dlc.d(obj, j2));
                    continue;
                    i4 += 3;
                    i5 = hashCode;
                case 2:
                    hashCode = (i5 * 53) + dim.a(dlc.b(obj, j2));
                    continue;
                    i4 += 3;
                    i5 = hashCode;
                case 3:
                    hashCode = (i5 * 53) + dim.a(dlc.b(obj, j2));
                    continue;
                    i4 += 3;
                    i5 = hashCode;
                case 4:
                    hashCode = (i5 * 53) + dlc.a(obj, j2);
                    continue;
                    i4 += 3;
                    i5 = hashCode;
                case 5:
                    hashCode = (i5 * 53) + dim.a(dlc.b(obj, j2));
                    continue;
                    i4 += 3;
                    i5 = hashCode;
                case 6:
                    hashCode = (i5 * 53) + dlc.a(obj, j2);
                    continue;
                    i4 += 3;
                    i5 = hashCode;
                case 7:
                    hashCode = (i5 * 53) + dim.a(dlc.c(obj, j2));
                    continue;
                    i4 += 3;
                    i5 = hashCode;
                case 8:
                    hashCode = ((String) dlc.f(obj, j2)).hashCode() + (i5 * 53);
                    continue;
                    i4 += 3;
                    i5 = hashCode;
                case 9:
                    Object f2 = dlc.f(obj, j2);
                    if (f2 != null) {
                        i3 = f2.hashCode();
                    } else {
                        i3 = 37;
                    }
                    hashCode = i3 + (i5 * 53);
                    continue;
                    i4 += 3;
                    i5 = hashCode;
                case 10:
                    hashCode = (i5 * 53) + dlc.f(obj, j2).hashCode();
                    continue;
                    i4 += 3;
                    i5 = hashCode;
                case 11:
                    hashCode = (i5 * 53) + dlc.a(obj, j2);
                    continue;
                    i4 += 3;
                    i5 = hashCode;
                case 12:
                    hashCode = (i5 * 53) + dlc.a(obj, j2);
                    continue;
                    i4 += 3;
                    i5 = hashCode;
                case 13:
                    hashCode = (i5 * 53) + dlc.a(obj, j2);
                    continue;
                    i4 += 3;
                    i5 = hashCode;
                case 14:
                    hashCode = (i5 * 53) + dim.a(dlc.b(obj, j2));
                    continue;
                    i4 += 3;
                    i5 = hashCode;
                case 15:
                    hashCode = (i5 * 53) + dlc.a(obj, j2);
                    continue;
                    i4 += 3;
                    i5 = hashCode;
                case 16:
                    hashCode = (i5 * 53) + dim.a(dlc.b(obj, j2));
                    continue;
                    i4 += 3;
                    i5 = hashCode;
                case 17:
                    Object f3 = dlc.f(obj, j2);
                    if (f3 != null) {
                        i2 = f3.hashCode();
                    } else {
                        i2 = 37;
                    }
                    hashCode = i2 + (i5 * 53);
                    continue;
                    i4 += 3;
                    i5 = hashCode;
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
                case by.aT:
                    hashCode = (i5 * 53) + dlc.f(obj, j2).hashCode();
                    continue;
                    i4 += 3;
                    i5 = hashCode;
                case by.aU:
                    hashCode = (i5 * 53) + dlc.f(obj, j2).hashCode();
                    continue;
                    i4 += 3;
                    i5 = hashCode;
                case by.aV:
                    if (a(obj, i6, i4)) {
                        hashCode = (i5 * 53) + dim.a(Double.doubleToLongBits(b(obj, j2)));
                        continue;
                        i4 += 3;
                        i5 = hashCode;
                    }
                    break;
                case by.aW:
                    if (a(obj, i6, i4)) {
                        hashCode = (i5 * 53) + Float.floatToIntBits(c(obj, j2));
                        continue;
                        i4 += 3;
                        i5 = hashCode;
                    }
                    break;
                case by.aX:
                    if (a(obj, i6, i4)) {
                        hashCode = (i5 * 53) + dim.a(e(obj, j2));
                        continue;
                        i4 += 3;
                        i5 = hashCode;
                    }
                    break;
                case by.aY:
                    if (a(obj, i6, i4)) {
                        hashCode = (i5 * 53) + dim.a(e(obj, j2));
                        continue;
                        i4 += 3;
                        i5 = hashCode;
                    }
                    break;
                case by.aZ:
                    if (a(obj, i6, i4)) {
                        hashCode = (i5 * 53) + d(obj, j2);
                        continue;
                        i4 += 3;
                        i5 = hashCode;
                    }
                    break;
                case by.ba:
                    if (a(obj, i6, i4)) {
                        hashCode = (i5 * 53) + dim.a(e(obj, j2));
                        continue;
                        i4 += 3;
                        i5 = hashCode;
                    }
                    break;
                case by.bb:
                    if (a(obj, i6, i4)) {
                        hashCode = (i5 * 53) + d(obj, j2);
                        continue;
                        i4 += 3;
                        i5 = hashCode;
                    }
                    break;
                case by.bc:
                    if (a(obj, i6, i4)) {
                        hashCode = (i5 * 53) + dim.a(f(obj, j2));
                        continue;
                        i4 += 3;
                        i5 = hashCode;
                    }
                    break;
                case by.bd:
                    if (a(obj, i6, i4)) {
                        hashCode = ((String) dlc.f(obj, j2)).hashCode() + (i5 * 53);
                        continue;
                        i4 += 3;
                        i5 = hashCode;
                    }
                    break;
                case by.be:
                    if (a(obj, i6, i4)) {
                        hashCode = dlc.f(obj, j2).hashCode() + (i5 * 53);
                        continue;
                        i4 += 3;
                        i5 = hashCode;
                    }
                    break;
                case by.bf:
                    if (a(obj, i6, i4)) {
                        hashCode = (i5 * 53) + dlc.f(obj, j2).hashCode();
                        continue;
                        i4 += 3;
                        i5 = hashCode;
                    }
                    break;
                case by.bg:
                    if (a(obj, i6, i4)) {
                        hashCode = (i5 * 53) + d(obj, j2);
                        continue;
                        i4 += 3;
                        i5 = hashCode;
                    }
                    break;
                case by.bh:
                    if (a(obj, i6, i4)) {
                        hashCode = (i5 * 53) + d(obj, j2);
                        continue;
                        i4 += 3;
                        i5 = hashCode;
                    }
                    break;
                case 64:
                    if (a(obj, i6, i4)) {
                        hashCode = (i5 * 53) + d(obj, j2);
                        continue;
                        i4 += 3;
                        i5 = hashCode;
                    }
                    break;
                case 65:
                    if (a(obj, i6, i4)) {
                        hashCode = (i5 * 53) + dim.a(e(obj, j2));
                        continue;
                        i4 += 3;
                        i5 = hashCode;
                    }
                    break;
                case 66:
                    if (a(obj, i6, i4)) {
                        hashCode = (i5 * 53) + d(obj, j2);
                        continue;
                        i4 += 3;
                        i5 = hashCode;
                    }
                    break;
                case 67:
                    if (a(obj, i6, i4)) {
                        hashCode = (i5 * 53) + dim.a(e(obj, j2));
                        continue;
                        i4 += 3;
                        i5 = hashCode;
                    }
                    break;
                case 68:
                    if (a(obj, i6, i4)) {
                        hashCode = dlc.f(obj, j2).hashCode() + (i5 * 53);
                        continue;
                        i4 += 3;
                        i5 = hashCode;
                    }
                    break;
            }
            hashCode = i5;
            i4 += 3;
            i5 = hashCode;
        }
        int hashCode2 = ((dih) obj).s.hashCode() + (i5 * 53);
        if (this.h) {
            return (hashCode2 * 53) + ((dij) obj).a.hashCode();
        }
        return hashCode2;
    }

    @Override // defpackage.dkh
    public final void b(Object obj, Object obj2) {
        if (obj2 == null) {
            throw new NullPointerException();
        }
        for (int i2 = 0; i2 < this.c.length; i2 += 3) {
            int d2 = d(i2);
            long j2 = (long) (1048575 & d2);
            int i3 = this.c[i2];
            switch ((d2 & 267386880) >>> 20) {
                case 0:
                    if (a(obj2, i2)) {
                        dlc.a(obj, j2, dlc.e(obj2, j2));
                        b(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (a(obj2, i2)) {
                        dlc.a(obj, j2, dlc.d(obj2, j2));
                        b(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (a(obj2, i2)) {
                        dlc.a(obj, j2, dlc.b(obj2, j2));
                        b(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (a(obj2, i2)) {
                        dlc.a(obj, j2, dlc.b(obj2, j2));
                        b(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (a(obj2, i2)) {
                        dlc.a(obj, j2, dlc.a(obj2, j2));
                        b(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (a(obj2, i2)) {
                        dlc.a(obj, j2, dlc.b(obj2, j2));
                        b(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (a(obj2, i2)) {
                        dlc.a(obj, j2, dlc.a(obj2, j2));
                        b(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (a(obj2, i2)) {
                        dlc.a(obj, j2, dlc.c(obj2, j2));
                        b(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (a(obj2, i2)) {
                        dlc.a(obj, j2, dlc.f(obj2, j2));
                        b(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    a(obj, obj2, i2);
                    break;
                case 10:
                    if (a(obj2, i2)) {
                        dlc.a(obj, j2, dlc.f(obj2, j2));
                        b(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (a(obj2, i2)) {
                        dlc.a(obj, j2, dlc.a(obj2, j2));
                        b(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (a(obj2, i2)) {
                        dlc.a(obj, j2, dlc.a(obj2, j2));
                        b(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (a(obj2, i2)) {
                        dlc.a(obj, j2, dlc.a(obj2, j2));
                        b(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (a(obj2, i2)) {
                        dlc.a(obj, j2, dlc.b(obj2, j2));
                        b(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (a(obj2, i2)) {
                        dlc.a(obj, j2, dlc.a(obj2, j2));
                        b(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (a(obj2, i2)) {
                        dlc.a(obj, j2, dlc.b(obj2, j2));
                        b(obj, i2);
                        break;
                    } else {
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
                case by.aT:
                    this.o.a(obj, obj2, j2);
                    break;
                case by.aU:
                    dkj.a(obj, obj2, j2);
                    break;
                case by.aV:
                case by.aW:
                case by.aX:
                case by.aY:
                case by.aZ:
                case by.ba:
                case by.bb:
                case by.bc:
                case by.bd:
                    if (a(obj2, i3, i2)) {
                        dlc.a(obj, j2, dlc.f(obj2, j2));
                        b(obj, i3, i2);
                        break;
                    } else {
                        break;
                    }
                case by.be:
                    b(obj, obj2, i2);
                    break;
                case by.bf:
                case by.bg:
                case by.bh:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (a(obj2, i3, i2)) {
                        dlc.a(obj, j2, dlc.f(obj2, j2));
                        b(obj, i3, i2);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    b(obj, obj2, i2);
                    break;
            }
        }
        if (!this.j) {
            dkj.a(this.p, obj, obj2);
            if (this.h) {
                dkj.a(this.q, obj, obj2);
            }
        }
    }

    private final void a(Object obj, Object obj2, int i2) {
        long d2 = (long) (d(i2) & 1048575);
        if (a(obj2, i2)) {
            Object f2 = dlc.f(obj, d2);
            Object f3 = dlc.f(obj2, d2);
            if (f2 != null && f3 != null) {
                dlc.a(obj, d2, dim.a(f2, f3));
                b(obj, i2);
            } else if (f3 != null) {
                dlc.a(obj, d2, f3);
                b(obj, i2);
            }
        }
    }

    private final void b(Object obj, Object obj2, int i2) {
        int d2 = d(i2);
        int i3 = this.c[i2];
        long j2 = (long) (d2 & 1048575);
        if (a(obj2, i3, i2)) {
            Object f2 = dlc.f(obj, j2);
            Object f3 = dlc.f(obj2, j2);
            if (f2 != null && f3 != null) {
                dlc.a(obj, j2, dim.a(f2, f3));
                b(obj, i3, i2);
            } else if (f3 != null) {
                dlc.a(obj, j2, f3);
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
    @Override // defpackage.dkh
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int b(java.lang.Object r14) {
        /*
        // Method dump skipped, instructions count: 2844
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.djr.b(java.lang.Object):int");
    }

    private static int a(dkx dkx, Object obj) {
        return ((dih) obj).s.a();
    }

    private static List a(Object obj, long j2) {
        return (List) dlc.f(obj, j2);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 553
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:72)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:46)
        */
    @Override // defpackage.dkh
    public final void a(java.lang.Object r11, defpackage.dlt r12) {
        /*
        // Method dump skipped, instructions count: 3402
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.djr.a(java.lang.Object, dlt):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 388
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:72)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:46)
        */
    private final void b(java.lang.Object r18, defpackage.dlt r19) {
        /*
        // Method dump skipped, instructions count: 1806
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.djr.b(java.lang.Object, dlt):void");
    }

    private final void a(dlt dlt, int i2, Object obj, int i3) {
        if (obj != null) {
            dji dji = ((djh) b(i3)).a;
            for (Map.Entry entry : ((djj) obj).entrySet()) {
                dlt.a.a(i2, 2);
                dlt.a.c(djh.a(dji, entry.getKey(), entry.getValue()));
                djh.a(dlt.a, dji, entry.getKey(), entry.getValue());
            }
        }
    }

    private static void a(dkx dkx, Object obj, dlt dlt) {
        ((dih) obj).s.a(dlt);
    }

    /* JADX WARNING: Removed duplicated region for block: B:164:0x05ab  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x05b0  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x05bc  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x00ca A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x004f A[LOOP:2: B:25:0x004b->B:27:0x004f, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00c0  */
    @Override // defpackage.dkh
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.Object r12, defpackage.dkc r13, defpackage.dhw r14) {
        /*
        // Method dump skipped, instructions count: 1626
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.djr.a(java.lang.Object, dkc, dhw):void");
    }

    private static dky e(Object obj) {
        dky dky = ((dih) obj).s;
        if (dky != dky.a) {
            return dky;
        }
        dky dky2 = new dky();
        ((dih) obj).s = dky2;
        return dky2;
    }

    private static int a(dkh dkh, byte[] bArr, int i2, int i3, dgw dgw) {
        byte b2;
        int i4 = i2 + 1;
        byte b3 = bArr[i2];
        if (b3 < 0) {
            i4 = dgv.a(b3, bArr, i4, dgw);
            b2 = dgw.a;
        } else {
            b2 = b3;
        }
        if (b2 < 0 || b2 > i3 - i4) {
            throw dir.a();
        }
        Object a2 = dkh.a();
        dkh.a(a2, bArr, i4, i4 + b2, dgw);
        dkh.c(a2);
        dgw.c = a2;
        return i4 + b2;
    }

    private static int a(dkh dkh, byte[] bArr, int i2, int i3, int i4, dgw dgw) {
        djr djr = (djr) dkh;
        Object a2 = djr.a();
        int a3 = djr.a(a2, bArr, i2, i3, i4, dgw);
        djr.c(a2);
        dgw.c = a2;
        return a3;
    }

    private static int a(dkh dkh, int i2, byte[] bArr, int i3, int i4, diq diq, dgw dgw) {
        int a2 = a(dkh, bArr, i3, i4, dgw);
        diq.add(dgw.c);
        while (a2 < i4) {
            int a3 = dgv.a(bArr, a2, dgw);
            if (i2 != dgw.a) {
                break;
            }
            a2 = a(dkh, bArr, a3, i4, dgw);
            diq.add(dgw.c);
        }
        return a2;
    }

    private static int a(byte[] bArr, int i2, int i3, dln dln, Class cls, dgw dgw) {
        boolean z;
        switch (dln.ordinal()) {
            case 0:
                dgw.c = Double.valueOf(dgv.c(bArr, i2));
                return i2 + 8;
            case 1:
                dgw.c = Float.valueOf(dgv.d(bArr, i2));
                return i2 + 4;
            case 2:
            case 3:
                int b2 = dgv.b(bArr, i2, dgw);
                dgw.c = Long.valueOf(dgw.b);
                return b2;
            case 4:
            case 12:
            case 13:
                int a2 = dgv.a(bArr, i2, dgw);
                dgw.c = Integer.valueOf(dgw.a);
                return a2;
            case 5:
            case 15:
                dgw.c = Long.valueOf(dgv.b(bArr, i2));
                return i2 + 8;
            case 6:
            case 14:
                dgw.c = Integer.valueOf(dgv.a(bArr, i2));
                return i2 + 4;
            case 7:
                int b3 = dgv.b(bArr, i2, dgw);
                if (dgw.b != 0) {
                    z = true;
                } else {
                    z = false;
                }
                dgw.c = Boolean.valueOf(z);
                return b3;
            case 8:
                return dgv.d(bArr, i2, dgw);
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                return a(djz.a.a(cls), bArr, i2, i3, dgw);
            case 11:
                return dgv.e(bArr, i2, dgw);
            case 16:
                int a3 = dgv.a(bArr, i2, dgw);
                dgw.c = Integer.valueOf(dhj.f(dgw.a));
                return a3;
            case 17:
                int b4 = dgv.b(bArr, i2, dgw);
                dgw.c = Long.valueOf(dhj.a(dgw.b));
                return b4;
        }
    }

    private static int a(int i2, byte[] bArr, int i3, int i4, Object obj, dgw dgw) {
        return dgv.a(i2, bArr, i3, i4, e(obj), dgw);
    }

    private final int a(Object obj, byte[] bArr, int i2, int i3, int i4, int i5, int i6, int i7, long j2, int i8, long j3, dgw dgw) {
        diq diq;
        int a2;
        boolean z;
        diq diq2 = (diq) b.getObject(obj, j3);
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
                    dhu dhu = (dhu) diq;
                    int a3 = dgv.a(bArr, i2, dgw);
                    int i9 = dgw.a + a3;
                    while (a3 < i9) {
                        dhu.a(dgv.c(bArr, a3));
                        a3 += 8;
                    }
                    if (a3 == i9) {
                        return a3;
                    }
                    throw dir.a();
                } else if (i6 != 1) {
                    return i2;
                } else {
                    dhu dhu2 = (dhu) diq;
                    dhu2.a(dgv.c(bArr, i2));
                    int i10 = i2 + 8;
                    while (i10 < i3) {
                        int a4 = dgv.a(bArr, i10, dgw);
                        if (i4 != dgw.a) {
                            return i10;
                        }
                        dhu2.a(dgv.c(bArr, a4));
                        i10 = a4 + 8;
                    }
                    return i10;
                }
            case 19:
            case 36:
                if (i6 == 2) {
                    die die = (die) diq;
                    int a5 = dgv.a(bArr, i2, dgw);
                    int i11 = dgw.a + a5;
                    while (a5 < i11) {
                        die.a(dgv.d(bArr, a5));
                        a5 += 4;
                    }
                    if (a5 == i11) {
                        return a5;
                    }
                    throw dir.a();
                } else if (i6 != 5) {
                    return i2;
                } else {
                    die die2 = (die) diq;
                    die2.a(dgv.d(bArr, i2));
                    int i12 = i2 + 4;
                    while (i12 < i3) {
                        int a6 = dgv.a(bArr, i12, dgw);
                        if (i4 != dgw.a) {
                            return i12;
                        }
                        die2.a(dgv.d(bArr, a6));
                        i12 = a6 + 4;
                    }
                    return i12;
                }
            case 20:
            case 21:
            case 37:
            case 38:
                if (i6 == 2) {
                    djd djd = (djd) diq;
                    int a7 = dgv.a(bArr, i2, dgw);
                    int i13 = dgw.a + a7;
                    while (a7 < i13) {
                        a7 = dgv.b(bArr, a7, dgw);
                        djd.a(dgw.b);
                    }
                    if (a7 == i13) {
                        return a7;
                    }
                    throw dir.a();
                } else if (i6 != 0) {
                    return i2;
                } else {
                    djd djd2 = (djd) diq;
                    int b2 = dgv.b(bArr, i2, dgw);
                    djd2.a(dgw.b);
                    while (b2 < i3) {
                        int a8 = dgv.a(bArr, b2, dgw);
                        if (i4 != dgw.a) {
                            return b2;
                        }
                        b2 = dgv.b(bArr, a8, dgw);
                        djd2.a(dgw.b);
                    }
                    return b2;
                }
            case 22:
            case 29:
            case 39:
            case 43:
                if (i6 == 2) {
                    return dgv.a(bArr, i2, diq, dgw);
                }
                if (i6 == 0) {
                    return dgv.a(i4, bArr, i2, i3, diq, dgw);
                }
                return i2;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i6 == 2) {
                    djd djd3 = (djd) diq;
                    int a9 = dgv.a(bArr, i2, dgw);
                    int i14 = dgw.a + a9;
                    while (a9 < i14) {
                        djd3.a(dgv.b(bArr, a9));
                        a9 += 8;
                    }
                    if (a9 == i14) {
                        return a9;
                    }
                    throw dir.a();
                } else if (i6 != 1) {
                    return i2;
                } else {
                    djd djd4 = (djd) diq;
                    djd4.a(dgv.b(bArr, i2));
                    int i15 = i2 + 8;
                    while (i15 < i3) {
                        int a10 = dgv.a(bArr, i15, dgw);
                        if (i4 != dgw.a) {
                            return i15;
                        }
                        djd4.a(dgv.b(bArr, a10));
                        i15 = a10 + 8;
                    }
                    return i15;
                }
            case 24:
            case 31:
            case 41:
            case 45:
                if (i6 == 2) {
                    dil dil = (dil) diq;
                    int a11 = dgv.a(bArr, i2, dgw);
                    int i16 = dgw.a + a11;
                    while (a11 < i16) {
                        dil.d(dgv.a(bArr, a11));
                        a11 += 4;
                    }
                    if (a11 == i16) {
                        return a11;
                    }
                    throw dir.a();
                } else if (i6 != 5) {
                    return i2;
                } else {
                    dil dil2 = (dil) diq;
                    dil2.d(dgv.a(bArr, i2));
                    int i17 = i2 + 4;
                    while (i17 < i3) {
                        int a12 = dgv.a(bArr, i17, dgw);
                        if (i4 != dgw.a) {
                            return i17;
                        }
                        dil2.d(dgv.a(bArr, a12));
                        i17 = a12 + 4;
                    }
                    return i17;
                }
            case 25:
            case 42:
                if (i6 == 2) {
                    dgy dgy = (dgy) diq;
                    int a13 = dgv.a(bArr, i2, dgw);
                    int i18 = a13 + dgw.a;
                    while (a13 < i18) {
                        a13 = dgv.b(bArr, a13, dgw);
                        dgy.a(dgw.b != 0);
                    }
                    if (a13 == i18) {
                        return a13;
                    }
                    throw dir.a();
                } else if (i6 != 0) {
                    return i2;
                } else {
                    dgy dgy2 = (dgy) diq;
                    int b3 = dgv.b(bArr, i2, dgw);
                    dgy2.a(dgw.b != 0);
                    while (b3 < i3) {
                        int a14 = dgv.a(bArr, b3, dgw);
                        if (i4 != dgw.a) {
                            return b3;
                        }
                        b3 = dgv.b(bArr, a14, dgw);
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
                    int a15 = dgv.a(bArr, i2, dgw);
                    int i19 = dgw.a;
                    if (i19 == 0) {
                        diq.add("");
                    } else {
                        diq.add(new String(bArr, a15, i19, dim.a));
                        a15 += i19;
                    }
                    while (a15 < i3) {
                        int a16 = dgv.a(bArr, a15, dgw);
                        if (i4 != dgw.a) {
                            return a15;
                        }
                        a15 = dgv.a(bArr, a16, dgw);
                        int i20 = dgw.a;
                        if (i20 == 0) {
                            diq.add("");
                        } else {
                            diq.add(new String(bArr, a15, i20, dim.a));
                            a15 += i20;
                        }
                    }
                    return a15;
                }
                int a17 = dgv.a(bArr, i2, dgw);
                int i21 = dgw.a;
                if (i21 == 0) {
                    diq.add("");
                } else if (!dli.a(bArr, a17, a17 + i21)) {
                    throw dir.j();
                } else {
                    diq.add(new String(bArr, a17, i21, dim.a));
                    a17 += i21;
                }
                while (a17 < i3) {
                    int a18 = dgv.a(bArr, a17, dgw);
                    if (i4 != dgw.a) {
                        return a17;
                    }
                    a17 = dgv.a(bArr, a18, dgw);
                    int i22 = dgw.a;
                    if (i22 == 0) {
                        diq.add("");
                    } else if (!dli.a(bArr, a17, a17 + i22)) {
                        throw dir.j();
                    } else {
                        diq.add(new String(bArr, a17, i22, dim.a));
                        a17 += i22;
                    }
                }
                return a17;
            case 27:
                if (i6 == 2) {
                    return a(a(i7), i4, bArr, i2, i3, diq, dgw);
                }
                return i2;
            case 28:
                if (i6 != 2) {
                    return i2;
                }
                int a19 = dgv.a(bArr, i2, dgw);
                int i23 = dgw.a;
                if (i23 == 0) {
                    diq.add(dha.a);
                } else {
                    diq.add(dha.a(bArr, a19, i23));
                    a19 += i23;
                }
                while (a19 < i3) {
                    int a20 = dgv.a(bArr, a19, dgw);
                    if (i4 != dgw.a) {
                        return a19;
                    }
                    a19 = dgv.a(bArr, a20, dgw);
                    int i24 = dgw.a;
                    if (i24 == 0) {
                        diq.add(dha.a);
                    } else {
                        diq.add(dha.a(bArr, a19, i24));
                        a19 += i24;
                    }
                }
                return a19;
            case 30:
            case 44:
                if (i6 == 2) {
                    a2 = dgv.a(bArr, i2, diq, dgw);
                } else if (i6 != 0) {
                    return i2;
                } else {
                    a2 = dgv.a(i4, bArr, i2, i3, diq, dgw);
                }
                dky dky = ((dih) obj).s;
                if (dky == dky.a) {
                    dky = null;
                }
                dky dky2 = (dky) dkj.a(i5, diq, c(i7), dky, this.p);
                if (dky2 == null) {
                    return a2;
                }
                ((dih) obj).s = dky2;
                return a2;
            case 33:
            case 47:
                if (i6 == 2) {
                    dil dil3 = (dil) diq;
                    int a21 = dgv.a(bArr, i2, dgw);
                    int i25 = dgw.a + a21;
                    while (a21 < i25) {
                        a21 = dgv.a(bArr, a21, dgw);
                        dil3.d(dhj.f(dgw.a));
                    }
                    if (a21 == i25) {
                        return a21;
                    }
                    throw dir.a();
                } else if (i6 != 0) {
                    return i2;
                } else {
                    dil dil4 = (dil) diq;
                    int a22 = dgv.a(bArr, i2, dgw);
                    dil4.d(dhj.f(dgw.a));
                    while (a22 < i3) {
                        int a23 = dgv.a(bArr, a22, dgw);
                        if (i4 != dgw.a) {
                            return a22;
                        }
                        a22 = dgv.a(bArr, a23, dgw);
                        dil4.d(dhj.f(dgw.a));
                    }
                    return a22;
                }
            case 34:
            case 48:
                if (i6 == 2) {
                    djd djd5 = (djd) diq;
                    int a24 = dgv.a(bArr, i2, dgw);
                    int i26 = dgw.a + a24;
                    while (a24 < i26) {
                        a24 = dgv.b(bArr, a24, dgw);
                        djd5.a(dhj.a(dgw.b));
                    }
                    if (a24 == i26) {
                        return a24;
                    }
                    throw dir.a();
                } else if (i6 != 0) {
                    return i2;
                } else {
                    djd djd6 = (djd) diq;
                    int b4 = dgv.b(bArr, i2, dgw);
                    djd6.a(dhj.a(dgw.b));
                    while (b4 < i3) {
                        int a25 = dgv.a(bArr, b4, dgw);
                        if (i4 != dgw.a) {
                            return b4;
                        }
                        b4 = dgv.b(bArr, a25, dgw);
                        djd6.a(dhj.a(dgw.b));
                    }
                    return b4;
                }
            case by.aT:
                if (i6 != 3) {
                    return i2;
                }
                dkh a26 = a(i7);
                int i27 = (i4 & -8) | 4;
                int a27 = a(a26, bArr, i2, i3, i27, dgw);
                diq.add(dgw.c);
                while (a27 < i3) {
                    int a28 = dgv.a(bArr, a27, dgw);
                    if (i4 != dgw.a) {
                        return a27;
                    }
                    a27 = a(a26, bArr, a28, i3, i27, dgw);
                    diq.add(dgw.c);
                }
                return a27;
            default:
                return i2;
        }
    }

    private final int a(Object obj, byte[] bArr, int i2, int i3, int i4, long j2, dgw dgw) {
        djj djj;
        Unsafe unsafe = b;
        Object b2 = b(i4);
        Object object = unsafe.getObject(obj, j2);
        if (djk.a(object)) {
            djj a2 = djj.b.a();
            djk.a(a2, object);
            unsafe.putObject(obj, j2, a2);
            djj = a2;
        } else {
            djj = object;
        }
        dji dji = ((djh) b2).a;
        djj djj2 = (djj) djj;
        int a3 = dgv.a(bArr, i2, dgw);
        int i5 = dgw.a;
        if (i5 < 0 || i5 > i3 - a3) {
            throw dir.a();
        }
        int i6 = a3 + i5;
        Object obj2 = dji.b;
        Object obj3 = dji.d;
        Object obj4 = obj2;
        int i7 = a3;
        while (i7 < i6) {
            int i8 = i7 + 1;
            byte b3 = bArr[i7];
            int i9 = b3;
            if (b3 < 0) {
                i8 = dgv.a(b3, bArr, i8, dgw);
                i9 = dgw.a;
            }
            int i10 = (i9 == 1 ? 1 : 0) >>> 3;
            int i11 = (i9 == 1 ? 1 : 0) & 7;
            switch (i10) {
                case 1:
                    if (i11 == dji.a.f) {
                        int a4 = a(bArr, i8, i3, dji.a, (Class) null, dgw);
                        obj4 = dgw.c;
                        i7 = a4;
                        continue;
                    }
                    break;
                case 2:
                    if (i11 == dji.c.f) {
                        int a5 = a(bArr, i8, i3, dji.c, dji.d.getClass(), dgw);
                        obj3 = dgw.c;
                        i7 = a5;
                        continue;
                    }
                    break;
            }
            i7 = dgv.a(i9, bArr, i8, i3, dgw);
        }
        if (i7 != i6) {
            throw dir.i();
        }
        djj2.put(obj4, obj3);
        return i6;
    }

    private final int a(Object obj, byte[] bArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j2, int i9, dgw dgw) {
        int a2;
        Object obj2;
        Object obj3;
        Unsafe unsafe = b;
        long j3 = (long) (this.c[i9 + 2] & 1048575);
        switch (i8) {
            case by.aV:
                if (i6 == 1) {
                    unsafe.putObject(obj, j2, Double.valueOf(dgv.c(bArr, i2)));
                    a2 = i2 + 8;
                    break;
                } else {
                    return i2;
                }
            case by.aW:
                if (i6 == 5) {
                    unsafe.putObject(obj, j2, Float.valueOf(dgv.d(bArr, i2)));
                    a2 = i2 + 4;
                    break;
                } else {
                    return i2;
                }
            case by.aX:
            case by.aY:
                if (i6 == 0) {
                    a2 = dgv.b(bArr, i2, dgw);
                    unsafe.putObject(obj, j2, Long.valueOf(dgw.b));
                    break;
                } else {
                    return i2;
                }
            case by.aZ:
            case by.bg:
                if (i6 == 0) {
                    a2 = dgv.a(bArr, i2, dgw);
                    unsafe.putObject(obj, j2, Integer.valueOf(dgw.a));
                    break;
                } else {
                    return i2;
                }
            case by.ba:
            case 65:
                if (i6 == 1) {
                    unsafe.putObject(obj, j2, Long.valueOf(dgv.b(bArr, i2)));
                    a2 = i2 + 8;
                    break;
                } else {
                    return i2;
                }
            case by.bb:
            case 64:
                if (i6 == 5) {
                    unsafe.putObject(obj, j2, Integer.valueOf(dgv.a(bArr, i2)));
                    a2 = i2 + 4;
                    break;
                } else {
                    return i2;
                }
            case by.bc:
                if (i6 == 0) {
                    int b2 = dgv.b(bArr, i2, dgw);
                    unsafe.putObject(obj, j2, Boolean.valueOf(dgw.b != 0));
                    a2 = b2;
                    break;
                } else {
                    return i2;
                }
            case by.bd:
                if (i6 != 2) {
                    return i2;
                }
                int a3 = dgv.a(bArr, i2, dgw);
                int i10 = dgw.a;
                if (i10 == 0) {
                    unsafe.putObject(obj, j2, "");
                } else if ((536870912 & i7) == 0 || dli.a(bArr, a3, a3 + i10)) {
                    unsafe.putObject(obj, j2, new String(bArr, a3, i10, dim.a));
                    a3 += i10;
                } else {
                    throw dir.j();
                }
                unsafe.putInt(obj, j3, i5);
                return a3;
            case by.be:
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
                    unsafe.putObject(obj, j2, dim.a(obj3, dgw.c));
                }
                unsafe.putInt(obj, j3, i5);
                return a4;
            case by.bf:
                if (i6 != 2) {
                    return i2;
                }
                int a5 = dgv.a(bArr, i2, dgw);
                int i11 = dgw.a;
                if (i11 == 0) {
                    unsafe.putObject(obj, j2, dha.a);
                } else {
                    unsafe.putObject(obj, j2, dha.a(bArr, a5, i11));
                    a5 += i11;
                }
                unsafe.putInt(obj, j3, i5);
                return a5;
            case by.bh:
                if (i6 != 0) {
                    return i2;
                }
                a2 = dgv.a(bArr, i2, dgw);
                int i12 = dgw.a;
                dio c2 = c(i9);
                if (c2 == null || c2.a(i12) != null) {
                    unsafe.putObject(obj, j2, Integer.valueOf(i12));
                    break;
                } else {
                    e(obj).a(i4, Long.valueOf((long) i12));
                    return a2;
                }
            case 66:
                if (i6 == 0) {
                    a2 = dgv.a(bArr, i2, dgw);
                    unsafe.putObject(obj, j2, Integer.valueOf(dhj.f(dgw.a)));
                    break;
                } else {
                    return i2;
                }
            case 67:
                if (i6 == 0) {
                    a2 = dgv.b(bArr, i2, dgw);
                    unsafe.putObject(obj, j2, Long.valueOf(dhj.a(dgw.b)));
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
                        unsafe.putObject(obj, j2, dim.a(obj2, dgw.c));
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

    private final dkh a(int i2) {
        int i3 = (i2 / 3) << 1;
        dkh dkh = (dkh) this.d[i3];
        if (dkh != null) {
            return dkh;
        }
        dkh a2 = djz.a.a((Class) this.d[i3 + 1]);
        this.d[i3] = a2;
        return a2;
    }

    private final Object b(int i2) {
        return this.d[(i2 / 3) << 1];
    }

    private final dio c(int i2) {
        return (dio) this.d[((i2 / 3) << 1) + 1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v89, types: [int] */
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int a(java.lang.Object r42, byte[] r43, int r44, int r45, int r46, defpackage.dgw r47) {
        /*
        // Method dump skipped, instructions count: 1030
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.djr.a(java.lang.Object, byte[], int, int, int, dgw):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0235, code lost:
        if (r7 != r11) goto L_0x0237;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0257, code lost:
        if (r7 == r11) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0277, code lost:
        if (r7 == r11) goto L_0x003a;
     */
    @Override // defpackage.dkh
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.Object r35, byte[] r36, int r37, int r38, defpackage.dgw r39) {
        /*
        // Method dump skipped, instructions count: 706
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.djr.a(java.lang.Object, byte[], int, int, dgw):void");
    }

    @Override // defpackage.dkh
    public final void c(Object obj) {
        for (int i2 = this.m; i2 < this.n; i2++) {
            long d2 = (long) (d(this.l[i2]) & 1048575);
            Object f2 = dlc.f(obj, d2);
            if (f2 != null) {
                ((djj) f2).a = false;
                dlc.a(obj, d2, f2);
            }
        }
        int length = this.l.length;
        for (int i3 = this.n; i3 < length; i3++) {
            this.o.b(obj, (long) this.l[i3]);
        }
        dkx.b(obj);
        if (this.h) {
            dhy.b(obj);
        }
    }

    private final Object a(Object obj, int i2, Object obj2, dkx dkx) {
        dio c2;
        int i3 = this.c[i2];
        Object f2 = dlc.f(obj, (long) (d(i2) & 1048575));
        if (f2 == null || (c2 = c(i2)) == null) {
            return obj2;
        }
        return a(i2, i3, (djj) f2, c2, obj2, dkx);
    }

    private final Object a(int i2, int i3, Map map, dio dio, Object obj, dkx dkx) {
        dji dji = ((djh) b(i2)).a;
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (dio.a(((Integer) entry.getValue()).intValue()) == null) {
                if (obj == null) {
                    obj = new dky();
                }
                dhf b2 = dha.b(djh.a(dji, entry.getKey(), entry.getValue()));
                try {
                    djh.a(b2.a, dji, entry.getKey(), entry.getValue());
                    dkx.a(obj, i3, b2.a());
                    it.remove();
                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            }
        }
        return obj;
    }

    @Override // defpackage.dkh
    public final boolean d(Object obj) {
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
                case by.aT:
                    List list = (List) dlc.f(obj, (long) (d2 & 1048575));
                    if (!list.isEmpty()) {
                        dkh a2 = a(i8);
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
                case by.aU:
                    djj djj = (djj) dlc.f(obj, (long) (d2 & 1048575));
                    if (!djj.isEmpty() && ((djh) b(i8)).a.c.e == dls.MESSAGE) {
                        Iterator it = djj.values().iterator();
                        dkh dkh = null;
                        while (true) {
                            if (it.hasNext()) {
                                Object next = it.next();
                                if (dkh == null) {
                                    dkh = djz.a.a((Class) next.getClass());
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
                case by.be:
                case 68:
                    if (a(obj, i9, i8) && !a(obj, d2, a(i8))) {
                        return false;
                    }
            }
            i5++;
            i6 = i3;
            i7 = i2;
        }
        return !this.h || ((dij) obj).a.c();
    }

    private static boolean a(Object obj, int i2, dkh dkh) {
        return dkh.d(dlc.f(obj, (long) (1048575 & i2)));
    }

    private static void a(int i2, Object obj, dlt dlt) {
        if (obj instanceof String) {
            dlt.a.a(i2, (String) obj);
            return;
        }
        dlt.a(i2, (dha) obj);
    }

    private final void a(Object obj, int i2, dkc dkc) {
        if (f(i2)) {
            dlc.a(obj, (long) (i2 & 1048575), dkc.m());
        } else if (this.i) {
            dlc.a(obj, (long) (i2 & 1048575), dkc.l());
        } else {
            dlc.a(obj, (long) (i2 & 1048575), dkc.n());
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

    private static double b(Object obj, long j2) {
        return ((Double) dlc.f(obj, j2)).doubleValue();
    }

    private static float c(Object obj, long j2) {
        return ((Float) dlc.f(obj, j2)).floatValue();
    }

    private static int d(Object obj, long j2) {
        return ((Integer) dlc.f(obj, j2)).intValue();
    }

    private static long e(Object obj, long j2) {
        return ((Long) dlc.f(obj, j2)).longValue();
    }

    private static boolean f(Object obj, long j2) {
        return ((Boolean) dlc.f(obj, j2)).booleanValue();
    }

    private final boolean c(Object obj, Object obj2, int i2) {
        return a(obj, i2) == a(obj2, i2);
    }

    private final boolean a(Object obj, int i2, int i3, int i4) {
        if (this.j) {
            return a(obj, i2);
        }
        return (i3 & i4) != 0;
    }

    private final boolean a(Object obj, int i2) {
        if (this.j) {
            int d2 = d(i2);
            long j2 = (long) (d2 & 1048575);
            switch ((d2 & 267386880) >>> 20) {
                case 0:
                    return dlc.e(obj, j2) != 0.0d;
                case 1:
                    return dlc.d(obj, j2) != 0.0f;
                case 2:
                    return dlc.b(obj, j2) != 0;
                case 3:
                    return dlc.b(obj, j2) != 0;
                case 4:
                    return dlc.a(obj, j2) != 0;
                case 5:
                    return dlc.b(obj, j2) != 0;
                case 6:
                    return dlc.a(obj, j2) != 0;
                case 7:
                    return dlc.c(obj, j2);
                case 8:
                    Object f2 = dlc.f(obj, j2);
                    if (f2 instanceof String) {
                        return !((String) f2).isEmpty();
                    }
                    if (f2 instanceof dha) {
                        return !dha.a.equals(f2);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    return dlc.f(obj, j2) != null;
                case 10:
                    return !dha.a.equals(dlc.f(obj, j2));
                case 11:
                    return dlc.a(obj, j2) != 0;
                case 12:
                    return dlc.a(obj, j2) != 0;
                case 13:
                    return dlc.a(obj, j2) != 0;
                case 14:
                    return dlc.b(obj, j2) != 0;
                case 15:
                    return dlc.a(obj, j2) != 0;
                case 16:
                    return dlc.b(obj, j2) != 0;
                case 17:
                    return dlc.f(obj, j2) != null;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            int e2 = e(i2);
            return (dlc.a(obj, (long) (e2 & 1048575)) & (1 << (e2 >>> 20))) != 0;
        }
    }

    private final void b(Object obj, int i2) {
        if (!this.j) {
            int e2 = e(i2);
            long j2 = (long) (e2 & 1048575);
            dlc.a(obj, j2, dlc.a(obj, j2) | (1 << (e2 >>> 20)));
        }
    }

    private final boolean a(Object obj, int i2, int i3) {
        return dlc.a(obj, (long) (e(i3) & 1048575)) == i2;
    }

    private final void b(Object obj, int i2, int i3) {
        dlc.a(obj, (long) (e(i3) & 1048575), i2);
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
