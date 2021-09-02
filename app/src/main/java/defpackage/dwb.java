package defpackage;

/* renamed from: dwb reason: default package */
/* compiled from: PG */
final class dwb {
    private static final java.util.logging.Logger a = java.util.logging.Logger.getLogger(defpackage.dwb.class.getName());

    private dwb() {
    }

    static java.lang.Object a(java.lang.String str) {
        defpackage.czi czi = new defpackage.czi(new java.io.StringReader(str));
        try {
            java.lang.Object a2 = a(czi);
            try {
            } catch (java.io.IOException e) {
                a.logp(java.util.logging.Level.WARNING, "io.grpc.internal.JsonParser", "parse", "Failed to close", e);
            }
            return a2;
        } finally {
            try {
                czi.close();
            } catch (java.io.IOException e2) {
                a.logp(java.util.logging.Level.WARNING, "io.grpc.internal.JsonParser", "parse", "Failed to close", e2);
            }
        }
    }

    private static java.lang.Object a(defpackage.czi czi) {
        double d;
        java.lang.String str;
        java.lang.String a2;
        java.lang.String str2;
        boolean z = true;
        defpackage.cld.b(czi.a(), (java.lang.Object) "unexpected end of JSON");
        switch (czi.b().ordinal()) {
            case 0:
                int i = czi.c;
                if (i == 0) {
                    i = czi.c();
                }
                if (i == 3) {
                    czi.a(1);
                    czi.i[czi.g - 1] = 0;
                    czi.c = 0;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    while (czi.a()) {
                        arrayList.add(a(czi));
                    }
                    if (czi.b() != defpackage.czj.END_ARRAY) {
                        z = false;
                    }
                    java.lang.String str3 = "Bad token: ";
                    java.lang.String valueOf = java.lang.String.valueOf(czi.f());
                    defpackage.cld.b(z, (java.lang.Object) valueOf.length() != 0 ? str3.concat(valueOf) : new java.lang.String(str3));
                    int i2 = czi.c;
                    if (i2 == 0) {
                        i2 = czi.c();
                    }
                    if (i2 == 4) {
                        czi.g--;
                        int[] iArr = czi.i;
                        int i3 = czi.g - 1;
                        iArr[i3] = iArr[i3] + 1;
                        czi.c = 0;
                        return java.util.Collections.unmodifiableList(arrayList);
                    }
                    throw new java.lang.IllegalStateException("Expected END_ARRAY but was " + czi.b() + czi.e());
                }
                throw new java.lang.IllegalStateException("Expected BEGIN_ARRAY but was " + czi.b() + czi.e());
            case 2:
                int i4 = czi.c;
                if (i4 == 0) {
                    i4 = czi.c();
                }
                if (i4 == 1) {
                    czi.a(3);
                    czi.c = 0;
                    java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                    while (czi.a()) {
                        int i5 = czi.c;
                        if (i5 == 0) {
                            i5 = czi.c();
                        }
                        if (i5 == 14) {
                            a2 = czi.d();
                        } else if (i5 == 12) {
                            a2 = czi.a('\'');
                        } else if (i5 == 13) {
                            a2 = czi.a('\"');
                        } else {
                            throw new java.lang.IllegalStateException("Expected a name but was " + czi.b() + czi.e());
                        }
                        czi.c = 0;
                        czi.h[czi.g - 1] = a2;
                        linkedHashMap.put(a2, a(czi));
                    }
                    if (czi.b() != defpackage.czj.END_OBJECT) {
                        z = false;
                    }
                    java.lang.String str4 = "Bad token: ";
                    java.lang.String valueOf2 = java.lang.String.valueOf(czi.f());
                    defpackage.cld.b(z, (java.lang.Object) valueOf2.length() != 0 ? str4.concat(valueOf2) : new java.lang.String(str4));
                    int i6 = czi.c;
                    if (i6 == 0) {
                        i6 = czi.c();
                    }
                    if (i6 == 2) {
                        czi.g--;
                        czi.h[czi.g] = null;
                        int[] iArr2 = czi.i;
                        int i7 = czi.g - 1;
                        iArr2[i7] = iArr2[i7] + 1;
                        czi.c = 0;
                        return java.util.Collections.unmodifiableMap(linkedHashMap);
                    }
                    throw new java.lang.IllegalStateException("Expected END_OBJECT but was " + czi.b() + czi.e());
                }
                throw new java.lang.IllegalStateException("Expected BEGIN_OBJECT but was " + czi.b() + czi.e());
            case 5:
                int i8 = czi.c;
                if (i8 == 0) {
                    i8 = czi.c();
                }
                if (i8 == 10) {
                    str = czi.d();
                } else if (i8 == 8) {
                    str = czi.a('\'');
                } else if (i8 == 9) {
                    str = czi.a('\"');
                } else if (i8 == 11) {
                    str = czi.f;
                    czi.f = null;
                } else if (i8 == 15) {
                    str = java.lang.Long.toString(czi.d);
                } else if (i8 == 16) {
                    str = new java.lang.String(czi.a, czi.b, czi.e);
                    czi.b += czi.e;
                } else {
                    throw new java.lang.IllegalStateException("Expected a string but was " + czi.b() + czi.e());
                }
                czi.c = 0;
                int[] iArr3 = czi.i;
                int i9 = czi.g - 1;
                iArr3[i9] = iArr3[i9] + 1;
                return str;
            case 6:
                int i10 = czi.c;
                if (i10 == 0) {
                    i10 = czi.c();
                }
                if (i10 == 15) {
                    czi.c = 0;
                    int[] iArr4 = czi.i;
                    int i11 = czi.g - 1;
                    iArr4[i11] = iArr4[i11] + 1;
                    d = (double) czi.d;
                } else {
                    if (i10 == 16) {
                        czi.f = new java.lang.String(czi.a, czi.b, czi.e);
                        czi.b += czi.e;
                    } else if (i10 == 8 || i10 == 9) {
                        czi.f = czi.a(i10 == 8 ? '\'' : '\"');
                    } else if (i10 == 10) {
                        czi.f = czi.d();
                    } else if (i10 != 11) {
                        throw new java.lang.IllegalStateException("Expected a double but was " + czi.b() + czi.e());
                    }
                    czi.c = 11;
                    double parseDouble = java.lang.Double.parseDouble(czi.f);
                    if (java.lang.Double.isNaN(parseDouble) || java.lang.Double.isInfinite(parseDouble)) {
                        throw new defpackage.bkv("JSON forbids NaN and infinities: " + parseDouble + czi.e());
                    }
                    czi.f = null;
                    czi.c = 0;
                    int[] iArr5 = czi.i;
                    int i12 = czi.g - 1;
                    iArr5[i12] = iArr5[i12] + 1;
                    d = parseDouble;
                }
                return java.lang.Double.valueOf(d);
            case 7:
                int i13 = czi.c;
                if (i13 == 0) {
                    i13 = czi.c();
                }
                if (i13 == 5) {
                    czi.c = 0;
                    int[] iArr6 = czi.i;
                    int i14 = czi.g - 1;
                    iArr6[i14] = iArr6[i14] + 1;
                } else if (i13 == 6) {
                    czi.c = 0;
                    int[] iArr7 = czi.i;
                    int i15 = czi.g - 1;
                    iArr7[i15] = iArr7[i15] + 1;
                    z = false;
                } else {
                    throw new java.lang.IllegalStateException("Expected a boolean but was " + czi.b() + czi.e());
                }
                return java.lang.Boolean.valueOf(z);
            case 8:
                int i16 = czi.c;
                if (i16 == 0) {
                    i16 = czi.c();
                }
                if (i16 == 7) {
                    czi.c = 0;
                    int[] iArr8 = czi.i;
                    int i17 = czi.g - 1;
                    iArr8[i17] = iArr8[i17] + 1;
                    return null;
                }
                throw new java.lang.IllegalStateException("Expected null but was " + czi.b() + czi.e());
            default:
                java.lang.String str5 = "Bad token: ";
                java.lang.String valueOf3 = java.lang.String.valueOf(czi.f());
                if (valueOf3.length() != 0) {
                    str2 = str5.concat(valueOf3);
                } else {
                    str2 = new java.lang.String(str5);
                }
                throw new java.lang.IllegalStateException(str2);
        }
    }
}
