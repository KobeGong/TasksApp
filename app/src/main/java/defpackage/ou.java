package defpackage;

/* renamed from: ou reason: default package */
/* compiled from: PG */
public final class ou {
    public char a;
    public float[] b;

    public ou(char c, float[] fArr) {
        this.a = c;
        this.b = fArr;
    }

    public ou(defpackage.ou ouVar) {
        this.a = ouVar.a;
        this.b = defpackage.jd.a(ouVar.b, ouVar.b.length);
    }

    public static void a(defpackage.ou[] ouVarArr, android.graphics.Path path) {
        int i;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float[] fArr = new float[6];
        char c = 'm';
        int i2 = 0;
        while (true) {
            int i3 = i2;
            char c2 = c;
            if (i3 < ouVarArr.length) {
                char c3 = ouVarArr[i3].a;
                float[] fArr2 = ouVarArr[i3].b;
                float f10 = fArr[0];
                float f11 = fArr[1];
                float f12 = fArr[2];
                float f13 = fArr[3];
                float f14 = fArr[4];
                float f15 = fArr[5];
                switch (c3) {
                    case 'A':
                    case 'a':
                        i = 7;
                        break;
                    case 'C':
                    case 'c':
                        i = 6;
                        break;
                    case 'H':
                    case 'V':
                    case 'h':
                    case 'v':
                        i = 1;
                        break;
                    case 'L':
                    case 'M':
                    case 'T':
                    case 'l':
                    case 'm':
                    case 't':
                        i = 2;
                        break;
                    case 'Q':
                    case 'S':
                    case 'q':
                    case 's':
                        i = 4;
                        break;
                    case 'Z':
                    case 'z':
                        path.close();
                        path.moveTo(f14, f15);
                        f13 = f15;
                        f12 = f14;
                        f11 = f15;
                        f10 = f14;
                        i = 2;
                        break;
                    default:
                        i = 2;
                        break;
                }
                int i4 = 0;
                float f16 = f15;
                float f17 = f14;
                float f18 = f11;
                float f19 = f10;
                while (i4 < fArr2.length) {
                    switch (c3) {
                        case 'A':
                            a(path, f19, f18, fArr2[i4 + 5], fArr2[i4 + 6], fArr2[i4], fArr2[i4 + 1], fArr2[i4 + 2], fArr2[i4 + 3] != 0.0f, fArr2[i4 + 4] != 0.0f);
                            f12 = fArr2[i4 + 5];
                            f13 = fArr2[i4 + 6];
                            f = f16;
                            f2 = f17;
                            f3 = f13;
                            f4 = f12;
                            break;
                        case 'C':
                            path.cubicTo(fArr2[i4], fArr2[i4 + 1], fArr2[i4 + 2], fArr2[i4 + 3], fArr2[i4 + 4], fArr2[i4 + 5]);
                            float f20 = fArr2[i4 + 4];
                            float f21 = fArr2[i4 + 5];
                            f12 = fArr2[i4 + 2];
                            f13 = fArr2[i4 + 3];
                            f3 = f21;
                            f4 = f20;
                            f = f16;
                            f2 = f17;
                            break;
                        case 'H':
                            path.lineTo(fArr2[i4], f18);
                            f = f16;
                            f3 = f18;
                            f4 = fArr2[i4];
                            f2 = f17;
                            break;
                        case 'L':
                            path.lineTo(fArr2[i4], fArr2[i4 + 1]);
                            float f22 = fArr2[i4];
                            f3 = fArr2[i4 + 1];
                            f4 = f22;
                            f = f16;
                            f2 = f17;
                            break;
                        case 'M':
                            f2 = fArr2[i4];
                            f = fArr2[i4 + 1];
                            if (i4 <= 0) {
                                path.moveTo(fArr2[i4], fArr2[i4 + 1]);
                                f3 = f;
                                f4 = f2;
                                break;
                            } else {
                                path.lineTo(fArr2[i4], fArr2[i4 + 1]);
                                f3 = f;
                                f4 = f2;
                                f = f16;
                                f2 = f17;
                                break;
                            }
                        case 'Q':
                            path.quadTo(fArr2[i4], fArr2[i4 + 1], fArr2[i4 + 2], fArr2[i4 + 3]);
                            f12 = fArr2[i4];
                            f13 = fArr2[i4 + 1];
                            float f23 = fArr2[i4 + 2];
                            f3 = fArr2[i4 + 3];
                            f4 = f23;
                            f = f16;
                            f2 = f17;
                            break;
                        case 'S':
                            if (c2 == 'c' || c2 == 's' || c2 == 'C' || c2 == 'S') {
                                f7 = (2.0f * f18) - f13;
                                f8 = (2.0f * f19) - f12;
                            } else {
                                f7 = f18;
                                f8 = f19;
                            }
                            path.cubicTo(f8, f7, fArr2[i4], fArr2[i4 + 1], fArr2[i4 + 2], fArr2[i4 + 3]);
                            f12 = fArr2[i4];
                            f13 = fArr2[i4 + 1];
                            float f24 = fArr2[i4 + 2];
                            f3 = fArr2[i4 + 3];
                            f4 = f24;
                            f = f16;
                            f2 = f17;
                            break;
                        case 'T':
                            if (c2 == 'q' || c2 == 't' || c2 == 'Q' || c2 == 'T') {
                                f19 = (2.0f * f19) - f12;
                                f18 = (2.0f * f18) - f13;
                            }
                            path.quadTo(f19, f18, fArr2[i4], fArr2[i4 + 1]);
                            float f25 = fArr2[i4];
                            f13 = f18;
                            f12 = f19;
                            f3 = fArr2[i4 + 1];
                            f4 = f25;
                            f = f16;
                            f2 = f17;
                            break;
                        case 'V':
                            path.lineTo(f19, fArr2[i4]);
                            f2 = f17;
                            f3 = fArr2[i4];
                            f4 = f19;
                            f = f16;
                            break;
                        case 'a':
                            a(path, f19, f18, fArr2[i4 + 5] + f19, fArr2[i4 + 6] + f18, fArr2[i4], fArr2[i4 + 1], fArr2[i4 + 2], fArr2[i4 + 3] != 0.0f, fArr2[i4 + 4] != 0.0f);
                            f12 = f19 + fArr2[i4 + 5];
                            f13 = f18 + fArr2[i4 + 6];
                            f = f16;
                            f2 = f17;
                            f3 = f13;
                            f4 = f12;
                            break;
                        case 'c':
                            path.rCubicTo(fArr2[i4], fArr2[i4 + 1], fArr2[i4 + 2], fArr2[i4 + 3], fArr2[i4 + 4], fArr2[i4 + 5]);
                            f12 = f19 + fArr2[i4 + 2];
                            f13 = f18 + fArr2[i4 + 3];
                            f3 = f18 + fArr2[i4 + 5];
                            f4 = f19 + fArr2[i4 + 4];
                            f = f16;
                            f2 = f17;
                            break;
                        case 'h':
                            path.rLineTo(fArr2[i4], 0.0f);
                            f = f16;
                            f3 = f18;
                            f4 = f19 + fArr2[i4];
                            f2 = f17;
                            break;
                        case 'l':
                            path.rLineTo(fArr2[i4], fArr2[i4 + 1]);
                            f3 = f18 + fArr2[i4 + 1];
                            f4 = f19 + fArr2[i4];
                            f = f16;
                            f2 = f17;
                            break;
                        case 'm':
                            f2 = f19 + fArr2[i4];
                            f = f18 + fArr2[i4 + 1];
                            if (i4 <= 0) {
                                path.rMoveTo(fArr2[i4], fArr2[i4 + 1]);
                                f3 = f;
                                f4 = f2;
                                break;
                            } else {
                                path.rLineTo(fArr2[i4], fArr2[i4 + 1]);
                                f3 = f;
                                f4 = f2;
                                f = f16;
                                f2 = f17;
                                break;
                            }
                        case 'q':
                            path.rQuadTo(fArr2[i4], fArr2[i4 + 1], fArr2[i4 + 2], fArr2[i4 + 3]);
                            f12 = f19 + fArr2[i4];
                            f13 = f18 + fArr2[i4 + 1];
                            f3 = f18 + fArr2[i4 + 3];
                            f4 = f19 + fArr2[i4 + 2];
                            f = f16;
                            f2 = f17;
                            break;
                        case 's':
                            float f26 = 0.0f;
                            if (c2 == 'c' || c2 == 's' || c2 == 'C' || c2 == 'S') {
                                f26 = f18 - f13;
                                f9 = f19 - f12;
                            } else {
                                f9 = 0.0f;
                            }
                            path.rCubicTo(f9, f26, fArr2[i4], fArr2[i4 + 1], fArr2[i4 + 2], fArr2[i4 + 3]);
                            f12 = f19 + fArr2[i4];
                            f13 = f18 + fArr2[i4 + 1];
                            f3 = f18 + fArr2[i4 + 3];
                            f4 = f19 + fArr2[i4 + 2];
                            f = f16;
                            f2 = f17;
                            break;
                        case 't':
                            if (c2 == 'q' || c2 == 't' || c2 == 'Q' || c2 == 'T') {
                                f6 = f18 - f13;
                                f5 = f19 - f12;
                            } else {
                                f6 = 0.0f;
                                f5 = 0.0f;
                            }
                            path.rQuadTo(f5, f6, fArr2[i4], fArr2[i4 + 1]);
                            f12 = f19 + f5;
                            f13 = f18 + f6;
                            f3 = f18 + fArr2[i4 + 1];
                            f4 = f19 + fArr2[i4];
                            f = f16;
                            f2 = f17;
                            break;
                        case 'v':
                            path.rLineTo(0.0f, fArr2[i4]);
                            f2 = f17;
                            f3 = f18 + fArr2[i4];
                            f4 = f19;
                            f = f16;
                            break;
                        default:
                            f = f16;
                            f2 = f17;
                            f3 = f18;
                            f4 = f19;
                            break;
                    }
                    i4 += i;
                    f16 = f;
                    f17 = f2;
                    f18 = f3;
                    f19 = f4;
                    c2 = c3;
                }
                fArr[0] = f19;
                fArr[1] = f18;
                fArr[2] = f12;
                fArr[3] = f13;
                fArr[4] = f17;
                fArr[5] = f16;
                c = ouVarArr[i3].a;
                i2 = i3 + 1;
            } else {
                return;
            }
        }
    }

    private static void a(android.graphics.Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
        double d;
        double d2;
        android.graphics.Path path2 = path;
        while (true) {
            double radians = java.lang.Math.toRadians((double) f7);
            double cos = java.lang.Math.cos(radians);
            double sin = java.lang.Math.sin(radians);
            double d3 = ((((double) f) * cos) + (((double) f2) * sin)) / ((double) f5);
            double d4 = ((((double) (-f)) * sin) + (((double) f2) * cos)) / ((double) f6);
            double d5 = ((((double) f3) * cos) + (((double) f4) * sin)) / ((double) f5);
            double d6 = ((((double) (-f3)) * sin) + (((double) f4) * cos)) / ((double) f6);
            double d7 = d3 - d5;
            double d8 = d4 - d6;
            double d9 = (d3 + d5) / 2.0d;
            double d10 = (d4 + d6) / 2.0d;
            double d11 = (d7 * d7) + (d8 * d8);
            if (d11 == 0.0d) {
                android.util.Log.w("PathParser", " Points are coincident");
                return;
            }
            double d12 = (1.0d / d11) - 0.25d;
            if (d12 < 0.0d) {
                android.util.Log.w("PathParser", "Points are too far apart " + d11);
                float sqrt = (float) (java.lang.Math.sqrt(d11) / 1.99999d);
                f5 *= sqrt;
                f6 *= sqrt;
            } else {
                double sqrt2 = java.lang.Math.sqrt(d12);
                double d13 = d7 * sqrt2;
                double d14 = d8 * sqrt2;
                if (z == z2) {
                    d = d9 - d14;
                    d2 = d13 + d10;
                } else {
                    d = d14 + d9;
                    d2 = d10 - d13;
                }
                double atan2 = java.lang.Math.atan2(d4 - d2, d3 - d);
                double atan22 = java.lang.Math.atan2(d6 - d2, d5 - d) - atan2;
                if (z2 != (atan22 >= 0.0d)) {
                    if (atan22 > 0.0d) {
                        atan22 -= 6.283185307179586d;
                    } else {
                        atan22 += 6.283185307179586d;
                    }
                }
                double d15 = d * ((double) f5);
                double d16 = d2 * ((double) f6);
                double d17 = (d15 * cos) - (d16 * sin);
                double d18 = (d15 * sin) + (d16 * cos);
                double d19 = (double) f5;
                double d20 = (double) f6;
                double d21 = (double) f;
                double d22 = (double) f2;
                int ceil = (int) java.lang.Math.ceil(java.lang.Math.abs((4.0d * atan22) / 3.141592653589793d));
                double cos2 = java.lang.Math.cos(radians);
                double sin2 = java.lang.Math.sin(radians);
                double cos3 = java.lang.Math.cos(atan2);
                double sin3 = java.lang.Math.sin(atan2);
                double d23 = (((-d19) * cos2) * sin3) - ((d20 * sin2) * cos3);
                double d24 = (cos3 * d20 * cos2) + (sin3 * (-d19) * sin2);
                double d25 = atan22 / ((double) ceil);
                int i = 0;
                double d26 = d22;
                double d27 = d21;
                double d28 = atan2;
                while (i < ceil) {
                    double d29 = d28 + d25;
                    double sin4 = java.lang.Math.sin(d29);
                    double cos4 = java.lang.Math.cos(d29);
                    double d30 = (((d19 * cos2) * cos4) + d17) - ((d20 * sin2) * sin4);
                    double d31 = (d20 * cos2 * sin4) + (d19 * sin2 * cos4) + d18;
                    double d32 = (((-d19) * cos2) * sin4) - ((d20 * sin2) * cos4);
                    double d33 = (sin4 * (-d19) * sin2) + (cos4 * d20 * cos2);
                    double tan = java.lang.Math.tan((d29 - d28) / 2.0d);
                    double sin5 = (java.lang.Math.sin(d29 - d28) * (java.lang.Math.sqrt((tan * (3.0d * tan)) + 4.0d) - 1.0d)) / 3.0d;
                    double d34 = (d23 * sin5) + d27;
                    double d35 = (d24 * sin5) + d26;
                    double d36 = d30 - (sin5 * d32);
                    double d37 = d31 - (sin5 * d33);
                    path2.rLineTo(0.0f, 0.0f);
                    path2.cubicTo((float) d34, (float) d35, (float) d36, (float) d37, (float) d30, (float) d31);
                    i++;
                    d24 = d33;
                    d23 = d32;
                    d28 = d29;
                    d26 = d31;
                    d27 = d30;
                }
                return;
            }
        }
    }
}
