package defpackage;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* access modifiers changed from: package-private */
/* renamed from: dwb  reason: default package */
/* compiled from: PG */
public final class dwb {
    private static final Logger a = Logger.getLogger(dwb.class.getName());

    private dwb() {
    }

    static Object a(String str) {
        czi czi = new czi(new StringReader(str));
        try {
            Object a2 = a(czi);
            try {
            } catch (IOException e) {
                a.logp(Level.WARNING, "io.grpc.internal.JsonParser", "parse", "Failed to close", (Throwable) e);
            }
            return a2;
        } finally {
            try {
                czi.close();
            } catch (IOException e2) {
                a.logp(Level.WARNING, "io.grpc.internal.JsonParser", "parse", "Failed to close", (Throwable) e2);
            }
        }
    }

    private static Object a(czi czi) {
        double d;
        String str;
        String a2;
        String str2;
        boolean z = true;
        cld.b(czi.a(), "unexpected end of JSON");
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
                    ArrayList arrayList = new ArrayList();
                    while (czi.a()) {
                        arrayList.add(a(czi));
                    }
                    if (czi.b() != czj.END_ARRAY) {
                        z = false;
                    }
                    String valueOf = String.valueOf(czi.f());
                    cld.b(z, valueOf.length() != 0 ? "Bad token: ".concat(valueOf) : new String("Bad token: "));
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
                        return Collections.unmodifiableList(arrayList);
                    }
                    throw new IllegalStateException("Expected END_ARRAY but was " + czi.b() + czi.e());
                }
                throw new IllegalStateException("Expected BEGIN_ARRAY but was " + czi.b() + czi.e());
            case 1:
            case 3:
            case 4:
            default:
                String valueOf2 = String.valueOf(czi.f());
                if (valueOf2.length() != 0) {
                    str2 = "Bad token: ".concat(valueOf2);
                } else {
                    str2 = new String("Bad token: ");
                }
                throw new IllegalStateException(str2);
            case 2:
                int i4 = czi.c;
                if (i4 == 0) {
                    i4 = czi.c();
                }
                if (i4 == 1) {
                    czi.a(3);
                    czi.c = 0;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
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
                            throw new IllegalStateException("Expected a name but was " + czi.b() + czi.e());
                        }
                        czi.c = 0;
                        czi.h[czi.g - 1] = a2;
                        linkedHashMap.put(a2, a(czi));
                    }
                    if (czi.b() != czj.END_OBJECT) {
                        z = false;
                    }
                    String valueOf3 = String.valueOf(czi.f());
                    cld.b(z, valueOf3.length() != 0 ? "Bad token: ".concat(valueOf3) : new String("Bad token: "));
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
                        return Collections.unmodifiableMap(linkedHashMap);
                    }
                    throw new IllegalStateException("Expected END_OBJECT but was " + czi.b() + czi.e());
                }
                throw new IllegalStateException("Expected BEGIN_OBJECT but was " + czi.b() + czi.e());
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
                    str = Long.toString(czi.d);
                } else if (i8 == 16) {
                    str = new String(czi.a, czi.b, czi.e);
                    czi.b += czi.e;
                } else {
                    throw new IllegalStateException("Expected a string but was " + czi.b() + czi.e());
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
                        czi.f = new String(czi.a, czi.b, czi.e);
                        czi.b += czi.e;
                    } else if (i10 == 8 || i10 == 9) {
                        czi.f = czi.a(i10 == 8 ? '\'' : '\"');
                    } else if (i10 == 10) {
                        czi.f = czi.d();
                    } else if (i10 != 11) {
                        throw new IllegalStateException("Expected a double but was " + czi.b() + czi.e());
                    }
                    czi.c = 11;
                    double parseDouble = Double.parseDouble(czi.f);
                    if (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble)) {
                        throw new bkv("JSON forbids NaN and infinities: " + parseDouble + czi.e());
                    }
                    czi.f = null;
                    czi.c = 0;
                    int[] iArr5 = czi.i;
                    int i12 = czi.g - 1;
                    iArr5[i12] = iArr5[i12] + 1;
                    d = parseDouble;
                }
                return Double.valueOf(d);
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
                    throw new IllegalStateException("Expected a boolean but was " + czi.b() + czi.e());
                }
                return Boolean.valueOf(z);
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
                throw new IllegalStateException("Expected null but was " + czi.b() + czi.e());
        }
    }
}
