package defpackage;

import java.io.IOException;
import java.text.AttributedCharacterIterator;
import java.text.AttributedString;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.FieldPosition;
import java.text.Format;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* renamed from: ar  reason: default package */
/* compiled from: PG */
public final class ar extends Format {
    private static final String[] h = {"number", "date", "time", "spellout", "ordinal", "duration"};
    private static final String[] i = {"", "currency", "percent", "integer"};
    private static final String[] j = {"", "short", "medium", "long", "full"};
    private static final Locale k = new Locale("");
    public static final long serialVersionUID = 7136212545847378652L;
    public transient Locale a;
    public transient bl b;
    public transient Map c;
    private transient DateFormat d;
    private transient NumberFormat e;
    private transient au f;
    private transient au g;

    public static final String a(Locale locale, String str, Object... objArr) {
        StringBuilder sb = new StringBuilder(str.length());
        new ar(str, locale).a(0, null, null, null, objArr, new jd(sb), null);
        return sb.toString();
    }

    private ar(String str, Locale locale) {
        int i2;
        String str2;
        Cloneable timeInstance;
        this.a = locale;
        try {
            if (this.b == null) {
                this.b = new bl(str);
            } else {
                this.b.a(str);
            }
            if (this.c != null) {
                this.c.clear();
            }
            int size = this.b.c.size() - 2;
            for (int i3 = 1; i3 < size; i3 = i2 + 1) {
                bo a2 = this.b.a(i3);
                if (a2.a == bp.ARG_START && a2.b() == bn.SIMPLE) {
                    int i4 = i3 + 2;
                    int i5 = i4 + 1;
                    String a3 = this.b.a(this.b.a(i4));
                    bo a4 = this.b.a(i5);
                    if (a4.a == bp.ARG_STYLE) {
                        str2 = this.b.a(a4);
                        i2 = i5 + 1;
                    } else {
                        str2 = "";
                        i2 = i5;
                    }
                    switch (a(a3, h)) {
                        case 0:
                            switch (a(str2, i)) {
                                case 0:
                                    timeInstance = NumberFormat.getInstance(this.a);
                                    break;
                                case 1:
                                    timeInstance = NumberFormat.getCurrencyInstance(this.a);
                                    break;
                                case 2:
                                    timeInstance = NumberFormat.getPercentInstance(this.a);
                                    break;
                                case 3:
                                    timeInstance = NumberFormat.getIntegerInstance(this.a);
                                    break;
                                default:
                                    timeInstance = new DecimalFormat(str2, new DecimalFormatSymbols(this.a));
                                    break;
                            }
                        case 1:
                            switch (a(str2, j)) {
                                case 0:
                                    timeInstance = DateFormat.getDateInstance(2, this.a);
                                    break;
                                case 1:
                                    timeInstance = DateFormat.getDateInstance(3, this.a);
                                    break;
                                case 2:
                                    timeInstance = DateFormat.getDateInstance(2, this.a);
                                    break;
                                case 3:
                                    timeInstance = DateFormat.getDateInstance(1, this.a);
                                    break;
                                case 4:
                                    timeInstance = DateFormat.getDateInstance(0, this.a);
                                    break;
                                default:
                                    timeInstance = new SimpleDateFormat(str2, this.a);
                                    break;
                            }
                        case 2:
                            switch (a(str2, j)) {
                                case 0:
                                    timeInstance = DateFormat.getTimeInstance(2, this.a);
                                    break;
                                case 1:
                                    timeInstance = DateFormat.getTimeInstance(3, this.a);
                                    break;
                                case 2:
                                    timeInstance = DateFormat.getTimeInstance(2, this.a);
                                    break;
                                case 3:
                                    timeInstance = DateFormat.getTimeInstance(1, this.a);
                                    break;
                                case 4:
                                    timeInstance = DateFormat.getTimeInstance(0, this.a);
                                    break;
                                default:
                                    timeInstance = new SimpleDateFormat(str2, this.a);
                                    break;
                            }
                        default:
                            throw new IllegalArgumentException(new StringBuilder(String.valueOf(a3).length() + 22).append("Unknown format type \"").append(a3).append("\"").toString());
                    }
                    if (this.c == null) {
                        this.c = new HashMap();
                    }
                    this.c.put(Integer.valueOf(i3), timeInstance);
                } else {
                    i2 = i3;
                }
            }
        } catch (RuntimeException e2) {
            if (this.b != null) {
                bl blVar = this.b;
                blVar.b = null;
                blVar.e = false;
                blVar.c.clear();
                if (blVar.d != null) {
                    blVar.d.clear();
                }
            }
            if (this.c != null) {
                this.c.clear();
            }
            throw e2;
        }
    }

    public final StringBuffer format(Object obj, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        a(obj, new jd(stringBuffer), fieldPosition);
        return stringBuffer;
    }

    public final AttributedCharacterIterator formatToCharacterIterator(Object obj) {
        if (obj == null) {
            throw new NullPointerException("formatToCharacterIterator must be passed non-null object");
        }
        StringBuilder sb = new StringBuilder();
        jd jdVar = new jd(sb);
        jdVar.c = new ArrayList();
        a(obj, jdVar, (FieldPosition) null);
        AttributedString attributedString = new AttributedString(sb.toString());
        for (lf lfVar : jdVar.c) {
            attributedString.addAttribute(lfVar.d, lfVar.e, lfVar.f, lfVar.g);
        }
        return attributedString.getIterator();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v37, types: [java.lang.Double] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(java.lang.String r27, java.text.ParsePosition r28, java.lang.Object[] r29, java.util.Map r30) {
        /*
        // Method dump skipped, instructions count: 701
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ar.a(java.lang.String, java.text.ParsePosition, java.lang.Object[], java.util.Map):void");
    }

    public final Object parseObject(String str, ParsePosition parsePosition) {
        int i2;
        if (this.b.e) {
            HashMap hashMap = new HashMap();
            int index = parsePosition.getIndex();
            a(str, parsePosition, (Object[]) null, hashMap);
            if (parsePosition.getIndex() == index) {
                return null;
            }
            return hashMap;
        } else if (this.b.e) {
            throw new IllegalArgumentException("This method is not available in MessageFormat objects that use named argument.");
        } else {
            int i3 = 0;
            short s = -1;
            while (true) {
                if (i3 != 0) {
                    i3 = this.b.c(i3);
                }
                while (true) {
                    i3++;
                    bp b2 = this.b.b(i3);
                    if (b2 != bp.ARG_START) {
                        if (b2 == bp.MSG_LIMIT) {
                            i2 = -1;
                            break;
                        }
                    } else {
                        i2 = i3;
                        break;
                    }
                }
                if (i2 < 0) {
                    break;
                }
                short s2 = this.b.a(i2 + 1).d;
                if (s2 <= s) {
                    s2 = s;
                }
                s = s2;
                i3 = i2;
            }
            Object[] objArr = new Object[(s + 1)];
            int index2 = parsePosition.getIndex();
            a(str, parsePosition, objArr, (Map) null);
            if (parsePosition.getIndex() == index2) {
                return null;
            }
            return objArr;
        }
    }

    public final int hashCode() {
        return this.b.b.hashCode();
    }

    /* access modifiers changed from: package-private */
    public final NumberFormat a() {
        if (this.e == null) {
            this.e = NumberFormat.getInstance(this.a);
        }
        return this.e;
    }

    private final void a(int i2, at atVar, Object[] objArr, Map map, Object[] objArr2, jd jdVar, FieldPosition fieldPosition) {
        Object obj;
        boolean z;
        String str;
        int i3;
        au auVar;
        double d2;
        double d3;
        int i4;
        int i5;
        String str2;
        boolean z2;
        boolean z3;
        int i6;
        String str3;
        bi biVar;
        int i7;
        Format format;
        String str4 = this.b.b;
        int a2 = this.b.a(i2).a();
        int i8 = i2 + 1;
        while (true) {
            bo a3 = this.b.a(i8);
            bp bpVar = a3.a;
            int i9 = a3.b;
            try {
                jdVar.a.append(str4, a2, i9);
                jdVar.b = (i9 - a2) + jdVar.b;
                if (bpVar != bp.MSG_LIMIT) {
                    a2 = a3.a();
                    if (bpVar == bp.REPLACE_NUMBER) {
                        if (atVar.h) {
                            jdVar.a(atVar.f, atVar.c, atVar.g);
                        } else {
                            jdVar.a((Format) a(), (Object) atVar.c);
                        }
                    } else if (bpVar == bp.ARG_START) {
                        int c2 = this.b.c(i8);
                        bn b2 = a3.b();
                        int i10 = i8 + 1;
                        bo a4 = this.b.a(i10);
                        Integer num = null;
                        String a5 = this.b.a(a4);
                        if (objArr != null) {
                            short s = a4.d;
                            if (jdVar.c != null) {
                                num = Integer.valueOf(s);
                            }
                            if (s < 0 || s >= objArr.length) {
                                obj = null;
                                str = num;
                                z = true;
                            } else {
                                obj = objArr[s];
                                str = num;
                                z = false;
                            }
                        } else if (objArr2 != null) {
                            int i11 = 0;
                            while (true) {
                                if (i11 >= objArr2.length) {
                                    obj = null;
                                    z = true;
                                    str = a5;
                                    break;
                                } else if (a5.equals(objArr2[i11].toString())) {
                                    obj = objArr2[i11 + 1];
                                    str = a5;
                                    z = false;
                                    break;
                                } else {
                                    i11 += 2;
                                }
                            }
                        } else if (map == null || !map.containsKey(a5)) {
                            obj = null;
                            z = true;
                            str = a5;
                        } else {
                            obj = map.get(a5);
                            str = a5;
                            z = false;
                        }
                        int i12 = i10 + 1;
                        int i13 = jdVar.b;
                        if (z) {
                            jdVar.a((CharSequence) new StringBuilder(String.valueOf(a5).length() + 2).append("{").append(a5).append("}").toString());
                        } else if (obj == null) {
                            jdVar.a("null");
                        } else if (atVar == null || atVar.e != i12 - 2) {
                            if (this.c != null && (format = (Format) this.c.get(Integer.valueOf(i12 - 2))) != null) {
                                jdVar.a(format, obj);
                            } else if (b2 == bn.NONE || (this.c != null && this.c.containsKey(Integer.valueOf(i12 - 2)))) {
                                if (obj instanceof Number) {
                                    jdVar.a((Format) a(), obj);
                                } else if (obj instanceof Date) {
                                    if (this.d == null) {
                                        this.d = DateFormat.getDateTimeInstance(3, 3, this.a);
                                    }
                                    jdVar.a((Format) this.d, obj);
                                } else {
                                    jdVar.a((CharSequence) obj.toString());
                                }
                            } else if (b2 == bn.CHOICE) {
                                if (!(obj instanceof Number)) {
                                    String valueOf = String.valueOf(obj);
                                    throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 18).append("'").append(valueOf).append("' is not a Number").toString());
                                }
                                double doubleValue = ((Number) obj).doubleValue();
                                bl blVar = this.b;
                                int size = blVar.c.size();
                                int i14 = i12 + 2;
                                while (true) {
                                    int c3 = blVar.c(i14) + 1;
                                    if (c3 >= size) {
                                        break;
                                    }
                                    int i15 = c3 + 1;
                                    bo a6 = blVar.a(c3);
                                    if (a6.a == bp.ARG_LIMIT) {
                                        break;
                                    }
                                    double b3 = blVar.b(a6);
                                    int i16 = i15 + 1;
                                    if (blVar.b.charAt(((bo) blVar.c.get(i15)).b) != '<') {
                                        if (doubleValue < b3) {
                                            break;
                                        }
                                    } else if (doubleValue <= b3) {
                                        break;
                                    }
                                    i14 = i16;
                                }
                                a(i14, null, objArr, map, objArr2, jdVar);
                            } else if (b2.a()) {
                                if (!(obj instanceof Number)) {
                                    String valueOf2 = String.valueOf(obj);
                                    throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf2).length() + 18).append("'").append(valueOf2).append("' is not a Number").toString());
                                }
                                if (b2 == bn.PLURAL) {
                                    if (this.f == null) {
                                        this.f = new au(this, bg.a);
                                    }
                                    auVar = this.f;
                                } else {
                                    if (this.g == null) {
                                        this.g = new au(this, bg.b);
                                    }
                                    auVar = this.g;
                                }
                                Number number = (Number) obj;
                                bl blVar2 = this.b;
                                bo boVar = (bo) blVar2.c.get(i12);
                                if (boVar.a.a()) {
                                    d2 = blVar2.b(boVar);
                                } else {
                                    d2 = 0.0d;
                                }
                                at atVar2 = new at(i12, a5, number, d2);
                                bl blVar3 = this.b;
                                double doubleValue2 = number.doubleValue();
                                int size2 = blVar3.c.size();
                                bo a7 = blVar3.a(i12);
                                if (a7.a.a()) {
                                    i12++;
                                    d3 = blVar3.b(a7);
                                } else {
                                    d3 = 0.0d;
                                }
                                String str5 = null;
                                boolean z4 = false;
                                int i17 = 0;
                                while (true) {
                                    int i18 = i12 + 1;
                                    bo a8 = blVar3.a(i12);
                                    if (a8.a == bp.ARG_LIMIT) {
                                        i4 = i17;
                                        break;
                                    }
                                    if (blVar3.b(i18).a()) {
                                        int i19 = i18 + 1;
                                        if (doubleValue2 == blVar3.b(blVar3.a(i18))) {
                                            i5 = i19;
                                            break;
                                        }
                                        i18 = i19;
                                        i4 = i17;
                                        str2 = str5;
                                        z2 = z4;
                                    } else {
                                        if (!z4) {
                                            if (!blVar3.a(a8, "other")) {
                                                if (str5 == null) {
                                                    double d4 = doubleValue2 - d3;
                                                    if (auVar.b == null) {
                                                        auVar.b = av.a(auVar.a.a, auVar.c);
                                                    }
                                                    at atVar3 = atVar2;
                                                    ar arVar = auVar.a;
                                                    int i20 = atVar3.a;
                                                    int size3 = arVar.b.c.size();
                                                    if (arVar.b.a(i20).a.a()) {
                                                        i20++;
                                                    }
                                                    while (true) {
                                                        i6 = i20 + 1;
                                                        bo a9 = arVar.b.a(i20);
                                                        if (a9.a != bp.ARG_LIMIT) {
                                                            if (arVar.b.a(a9, "other")) {
                                                                break;
                                                            }
                                                            if (arVar.b.b(i6).a()) {
                                                                i7 = i6 + 1;
                                                            } else {
                                                                i7 = i6;
                                                            }
                                                            i20 = arVar.b.c(i7) + 1;
                                                            if (i20 >= size3) {
                                                                break;
                                                            }
                                                        } else {
                                                            break;
                                                        }
                                                    }
                                                    i6 = 0;
                                                    ar arVar2 = auVar.a;
                                                    String str6 = atVar3.b;
                                                    int i21 = i6 + 1;
                                                    while (true) {
                                                        bo a10 = arVar2.b.a(i21);
                                                        bp bpVar2 = a10.a;
                                                        if (bpVar2 == bp.MSG_LIMIT) {
                                                            i21 = 0;
                                                            break;
                                                        } else if (bpVar2 == bp.REPLACE_NUMBER) {
                                                            i21 = -1;
                                                            break;
                                                        } else {
                                                            if (bpVar2 == bp.ARG_START) {
                                                                bn b4 = a10.b();
                                                                if (str6.length() != 0 && (b4 == bn.NONE || b4 == bn.SIMPLE)) {
                                                                    if (arVar2.b.a(arVar2.b.a(i21 + 1), str6)) {
                                                                        break;
                                                                    }
                                                                }
                                                                i21 = arVar2.b.c(i21);
                                                            }
                                                            i21++;
                                                        }
                                                    }
                                                    atVar3.e = i21;
                                                    if (atVar3.e > 0 && auVar.a.c != null) {
                                                        atVar3.f = (Format) auVar.a.c.get(Integer.valueOf(atVar3.e));
                                                    }
                                                    if (atVar3.f == null) {
                                                        atVar3.f = auVar.a.a();
                                                        atVar3.h = true;
                                                    }
                                                    atVar3.g = atVar3.f.format(atVar3.c);
                                                    bj bjVar = auVar.b.a;
                                                    bb bbVar = new bb(d4);
                                                    if (Double.isInfinite(bbVar.a) || Double.isNaN(bbVar.a)) {
                                                        str3 = "other";
                                                    } else {
                                                        Iterator it = bjVar.b.iterator();
                                                        while (true) {
                                                            if (!it.hasNext()) {
                                                                biVar = null;
                                                                break;
                                                            }
                                                            biVar = (bi) it.next();
                                                            if (biVar.b.a(bbVar)) {
                                                                break;
                                                            }
                                                        }
                                                        str3 = biVar.a;
                                                    }
                                                    if (i17 == 0 || !str3.equals("other")) {
                                                        str5 = str3;
                                                        z3 = z4;
                                                    } else {
                                                        str5 = str3;
                                                        z3 = true;
                                                    }
                                                } else {
                                                    z3 = z4;
                                                }
                                                if (z3 || !blVar3.a(a8, str5)) {
                                                    str2 = str5;
                                                    z2 = z3;
                                                    i4 = i17;
                                                } else {
                                                    str2 = str5;
                                                    z2 = true;
                                                    i4 = i18;
                                                }
                                            } else if (i17 == 0) {
                                                if (str5 == null || !str5.equals("other")) {
                                                    i4 = i18;
                                                    str2 = str5;
                                                    z2 = z4;
                                                } else {
                                                    str2 = str5;
                                                    z2 = true;
                                                    i4 = i18;
                                                }
                                            }
                                        }
                                        i4 = i17;
                                        str2 = str5;
                                        z2 = z4;
                                    }
                                    int c4 = blVar3.c(i18) + 1;
                                    if (c4 >= size2) {
                                        break;
                                    }
                                    z4 = z2;
                                    str5 = str2;
                                    i17 = i4;
                                    i12 = c4;
                                }
                                i5 = i4;
                                a(i5, atVar2, objArr, map, objArr2, jdVar);
                            } else if (b2 == bn.SELECT) {
                                bl blVar4 = this.b;
                                String obj2 = obj.toString();
                                int size4 = blVar4.c.size();
                                int i22 = 0;
                                while (true) {
                                    int i23 = i12 + 1;
                                    bo a11 = blVar4.a(i12);
                                    if (a11.a != bp.ARG_LIMIT) {
                                        if (!blVar4.a(a11, obj2)) {
                                            if (i22 == 0 && blVar4.a(a11, "other")) {
                                                i22 = i23;
                                            }
                                            i12 = blVar4.c(i23) + 1;
                                            if (i12 >= size4) {
                                                break;
                                            }
                                        } else {
                                            i3 = i23;
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                }
                                i3 = i22;
                                a(i3, null, objArr, map, objArr2, jdVar);
                            } else {
                                String valueOf3 = String.valueOf(b2);
                                throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf3).length() + 19).append("unexpected argType ").append(valueOf3).toString());
                            }
                        } else if (atVar.d == 0.0d) {
                            jdVar.a(atVar.f, atVar.c, atVar.g);
                        } else {
                            jdVar.a(atVar.f, obj);
                        }
                        if (jdVar.c != null && i13 < jdVar.b) {
                            jdVar.c.add(new lf(str, i13, jdVar.b));
                        }
                        if (fieldPosition != null && as.a.equals(fieldPosition.getFieldAttribute())) {
                            fieldPosition.setBeginIndex(i13);
                            fieldPosition.setEndIndex(jdVar.b);
                            fieldPosition = null;
                        }
                        a2 = this.b.a(c2).a();
                        i8 = c2;
                    } else {
                        continue;
                    }
                    i8++;
                } else {
                    return;
                }
            } catch (IOException e2) {
                throw new bs(e2);
            }
        }
    }

    private final void a(int i2, at atVar, Object[] objArr, Map map, Object[] objArr2, jd jdVar) {
        if (!(this.b.a == bm.DOUBLE_REQUIRED)) {
            a(i2, atVar, objArr, map, objArr2, jdVar, null);
            return;
        }
        throw new UnsupportedOperationException("JDK apostrophe mode not supported");
    }

    private final void a(Object obj, jd jdVar, FieldPosition fieldPosition) {
        if (obj == null || (obj instanceof Map)) {
            a((Object[]) null, (Map) obj, jdVar, fieldPosition);
        } else {
            a((Object[]) obj, (Map) null, jdVar, fieldPosition);
        }
    }

    private final void a(Object[] objArr, Map map, jd jdVar, FieldPosition fieldPosition) {
        if (objArr == null || !this.b.e) {
            a(0, null, objArr, map, null, jdVar, fieldPosition);
            return;
        }
        throw new IllegalArgumentException("This method is not available in MessageFormat objects that use alphanumeric argument names.");
    }

    private static final int a(String str, String[] strArr) {
        String lowerCase = ap.a(str).toLowerCase(k);
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if (lowerCase.equals(strArr[i2])) {
                return i2;
            }
        }
        return -1;
    }
}
